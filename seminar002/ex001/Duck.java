package seminar002.ex001;

public class Duck extends Birds implements Swimable, Comparable<Duck>{

    @Override
    public void fly(int distance) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

    @Override
    public void makeVoice() {
        System.out.println("Ga-ga-ga");
    }

    @Override
    public void swim(int distance) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'swim'");
    }

    @Override
    public int compareTo(Duck o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }


    
}
