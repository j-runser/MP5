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
public class LessonOnePanel extends javax.swing.JPanel {

    PanelManager manager;
    
    /**
     * Creates new form LessonOnePanel
     * 
     * @param manager
     */
    public LessonOnePanel(PanelManager manager) {
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

        btn_NextLesson = new javax.swing.JButton();

        btn_NextLesson.setText("Next Lesson");
        btn_NextLesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NextLessonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addComponent(btn_NextLesson)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addComponent(btn_NextLesson)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NextLessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NextLessonActionPerformed
        
        manager.setPanel(PanelManager.INDEX_LESSON_TWO);
        
    }//GEN-LAST:event_btn_NextLessonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_NextLesson;
    // End of variables declaration//GEN-END:variables
}
