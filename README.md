#### 聚合项目
>参考地址 https://blog.csdn.net/baidu_41885330/article/details/81875395

1.新建springboot项目，作为parent   
2.在当前项目下新建moudle,需要几个字项目创建几个moudle   
3.修改parent
```$xslt
1. 修改pom中package为pom
2. 添加子项目<moudle>
3. 配置打包plugin
```
4.修改子项目
```$xslt
1. 修改parent依赖为父项目grouId、artifi、version
2. 添加子项目依赖其他项目
3. 如果当前项目不需要启动则删除application、resource
4. 删除build依赖
```
5.打包
```$xslt
在pom项目中 mvn clean package
```

