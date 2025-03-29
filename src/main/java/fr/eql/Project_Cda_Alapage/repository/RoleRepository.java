package fr.eql.Project_Cda_Alapage.repository;

import fr.eql.Project_Cda_Alapage.entity.Role;
import fr.eql.Project_Cda_Alapage.entity.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRoleName(RoleName roleName);

}
