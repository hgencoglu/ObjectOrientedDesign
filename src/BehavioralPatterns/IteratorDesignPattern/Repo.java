package BehavioralPatterns.IteratorDesignPattern;

public class Repo implements Container{
    public String isimler[]={"Hakan","Gökhan","Ahmet","Zübeyr"};


    @Override
    public Iterator getIterator() {
        return new isimIterator();
    }


    private class isimIterator implements Iterator{
        int index;

        @Override
        public boolean hashNext() {
            if(index<isimler.length){
                return true;
            }
            return false;
        }

        @Override
        public Object nextObject() {
            if(this.hashNext())
            {
                return isimler[index++];
            }
            return null;
        }
    }
}
