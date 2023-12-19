package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;




public class TestBase {
	

	public void launchDriver() throws IOException {
		
		Properties p=new Properties();
		File f=new File(System.getProperty("user.dir")+"//src//test//resources//Config.propertie");
		FileInputStream fs=new FileInputStream(f);
		p.load(fs);
		System.out.println(p.get("browser"));
		
	}

}
