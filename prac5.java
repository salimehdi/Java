class prac5 {
    static int x = 10 ;
    public static void main(String[] args) {
        classNew c = new classNew();
        System.out.println(c.y);
        c.ppr();
        System.out.println(classNew.x);
        classNew.spr();
        // classNew.ppr();
    }
}

class classNew {
    
    public int y = 20 ;

    static void spr(){
        System.out.println("Static");
    }
    public void ppr(){
        System.out.println("Public");
        this.y = 
    }
}