// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class3486 extends Class3485
{
    private static String[] field16417;
    public final /* synthetic */ Class827 field16418;
    
    public Class3486(final Class827 field16418, final Class787 class787, final double n, final int n2) {
        this.field16418 = field16418;
        super(Blocks.TURTLE_EGG, class787, n, n2);
    }
    
    @Override
    public void method11053(final Class1851 class1851, final BlockPos class1852) {
        class1851.method6705(null, class1852, Class8520.field35757, Class286.field1583, 0.5f, 0.9f + Class827.method4934(this.field16418).nextFloat() * 0.2f);
    }
    
    @Override
    public void method11054(final World class1847, final BlockPos class1848) {
        class1847.method6705(null, class1848, Class8520.field35653, Class286.field1582, 0.7f, 0.9f + class1847.rand.nextFloat() * 0.2f);
    }
    
    @Override
    public double method11046() {
        return 1.14;
    }
}
