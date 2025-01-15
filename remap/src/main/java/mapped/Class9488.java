// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9488
{
    private static String[] field40784;
    public BlockPos field40785;
    public BlockState field40786;
    
    public Class9488(final BlockPos field40785, final BlockState field40786) {
        this.field40785 = field40785;
        this.field40786 = field40786;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class9488 && ((Class9488)o).field40785.equals(this.field40785);
    }
}
