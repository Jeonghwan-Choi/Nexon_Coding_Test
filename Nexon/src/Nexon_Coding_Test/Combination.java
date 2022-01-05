package Nexon_Coding_Test;

public class Combination {

	public static void main(String[] args) {
		
		int n = 3;
		int[] arr = new int[n] ;
		int r = arr.length;
		long k = 5;
		int[] answer = {};
		
 		
		for(int i=1; i<=n; i++) {
			arr[i-1] = i;
			
		}
		
		

		
		permutation(arr, new int[r], new boolean[arr.length], 0, r, k);
		
		System.out.println(answer[0]);
	}

	
	
    public static int[] permutation(int[] arr, int[] out, boolean[] visited, int depth, int r, long k){
       
    	int[] answer = {1,2,3};
    	
    	if(depth == r){
            for(int num: out) System.out.print(num);
            System.out.println();
            
        }
       
        for(int i=0; i<arr.length; i++){
        	
            if(!visited[i]){
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, out, visited, depth+1, r,k);
                visited[i] = false;
            }
        }
        
        return answer;
    }


}
