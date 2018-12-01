### 最小覆盖字串

1. 题目介绍
  leetcode链接：https://leetcode-cn.com/problems/minimum-window-substring/
  为了简便，输入做出如下的限制
    1.输入都为由大写构成的字符串
    2.不考虑输入为空的情况
2. 遍历
3. 循序渐进
4. dp算法
  1）通过26长度的数组判断是否包含字串的所有字母
    1.统计两个字符串中字母的个数
    2.只要短字符串中某个字母不被包含完全，就返回false
  2）双指针移动
    1.首先
5. 举一反三
# 双指针
##  有序数组的 Two Sum
### 题目描述：在有序数组中找出两个数，使它们的和为 target。
  leetcode链接: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
  思路：在数组头和尾设两个指针，根据两个数的和与target比较来移动指针向中间靠拢
  

## 两数平方和
### 题目描述：判断一个数是否为两个数的平方和
  leetcode链接：https://leetcode.com/problems/sum-of-square-numbers/description/
  思路：在0设置一个指针，target的开方为另一个指针

