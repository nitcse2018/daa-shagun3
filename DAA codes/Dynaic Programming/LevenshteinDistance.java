package Dynamic_Programming;

public class LevenshteinDistance {
	
	       public static int minimum(int a, int b, int c)
	       {
	            return Integer.min(a, Integer.min(b, c));
	       }
	       public static int dist(String X, int m, String Y, int n)
	       {
	            if(m == 0){
	               return n;
	            }
	            if(n == 0){
	               return m;
	            }
	            int cost = (X.charAt(m - 1) == Y.charAt(n - 1)) ? 0: 1;
	            return minimum(dist(X, m - 1, Y, n) + 1,
	                     dist(X, m, Y, n - 1) + 1,
	                     dist(X, m - 1, Y, n - 1) + cost);
	        }
	        public static void main(String[] args)
	        {
	            String X = "kitten", Y = "sitting";
	            System.out.println("The Levenshtein Distance is "+
	                           dist(X, X.length(), Y, Y.length()));
	        }
}


