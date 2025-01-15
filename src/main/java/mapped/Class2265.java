// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nonnull;
import com.google.common.collect.Lists;
import java.util.Arrays;
import org.apache.commons.lang3.Validate;
import java.util.List;
import java.util.AbstractList;

public class Class2265<E> extends AbstractList<E>
{
    private static String[] field13826;
    private final List<E> field13827;
    private final E field13828;
    
    public static <E> Class2265<E> method8506() {
        return new Class2265<E>();
    }
    
    public static <E> Class2265<E> method8507(final int n, final E val) {
        Validate.notNull((Object)val);
        final Object[] a = new Object[n];
        Arrays.fill(a, val);
        return new Class2265<E>((List<Object>)Arrays.asList((E[])a), val);
    }
    
    @SafeVarargs
    public static <E> Class2265<E> method8508(final E e, final E... a) {
        return new Class2265<E>(Arrays.asList(a), e);
    }
    
    public Class2265() {
        this(Lists.newArrayList(), null);
    }
    
    public Class2265(final List<E> field13827, final E field13828) {
        this.field13827 = field13827;
        this.field13828 = field13828;
    }
    
    @Nonnull
    @Override
    public E get(final int n) {
        return this.field13827.get(n);
    }
    
    @Override
    public E set(final int n, final E e) {
        Validate.notNull((Object)e);
        return this.field13827.set(n, e);
    }
    
    @Override
    public void add(final int n, final E e) {
        Validate.notNull((Object)e);
        this.field13827.add(n, e);
    }
    
    @Override
    public E remove(final int n) {
        return this.field13827.remove(n);
    }
    
    @Override
    public int size() {
        return this.field13827.size();
    }
    
    @Override
    public void clear() {
        if (this.field13828 != null) {
            for (int i = 0; i < this.size(); ++i) {
                this.set(i, this.field13828);
            }
        }
        else {
            super.clear();
        }
    }
}
