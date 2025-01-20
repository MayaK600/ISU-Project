//Name:Maya Klapauch
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Creating a variable for all the products costs and add them through the program as the user adds or removes items from their cart
        int totalCost=0;
        // creating array lists for the quantity of each item sold in the shop in each category
        ArrayList<Integer> itemAmounts=new ArrayList<Integer>();
        itemAmounts.add(0);
        itemAmounts.add(0);
        itemAmounts.add(0);
        itemAmounts.add(0);
        itemAmounts.add(0);
        itemAmounts.add(0);
        itemAmounts.add(0);
        itemAmounts.add(0);
        itemAmounts.add(0);
        System.out.println("Welcome to Costos!!");
        String keepShopping=""; // To make sure the program doesn't stop running after only adding one item to the cart
        while (!keepShopping.equals("no")){
            System.out.println("Here we sell: clothes, electronics and books \nPlease enter category with which you would like to continue");
            String category= sc.nextLine().toLowerCase();
            // To make sure that the user has a valid input
        while (!category.equals("clothes")&&!category.equals("electronics")&&!category.equals("books")) {
            System.out.println("invalid input, please check spelling and include the 's' at the end, please insert again");
            category = sc.nextLine();
        }
        //switch case to determine which category the user chose
        switch(category) {
            case "clothes":
                System.out.println("You have chosen clothes here are the following options:");
                System.out.println(" Names:            Hoodies                 T-shirts              Pants ");
                System.out.println(" Price:            $30                     $18                   $27 ");
                System.out.println(" Availability:     1                       5                     7");
                String stay = ""; // To make sure that the user can reselect the category
                while (!stay.equals("no")) {
                    System.out.println("Enter item you want to add to your cart");
                    String item = sc.nextLine().toLowerCase();
                    //while loop so the input is valid
                    while (!item.equals("hoodies") && !item.equals("t-shirts") && !item.equals("pants")) {
                        System.out.println("invalid input, please check spelling, please insert again");
                        item = sc.nextLine();
                    }
                    if (item.equals("hoodies")) {
                        System.out.println("How many hoodies would you like to add (max is 1)\nTo enter none, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        // To make sure that the input of the user is value, and it is not going over the max nor going under 0
                        while (amount + itemAmounts.get(0)> 1 || amount <= -1) {
                            System.out.println("We do not have that many in stalk, reminder max is 1\nPlease enter amount again");
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        itemAmounts.set(0, amount);
                        //changing the amount left of each item based on how much was already added to cart
                        totalCost=totalCost+(amount*30);
                        //to determine total item worth in the cart
                        System.out.println("You added " + amount + " hoodies to your cart, total cost is: " + totalCost);
                    }
                    //same thing as clothes but for t-shirts
                    else if (item.equals("t-shirts")) {
                        System.out.println("How many t-shirts would you like to add (max is 5)\nTo add none, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount +itemAmounts.get(1)> 5 || amount <= -1) {
                            System.out.println("We do not have that many in stalk, reminder max is 5\nPlease enter amount again");
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        itemAmounts.set(1, amount);
                        totalCost=totalCost+(amount*18);
                        System.out.println("You added " + amount + " t-shirts to your cart, total cost is: " + totalCost);
                    }
                    // same thing as t-shirts and hoodies but with pants as they are the only other possible option
                    else {
                        System.out.println("How many pants would you like to add (max is 7)\nTo enter none, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount +itemAmounts.get(2) > 7 || amount <= -1) {
                            System.out.println("We do not have that many in stalk, reminder the max is 7\nPlease enter new amount");
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        itemAmounts.set(2,amount);
                        totalCost=totalCost+(amount*27);
                        System.out.println("You added " + amount + " pants to your cart, total cost is: " + totalCost);
                    }
                    System.out.println("would you like to add another item from clothes? (yes or no)");
                    stay = sc.nextLine().toLowerCase();
                }
                break;
                //same as clothes but with electronics
            case "electronics":
                System.out.println("You have chosen electronics here are the following options:");
                System.out.println(" Names:            Ipad                    Laptop                Phone ");
                System.out.println(" Price:            $700                    $1010                 $350 ");
                System.out.println(" Availability:     10                      3                     9");
                String stay1 = "";
                while (!stay1.equals("no")) {
                    System.out.println("Enter item you want to add to your cart");
                    String item = sc.nextLine().toLowerCase();
                    while (!item.equals("ipad") && !item.equals("laptop") && !item.equals("phone")) {
                        System.out.println("Invalid input, please check spelling, please insert again");
                        item = sc.nextLine();
                    }
                    if (item.equals("ipad")) {
                        System.out.println("How many Ipads would you like to add ( max is 10)\nTo add none, please enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount +itemAmounts.get(3) > 10 || amount <= -1) {
                            System.out.println("we do not have that many in stalk, please select amount again, reminder you max is 10");
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        itemAmounts.set(3,amount);
                        totalCost=totalCost+ (amount * 700);
                        System.out.println("You added " + amount + " Ipads to your cart, total cost is: " + totalCost);
                    }
                    else if (item.equals("laptop")) {
                        System.out.println("How many laptops would you like to add ( max is 3)\nTo add none, please enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount + itemAmounts.get(4)>  3 || amount <= -1) {
                            System.out.println("we do not have that many in stalk, please select amount again, reminder you max is 3");
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        itemAmounts.set(4,amount);
                        totalCost=totalCost+(amount * 1010);
                        System.out.println("You added " + amount + " laptops to your cart, total cost is: " + totalCost);
                    }
                    else {
                        System.out.println("How many phones would you like to add ( max is 9)\nTo add none, please enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount + itemAmounts.get(5)>  9 || amount <= -1) {
                            System.out.println("we do not have that many in stalk, please select amount again, reminder you max is 9");
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        itemAmounts.set(5, amount);
                        totalCost+=(amount * 350);
                        System.out.println("You added " + amount + " phones to your cart, total cost is: " + totalCost);
                    }
                    System.out.println("would you like to add another item from electronics? (yes or no)");
                    stay1 = sc.nextLine().toLowerCase();
                }
                break;
            // same as electronics and clothes but with books
            case "books":
                System.out.println("You have chosen Books here are the following Series:");
                System.out.println(" Names:            Harry Potter           Percy Jackson       The Inheritance Games ");
                System.out.println(" Price:            $50                    $30                 $100 ");
                System.out.println(" Availability:     2                      6                   4");
                String stay2 = "";
                while (!stay2.equals("no")) {
                    System.out.println("Enter item you want to add to your cart");
                    String item = sc.nextLine().toLowerCase();
                    while (!item.equals("harry potter") && !item.equals("percy jackson") && !item.equals("the inheritance games")) {
                        System.out.println("invalid input, please check spelling, please insert again");
                        item = sc.nextLine().toLowerCase();
                    }
                    if (item.equals("harry potter")) {
                        System.out.println("How many would you like to add (max is 2)\nTo add none, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount + itemAmounts.get(6)> 2 || amount <= -1) {
                            System.out.println("we do not have that many in stalk, please select amount again, reminder you max is 2");
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        itemAmounts.set(6, amount);
                        totalCost+=(amount * 50);
                        System.out.println("You added " + amount + " \"Harry Potter\" copies to your cart, total cost is: " + totalCost);
                    }
                    else if (item.equals("percy jackson")) {
                        System.out.println("How many would you like to add (max is 6)\nTo add none, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount +itemAmounts.get(7)  > 6|| amount <= -1) {
                            System.out.println("we do not have that many in stalk, please select amount again, reminder you max is 6");
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        itemAmounts.set(7, amount);
                        totalCost+= (amount * 30);
                        System.out.println("You added " + amount + " \"Percy Jackson\" copies to your cart, total cost is: " + totalCost);
                    }
                    else {
                        System.out.println("How many would you like to add (max is 4)\nTo add none, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount + itemAmounts.get(8)> 4 || amount <= -1) {
                            System.out.println("we do not have that many in stalk, please select amount again, reminder you max is 4");
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        itemAmounts.set(8,amount);
                        totalCost+=(amount * 100);
                        System.out.println("You added " + amount + " \"The Inheritance Game\" copies to your cart, total cost is: " + totalCost);
                    }
                    System.out.println("would you like to add another item from books? (yes or no)");
                    stay2 = sc.nextLine().toLowerCase();
                }
                break;
        }
            // Allowing user to shop in another category before viewing cart
        System.out.println("would you like to keep shopping in other categories, (yes or no)");
        keepShopping=sc.nextLine();
        while (!keepShopping.equals("yes") && !keepShopping.equals("no")){
            System.out.println("invalid answer, please enter again");
            keepShopping=sc.nextLine();
        }
        }
        // The breakdown of the cart
        System.out.println("Here is Your cart: ");
        for (int i=0;i<=8;i++) {
            if (itemAmounts.get(i) > 0) {
                if (i == 0)
                    System.out.println("There are " + itemAmounts.get(0) + " hoodies");
                else if (i == 1)
                    System.out.println("There are " + itemAmounts.get(1) + " t-shirts");
                else if (i == 2)
                    System.out.println("There are " + itemAmounts.get(2) + " pants");
                else if (i == 3)
                    System.out.println("There are " + itemAmounts.get(3) + " ipads");
                else if (i == 4)
                    System.out.println("There are " + itemAmounts.get(4) + " laptops");
                else if (i == 5)
                    System.out.println("There are " + itemAmounts.get(5) + " phones ");
                else if (i == 6)
                    System.out.println("There are " + itemAmounts.get(6) + " \"harry Potter\" copies ");
                else if (i == 7)
                    System.out.println("There are " + itemAmounts.get(7) + " \"Percy Jackson\" copies");
                else
                    System.out.println("There are " + itemAmounts.get(8) + " \"The inheritance Games\" copies ");
            }
        }
        System.out.println("your cart at the moment is worth " + totalCost);
        //Allowing the user to change their cart
        System.out.println("would you like to change anything? Note: if you enter no, your order will be confirmed");
        if (sc.nextLine().equals("yes")){
            String stay=""; //To allow user to change more than one item in the cart
            while (!stay.equals("no")) {
                System.out.println("which item would you like to change? ");
                String change = sc.nextLine().toLowerCase();
                while (!change.equals("hoodies") && !change.equals("t-shirts") && !change.equals("pants") && !change.equals("ipads") && !change.equals("laptops") && !change.equals("phones") && !change.equals("harry potter") && !change.equals("percy jackson") && !change.equals("the inheritance games")) {
                    System.out.println("invalid input, please check for correct spelling (do not forget to add an 's' to the end)");
                    change=sc.nextLine().toLowerCase();
                } //To make sure that the input is valid and the program can read it
                switch(change) {
                    case "hoodies":
                        System.out.println("You currently have: " + (itemAmounts.get(0)) + " hoodie(s). Currently we have 1 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        // To make sure that the user does not add more than available to cart nor less than zero
                        while ((itemAmounts.get(0) + amount > 1) || ((itemAmounts.get(0) + amount) < 0)) {
                            if (itemAmounts.get(0) + amount > 1){
                                System.out.println("we do not have that many in stock, please enter again");
                                amount=sc.nextInt();
                                sc.nextLine();
                            }
                            else {
                                System.out.println("Please ensure the amount does not go below 0, and enter again");
                                amount = sc.nextInt();
                                sc.nextLine();
                            }
                        }
                        //To change the amount of items in the cart
                        itemAmounts.set(0, itemAmounts.get(0) + amount);
                        //To add to the cost (if it is negative than it will remove from the total cost)
                        totalCost=totalCost+(amount*30);
                        System.out.println("You have updated the hoodie(s) to a quantity of: " + (itemAmounts.get(0))+ "\nTotal Cost is "+totalCost);
                        break;
                        //Same thing to t-shirts
                    case "t-shirts":
                        System.out.println("You currently have: " + (itemAmounts.get(1)) + " t-shirt(s). Currently we have 5 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount1 = sc.nextInt();
                        sc.nextLine();
                        while ((itemAmounts.get(1) + amount1 > 5) || ((itemAmounts.get(1) + amount1) < 0)) {
                            if (itemAmounts.get(1) + amount1 > 5){
                                System.out.println("we do not have that many in stock, please enter again");
                                amount1=sc.nextInt();
                                sc.nextLine();
                            }
                            else {
                                System.out.println("Please ensure the amount does not go below 0, and enter again");
                                amount1 = sc.nextInt();
                                sc.nextLine();
                            }
                        }
                        itemAmounts.set(1, itemAmounts.get(1) + amount1);
                        totalCost=totalCost+(amount1*18);
                        System.out.println("You have updated the t-shirt(s) to a quantity of: " + (itemAmounts.get(1))+ "\nTotal Cost is "+totalCost);
                        break;
                    case "pants":
                        System.out.println("You currently have: " + (itemAmounts.get(2)) + " pants. Currently we have 7 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount2 = sc.nextInt();
                        sc.nextLine();
                        while ((itemAmounts.get(2) + amount2 > 7) || ((itemAmounts.get(2) + amount2) < 0)) {
                            if (itemAmounts.get(2) + amount2 > 7){
                                System.out.println("we do not have that many in stock, please enter again");
                                amount2=sc.nextInt();
                                sc.nextLine();
                            }
                            else {
                                System.out.println("Please ensure the amount does not go below 0, and enter again");
                                amount2 = sc.nextInt();
                                sc.nextLine();
                            }
                        }
                        itemAmounts.set(2, itemAmounts.get(2) + amount2);
                        totalCost=totalCost+(amount2*27);
                        System.out.println("You have updated the pants to a quantity of: " + (itemAmounts.get(2))+ "\nTotal Cost is "+totalCost);
                        break;
                    case "ipads":
                        System.out.println("You currently have: " + (itemAmounts.get(3)) + " ipads. Currently we have 10 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount3 = sc.nextInt();
                        sc.nextLine();
                        while ((itemAmounts.get(3) + amount3 > 10) || ((itemAmounts.get(3) + amount3) < 0)) {
                            if (itemAmounts.get(3) + amount3 > 10){
                                System.out.println("we do not have that many in stock, please enter again");
                                amount3=sc.nextInt();
                                sc.nextLine();
                            }
                            else {
                                System.out.println("Please ensure the amount does not go below 0, and enter again");
                                amount3 = sc.nextInt();
                                sc.nextLine();
                            }
                        }
                        itemAmounts.set(3, itemAmounts.get(3) + amount3);
                        totalCost=totalCost+(amount3*700);
                        System.out.println("You have updated the ipads to a quantity of: " + (itemAmounts.get(3))+ "\nTotal Cost is "+totalCost);
                        break;
                    case "laptops":
                        System.out.println("You currently have: " + (itemAmounts.get(4)) + " laptops. Currently we have 3 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount4 = sc.nextInt();
                        sc.nextLine();
                        while ((itemAmounts.get(4) + amount4 > 3) || ((itemAmounts.get(4) + amount4) < 0)) {
                            if (itemAmounts.get(4) + amount4 > 3){
                                System.out.println("we do not have that many in stock, please enter again");
                                amount4=sc.nextInt();
                                sc.nextLine();
                            }
                            else {
                                System.out.println("Please ensure the amount does not go below 0, and enter again");
                                amount4 = sc.nextInt();
                                sc.nextLine();
                            }
                        }
                        itemAmounts.set(4, itemAmounts.get(4) + amount4);
                        totalCost=totalCost+(amount4*1010);
                        System.out.println("You have updated the laptops to a quantity of: " + (itemAmounts.get(4))+ "\nTotal Cost is "+totalCost);
                        break;
                    case "phones":
                        System.out.println("You currently have: " + (itemAmounts.get(5)) + " phones. Currently we have 9 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount5 = sc.nextInt();
                        sc.nextLine();
                        while ((itemAmounts.get(5) + amount5 > 9) || ((itemAmounts.get(5) + amount5) < 0)) {
                            if (itemAmounts.get(5) + amount5 > 9){
                                System.out.println("we do not have that many in stock, please enter again");
                                amount5=sc.nextInt();
                                sc.nextLine();
                            }
                            else {
                                System.out.println("Please ensure the amount does not go below 0, and enter again");
                                amount5 = sc.nextInt();
                                sc.nextLine();
                            }
                        }
                        itemAmounts.set(5, itemAmounts.get(5) + amount5);
                        totalCost=totalCost+(amount5*350);
                        System.out.println("You have updated the phones to a quantity of: " + (itemAmounts.get(5))+ "\nTotal Cost is "+totalCost);
                        break;
                    case "harry potter":
                        System.out.println("You currently have: " + (itemAmounts.get(6)) + "\"Harry Potter\" copies. Currently we have 2 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount6 = sc.nextInt();
                        sc.nextLine();
                        while ((itemAmounts.get(6) + amount6 > 2) || ((itemAmounts.get(6) + amount6) < 0)) {
                            if (itemAmounts.get(6) + amount6 > 2){
                                System.out.println("we do not have that many in stock, please enter again");
                                amount6=sc.nextInt();
                                sc.nextLine();
                            }
                            else {
                                System.out.println("Please ensure the amount does not go below 0, and enter again");
                                amount6 = sc.nextInt();
                                sc.nextLine();
                            }
                        }
                        itemAmounts.set(6, itemAmounts.get(6) + amount6);
                        totalCost=totalCost+(amount6*50);
                        System.out.println("You have updated the \"Harry Potter\" copies to a quantity of: " + (itemAmounts.get(6))+ "\nTotal Cost is "+totalCost);
                        break;
                    case "percy jackson":
                        System.out.println("You currently have: " + (itemAmounts.get(7)) + " \"Percy Jackson\" copies. Currently we have 6 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount7 = sc.nextInt();
                        sc.nextLine();
                        while ((itemAmounts.get(7) + amount7 > 6) || ((itemAmounts.get(7) + amount7) < 0)) {
                            if (itemAmounts.get(7) + amount7 > 6){
                                System.out.println("we do not have that many in stock, please enter again");
                                amount7=sc.nextInt();
                                sc.nextLine();
                            }
                            else {
                                System.out.println("Please ensure the amount does not go below 0, and enter again");
                                amount7 = sc.nextInt();
                                sc.nextLine();
                            }
                        }
                        itemAmounts.set(7, itemAmounts.get(7) + amount7);
                        totalCost=totalCost+(amount7*30);
                        System.out.println("You have updated the \"Percy Jackson\" copies to a quantity of: " + (itemAmounts.get(7))+ "\nTotal Cost is "+totalCost);
                        break;
                    case "the inheritance games":
                        System.out.println("You currently have: " + (itemAmounts.get(8)) + " \"The Inheritance Games\" copies. Currently we have 4 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount8 = sc.nextInt();
                        sc.nextLine();
                        while ((itemAmounts.get(8) + amount8 > 4) || ((itemAmounts.get(8) + amount8) < 0)) {
                            if (itemAmounts.get(8) + amount8 > 4){
                                System.out.println("we do not have that many in stock, please enter again");
                                amount8=sc.nextInt();
                                sc.nextLine();
                            }
                            else {
                                System.out.println("Please ensure the amount does not go below 0, and enter again");
                                amount8 = sc.nextInt();
                                sc.nextLine();
                            }
                        }
                        itemAmounts.set(8, itemAmounts.get(8) + amount8);
                        totalCost=totalCost+(amount8*100);
                        System.out.println("You have updated the \"The Inheritance Games\" copies to a quantity of: " + (itemAmounts.get(8))+ "\nTotal Cost is "+totalCost);
                        break;
                }
                //Allowing user to change more items
                System.out.println("would you like to change smt else? Note: if you enter no, your order will be confirmed");
                stay=sc.nextLine().toLowerCase();
            }
            //Final cart and cost
            System.out.println("Here is Your cart: ");
            for (int i=0;i<=8;i++) {
                if (itemAmounts.get(i) > 0) {
                    if (i == 0)
                        System.out.println("There are " + itemAmounts.get(0) + " hoodies");
                    else if (i == 1)
                        System.out.println("There are " + itemAmounts.get(1) + " t-shirts");
                    else if (i == 2)
                        System.out.println("There are " + itemAmounts.get(2) + " pants");
                    else if (i == 3)
                        System.out.println("There are " + itemAmounts.get(3) + " ipads");
                    else if (i == 4)
                        System.out.println("There are " + itemAmounts.get(4) + " laptops");
                    else if (i == 5)
                        System.out.println("There are " + itemAmounts.get(5) + " phones ");
                    else if (i == 6)
                        System.out.println("There are " + itemAmounts.get(6) + " \"harry Potter\" copies ");
                    else if (i == 7)
                        System.out.println("There are " + itemAmounts.get(7) + " \"Percy Jackson\" copies");
                    else
                        System.out.println("There are " + itemAmounts.get(8) + " \"The inheritance Games\" copies ");
                }
            }
            System.out.println("your cart at the moment is worth " + totalCost);
            System.out.println("would you like to remove anything? ");
            String answer=sc.nextLine().toLowerCase();
            while (!answer.equals("yes") && !answer.equals("no")){
                System.out.println("Please check spelling and enter again");
                answer=sc.nextLine().toLowerCase();
            }
            if (answer.equals ("yes")){
                String stay1="";
                while (!stay1.equals("no")) {
                    System.out.println("which item would you like to remove from cart? ");
                    String remove = sc.nextLine().toLowerCase();
                    while (!remove.equals("hoodies") && !remove.equals("t-shirts") && !remove.equals("pants") && !remove.equals("ipads") && !remove.equals("laptops") && !remove.equals("phones") && !remove.equals("harry potter") && !remove.equals("percy jackson") && !remove.equals("the inheritance games")) {
                        System.out.println("invalid input, please check for correct spelling (do not forget to add an 's' to the end )");
                        remove = sc.nextLine().toLowerCase();
                    } //To make sure that the input is valid and the program can read it
                    if (remove.equals("hoodies")){
                        System.out.println(itemAmounts.get(0) + " hoodies were removed");
                        totalCost-=(itemAmounts.get(0)*30);
                        itemAmounts.set(0,0);
                        System.out.println("Updated cart is now worth: " + totalCost);
                    }
                   else  if (remove.equals("t-shirts")){
                        System.out.println(itemAmounts.get(1) + " t-shirts were removed");
                        totalCost-=(itemAmounts.get(1)*18);
                        itemAmounts.set(1,0);
                        System.out.println("Updated cart is now worth: " + totalCost);
                    }
                    else if (remove.equals("pants")){
                        System.out.println(itemAmounts.get(2) + " pants were removed");
                        totalCost-=(itemAmounts.get(2)*27);
                        itemAmounts.set(2,0);
                        System.out.println("Updated cart is now worth: " + totalCost);
                    }
                    else if (remove.equals("ipads")){
                        System.out.println(itemAmounts.get(3) + " ipads were removed");
                        totalCost-=(itemAmounts.get(3)*700);
                        itemAmounts.set(3,0);
                        System.out.println("Updated cart is now worth: " + totalCost);
                    }
                    else if (remove.equals("laptops")){
                        System.out.println(itemAmounts.get(4) + " laptops were removed");
                        totalCost-=(itemAmounts.get(4)*1010);
                        itemAmounts.set(4,0);
                        System.out.println("Updated cart is now worth: " + totalCost);
                    }
                    else if (remove.equals("phones")){
                        System.out.println(itemAmounts.get(5) + " phones were removed");
                        totalCost-=(itemAmounts.get(5)*350);
                        itemAmounts.set(5,0);
                        System.out.println("Updated cart is now worth: " + totalCost);
                    }
                    else if (remove.equals("harry potter")){
                        System.out.println(itemAmounts.get(6) + " \"Harry Potter\" copies  were removed");
                        totalCost-=(itemAmounts.get(6)*50);
                        itemAmounts.set(6,0);
                        System.out.println("Updated cart is now worth: " + totalCost);
                    }
                    else if (remove.equals("percy jackson")){
                        System.out.println(itemAmounts.get(7) + " \"Percy Jackson\" copies were removed");
                        totalCost-=(itemAmounts.get(7)*30);
                        itemAmounts.set(7,0);
                        System.out.println("Updated cart is now worth: " + totalCost);
                    }
                    else{
                        System.out.println(itemAmounts.get(8) + " \"The Inheritance Games\" copies were removed");
                        totalCost-=(itemAmounts.get(8)*100);
                        itemAmounts.set(8,0);
                        System.out.println("Updated cart is now worth: " + totalCost);

                    }
                    System.out.println("would you like to remove another item?");
                    stay1=sc.nextLine().toLowerCase();
                    while (!stay1.equals("yes") && !stay1.equals("no")){
                        System.out.println("please check spelling and enter again");
                        stay1=sc.nextLine().toLowerCase();
                    }
                }
                System.out.println("Here is Your cart: ");
                for (int i=0;i<=8;i++) {
                    if (itemAmounts.get(i) > 0) {
                        if (i == 0)
                            System.out.println("There are " + itemAmounts.get(0) + " hoodies");
                        else if (i == 1)
                            System.out.println("There are " + itemAmounts.get(1) + " t-shirts");
                        else if (i == 2)
                            System.out.println("There are " + itemAmounts.get(2) + " pants");
                        else if (i == 3)
                            System.out.println("There are " + itemAmounts.get(3) + " ipads");
                        else if (i == 4)
                            System.out.println("There are " + itemAmounts.get(4) + " laptops");
                        else if (i == 5)
                            System.out.println("There are " + itemAmounts.get(5) + " phones ");
                        else if (i == 6)
                            System.out.println("There are " + itemAmounts.get(6) + " \"harry Potter\" copies ");
                        else if (i == 7)
                            System.out.println("There are " + itemAmounts.get(7) + " \"Percy Jackson\" copies");
                        else
                            System.out.println("There are " + itemAmounts.get(8) + " \"The inheritance Games\" copies ");
                    }
                }
                System.out.println("your cart at the moment is worth " + totalCost);
            }
        }
        System.out.println("Thank you for shopping at Costos!");
        //Allowing you to log in as admin
        System.out.println("would you like to log in as admin?");
        if (sc.nextLine().equals ("yes") || sc.nextLine().equals ("Yes") ) {
            System.out.println("Hello admin, please enter password to continue (pw5dhw67)");
            String password = sc.nextLine();
            // Ensuring that the password that has been answered is correct
            while (!password.equals("pw5dhw67")) {
                System.out.println("Incorrect password please try again");
                password = sc.nextLine();
            }
            //Creating an array for all the unshipped items and changing them later
           String[] shipping={"Not shipped","Not shipped","Not shipped","Not shipped","Not shipped","Not shipped","Not shipped","Not shipped","Not shipped"};
            System.out.println("Welcome, here is the following list of the items that need to be shipped");
            for (int i=0;i<=8;i++) {
                if (itemAmounts.get(i) > 0) {
                    //Allowing the admit to see which items need to be shipped and how many
                    if (i== 0)
                        System.out.println("There are " + itemAmounts.get(0) + " hoodies ready to ship");
                    else if (i == 1)
                        System.out.println("There are " + itemAmounts.get(1) + " t-shirts ready to ship");
                    else if (i== 2)
                        System.out.println("There are " + itemAmounts.get(2) + " pants ready to ship");
                    else if (i== 3)
                        System.out.println("There are " + itemAmounts.get(3) + " ipads ready to ship");
                    else if (i== 4)
                        System.out.println("There are " + itemAmounts.get(4) + " laptops ready to ship");
                    else if (i== 5)
                        System.out.println("There are " + itemAmounts.get(5) + " phones ready to ship");
                    else if (i== 6)
                        System.out.println("There are " + itemAmounts.get(6) + " \"harry Potter\" copies ready to ship");
                    else if (i== 7)
                        System.out.println("There are " + itemAmounts.get(7) + " \"Percy Jackson\" copies ready to ship");
                    else
                        System.out.println("There are " + itemAmounts.get(8) + " \"The inheritance Games\" copies ready to ship");
                }
            }
            //Asking admin which one they want to ship and then changing the status of the shipment
            for (int item:itemAmounts){
                if (item > 0) {
                    int index = itemAmounts.indexOf(item);
                    if (index==0){
                        //If hoodies fit the criteria, the program will ask if they want to hoodies to be shipped.
                        System.out.println("Would you like to ship the hoodies?");
                        String answer=sc.nextLine().toLowerCase();
                        //Making sure that the input is valid
                        while (!answer.equals("yes") && !answer.equals("no")){
                            System.out.println("invalid input please enter again");
                            answer=sc.nextLine().toLowerCase();
                        }
                        //If the user does decide to ship it the program will change the shipping status
                        if (answer.equals ("yes")){
                            System.out.println(itemAmounts.get(0) + " hoodies were shipped");
                            shipping[0]="Shipped";
                        }
                    }
                    //Same thing as the first one
                    if (index==1){
                        System.out.println("Would you like to ship the t-shirts?");
                        String answer=sc.nextLine().toLowerCase();
                        while (!answer.equals("yes") && !answer.equals("no")){
                            System.out.println("invalid input please enter again");
                            answer=sc.nextLine().toLowerCase();
                        }
                        if (answer.equals ("yes")){
                            System.out.println(itemAmounts.get(1) + " t-shirts were shipped");
                            shipping[1]="Shipped";
                        }
                    }
                    if (index==2){
                        System.out.println("Would you like to ship the pants?");
                        String answer=sc.nextLine().toLowerCase();
                        while (!answer.equals("yes") && !answer.equals("no")){
                            System.out.println("invalid input please enter again");
                            answer=sc.nextLine().toLowerCase();
                        }
                        if (answer.equals ("yes")){
                            System.out.println(itemAmounts.get(2) + " pants were shipped");
                            shipping[2]="Shipped";
                        }
                    }
                    if (index==3){
                        System.out.println("Would you like to ship the ipads?");
                        String answer=sc.nextLine().toLowerCase();
                        while (!answer.equals("yes") && !answer.equals("no")){
                            System.out.println("invalid input please enter again");
                            answer=sc.nextLine().toLowerCase();
                        }
                        if (answer.equals ("yes")){
                            System.out.println(itemAmounts.get(3) + " ipads were shipped");
                            shipping[3]="Shipped";
                        }
                    }
                    if (index==4){
                        System.out.println("Would you like to ship the laptops?");
                        String answer=sc.nextLine().toLowerCase();
                        while (!answer.equals("yes") && !answer.equals("no")){
                            System.out.println("invalid input please enter again");
                            answer=sc.nextLine().toLowerCase();
                        }
                        if (answer.equals ("yes")){
                            System.out.println(itemAmounts.get(4) + " laptops were shipped");
                            shipping[4]="Shipped";
                        }
                    }
                    if (index==5){
                        System.out.println("Would you like to ship the phones?");
                        String answer=sc.nextLine().toLowerCase();
                        while (!answer.equals("yes") && !answer.equals("no")){
                            System.out.println("invalid input please enter again");
                            answer=sc.nextLine().toLowerCase();
                        }
                        if (answer.equals ("yes")){
                            System.out.println(itemAmounts.get(5) + " phones were shipped");
                            shipping[5]="Shipped";
                        }
                    }
                    if (index==6){
                        System.out.println("Would you like to ship the \"Harry Potter\" copies?");
                        String answer=sc.nextLine().toLowerCase();
                        while (!answer.equals("yes") && !answer.equals("no")){
                            System.out.println("invalid input please enter again");
                            answer=sc.nextLine().toLowerCase();
                        }
                        if (answer.equals ("yes")){
                            System.out.println(itemAmounts.get(6) + " \"Harry Potter\" copies were shipped");
                            shipping[6]="Shipped";
                        }
                    }
                    if (index==7){
                        System.out.println("Would you like to ship the \"Percy Jackson\" copies?");
                        String answer=sc.nextLine().toLowerCase();
                        while (!answer.equals("yes") && !answer.equals("no")){
                            System.out.println("invalid input please enter again");
                            answer=sc.nextLine().toLowerCase();
                        }
                        if (answer.equals ("yes")){
                            System.out.println(itemAmounts.get(7) + " \"Percy Jackson\" copies were shipped");
                            shipping[7]="Shipped";
                        }
                    }
                    if (index==8){
                        System.out.println("Would you like to ship the \"The Inheritance Games\" copies?");
                        String answer=sc.nextLine().toLowerCase();
                        while (!answer.equals("yes") && !answer.equals("no")){
                            System.out.println("invalid input please enter again");
                            answer=sc.nextLine().toLowerCase();
                        }
                        if (answer.equals ("yes")){
                            System.out.println(itemAmounts.get(8) + " \"The Inheritance Games\" copies were shipped");
                            shipping[8]="Shipped";
                        }
                    }
                }
            }
            //Finally allowing the admin to see all the final changes made to the shipping
            for (int i=0;i<=8;i++) {
                if (itemAmounts.get(i)>0) {
                    //Allowing the admit to see which items were shipped
                    if (i == 0)
                        System.out.println("There are " + itemAmounts.get(0) + " hoodies: "+ shipping[0]);
                    else if (i== 1)
                        System.out.println("There are " + itemAmounts.get(1) + " t-shirts: " + shipping[1]);
                    else if (i== 2)
                        System.out.println("There are " + itemAmounts.get(2) + " pants: "+ shipping[2]);
                    else if (i== 3)
                        System.out.println("There are " + itemAmounts.get(3) + " ipads: " + shipping[3]);
                    else if (i== 4)
                        System.out.println("There are " + itemAmounts.get(4) + " laptops: " + shipping[4]);
                    else if (i== 5)
                        System.out.println("There are " + itemAmounts.get(5) + " phones: " +shipping[5]);
                    else if (i== 6)
                        System.out.println("There are " + itemAmounts.get(6) + " \"harry Potter\" copies: " +shipping[6]);
                    else if (i== 7)
                        System.out.println("There are " + itemAmounts.get(7) + " \"Percy Jackson\" copies : " + shipping[7]);
                    else
                        System.out.println("There are " + itemAmounts.get(8) + " \"The inheritance Games\" copies: " + shipping[8]);
                }
            }
            System.out.println("Thank you for Shipping!!!! \nTill next time");
        }
    }
}