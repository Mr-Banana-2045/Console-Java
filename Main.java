import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner pass = new Scanner(System.in);
		System.out.printf("Enter Password : ");
		String ps = pass.nextLine();
		
		System.out.println(ps);
		if(ps.equals("1234")){
		System.out.println("\u001B[32mwelcome to console\n");
		while (true){
		Scanner input = new Scanner(System.in);
		System.out.print("root@code-$ ");
		String code = input.nextLine();
		if (code.equals("sysinfo")){
			System.out.println(" #######  "+ System.getProperty("user.name")+"@code"+"\n #######  ----------\n #######  "+ System.getProperty("os.arch")+"\n #######  " + System.getProperty("os.version"));
		}
			else {
				System.out.println(System.getProperty("os."+code));
			}
		}
		}
		else{
			System.out.printf("error");
		}
	}
}
