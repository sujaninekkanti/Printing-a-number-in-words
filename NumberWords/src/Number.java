
public class Number {
	
	
	String units[] ={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
    String tens[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};	
	
    public String convertNumberToWords(int n){
    	
    	if(n<20){
    		return units[n];
    	}
    	//now the number is 99 less than 100 
    	if(n<100){
    		return tens[n/10] +((n %10!=0) ? " " : "") + units[n%10];
    		
    	}
    	if(n<1000){
    		//if number is 899 in return statement 899/100 returns quotient 8 +hundred 899%100 is not equal to 0 true adds space then calles the function again 899%100 now returns 99
    		return units[n/100] +" Hundred "+((n %100!=0) ? " " : " ") + convertNumberToWords(n % 100);
    	}
    	if(n<100000){
    		
    		return convertNumberToWords(n/1000) +" Thousand" +((n%10000!=0) ?" " : " ") + convertNumberToWords(n%1000);
    	} 
    	if(n<10000000){
    		return convertNumberToWords(n/100000) +" lakh" +((n%100000!=0) ?" " : " ") + convertNumberToWords(n%100000);
    	}
    	if(n<1000000000){
    		return convertNumberToWords(n/10000000) +" crore" +((n%10000000!=0) ?" " : " ") + convertNumberToWords(n%10000000);
    	} 
    	
    	return "after function........... number is greater than 1000";
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
          Number n = new Number();
         System.out.println(n.convertNumberToWords(1134567));
         //System.out.println(n.convertNumberToWords(67));
      }

}
