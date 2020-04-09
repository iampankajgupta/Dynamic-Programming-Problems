


public void maxProfit(int[]prices){
    
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    
    
    for(int i = 0;i<prices.length;i++){
      
      // IF THE OUR CURRENT PRICE IS LESS THEN THE MIN PRICE THEN WE BUY THE STOCK AND MARK OUR CURRENT MIN PRICE IN WHICH WE BUY THE STOCK 
      
      if(prices[i]<minPrice){
           
           minPrice = prices[i];
     
      }
      
 // IF THE CURRENT PRICE IS SUBTRACTED FROM THE PREVIOUS MIN PRICE AND IF THE VALUE IS GREATER THAN maxProfit I.E THE MAXPROFIT IS NOT PREVIOUS ONE BUT THE THIS VALUE AND SET THIS VALUE TO MAX PROFIT 
      else{
        if (prices[i]-minPrice>maxProfit){
          
            maxProfit = prices[i]-minPrice;
    
        } 
    
    
    }





}
