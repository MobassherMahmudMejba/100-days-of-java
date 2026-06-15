public class Variables {
    public static void main(String[] args) {
        // ডেটা টাইপ ডিক্লেয়ারেশন
        int myNum = 5;
        float f = 4.5f;
        float myfloatNum = (float)5.456;
        double mydoubleNum = 5.8484946848489498;
        char character = 'M';
        String text = "Hello Welcome to Day 1 of JAVA Learning!";
        String T = "I have " + myNum + " Kids";

        // প্রিন্ট করা
        System.out.println("Integer: " + myNum);
        System.out.println("Float: " + f);
        System.out.println("Another Float: " + myfloatNum);
        System.out.println("Double: " + mydoubleNum);
        System.out.println("Character: " + character);
        System.out.println("Text: " + text);
        System.out.println("String combination: " + T);

        // Boolean লজিক
        boolean b = false;
        b = true;
        boolean toBe = false;
        b = toBe || !toBe; // b এখন true হয়ে যাবে
        
        if (b) {
            System.out.println("toBe is: " + toBe);
        }

        // সঠিক লজিক: int দিয়ে if কন্ডিশন
        int children = 0;
        if (children == 0) {
            System.out.println("No children yet.");
        }

        // গাণিতিক অপারেশন (সংশোধিত)
        int a;
        int x = 10;
        int y = 5;
        a = x + y; // boolean যোগ করা যায় না, তাই int যোগ করলাম
        System.out.println("Addition result: " + a);
    }
}