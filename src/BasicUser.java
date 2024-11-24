class BasicUser implements User {
    @Override
    public String getPermissions() {
        return "Read Only"; // Sadece okuma yetkisi
    }
}