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
public class ProgressTracker {
    
    private final String name;
    
    private static final int OVERALL_LENGTH    = 2;
    private static final int LESSON_ONE_LENGTH = 3;
    
    
    private boolean[] overallProgress;
    private boolean[] lessonOneProgress;
    
    public ProgressTracker(String name) {
        
        this.name = name;
        
        overallProgress = new boolean[OVERALL_LENGTH];
        lessonOneProgress = new boolean[LESSON_ONE_LENGTH];
        
    }
    
}
