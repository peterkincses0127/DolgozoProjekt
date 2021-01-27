import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ablak extends JFrame {
    JPanel panel, panel1;
    JButton btn_harmas, btn_negyes, btn_otos,btn_hatos;
    JLabel lb_harmas, lb_negyes, lb_otos,lb_hatos;
    Dolgozok d;
    JTextField text_hatos;

    public  Ablak(){
        init();
        d= new Dolgozok();
    }

    private void init() {
        this.setTitle("Dolgozók");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.panel = (JPanel) (this.getContentPane());
        this.panel.setLayout(null);
        this.panel1= new JPanel();
        this.panel1.setLayout(null);
        this.panel1.setLocation(180,100);
        this.panel1.setSize(150,150);
        this.panel1.setBackground(new Color(255,125,20));
//JDKplatform
        btn_harmas= new JButton("3. Feladat ");
        btn_harmas.setBounds(30,30,130,25);
        btn_harmas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               lb_harmas.setText("Dolgozók száma: "+ d.HarmasFeladat());
            }
        });

        btn_negyes= new JButton("4. Feladat: ");
        btn_negyes.setBounds(30,70,130,25);
        btn_negyes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lb_negyes.setText("5 év alattiak összfizetése: "+d.NegyesFeladat());
            }
        });
        btn_otos= new JButton("5. Feladat: ");
        btn_otos.setBounds(30,110,130,25);
        btn_otos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lb_otos.setText(d.OtosFeladat());
            }
        });
        btn_hatos = new JButton("6. Feladat");
        btn_hatos.setBounds(30,150,130,25);
        btn_hatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        lb_harmas= new JLabel();
        lb_harmas.setBounds(180,30,250,25);
        lb_negyes= new JLabel();
        lb_negyes.setBounds(180,70,250,25);
        lb_otos= new JLabel();
        lb_otos.setBounds(180,110,300,25);
        lb_hatos= new JLabel();
        lb_hatos.setBounds(180,150,300,25);
       // text_hatos = new JTextField(d.HatodikFeladat(text_hatos.get));
        text_hatos.setBounds(350,150,200,25);

        panel.add(btn_harmas);
        panel.add(lb_harmas);
        panel.add(btn_negyes);
        panel.add(lb_negyes);
        panel.add(btn_otos);
        panel.add(lb_otos);
        panel.add(lb_hatos);
        panel.add(text_hatos);

        this.setVisible(true);

    }

}
