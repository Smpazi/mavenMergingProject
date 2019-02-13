import org.junit.Assert;
import org.junit.Test;
// this test if the words have been merges into one word

public class MergeTestApp {

    @Test
    public void testConcatenate(){
        MergeWordsApp amountApp = new MergeWordsApp();

        String result = amountApp.concatenate("Student-","Marks");

        Assert.assertEquals("Student-Marks", result);


    }



}
