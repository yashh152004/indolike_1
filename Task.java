

public class Task {
    private final int id;
    private final String description;
    private boolean isDone;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.isDone = false;
    }

    public void markDone() {
        isDone = true;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String toString() {
        return "[" + (isDone ? "Done" : "Pending") + "] " + id + ". " + description;
    }
}

