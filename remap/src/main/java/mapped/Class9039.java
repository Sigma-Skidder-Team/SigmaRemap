// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class Class9039
{
    private static String[] field38251;
    private static final Class6991 field38252;
    private static final Class6991 field38253;
    private static final Class6991 field38254;
    private static final Class6991 field38255;
    public static final Class6991 field38256;
    private final Class570 field38257;
    private final List<Class9311> field38258;
    private Class6988 field38259;
    private int field38260;
    private int field38261;
    
    public Class9039(final Class570 field38257) {
        this.field38258 = Lists.newArrayList();
        this.field38260 = -1;
        this.field38259 = new Class6989();
        this.field38257 = field38257;
    }
    
    public Class6991 method32492(final int n) {
        final int n2 = n + this.field38261 * 6;
        if (this.field38261 > 0 && n == 0) {
            return Class9039.field38253;
        }
        if (n == 7) {
            return (n2 >= this.field38259.method21400().size()) ? Class9039.field38255 : Class9039.field38254;
        }
        if (n != 8) {
            return (Class6991)((n2 >= 0 && n2 < this.field38259.method21400().size()) ? MoreObjects.firstNonNull(this.field38259.method21400().get(n2), (Object)Class9039.field38256) : Class9039.field38256);
        }
        return Class9039.field38252;
    }
    
    public List<Class6991> method32493() {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i <= 8; ++i) {
            arrayList.add(this.method32492(i));
        }
        return arrayList;
    }
    
    public Class6991 method32494() {
        return this.method32492(this.field38260);
    }
    
    public Class6988 method32495() {
        return this.field38259;
    }
    
    public void method32496(final int field38260) {
        final Class6991 method32492 = this.method32492(field38260);
        if (method32492 != Class9039.field38256) {
            if (this.field38260 == field38260 && method32492.method21405()) {
                method32492.method21402(this);
            }
            else {
                this.field38260 = field38260;
            }
        }
    }
    
    public void method32497() {
        this.field38257.method3326(this);
    }
    
    public int method32498() {
        return this.field38260;
    }
    
    public void method32499(final Class6988 field38259) {
        this.field38258.add(this.method32500());
        this.field38259 = field38259;
        this.field38260 = -1;
        this.field38261 = 0;
    }
    
    public Class9311 method32500() {
        return new Class9311(this.field38259, this.method32493(), this.field38260);
    }
    
    static {
        field38252 = new Class6996(null);
        field38253 = new Class6995(-1, true);
        field38254 = new Class6995(1, true);
        field38255 = new Class6995(1, false);
        field38256 = new Class6992();
    }
}
