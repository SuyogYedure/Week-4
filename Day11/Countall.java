class Countall{
    public static void main(String args[]){
        String str = "hi HELLO 1234 how are$% you890";
        int upper = 0, lower = 0, digits = 0, special = 0;
  
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                digits++;
            else
                special++;
        }
  
        System.out.println("Lower case letters are : " + lower);
        System.out.println("Upper case letters are : " + upper);
        System.out.println("digits are : " + digits);
        System.out.println("Special characters : " + special);
    }
}