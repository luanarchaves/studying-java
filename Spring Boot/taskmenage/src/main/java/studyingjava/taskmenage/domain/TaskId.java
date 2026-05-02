package studyingjava.taskmenage.domain;

import org.springframework.util.Assert;

import java.util.UUID;

public record TaskId(UUID id) {

    //metodo para validar parametro recebido (pratica DDD)
    public TaskId{
        Assert.notNull(id, "Id não pode ser vazio.");
        //ASSERT é uma suposição que faço de algum atributo, caso ele nao atenda a minha suposição, dispara mensagem de erro
        //nesse caso é notNull, minha suposição é que ele nao é null, mas caso for, vai disparar essa mensagem
    }

    //CONSTRUTOR -> veja que tem () após o nome do metodo, além de this no body, se trata de um construtor
    public TaskId(){
        this(UUID.randomUUID());
    }
}
