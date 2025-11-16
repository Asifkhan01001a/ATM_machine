public class test {
    public static void main(String[] args) {
        HDFCAtm hdfcAtm=new HDFCAtm(100000,"123","asif");
        hdfcAtm.withdraw("123",10000);
        hdfcAtm.withdraw("123",10000);
        hdfcAtm.withdraw("123",10000);
        hdfcAtm.withdraw("123",20000);
        hdfcAtm.checkStatement("123");

//        hdfcAtm.withdraw("153",10000);

    }
}
