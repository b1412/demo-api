package ${project.packageName}.controller

import ${project.packageName}.entity.${entity.name}
import ${project.packageName}.service.${entity.name}Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ${entity.name}Controller (
@Autowired
val service: ${entity.name}Service
){
@GetMapping
fun list(): ResponseEntity<*> {
return ResponseEntity.ok(service.findAll())
}

@PostMapping
fun add(@Validated ${entity.name?lower_case}: ${entity.name}): ResponseEntity<*> {
return ResponseEntity.ok(service.add(${entity.name?lower_case}))
}
}
