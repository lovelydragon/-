import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    //当n足够大可能会导致栈溢出
    //另一种解决方案是使用01列出所有情况,然后在筛选出正确的即可将问题转换为给定n个01列出所有可能的排序
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuffer path = new StringBuffer("");
        findAll(n,n,list,path);
        return list;
    }
    //递归查找所有满足要求的结果
    public void findAll(int left,int right,List<String> list,StringBuffer path){
        if (left == 0 && right == 0){
            list.add(path.toString());
            return;
        }
        if (left>0){
            path.append("(");
            findAll(left-1,right,list,path);
            path.deleteCharAt(path.length()-1);
        }
        if (right>0&&right>left){
            path.append(")");
            findAll(left,right-1,list,path);
            path.deleteCharAt(path.length()-1);
        }
    }
}
