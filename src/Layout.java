public class Layout {
    public static void heading1(String str){
        for(int i = 1; i <= 3; i++){

            for(int j=0 ; j < 5; j++){
                System.out.print("\t");
            }
            if(i%2!=0){
                int count = str.length() + 10;
                for(int l = 0; l < count; l++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                System.out.println("|    " + str + "    |");
            }
        }
    }

    public static void heading2(String str){
        for(int i = 1; i <= 3; i++){

            if(i%2!=0){
                int count = str.length() + 10;
                for(int l = 0; l < count; l++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                System.out.println("|    " + str + "    |");
            }
        }
    }
}
