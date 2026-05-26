public class Order implements Comparable<Order>{


    //tuple: buy or sell
    //(quantity,price)
    int quantity;
    int price;
    int ordertype = -1;
    //-1 = buy and 1 = sell
    public Order(int ordertype,int intquatity, int intprice) {

        this.quantity = intquatity;
        this.price = intprice;
        this.ordertype = ordertype;
    }

    public int getQuantity(){
        return this.quantity;
    }
    public int getPrice(){
        return this.price;
    }
    public int getOrderType(){
        return this.ordertype;
    }
    public int getAmount(){
        int amount = this.price*this.quantity;
        return amount;
    }


    public int compareTo(Order order){
        if(this.price < order.price){
            return (1*ordertype);
        }else if(this.price == order.price){
            return 0;
        }else{
            return (-1*ordertype);
        }
    }
    public String toString(){
        return "Price = " + price +
        " Quantity = " + quantity + " Order Type = " + ordertype;

    }


}
