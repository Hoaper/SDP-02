public class Main {
    public static void main(String[] args) {
        AccessControl simpleAccessControl = new SimpleAccessControl();
        AccessControlDecorator authenticationDecorator = new AuthenticationDecorator(simpleAccessControl);
        authenticationDecorator = new AuthorizationDecorator(authenticationDecorator);
        authenticationDecorator = new EncryptionDecorator(authenticationDecorator);


        authenticationDecorator.grantPermission("*");
        authenticationDecorator.revokePermission("*");





    }
}


