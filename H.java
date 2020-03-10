package work4;
import javax.swing.*;
import java.util.ArrayList;

import static java.lang.Math.abs;

public class H {
    float a, b, c, xn, xk, step;
    float ans;
    String result = "";
    ArrayList<Float> Mass_xh;
    ArrayList<Float> Mass_yh;

    H(float Xn, float Xk, float A, float B, float C, float STEP) {
        xn = Xn;
        xk = Xk;
        a = A;
        b = B;
        c = C;
        step = STEP;
        Mass_xh = new ArrayList<>();
        Mass_yh = new ArrayList<>();
    }

    public String getText() {
        return result;
    }

    public float fun1(float A, int j) {
        if (j == 1) {
            ans = a * A + b ;
        }
        if (j == 2) {
            ans = a * (A * A) + b * A + c;
        }
        if (j == 3) {
            ans = a * (A * A * A) + b * (A * A) + c;
        }
        result += "  " + String.valueOf(A) + "          " + String.valueOf(ans) + " \n";
        Mass_xh.add(A);
        Mass_yh.add(ans);
        return ans;
    }

    public void function(int type) {
        for (float i = xn; i <= xk; i += step) {
            fun1(i, type);
        }

        float a,b,x = 0, eps = 0.00001f ;
        float c=0;
        System.out.println("Найти корень уравнения cos(x)-sqrt(x)=0 на интервале [0;1] при eps=0.00001");
        System.out.println();
        System.out.println("Метод дихотомии: ");

        a = 0;
        b = 3;

        while ( abs(a-b) > eps) {
            c = (a+b)/2;
            if (fun1(a,type) * fun1(c,type)<= 0)
                b = c;
            else
            {
                a = c;
                x = (a+b)/2;
            }
        }
        System.out.println("x = " + c + " f(x) = " + fun1(x,type));

    }

    public ArrayList<Float> getMass_xh() {

        return Mass_xh;
    }

    public void setMass_xh(ArrayList<Float> Mass_xh) {

        this.Mass_xh = Mass_xh;
    }

    public ArrayList<Float> getMass_yh() {

        return Mass_yh;
    }

    public void setMass_yh(ArrayList<Float> Mass_yh) {

        this.Mass_yh = Mass_yh;
    }
}