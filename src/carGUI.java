//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
//    class carGUI implements ActionListener {
//        JFrame fr;
//
//        JRadioButton rb1, rb2, rb3;
//        JButton b1;
//        JLabel lb1;
//        ButtonGroup bg;
//        String ques[] = {"What do you want to rent?"};
//        String op1[] = {"Car"};
//        String op2[] = {"Van"};
//        String op3[] = {"Motorbike"};
//
//        String ans[] = {""};
//        int cn;
//
//        carGUI() {
//            fr = new JFrame();
//
//            fr.setLayout(null);
//            fr.setSize(800, 800);
//            Container c = fr.getContentPane();
//            c.setBackground(Color.lightGray);
//
//            lb1 = new JLabel(ques[0]);
//            lb1.setBounds(50, 50, 800, 30);
//            fr.add(lb1);
//            lb1.setFont(new Font("chiller", Font.BOLD, 30));
//
//            rb1 = new JRadioButton(op1[0]);
//            rb1.setBounds(100, 100, 300, 30);
//            fr.add(rb1);
//
//            rb2 = new JRadioButton(op2[0]);
//            rb2.setBounds(100, 140, 300, 30);
//            fr.add(rb2);
//            rb3 = new JRadioButton(op3[0]);
//            rb3.setBounds(100, 180, 300, 30);
//            fr.add(rb3);
//
//            bg = new ButtonGroup();
//            bg.add(rb1);
//            bg.add(rb2);
//            bg.add(rb3);
//
//            rb1.addActionListener(this);
//            rb2.addActionListener(this);
//            rb3.addActionListener(this);
//
//
//            b1 = new JButton("Submit");
//            b1.setBounds(100, 400, 100, 30);
//            fr.add(b1);
//
//
//            b1.addActionListener(this);
//
//            fr.setVisible(true);
//
//        }
//
//        public static void main(String s[]) {
//            new carGUI();
//
//        }
//
//        public void actionPerformed(ActionEvent e) {
//            if (e.getSource() == b1) {
//
//                String en = "";
//                if (rb1.isSelected())
//                    en = rb1.getText();
//                if (rb2.isSelected())
//                    en = rb2.getText();
//                if (rb3.isSelected())
//                    en = rb3.getText();
//
//                if (en.equals("Car")) {
//                    JOptionPane.showMessageDialog(null, "You want a "+en+"!");
//                } else if (en.equals("Van")) {
//                    JOptionPane.showMessageDialog(null, "You want a van!");
//                } else if (en.equals("Motorbike")) {
//                    JOptionPane.showMessageDialog(null, "You want a motorbike!");
//
//                } else
//                    JOptionPane.showMessageDialog(null, "Please choose from above!");
//            }
////            if (e.getSource() == b2) {
////                cn++;
////                lb1.setText(ques[cn]);
////                rb1.setText(op1[cn]);
////                rb2.setText(op2[cn]);
////                rb3.setText(op3[cn]);
//
//        }}
//
