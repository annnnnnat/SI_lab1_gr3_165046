import java.util.*;

public class Receipt {
    protected List<Item> items;

    //constructor
    public Receipt(List<Item> items) {
        this.items = items;
    }

    //getters and setters
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

     // додавање на item
    public void addItem(Item i){
        items.add(i);
    }

    // бришење на item
    public void removeItem(Item i){
        items.remove(i);
    }

    //вкупен износ на фискалната сметка
    public double sumPrice(List<Item> li){
        double sum=0;
        for(int i=0;i<li.size();i++){
            sum+= li.get(i).price;
        }
        return sum;
    }

    //вкупен поврат на ддв од таа фискална
    public double sumDDVReturn(List<Item> li){
            double res=0;
            for(int i=0;i<li.size();i++){
                res += li.get(i).getTaxReturn();
            }
            return res;
    }
}
