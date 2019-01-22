com.bfm.pageElements：yaml文件存放页面要素对应的xpath；
com.bfm.properties：yaml文件存储相关的公共要素，比如iframe，url；
com.bfm.VO：class类编写页面对象，比如LoginPageVO；
com.bfm.task：class编写每个页面中需要的动作；比如loginTask()；
com.bfm.utils：class编写相关的工具包；
com.bfm.tests：class编写相关的测试类；比如loginSucessTest()；
com.bfm.suites：class编写测试调用类；


依次分析下各个类的作用
loginPageElements.yaml：存放的登录界面所需要的主要要素，以后界面做调整后，只需要调整对应要素的查找方式，比如，userName对应的name；
url.yaml：存放相关的访问地址，比如，登录界面的地址，登录地址调整后，只需要调整该访问地址即可；
iframes.yaml：存放iframes的地址，对应操作界面的iframe调整后，调整该文件中的配件即可；
yamlFileDirector：相关静态变量，存放相关yaml文件存放的物理路径，以上配置文件的路径调整后，修改该文件的路径配置即可；
WebDriverConstruction：更加传递的浏览器类型，初始化相应的浏览器即可；包含fireFox，chrome等；
pageElementSearch：查询对应yaml文件在界面中的要素；
TreeNodeSearch：用于导航窗口的处理；
SwitchToWindow：用于切换iframes；
XmlToJavaVO：转换xml数据到界面VO对象中，界面数据的传递，使用反射机制，处理不同的界面VO；
XMLReader：读取xml文件的类；
YamlReader：读取yaml文件的类；
ElementOperator：静态类，包含界面要素需要处理的方法，比如处理，文本框的清空，下拉框的操作等；
LoginTask：实现登录界面中的功能；比如：登录，重置等；
loginPageTest：测试类，实现登录成功，登录失败等；
loginTestSuite：调用不同的测试类一起执行；