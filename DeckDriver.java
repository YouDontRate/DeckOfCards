import java.util.Scanner;

class DeckDriver
{
   public static void main(String[] args)
   {  
   
      handleDeck();
   
   } // End main method
   
   public static void handleDeck()
   {
      Deck theDeck = new Deck();
      Scanner input = new Scanner(System.in);
      char choice;
      
      System.out.println("Press 1 to make a new deck of cards");
      System.out.println("Press 2 to shuffle the deck");
      System.out.println("Press 3 to disply the deck");
      System.out.println("Press 4 to deal the top card");
      System.out.print("Select an option or press 0 to exit >> ");
      choice = input.nextLine().charAt(0);
      
      while(choice != '0')
      {
         switch(choice)
         {
            case '1':
            {
               theDeck = new Deck();
               break;
            }
            
            case '2':
            {                
               theDeck.shuffle();             
               break;
            }
            
            case '3':
            {
               theDeck.display();
               break;
            }
            
            case '4':
            {
               Card topCard = theDeck.deal();
               
               System.out.println(topCard);
               break;
            }
            
            default:
            {
               System.out.println("Invalid choice");
            }            
            
         }// End switch
         
         System.out.print("Select an option or press 0 to exit >> ");
         choice = input.nextLine().charAt(0);  
           
      } // End while      
   
   } // End handleDeck method

} // End class