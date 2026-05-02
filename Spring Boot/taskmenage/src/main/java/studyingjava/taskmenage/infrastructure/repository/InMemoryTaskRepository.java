package studyingjava.taskmenage.infrastructure.repository;

import studyingjava.taskmenage.domain.Task;
import studyingjava.taskmenage.domain.TaskId;
import studyingjava.taskmenage.domain.TaskRepository;

import java.util.List;
import java.util.Optional;

public class InMemoryTaskRepository implements TaskRepository {
    @Override
    public Task save(Task task) {
        return null;
    }

    @Override
    public List<Task> findAll() {
        return List.of();
    }

    @Override
    public Optional<Task> findById(TaskId id) {
        return Optional.empty();
    }

    @Override
    public void deleteTask(TaskId id) {

    }
}
