package class15;
//StringBuffer(线程安全)
//StringBuilder(速度优势)
//优先使用StringBuffer

public class main {
    public static void main(String[] args) {
        String a= "";
        a += "java,";
        a += "python,";
        a += "scala,";
        System.out.println(a);

        StringBuffer b= new StringBuffer();
        b.append("java,");
        b.append("python,");
        b.append("scala");
        System.out.println(b);

        StringBuilder c = new StringBuilder();
        c.append("java,");
        c.append("python,");
        c.append("scala");
        System.out.println(c);
    }
}