package zad2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ListSetTable {
    List<String> mylist;
    Set<Integer> myset;
    Long[] mytable;

    @Override
    public String toString() {
        return "ListSetTable{" +
                "mylist=" + mylist +
                ", myset=" + myset +
                ", mytable=" + Arrays.toString(mytable) +
                '}';
    }

    public List<String> getMylist() {
        return mylist;
    }

    public void setMylist(List<String> mylist) {
        this.mylist = mylist;
    }

    public Set<Integer> getMyset() {
        return myset;
    }

    public void setMyset(Set<Integer> myset) {
        this.myset = myset;
    }

    public Long[] getMytable() {
        return mytable;
    }

    public void setMytable(Long[] mytable) {
        this.mytable = mytable;
    }
}
