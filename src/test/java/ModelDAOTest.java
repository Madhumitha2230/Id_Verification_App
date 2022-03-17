import com.madhu.project.Model;
import com.madhu.project.ModelDAO;

public class ModelDAOTest {

	public static void main(String[] args)throws Exception {
		Model user=new Model();
		user.setName("Suji");
		user.setEmail("s@gmail.com");
		user.setPassword("pass123");
		
		System.out.println(user);
		
		ModelDAO userDAO=new ModelDAO();
		userDAO.modelList(user);
		}


	}

