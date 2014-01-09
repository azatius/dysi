package TestFramework;

import org.junit.*;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class VSBrandAppTest {

    private Collection collection;

    @BeforeClass
    public static void oneTimeSetUp(){
        System.out.println("@BeforeClass - oneTimeSetUp");
    }

    @AfterClass
    public static void oneTimeTearDown(){
        System.out.println("@AfterClass - oneTimeTearDown");
    }

    @Before
    public void setUp(){
        collection = new ArrayList();
        System.out.println("@Before - setUp");
    }

    @After
    public void tearDown(){
        collection.clear();
        System.out.println("@After - tearDown");
    }

    @Test
    public void testEmptyCollection(){
        assertTrue(collection.isEmpty());
        System.out.println("@Test - testEmptyCollection");
    }

    @Test
    public void testOneItemCollection(){
        collection.add("itemA");
        assertEquals(1, collection.size());
        System.out.println("@Test - testOneItemCollection");
    }
}
