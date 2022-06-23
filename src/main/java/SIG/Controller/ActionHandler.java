package SIG.Controller;
import SIG.Model.InvoiceHeader;
import java.awt.Component;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
  @author Nouran Ashraf
 */
public class ActionHandler implements ActionListener
{

    private Component Frame;

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        switch(e.getActionCommand())
        {
            case "New Invoice" :
                System.out.println("This is new invoice button");
                createInvoice();               
                break;
            case "Delete Invoice":  
                System.out.println("This is new Delete button");
                deleteInv();
                break;
            case "New Line" :
                System.out.println("This is new line button");
                createLine();
                break;    
            case "Delete Line" :
                System.out.println("This is delete line button");
                deleteLine();
                break;  
            case "Load File":
                 System.out.println("This is  load file");
                 loadFile();
                 break;
            case "Save File":
                 System.out.println("This is Save file");
                 saveFile();
              
                 break;

        }
       // System.out.println("Action Handling was called!");
    }


    private void deleteInv() 
    {
    }

    private void createLine() 
    {
    }

    private void deleteLine() 
    {
    }
    private void saveFile() 
    {
    }

    private void createInvoice() 
    {
    }
    private void loadFile() throws IOException 
    {
       JFileChooser chooseFile= new JFileChooser();
       try
       {    
       int result= chooseFile.showOpenDialog(null);
       if(result== JFileChooser.APPROVE_OPTION)
       { 
           File headerFile= chooseFile.getSelectedFile();
           Path pathFile= Paths.get(headerFile.getAbsolutePath());
           List<String>headerLines= Files.readAllLines(pathFile);
           System.out.println("Invoices have been read!!");
           for( String headerline: headerLines)
           {
               String[] headerParts= headerline.split(",");
               int invoiceNumber= Integer.parseInt(headerParts[0]);
               String invoiceDate= headerParts[1];
               String customerName= headerParts[2];
               
               InvoiceHeader invoiceheader= new InvoiceHeader(invoiceNumber, invoiceDate, customerName);
               
           }
           
       }
       }
        catch (IOException ex) 
       
        {
            ex.getStackTrace();
            
        }
        
    }

    

}    

