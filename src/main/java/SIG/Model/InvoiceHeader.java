package SIG.Model;

import java.util.ArrayList;
import java.util.Date;

/**
  @author Nouran Ashraf
 */
public class InvoiceHeader 
{
   private int num;
   private String customer;
   private String date;
   private ArrayList<InvoiceLine> lines;

    public InvoiceHeader(int num, String date, String customer) 
    {
        this.num = num;
        this.customer = customer;
        this.date = date;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
    

    public int getNum() {
        return num;
    }

    public String getCustomer() {
        return customer;
    }

    public String getDate() {
        return date;
    }

    public ArrayList<InvoiceLine> getLines() {
        return lines;
    }

    
   
   
   
   
   
}
