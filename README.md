# springcloud
springcloud学习

# 模块
eureka_server
>注册发现服务器，通过简单配置达到高可用的注册发现服务器，唯一的不足是需要修改hosts文件，如下：
```
127.0.0.1 peer1
127.0.0.1 peer2
```

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
>配置服务客户端，可以根据配置服务中心的配置获取需要的配置信息，支持通过消息总线的的方式使配置修改及时生效

server-zipkin
>提供服务之间调用做跟踪记录使用，service-feign调用eureka_client，可以查看依赖关系