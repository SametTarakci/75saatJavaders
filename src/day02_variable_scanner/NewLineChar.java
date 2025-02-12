package day02_variable_scanner;

    public class NewLineChar {
        public static void main(String[] args) {


            String sentence1 = "What a beautiful day to be alive!";
            String sentence2 = "Let's be thankful for all the blessings we've been showered with.";
            String sentence3 = "It only makes sense to be helpful, cooperative and generous to those who are less fortunate.";


            System.out.println("-------Printing without newline character--------");
            System.out.println(sentence1 + sentence2 + sentence3);


            System.out.println("\n-------Printing with newline character-----------");
            System.out.println(sentence1 + "\n" + sentence2 + "\n" + sentence3);


            String paragraph1 = "Java is the most dynamic and easy to plug and play language. It has been transforming lives for more than 2 decades now. It still continues to grow to date.";
            String paragraph2 = "If you're a beginner who wants to be a professional in Java, you need to focus on targeted learning with consistent practice. If you're looking for a responsive community to grow with, then Code Gym is the way to go!";


            System.out.println("\n-------Printing without newline character--------");
            System.out.println(paragraph1 + paragraph2);


            System.out.println("\n-------Printing with newline character-----------");
            System.out.println(paragraph1 + "\r\n" + paragraph2);
        }
    }


