class Employee {

        private int EmpId;
        private String EmpNm;
        private int Salary;
        private String Empdesi;

        public int getEmpId() {
            return EmpId;
        }

        public void setEmpId(int empId) {
            EmpId = empId;
        }

        public String getEmpNm() {
            return EmpNm;
        }

        public void setEmpNm(String empNm) {
            EmpNm = empNm;
        }

        public int getSalary() {
            return Salary;
        }

        public void setSalary(int salary) {
            Salary = salary;
        }

        public String getEmpdesi() {
            return Empdesi;
        }

        public void setEmpdesi(String empdesi) {
            Empdesi = empdesi;
        }
    }
    class Test11 extends Employee{
        public static void main(String[] args) {

            Employee obj =new Employee();
            obj.setEmpId(123);
            obj.setSalary(25000);
            obj.setEmpdesi("guard");
            obj.setEmpNm("Ankit");
            obj.setEmpId(12);
            obj.setSalary(2500);
            obj.setEmpdesi("guar");
            obj.setEmpNm("Anki");
            int c = obj.getSalary();
            int d = obj.getSalary();
            System.out.println((c+d)/2);
        }
    }


