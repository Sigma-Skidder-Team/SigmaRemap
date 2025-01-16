// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4156 extends Class4154
{
    private static String[] field18531;
    private final Class4150 field18532;
    private double field18533;
    private double field18534;
    private double field18535;
    private float field18536;
    private float field18537;
    
    private Class4156(final Class4150 field18532, final int n, final int n2, final int n3, final int n4) {
        this.field18532 = field18532;
        super.method12451(n, n2, n3, n4);
    }
    
    @Override
    public void method12451(final int n, final int n2, final int n3, final int n4) {
    }
    
    @Override
    public Class4150 pos(final double field18533, final double field18534, final double field18535) {
        this.field18533 = field18533;
        this.field18534 = field18534;
        this.field18535 = field18535;
        return this;
    }
    
    @Override
    public Class4150 method12399(final int n, final int n2, final int n3, final int n4) {
        return this;
    }
    
    @Override
    public Class4150 tex(final float field18536, final float field18537) {
        this.field18536 = field18536;
        this.field18537 = field18537;
        return this;
    }
    
    @Override
    public Class4150 method12433(final int n, final int n2) {
        return this;
    }
    
    @Override
    public Class4150 method12434(final int n, final int n2) {
        return this;
    }
    
    @Override
    public Class4150 method12436(final float n, final float n2, final float n3) {
        return this;
    }
    
    @Override
    public void method12400(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final int n10, final int n11, final float n12, final float n13, final float n14) {
        this.field18532.pos(n, n2, n3).method12399(this.field18514, this.field18515, this.field18516, this.field18517).tex(n8, n9).endVertex();
    }
    
    @Override
    public void endVertex() {
        this.field18532.pos(this.field18533, this.field18534, this.field18535).method12399(this.field18514, this.field18515, this.field18516, this.field18517).tex(this.field18536, this.field18537).endVertex();
    }
}
