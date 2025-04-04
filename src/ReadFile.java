import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stubw
		String filePath= "C:\\Users\\monika23\\Downloads\\test2.txt";
		System.out.println(filePath);
		String dest= "C:\\Users\\monika23\\Downloads\\new.txt";
		List<String> emails = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		BufferedWriter wr= new BufferedWriter(new FileWriter(dest));
		String line;
		String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
		Pattern p = Pattern.compile(regex);
		while((line = br.readLine())!=null)
		{
			Matcher match = p.matcher(line);
			
			if(match.find())
			{
				emails.add(match.group());
			}			
		}
		
		for(String email:emails)
		{
			System.out.println(email);
			wr.write(email);
			wr.newLine();
		}
		
		wr.close();
	}

}
