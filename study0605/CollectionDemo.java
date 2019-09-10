package study0605;


import java.util.ArrayList;
import java.util.Collection;

/**
 * 为什么出现集合类?
 * 		面向对象语言对事物的体现都是以对象的形式，所以为了方便对多个对象的操作，用前面所学知识，我们只能采用对象数组实现。
 * 		但是，对象数组的长度又是固定的，适应不了变化的需求，所以，java就提供了集合类供我们使用。
 *
 * 集合类的特点：
 * 		A:长度可变
 * 		B:只能存储对象
 * 		C:可以存储不同类型的对象
 *
 * 面试题：数组和集合的区别?
 * 		A:集合长度可变；集合只能存储引用数据类型；集合可以存储不同数据类型的元素
 * 		B:数组长度固定；数组可以存储引用数据类型，也可以存储基本数据类型；数组存储的是同一种数据类型的元素
 *
 * 由于我们的功能需求不太一样，所以，java就提供了多种集合类供我们使用。这些集合类的本质区别：其实是底层的数据结构不同。
 * 数据结构：数据的存储方式。
 *
 * 集合的继承体系结构
 * 		多种集合类的数据结构不同，但是功能相似，所以，我们不断的向上抽取，就形成了集合的继承体系结构
 * 			Collection
 * 				|--List
 * 					|--ArrayList
 * 					|--Vector
 * 					|--LinkedList
 * 				|--Set
 * 					|--HashSet
 * 					|--TreeSet
 *
 * Collection的功能：
 * A:添加功能
 * 		boolean add(Object obj):往集合中添加一个元素
 * 		boolean addAll(Collection c):往集合中添加多个元素。
 * B:获取功能
 * 		Iterator iterator():迭代器
 * 		int size():集合的元素个数，长度
 * C:删除功能
 * 		void clear():清空集合的所有元素
 * 		boolean remove(Object obj):从集合中移除一个元素
 * 		boolean removeAll(Collection c):从集合中移除多个元素，删除一个就算删除了，会返回true
 * D:判断功能
 * 		boolean contains(Object obj):判断集合中是否包含指定的元素
 * 		boolean containsAll(Collection c):判断集合中是否包含指定的多个元素，全部包含才是包含
 * 		boolean isEmpty():判断集合是否为空
 * E:交集元素
 * 		boolean retainAll(Collection c)
 * F:转数组
 * 		Object[] toArray():把集合转成对象数组

 */

public class CollectionDemo {
    public static void main(String args[]) {
        Collection c = new ArrayList();

        //boolean add(Object obj):往集合中添加一个元素
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);

        //void clear():清空集合的所有元素
        c.clear();
        System.out.println(c);

        c.add("aaaaaaa");
        c.add("Silhouettes of me");

        //boolean remove(Object obj):从集合中移除一个元素
        System.out.println("remove 'aaaaaaa': " + c.remove("aaaaaaa"));
        System.out.println("remove 'java': " + c.remove("java"));

        //boolean isEmpty():判断集合是否为空
        System.out.println("is empty? " + c.isEmpty());

        //boolean contains(Object obj):判断集合中是否包含指定的元素
        System.out.println("contain 'java'? " + c.remove("java"));

        //int size():集合的元素个数，长度
        System.out.println("size: " + c.size());

        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("aaaaaaa");
        c.add("Silhouettes of me");

        //Object[] toArray():把集合转成对象数组
        Object[] objs = c.toArray();

        //go through the array -- objs
        for (int i = 0; i < objs.length ; i++) {
            System.out.println(objs[i]);
        }

    }

}
