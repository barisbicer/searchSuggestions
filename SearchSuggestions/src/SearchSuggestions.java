import java.util.*;

class Result {

    /*
     * Complete the 'searchSuggestions' function below.
     *
     * The function is expected to return a 2D_STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY repository
     *  2. STRING customerQuery
     */
	
	

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
    // Write your code here
   
    String s="";
    /*starting point*/
    int j=2;
    List<List<String>> totalfinding= new ArrayList<>();
    List<String> finding=null;
    for(int i = 0; i < customerQuery.length(); i++)
    {
       
       s += customerQuery.charAt(i);
     
       
       if(i>=1)
       {
     
        finding= new ArrayList<>();
        for (String search : repository){

            if(search.substring(0,j).equals(s))
              {    
                    finding.add(search);
                   
                   
              }
             j++;
        }
           
       totalfinding.add(finding);
       }
    }
   
    return totalfinding;
   
     
    }
   

}

public class SearchSuggestions {

public static void main(String[] args) {

List<String> test=Arrays.asList("istanbul","ankara","izmir","antalya","mersin","adana","izmit");
String customerQuery="izmir";
System.out.println(Result.searchSuggestions(test,customerQuery));

}

}
