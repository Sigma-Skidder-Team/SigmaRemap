// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class Class8888
{
    private Class field37389;
    private int field37390;
    private ArrayDeque field37391;
    
    public Class8888(final Class field37389, final int field37390) {
        this.field37389 = null;
        this.field37390 = 0;
        this.field37391 = new ArrayDeque();
        this.field37389 = field37389;
        this.field37390 = field37390;
    }
    
    public synchronized Object method31284(final int length) {
        Object o = this.field37391.pollLast();
        if (o == null || Array.getLength(o) < length) {
            o = Array.newInstance(this.field37389, length);
        }
        return o;
    }
    
    public synchronized void method31285(final Object e) {
        if (e != null) {
            if (e.getClass().getComponentType() != this.field37389) {
                throw new IllegalArgumentException("Wrong component type");
            }
            if (this.field37391.size() < this.field37390) {
                this.field37391.add(e);
            }
        }
    }
}
