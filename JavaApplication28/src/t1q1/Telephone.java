package t1q1;

/**
 *
 * @author Chin Jia Xiong
 */
public class Telephone {
    private String areaCode;
    private String number;
    private static int numberOfTelephoneObject = 0;
    
    public Telephone(String a, String b){
        this.areaCode = a;
        this.number = b;
        this.numberOfTelephoneObject += 1;
    }
    
    public String getAreaCode(){
        return areaCode;
    }
    
    public void setAreaCode(String a){
        areaCode = a;
    } 
    
    public String getNumber(){
        return number;
    }
    
    public void setNumber(String n){
        number = n;
    }
    
    public String makeFullNumber(){
        return areaCode + "-" + number;
    }
    
}
