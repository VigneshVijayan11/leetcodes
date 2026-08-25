class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")|| num2.equals("0")) return "0";
        int arr[]=new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                int digit1=num1.charAt(i)-'0';
                int digit2=num2.charAt(j)-'0';
                int product=digit1*digit2;
                int pos=i+j+1;
                arr[pos]+=product;
                arr[pos-1]+=arr[pos]/10;
                arr[pos]%=10;
            }
        }
        String res="";
        for(int i=0;i<arr.length;i++){
            if(res.length()==0 && arr[i]==0){
                continue;
            }
            res+=arr[i];
        }
        return res;
    }
}