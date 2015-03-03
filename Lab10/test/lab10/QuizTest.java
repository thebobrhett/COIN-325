/****************
Bob Rhett - Monday, March 3, 2015
  JUnit Tester for quiz program.
  Initial release
****************/
package lab10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bob
 */
public class QuizTest {
    
    public QuizTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testNumberOfQuestions() {
        Question quiz = new Question();
        assertTrue(3 == quiz.numQuestion());
    }
    
    @Test
    public void testNewQuestion() {
        Question testQ = new Question();
        testQ.newQuestion("Why is there air?", "Because");
        System.out.println("testNewQuestion: " + testQ.getQuestion(4));
        assertTrue(testQ.getQuestion(4).equals("Why is there air?, Student response: , Instructor's answer: Because"));
    }

    @Test
    public void testAddQuestion() {
        Quiz testQuiz = new Quiz();
        assertTrue(testQuiz.addQuestion("Why is there air?", "Because").equals("Why is there air?, Student response: , Instructor's answer: Because"));
    }
}
