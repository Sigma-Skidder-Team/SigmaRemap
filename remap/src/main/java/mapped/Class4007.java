// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class Class4007 extends Block
{
    private static final ITextComponent field18066;
    
    public Class4007(final Properties class9288) {
        super(class9288);
    }
    
    @Override
    public Class2201 method11844(final BlockState class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (!class7097.isRemote) {
            class7099.method2833(class7096.method21754(class7097, class7098));
            class7099.method2857(Class8276.field34042);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public INamedContainerProvider getContainer(final BlockState class7096, final World class7097, final BlockPos class7098) {
        return new Class504((n, class1849, class1850) -> new Class3428(n, class1849, Class7318.method22434(class7097, class7098)), Class4007.field18066);
    }
    
    static {
        field18066 = new Class2259("container.crafting");
    }
}
