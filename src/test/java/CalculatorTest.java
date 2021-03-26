import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        System.out.println("Add method called");
    //int actual =Calculator.add(2,6);
    assertEquals(8,Calculator.add(2,6));
    }
   @Test
    void testcase1() {
       System.out.println("testCase1 executed");
       assertEquals(5,5);
    }
    @Test
    void testcase2() {
        System.out.println("testCase2 executed");
        boolean result =Calculator.add(2,3) == 5;
        assertTrue(result);

        assertTrue(Calculator.operator.equals("add"));

    }
    @Test

    void testCase3(){
        System.out.println("testCase3 executed");
        //test will pass
        assertArrayEquals(new int[]{1,2,3},new int []{1,2,3});

        //test will fail
        assertArrayEquals(new int[]{1,2,3,4},new int []{1,2,3});
    }
    @Test

    void testCase4(){
        System.out.println("testCase4 executed");
        String nullString = null;
        String notNullString = "Mustafa";
        //test will pass
        assertNotNull(notNullString);
        //test will fail
       // assertNotNull(nullString);
        //test will pass
        assertNull(nullString);
        //test will fail
        assertNull(notNullString);
    }

    @Test

    void testCase5(){
        System.out.println("testCase5 executed");
      Calculator c1 = new Calculator();
      Calculator c2=c1;
      Calculator c3 = new Calculator();
        //test will pass
      assertNotSame(c1,c3);
        //test will fail
       assertNotSame(c1,c2);

        //test will pass
        assertSame(c1,c2);
        //test will fail
        assertSame(c1,c3);
    }
    @BeforeEach
    void setUpEach(){
        System.out.println("@BeforeEach is executed");
    }

    @BeforeAll
   static void setUpAll(){
        System.out.println("@BeforeAll is executed");
    }

    @AfterAll
    static void tearAll(){
        System.out.println("@AftereAll is executed");
    }

    @AfterEach
    void tearEach(){
        System.out.println("@AfterEach is executed");
    }

}