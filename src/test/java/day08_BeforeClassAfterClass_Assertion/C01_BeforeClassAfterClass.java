package day08_BeforeClassAfterClass_Assertion;

import org.junit.*;

public class C01_BeforeClassAfterClass {
    /*
    @BeforeClass ve @AfterClass methodical static olmak zorundadir

     */

    @BeforeClass
    public static void beforeClass() throws Exception {

    }

    @AfterClass
    public static void afterClass() throws Exception {

    }

    @Before
    public void setUp() throws Exception{
        System.out.println("Her methot dan once Before methodu bır kez calısır");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Her methot dan sonra After(tearDown) methodu bır kez calısır");
    }

    @Test
    public void test01() {
    }

    @Test
    public void test02() {
    }

    @Test
    public void test03() {
    }



}

