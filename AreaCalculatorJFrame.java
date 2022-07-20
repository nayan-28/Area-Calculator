package com.mycompany.areacalculator;

import javax.swing.JOptionPane;

public class AreaCalculatorJFrame extends javax.swing.JFrame {

    public AreaCalculatorJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        list = new javax.swing.JComboBox<>();
        input1 = new javax.swing.JLabel();
        input2 = new javax.swing.JLabel();
        input3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        get = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.setForeground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 0, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Area Calculator");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 300, 51));

        list.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        list.setForeground(new java.awt.Color(0, 153, 255));
        list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose an option", "Scalene Triangle", "Equilateral Triangle", "Isoscalene Triangle", "Rightangle Triangle", "Rectangle", "Square", "Rhombus", "Parallelogram", "Trapezium", "Cube", "Cuboid", "Circle", "Cone", "Cylinder", "Sphere", "Ellipse", "Parabola", "Pyramid", "Polygonal" }));
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });
        jPanel2.add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 180, 30));

        input1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        input1.setForeground(new java.awt.Color(0, 51, 153));
        input1.setText("Input Type");
        input1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel2.add(input1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 130, 39));

        input2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        input2.setForeground(new java.awt.Color(0, 51, 153));
        input2.setText("Input Type");
        input2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel2.add(input2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 42));

        input3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        input3.setForeground(new java.awt.Color(0, 51, 153));
        input3.setText("Input Type");
        input3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 3));
        jPanel2.add(input3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 130, 45));

        t1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 127, 34));

        t2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 127, 35));

        t3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 3));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 127, 37));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Result");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 70, 25));

        get.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        get.setText("Calculate");
        get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getActionPerformed(evt);
            }
        });
        jPanel2.add(get, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, 44));

        reset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 115, 44));

        ok.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ok.setForeground(new java.awt.Color(0, 153, 255));
        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel2.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 73, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Input");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        result.setColumns(20);
        result.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        result.setRows(5);
        jScrollPane1.setViewportView(result);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 200, 70));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 153));
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, 30));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 153));
        jLabel22.setText("CSE,JUST");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, 30));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 51, 153));
        jLabel23.setText("Copy@right Nayan Malakar");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        if (list.getSelectedItem().equals("Choose an option")) {
            JOptionPane.showMessageDialog(null, "You must choose an Option", "Error Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (list.getSelectedItem().equals("Scalene Triangle")) {
            input1.setText("1st Side");
            input2.setText("2nd Side");
            input3.setText("3rd Side");
        } else if (list.getSelectedItem().equals("Equilateral Triangle")) {
            input1.setText("Length of Side");
            input2.setText("Don't Fill");
            input3.setText("Don't Fill");
        } else if (list.getSelectedItem().equals("Isoscalene Triangle")) {
            input1.setText("Equal Side");
            input2.setText("Unequal side");
            input3.setText("Don't Fill");
        } else if (list.getSelectedItem().equals("Rightangle Triangle")) {
            input1.setText("Base");
            input2.setText("Height");
            input3.setText("Don't Fill");
        } else if (list.getSelectedItem().equals("Rectangle")) {
            input1.setText("Length");
            input2.setText("Width");
            input3.setText("Don't Fill");
        } else if (list.getSelectedItem().equals("Square")) {
            input1.setText("Length");
            input2.setText("Don't Fill");
            input3.setText("Don't Fill");
        } else if (list.getSelectedItem().equals("Rhombus")) {
            input1.setText("1st Diagonal Length");
            input2.setText("2nd Diagonal Length");
            input3.setText("Don't Fill");
        } else if (list.getSelectedItem().equals("Parallelogram")) {
            input1.setText("Base");
            input2.setText("Height");
            input3.setText("Don't Fill");
        } else if (list.getSelectedItem().equals("Parallelogram")) {
            input1.setText("Base");
            input2.setText("Height");
            input3.setText("Don't Fill");
        } else if (list.getSelectedItem().equals("Trapezium")) {
            input1.setText("Parallel side1");
            input2.setText("Parallel side2");
            input3.setText("Height");
        } else if (list.getSelectedItem().equals("Cube")) {
            input1.setText("Length");
            input2.setText("Don't Fill");
            input3.setText("Don't Fill");
        } else if (list.getSelectedItem().equals("Cuboid")) {
            input1.setText("Length");
            input2.setText("Width");
            input3.setText("Heigth");
        } else if (list.getSelectedItem().equals("Circle")) {
            input1.setText("Radius");
            input2.setText("Don't Fill");
            input3.setText("Don't Fill");

        } else if (list.getSelectedItem().equals("Polygonal")) {
            input1.setText("No. of Side");
            input2.setText("Length");
            input3.setText("Don't Fill");

        } else if (list.getSelectedItem().equals("Cone")) {
            input1.setText("Radius");
            input2.setText("Upright Height");
            input3.setText("Don't Fill");

        } else if (list.getSelectedItem().equals("Cylinder")) {
            input1.setText("Radius");
            input2.setText("Upright Height");
            input3.setText("Don't Fill");

        } else if (list.getSelectedItem().equals("Sphere")) {
            input1.setText("Radius");
            input2.setText("Don't Fill");
            input3.setText("Don't Fill");

        } else if (list.getSelectedItem().equals("Parabola")) {
            input1.setText("Valu of a");
            input2.setText("Don't Fill");
            input3.setText("Don't Fill");

        } else if (list.getSelectedItem().equals("Ellipse")) {
            input1.setText("Valu of a");
            input2.setText("Valu of b");
            input3.setText("Don't Fill");

        } else if (list.getSelectedItem().equals("Pyramid")) {
            input1.setText("Base");
            input2.setText("Height");
            input3.setText("Don't Fill");

        }
    }//GEN-LAST:event_okActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        input1.setText("Input type");
        input2.setText("Input type");
        input3.setText("Input type");
        result.setText(" ");
        t1.setText(" ");
        t2.setText(" ");
        t3.setText(" ");
        list.setSelectedItem("Choose an option");
    }//GEN-LAST:event_resetActionPerformed

    private void getActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getActionPerformed
        if (list.getSelectedItem().equals("Choose an option")) {
            JOptionPane.showMessageDialog(null, "you must choose an option", "Error Message", JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            if (list.getSelectedItem().equals("Scalene Triangle")) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = Double.parseDouble(t3.getText());
                Scalene scalene = new Scalene(a, b, c);
                String value = String.format("%f", scalene.getArea());
                result.setText("Area: " + value);

            } else if (list.getSelectedItem().equals("Equilateral Triangle")) {
                double a = Double.parseDouble(t1.getText());
                Equilateral equilateral = new Equilateral(a);
                String value = String.format("%f", equilateral.getArea());
                result.setText("Area: " + value);

            } else if (list.getSelectedItem().equals("Isoscalene Triangle")) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                Isoscalene isoscalene = new Isoscalene(a, b);
                String value = String.format("%f", isoscalene.getArea());
                result.setText("Area: " + value);

            } else if (list.getSelectedItem().equals("Rightangle Triangle")) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                Rightangle rightangle = new Rightangle(a, b);
                String value = String.format("%f", rightangle.getArea());
                result.setText("Area: " + value);

            } else if (list.getSelectedItem().equals("Rectangle")) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                Rectangle rectangle = new Rectangle(a, b);
                String value = String.format("%f", rectangle.getArea());
                result.setText("Area: " + value);

            } else if (list.getSelectedItem().equals("Square")) {
                double a = Double.parseDouble(t1.getText());
                Square square = new Square(a, a);
                String value = String.format("%f", square.getArea());
                result.setText("Area: " + value);

            } else if (list.getSelectedItem().equals("Rhombus")) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                Rhombus rhombus = new Rhombus(a, b);
                String value = String.format("%f", rhombus.getArea());
                result.setText("Area: " + value);

            } else if (list.getSelectedItem().equals("Parallelogram")) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                Parallelogram parallelogram = new Parallelogram(a, b);
                String value = String.format("%f", parallelogram.getArea());
                result.setText("Area:" + value);

            } else if (list.getSelectedItem().equals("Trapezium")) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = Double.parseDouble(t3.getText());
                Trapezium trapezium = new Trapezium(a, b, c);
                String value = String.format("%f", trapezium.getArea());
                result.setText("Area: " + value);

            } else if (list.getSelectedItem().equals("Cube")) {
                double a = Double.parseDouble(t1.getText());
                Cube cube = new Cube(a,a);
                String value = String.format("%f", cube.getArea());
                result.setText("Area: " + value);

            } else if (list.getSelectedItem().equals("Cuboid")) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = Double.parseDouble(t3.getText());
                Cuboid cuboid = new Cuboid(a, b, c);
                String value = String.format("%f", cuboid.getArea());
                result.setText("Area: " + value);
            } else if (list.getSelectedItem().equals("Circle")) {
                double a = Double.parseDouble(t1.getText());
                Circle circle = new Circle(a);
                String value = String.format("%f", circle.getArea());
                result.setText("Area: " + value);
            } else if (list.getSelectedItem().equals("Polygonal")) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                Polygonal polygonal = new Polygonal(a, b);
                String value = String.format("%f", polygonal.getArea());
                result.setText("Area: " + value);
            } else if (list.getSelectedItem().equals("Cone")) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                Cone cone = new Cone(a, b);
                String value = String.format("%f", cone.getArea());
                result.setText("Area: " + value);
            } else if (list.getSelectedItem().equals("Cylinder")) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                Cylinder cylinder = new Cylinder(a,b);
                String value = String.format("%f", cylinder.getArea());
                result.setText("Area: " + value);
            } else if (list.getSelectedItem().equals("Sphere")) {
                double a = Double.parseDouble(t1.getText());
                Sphere sphere = new Sphere(a);
                String value = String.format("%f", sphere.getArea());
                result.setText("Area: " + value);
            } else if (list.getSelectedItem().equals("Parabola")) {
                double a = Double.parseDouble(t1.getText());
                Parabola parabola = new Parabola(a, a);
                String value = String.format("%f", parabola.getArea());
                result.setText("Area: " + value);
            } else if (list.getSelectedItem().equals("Ellipse")) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                Ellipse ellipse = new Ellipse(a, b);
                String value = String.format("%f", ellipse.getArea());
                result.setText("Area: " + value);
            } else if (list.getSelectedItem().equals("Pyramid")) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                Pyramid pyramid = new Pyramid(a, b);
                String value = String.format("%f", pyramid.getArea());
                result.setText("Area: " + value);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Somethimg Went Wrong", "Error Message", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_getActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed

    }//GEN-LAST:event_listActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AreaCalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaCalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaCalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaCalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AreaCalculatorJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton get;
    private javax.swing.JLabel input1;
    private javax.swing.JLabel input2;
    private javax.swing.JLabel input3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> list;
    private javax.swing.JButton ok;
    private javax.swing.JButton reset;
    private javax.swing.JTextArea result;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
