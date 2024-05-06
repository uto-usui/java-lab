package prog02;

class Issue06{
    public static void main(String[] args){
        int a = 10000;
        int count =0;

        for(int i=2; i <= a; i++){    // （ア）
            boolean flg = true;
            for(int j=2; j < i; j++){ // （イ）
                if(i % j == 0){ // （ウ）
                    flg = false;
                    break;
                }
            }
            if(flg)count++;    // （エ）
        }
        System.out.println("Count="+count);
    }
}
