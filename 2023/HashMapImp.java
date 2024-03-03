import java.util.HashMap;

public class HashMapImp {
    public static void main(String[] args) {
        HashMap<String,Integer> hm= new HashMap<>();
        String[] myArray = {"alice","brad","collin","brad","dylan","kim","brad"};
        for(String i:myArray)
        {
            int count;
            if(!hm.containsKey(i))
            {
                count=1;
                hm.put(i, count);
            }
            else{
                count=hm.get(i);
                hm.put(i,++count);
            }
        }
        System.out.println(hm);

    }
}
