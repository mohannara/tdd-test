package lk.example.tddhelloproj;

public class ValidateISBN {
    public boolean checkISBN(String isbn){
        int total=0;
         for (int i=0; i < 10; i ++)
         {
             if (!(Character.isDigit(isbn.charAt(i))) ){
                 if(i==9 && isbn.charAt(i) == 'X'){
                     total += 10;
                 }else
                     throw new NumberFormatException("ISBN numbers should be numeric");
             }else {
                 total += Character.getNumericValue(isbn.charAt(i)) * (10 - i);
             }
         }
        return total % 11 == 0 ;
    }
}
