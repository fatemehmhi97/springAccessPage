package com.version6.demo6.Services;

import com.version6.demo6.Models.PageAccess;
import com.version6.demo6.Models.Role;


public interface AccessService {

    Role findRoleByName(String name);
    Boolean save_PageAccess(PageAccess pageAccess);

}
