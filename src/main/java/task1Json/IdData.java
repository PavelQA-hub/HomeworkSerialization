package task1Json;

import java.io.Serializable;

public class IdData implements Serializable {
    private int id;
    private String name;
    private boolean permanent;

    @Override
    public String toString() {
        return "IdData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permanent=" + permanent +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public IdData() {
    }
}
