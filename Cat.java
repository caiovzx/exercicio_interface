
public class Cat extends Animal implements Pet {
    private String name; 
    
    public Cat(String name) {
        super(4);
        this.name = name;
    }
    
    public Cat() {
        this(""); 
    }

    public void play() {
        System.out.println(name + " is playing with a ball of yarn.");
    }
    
    public void eat() {
        System.out.println(name + " is eating fish.");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }
}
