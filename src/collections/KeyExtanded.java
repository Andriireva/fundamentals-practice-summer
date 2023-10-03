package collections;


import java.util.Objects;

// Dummy example
public class KeyExtanded
//        extends Key
{
    private Integer k;

    public KeyExtanded(String name, Long id, Integer k) {
//        super(name, id);
        this.k = k;
    }

    public void setK(Integer k) {
        this.k = k;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KeyExtanded that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(k, that.k);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), k);
    }
}
