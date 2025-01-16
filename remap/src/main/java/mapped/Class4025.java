// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public class Class4025 extends Class4024
{
    private static String[] field18112;
    public static final Class7115 field18115;
    public static final Class7113 field18116;
    
    public Class4025(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class4025.field18115, Direction.NORTH)).with((IProperty<Comparable>)Class4025.field18116, true));
    }
    
    @Override
    public String method11856() {
        return this.method11704().method11717();
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class4023.method12215(class7096);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        return Class7521.field29288.method11843(class7096, class7097, class7098);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return Class7521.field29288.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class7096 method11846 = Class7521.field29288.method11846(class7074);
        return (method11846 != null) ? ((Class7096)((StateHolder<Object, Object>)this.getDefaultState()).with((IProperty<Comparable>)Class4025.field18115, (Comparable)method11846.method21772((IProperty<V>)Class4025.field18115))) : null;
    }
    
    @Override
    public void method11823(final Class7096 class7096, final World class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21772((IProperty<Boolean>)Class4025.field18116)) {
            final Direction method782 = class7096.method21772((IProperty<Direction>)Class4025.field18115).getOpposite();
            class7097.method6709(Class6912.field27101, class7098.getX() + 0.5 + (random.nextDouble() - 0.5) * 0.2 + 0.27 * method782.getXOffset(), class7098.getY() + 0.7 + (random.nextDouble() - 0.5) * 0.2 + 0.22, class7098.getZ() + 0.5 + (random.nextDouble() - 0.5) * 0.2 + 0.27 * method782.getZOffset(), 0.0, 0.0, 0.0);
        }
    }
    
    @Override
    public boolean method12216(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        final Direction method782 = class1849.method21772((IProperty<Direction>)Class4025.field18115).getOpposite();
        return class1847.method6747(class1848.method1149(method782), method782);
    }
    
    @Override
    public int method11848(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return (class7096.method21772((IProperty<Boolean>)Class4025.field18116) && class7096.method21772((IProperty<Comparable>)Class4025.field18115) != class7099) ? 15 : 0;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return Class7521.field29288.method11790(class7096, class7097);
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return Class7521.field29288.method11791(class7096, class7097);
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class4025.field18115, Class4025.field18116);
    }
    
    static {
        field18115 = Class3892.field17564;
        field18116 = Class4024.field18113;
    }
}
