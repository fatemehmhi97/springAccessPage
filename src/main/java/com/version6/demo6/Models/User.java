package com.version6.demo6.Models;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    private Long id;
    private String username;
    private String jobposition;
    private String password;
    private String persianname;
    private byte[] imageavatar;
    private boolean userState;
    private Role role;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "username", nullable = false, unique = true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "persianname",nullable = false)
    public String getPersianname() {
        return persianname;
    }

    public void setPersianname(String persian_name) {
        this.persianname = persian_name;
    }

    @Column(name = "jobposition")
    public String getJobposition() {
        return jobposition;
    }
    public void setJobposition(String jobposition) {
        this.jobposition = jobposition;
    }

    @Column(name = "imageavatar")
    public byte[] getImageavatar() {
        return imageavatar;
    }

    public void setImageavatar(byte[] imageAvatar) {
        this.imageavatar = imageAvatar;
    }

    @Column(name = "userstate")
    public boolean getUserState() {
        return userState;
    }
    public void setUserState(boolean userState) {
        this.userState = userState;
    }

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    public Role getRole() {
        return role;
    }

    public void setRole(Role roles) {
        this.role = roles;
    }
}
