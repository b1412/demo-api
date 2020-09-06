package ${project.packageName}.service

import ${project.packageName}.dao.${entity.name}Dao
import ${project.packageName}.entity.${entity.name}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ${entity.name}Service(
@Autowired
val dao: ${entity.name}Dao
){
fun findAll(): List<${entity.name}> {
return dao.findAll()
}

fun add(${entity.name?lower_case}: ${entity.name}): ${entity.name} {
return dao.save(${entity.name?lower_case})
}
}
