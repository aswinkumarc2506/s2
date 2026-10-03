package data_driven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class data_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties prop =new Properties();
prop.setProperty("URL", "https://www.saucedemo.com/");
prop.setProperty("UN", "standard_user");
prop.setProperty("PWD", "secret_sauce");
FileOutputStream fos= new FileOutputStream("./src/test/resources/commondata.properties");
prop.store(fos, "commondata");
	}

}
