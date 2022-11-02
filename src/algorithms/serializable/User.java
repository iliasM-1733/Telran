package algorithms.serializable;

import java.io.*;
import java.time.LocalDate;

public class User implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //создаем наш объект
        User user = new User();
        user.setFirstName("12");
        user.setLastName("12");
        user.setEmail("12");
        user.setBirthDate(LocalDate.of(1991, 7, 16));
        user.setLogin("ssmith");
        user.setPassword("password12");

        System.out.println("initial user: " + user + "\r\n");


        serialize(user);
        User loadedUser = deserialize();
        System.out.println("loaded user:  " + loadedUser + "\r\n");
    }

    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;
    private String login;
    transient private String password;

    public User() {
    }

    public User(String firstName, String lastName, String email, LocalDate birthDate, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.login = login;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void serialize(User user) throws IOException {
        String path = "./output.txt";
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            //создаем 2 потока для сериализации объекта и сохранения его в файл
            outputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(outputStream);

            // сохраняем объект в файл
            objectOutputStream.writeObject(user);
        } finally {
            // Закроем потоки в блоке finally
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    static User deserialize() throws IOException, ClassNotFoundException {
        String path = "./output.txt";
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {

            //создаем 2 потока для десериализации объекта из файла
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);

            //загружаем объект из файла
            return  (User) objectInputStream.readObject();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
        }
    }
}
