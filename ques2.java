import java.util.Scanner;

class ToggleCharacter

{

	public String toggleStr(String str)

	{

		String newstr = "";

		for(int i=0;i<str.length();i++)

		{

			char letter = str.charAt(i); 



           if(Character.isUpperCase(str.charAt(i)))

           {

                letter = Character.toLowerCase(letter); 

                newstr = newstr + letter; 



           }

           else if(Character.isLowerCase(str.charAt(i)))

           {

               letter = Character.toUpperCase(letter);

               newstr = newstr + letter; 

           }



       }

       return newstr;

	}

}	
 class Toggle

{

	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your string: ");

		String str = sc.next();

		ToggleCharacter t = new ToggleCharacter();

		String togstr = t.toggleStr(str);

		System.out.println(togstr);

	}

}