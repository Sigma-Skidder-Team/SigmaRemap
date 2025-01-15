// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3978 extends Class3833
{
    private static final Class2259 field17970;
    
    public Class3978(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7097.isRemote) {
            class7099.method2833(class7096.method21754(class7097, class7098));
            class7099.method2857(Class8276.field34051);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Nullable
    @Override
    public Class434 method11827(final BlockState class7096, final World class7097, final BlockPos class7098) {
        return new Class504((n, class1849, class1850) -> new Class3417(n, class1849, Class7318.method22434(class7097, class7098)), Class3978.field17970);
    }
    
    static {
        field17970 = new Class2259("container.cartography_table", new Object[0]);
    }
}
