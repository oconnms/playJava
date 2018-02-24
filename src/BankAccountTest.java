import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

// Some other comment

public class BankAccountTest {

    private BankAccount account;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Done Testing Setup");
    }

    @Before
    public void setup() {
        account = new BankAccount("Mike", "O'Connor", 1000.00, BankAccount.CHECKING);
    }

    @Test
    public void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200, balance, 0);
    }

    @Test
    public void withdraw_branch() {
        //fail("Not yet implemented");
        double balance = account.withdraw(500.00, true);
        assertEquals(500.00, balance, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
        //fail("Not yet implemented");
        double balance = account.withdraw(500.00, false);
        assertEquals(500.00, balance, 0);
    }

    @Test
    public void getBalance_withdraw() {
        double balance = account.withdraw(200.00, true);
        assertEquals(800, account.getBalance(), 0);
    }

    @Test
    public void getBalance_deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200, account.getBalance(), 0);
    }

    @Test
    public void isChecking() {
        assertTrue("The Account is NOT a checking account", account.isChecking());
    }
}