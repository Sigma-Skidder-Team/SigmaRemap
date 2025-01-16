// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.INameable;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3943 extends Class3841
{
    private static String[] field17835;
    public static final VoxelShape field17836;
    
    public Class3943(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public boolean method11820(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3943.field17836;
    }
    
    @Override
    public void method11823(final Class7096 class7096, final World class7097, final BlockPos class7098, final Random random) {
        super.method11823(class7096, class7097, class7098, random);
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                if (i > -2) {
                    if (i < 2) {
                        if (j == -1) {
                            j = 2;
                        }
                    }
                }
                if (random.nextInt(16) == 0) {
                    for (int k = 0; k <= 1; ++k) {
                        if (class7097.getBlockState(class7098.add(i, k, j)).method21696() == Class7521.field29284) {
                            if (!class7097.method6961(class7098.add(i / 2, 0, j / 2))) {
                                break;
                            }
                            class7097.method6709(Class8432.field34615, class7098.getX() + 0.5, class7098.getY() + 2.0, class7098.getZ() + 0.5, i + random.nextFloat() - 0.5, k - random.nextFloat() - 1.0f, j + random.nextFloat() - 0.5);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class463();
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (!class7097.isRemote) {
            class7099.method2833(class7096.method21754(class7097, class7098));
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Nullable
    @Override
    public Class434 method11827(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        final TileEntity method6727 = class7097.getTileEntity(class7098);
        if (!(method6727 instanceof Class463)) {
            return null;
        }
        return new Class504((n, class1849, class1850) -> new Class3433(n, class1849, Class7318.method22434(class7097, class7098)), ((INameable)method6727).getDisplayName());
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final Class7096 class1849, final LivingEntity class1850, final ItemStack class1851) {
        if (class1851.method27667()) {
            final TileEntity method6727 = class1847.getTileEntity(class1848);
            if (method6727 instanceof Class463) {
                ((Class463)method6727).method2344(class1851.method27664());
            }
        }
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17836 = Block.method11778(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
    }
}
