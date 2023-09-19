package com.roshan;

import java.util.Scanner;


//stock class for maintaining stocks
class Stocks
{
  int cokePrice,cokeStock,pepsiPrice,pepsiStock,sodaPrice,sodaStock;
  String []items={"Coke","Pepsi","Soda"};
  
  void setPrice(String item,int price)
  {
    switch(item)
    {
      case "Coke":
      cokePrice=price;
      break ;
      
      case "Pepsi":
      pepsiPrice=price;
      break ;
      
      case "Soda":
      sodaPrice=price;
      break ;
      
      default :
      System.out.println("setting price of invalid item");
    }
  }
  void  setStock(String item,int stock)
  {
    switch(item)
    {
      case "Coke":
      cokeStock=stock;
      break ;
      
      case "Pepsi":
      pepsiStock=stock;
      break ;
      
      case "Soda":
      sodaStock=stock;
      break ;
      
      default :
      System.out.println("setting Stock of invalid item");
    }
  }
  int getStock(String item)
  {
    switch(item)
    {
      case "Coke":
      return cokeStock;
      
      case "Pepsi":
      return pepsiStock;
      
      case "Soda":
      return sodaStock;
      
      default :
      System.out.println("getting Stock of invalid item");
      return 0;
      
    }
  }
  int getPrice(String item)
  {
    switch(item)
    {
      case "Coke":
      return cokePrice;
      
      case "Pepsi":
      return pepsiPrice;
      
      case "Soda":
      return sodaPrice;
      
      default :
      System.out.println("getting price of invalid item");
      return 0;
  }
 } 
  Stocks()
  {
    setPrice("Coke",25);
    setPrice("Pepsi",35);
    setPrice("Soda",45);
    setStock("Coke",5);
    setStock("Pepsi",5);
    setStock("Soda",5);
  }
}

//money class for maintaining money and transaction
class Money 
{
  int PENNY= 1
     ,NICKLE =5
     ,DIME =10
      ,QUARTER =25;
      
     void showMoney(int price)
   { System.out.println("Price: "+price);
     System.out.println("--------------------------");
     System.out.println("SrNo    Coin       Value");
     System.out.println("--------------------------");
     System.out.println("1       PENNY         1");
     System.out.println("2       NICKLE        5");
     System.out.println("3       DIME          10");
     System.out.println("4       QUARTER       25");
     System.out.println("--------------------------");
     System.out.println("Select coins by SrNo separated by (,):");
   }
     
     boolean transact (int price)
     { 
      
      showMoney(price);
      Scanner sc= new Scanner(System.in);
      String in=sc.nextLine();
      //reamin to calculate
      char q=',';
      int money=0 ;
      for(int i=0 ;i<in.length();i++)
      { 
         if(in.charAt(i)!=q)
           {  char t=in.charAt(i);
              if(t=='1')
              { money=money+1;}
              if(t=='2')
              { money=money+5;}
              if(t=='3')
              { money=money+10;}
              if(t=='4')
              { money=money+25;}
           }
      }
      if(money<price)
      {
        System.err.println("Price not full paid, remaining :"+(price-money));
        return false;
      }
      if(money>price)
      {
        System.out.println("extra money"+(money-price));
        int change=(money-price)/5;
        System.out.println("Change :");
        for(int i=0;i<change;i++)
        {
          System.out.println("NICKEL : 5");
        }
        change=(money-price)%5;
       
        for(int i=0;i<change;i++)
        {
          System.out.println("PENNY : 1");
        }
        return true;
      }
      return true;
     }
}

//operating class extends money for transaction and create stocks class object for stocks
class operations extends Money{
   Stocks stock=new Stocks();
   void reset()
   {
    stock.setPrice("Coke",25);
    stock.setPrice("Pepsi",35);
    stock.setPrice("Soda",45);
    stock.setStock("Coke",5);
    stock.setStock("Pepsi",5);
    stock.setStock("Soda",5);
   }
   void showMenu()
   {
        
 System.out.println("---------------------------------------");
 System.out.println("SrNo    In_Stock    Items        Price");
  System.out.println("---------------------------------------");
  System.out.println("1           "+stock.getStock("Coke")+"       Coke           "+stock.getPrice("Coke"));
  System.out.println("2           "+stock.getStock("Pepsi")+"       Pepsi          "+stock.getPrice("Pepsi"));
System.out.println("3           "+stock.getStock("Soda")+"       Soda           "+stock.getPrice("Soda"));
System.out.println("---------------------------------------");
System.out.println("Select Item by SrNo:");
   }
   
  
   boolean transactCoke()
   {  int price=stock.getPrice("Coke");
      int stockValue=stock.getStock("Coke");
      stockValue--;
      if(transact(price))
      {
       stock.setStock("Coke",stockValue);
       return true;
       }
       return false;
    }
    
    boolean transactPepsi()
   {  int price=stock.getPrice("Pepsi");
      int stockValue=stock.getStock("Pepsi");
      stockValue--;
      if(transact(price))
      {
       stock.setStock("Pepsi",stockValue);
       return true;
       }
       return false;
    }
      boolean transactSoda()
   {  int price=stock.getPrice("Soda");
      int stockValue=stock.getStock("Soda");
      stockValue--;
      if(transact(price))
      {
       stock.setStock("Soda",stockValue);
       return true;
       }
       return false;
    }
}


//main vending machine class extends operation for support operation transaction and resetting stocks
public class vendingMachine extends operations {

  public static void main(String[] args) {
  vendingMachine machine=new vendingMachine();
  System.out.println("Welcome to Vending Machine");
  
  Scanner sc=new Scanner(System.in);
 
 String in="";
  while (in.equals("exit")!=true)
  {  machine.showMenu();
     in=sc.next();
     
     switch(in.toString())
     {
       case "1":
       if(machine.transactCoke())
       {
       System.out.println("Collect your Item, Thank you!!!");
       }
       System.out.println("Enter 'exit' or Press any number to start again!!!\n");
       in=sc.next();
       break ;
       
       case "2":
       if(machine.transactPepsi())
       {
       System.out.println("Collect your Item, Thank you!!!");
       }
       System.out.println("Enter 'exit' or Press any number to start again!!!\n");
       in=sc.next();
       break;
       
       case "3":
       if(machine.transactSoda())
       {
       System.out.println("Collect your Item, Thank you!!!");
       }
       System.out.println("Enter 'exit' or Press any number to start again!!!\n");
       in=sc.next();
       break;
     
       default :
       if(in.equals("exit")!=true)
       { System.out.println("invalid response"); }
     }
  }
  
  sc.close();
  }
}
