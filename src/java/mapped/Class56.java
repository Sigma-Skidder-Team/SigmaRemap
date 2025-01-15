// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;

public class Class56<E> extends ArrayList<E>
{
    private final Object field137;
    
    public Class56() {
        this.field137 = new Object();
    }
    
    @Override
    public boolean add(final E e) {
        synchronized (this.field137) {
            return super.add(e);
        }
    }
    
    @Override
    public void add(final int index, final E element) {
        synchronized (this.field137) {
            super.add(index, element);
        }
    }
    
    @Override
    public boolean addAll(final Collection<? extends E> c) {
        synchronized (this.field137) {
            return super.addAll(c);
        }
    }
    
    @Override
    public boolean addAll(final int index, final Collection<? extends E> c) {
        synchronized (this.field137) {
            return super.addAll(index, c);
        }
    }
    
    @Override
    public void clear() {
        synchronized (this.field137) {
            super.clear();
        }
    }
    
    @Override
    public Object clone() {
        try {
            synchronized (this.field137) {
                final Class56 obj = (Class56)super.clone();
                obj.modCount = 0;
                final Field declaredField = ArrayList.class.getDeclaredField("elementData");
                declaredField.setAccessible(true);
                declaredField.set(obj, Arrays.copyOf((Object[])declaredField.get(this), this.size()));
                return obj;
            }
        }
        catch (final Throwable t) {
            throw t;
        }
    }
    
    @Override
    public boolean contains(final Object o) {
        synchronized (this.field137) {
            return super.contains(o);
        }
    }
    
    @Override
    public void ensureCapacity(final int minCapacity) {
        synchronized (this.field137) {
            super.ensureCapacity(minCapacity);
        }
    }
    
    @Override
    public E get(final int index) {
        synchronized (this.field137) {
            return super.get(index);
        }
    }
    
    @Override
    public int indexOf(final Object o) {
        synchronized (this.field137) {
            return super.indexOf(o);
        }
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        synchronized (this.field137) {
            return super.lastIndexOf(o);
        }
    }
    
    @Override
    public E remove(final int index) {
        synchronized (this.field137) {
            return super.remove(index);
        }
    }
    
    @Override
    public boolean remove(final Object o) {
        synchronized (this.field137) {
            return super.remove(o);
        }
    }
    
    @Override
    public boolean removeAll(final Collection<?> c) {
        synchronized (this.field137) {
            return super.removeAll(c);
        }
    }
    
    @Override
    public boolean retainAll(final Collection<?> c) {
        synchronized (this.field137) {
            return super.retainAll(c);
        }
    }
    
    @Override
    public E set(final int index, final E element) {
        synchronized (this.field137) {
            return super.set(index, element);
        }
    }
    
    @Override
    public List<E> subList(final int fromIndex, final int toIndex) {
        synchronized (this.field137) {
            return super.subList(fromIndex, toIndex);
        }
    }
    
    @Override
    public Object[] toArray() {
        synchronized (this.field137) {
            return super.toArray();
        }
    }
    
    @Override
    public <T> T[] toArray(final T[] a) {
        synchronized (this.field137) {
            return super.toArray(a);
        }
    }
    
    @Override
    public void trimToSize() {
        synchronized (this.field137) {
            super.trimToSize();
        }
    }
    
    @Override
    public ListIterator<E> listIterator() {
        return (ListIterator<E>)new Class7240(this, 0);
    }
    
    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>)new Class7239(this);
    }
}
