public class Pow {
    
    public double myPow(double x, int n) {

       if(n==1){
            return x;
        }

        if(n==0){
            return 1;
        }
        
        if (n < 0) {
    if (n == Integer.MIN_VALUE) {
        return 1 / (x * myPow(x, -(n + 1)));
    }
    return 1 / myPow(x, -n);
}


    
        if(n%2==0){                                
            double currPow = myPow(x,n/2);
            return currPow*currPow;
        }
        else{
            double currPow = myPow(x,n/2);
            return currPow*currPow*x;
        }
    }
}

