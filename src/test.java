public class test {
    public static void main(String[] args) {
        HDFCAtm hdfcAtm=new HDFCAtm(100000,"123","asif");
        hdfcAtm.withdraw("123",10000);
        hdfcAtm.withdraw("123",10000);
        hdfcAtm.withdraw("123",10000);
        hdfcAtm.withdraw("123",20000);
        hdfcAtm.checkStatement("123");

//        hdfcAtm.withdraw("153",10000);
        Double s=34.0/10.0;
        System.out.println(s);
    }
}
