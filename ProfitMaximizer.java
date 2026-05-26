import java.util.Arrays;




public class ProfitMaximizer {
    public static void main(String[] args) {
        //BUY(-1)
        Order[] buyOrders = new Order[4];
        buyOrders[0] = new Order(-1,4,41);
        buyOrders[1] = new Order(-1,95, 48);
        buyOrders[2] = new Order(-1,3, 43);
        buyOrders[3] = new Order(-1, 12, 38);
        int totalcalculatorsBuy = 0;

        for(int i = 0; i<4; i++){
            Order buyOrder = buyOrders[i];
            totalcalculatorsBuy += buyOrder.getQuantity();
            //in this case total calculators are 114 buy and 119 sell
        }
        

        //SELL(1)

        Order[] sellOrders = new Order[4];

        sellOrders[0] = new Order(1,5, 44);
        sellOrders[1] = new Order(1,3, 45);
        sellOrders[2] = new Order(1,100, 40);
        sellOrders[3] = new Order(1,11, 43);

        int totalcalculatorsSell = 0;
        for(int i = 0; i<4; i++){
            Order sellOrder = sellOrders[i];
            totalcalculatorsSell += sellOrder.getQuantity();
            //in this case total calculators are 114 buy and 119 sell
        }
        System.out.println("The total amount of calculators on buy: " + totalcalculatorsBuy);
        System.out.println("The total amount of calculators on selling: " + totalcalculatorsSell);

        int difference = (totalcalculatorsSell - totalcalculatorsBuy);


        //Sort the buy orders from the lowest at the first and higest price at last
        Order[] sortedBUY = Arrays.copyOf(buyOrders, buyOrders.length);

        Arrays.sort(sortedBUY);
        System.out.println("Buying Low: "+Arrays.toString(sortedBUY));
        //Sorting the sell orders
        Order[] sortedSELL = Arrays.copyOf(sellOrders, sellOrders.length);

        Arrays.sort(sortedSELL);
        System.out.println("Selling High: " + Arrays.toString(sortedSELL));
        


        //Sorting logic
        //define varibles difference is difference in total calculators
        boolean select = false; 
        //pointers
        int nextSELL = 0;
        int nextBUY = 0;
        //starting value of diff
        //makes both pointers move
        int diff = (sortedBUY[nextBUY].getQuantity()) - (sortedSELL[nextSELL].getQuantity());
        System.out.println(diff);

        for(int j = 0;j<4;j++){

            if(diff > 0){
                //There more buy calculators then sell, hence go to next sell order
                nextSELL++;
                //SELL++
                diff = diff - (sortedSELL[nextSELL].getQuantity());
            }else if(diff == 0){
                select = true;
                //profit=sell - buy
                // profit = (sortedSELL[nextSELL].getAmount() - (sortedBUY[nextBUY].getAmount()));
                nextBUY++;
                nextSELL++;
                diff = (sortedBUY[nextBUY].getQuantity()) - (sortedSELL[nextSELL].getQuantity());
  
            }else{
                //There less buy calculators then sell, hence go to next buy order
                nextBUY++;
                //BUY++
                diff = diff + (sortedBUY[nextBUY].getQuantity());

            }
                System.out.println(diff);
            if(diff == difference){
                System.out.println("The max profit has been achived at these pointers(buy, sell): " + nextBUY + " and " + nextSELL);    
            }

            

        }
 
                System.out.println("Buy Pointer: " + nextBUY);
                System.out.println("Sell Pointer: " + nextSELL);
                int sellProfit = 0;
                int buyExpense = 0;
                //mover integer creates the expense for buy and sell
                for(int mover = nextBUY; mover >=0;mover--){
                    System.out.println("moo"+ mover);
                    buyExpense += sortedBUY[mover].getAmount();
                    sellProfit += sortedSELL[mover].getAmount();
                }
                System.out.println("The expense is: " + buyExpense);
                System.out.println("The sell profit is: " + sellProfit);
                int maxProfit = sellProfit - buyExpense;

                //Yayz
                System.out.println("The maximum profit that can be made is $" + maxProfit + ".");


    }

}
