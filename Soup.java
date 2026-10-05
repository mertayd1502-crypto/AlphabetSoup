public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    public void add(String word){
    letters = letters + word;

    }


    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
        int randomIndex= (int) (Math.random() * letters.length());
        return letters.charAt(randomIndex);
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        int middleIndex = letters.length() / 2;
        return letters.substring(0, middleIndex) + company + letters.substring(middleIndex);
    }


    //precondition: letters variable is non-null and is a valid string, there is at least 1
    //postcondition: letters no longer contain
    public void removeFirstVowel(){
        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                letters = letters.substring(0, i) + letters.substring(i + 1);
                return;
            }
        }
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
    int randomIndex = (int) (Math.random() * (letters.length() - num + 1));
    letters = letters.substring(0, randomIndex) + letters.substring(randomIndex + num);
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        letters= letters.replaceFirst(word, "");
        }
    }

