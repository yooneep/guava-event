/** 
 * Project Name:guava-event <br/> 
 * File Name:package-info.java <br/> 
 * Package Name:com.example.demo.event.watch <br/> 
 * Date:2019年12月30日下午9:46:15 <br/> 
 * Copyright (c) 2019<br/> 
 * Author: qiaozhi@58.com All Rights Reserved. <br/> 
 * 
 */
/** 
 * Project Name:guava-event <br/> 
 * File Name:package-info.java <br/> 
 * Package Name:com.example.demo.event.watch <br/> 
 * Date:2019年12月30日下午9:46:15 <br/> 
 * @author qiaozhi@58.com 
 * @version  
 * @since JDK 1.8 
 * 
 */
/**
 * 此调度程序与AsyncEventBus的原始调度行为匹配。

在多线程环境中，我们无法保证此调度器的总体调度顺序，原因如下：

1、发布在不同线程上的事件的订阅者可以自由地相互交错。（一个线程上的事件，另一个线程上的B事件可以产生[a1、a2、a3、b1、b2]，[a1、b2、a2、a3、b2]，[a1、b2、b3、a2、a3]中的任何一个。）

2、订阅者实际上可能被以不同于添加到队列的顺序发送到。一个线程很容易占据队列的头部，紧接着另一个线程占据队列中的下一个元素。然后，第二个线程可以在第一个线程之前将其发送到订阅服务器。

所有这些让我真的很想知道在这里排队是否有价值。一个调度器只需循环遍历订阅者并将事件分派给每个订阅者，实际上可能会提供更强大的顺序保证，尽管在某些情况下，顺序显然会有所不同。
 */
package com.example.demo.event.watch;

