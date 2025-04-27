// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2077
{
    field11992(0, 96000, new int[] { 33, 512 }, new int[] { 31, 9 }), 
    field11993(1, 88200, new int[] { 33, 512 }, new int[] { 31, 9 }), 
    field11994(2, 64000, new int[] { 38, 664 }, new int[] { 34, 10 }), 
    field11995(3, 48000, new int[] { 40, 672 }, new int[] { 40, 14 }), 
    field11996(4, 44100, new int[] { 40, 672 }, new int[] { 42, 14 }), 
    field11997(5, 32000, new int[] { 40, 672 }, new int[] { 51, 14 }), 
    field11998(6, 24000, new int[] { 41, 652 }, new int[] { 46, 14 }), 
    field11999(7, 22050, new int[] { 41, 652 }, new int[] { 46, 14 }), 
    field12000(8, 16000, new int[] { 37, 664 }, new int[] { 42, 14 }), 
    field12001(9, 12000, new int[] { 37, 664 }, new int[] { 42, 14 }), 
    field12002(10, 11025, new int[] { 37, 664 }, new int[] { 42, 14 }), 
    field12003(11, 8000, new int[] { 34, 664 }, new int[] { 39, 14 }), 
    field12004(-1, 0, new int[] { 0, 0 }, new int[] { 0, 0 });
    
    private final int field12005;
    private final int field12006;
    private final int[] field12007;
    private final int[] field12008;
    
    public static Class2077 method8180(final int n) {
        Class2077 field12004;
        if (n >= 0 && n < 12) {
            field12004 = values()[n];
        }
        else {
            field12004 = Class2077.field12004;
        }
        return field12004;
    }
    
    public static Class2077 method8181(final int n) {
        final Class2077[] values = values();
        Class2077 field12004 = null;
        for (int n2 = 0; field12004 == null && n2 < 12; ++n2) {
            if (n == values[n2].field12006) {
                field12004 = values[n2];
            }
        }
        if (field12004 == null) {
            field12004 = Class2077.field12004;
        }
        return field12004;
    }
    
    Class2077(final int field12005, final int field12006, final int[] field12007, final int[] field12008) {
        this.field12005 = field12005;
        this.field12006 = field12006;
        this.field12007 = field12007;
        this.field12008 = field12008;
    }
    
    public int method8182() {
        return this.field12005;
    }
    
    public int method8183() {
        return this.field12006;
    }
    
    public int method8184() {
        return this.field12007[0];
    }
    
    public int method8185() {
        return this.field12007[1];
    }
    
    public int method8186(final boolean b) {
        return this.field12008[b];
    }
    
    @Override
    public String toString() {
        return Integer.toString(this.field12006);
    }
}
