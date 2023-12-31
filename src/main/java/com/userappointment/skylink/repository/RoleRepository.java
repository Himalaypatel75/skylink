package com.userappointment.skylink.repository;
import com.userappointment.skylink.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findByRoleName(String RoleName);

}
