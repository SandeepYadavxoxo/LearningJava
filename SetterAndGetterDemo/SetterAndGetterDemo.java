package SetterAndGetterDemo;
    class  Teacher{
        private int  rollno;
        private String name;
        public int getRollno() {
            return rollno;
        }

        public int setRollno(int rollno) {
            this.rollno = rollno;
            return  rollno;
        }

        protected String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class SetterAndGetterDemo {
        public static void main(String[] args) {
            Teacher st = new Teacher();
            st.setName("Sandeep");
            st.setRollno(60);
            System.out.println(st.getName());
            System.out.println(st.getRollno());

        }
    }

