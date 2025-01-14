import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Creating an array list for all the products costs and their amount
        ArrayList<Integer> cart=new ArrayList<Integer>();
        int totalCost=0;
        // creating array lists for the quantity of each item sold in the shop in each category
        ArrayList<Integer> clothesAmounts=new ArrayList<Integer>();
        clothesAmounts.add(1);clothesAmounts.add(5);clothesAmounts.add(7);

        ArrayList<Integer> elecAmounts= new ArrayList<Integer>();
        elecAmounts.add(10);elecAmounts.add(3);elecAmounts.add(9);

        ArrayList<Integer> bookAmounts = new ArrayList<Integer>();
        bookAmounts.add(2);bookAmounts.add(6);bookAmounts.add(4);

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
                String stay = ""; // To make sure that the user has to reselect the category
                while (!stay.equals("no")) {
                    System.out.println("Enter item you want to add to your cart");
                    String item = sc.nextLine().toLowerCase();
                    //while loop so the input is valid
                    while (!item.equals("hoodies") && !item.equals("t-shirts") && !item.equals("pants")) {
                        System.out.println("invalid input, please check spelling, please insert again");
                        item = sc.nextLine();
                    }
                    if (item.equals("hoodies")) {
                        System.out.println("How many hoodies would you like to add (max is" + clothesAmounts.get(0) + ")\nTo enter none, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        // To make sure that the input of the user is value and it is not going over the max nor going under 0
                        while (amount > clothesAmounts.get(0) || amount <= -1) {
                            System.out.println("We do not have that many in stalk, reminder max is " + clothesAmounts.get(0) + "\nPlease enter amount again");
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        clothesAmounts.set(0, (clothesAmounts.get(0) - amount));
                        //changing the amount left of each item based on how much was already added to cart
                        cart.add(amount * 30);
                        //to determine total item worth in the cart
                        for (int cost : cart) {
                            totalCost += cost;
                        }
                        System.out.println("You added " + amount + " hoodies to your cart, total cost is: " + totalCost);
                        totalCost = 0; //So then the for loop from line 57 works in other ones as well
                    }
                    //same thing as clothes but for t-shirts
                    else if (item.equals("t-shirts")) {
                        System.out.println("How many t-shirts would you like to add (max is " + clothesAmounts.get(1) + ")\nTo add none, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount > clothesAmounts.get(1) || amount <= -1) {
                            System.out.println("We do not have that many in stalk, reminder max is " + clothesAmounts.get(1) + "\nPlease enter amount again");
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        clothesAmounts.set(1, (clothesAmounts.get(1) - amount));
                        cart.add(amount * 18);
                        for (int cost : cart) {
                            totalCost += cost;
                        }
                        System.out.println("You added " + amount + " t-shirts to your cart, total cost is: " + totalCost);
                        totalCost = 0;
                    }
                    // same thing as t-shirts and hoodies but with pants as they are the only other possible option
                    else {
                        System.out.println("How many pants would you like to add (max is " + clothesAmounts.get(2) + ")\nTo enter none, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount > clothesAmounts.get(2) || amount <= -1) {
                            System.out.println("We do not have that many in stalk, reminder the max is " + clothesAmounts.get(2) + "\nPlease enter new amount");
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        clothesAmounts.set(2, (clothesAmounts.get(2) - amount));
                        cart.add(amount * 27);
                        for (int cost : cart) {
                            totalCost += cost;
                        }
                        System.out.println("You added " + amount + " pants to your cart, total cost is: " + totalCost);
                        totalCost = 0;
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
                        System.out.println("How many Ipads would you like to add ( max is " + elecAmounts.get(0) + ")\nTo add none, please enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount > elecAmounts.get(0) || amount <= -1) {
                            System.out.println("we do not have that many in stalk, please select amount again, reminder you max is " + elecAmounts.get(0));
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        elecAmounts.set(0, (elecAmounts.get(0) - amount));
                        cart.add((amount * 700));
                        for (int cost : cart) {
                            totalCost += cost;
                        }
                        System.out.println("You added " + amount + " Ipads to your cart, total cost is: " + totalCost);
                        totalCost = 0;
                    }
                    else if (item.equals("laptop")) {
                        System.out.println("How many laptops would you like to add ( max is " + elecAmounts.get(1) + ")\nTo add none, please enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount > elecAmounts.get(1) || amount <= -1) {
                            System.out.println("we do not have that many in stalk, please select amount again, reminder you max is " + elecAmounts.get(1));
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        elecAmounts.set(1, (elecAmounts.get(1) - amount));
                        cart.add((amount * 1010));
                        for (int cost : cart) {
                            totalCost += cost;
                        }
                        System.out.println("You added " + amount + " laptops to your cart, total cost is: " + totalCost);
                        totalCost = 0;
                    }
                    else {
                        System.out.println("How many phones would you like to add ( max is " + elecAmounts.get(2) + ")\nTo add none, please enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount > elecAmounts.get(2) || amount <= -1) {
                            System.out.println("we do not have that many in stalk, please select amount again, reminder you max is " + elecAmounts.get(2));
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        elecAmounts.set(2, (elecAmounts.get(2) - amount));
                        cart.add((amount * 350));
                        for (int cost : cart) {
                            totalCost += cost;
                        }
                        System.out.println("You added " + amount + " phones to your cart, total cost is: " + totalCost);
                        totalCost = 0;
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
                        item = sc.nextLine();
                    }
                    if (item.equals("harry potter")) {
                        System.out.println("How many would you like to add (max is " + bookAmounts.get(0) + ")\nTo add none, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount > bookAmounts.get(0) || amount <= -1) {
                            System.out.println("we do not have that many in stalk, please select amount again, reminder you max is " + bookAmounts.get(0));
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        bookAmounts.set(0, (bookAmounts.get(0) - amount));
                        cart.add((amount * 50));
                        for (int cost : cart) {
                            totalCost += cost;
                        }
                        System.out.println("You added " + amount + " \"Harry Potter\" copies to your cart, total cost is: " + totalCost);
                        totalCost = 0;
                    }
                    else if (item.equals("percy jackson")) {
                        System.out.println("How many would you like to add (max is" + bookAmounts.get(1) + ")\nTo add none, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount > bookAmounts.get(1) || amount <= -1) {
                            System.out.println("we do not have that many in stalk, please select amount again, reminder you max is " + bookAmounts.get(1));
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        bookAmounts.set(1, (bookAmounts.get(1) - amount));
                        cart.add (amount * 30);
                        for (int cost : cart) {
                            totalCost += cost;
                        }
                        System.out.println("You added " + amount + " \"Percy Jackson\" copies to your cart, total cost is: " + totalCost);
                        totalCost = 0;
                    }
                    else {
                        System.out.println("How many would you like to add (max is" + bookAmounts.get(2) + ")\nTo add none, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while (amount > bookAmounts.get(2) || amount <= -1) {
                            System.out.println("we do not have that many in stalk, please select amount again, reminder you max is " + bookAmounts.get(2));
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        bookAmounts.set(2, (bookAmounts.get(2) - amount));
                        cart.add(amount * 100);
                        for (int cost : cart) {
                            totalCost += cost;
                        }
                        System.out.println("You added " + amount + " \"The Inheritance Game\" copies to your cart, total cost is: " + totalCost);
                        totalCost = 0;
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
        // Determining total cost of the cart
        for( int cost:cart){
            totalCost += cost;
        }
        System.out.println("Here is Your cart: ");
        System.out.println("Hoodies: " +(1-clothesAmounts.get(0)));
        System.out.println("T-shirts: " + (5-clothesAmounts.get(1)));
        System.out.println("Pants: " +(7-clothesAmounts.get(2)));
        System.out.println("Ipads: " +(10-elecAmounts.get(0)));
        System.out.println("Laptops: "+ (3-elecAmounts.get(1)));
        System.out.println("Phones: "+ (9-elecAmounts.get(2)));
        System.out.println("Harry Potter: " + (2-bookAmounts.get(0)));
        System.out.println("Percy Jackson: " + (6- bookAmounts.get(1)));
        System.out.println("The Inheritance Games: "+ (4-bookAmounts.get(2)));
        System.out.println("your cart at the moment is worth " + totalCost);
        System.out.println("would you like to change anything? Note: if you enter no, your order will be confirmed");
        if (sc.nextLine().equals("yes")){
            String stay="";
            while (!stay.equals("no")) {
                System.out.println("which item would you like to change? ");
                String change = sc.nextLine().toLowerCase();
                while (!change.equals("hoodies") && !change.equals("t-shirts") && !change.equals("pants") && !change.equals("ipads") && !change.equals("laptops") && !change.equals("phones") && !change.equals("harry potter") && !change.equals("percy jackson") && !change.equals("the inheritance games")) {
                    System.out.println("invalid input, please check for correct spelling (do not forget to add an 's' to the end");
                }
                switch(change) {
                    case "hoodies":
                        System.out.println("You currently have: " + (1 - clothesAmounts.get(0)) + " hoodie(s). Currently we have 1 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount = sc.nextInt();
                        sc.nextLine();
                        while ((1 - clothesAmounts.get(0) + amount > 1) || ((1 - clothesAmounts.get(0) + amount) < 0)) {
                            System.out.println("invalid input, please enter again");
                            amount = sc.nextInt();
                            sc.nextLine();
                        }
                        clothesAmounts.set(0, clothesAmounts.get(0) - amount);
                        System.out.println("You have updated the hoodie(s) to a quantity of: " + (1 - clothesAmounts.get(0)));
                        break;
                    case "t-shirts":
                        System.out.println("You currently have: " + (5 - clothesAmounts.get(1)) + " t-shirt(s). Currently we have 5 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount1 = sc.nextInt();
                        sc.nextLine();
                        while ((5 - clothesAmounts.get(1) + amount1 > 5) || ((5 - clothesAmounts.get(1) + amount1) < 0)) {
                            System.out.println("invalid input, please enter again");
                            amount1 = sc.nextInt();
                            sc.nextLine();
                        }
                        clothesAmounts.set(1, clothesAmounts.get(1) - amount1);
                        System.out.println("You have updated the t-shirt(s) to a quantity of: " + (5 - clothesAmounts.get(1)));
                        break;
                    case "pants":
                        System.out.println("You currently have: " + (7 - clothesAmounts.get(2)) + " pants. Currently we have 7 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount2 = sc.nextInt();
                        sc.nextLine();
                        while ((7 - clothesAmounts.get(2) + amount2 > 7) || ((7 - clothesAmounts.get(2) + amount2) < 0)) {
                            System.out.println("invalid input, please enter again");
                            amount2 = sc.nextInt();
                            sc.nextLine();
                        }
                        clothesAmounts.set(2, clothesAmounts.get(2) - amount2);
                        System.out.println("You have updated the pants to a quantity of: " + (7 - clothesAmounts.get(2)));
                        break;
                    case "ipads":
                        System.out.println("You currently have: " + (10 - elecAmounts.get(0)) + " ipads. Currently we have 10 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount3 = sc.nextInt();
                        sc.nextLine();
                        while ((10 - elecAmounts.get(0) + amount3 > 10) || ((10 - elecAmounts.get(0) + amount3) < 0)) {
                            System.out.println("invalid input, please enter again");
                            amount3 = sc.nextInt();
                            sc.nextLine();
                        }
                        elecAmounts.set(0, elecAmounts.get(0) - amount3);
                        System.out.println("You have updated the ipads to a quantity of: " + (10 - elecAmounts.get(0)));
                        break;
                    case "laptops":
                        System.out.println("You currently have: " + (3 - elecAmounts.get(1)) + " laptops. Currently we have 3 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount4 = sc.nextInt();
                        sc.nextLine();
                        while ((3 - elecAmounts.get(1) + amount4 > 3) || ((3 - elecAmounts.get(1) + amount4) < 0)) {
                            System.out.println("invalid input, please enter again");
                            amount4 = sc.nextInt();
                            sc.nextLine();
                        }
                        elecAmounts.set(1, elecAmounts.get(1) - amount4);
                        System.out.println("You have updated the laptops to a quantity of: " + (3 - elecAmounts.get(1)));
                        break;
                    case "phones":
                        System.out.println("You currently have: " + (9 - elecAmounts.get(2)) + " phones. Currently we have 9 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount5 = sc.nextInt();
                        sc.nextLine();
                        while ((9 - elecAmounts.get(2) + amount5 > 9) || ((9 - elecAmounts.get(2) + amount5) < 0)) {
                            System.out.println("invalid input, please enter again");
                            amount5 = sc.nextInt();
                            sc.nextLine();
                        }
                        elecAmounts.set(2, elecAmounts.get(2) - amount5);
                        System.out.println("You have updated the phones to a quantity of: " + (9 - elecAmounts.get(2)));
                        break;
                    case "harry potter":
                        System.out.println("You currently have: " + (2 - bookAmounts.get(0)) + "\"Harry Potter\" copies. Currently we have 2 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount6 = sc.nextInt();
                        sc.nextLine();
                        while ((2 - bookAmounts.get(0) + amount6 > 2) || ((2 - bookAmounts.get(0) + amount6) < 0)) {
                            System.out.println("invalid input, please enter again");
                            amount6 = sc.nextInt();
                            sc.nextLine();
                        }
                        bookAmounts.set(0, bookAmounts.get(0) - amount6);
                        System.out.println("You have updated the \"Harry Potter\" copies to a quantity of: " + (2 - bookAmounts.get(0)));
                        break;
                    case "percy jackson":
                        System.out.println("You currently have: " + (6 - bookAmounts.get(1)) + " \"Percy Jackson\" copies. Currently we have 6 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount7 = sc.nextInt();
                        sc.nextLine();
                        while ((6 - bookAmounts.get(1) + amount7 > 6) || ((6 - bookAmounts.get(1) + amount7) < 0)) {
                            System.out.println("invalid input, please enter again");
                            amount7 = sc.nextInt();
                            sc.nextLine();
                        }
                        bookAmounts.set(1, bookAmounts.get(1) - amount7);
                        System.out.println("You have updated the \"Percy Jackson\" copies to a quantity of: " + (2 - bookAmounts.get(1)));
                        break;
                    case "the inheritance games":
                        System.out.println("You currently have: " + (4 - bookAmounts.get(2)) + " \"The Inheritance Games\" copies. Currently we have 4 available for purchase");
                        System.out.println("If you want to add items, please enter a positive number, to subtract add a negative, to not change, enter 0");
                        int amount8 = sc.nextInt();
                        sc.nextLine();
                        while ((4 - bookAmounts.get(2) + amount8 > 4) || ((4 - bookAmounts.get(2) + amount8) < 0)) {
                            System.out.println("invalid input, please enter again");
                            amount8 = sc.nextInt();
                            sc.nextLine();
                        }
                        bookAmounts.set(2, bookAmounts.get(2) - amount8);
                        System.out.println("You have updated the \"The Inheritance Games\" copies to a quantity of: " + (4 - bookAmounts.get(2)));
                        break;
                }
                System.out.println("would you like to change smt else? Note: if you enter no, your order will be confirmed");
                stay=sc.nextLine().toLowerCase();
            }
            totalCost=0;
            for( int cost:cart){
                totalCost += cost;
            }
            System.out.println("Here is Your cart: ");
            System.out.println("Hoodies: " +(1-clothesAmounts.get(0)));
            System.out.println("T-shirts: " + (5-clothesAmounts.get(1)));
            System.out.println("Pants: " +(7-clothesAmounts.get(2)));
            System.out.println("Ipads: " +(10-elecAmounts.get(0)));
            System.out.println("Laptops: "+ (3-elecAmounts.get(1)));
            System.out.println("Phones: "+ (9-elecAmounts.get(2)));
            System.out.println("Harry Potter: " + (2-bookAmounts.get(0)));
            System.out.println("Percy Jackson: " + (6- bookAmounts.get(1)));
            System.out.println("The Inheritance Games: "+ (4-bookAmounts.get(2)));
            System.out.println("your cart at the moment is worth " + totalCost);
        }
        System.out.println("Thank you for shopping at Costos!");
    }
}