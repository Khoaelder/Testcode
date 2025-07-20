package sum25.SE180470.pojo;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name="email", columnDefinition ="VARCHAR(100) UNIQUE NOT NULL" )
    private String email;
    @Column(name="password",columnDefinition = "VARCHAR(50) NOT NULL")
    private  String password;
    @Column(name = "role")
    private String role;

    public User(Integer userId, String email, String password, String role) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User(String email, String role, String password) {
        this.email = email;
        this.role = role;
        this.password = password;
    }

}
