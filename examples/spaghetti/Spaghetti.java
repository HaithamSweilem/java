package spaghetti;

public class Spaghetti {
    public static void main(String[] args) throws Exception {
        String firstName = "Haitham", lastName = "Sweilem", addressLine1 = "Jeursalem",
            addressLine2 = "Beit Hanina", zipCode = "97300", country = "Palestine", state = "Palestine";
        int employeeId = 5, employeeAge = 37, managerId = 7, departmentId = 4;
        
        checkEmployee(employeeId, employeeAge, managerId, departmentId, firstName, lastName, addressLine1, addressLine2, zipCode, country, state);
    }

    private static void checkEmployee(int employeeId, int employeeAge, int managerId, int departmentId, String firstName, 
        String lastName, String addressLine1, String addressLine2, String zipCode, String country, String state)
            throws Exception {
        if (employeeId > 0 && departmentId > 0 && employeeAge > 0 && managerId > 0 
            && firstName != null && lastName != null && !firstName.equals("") && !lastName.equals("") 
            && ( (addressLine1 != null && !addressLine1.equals("")) || (addressLine1 != null && !addressLine1.equals("")) )) {

                if (departmentId == 0) {
                    moveEmployeeFromCurrentDepartmentToDepartmentX(employeeId, employeeAge, managerId, departmentId, firstName, 
                        lastName, addressLine1, addressLine2, zipCode, country, state);
                }

                if (departmentId != 0 && managerId != 0) {
                    moveEmployeeFromCurrentDepartmentToDepartmentY(employeeId, employeeAge, managerId, departmentId, firstName,
                        lastName, addressLine1, addressLine2, zipCode, country, state);
                }
        }
        
    }

    static void moveEmployeeFromCurrentDepartmentToDepartmentY(int employeeId, int employeeAge, int managerId,
            int departmentId, String firstName, String lastName, String addressLine1, String addressLine2,
            String zipCode, String country, String state) {
                if (checkIfDepartmentYIsFull(employeeId, employeeAge, managerId, departmentId, firstName, lastName, addressLine1,
                addressLine2, zipCode, country, state)) {

                }
    }

    static void moveEmployeeFromCurrentDepartmentToDepartmentX(int employeeId, int employeeAge, int managerId,
            int departmentId, String firstName, String lastName, String addressLine1, String addressLine2,
            String zipCode, String country, String state) throws Exception {
                if (checkIfDepartmentXIsFull(employeeId, employeeAge, managerId, departmentId, firstName, lastName, addressLine1, addressLine2, zipCode, country, state)) {
                    if (checkIfDepartmentYIsFull(employeeId, employeeAge, managerId, departmentId, firstName, lastName, addressLine1,
                        addressLine2, zipCode, country, state)) {
                            throw new Exception();
                    }
                }
    }

    private static boolean checkIfDepartmentYIsFull(int employeeId, int employeeAge, int managerId, int departmentId,
        String firstName, String lastName, String addressLine1, String addressLine2, String zipCode, String country,
        String state) {
        return employeeId > 0 
            ? employeeAge < 0 
                ? employeeAge == 20 
                    ? managerId < 40 
                        ? departmentId == 60 
                            ? true 
                            : false
                        : false
                    : departmentId < 232 
                        ? true
                        : false
                : false
            : true;
	}

	static boolean checkIfDepartmentXIsFull(int employeeId, int employeeAge, int managerId, int departmentId,
        String firstName, String lastName, String addressLine1, String addressLine2, String zipCode, String country,
        String state) {
        if (managerId > 20) {
            return false;
        }
        else if (managerId < employeeId) {
            return true;
        }
        if (employeeAge < 43 && country.equals("IQ")) {
            if (state.equals("OO")) {
                return false;
            }
        }
        return false;
    }
}
