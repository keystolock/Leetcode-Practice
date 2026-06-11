public class AddBinary {
    
    public String addBinary(String a, String b) {
        if(a.equals("0") && b.equals("0")){
            return "0";
        }
        if(a.matches("0+")){
            return b;
        }
        
        if(b.matches("0+")){
            return a;
        }
        int n = a.length(); int m = b.length();

        int max = Math.max(n,m);

        int c=0 ,sum =0;

        StringBuilder sb = new StringBuilder("");

        while(max>0 || c>0){

        int A = (int)((n>0)? a.charAt(n-1) -'0':0);

        int B = (int)((m>0)? b.charAt(m-1)-'0':0);

        sum = (A^B)^c;

        int cout = (A^B)&c |(A&B);

        sb.append((char)(sum+'0'));

        c = cout; max--; m--; n--;
        }
        return sb.reverse().toString();
    }
}

