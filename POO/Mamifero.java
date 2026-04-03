
//classe
class MamiferoAnimal {

    //atributos (caracteristicas da classe)
    String nome;
    Number patas;

    //construtor (vai receber os valores dos parametros da chamada da classe e definir os valors dos atributos)
    public MamiferoAnimal(String nome, Number patas){
        this.nome = nome;
        //this.nome - o valor do atributo que o objeto que chamou a classe vai definir 
        //vai ser igual ao parametro nome
        this.patas = 4;

        //tambem pode definir no constructor que um atributo vai ter um valor padrão, ex: this.patas = 4
        //esse valor pode ser alterado depois
    }

    //metodo (o que a classe pode fazer)
    static void Andar(String nome, Number patas){
        System.out.println("O animal " + nome + " anda com " + patas + " patas");
    }

}

//herança (classe que herda attributos e metodos de outra classe)
class Cachorro extends MamiferoAnimal{

    //obrigatorio declarar os atributos da classe pai
    public Cachorro(String nome, Number patas){
        super(nome, patas);
    }

    //novo metodo da sub classe 
    static void Latir(){
        System.out.println("Au Au!!!");
    }
}

public class Mamifero{
    public static void main(String[] args){
        MamiferoAnimal Gato = new MamiferoAnimal("Gato", 4);
        MamiferoAnimal.Andar(Gato.nome, Gato.patas);
        //para chamar o metodo de uma classe, deve chamar ela primeiro, depois no parametro colocar objeto + atributo 

        Cachorro PitBull = new Cachorro("Princesa",4);
        Cachorro.Latir();
        Cachorro.Andar(PitBull.nome, PitBull.patas);
        //sub classe consegue usar o metodo que criou e o da classe que descendeu

        Cachorro ViraLata = new Cachorro("Caramelo",4);
        Cachorro.Andar(ViraLata.nome, ViraLata.patas);
    }
}

