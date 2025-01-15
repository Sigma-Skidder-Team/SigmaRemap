// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9038
{
    public final BlockPos field38248;
    public final BlockState field38249;
    public final Class51 field38250;
    
    public Class9038(final BlockPos field38248, final BlockState field38249, final Class51 field38250) {
        this.field38248 = field38248;
        this.field38249 = field38249;
        this.field38250 = field38250;
    }
    
    @Override
    public String toString() {
        return String.format("<StructureBlockInfo | %s | %s | %s>", this.field38248, this.field38249, this.field38250);
    }
}
