public class StringBuffer_and_StringBuilder {
    public static void main(String[] args) {
        /*
        *  String is Immutable
        *  String str = a; it'll create one variable in string pool inside that str point to a
        *  string str = ab; then we re allocating with ab. now str create one new object n started pointing to ab
        *  first object a garbage collection will collect that object
        * */


        String[] names = {"Dinesh", "Kishore","Selva"};
        StringBuffer_and_StringBuilder stringBufferAndStringBuilder = new StringBuffer_and_StringBuilder();

        //Normal String
        stringBufferAndStringBuilder.join_String(names);

        //String Buffer
        stringBufferAndStringBuilder.stringBuffer(names);

        //String Builder
        stringBufferAndStringBuilder.stringBuilder(names);


        stringBufferAndStringBuilder.difference();


    }



    private void join_String(String[] names) {
        System.out.println("STRING BEHAVIOUR :");
        String sentence = "";
        System.out.println(sentence);
        for(String name: names)
        {
            sentence = sentence + name;
            System.out.println("String hashcode : " + sentence.hashCode());
        }
        System.out.println(sentence);
        System.out.println();
    }
    private void stringBuffer(String[] names) {
        /*  To rectify the immutability introduced the concept called StringBuffer
         *   we have to use New StringBuffer  keyword to create a object
         *   once string create it'll reuse the memory
         * */
        System.out.println("STRING BUFFER BEHAVIOUR : ");
        System.out.println();
        StringBuffer stringBuffer = new StringBuffer("");
        StringBuffer stringBuffer1 = new StringBuffer("Hi Naruto");
//        stringBuffer1.insert(2,"-bye");
        stringBuffer1.replace(0,2,"Bye");  // 0 to 1 Included. 2 is Exclusive
        System.out.println(stringBuffer1);
        System.out.println(stringBuffer1.reverse());

        for(String name: names) //Undirectional loop - Forward direction loop
        {
            stringBuffer.append(name);
            System.out.println("String Buffer: "+ stringBuffer.hashCode());
        }
        System.out.println(stringBuffer);
    }

    private void stringBuilder(String[] names) {
        /*  To rectify the immutability introduced the concept called StringBuffer
         *   we have to use New StringBuffer  keyword to create a object
         *   once string create it'll reuse the memory
         * */
        System.out.println("STRING BUILDER BEHAVIOUR : ");
        System.out.println();
        StringBuffer stringBuilder = new StringBuffer("");
        StringBuffer stringBuilder1 = new StringBuffer("Hi Naruto");
//        stringBuffer1.insert(2,"-bye");
        stringBuilder1.replace(0,2,"Bye");  // 0 to 1 Included. 2 is Exclusive
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder1.reverse());

        for(String name: names) //Undirectional loop - Forward direction loop
        {
            stringBuilder.append(name);
            System.out.println("String Buffer: "+ stringBuilder.hashCode());
        }
        System.out.println(stringBuilder);
    }
    private void difference() {
        /* String Buffer (Came First Jave version 1)
        *  1) Thread Safe
        *  2) All methods are Synchronized method. (Only one thread can access at a time. other threads have to wait.
        *  we can set priority(which thread you have run first),
        * sequential actions(Single Thread))
        *   3) A thread safe, mutable sequence of character. StringBuffer like string, but can be modified
        * */

        /* String Builder (Came Second Java Version 1.5(JDK5) )
         *  1) not Thread Safe
         *  2) All methods are not Synchronized method. (Multiple thread can run at a time, Parallel Actions(MultiThread))
         *  3) A mutable sequence of character.This class provides API compatible with StringBuffer.
         *     but no Guarantee of Synchronization
         * */


    }
}
