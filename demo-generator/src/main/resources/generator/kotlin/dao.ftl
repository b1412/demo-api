package ${project.packageName}.dao

import ${project.packageName}.entity.${entity.name}
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ${entity.name}Dao : JpaRepository<${entity.name}, Long>
