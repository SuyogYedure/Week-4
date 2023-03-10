class Upperlower
{
	public static void main(String args[]){
    String str = "hi HOW are you";
		int lwr=0,upr=0,len = str.length();
		for (int i = 0; i < len; i++) {
			Character c = str.charAt(i);
			if (Character.isLowerCase(c))
				lwr+=1;
			else if (Character.isUpperCase(c))
				upr+=1;
		}
 
		System.out.println("Number of UpperCase  : "+upr);
		System.out.println("Number of LowerCase  : "+lwr);
	}
	
}