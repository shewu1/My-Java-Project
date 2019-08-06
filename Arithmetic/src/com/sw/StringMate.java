package com.sw;
/**
 * 有一个文本串S，和一个模式串P，现在要查找P在S中的第一次匹配位置，怎么查找呢？
 * 
 * */
public class StringMate {
	public static void main(String[] args) {
		String s = "你你你说从出生那年就开始飘着，你说你会哭，不是因为在乎。";
		String p = "你你说";
		System.out.println(baoli(s, p));
		System.out.println(baoli2(s, p));
		 System.out.println(kmpMatch("abcabaabaabcacb", "abaabcac"));
		
	}
	/**暴力解决方法一 for循环*/
	public static int baoli(String s,String p){
		int sSize = s.length();
		int pSize = p.length();
		if (sSize>0 && pSize>0) {
			for (int i = 0; i < sSize; i++) {
				for (int j = 0; j < pSize; j++) {
					if (s.charAt(i) == p.charAt(j)) {
						i++;
					}else{
						i = i-j;
						break;
					}
					if (j==pSize-1) {
						return i-pSize;
					}
				}
			}
		}else{
			return -1;
		}
		return -1;
	}
	/**暴力解决方法2 while*/
	public static int baoli2(String s,String p){
		int sSize = s.length();
		int pSize = p.length();
		int i =0 ;
		int j =0;
		while (i<sSize && j<pSize) {
			if (s.charAt(i)==p.charAt(j)) {
				i++;
				j++;
			}else {
				i=i-j+1;
				j=0;
			}
			if (j==pSize) {
				return i-j;
			}
		}
		return -1;
	}
	
	
	 /**
     * 求出一个字符数组的next数组
     * @param t 字符数组
     * @return next数组
     */
    public static int[] getNextArray(char[] t) {
        int[] next = new int[t.length];
        next[0] = -1;
        next[1] = 0;
        int k;
        for (int j = 2; j < t.length; j++) {
            k=next[j-1];
            while (k!=-1) {
                if (t[j - 1] == t[k]) {
                    next[j] = k + 1;
                    break;
                }
                else {
                    k = next[k];
                }
                next[j] = 0;  //当k==-1而跳出循环时，next[j] = 0，否则next[j]会在break之前被赋值
            }
        }
        return next;
    }
	
    /**
     * 对主串s和模式串t进行KMP模式匹配
     * @param s 主串
     * @param t 模式串
     * @return 若匹配成功，返回t在s中的位置（第一个相同字符对应的位置），若匹配失败，返回-1
     */
    public static int kmpMatch(String s, String t){
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        int[] next = getNextArray(t_arr);
        int i = 0, j = 0;
        while (i<s_arr.length && j<t_arr.length){
            if(j == -1 || s_arr[i]==t_arr[j]){
                i++;
                j++;
            }
            else
                j = next[j];
        }
        if(j == t_arr.length)
            return i-j;
        else
            return -1;
    }

}
