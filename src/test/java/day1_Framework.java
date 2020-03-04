import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1_Framework {

    @BeforeTest
    public void Preview() {
        System.out.println("Before Test");

    }

    @Test
    public void demo() {
        System.out.println("Hello");
        //Assert.assertTrue(false);
    }

    @Test
    public void MobileTest1() {
        System.out.println("MobileTest1");
    }

    @Test
    public void MobileTest2() {
        System.out.println("MobileTest2");
    }

    @AfterTest
    public void Review() {
        System.out.println("After Test");

    }

}
