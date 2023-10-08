public class EncryptionDecorator extends AccessControlDecorator {
    public EncryptionDecorator(AccessControl decoratedAccessControl) {
        super(decoratedAccessControl);
    }

    @Override
    public void grantPermission(String permission) {
        super.grantPermission(permission);
        System.out.println("Encrypting data for permission: " + permission);
    }

    @Override
    public void revokePermission(String permission) {
        super.revokePermission(permission);
        System.out.println("Decryption needed for revoked permission: " + permission);
    }
}
