package shuo.laoma.concurrent.c65;

public class Counter1 {

    private int count = 0;
    private String name = "";


    public void setName(String title) {
        if (null == title) {
            throw new NullPointerException("title may not be null");
        }
        synchronized (this.name) {
            this.name = title;
        }
    }
    public  void incr(){
        count ++;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }


}
