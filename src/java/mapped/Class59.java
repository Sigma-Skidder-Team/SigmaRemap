// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ListIterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class Class59 implements List
{
    private final List field139;
    
    public Class59(final List field139) {
        this.field139 = field139;
    }
    
    public abstract void method363(final Object p0);
    
    public List method364() {
        return this.field139;
    }
    
    @Override
    public int size() {
        synchronized (this) {
            return this.field139.size();
        }
    }
    
    @Override
    public boolean isEmpty() {
        synchronized (this) {
            return this.field139.isEmpty();
        }
    }
    
    @Override
    public boolean contains(final Object o) {
        synchronized (this) {
            return this.field139.contains(o);
        }
    }
    
    @Override
    public Iterator iterator() {
        synchronized (this) {
            return this.listIterator();
        }
    }
    
    @Override
    public Object[] toArray() {
        synchronized (this) {
            return this.field139.toArray();
        }
    }
    
    @Override
    public boolean add(final Object o) {
        this.method363(o);
        synchronized (this) {
            return this.field139.add(o);
        }
    }
    
    @Override
    public boolean remove(final Object o) {
        synchronized (this) {
            return this.field139.remove(o);
        }
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            this.method363(iterator.next());
        }
        synchronized (this) {
            return this.field139.addAll(collection);
        }
    }
    
    @Override
    public boolean addAll(final int n, final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            this.method363(iterator.next());
        }
        synchronized (this) {
            return this.field139.addAll(n, collection);
        }
    }
    
    @Override
    public void clear() {
        synchronized (this) {
            this.field139.clear();
        }
    }
    
    @Override
    public Object get(final int n) {
        synchronized (this) {
            return this.field139.get(n);
        }
    }
    
    @Override
    public Object set(final int n, final Object o) {
        synchronized (this) {
            return this.field139.set(n, o);
        }
    }
    
    @Override
    public void add(final int n, final Object o) {
        synchronized (this) {
            this.field139.add(n, o);
        }
    }
    
    @Override
    public Object remove(final int n) {
        synchronized (this) {
            return this.field139.remove(n);
        }
    }
    
    @Override
    public int indexOf(final Object o) {
        synchronized (this) {
            return this.field139.indexOf(o);
        }
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        synchronized (this) {
            return this.field139.lastIndexOf(o);
        }
    }
    
    @Override
    public ListIterator listIterator() {
        synchronized (this) {
            return this.field139.listIterator();
        }
    }
    
    @Override
    public ListIterator listIterator(final int n) {
        synchronized (this) {
            return this.field139.listIterator(n);
        }
    }
    
    @Override
    public List subList(final int n, final int n2) {
        synchronized (this) {
            return this.field139.subList(n, n2);
        }
    }
    
    @Override
    public boolean retainAll(final Collection collection) {
        synchronized (this) {
            return this.field139.retainAll(collection);
        }
    }
    
    @Override
    public boolean removeAll(final Collection collection) {
        synchronized (this) {
            return this.field139.removeAll(collection);
        }
    }
    
    @Override
    public boolean containsAll(final Collection collection) {
        synchronized (this) {
            return this.field139.containsAll(collection);
        }
    }
    
    @Override
    public Object[] toArray(final Object[] array) {
        synchronized (this) {
            return this.field139.toArray(array);
        }
    }
}
