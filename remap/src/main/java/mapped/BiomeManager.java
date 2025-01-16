// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class BiomeManager
{
    private static String[] field22805;
    private final Class1867 field22806;
    private final long field22807;
    private final Class2178 field22808;
    
    public BiomeManager(final Class1867 field22806, final long field22807, final Class2178 field22808) {
        this.field22806 = field22806;
        this.field22807 = field22807;
        this.field22808 = field22808;
    }
    
    public BiomeManager method16809(final Class1868 class1868) {
        return new BiomeManager(class1868, this.field22807, this.field22808);
    }
    
    public Class3090 method16810(final BlockPos class354) {
        return this.field22808.method8338(this.field22807, class354.getX(), class354.getY(), class354.getZ(), this.field22806);
    }
}
