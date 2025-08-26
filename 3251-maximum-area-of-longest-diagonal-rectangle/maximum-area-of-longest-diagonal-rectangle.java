class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxi=-1;
        int res=0;
        for(int i=0;i<dimensions.length;i++){            
            double dag=Math.sqrt((dimensions[i][0]*dimensions[i][0])+ (dimensions[i][1]*dimensions[i][1]));
            if(dag>maxi){
                maxi=dag;
                res=dimensions[i][0]*dimensions[i][1];
            }
            else if(dag==maxi){
                res=Math.max(res,dimensions[i][0] * dimensions[i][1]);
            }
            
        }
        return res;
    }
}