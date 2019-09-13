package com.version6.demo6.Models;

public class PageAccess {
    private long Page_id;
    private String page_name;
    private boolean panelAdminRole;
    private boolean AdminRole;
    private boolean userRole;

    public long getPage_id() {
        return Page_id;
    }

    public void setPage_id(long page_id) {
        Page_id = page_id;
    }

    public String getPage_name() {
        return page_name;
    }

    public void setPage_name(String page_name) {
        this.page_name = page_name;
    }

    public boolean isPanelAdminRole() {
        return panelAdminRole;
    }

    public void setPanelAdminRole(boolean panelAdminRole) {
        this.panelAdminRole = panelAdminRole;
    }

    public boolean isAdminRole() {
        return AdminRole;
    }

    public void setAdminRole(boolean adminRole) {
        AdminRole = adminRole;
    }

    public boolean isUserRole() {
        return userRole;
    }

    public void setUserRole(boolean userRole) {
        this.userRole = userRole;
    }
}
