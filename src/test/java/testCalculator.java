import org.junit.Assert;
import org.junit.Test;

public class testCalculator {


    @Test
    public void test1plus1()
    {
         // Arrange = Organiser
        int arg1 = 1 ;
        int arg2 = 1 ;
        int expectedResult = 2 ;


        // Act = Action
        int returnedResult = Calculator.add(arg1, arg2);


        // Assert = Vérifier
        Assert.assertEquals(expectedResult,returnedResult);

    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testMax()
    {

        // Arrange = Organiser
        int arg1 = Integer.MAX_VALUE ;
        int arg2 = 1 ;



        // Act = Action
        int returnedResult = Calculator.add(arg1, arg2);

    }
    //@Test(expected = IndexOutOfBoundsException.class)
    public void testMin()
    {

    }


}

