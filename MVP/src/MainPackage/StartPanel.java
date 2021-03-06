/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

/**
 *
 * @author josephrunser
 */
public class StartPanel extends javax.swing.JPanel {
    
    PanelManager manager;
    
    /**
     * Creates new form StartPanel
     * 
     * @param manager
     */
    public StartPanel(PanelManager manager) {
        initComponents();
        
        this.manager = manager;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_LessonOne = new javax.swing.JButton();
        btn_LessonTwo = new javax.swing.JButton();

        btn_LessonOne.setText("Lesson One");
        btn_LessonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LessonOneActionPerformed(evt);
            }
        });

        btn_LessonTwo.setText("Lesson Two");
        btn_LessonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LessonTwoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(292, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_LessonOne, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_LessonTwo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_LessonOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_LessonTwo)
                .addContainerGap(236, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LessonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LessonOneActionPerformed

        manager.setPanel(PanelManager.INDEX_LESSON_ONE);

    }//GEN-LAST:event_btn_LessonOneActionPerformed

    private void btn_LessonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LessonTwoActionPerformed
        
        manager.setPanel(PanelManager.INDEX_LESSON_TWO);
        
    }//GEN-LAST:event_btn_LessonTwoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LessonOne;
    private javax.swing.JButton btn_LessonTwo;
    // End of variables declaration//GEN-END:variables
}
