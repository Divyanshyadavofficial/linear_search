

public class searchstrings {
    public static void main(String[] args) {
        String name = "Divyansh";
        char target = 'a';
        System.out.println(search(name,target));
    }

    static boolean search(String name, char target) {
        if(name.length() ==0){
            return false;
        }
        for(int index = 0;index < name.length();index++){
            if(target == name.charAt(index)){
                return true;
            }
        }
        return false;
    }
}
