// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

public class Class4961
{
    private static String[] field21294;
    private ConcurrentMap<String, ConcurrentLinkedQueue<Class4659>> field21295;
    
    public Class4961() {
        this.field21295 = new ConcurrentHashMap<String, ConcurrentLinkedQueue<Class4659>>();
    }
    
    public Class4961 method14976(final String s, final Class4659 e) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.field21295.get(s);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            final ConcurrentLinkedQueue concurrentLinkedQueue2 = this.field21295.putIfAbsent(s, concurrentLinkedQueue);
            if (concurrentLinkedQueue2 != null) {
                concurrentLinkedQueue = concurrentLinkedQueue2;
            }
        }
        concurrentLinkedQueue.add(e);
        return this;
    }
    
    public Class4961 method14977(final String s, final Class4659 class4659) {
        this.method14976(s, new Class4662(this, s, class4659));
        return this;
    }
    
    public Class4961 method14978() {
        this.field21295.clear();
        return this;
    }
    
    public Class4961 method14979(final String s) {
        this.field21295.remove(s);
        return this;
    }
    
    public Class4961 method14980(final String s, final Class4659 class4659) {
        final ConcurrentLinkedQueue concurrentLinkedQueue = this.field21295.get(s);
        if (concurrentLinkedQueue != null) {
            final Iterator iterator = concurrentLinkedQueue.iterator();
            while (iterator.hasNext()) {
                if (!method14981(class4659, (Class4659)iterator.next())) {
                    continue;
                }
                iterator.remove();
                break;
            }
        }
        return this;
    }
    
    private static boolean method14981(final Class4659 class4659, final Class4659 obj) {
        return class4659.equals(obj) || (obj instanceof Class4662 && class4659.equals(((Class4662)obj).field20174));
    }
    
    public Class4961 method14942(final String s, final Object... array) {
        final ConcurrentLinkedQueue concurrentLinkedQueue = this.field21295.get(s);
        if (concurrentLinkedQueue != null) {
            final Iterator iterator = concurrentLinkedQueue.iterator();
            while (iterator.hasNext()) {
                ((Class4659)iterator.next()).method13945(array);
            }
        }
        return this;
    }
    
    public List<Class4659> method14982(final String s) {
        final ConcurrentLinkedQueue c = this.field21295.get(s);
        return (c == null) ? new ArrayList<Class4659>(0) : new ArrayList<Class4659>(c);
    }
    
    public boolean method14983(final String s) {
        final ConcurrentLinkedQueue concurrentLinkedQueue = this.field21295.get(s);
        return concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty();
    }
}
