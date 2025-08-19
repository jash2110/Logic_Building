class Main {
    
    public static String removeAllOcc(String str, String target){
        while(str.contains(target)){
            str = str.replace(target, "");
        }
        return str;
    }
    
    public static void main(String[] args) {
       System.out.println(removeAllOcc("daabcbaabcbc", "abc"));
        
    }
}
