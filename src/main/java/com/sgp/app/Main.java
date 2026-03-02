import java.util.Scanner;

import model.Cidade;

public class Main{


    public static void main(String[] args) {
        
        Cidade campinas = new Cidade("Campinas", "fds", 1100000);

        Scanner sc = new Scanner(System.in);

        int op;

        do{
            imprimirMenu();

            op = receberOp(sc);
        }
    }
}
