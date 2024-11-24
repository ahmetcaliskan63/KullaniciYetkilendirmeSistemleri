abstract class UserDecorator implements User {
    protected User decoratedUser;

    public UserDecorator(User user) {
        this.decoratedUser = user;
    }

    @Override
    public String getPermissions() {
        return decoratedUser.getPermissions();
    }
}