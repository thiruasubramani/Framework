package dataProvider;
import org.testng.annotations.DataProvider;
import com.clearcode.utils.ExcelUtils;


	public class TestData {
		int a=2;
		@DataProvider
		public Object[][] AdminLogin(){
				return ExcelUtils.getData("TestData.xls","AdminLogin");
		}
			
		@DataProvider
		public Object[][] AddNewUser(){
			return ExcelUtils.getData("TestData.xls","NewUser");
		}
		@DataProvider
		public Object[][] AddNewProperty(){
			return ExcelUtils.getData("TestData.xls","NewProperty");
		
		}
	
    }
