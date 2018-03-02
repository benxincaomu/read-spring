# spring读取properties文件

## 读取方式--注解

使用`org.springframework.context.annotation.PropertySource` 注解来读取配置文件，此注解作用在类，其value值为配置文件的位置。

我这里使用`@PropertySource({"classpath:props.properties"})` 来读取classpath路径下的props.properties。

@PropertySource({"classpath:props.properties"})







