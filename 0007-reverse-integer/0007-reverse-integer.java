class Solution {
    public int reverse(int x) {
        boolean negativeFlag = false ;
        if(x<0){
            negativeFlag = true;
            x = -x;
        }
        int prevRevNum = 0; int RevNum= 0;
        int curr = 0 ;
        while(x!=0){
            curr = x%10;
            RevNum = RevNum*10 + curr;
            if((RevNum - curr)/10 != prevRevNum)
                return 0;
            prevRevNum = RevNum;
            x = x / 10;
        }
        return (negativeFlag)? -RevNum:RevNum;
    }
}