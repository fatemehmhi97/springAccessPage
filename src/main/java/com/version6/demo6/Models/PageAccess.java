package com.version6.demo6.Models;

import javax.persistence.*;

@Entity
@Table(name = "access")
public class PageAccess {
    private long Page_id;
    private String page_name;
    private boolean panelAdminRole;
    private boolean AdminRole;
    private boolean userRole;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getPage_id() {
        return Page_id;
    }

    public void setPage_id(long page_id) {
        Page_id = page_id;
    }
@Column(name = "page_name")
    public String getPage_name() {
        return page_name;
    }

    public void setPage_name(String page_name) {
        this.page_name = page_name;
    }
@Column(name = "center_admin_validation")
    public boolean isPanelAdminRole() {
        return panelAdminRole;
    }

    public void setPanelAdminRole(boolean panelAdminRole) {
        this.panelAdminRole = panelAdminRole;
    }
@Column(name = "admin_validation")
    public boolean isAdminRole() {
        return AdminRole;
    }

    public void setAdminRole(boolean adminRole) {
        AdminRole = adminRole;
    }
@Column(name = "user_validation")
    public boolean isUserRole() {
        return userRole;
    }

    public void setUserRole(boolean userRole) {
        this.userRole = userRole;
    }
}
