class Solution {
    public int[] plusOne(int[] digits) {
        int flag=0;
        int len=digits.length;
        int[] digit=new int[len+1];
        if(digits[len-1]<9){
            digits[len-1]=digits[len-1]+1;
        }
        else{
            int count=0;
            for(int i=(len-1);i>=0;i--){
                if(digits[i]==9){
                    count++;
                }
                else{
                    break;
                }
            }
            if(len==count){
                flag=2;
                digit[0]=1;
                for(int j=1;j<=len;j++){
                    digit[j]=0;
                }
            }
            else{
                for(int j=len-1;j>=0;j--){
                    if(digits[j]==9){
                        digits[j]=0;
                    }
                    else{
                        digits[j]=digits[j]+1;
                        break;
                    }
                }
            }
        }
        if(flag==2){
            return digit;
        }
        else{
            return digits;
        }
    }
}
