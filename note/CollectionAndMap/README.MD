分类：
  Collection:
    Set
      TreeSet 基于红黑树实现，支持有序性操作，查找效率不如HashSet,1和logN
      HashSet 基于哈希表实现，支持快速查找，但不支持有序操作
      LinkedHashSet 与HashSet的查找速率相同，内部使用双向链表维护元素的插入顺序
    list
      ArrayList 基于动态数组实现，支持随机访问
      Vector  与ArrayList类似，但是线程安全的
      LinkedList  基于双向链表实现的，只能顺序访问，但可以快速的在链表中间插入和删除元素。可用作栈，队列和双向队列
    queue
      LinkedQueue 双向队列
      PriorityQueue 基于堆结构实现，优先队列
  map
    TreeMap 基于红黑树
    HashMap 基于哈希表
    HashTable 与HashMap类似，但线程安全，ConCurrentHashMap因为分段锁而效率更高
    LinkedHashMap 插入顺序或LRU顺序
    
aslist方法
  生成的list不存在add和remove方法但有set方法
  只能通过放入一个新的list才能使用add和remove方法--Collection.addAll
  
源码分析：
  ArrayList：
    
    
