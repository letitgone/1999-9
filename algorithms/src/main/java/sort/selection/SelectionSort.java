package sort.selection;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Author ZhangGJ
 * @Date 2021/01/13 07:49
 */
public class SelectionSort implements Serializable, Comparable {

    private static final long serialVersionUID = 7340229669380539614L;

    private String name;

    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "SelectionSort{" + "name='" + name + '\'' + ", id=" + id + '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SelectionSort that = (SelectionSort) o;
        return Objects.equals(name, that.name) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public int compareTo(Object o) {
        return compare(this, (SelectionSort) o);
    }

    private int compare(SelectionSort o, SelectionSort o1) {
        return o.getId() - o1.getId();
    }
}
