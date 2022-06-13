import java.util.*;
import java.io.*;
import java.lang.Object;

class Main {
  public static void main(String[] args) throws IOException
  {
// ************************  Lower.txt File **********************
    int[] lowerInts = new int[1000];

    int indexLowerIntsCounter = 0;
    for ( int i : lowerInts) //populating random ints to lowerInts array. (97-122)
      {
        lowerInts[indexLowerIntsCounter] = ((int)(Math.random()*26)+97);
        indexLowerIntsCounter++;
      }
      
      File lowIntFile = new File("Lower.txt");
      PrintWriter lowerIntPrintWriter = new PrintWriter(lowIntFile);

      int indexLowerInt = 0; // index variable for loop
      for (int loop = 1; loop <= 1000; loop++)// populating file
      {
         lowerIntPrintWriter.println(lowerInts[indexLowerInt]);
         indexLowerInt++;
      }
      
      lowerIntPrintWriter.close();
   
  // ********************* Upper.txt File ***************************
    int[] upperInts = new int[1000];

    int indexUpperIntsCounter = 0;
    for ( int i : upperInts) //populating random ints to upperInts array. (65-90)
      {
        upperInts[indexUpperIntsCounter] = ((int)(Math.random()*26)+65);
        indexUpperIntsCounter++;
      }
      
      File upIntFile = new File("Upper.txt");
      PrintWriter upIntPrintWriter = new PrintWriter(upIntFile);

      int indexUpperInt = 0; // index variable for loop
      for (int loop = 1; loop <= 1000; loop++)// populating file
      {
         upIntPrintWriter.println(upperInts[indexUpperInt]);
         indexUpperInt++;
      }
      
      upIntPrintWriter.close();

  // ********************* mixedLetter.txt File ***************************
    int[] mixedLetterInts = new int[1000];

    int indexMixedLetterCounter = 0;
    for ( int i : mixedLetterInts) //populating random ints to mixedLetterInts array. (65-90) and (97-122)
      {
        mixedLetterInts[indexMixedLetterCounter] = ((int)(Math.random()*57)+65);// basically a list of every value between 65 and 122
        indexMixedLetterCounter++;
      }
      
    for ( int i = 0; i < mixedLetterInts.length; i++)
    {
      if ( mixedLetterInts[i] > 89 && mixedLetterInts[i] <= 92)
      {
        mixedLetterInts[i] = ((int) (Math.random() * 26)+97); // if mixedLetter is between 90 and 92 (not a letter), set to lower case letter
      }
    }
    for ( int i = 0; i < mixedLetterInts.length; i++)
    {
      if ( mixedLetterInts[i] >= 93 && mixedLetterInts[i] <= 96)
      {
        mixedLetterInts[i] = ((int) (Math.random() * 25)+65); // if mixedLetter is between 93 and 96 (not a letter), set to upper case letter
      }
    }
      File mixedLetterIntFile = new File("mixedLetter.txt");
      PrintWriter mixedLetterIntPrintWriter = new PrintWriter(mixedLetterIntFile);

      int indexMixedLetterInt = 0; // index variable for loop
      for (int loop = 1; loop <= 1000; loop++)// populating file
      {
         mixedLetterIntPrintWriter.println(mixedLetterInts[indexMixedLetterInt]);
         indexMixedLetterInt++;
      }
      
      mixedLetterIntPrintWriter.close();
  // ********************* mixedLetterNumbers.txt File ***************************  
  int[] mixedLetterNumberInts = new int[1000];

    int indexMixedLetterNumberCounter = 0;
    for ( int i : mixedLetterNumberInts) //populating random ints to mixedLetterInts array. (65-90) and (97-122)
      {
        mixedLetterNumberInts[indexMixedLetterNumberCounter] = ((int)(Math.random()*74)+48);// basically a list of every value between 48 and 122
        indexMixedLetterNumberCounter++;
      }
      
    for ( int i = 0; i < mixedLetterNumberInts.length; i++)
    {
      if ( mixedLetterNumberInts[i] > 89 && mixedLetterNumberInts[i] <= 92)
      {
        mixedLetterNumberInts[i] = ((int) (Math.random() * 26)+97); // if mixedLetterNumber is between 90 and 92 (not a letter or number), set to lower case letter
      }
    }
    for ( int i = 0; i < mixedLetterNumberInts.length; i++)
    {
      if ( mixedLetterNumberInts[i] >= 93 && mixedLetterNumberInts[i] <= 96)
      {
        mixedLetterNumberInts[i] = ((int) (Math.random() * 25)+65); // if mixedLetterNumber is between 93 and 96 (not a letter or number), set to upper case letter
      }
    }
    for ( int i = 0; i < mixedLetterNumberInts.length; i++)
    {
      if ( mixedLetterNumberInts[i] >= 58 && mixedLetterNumberInts[i] <= 64)
      {
        mixedLetterNumberInts[i] = ((int) (Math.random() * 9)+48); // if mixedLetterNumber is between 58 and 64 (not a letter or number), set to number
      }
    }


      File mixedLetterNumberIntFile = new File("mixedLetterNumber.txt");
      PrintWriter mixedLetterNumberIntPrintWriter = new PrintWriter(mixedLetterNumberIntFile);

      int indexMixedLetterNumberInt = 0; // index variable for loop
      for (int loop = 1; loop <= 1000; loop++)// populating file
      {
         mixedLetterNumberIntPrintWriter.println(mixedLetterNumberInts[indexMixedLetterNumberInt]);
         indexMixedLetterNumberInt++;
      }
      
      mixedLetterNumberIntPrintWriter.close();


 // ********************* mixedChar.txt File ***************************  
  int[] mixedCharInts = new int[1000];

    int indexCharCounter = 0;
    for ( int i : mixedCharInts) //populating random ints to mixedLetterInts array. (65-90) and (97-122)
      {
        mixedCharInts[indexCharCounter] = ((int)(Math.random()*94)+33);// basically a list of every value between 33 and 126
        indexCharCounter++;
      }
      
    for ( int i = 0; i < mixedCharInts.length; i++)
    {
      if ( mixedCharInts[i] > 47 && mixedCharInts[i] <= 58)
      {
        mixedCharInts[i] = ((int) (Math.random() * 15)+33); // if mixedChar is between 47 and 58 (numbers), set to 33-47
      }
    }
    for ( int i = 0; i < mixedCharInts.length; i++)
    {
      if ( mixedCharInts[i] >= 64 && mixedCharInts[i] <= 91)
      {
        mixedCharInts[i] = ((int) (Math.random() * 7)+58); // if mixedLetterNumber is between 64 and 91 (uppercase), set to 58-64
      }
    }
    for ( int i = 0; i < mixedCharInts.length; i++)
    {
      if ( mixedCharInts[i] >= 96 && mixedCharInts[i] < 123)
      {
        mixedCharInts[i] = ((int) (Math.random() * 6)+91); // if mixedLetterNumber is between 96 and 123(lowercase), set to 91-96
      }
    }

      File mixedCharIntFile = new File("mixedChar.txt");
      PrintWriter mixedCharIntPrintWriter = new PrintWriter(mixedCharIntFile);

      int indexMixedCharInt = 0; // index variable for loop
      for (int loop = 1; loop <= 1000; loop++)// populating file
      {
         mixedCharIntPrintWriter.println(mixedCharInts[indexMixedCharInt]);
         indexMixedCharInt++;
      }
      
      mixedCharIntPrintWriter.close();

//*******************************charUpperLists*****************************************

String[] charUpper = new String[1000];
int charUpperCounter= 0;
    
for ( String i : charUpper)// char arrays of all upper characters
{
  i += (upperInts[charUpperCounter]);
  charUpperCounter++;
}

for( int i = 0; i < 1000; i++)
  {
    charUpper[i] = Character.toString(upperInts[i]);
  }


File charUpperFile = new File("Upperpw.txt");
      PrintWriter charUpperPrintWriter = new PrintWriter(charUpperFile);
for (int j = 0; j < charUpper.length; j ++)
{
  for ( int i = 0; i < 8 ; i ++)
  {
     charUpperPrintWriter.print(charUpper[(int)(Math.random()*1000)]);
  }
  charUpperPrintWriter.println(); 
}


charUpperPrintWriter.close();

//*******************************charLowerLists*****************************************

String[] charLower = new String[1000];
int charLowerCounter= 0;
for ( String i : charLower)// char arrays of all upper characters
{
  i += (lowerInts[charLowerCounter]);
  charLowerCounter++;
}

for( int i = 0; i < 1000 ; i++)
  {
    charLower[i] = Character.toString(lowerInts[i]);
  }

File charLowerFile = new File("Lowerpw.txt");
      PrintWriter charLowerPrintWriter = new PrintWriter(charLowerFile);
for (int j = 0; j < charLower.length; j ++)
{
  for ( int i = 0; i < 8 ; i ++)
  {
     charLowerPrintWriter.print(charLower[(int)(Math.random()*1000)]);//prints 8 random chars on a line
  }
  charLowerPrintWriter.println(); 
}

charLowerPrintWriter.close();

//*******************************charMixedLetterLists*****************************************

String[] charMixedLetter = new String[1000];
int charMixedLetterCounter= 0;
for ( String i : charMixedLetter)// char arrays of all upper characters
{
  i += (mixedLetterInts[charMixedLetterCounter]);// setting mixedLetterInts array to mixed char array
  charMixedLetterCounter++;
}

for( int i = 0; i < 1000 ; i++)
  {
    charMixedLetter[i] = Character.toString(mixedLetterInts[i]);
  }


File charMixedLetterFile = new File("MixedLetterpw.txt");
      PrintWriter charMixedLetterPrintWriter = new PrintWriter(charMixedLetterFile);
for (int j = 0; j < charMixedLetter.length; j ++)
{
  for ( int i = 0; i < 8 ; i ++)
  {
     charMixedLetterPrintWriter.print(charMixedLetter[(int)(Math.random()*1000)]);//prints 8 random chars on a line
  }
  charMixedLetterPrintWriter.println(); 
}

charMixedLetterPrintWriter.close();

//*******************************charMixedLetterNumbersLists*****************************************

String[] charMixedLetterNumbers = new String[1000];
int charMixedLetterNumbersCounter= 0;
for ( String i : charMixedLetterNumbers)// char arrays of all upper characters
{
  i += (mixedLetterNumberInts[charMixedLetterNumbersCounter]);// setting mixedLetterInts array to mixed char array
  charMixedLetterNumbersCounter++;
}

for( int i = 0; i < 1000 ; i++)
  {
    charMixedLetterNumbers[i] = Character.toString(mixedLetterNumberInts[i]);
  }

File charMixedLetterNumbersFile = new File("MixedLetterNumberspw.txt");
      PrintWriter charMixedLetterNumbersPrintWriter = new PrintWriter(charMixedLetterNumbersFile);
for (int j = 0; j < charMixedLetterNumbers.length; j ++)
{
  for ( int i = 0; i < 8 ; i ++)
  {
     charMixedLetterNumbersPrintWriter.print(charMixedLetterNumbers[(int)(Math.random()*1000)]);//prints 8 random chars on a line
  }
  charMixedLetterNumbersPrintWriter.println(); 
}

charMixedLetterNumbersPrintWriter.close();

//*******************************charMixedCharLists*****************************************

String[] charMixedChar = new String[1000];
int charMixedCharCounter= 0;
for ( String i : charMixedChar)// char arrays of all upper characters
{
  i += (mixedCharInts[charMixedCharCounter]);// setting mixedLetterInts array to mixed char array
  charMixedCharCounter++;
}

for( int i = 0; i < 1000; i ++)
  {
    charMixedChar[i] = Character.toString(mixedCharInts[i]);
  }
    
File charMixedCharFile = new File("MixedCharpw.txt");
      PrintWriter charMixedCharPrintWriter = new PrintWriter(charMixedCharFile);
for (int j = 0; j < charMixedChar.length; j ++)
{
  for ( int i = 0; i < 8 ; i ++)
  {
     charMixedCharPrintWriter.print(charMixedChar[(int)(Math.random()*1000)]);//prints 8 random chars on a line
  }
  charMixedCharPrintWriter.println(); 
}

charMixedCharPrintWriter.close();

//**************************** menu *******************************************

System.out.println("Welcome to password generator!\nPlease Select which type of password you would like to generate");

System.out.println("1.) Lowercase Letters\n2.) Uppercase Letters\n3.) Uppercase and Lowercase Letters\n4.) Uppercase, Lowercase, and Numbers\n5.) Uppercase, Lowercase, Numbers, and Symbols\n0.) Exit");

System.out.println("Enter Selection by typing numbers 1,2,3,4,5 or 0 to Exit:");

Scanner scan = new Scanner(System.in);
int ans = scan.nextInt();

if (ans == 1)
{
  System.out.print("Your New Password is: ");

  for( int i = 0; i < 8 ; i ++)
    {
      System.out.print(charLower[(int)(Math.random()*1000)]);;
    }
  System.out.println();
}
else if (ans ==2)
{
  System.out.print("Your New Password is: ");

    for( int i = 0; i < 8 ; i ++)
    {
      System.out.print(charUpper[(int)(Math.random()*1000)]);;
    }
  System.out.println();
}
else if (ans ==3)
{
  System.out.print("Your New Password is: ");

  for( int i = 0; i < 8 ; i ++)
    {
      System.out.print(charMixedLetter[(int)(Math.random()*1000)]);;
    }
  System.out.println();
}
else if (ans == 4)
{
  System.out.print("Your New Password is: ");
  for( int i = 0; i < 8 ; i ++)
    {
      System.out.print(charMixedLetterNumbers[(int)(Math.random()*1000)]);
    }
  System.out.println();
}
else if (ans ==5)
{
  System.out.print("Your New Password is: ");
   for( int i = 0; i < 8 ; i ++)
    {
      System.out.print(charMixedChar[(int)(Math.random()*1000)]);
    }
  System.out.println();
  
}
else if (ans == 0)
{
  System.out.println("Goodbye, click run for new password");
}

scan.close();

  }
}