package sort;


public class BubbleSort {

	public static void main(String[] args) {
		
		int score[] = {67, 69, 75, 88};
		
	    for(int i =0;i < score.length - 1;i++)  
        {  
            for(int j = 0;j <  score.length - 1-i;j++)// j开始等于0，  
            {  
                if(score[j] < score[j+1])  
                {  
                    int temp = score[j];  
                    score[j] = score[j+1];  
                    score[j+1] = temp;  
                }  
            }   
        } 
	    for (int i = 0; i < score.length; i++) {
			System.out.println("@"+score[i]);
		}
	    
	    
	    
	    
	    
	    for(int i =0;i < score.length - 1;i++)  
        {  
            for(int j = 0 ;j <  score.length - 1-i;j++)// j开始等于0，  
            {  
                if(score[j] > score[j+1])  
                {  
                    int temp = score[j];  
                    score[j] = score[j+1];  
                    score[j+1] = temp;  
                }  
            }   
        } 
	    for (int i = 0; i < score.length; i++) {
			System.out.println("#"+score[i]);
		}
	}
}
