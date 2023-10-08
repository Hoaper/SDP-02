public class AuthorizationDecorator extends AccessControlDecorator {
    public AuthorizationDecorator(AccessControl decoratedAccessControl) {
        super(decoratedAccessControl);
    }

    @Override
    public void grantPermission(String permission) {
        super.grantPermission(permission);
        System.out.println("Authorization check passed for permission: " + permission);
    }

    @Override
    public void revokePermission(String permission) {
        super.revokePermission(permission);
        System.out.println("Authorization check for revoked permission: " + permission);
    }
}
