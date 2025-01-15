// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;

public class Class6589 extends Class6587
{
    public Class6589() {
        this(Object.class);
    }
    
    public Class6589(final Class<?> clazz) {
        this(new Class8051(method20021(clazz)));
    }
    
    private static Class<?> method20021(final Class<?> clazz) {
        if (clazz != null) {
            return clazz;
        }
        throw new NullPointerException("Root class must be provided.");
    }
    
    public Class6589(final Class8051 class8051) {
        this(class8051, null);
    }
    
    public Class6589(final Class8051 class8051, final Collection<Class8051> collection) {
        if (class8051 != null) {
            this.field26129.put(null, new Class6000(this));
            if (!Object.class.equals(class8051.method26405())) {
                this.field26136 = new Class8542(class8051.method26405());
            }
            this.field26128.put(Class2085.field12055, new Class6008(this));
            this.field26128.put(Class2085.field12057, new Class6015(this));
            this.field26128.put(Class2085.field12056, new Class6017(this));
            this.method20009(class8051);
            if (collection != null) {
                final Iterator<Class8051> iterator = collection.iterator();
                while (iterator.hasNext()) {
                    this.method20009(iterator.next());
                }
            }
            return;
        }
        throw new NullPointerException("Root type must be provided.");
    }
    
    public Class6589(final String s) throws ClassNotFoundException {
        this(Class.forName(method20022(s)));
    }
    
    private static final String method20022(final String s) {
        if (s == null) {
            throw new NullPointerException("Root type must be provided.");
        }
        if (s.trim().length() != 0) {
            return s;
        }
        throw new Class2386("Root type must be provided.");
    }
    
    public Class<?> method20023(final Class7576 class7576) {
        final Class clazz = this.field26141.get(class7576.method23845());
        if (clazz == null) {
            final String method28659 = class7576.method23845().method28659();
            Class<?> method28660;
            try {
                method28660 = this.method20024(method28659);
            }
            catch (final ClassNotFoundException ex) {
                throw new Class2386("Class not found: " + method28659);
            }
            this.field26141.put(class7576.method23845(), method28660);
            return method28660;
        }
        return clazz;
    }
    
    public Class<?> method20024(final String s) throws ClassNotFoundException {
        try {
            return Class.forName(s, true, Thread.currentThread().getContextClassLoader());
        }
        catch (final ClassNotFoundException ex) {
            return Class.forName(s);
        }
    }
}
