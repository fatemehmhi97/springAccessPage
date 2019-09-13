package com.version6.demo6.Models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "role")
public class Role {
    private Long id;
    private String name;
    private List<Access> access;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany
    @JoinTable(name = "role_access", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "access_id"))
    public List<Access> getAccess() {
        return access;
    }
    public void setAccess(List<Access> access) {
        this.access = access;
    }

}
