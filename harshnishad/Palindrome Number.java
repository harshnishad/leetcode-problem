class Solution {
    public boolean isPalindrome(int n) {
	int store = n;
        int sum =0;
        if(n<0){
            return false;
        }
       else{ 
	while(n!=0){
	    int mod = n%10;
	    sum = sum*10+mod;
	    n = n/10;
	    
	}
		if (store == sum){
            return true;
		}
        
    
		else{
		    return false;
		}
           
       }  
    }
}
