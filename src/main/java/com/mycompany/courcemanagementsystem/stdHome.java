/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.courcemanagementsystem;

import BusinessLogic.Course;
import BusinessLogic.Read;
import BusinessLogic.Students;


import BusinessLogic.crud_course;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Paledi
 */
public class stdHome extends javax.swing.JInternalFrame {

    /**
     * Creates new form stdHome
     */
    public stdHome() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui =(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        courseNametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptiontxt = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        durationtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        codetxt = new javax.swing.JTextField();
        deletebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        displaydtb = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 104));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("Course name");

        jLabel2.setText("Description");

        descriptiontxt.setColumns(20);
        descriptiontxt.setRows(5);
        jScrollPane1.setViewportView(descriptiontxt);

        jLabel3.setText("Duration");

        jLabel4.setText("Course code");

        deletebtn.setText("Delete");
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });

        addbtn.setText("add");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });

        clearbtn.setText("clear");
        clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(42, 42, 42)
                            .addComponent(durationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(courseNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addbtn)
                        .addGap(18, 18, 18)
                        .addComponent(deletebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearbtn)))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(codetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(durationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbtn)
                    .addComponent(deletebtn)
                    .addComponent(clearbtn))
                .addGap(45, 45, 45))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "code", "name", "duration", "description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(courseTable);

        displaydtb.setText("Display");
        displaydtb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displaydtbMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(displaydtb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(displaydtb)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displaydtbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displaydtbMouseClicked
 
         try {
            crud_course crud = new crud_course();
            List<Course>ls;
            ls= crud.fetch();
            var model=(DefaultTableModel)courseTable.getModel();
            model.setRowCount(0);
            for (Course item: ls){
                model.addRow(new Object[]{item.getcourseCode(),item.getcourseName(),item.getduration(),item.getduration()});
            }    // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(addStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_displaydtbMouseClicked

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
        // TODO add your handling code here:
        
    String code = codetxt.getText();                                     
    String courseName = courseNametxt.getText();
    String courseDuration = durationtxt.getText();
    String courseDescription = descriptiontxt.getText();
    
    
    // Create a new Students object with the input values
    Course course = new Course(code, courseName, courseDuration, courseDescription );
    
    // Create an instance of the Read class to insert the student into the database
    crud_course crud = new crud_course();
    int rowsInserted = crud.insertCourse(course);
    
    // Display a success or error message based on the result
    if (rowsInserted > 0) {
        JOptionPane.showMessageDialog(null, "Course added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Failed to add Course.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_addbtnMouseClicked

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:
        String code = codetxt.getText();

    // Check if the student ID is empty
    if (code.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a Code  to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Convert the student ID to an integer
    int id = Integer.parseInt(code);

    // Create an instance of the Read class to delete the student from the database
    crud_course crud = new crud_course();
    int rowsDeleted = crud.deleteStudent(id);

    // Display a success or error message based on the result
    if (rowsDeleted > 0) {
        JOptionPane.showMessageDialog(null, "Course deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Failed to delete Course.", "Error", JOptionPane.ERROR_MESSAGE);
    }

        
    }//GEN-LAST:event_deletebtnMouseClicked

    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
        // TODO add your handling code here:
        codetxt.setText("");
        courseNametxt.setText("");
        durationtxt.setText("");
        descriptiontxt.setText("");
    
        
        
    }//GEN-LAST:event_clearbtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField codetxt;
    private javax.swing.JTextField courseNametxt;
    private javax.swing.JTable courseTable;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextArea descriptiontxt;
    private javax.swing.JButton displaydtb;
    private javax.swing.JTextField durationtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}