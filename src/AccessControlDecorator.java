public abstract class AccessControlDecorator implements AccessControl {
    private final AccessControl decoratedAccessControl;

    public AccessControlDecorator(AccessControl decoratedAccessControl) {
        this.decoratedAccessControl = decoratedAccessControl;
    }

    @Override
    public void grantPermission(String permission) {
        decoratedAccessControl.grantPermission(permission);
    }

    @Override
    public void revokePermission(String permission) {
        decoratedAccessControl.revokePermission(permission);
    }
}
