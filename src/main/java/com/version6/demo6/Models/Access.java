package com.version6.demo6.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "access")
public class Access {
    private Long id;
    private String pageName;
    private List<Role> roles;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "page_name", nullable = false, unique = true)
    public String getPageName() {
        return pageName;
    }
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    @ManyToMany
    @JoinTable(name = "role_access", joinColumns = @JoinColumn(name = "access_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
