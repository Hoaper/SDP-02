public class AuthenticationDecorator extends AccessControlDecorator {
    public AuthenticationDecorator(AccessControl decoratedAccessControl) {
        super(decoratedAccessControl);
    }

    @Override
    public void grantPermission(String permission) {
        super.grantPermission(permission);
        System.out.println("User authenticated for permission: " + permission);
    }

    @Override
    public void revokePermission(String permission) {
        super.revokePermission(permission);
        System.out.println("Authentication check for revoked permission: " + permission);
    }
}
