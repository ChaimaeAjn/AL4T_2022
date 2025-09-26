package be.ecam.basics.exercises;

public class NameFormatter {
    public static class Person {
        @SuppressWarnings("FieldMayBeFinal")
        private String firstName;
        private final String middleName;
        private final String lastName;

        public Person(String firstName, String middleName, String lastName) {
            this.firstName = firstName != null ? firstName : "";
            this.middleName = middleName != null ? middleName : "";
            // Si lastName n'est pas null, on l'assigne à this.lastName
            // Sinon, on assigne une chaîne vide ""
            this.lastName = lastName != null ? lastName : "";
        }

        public String getFirstName() { return firstName; }
        public String getMiddleName() { return middleName; }
        public String getLastName() { return lastName; }
    }

    public static String displayName(Person p) {
        String s = p.getFirstName().trim();
        if (!p.getMiddleName().isEmpty()) {
            s += " " + p.getMiddleName().trim();
        }
        s += " " + p.getLastName().trim();
        return s;
    }
}
