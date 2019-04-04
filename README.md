# 使用说明
- 该分支继承了Spring Data JPA,在启动时候会自动创建表（数据库手动创建）
- 保存domain中手动创建的实体类
- 修改generatorConfig.xml文件与自己项目相符合
- 运行gradle中定义的task，mbGenerator
- 这时原来的domain中的实体类会被覆盖掉，使用刚才保存的实体类，覆盖掉自动生成的
- 生成的domain和mapper没有加注解，自行加上否则运行报错
- 实例中提供了使用Spring Data JPA和使用mybatis访问数据库的示例。