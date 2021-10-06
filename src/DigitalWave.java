public class DigitalWave {
    public static void main(String[] args) {
        int nr = 6;
        int nc = 10;
        int mid;
        int j;
        if(nc <= 5){
            System.out.println("Too small width to form a wave");
            System.exit(0);
        }
        Layout.heading1("Digital Wave");
        for (int i = 1; i <= nr; i++) {
            if(nc%2==0){
                mid = nc/2;
                j = 1;
            }
            else{
                mid = nc/2+1;
                j = 0;
            }
            int diff = mid * 3 - 2;
            int waveRangeDiff = mid - 1;
            int wStart = mid - waveRangeDiff;
            int wEnd = mid + waveRangeDiff;
            for (; j < 50; j++) {
                if(j==wEnd){
                    mid = (mid + diff) - 5;
                    wStart = mid - waveRangeDiff;
                    wEnd = mid + waveRangeDiff;
                }
                for(int k = 0; k < 1; k++){
                        if(i == 1 && (j>wStart&&j<mid)){
                            System.out.print("* ");
                        }
                        else if(i==nr && (j>mid&&j<wEnd)){
                            System.out.print("* ");
                        }
                        else if((j>wStart && j<mid) || j>mid && j<wEnd){
                            System.out.print("  ");
                        }
                        else{
                            System.out.print("* ");
                        }
                }
            }
            System.out.println();
        }
    }
}
