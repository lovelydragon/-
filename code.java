package leetCode;
//最小覆盖字串
public class MinWindow {
public static void main(String[] args) {
	String S = "ADOBECODEBANC";
	String T = "ABC";
	System.out.println(minWindow(S, T));
}
private static String minWindow(String S,String T) {
	String ret = "";
	char[] sc = S.toCharArray();
	char[] tc = T.toCharArray();
	int[] s = new int[26];
	int[] t = new int[26];
	for(int i=0;i<26;i++) {
		s[i]=0;
		t[i]=0;
	}
	for(int i=0;i<tc.length;i++)
		t[tc[i]-'A'] = 1;
	int ds = 0;
	int l = 0;
	for(int i=0;i<sc.length;i++) {
		if(s[sc[i]-'A']==0&&t[sc[i]-'A']==1)
			ds++;
		s[sc[i]-'A']++;
		for(;l<=i;l++) {
			if(t[sc[l]-'A']==1&&s[sc[l]-'A']==1) {//当前左边即为t中要求字符且只有一个，所以不能移
				if(ds == T.length()) {//s包含t
					if(ret.isEmpty())
						ret = S.substring(l, i+1);
					else
						ret = minstr(ret,S.substring(l,i+1));
					
					s[sc[l]-'A']--;
					l++;
					ds --;
				}
				break;
			}
			//为多个或不为都应该向右移
			s[sc[l]-'A']--;
		}
	}
	return ret;
}
//最小字符串
private static String minstr(String str1 , String str2) {
	return str1.length()>str2.length()?str2:str1;
}
//是否为字串
private boolean is_sub(int[] substr,int[] str) {
	for(int i=0;i<26;i++) {
		if(substr[i] >0 && str[i]==0)
			return false;
	}
	return true;
}
}
