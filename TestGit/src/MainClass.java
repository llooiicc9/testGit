
public class MainClass 
{

	public static void main(String[] args) 
	{

		TestGit update = new TestGit();

		
		System.out.println(update.returnTheString());
		
		TestGitUpdate test = new TestGitUpdate("Salut toi");
		System.out.println(test.returnTheString());
	}

}
