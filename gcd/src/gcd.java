import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class gcd extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;


    /**
     * Launch the application.
     */


    public static void main(String[] args) {


        gcd frame = new gcd();

        //Bu da Acilan Pencereni merkezde gosterir
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);


    }

    public gcd() {
        setTitle("\u018FBOB v\u0259 \u018FKOB proqram\u0131");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 452, 353);
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);

        JLabel lbldd = new JLabel("\u018Fd\u0259d 1 :");
        lbldd.setBounds(27, 35, 46, 14);
        panel.add(lbldd);

        textField1 = new JTextField();
        textField1.setBounds(83, 32, 297, 20);
        panel.add(textField1);
        textField1.setColumns(10);

        JLabel lbldd_1 = new JLabel("\u018Fd\u0259d 2 :");
        lbldd_1.setBounds(27, 89, 46, 14);
        panel.add(lbldd_1);

        textField2 = new JTextField();
        textField2.setBounds(83, 86, 297, 20);
        panel.add(textField2);
        textField2.setColumns(10);

        JButton btn = new JButton("Cavab");
        btn.addActionListener(new ActionListener() {
            class Controller extends Component {
            }

            public void actionPerformed(ActionEvent arg0) {

                /*Burada try-catch blokundan istifade olunub
                *Try hissesi herf ve simvol daxil edilmeyene qeder isleyir
                *Catch hissesi ise herf ve ya simvol daxil edilende isleyir
                */
                try {
                    int a, b, lcm, count = 2, total;
                    String a1 = textField1.getText();
                    String b1 = textField2.getText();

                    //If bloku textField-lerin bos olub-olmadigi yoxlayir

                    if (a1.equals("") || b1.equals("") || a1 == null || b1 == null) {

                        //textFieldler bosdursa error penceresi gosterilir

                        JOptionPane.showMessageDialog(new Controller(), "Zehmet olmasa bos yerleri doldurun", "Dialog", JOptionPane.ERROR_MESSAGE);
                    } else {
                        //textFieldler bos deyilse emeliyyat yerine yetirilir


                        a = Integer.parseInt(a1);
                        b = Integer.parseInt(b1);

                        while (true) {
                            if ((count % a == 0) && (count % b == 0)) {
                                total = count;
                                break;
                            }
                            count++;
                        }


                        while (b > 0) {
                            lcm = a % b;
                            a = b;
                            b = lcm;
                        }


                        textField4.setText(String.valueOf(total));
                        textField3.setText(String.valueOf(a));

                    }
                } catch (Exception e) {

                   /*Bu xeta bas verende geden prosesdi.Xeta da o zaman bas verir ki
                   *eded yerine herf ve ya
                   *diger simvollar daxil edilende.Isitade edilen JOptionPane-i arastir.
                   * Bu daha cox istifadeciye
                   * melumat bildirmek ucun istifade olunan pencerelerdir.
                   * Error,Warning,Success ve s.
                   */
                    JOptionPane.showMessageDialog(new Controller(), "Zehmet olmasa eded daxil edin", "Dialog", JOptionPane.ERROR_MESSAGE);


                    //Burada Eded daxil edilen textField-leri sifirlayir

                    textField1.setText("");
                    textField2.setText("");


                }

            }

        });
        btn.setBounds(164, 137, 123, 32);
        panel.add(btn);


        JLabel lblbob = new JLabel("\u018FBOB :");
        lblbob.setBounds(27, 203, 46, 14);
        panel.add(lblbob);

        textField3 = new JTextField();
        textField3.setBounds(83, 200, 297, 20);
        panel.add(textField3);
        textField3.setColumns(10);

        JLabel lblkob = new JLabel("\u018FKOB :");
        lblkob.setBounds(27, 255, 46, 14);
        panel.add(lblkob);

        textField4 = new JTextField();
        textField4.setBounds(83, 252, 297, 20);
        panel.add(textField4);
        textField4.setColumns(10);
    }


}
