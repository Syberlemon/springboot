# springboot
1、springboot单个表数据，分条数查询
（1）用到了注解FeignClient，as调用ds，ds调用数据库
（2）分表，此代码中是有个分布表存哪些数据在哪张表中，查是去各个表中查询然后汇总，写是判断改写哪张表再去写。不应该用limit，limit跟分页类似了，容易受排序影响，应该有个id寻找规则。

2、springboot根据语言调不通ds数据库
（1）有多个ds，根据语言不同，调用不同的ds