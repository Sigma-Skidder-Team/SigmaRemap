// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4153 implements Class4150
{
    private final Class4150 field18511;
    private final Class4150 field18512;
    
    public Class4153(final Class4150 field18511, final Class4150 field18512) {
        if (field18511 != field18512) {
            this.field18511 = field18511;
            this.field18512 = field18512;
            return;
        }
        throw new IllegalArgumentException("Duplicate delegates");
    }
    
    @Override
    public Class4150 pos(final double n, final double n2, final double n3) {
        this.field18511.pos(n, n2, n3);
        this.field18512.pos(n, n2, n3);
        return this;
    }
    
    @Override
    public Class4150 method12399(final int n, final int n2, final int n3, final int n4) {
        this.field18511.method12399(n, n2, n3, n4);
        this.field18512.method12399(n, n2, n3, n4);
        return this;
    }
    
    @Override
    public Class4150 tex(final float n, final float n2) {
        this.field18511.tex(n, n2);
        this.field18512.tex(n, n2);
        return this;
    }
    
    @Override
    public Class4150 method12433(final int n, final int n2) {
        this.field18511.method12433(n, n2);
        this.field18512.method12433(n, n2);
        return this;
    }
    
    @Override
    public Class4150 method12434(final int n, final int n2) {
        this.field18511.method12434(n, n2);
        this.field18512.method12434(n, n2);
        return this;
    }
    
    @Override
    public Class4150 method12436(final float n, final float n2, final float n3) {
        this.field18511.method12436(n, n2, n3);
        this.field18512.method12436(n, n2, n3);
        return this;
    }
    
    @Override
    public void method12400(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final int n10, final int n11, final float n12, final float n13, final float n14) {
        this.field18511.method12400(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14);
        this.field18512.method12400(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14);
    }
    
    @Override
    public void endVertex() {
        this.field18511.endVertex();
        this.field18512.endVertex();
    }
}
