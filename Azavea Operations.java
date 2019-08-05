
public class SSBool {
	
	public static int[] sum(int arr[]){
		int pos =0;
		int neg = 0;
		
		if(arr.length == 0){
			return arr;
		}
		for(int i = 0; i < arr.length; i++ ){
			if(arr[i]> 0){
				pos++;
			}
			else{
				neg+= arr[i];
			}
		}
		int arr2[] = {pos, neg};
		return arr2;
	}
	
	
public static void main(String[] args){
	int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
	
	int[] arr2 = sum(arr);
	
	for(int i =0; i <arr2.length; i ++){
		System.out.println(arr2[i]);
	}