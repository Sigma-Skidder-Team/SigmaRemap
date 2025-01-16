// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Iterator;
import javax.annotation.Nullable;
import java.util.Random;

public abstract class Class5827
{
    @Nullable
    public abstract Class8530<Class5129, ?> method17518(final Random p0, final boolean p1);
    
    public boolean method17514(final Class1851 class1851, final Class6346<?> class1852, final BlockPos class1853, final BlockState class1854, final Random random) {
        final Class8530<Class5129, ?> method17518 = this.method17518(random, this.method17519(class1851, class1853));
        if (method17518 == null) {
            return false;
        }
        class1851.setBlockState(class1853, Class7521.field29147.getDefaultState(), 4);
        method17518.field35805.method16032();
        if (!method17518.method28613(class1851, (Class6346)class1852, random, class1853)) {
            class1851.setBlockState(class1853, class1854, 4);
            return false;
        }
        return true;
    }
    
    private boolean method17519(final Class1851 class1851, final BlockPos class1852) {
        final Iterator<BlockPos> iterator = BlockPos.getAllInBoxMutable(class1852.method1139().method1142(2).method1146(2), class1852.method1137().method1144(2).method1148(2)).iterator();
        while (iterator.hasNext()) {
            if (!class1851.getBlockState(iterator.next()).method21755(Class7188.field27913)) {
                continue;
            }
            return true;
        }
        return false;
    }
}
