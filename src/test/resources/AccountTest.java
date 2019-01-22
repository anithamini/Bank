import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
	
	Account a=new Account(10295,1000);
@Test
public void testdeposit()
{
	assertEquals(Account.deposit(1000),Account.getBalance());
}
@Test
public void withdraw()
{
	assertEquals(Account.withdraw(500),Account.getBalance());
}
}