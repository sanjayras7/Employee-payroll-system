
    class FullTimeEmployee extends Employee {
        private double monthSalary;

        public FullTimeEmployee(String name, int id, double monthSalary) {
            super(name, id);
            this.monthSalary = monthSalary;
        }

        @Override
        public double calculateSalary() {
            return monthSalary;
        }
    }

