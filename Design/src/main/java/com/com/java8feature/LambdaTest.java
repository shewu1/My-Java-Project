package com.com.java8feature;

import java.util.*;

/**
 * @Description:
 * @Copyright: Copyright (c) 2020  ALL RIGHTS RESERVED.
 * @Company: 成都旺小宝科技有限公司
 * @Author: jtb
 * @CreateDate: 2020/11/19 9:18
 * @UpdateDate: 2020/11/19 9:18
 * @UpdateRemark: init
 * @Version: 1.0
 * @menu lambda表达式
 */
public class LambdaTest {
    public static void main(String[] args) {
        /*List<String> list = Arrays.asList("df","oeid","akie","ooeee","jqpqe","juaod","akhjka");
        sort(list);*/

       /* List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        stream(stringCollection);*/

        String str  =  "jdfuejsskfa";
        System.out.println(Math.min(8, 5));
        System.out.println(str.split("").length);
        System.out.println(str.substring(5));
        int [] nums =  {-1, 0, 1, 2, -1, -4};
      /* List<List<Integer>> lists =  threeSum(nums);
        System.out.println(lists);*/

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);      //对数组进行排序
        HashSet<List<Integer>> Res=new HashSet<>(); //创建HashSet对象
        for(int i=0;i<=nums.length-3;i++){
            if(nums[i]>0)
                break;    //若数组中的最小数大于0，直接跳出循环
            int left=i+1;  //左指针
            int right=nums.length-1;  //右指针
            while(left<right){
                int s=nums[i]+nums[left]+nums[right];//三数之和
                if(s<0){
                    left++;       //小于0，左指针右移
                }else if(s>0){
                    right--;     //大于0，右指针左移
                }else{
                    Res.add(Arrays.asList(nums[i],nums[left++],nums[right--]));    //等于0，满足条件，记录下来
                }
            }
        }
        return new ArrayList<>(Res);

    }

    public static void sort(List<String> list){
        //老方法
        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });*/
        //lambda 表达式方法
        Collections.sort(list, (a,b)->b.compareTo(a) );
        System.out.println(list);
    }

    public static void stream(List<String> list){
        //List ll = list.stream().filter((s)-> s.startsWith("a")).collect(Collectors.toList());
//        list.stream().sorted().filter((a)->a.startsWith("a")).forEach(System.out::println);
//        System.out.println(list);
        /*map操作*/
        //list.stream().map(String::toUpperCase).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
        /*mathch匹配-是最终操作*/
        /*boolean a = list.stream().anyMatch((s)->s.startsWith("a"));
        System.out.println(a);
        boolean b = list.stream().allMatch((s)->s.startsWith("a"));
        System.out.println(b);
        boolean c = list.stream().noneMatch(s->s.startsWith("ajtb"));
        System.out.println(c);*/

        //计数-是最终操作
        long cout = list.stream().filter(s->s.startsWith("b")).count();
        System.out.println(cout);


    }
}
