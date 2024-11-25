
    class PartTimeEmployee extends Employee {
        private int hoursofwork;
        private double hourlyRate;

        public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
            super(name, id);
            this.hoursofwork = hoursWorked;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculateSalary() {
            return hoursofwork* hourlyRate;
        }
    }


