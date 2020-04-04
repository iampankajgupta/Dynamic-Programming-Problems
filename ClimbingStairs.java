

public class ClimbingStairs {
	
    public int climbStairs(int n) {
        if(n<=3) return n;
        else{
        int[]array = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
            int i = 4;
            while(i<=n){
                array[i] = array[i-1] + array[i-2];
                i++;
            }
            return array[n];      
        }
    }

	public static void main(String[] args) {
		ClimbingStairs obj = new ClimbingStairs();
		int result = obj.climbStairs(6);
		System.out.println(result);
	
	}
}
