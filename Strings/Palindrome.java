class Palindrome{
    void checkPalindrome(String str){
        int st = 0; 
        int end = str.length() - 1;
        
        while(st <= end){
            
            if(!Character.isLetterOrDigit(str.charAt(st))){
                st++;
                continue;
            }
            if(!Character.isLetterOrDigit(str.charAt(end))){
                end--;
                continue;
            }   
            if(Character.toLowerCase(str.charAt(st)) != Character.toLowerCase(str.charAt(end))){
                System.out.println(str + " is not palindrome.");
                return;
            }
            st++;
            end--;
        }
        System.out.println(str + " is a palindrome.");
    }
}


class Main {
    public static void main(String[] args) {
        
        Palindrome p1 = new Palindrome();
        p1.checkPalindrome("RACE CAR");
        
        // System.out.println("Try programiz.pro");
    }
}
