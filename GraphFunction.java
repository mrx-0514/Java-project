package work4;
/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.geom.Line2D;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class GraphFunction extends JPanel {

    ArrayList<Float> Mass_x=new ArrayList<>();
    ArrayList<Float> Mass_y=new ArrayList<>();
    int x_start, x_end;
    float xmax=-Float.MAX_VALUE;
    float ymax=Float.MIN_VALUE;
    float xmin,ymin,ansmin,ansmax,absMax,step,r;

    GraphFunction(){
        this.setBounds(400,30,500,470);
        setLayout(null);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(10, 193, 430, 193);
        g.drawLine(193, 10, 193, 430);

        System.out.println("GETMASS "+getMass_x().size());


        for (int i=0;i<this.getMass_x().size();i++){
            if (Mass_x.get(i)>xmax){
                xmax=Mass_x.get(i);
            }
            if(Mass_y.get(i)>ymax){
                ymax=Mass_y.get(i);
            }
            if (Mass_x.get(i)<xmin){
                xmin=Mass_x.get(i);
            }
            if(Mass_y.get(i)<ymin){
                ymin=Mass_y.get(i);
            }
        }


        if (Math.abs(ymax)>=Math.abs(xmax)){
            ansmax=ymax;
        }
        if(Math.abs(ymax)<Math.abs(xmax)){
            ansmax=xmax;
        }
        if (Math.abs(ymin)>=Math.abs(xmin)){
            ansmin=ymin;
        }
        if(Math.abs(ymin)<Math.abs(xmin)){
            ansmin=xmin;
        }
        if (Math.abs(ansmax)>=Math.abs(ansmin)){
            absMax=ansmax;
        }
        if(Math.abs(ansmax)<Math.abs(ansmin)){
            absMax=ansmin;
        }

        step=(absMax/5);
        System.out.println("step "+step+" absMax "+absMax);

        DecimalFormat value = new DecimalFormat();
        float maxx=0;
        float maxy=absMax;

        for(float i=190; i<330; i+=30){
            g.drawString((value.format(maxx)),(int)i,180);
            g.drawOval((int)i,191,4,4);
            maxx+=step;
        }

        maxx=-maxx;
        maxx+=step;

        for (float i=70;i<180;i+=30){
            g.drawString((value.format(maxx)),(int)i,180);
            g.drawOval((int)i,191,4,4);
            maxx+=step;
        }
        //y
        for (float i=10+30;i<200;i+=30){
            if(maxy!=0) {
                g.drawString((value.format(maxy)), 205, (int) i);
                g.drawOval(191, (int) i, 4, 4);
            }
            maxy -= step;
        }
        maxy=0;
        for(float i=190;i<350;i+=30){
            if(maxy!=0) {
                g.drawString((value.format(maxy)), 205, (int) i);
                g.drawOval(191, (int) i, 4, 4);
            }
            maxy-=step;

        }

        Polygon p3=new Polygon();
        for(int i=0;i<this.getMass_x().size();i++) {
            p3.addPoint((int)(193+this.getMass_x().get(i)*(30/step)),(int)(193-this.getMass_y().get(i)*(30/step)));
        }
        g.drawPolyline(p3.xpoints, p3.ypoints,p3.npoints);
        System.out.println("Masss"+getMass_x().size());
    }
    public ArrayList<Float> getMass_x() {
        return Mass_x;
    }
    public void setMass_x(ArrayList<Float> mass_x) {
        this.Mass_x = mass_x;
    }
    public ArrayList<Float> getMass_y() {
        return Mass_y;
    }
    public void setMass_y(ArrayList<Float> mass_y) {
        this.Mass_y = mass_y;
    }
}*/