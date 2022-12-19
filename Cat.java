package Lab9_Ex;

public class Cat {
  private int mood=3;
    private int energy=5;
    private int hungry=4;

    private void meow(){
        System.out.println("meow!");

    }


    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public void feed(){
        System.out.println(" I'm hungry!" +"hungry = "+ hungry + "," +"mood= "+ mood);
        hungry--;
        System.out.println("hungry=" + hungry);
        mood++;
        System.out.println("mood="+ mood);
        meow();
    }
    public void  sleep(){
        System.out.println("Now I want to sleep a little bit!" +"energy=" + energy + "," +"hungry=" + hungry);
        energy++;
        hungry++;
        System.out.println("energy=" + energy +","+ "hungry="+ hungry);
    }
    public void play(){
        System.out.println("I am in a good moon and I want to play!" +"mood="+ mood +","+"energy="+ energy);
        mood++;
        energy--;
        System.out.println("mood="+ mood +","+"energy="+ energy);
        meow();
    }

}
