package com.version6.demo6.Services;


import com.version6.demo6.Models.Access;
import com.version6.demo6.Models.PageAccess;
import com.version6.demo6.Models.Role;
import com.version6.demo6.Repositories.AccessRepository;
import com.version6.demo6.Repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AccessServiceImpl implements AccessService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AccessRepository accessRepository;

    @Override
    public Role findRoleByName(String name) {
        return roleRepository.findByName(name);
    }

    @Override
    public Boolean save_PageAccess(PageAccess pageAccess) {

        if(accessRepository.findByPageName(pageAccess.getPage_name())==null) {
            Access access = new Access();
            List<Role> roles = new ArrayList<>();

            if(pageAccess.isPanelAdminRole())
                roles.add(roleRepository.getOne(Long.valueOf(1)));

            if(pageAccess.isAdminRole())
                roles.add(roleRepository.getOne(Long.valueOf(2)));

            if(pageAccess.isUserRole())
                roles.add(roleRepository.getOne(Long.valueOf(3)));

            access.setPageName(pageAccess.getPage_name());
            access.setRoles(roles);

            accessRepository.save(access);

            return true;
        }

        return false;
    }
}
