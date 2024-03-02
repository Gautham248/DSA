public class HashTable2 {
    public class Pair{
        String key,value;
        public Pair(String key, String value)
        {
            this.key=key;
            this.value=value;
        }
    }

    public class HashMap{
        int size;
        int capacity;
        Pair[] map;//array of structures

        public HashMap()
        {
            this.size=0;
            this.capacity=2;
            this.map = new Pair[2];
        }

        //to get the index of a key using hashing
        //calculated by adding the ascii values of the characters in the key
        public int hash(String key)
        {
            int index=0;
            for(int i=0;i<key.length();i++)
            {
                index+=(int)key.charAt(i);
            }
            return index % this.capacity;
        }

        //to get the value associated with a key
        public String get(String key){
            int index=hash(key);
            while(this.map[index]!=null)
            {
                if(this.map[index].key==key)
                {
                    return this.map[index].value;
                }
            }
            return null;
        }

        //insert a key-value into an index
        public void put(String key,String value)
        {
            //get the index corresponding to the key using the hash
            int index=hash(key);
            //running a loop until the value is entered//handling collisions
            while(true)
            {
                if(this.map[index]==null)
                {
                    this.map[index]=new Pair(key, value);
                    this.size++;
                    // if(this.size>this.capacity/2)
                    // {
                    //     this.rehash();
                    // }
                    return;
                }
                else if(this.map[index].key==key)
                {
                    this.map[index].value=value;
                    return;
                }
                index++;
                index%=this.capacity;

            }
        }

        public void remove(String key)
        {
           // int index=hash(key);
        }


    }
}
