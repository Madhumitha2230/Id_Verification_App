import com.madhu.project.Model;
import com.madhu.project.ModelValidation;

public class ModelValidateTest {

	public static void main(String[] args) throws Exception {
		

		Model user=new Model();
		user.setName("Madhu");
		user.setEmail("M@gmail.com");
		user.setPassword("pass123");
		
		System.out.println(user);
		ModelValidation.validateUserDetails(user);
		
	}

}
