public class EnviromentVariablesApp {
    public static void main(String[] args) {
        EnvironmentVariables environmentVariables = new EnvironmentVariables();

        String variableName1 = "JDK";
        String path1 = "assf/asdsd/sdsd/cx";
        environmentVariables.add(variableName1, path1);

        String variableName2 = "ASDF";
        String path2 = "asdf/asdf/fdsa";
        environmentVariables.add(variableName2, path2);

        String variableName3 = "QWERTY";
        String path3 = "asdf/qwerty/asdfg";
        environmentVariables.add(variableName3, path3);

        String variableName4 = "QWERTY";
        String path4 = "asdf/qwerty/asdfg/test";
        environmentVariables.add(variableName4, path4);

        System.out.println("name: " + variableName2 + " " + environmentVariables.get(variableName2));
        System.out.println("name: " + variableName3 + " " + environmentVariables.get(variableName3));
    }
}
