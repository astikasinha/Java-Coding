public class encapsulation {

    private int empid;

    public void setEmpid(int eid) {
        empid = eid;
    }

    public int getEmpid() {
        return empid;
    }

    public static void main(String[] args) {
        encapsulation e = new encapsulation();
        e.setEmpid(101);
        System.out.println(e.getEmpid());
    }

}
