class Anything {
    static void text(){
        int a =4;
        int b = 7;
        int c = a + b;
        System.out.println(c);
    }
    static int text(int x){
        x = 3+5+7+8;
        return x;
    }
    static void text(int y, String z){
        y = 13;
        z = "Milions";
        System.out.println(y + z);
    }
    public static void main(String[] args) {
        text();
        text(6 ,"r+t");
        System.out.println(text(2));


    }
}
