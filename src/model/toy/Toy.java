package model.toy;

import java.util.Objects;

public class Toy {
    private int id;
    private String name;
    private int count;
    private int weight;
    public Toy(int id, String name, int count, int weight) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getWeight() {
        return weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int i) {
        this.count = count;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ID = " + id + ", Name = " + name + ", Количество = " + count + ", Weight = " + weight;
    }

    public String print() {
        return "ID = " + id + ", Name = " + name + ", Weight = " + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toy toy)) return false;
        return getId() == toy.getId() && getCount() == toy.getCount() && getWeight() == toy.getWeight() && Objects.equals(getName(), toy.getName());
    }
}