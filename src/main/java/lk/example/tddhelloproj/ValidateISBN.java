package lk.example.tddhelloproj;

public class ValidateISBN {
    public boolean checkISBN(String isbn){
        int value = Integer.parseInt(isbn);
        System.out.println("ISBN ->"+value);
         int total=0;
         for (int i=0; i < 10; i ++)
         {
             total += isbn.charAt(i) * (10-i);
         }

        return total % 11 == 0 ;
    }
}
