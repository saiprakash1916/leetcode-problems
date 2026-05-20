package leetCode.commonQuestions;

public class singleton {
    private static singleton instance;
    private singleton(){
        System.out.println("Singleton Object created");
    }
    public static singleton getInstance(){
        // Single check
        if(instance == null){
            synchronized (singleton.class){
                // Second check
                if(instance == null){
                    instance = new singleton();
                }
            }
        }
        return instance;
    }
    public void display(){
        System.out.println("Display Method");
    }
    public static void main(String[] args) {
        singleton s1 = singleton.getInstance();
        singleton s2 = singleton.getInstance();

        s1.display();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
    }
}
