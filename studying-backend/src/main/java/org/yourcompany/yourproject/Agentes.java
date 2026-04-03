package org.yourcompany.yourproject;

import java.util.Scanner;

class AgenteIA{
    String name;
    Boolean activate;
    String behavior;
    String rules = "1. A robot must not harm a human. And it must not allow a human to be harmed. 2. A robot must obey a human's order, unless that order conflicts with the Frist Law. 3. A robot must protect itself, unless this protection conflicts with the Frist or Second Laws.";

    public AgenteIA(String name, Boolean activate, String behavior){
        this.name = name;
        this.activate = true;
        this.behavior = behavior;
        
    }

    public static void SayHello(String name){
        System.out.println("Olá, meu nome é " + name + ", como posso te ajudar? :D");
    }

    public void setBehavior(String Behavior){
        this.behavior = Behavior;
    }

}

public class Agentes {

    public static void main(String[] args) {
        AgenteIA Fateco = new AgenteIA("Fateco", true, "Be cool and energetic, but not too much like a freak");
        AgenteIA.SayHello(Fateco.name);

        try {
            Scanner chama = new Scanner(System.in);
            Integer i = 0;

                do{
                    String newbehavior = chama.next();
                    if (!(newbehavior instanceof String)) {
                        return;
                    }
                    //if completamente inutil
                    
                    Fateco.setBehavior(newbehavior);
                    chama.close();
                    i += 1;
                } while (i != 1);

            System.out.println(Fateco.behavior);
        } catch (Exception e) {

        }

    }


}


