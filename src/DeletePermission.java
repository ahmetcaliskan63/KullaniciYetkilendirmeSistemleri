class DeletePermission extends UserDecorator {
    public DeletePermission(User user) {
        super(user);
    }

    @Override
    public String getPermissions() {
        return decoratedUser.getPermissions() + ", Delete";
    }
}