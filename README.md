# demo-api [![Build Status](https://travis-ci.com/b1412/demo-api.svg?branch=master)](https://travis-ci.com/b1412/demo-api)
  a demo to use https://github.com/b1412/kotlin-code-generator

#

## demo-generator
```
  implementation("com.github.b1412:kotlin-code-generator:[version]")
```

## create a task to generate code

  create a class extend from SingleTask/MultipleTask
  | Properties | Description |
  |----------|:-------------:|
  | folder   |       |
  | filename |       |
  | templatePath |  |
  | replaceFile |  |
  | entityExtProcessors| |


  ```kotlin
  class DaoTask : MultipleTask(
      replaceFile = true,
      folder = { project, _ -> TaskConstants.apiPath + TaskConstants.srcPath + project.packageName.replace(".", "/") + "/" + "dao" },
      filename = { _, entity -> entity!!.name + "Dao.kt" },
      templatePath = "kotlin/dao.ftl"
  )
  ```
##
