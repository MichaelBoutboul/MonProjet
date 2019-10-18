public class ClassTheo {
    private String truc;

    public ClassTheo(String truc){
        System.out.println("coucou");
        this.truc = truc;
    }

    @Override
    public String toString() {
        return this.truc;
    }
}
