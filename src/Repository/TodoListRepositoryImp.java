package Repository;

import Entity.TodoList;

public class TodoListRepositoryImp implements TodoListRepository {
    public TodoList[] todoLists = new TodoList[10];

    private TodoListRepositoryImp todoListRepositoryImp;
    @Override
    public void save(TodoList todoList) {
        int currentIndex = 0;
        boolean added = false;
        while (currentIndex < this.todoLists.length && !added) {
            if (this.todoLists[currentIndex] == null) {
                this.todoLists[currentIndex] = todoList;
                added = true;
            }
            currentIndex++;
        }
        if (!added) {
            throw new RuntimeException("Tidak Bisa Ditambahkan lagi karena sudah penuh kapasitasnya!!");
        }
    }

    @Override
    public boolean delete(Integer number) {
        if (number >= this.todoLists.length || number < 0) {
            return false;
        }

        for (int i = number-1; i < this.todoLists.length - 1; i++) {
            this.todoLists[i] = this.todoLists[i + 1];
        }
        this.todoLists[this.todoLists.length - 1] = null;

        return true;
    }


    @Override
    public TodoList[] findAll() {
        return this.todoLists;
    }
}
