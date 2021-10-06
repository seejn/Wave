import java.util.Scanner;
public class AnalogWave {
    public static void main(String[] args) {
        AnalogWave analogwave = new AnalogWave();
        analogwave.input();
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        Layout.heading1("Height Width Weight of Wave");
        System.out.println("Enter height of wave: ");
        int nr = scanner.nextInt(); //number of rows
        System.out.println("Enter width of wave: ");
        int nWave = scanner.nextInt();//number of wave
        System.out.println("Enter weight of wave: ");
        int weight = scanner.nextInt();//number of * in single wave in a row
        createWave(nr, nWave, weight);
    }
    public void createWave(int nr, int nWave, int weight){
        int nc = nr * 2; //number of column required as per rows
        int wave = nc * nWave;//number of column required as per wave
        int diff = (nr * 2) ;//peak point in each wave

        Layout.heading2("WAVE");
        for(int i = 0; i < nr; i++){
            int peak = nr;
            for(int j = 1; j < wave; j++){
                for(int k = 0; k < weight; k++){
                    if((peak - i) == j || (peak + i) == j){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    if(j == (peak + nr)) //when the column point reaches the final point in a wave
                        peak = peak + diff;//changing the peak point for the next wave
                }
            }
            System.out.println();
        }
    }
}
