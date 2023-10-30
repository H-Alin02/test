package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FunzioniTest {

    private Palindrome p;
    private Matrice m;
    private Insiemi i;

    @Before
    public void setUp() throws Exception{
        p = new Palindrome();
        m = new Matrice();
        i = new Insiemi();
        Assert.assertNotNull(p);
        Assert.assertNotNull(m);
        Assert.assertNotNull(i);
    }

    @After
    public void tearDown() throws Exception{
        p = null;
        m = null;
        i = null;
        Assert.assertNull(p);
        Assert.assertNull(m);
        Assert.assertNull(i);
    }

    @Test
    public void PalindromeTest(){
        String stringa1 = "Bob ama Anna ed Ada";
        String stringa2 = "Il radar avvista i nemici";
        String stringa3 = "Il gatto corre";
        Assert.assertEquals("Numero parole palindrome sbagliato", 4 , p.parolePalindrome(stringa1));
        Assert.assertEquals("Numero parole palindrome sbagliato", 2 , p.parolePalindrome(stringa2));
        Assert.assertEquals("Numero parole palindrome sbagliato", 0 , p.parolePalindrome(stringa3));
    }

    @Test
    public void DiagonaleTest(){
        int [][] array1 = {{1,0,1},{0,1,0},{1,0,1}};
        int [][] array2 = {{2,0,2},{0,2,1},{2,3,2}};
        int [][] array3 = {{1,2,1},{2,1,4},{1,2,3}};
        Assert.assertTrue("Diagonali non identiche", m.verificaDiagonali(array1));
        Assert.assertTrue("Diagonali non identiche", m.verificaDiagonali(array2));
        Assert.assertFalse("Diagonali identiche", m.verificaDiagonali(array3));

    }

    @Test
    public void verificaInsiemeTest(){
        List<Integer> numeri1 = List.of(1,2,3,4,5);
        List<Integer> numeri2 = List.of(4,3,6,1,4,4);
        List<Integer> numeri3 = List.of(31,3,13,53,2);
        List<Integer> numeri4 = List.of();

        Assert.assertTrue("Questa sequenza di numeri non è un insieme ", i.verificaInsieme(numeri1));
        Assert.assertFalse("Questa sequenza di numeri è un insieme", i.verificaInsieme(numeri2));
        Assert.assertTrue("Questa sequenza di numeri non è un insieme", i.verificaInsieme(numeri3));
        Assert.assertTrue("Questa sequenza di numeri non è un insieme", i.verificaInsieme(numeri4));


    }
}
