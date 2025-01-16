// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public abstract class Class4017 extends Block
{
    public static final VoxelShape field18093;
    public static final VoxelShape field18094;
    private final boolean field18095;
    
    public static boolean method12200(final World class1847, final BlockPos class1848) {
        return method12201(class1847.getBlockState(class1848));
    }
    
    public static boolean method12201(final Class7096 class7096) {
        return class7096.method21755(Class7188.field27906);
    }
    
    public Class4017(final boolean field18095, final Class9288 class9288) {
        super(class9288);
        this.field18095 = field18095;
    }
    
    public boolean method12202() {
        return this.field18095;
    }
    
    @Override
    public VoxelShape method11808(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        final Class104 class7100 = (class7096.method21696() != this) ? null : class7096.method21772(this.method12205());
        return (class7100 != null && class7100.method597()) ? Class4017.field18094 : Class4017.field18093;
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        return Block.method11812(class7097, class7098.method1139());
    }
    
    @Override
    public void method11828(Class7096 method12204, final World class1847, final BlockPos class1848, final Class7096 class1849, final boolean b) {
        if (class1849.method21696() != method12204.method21696()) {
            method12204 = this.method12204(class1847, class1848, method12204, true);
            if (this.field18095) {
                method12204.method21734(class1847, class1848, this, class1848, b);
            }
        }
    }
    
    @Override
    public void method11825(final Class7096 class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        if (!class7097.isRemote) {
            final Class104 class7101 = class7096.method21772(this.method12205());
            boolean b2 = false;
            if (!Block.method11812(class7097, class7098.method1139())) {
                b2 = true;
            }
            final BlockPos method1147 = class7098.method1147();
            if (class7101 == Class104.field313 && !Block.method11812(class7097, method1147)) {
                b2 = true;
            }
            else {
                final BlockPos method1148 = class7098.method1145();
                if (class7101 == Class104.field314 && !Block.method11812(class7097, method1148)) {
                    b2 = true;
                }
                else {
                    final BlockPos method1149 = class7098.method1141();
                    if (class7101 == Class104.field315 && !Block.method11812(class7097, method1149)) {
                        b2 = true;
                    }
                    else {
                        final BlockPos method1150 = class7098.method1143();
                        if (class7101 == Class104.field316) {
                            if (!Block.method11812(class7097, method1150)) {
                                b2 = true;
                            }
                        }
                    }
                }
            }
            if (b2 && !class7097.method6961(class7098)) {
                if (!b) {
                    Block.method11836(class7096, class7097, class7098);
                }
                class7097.method6690(class7098, b);
            }
            else {
                this.method12203(class7096, class7097, class7098, class7099);
            }
        }
    }
    
    public void method12203(final Class7096 class7096, final World class7097, final BlockPos class7098, final Block class7099) {
    }
    
    public Class7096 method12204(final World class1847, final BlockPos class1848, final Class7096 class1849, final boolean b) {
        if (!class1847.isRemote) {
            return new Class8354(class1847, class1848, class1849).method27888(class1847.method6749(class1848), b, class1849.method21772(this.method12205())).method27889();
        }
        return class1849;
    }
    
    @Override
    public PushReaction method11858(final Class7096 class7096) {
        return PushReaction.NORMAL;
    }
    
    @Override
    public void method11829(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (!b) {
            super.method11829(class7096, class7097, class7098, class7099, b);
            if (class7096.method21772(this.method12205()).method597()) {
                class7097.method6696(class7098.method1137(), this);
            }
            if (this.field18095) {
                class7097.method6696(class7098, this);
                class7097.method6696(class7098.method1139(), this);
            }
        }
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class7096 method11878 = super.getDefaultState();
        final Direction method11879 = class7074.method21644();
        return ((StateHolder<Object, Class7096>)method11878).with(this.method12205(), (method11879 == Direction.EAST || method11879 == Direction.WEST) ? Class104.field312 : Class104.field311);
    }
    
    public abstract IProperty<Class104> method12205();
    
    static {
        field18093 = Block.method11778(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
        field18094 = Block.method11778(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
    }
}
