// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7870
{
    private static String[] field32312;
    private final short field32313;
    private final Class7096 field32314;
    public final /* synthetic */ Class4312 field32315;
    
    public Class7870(final Class4312 field32315, final short field32316, final Class7096 field32317) {
        this.field32315 = field32315;
        this.field32313 = field32316;
        this.field32314 = field32317;
    }
    
    public Class7870(final Class4312 field32315, final short field32316, final Class1862 class1862) {
        this.field32315 = field32315;
        this.field32313 = field32316;
        this.field32314 = class1862.method6701(this.method25489());
    }
    
    public BlockPos method25489() {
        return new BlockPos(this.field32315.field19330.method25434(this.field32313 >> 12 & 0xF, this.field32313 & 0xFF, this.field32313 >> 8 & 0xF));
    }
    
    public short method25490() {
        return this.field32313;
    }
    
    public Class7096 method25491() {
        return this.field32314;
    }
}
