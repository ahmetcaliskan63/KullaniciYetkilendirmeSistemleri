class EditPermission extends UserDecorator {
    public EditPermission(User user) {
        super(user);
    }

    @Override
    public String getPermissions() {
        return decoratedUser.getPermissions() + ", Edit";
    }
}
