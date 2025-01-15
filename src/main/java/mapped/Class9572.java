// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Date;

public class Class9572
{
    private static String[] field41602;
    public int field41603;
    public int field41604;
    public Class2186 field41605;
    public Date field41606;
    public Date field41607;
    
    public Class9572(final int n, final int n2) {
        this(n, n2, Class2186.field12964);
    }
    
    public Class9572(final int field41603, final int field41604, final Class2186 class2186) {
        this.field41605 = Class2186.field12964;
        this.field41603 = field41603;
        this.field41604 = field41604;
        this.field41606 = new Date();
        this.field41607 = new Date();
        this.method35855(class2186);
    }
    
    public int method35854() {
        return this.field41603;
    }
    
    public void method35855(final Class2186 field41605) {
        if (this.field41605 == field41605) {
            return;
        }
        switch (Class8094.field33328[field41605.ordinal()]) {
            case 1: {
                this.field41606 = new Date(new Date().getTime() - (long)(this.method35858() * this.field41603));
                break;
            }
            case 2: {
                this.field41607 = new Date(new Date().getTime() - (long)((1.0f - this.method35858()) * this.field41604));
                break;
            }
        }
        this.field41605 = field41605;
    }
    
    public void method35856(final float n) {
        switch (Class8094.field33328[this.field41605.ordinal()]) {
            case 1: {
                this.field41606 = new Date(new Date().getTime() - (long)(n * this.field41603));
                break;
            }
            case 2: {
                this.field41607 = new Date(new Date().getTime() - (long)((1.0f - n) * this.field41604));
                break;
            }
        }
    }
    
    public Class2186 method35857() {
        return this.field41605;
    }
    
    public float method35858() {
        if (this.field41605 != Class2186.field12964) {
            return 1.0f - Math.min(this.field41604, new Date().getTime() - this.field41607.getTime()) / (float)this.field41604;
        }
        return Math.min(this.field41603, new Date().getTime() - this.field41606.getTime()) / (float)this.field41603;
    }
    
    public static float method35859(final Date date, final Date date2, final float a, final float a2) {
        return Math.max(0.0f, Math.min(1.0f, Math.min(a, (float)(new Date().getTime() - ((date != null) ? date.getTime() : new Date().getTime()))) / a * (1.0f - Math.min(a2, (float)(new Date().getTime() - ((date2 != null) ? date2.getTime() : new Date().getTime()))) / a2)));
    }
    
    public static float method35860(final Date date, final float a) {
        return Math.max(0.0f, Math.min(1.0f, Math.min(a, (float)(new Date().getTime() - ((date != null) ? date.getTime() : new Date().getTime()))) / a));
    }
    
    public static float method35861(final Date date, final Date date2, final float n) {
        return method35859(date, date2, n, n);
    }
    
    public static boolean method35862(final Date date, final float n) {
        return date != null && new Date().getTime() - date.getTime() > n;
    }
}
