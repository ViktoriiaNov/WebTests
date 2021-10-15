import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class HomeworkTest {

    @Test

    void testAdditionMethod(){
        int result;
        result = Main1.additionMethod (5,70);
        Assert.assertEquals(result, 75);


        }
@Test
    void testMultiplicationMethod(){
        int result;
        result=Main1.multiplicationMethod(70,5);
        Assert.assertEquals(result,350);



    }
@Test
void testDivisionMethod(){
        int result;
        result=Main1.divisionMethod(4,2);
            Assert.assertEquals(result,2 );
    }


    @Test
    void testSubstraction (){
        int result;
        result=Main1.substractionMethod(10,5);
        Assert.assertEquals(result, 5 );


    }

    @Test
    public void testAbbreviation (){
        Assert.assertEquals(
                StringUtils.abbreviate("Привет всем кто живет на луне!", 10),
                "Привет ...");





    }




}


