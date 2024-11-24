class WritePermission extends UserDecorator {
    public WritePermission(User user) {
        super(user);
    }

    @Override
    public String getPermissions() {
        return decoratedUser.getPermissions() + ", Write";
    }
}