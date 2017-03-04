package CredentialsManager;

public class Credentials {

    private String _username;
    private String _password;

    private int passwordIndex = 0;
    private String[] passwords = new String[100];

    static int usersIndex = 0;
    static Credentials[] users = new Credentials[200];

    Credentials(String user, String password) {
        this._username = user;
        this._password = password;
    }

    static void addObject(Credentials object) {
        users[usersIndex] = object;
        usersIndex++;
    }

    static Credentials findObject(String user) {
        int a = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) //this check is to avoid error 
            {
                if (users[i]._username.equals(user)) {
                    a = i;
                    break;
                }
            }
        }
        return users[a];
    }

    static boolean userExist(String user) {
        boolean exist = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) //this check is to avoid error 
            {
                if (users[i]._username.equals(user)) {
                    exist = true;
                    break;
                }
            }
        }

        return exist;
    }

    boolean isPasswordUsed(String password) {
        boolean used = false;
        for (int i = 0; i < passwords.length; i++) {
            if (passwords[i] == password) {
                used = true;
            }
        }
        return used;
    }

    boolean checkPassword(String password) {
        boolean rightPassword = false;
        if (password.equals(this._password)) {
            rightPassword = true;
        }
        return rightPassword;
    }

    void savePassword(String newPassword) {
        passwords[passwordIndex] = newPassword;
        setPassword(newPassword);
        passwordIndex++;
        if (passwordIndex == 100) {
            passwordIndex = 0;
        }
    }

    private void setUsername(String username) {
        this._username = username;
    }

    String getUsername() {
        return _username;
    }

    void setPassword(String password) {
        this._password = password;
    }

    private String getPassword() {
        return _password;
    }
}
