package za.ac.cput.assignment2;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/0   m6/03.
 */
public class Testing
{
    public static Person per1;
    public static Person per2;
    public static Person per3;

    @Before
    public void setUp() throws Exception
    {
        per1 = new Person("Tommy", "Peterson", 20, 1200.56f, false);
        per2 = new Person("Sixolise", "Maboza", 22, 4000.00f, true);
        per3 = new Person("Sixolise", "Maboza", 22, 4000.00f, true);
    }

    @Test
    public void testFloat() throws Exception
    {
        Assert.assertEquals(4000.00f, per2.getSalary(), 0.02);
    }

    @Test
    public void testInt() throws Exception
    {
        Assert.assertEquals(per2.getAge(), 22);
    }

    @Test
    public void testEquality() throws Exception
    {
        Assert.assertEquals(per2.getFirstN(), per3.getFirstN());
    }

    @Test
    public void testIdentity() throws Exception
    {
        Assert.assertNotSame(per1, per2);
    }

    @Test
    public void testTruth() throws Exception
    {
        Assert.assertTrue(per2.isMarried());
    }

    @Test
    public void testFalse() throws Exception
    {
        Assert.assertFalse(per1.isMarried());
    }

    @Test
    public void testNull() throws Exception
    {
        per1 = null;
        Assert.assertNull(per1);
    }

    @Test
    public void testNonNull() throws Exception
    {
        Assert.assertNotNull(per2);
    }

    @Test
    public void testFailingTest() throws Exception
    {
        Assert.assertEquals(per2.getAge(), per3.getAge());
    }

    @Test(timeout=11)
    public void testTimeout() throws Exception
    {
        while(true)
        {
        }
    }

    @Test
    public void testDisabling() throws Exception
    {
        Assert.assertEquals("Sixolise", per3.getFirstN());
    }

    @Test
    public void testArrays() throws Exception
    {
        Assert.assertArrayEquals(new String[]{"a", "z"}, new String[]{"a", "z"});
    }

}
