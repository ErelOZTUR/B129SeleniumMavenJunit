package day07_Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C02_BeforeAfter {
    @Before
    public void setUp() throws Exception {
        System.out.println("Hers test methodu öncesi bir kez çalışır");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Hers test methodu sonrası bir kez çalışır");
    }

    @Test
    public void test01() {
        System.out.println("İlk Test");
    }

    @Test
    public void test02() {
        System.out.println("İkinci Test");
    }

}
