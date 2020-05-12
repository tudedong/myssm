# myssm
开源框架源码分析模块三

步骤：
1.整合spring和spring data jpa
2.再整合spring mvc
3.实现登录验证拦截功能（springmvc拦截器）
【验证】：
（1）项目启动进入首页，若未登录访问列表页（http://localhost:8080/resume/findAll）进行拦截，跳到登录页；
（2）若登录过后访问列表页直接进入列表页；
4.实现resume的查询、增加、修改、和删除
【验证】：
（1）查询
（2）增加
（3）修改
（4）删除