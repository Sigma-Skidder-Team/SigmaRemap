// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

public abstract class Class4654
{
    public Class1854 field20140;
    public Class759 field20141;
    public final Int2ObjectMap<Class6772> field20142;
    public int field20143;
    public int field20144;
    public int field20145;
    public boolean field20146;
    public boolean field20147;
    public boolean field20148;
    
    public Class4654() {
        this.field20142 = (Int2ObjectMap<Class6772>)new Int2ObjectOpenHashMap();
    }
    
    public void method13900(final Class1854 field20140, final Class759 field20141) {
        this.field20140 = field20140;
        this.field20141 = field20141;
        this.field20142.clear();
        this.field20143 = Class9546.method35642(field20141.method1930() + 1.0f);
        this.field20144 = Class9546.method35642(field20141.method1931() + 1.0f);
        this.field20145 = Class9546.method35642(field20141.method1930() + 1.0f);
    }
    
    public void method13901() {
        this.field20140 = null;
        this.field20141 = null;
    }
    
    public Class6772 method13919(final int n, final int n2, final int n3) {
        return (Class6772)this.field20142.computeIfAbsent(Class6772.method20666(n, n2, n3), p3 -> new Class6772(n4, n6, n7));
    }
    
    public abstract Class6772 method13902();
    
    public abstract Class6773 method13903(final double p0, final double p1, final double p2);
    
    public abstract int method13904(final Class6772[] p0, final Class6772 p1);
    
    public abstract Class257 method13908(final Class1855 p0, final int p1, final int p2, final int p3, final Class759 p4, final int p5, final int p6, final int p7, final boolean p8, final boolean p9);
    
    public abstract Class257 method13913(final Class1855 p0, final int p1, final int p2, final int p3);
    
    public void method13922(final boolean field20146) {
        this.field20146 = field20146;
    }
    
    public void method13923(final boolean field20147) {
        this.field20147 = field20147;
    }
    
    public void method13924(final boolean field20148) {
        this.field20148 = field20148;
    }
    
    public boolean method13925() {
        return this.field20146;
    }
    
    public boolean method13926() {
        return this.field20147;
    }
    
    public boolean method13927() {
        return this.field20148;
    }
}
