//My Name           :Bo Ying, Su
//Class and Section  :CIS35A
//Assignment Number  :6


import adapter.CIS35a;
import adapter.Gradeable;

public class Driver {

    public static void main(String[] args) {
        //test code with file provided in lab 5
        Gradeable gr = new CIS35a("filename.txt");
        gr.printstats(1234);
        gr.printscores(1234);
        gr.printstats(4532);
        gr.printscores(4532);

        //test code with another input file
        Gradeable gr2 = new CIS35a("filename2.txt");
        gr2.printstats(1234);
        gr2.printscores(1234);
        gr2.printstats(1947);
        gr2.printscores(1947);


    }


}

