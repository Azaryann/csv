package model;

import java.util.Objects;

public class Customer implements Comparable<Customer>{

    private String name;
    private String phone;
    private int score;

    public Customer() {
    }

    public Customer(String name, String phone, int score) {
        this.name = name;
        this.phone = phone;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return score == customer.score && Objects.equals(name, customer.name) && Objects.equals(phone, customer.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, score);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return Integer.compare(this.score, o.getScore());
    }
}
