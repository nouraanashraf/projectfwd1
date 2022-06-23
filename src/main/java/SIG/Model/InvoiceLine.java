package SIG.Model;

/**
 @author Nouran Ashraf
 */
public class InvoiceLine 
{
    private int num;
    private int count;
    private String itemName;
    private Double itemPrice;
    private InvoiceHeader header;

    public InvoiceLine(int num, int count, String itemName, Double itemPrice) {
        this.count = count;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.num=num;
    }

    public InvoiceLine(int num, int count, String itemName, Double itemPrice, InvoiceHeader header) {
        this.num = num;
        this.count = count;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.header = header;
    }
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setItemPrice(Double itemPrice) 
    {
        this.itemPrice = itemPrice;
    }


    public void setCount(int count) 
    {
        this.count = count;
    }

    public void setItemName(String itemName) 
    {
        this.itemName = itemName;
    }

    

    public int getCount() {
        return count;
    }

    public String getItemName() {
        return itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }
    
    
    
}
