// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3970 extends Block
{
    private static String[] field17940;
    public static final Class7113 field17941;
    
    public Class3970(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)this.getDefaultState()).with((IProperty<Comparable>)Class3970.field17941, false));
    }
    
    @Override
    public int method11781(final Class7096 class7096) {
        return class7096.method21772((IProperty<Boolean>)Class3970.field17941) ? super.getLightValue(class7096) : 0;
    }
    
    @Override
    public void method11828(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        super.method11828(class7096, class7097, class7098, class7099, b);
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((StateHolder<O, Class7096>)this.getDefaultState()).with((IProperty<Comparable>)Class3970.field17941, class7074.method21654().method6749(class7074.method21639()));
    }
    
    @Override
    public void method11825(final Class7096 class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        if (!class7097.isRemote) {
            final boolean booleanValue = class7096.method21772((IProperty<Boolean>)Class3970.field17941);
            if (booleanValue != class7097.method6749(class7098)) {
                if (!booleanValue) {
                    class7097.setBlockState(class7098, ((StateHolder<O, Class7096>)class7096).method21768((IProperty<Comparable>)Class3970.field17941), 2);
                }
                else {
                    class7097.method6833().method21345(class7098, this, 4);
                }
            }
        }
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21772((IProperty<Boolean>)Class3970.field17941)) {
            if (!class7097.method6749(class7098)) {
                class7097.setBlockState(class7098, ((StateHolder<O, Class7096>)class7096).method21768((IProperty<Comparable>)Class3970.field17941), 2);
            }
        }
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3970.field17941);
    }
    
    @Override
    public boolean method11779(final Class7096 class7096, final IBlockReader class7097, final BlockPos class7098, final EntityType<?> class7099) {
        return true;
    }
    
    static {
        field17941 = Class4024.field18113;
    }
}
