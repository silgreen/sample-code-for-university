public class Test {
    private Test other;
    private int val;

        @Override
        public boolean equals(Object obj) {
            Test temp = (Test) obj;
            if(temp.other == null && this.other == null) return true;
            if(temp.other != null && this.other != null)
                if(temp.other.val == this.other.val) return true;
            return false;
        }

    public static void main(String[] args) {
        Test o1, o2,o3;
        o1 = new Test();
        o2 = new Test();
        o3 = new Test();


        o1.other = null;
        o2.other = null;
        o3.val = 10;

        System.out.print(o1.equals(o2));
    }
}
