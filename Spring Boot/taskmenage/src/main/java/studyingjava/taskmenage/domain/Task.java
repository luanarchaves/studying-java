package studyingjava.taskmenage.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.Assert;

import java.util.Optional;

@Getter
@Setter
//essas anotações do lombok garante que minha classe vai ter todos os metodos de getter e setter implementado
public class Task {
    private TaskId id;
    //record -> tipo de variavel especifica para ID, além do tipo ter metodos de validação, garantindo segurança no codigo
    private String title;
    private Optional<String> description;
    private TaskStatus status; //enum -> lista de valores

    //construtor (cria o objeto)
    public Task(String title, Optional<String> description){
        Assert.notNull(title, "Título não pode ser vazio.");

        this.id = new TaskId(); //id é um objeto do tipo TaskId
        this.title = title;
        this.description = description;
        this.status = TaskStatus.WAITING;
        //é assim que atribui valor a um atributo do tipo ENUM
    }
}
