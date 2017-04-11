/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.util.ArrayList;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author josephrunser
 */
public class PanelManager {
    
    ArrayList<JPanel> panels;
    
    public static final int INDEX_MAIN_PANEL = 0;
    public static final int INDEX_LESSON_ONE = 1;
    public static final int INDEX_LESSON_ONE_Q = 2;
    public static final int INDEX_LESSON_ONE_P = 3;
    public static final int INDEX_LESSON_TWO = 4;
    
    
    StartPanel startPanel;
    LessonOnePanel lessonOnePanel;
    LessonOneQuestion lessonOneQuestion;
    LessonOnePractice lessonOnePractice;
    LessonTwoPanel lessonTwoPanel;
    
    JLayeredPane pane;
    
    public PanelManager(JLayeredPane pane) {
        
        this.pane = pane;
        
        panels = new ArrayList();
        
        startPanel = new StartPanel(this);
        lessonOnePanel = new LessonOnePanel(this);
        lessonTwoPanel = new LessonTwoPanel(this);
        lessonOneQuestion = new LessonOneQuestion(this);
        lessonOnePractice = new LessonOnePractice(this);
        
        panels.add(INDEX_MAIN_PANEL, startPanel);
        panels.add(INDEX_LESSON_ONE, lessonOnePanel);
        panels.add(INDEX_LESSON_ONE_Q, lessonOneQuestion);
        panels.add(INDEX_LESSON_ONE_P, lessonOnePractice);
        panels.add(INDEX_LESSON_TWO, lessonTwoPanel);
        
    }

    public void setPanel(int index) {
        
        panels.get(index).setLocation(0, 0);
        panels.get(index).setSize(pane.getSize());
        
        pane.removeAll();
        pane.add(panels.get(index));
        pane.setVisible(true);
        
    }
    
}
