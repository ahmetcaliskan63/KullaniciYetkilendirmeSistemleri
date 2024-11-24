
public class AuthorizationSystem {
    public static void main(String[] args) {
        // Temel bir kullanıcı (Okuyucu)
        User user = new BasicUser();
        System.out.println("User Permissions: " + user.getPermissions());

        // Yazma yetkisi ekle
        user = new WritePermission(user);
        System.out.println("User Permissions: " + user.getPermissions());

        // Düzenleme yetkisi ekle
        user = new EditPermission(user);
        System.out.println("User Permissions: " + user.getPermissions());

        // Silme yetkisi ekle
        user = new DeletePermission(user);
        System.out.println("User Permissions: " + user.getPermissions());
    }
}
