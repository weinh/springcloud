# springcloud
springcloud学习

# 模块
eureka_server
>注册发现服务器

eureka_client
>注册发现客户端，实现业务，基础服务，供上层服务调用，基础服务、上层服务是相对的

service_ribbon
>上层服务调用基础服务的方式，通过RestTemplate实现，定义断路器(Hystrix)实现快速失败

service-feign
>上层服务调用基础服务的方式，通过注解实现，定义断路器(Hystrix)实现快速失败

service-zuul
>url路由规则设定，提供过滤器，实现请求拦截过滤等

config-server
>配置服务中心，将配置文件放远程，达到统一配置的效果

config-client
>配置服务客户端，可以根据配置服务中心的配置获取需要的配置信息