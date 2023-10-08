public interface AccessControl {
    void grantPermission(String permission);

    void revokePermission(String permission);
}
