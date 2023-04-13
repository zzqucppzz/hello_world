public class UsingStaticExample {
    private String subject;

    public String getSubject(){
        return subject;
    }
    UsingStaticExample(){

    }
    UsingStaticExample (String subject) {
        this.subject = subject;
    }

    public void print() {
        System.out.println("Subject = " + subject);
        System.out.println("Website = " + MyWebsite.WEBSITE);
    }
    public class MyWebsite {
        public static String WEBSITE = "gpcoder.com";
    }

    public static void changeWebsite(String website) {
        MyWebsite.WEBSITE = website;
        System.out.println("Website = " + MyWebsite.WEBSITE);
    }

    public static void main(String[] args) {
        UsingStaticExample.changeWebsite("https://gpcoder.com");
        
        UsingStaticExample ex1 = new UsingStaticExample();
        //ex1.changeWebsite("abc.com");
        ex1.print();
        System.out.println("----");
        UsingStaticExample.changeWebsite("https://gpcoder.com");
        ex1.print();
    }
}
