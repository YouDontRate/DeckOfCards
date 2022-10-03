import java.util.Random;

class Deck
{
   private final int DECK_SIZE = 52;   
   private final int ZERO = 0;
   private final int ONE = 1; 
   private final int SUITS = 4;
   private final int RANK = 13;
   private final char RED = 'R';
   private final char BLACK = 'B';  
   private Card card;
   private Card [] aDeck;   
   private int dealIndex = DECK_SIZE - 1;    
   
   public Deck()
   {
      aDeck = new Card [DECK_SIZE];
      SuitType[] suits = SuitType.values();
      NameType[] ranks = NameType.values();     
      int rankIndex;
      int cardValue; 
      int cardCount; 
      char color;     
      
      cardValue = ONE;
      rankIndex = ZERO;
      cardCount = ZERO;
      
      for (int i = 0; i < SUITS; i++)
      {
      
         if (i == 1 || i == 3)
            color = BLACK;
         else 
            color = RED;
      
         for (int j = 0; j < RANK; j++)
         {
            aDeck[cardCount] = new Card(ranks[rankIndex], suits[i], cardValue, color);
            cardCount++;
            rankIndex++;
            cardValue++;        
         
         }// End inner loop   
              
         cardValue = ONE;
         rankIndex = ZERO;
         
      }// End outer loop     
      
   } // End constructor

//-------------------------------------------

   public void shuffle()
   {
      Random random = new Random();                
      int randomIndex;     
      
      for(int i = 0; i < DECK_SIZE; i++)
      {
         randomIndex = random.nextInt(DECK_SIZE);
         
         card = aDeck[i];
         aDeck[i] = aDeck[randomIndex];
         aDeck[randomIndex] = card;
                  
      }// End for loop  
   
   }// End shuffle method

//-----------------------------------------------

   public Card deal()
   {     
           
      if(dealIndex > DECK_SIZE - 1)
         return null;
      else
      {
         card = aDeck[dealIndex];
         dealIndex--;
      }
                        
      return card; 
      
   }// End deal method

//-----------------------------------------------

   public void display()
   {
            
      for(int i = 0; i < DECK_SIZE; i++)      
         System.out.println(aDeck[i]);      
   
   }// End display method 
   
   //-----------------------------------------------

   public void addCard(Card newCard)
   {
        
      if(dealIndex > DECK_SIZE - 1)
         System.out.println("Deck is full.");
      else
      {
         dealIndex++;
         aDeck[dealIndex] = newCard;         
      }      
      
   }// End deal method 
   
//--------------------------------------

   public int getDealIndex()
   {
      return dealIndex;
   }// End getDealIndex      
      
//------------------------------

          
} // End class

   