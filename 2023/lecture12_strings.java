

public class lecture12_strings {
    public static void main(String[] args) {
        String firstName="tony";
        String secondName="stark";
        String fullName= firstName+" "+secondName;
        System.out.println(fullName);
        for(int i=0;i<fullName.length();i++)
        {
            System.out.println(fullName.charAt(i));
        }

    }
}
