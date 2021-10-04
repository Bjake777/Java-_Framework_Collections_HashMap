import java.util.HashMap;

public class EnvironmentVariables {
    HashMap<String, String> variablesWithPath = new HashMap<>();

    public void add(String name, String path) {
        variablesWithPath.put(name, path);
    }

    public String get(String name) {
        return variablesWithPath.get(name);
    }
}
