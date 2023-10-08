import java.util.ArrayList;
import java.util.List;

public class SimpleAccessControl implements AccessControl {
    private final List<String> permissions = new ArrayList<>();

    @Override
    public void grantPermission(String permission) {
        permissions.add(permission);
        System.out.println("Permission granted: " + permission);
    }

    @Override
    public void revokePermission(String permission) {
        permissions.remove(permission);
        System.out.println("Permission revoked: " + permission);
    }
}
