public abstract class Animal {
    private Double weight;
    private int age;
    private String gender;
    private String nickname;

    public Animal (Double weight, int age, String gender, String nickname){
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickname = nickname;}

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
