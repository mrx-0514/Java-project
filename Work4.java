package work4;
/*
import work3.Hesap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Work4 extends JFrame implements ActionListener {
    public Container cont;
    public JLabel label1, label2, la, lb, lc, lstep;
    public JRadioButton r1, r2, r3;
    public  JButton b1,b2;
    public JTextArea ta1;
    public JLabel x, y, e;
    public JTextField t1, t2, ta, tb, tc, tstep, te;
    public ButtonGroup g;
    public GraphFunction G;
    public H hesap;

    public Work4() {
        setTitle("WORK 4");
        setBounds(300, 90, 1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setResizable(false);

        g = new ButtonGroup();

        cont = getContentPane();
        cont.setLayout(null);

        label1 = new JLabel("Xstart");
        label1.setSize(150, 40);
        label1.setLocation(10, 20);
        cont.add(label1);

        t1 = new JTextField();
        t1.setSize(150, 30);
        t1.setLocation(60, 20);
        cont.add(t1);

        label2 = new JLabel("Xend");
        label2.setSize(150, 30);
        label2.setLocation(10, 50);
        cont.add(label2);

        t2 = new JTextField();
        t2.setSize(150, 30);
        t2.setLocation(60, 60);
        cont.add(t2);

        r1 = new JRadioButton("y=ax+b");
        r1.setSize(150, 20);
        r1.setLocation(10, 110);
        g.add(r1);
        cont.add(r1);

        r2 = new JRadioButton("y=a*x^2+b*x+c");
        r2.setSize(150, 20);
        r2.setLocation(10, 150);
        g.add(r2);
        cont.add(r2);

        r3 = new JRadioButton("y=a*x^3+b*x^2+c");
        r3.setSize(170, 20);
        r3.setLocation(10, 190);
        g.add(r3);
        cont.add(r3);

        la = new JLabel("a");
        la.setLocation(10, 230);
        la.setSize(20, 20);
        cont.add(la);

        lb = new JLabel("b");
        lb.setLocation(10, 270);
        lb.setSize(20, 20);
        cont.add(lb);

        lc = new JLabel("c");
        lc.setSize(20, 20);
        lc.setLocation(10, 310);
        cont.add(lc);

        lstep = new JLabel("step");
        lstep.setLocation(10, 340);
        lstep.setSize(50, 20);
        cont.add(lstep);

        tstep = new JTextField();
        tstep.setSize(150, 30);
        tstep.setLocation(60, 230);
        cont.add(tstep);

        ta = new JTextField();
        ta.setLocation(60, 270);
        ta.setSize(150, 30);
        cont.add(ta);

        tb = new JTextField();
        tb.setSize(150, 30);
        tb.setLocation(60, 310);
        cont.add(tb);

        tc = new JTextField();
        tc.setLocation(60, 350);
        tc.setSize(150, 30);
        cont.add(tc);

        e = new JLabel("E");
        e.setLocation(10,390);
        e.setSize(10,20);
        cont.add(e);

        te = new JTextField();
        te.setLocation(60,390);
        te.setSize(150,30);
        cont.add(te);

        b1 = new JButton("Calculate");
        b1.setSize(100, 20);
        b1.setLocation(60, 440);
        cont.add(b1);

        b2 = new JButton("Find root");
        b2.setLocation(60,470);
        b2.setSize(100,20);
        cont.add(b2);

        ta1 = new JTextArea();
        ta1.setSize(130, 470);
        ta1.setLocation(250, 30);
        cont.add(ta1);

        x = new JLabel("X");
        x.setSize(20, 20);
        x.setLocation(280, 10);
        cont.add(x);

        y = new JLabel("Y");
        y.setSize(20, 20);
        y.setLocation(340, 10);
        cont.add(y);

        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            float a, b, c, step, Xn, Xk, ans;
            Xn = Float.parseFloat(t1.getText());
            Xk = Float.parseFloat(t2.getText());
            a = Float.parseFloat(ta.getText());
            b = Float.parseFloat(tb.getText());
            c = Float.parseFloat(tc.getText());
            step = Float.parseFloat(tstep.getText());
            String result = "";

            H hesap = new H(Xn, Xk, a, b, c, step);

            int type = 0;
            if (r1.isSelected()) {
                type = 1;
            }
            if (r2.isSelected()) {
                type = 2;
            }
            if (r3.isSelected()) {
                type = 3;
            }

            //ArrayList<Float> massx = new ArrayList<>();
            //ArrayList<Float> massy = new ArrayList<>();

            G = new GraphFunction();
            add(G);
            hesap.function(type);
            ta1.setText(hesap.getText());
            G.setMass_y(hesap.getMass_yh());
            G.setMass_x(hesap.getMass_xh());
            G.repaint();
        }

        else if(e.getSource()==b2){


        }
    }

    public static void main(String args[]) {
        Work4 work4 = new Work4();
    }
}*/