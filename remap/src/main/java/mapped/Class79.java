// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.Arrays;
import java.util.Comparator;
import java.util.AbstractSet;

public class Class79<T> extends AbstractSet<T>
{
    private final Comparator<T> field175;
    private T[] field176;
    private int field177;
    
    private Class79(final int i, final Comparator<T> field175) {
        this.field175 = field175;
        if (i >= 0) {
            this.field176 = method431(new Object[i]);
            return;
        }
        throw new IllegalArgumentException("Initial capacity (" + i + ") is negative");
    }
    
    public static <T extends Comparable<T>> Class79<T> method430(final int n) {
        return new Class79<T>(n, Comparator.naturalOrder());
    }
    
    private static <T> T[] method431(final Object[] array) {
        return (T[])array;
    }
    
    private int method432(final T key) {
        return Arrays.binarySearch(this.field176, 0, this.field177, key, this.field175);
    }
    
    private static int method433(final int n) {
        return -n - 1;
    }
    
    @Override
    public boolean add(final T t) {
        final int method432 = this.method432(t);
        if (method432 < 0) {
            this.method435(t, method433(method432));
            return true;
        }
        return false;
    }
    
    private void method434(int n) {
        if (n > this.field176.length) {
            if (this.field176 == ObjectArrays.DEFAULT_EMPTY_ARRAY) {
                if (n < 10) {
                    n = 10;
                }
            }
            else {
                n = (int)Math.max(Math.min(this.field176.length + (long)(this.field176.length >> 1), 2147483639L), n);
            }
            final Object[] array = new Object[n];
            System.arraycopy(this.field176, 0, array, 0, this.field177);
            this.field176 = (T[])method431(array);
        }
    }
    
    private void method435(final T t, final int n) {
        this.method434(this.field177 + 1);
        if (n != this.field177) {
            System.arraycopy(this.field176, n, this.field176, n + 1, this.field177 - n);
        }
        this.field176[n] = t;
        ++this.field177;
    }
    
    private void method436(final int n) {
        --this.field177;
        if (n != this.field177) {
            System.arraycopy(this.field176, n + 1, this.field176, n, this.field177 - n);
        }
        this.field176[this.field177] = null;
    }
    
    private T method437(final int n) {
        return this.field176[n];
    }
    
    public T method438(final T t) {
        final int method432 = this.method432(t);
        if (method432 < 0) {
            this.method435(t, method433(method432));
            return t;
        }
        return this.method437(method432);
    }
    
    @Override
    public boolean remove(final Object o) {
        final int method432 = this.method432(o);
        if (method432 < 0) {
            return false;
        }
        this.method436(method432);
        return true;
    }
    
    public T method439() {
        return this.method437(0);
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.method432(o) >= 0;
    }
    
    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>)new Class7253(this, null);
    }
    
    @Override
    public int size() {
        return this.field177;
    }
    
    @Override
    public Object[] toArray() {
        return this.field176.clone();
    }
    
    @Override
    public <U> U[] toArray(final U[] array) {
        if (array.length >= this.field177) {
            System.arraycopy(this.field176, 0, array, 0, this.field177);
            if (array.length > this.field177) {
                array[this.field177] = null;
            }
            return array;
        }
        return Arrays.copyOf(this.field176, this.field177, (Class<? extends U[]>)array.getClass());
    }
    
    @Override
    public void clear() {
        Arrays.fill(this.field176, 0, this.field177, null);
        this.field177 = 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof Class79) {
                final Class79 class79 = (Class79)o;
                if (this.field175.equals(class79.field175)) {
                    return this.field177 == class79.field177 && Arrays.equals(this.field176, class79.field176);
                }
            }
            return super.equals(o);
        }
        return true;
    }
}
