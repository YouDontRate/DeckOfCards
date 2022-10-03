class Card
{
   private NameType name;
   private SuitType suit;
   private int value;

   Card(NameType name, SuitType suit, int value)
   {  
      this.name = name;
      this.suit = suit;
      this.value = value;
   
   }// End constructor
   
//--------------------------------------------------
   
   @Override
   public String toString()
   {
      String card = "[" + this.name + ", " +
                          this.suit + ", " + 
                          this.value + "]";
      return card;                         
                          
   }// End toString method
   
//----------------------------------------------------
   
   public NameType getName()
   {     
      return name;
   }// End getName method

//-----------------------------------------------------

   public SuitType getSuit()
   {     
      return suit;
   }// End getSuit method

//-----------------------------------------------------

   public int getValue()
   {      
      return value;
   }// End getValue method   
   
} // End class