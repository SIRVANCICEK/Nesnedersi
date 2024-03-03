public class Run{
    private  String[] kisiAd;
    private final int [] minutes;
    public Run(String[] kisiAdArray,int [] minutesArray){
        kisiAd=kisiAdArray;
       minutes=minutesArray;
    }
    public String[] getKisiAd(){
      return kisiAd;
    }
    public void setKisiAd(String[] kisiAdArray){
      kisiAd=kisiAdArray;
    }
    public void competingStudent(){
        System.out.println("Birinci: "+ getBirinciIsim()+  " " +  getBirinci()+ "'");
        System.out.println("İkinci: "+  getIkinciIsim()+    " "+  getIkinci() + "'");
        System.out.println("Üçüncü: "+  getUcuncuIsim()+    " " + getUcuncu()+ "'");
        degerAraligi();

    }
    public int getBirinci(){
        int birinci =minutes[0];
        for(int elemanSure: minutes){
            if(elemanSure<birinci){
                birinci=elemanSure;
            }
        }
        return birinci;
    }
    public int getBirinciSira(){
        int i;
        int diziUzunlugu=minutes.length;
        for(i=0; i<=diziUzunlugu-1; i++) {
            if(minutes[i]==getBirinci()) {
                break;
            }
        }
        return i;
    }
    public String getBirinciIsim() {
        String birinciIsim=kisiAd[getBirinciSira()];
        return birinciIsim;
    }
    public int getIkinci(){
        int ikinci=minutes[0];
        for(int elemanSure: minutes){
            if(elemanSure<ikinci && getBirinci()<elemanSure){
                ikinci=elemanSure;
            }
        }
        return ikinci;
    }
    public int getIkinciSira(){
        int i;
        int diziUzunlugu=minutes.length;
        for(i=0; i<=diziUzunlugu-1; i++) {
            if(minutes[i]==getIkinci()) {
                break;
            }
        }
        return i;
    }
    public String getIkinciIsim() {
        String ikinciIsim=kisiAd[getIkinciSira()];
        return ikinciIsim;
    }
    public int getUcuncu(){
        int ucuncu=minutes[0];
        for(int elemanSure: minutes){
            if(elemanSure<ucuncu && getIkinci()<elemanSure){
                ucuncu=elemanSure;
            }
        }
        return ucuncu;
    }
    public int getUcuncuSira(){
        int i;
        int diziUzunlugu=minutes.length;
        for(i=0; i<=diziUzunlugu-1; i++) {
            if(minutes[i]==getUcuncu()) {
                break;
            }
        }
        return i;
    }
    public String getUcuncuIsim() {
        String UcuncuIsim=kisiAd[getUcuncuSira()];
        return UcuncuIsim;
    }
    public void degerAraligi(){
        int toplamA=0;
        int toplamB=0;
        int toplamC=0;
        for(int elemanSure: minutes){
            if(200<= elemanSure && elemanSure<=299){
                toplamA++;

            }else if(300<= elemanSure && elemanSure<=399){
                toplamB++;

            }else if(400<=elemanSure){
                toplamC++;
            }
        }
        System.out.println("A->" + toplamA);
        System.out.println("B->" + toplamB);
        System.out.println("C->" + toplamC);

    }


}
