package studyingjava.taskmenage.domain;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {
    Task save(Task task);
    //salvar task do tipo Task no banco
    List<Task> findAll();
    Optional<Task> findById(TaskId id);
    void deleteTask(TaskId id);
}
