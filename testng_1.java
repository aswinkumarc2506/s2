package testng;

import org.testng.annotations.Test;

public class testng_1 {
@Test
public void add() {
	System.out.println("added ");
}
@Test(enabled = false)
public void delete() {
	System.out.println("delete");
}
@Test()
public void divide() {
	System.out.println("divided");
}
@Test
public void multi() {
	System.out.println("multi");
}
}
