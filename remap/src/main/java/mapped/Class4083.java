// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class4083 extends Item
{
    private static String[] field18187;
    
    public Class4083(final Properties properties) {
        super(properties);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        final BlockPos method21655 = class7075.method21639();
        final BlockState method21656 = method21654.getBlockState(method21655);
        int n = 0;
        if (method21656.getBlock() != Blocks.CAMPFIRE) {
            final BlockPos method21657 = method21655.method1149(class7075.method21648());
            if (method21654.getBlockState(method21657).method21706()) {
                this.method12288(method21654, method21657);
                method21654.method6692(method21657, ((Class4011) Blocks.FIRE).method12184(method21654, method21657));
                n = 1;
            }
        }
        else if (!((StateHolder<Object, BlockState>)method21656).get((IProperty<Boolean>)Class3918.field17760)) {
            if (!((StateHolder<Object, BlockState>)method21656).get((IProperty<Boolean>)Class3918.field17762)) {
                this.method12288(method21654, method21655);
                method21654.method6692(method21655, ((StateHolder<Object, BlockState>)method21656).with((IProperty<Comparable>)Class3918.field17760, true));
                n = 1;
            }
        }
        if (n == 0) {
            return Class2201.field13403;
        }
        class7075.method21651().method27693(1);
        return Class2201.field13400;
    }
    
    private void method12288(final World class1847, final BlockPos class1848) {
        class1847.method6705(null, class1848, Class8520.field35189, Class286.field1582, 1.0f, (Class4083.field17363.nextFloat() - Class4083.field17363.nextFloat()) * 0.2f + 1.0f);
    }
}
