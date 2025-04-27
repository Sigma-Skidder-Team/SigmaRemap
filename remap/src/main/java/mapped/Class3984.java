// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public class Class3984 extends Block
{
    private static String[] field17990;
    public static final Class7114<Class185> field17991;
    public static final Class7113 field17992;
    public static final Class7112 field17993;
    
    public Class3984(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.field17406.method32903()).with(Class3984.field17991, Class185.field579)).with((IProperty<Comparable>)Class3984.field17993, 0)).with((IProperty<Comparable>)Class3984.field17992, false));
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((StateHolder<O, Class7096>)this.getDefaultState()).with(Class3984.field17991, Class185.method826(class7074.method21654().getBlockState(class7074.method21639().method1139())));
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        return (class7097 != Direction.DOWN) ? super.method11789(class7096, class7097, class7098, class7099, class7100, class7101) : ((StateHolder<O, Class7096>)class7096).with(Class3984.field17991, Class185.method826(class7098));
    }
    
    @Override
    public void method11825(final Class7096 class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        final boolean method6749 = class7097.method6749(class7098);
        if (method6749 != class7096.method21772((IProperty<Boolean>)Class3984.field17992)) {
            if (method6749) {
                this.method12129(class7097, class7098);
            }
            class7097.setBlockState(class7098, (Class7096)((StateHolder<Object, Object>)class7096).with((IProperty<Comparable>)Class3984.field17992, method6749), 3);
        }
    }
    
    private void method12129(final World class1847, final BlockPos class1848) {
        if (class1847.getBlockState(class1848.method1137()).method21706()) {
            class1847.method6763(class1848, this, 0, 0);
        }
    }
    
    @Override
    public Class2201 method11844(Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (!class7097.isRemote) {
            class7096 = ((StateHolder<O, Class7096>)class7096).method21768((IProperty<Comparable>)Class3984.field17993);
            class7097.setBlockState(class7098, class7096, 3);
            this.method12129(class7097, class7098);
            class7099.method2857(Class8276.field34035);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public void method11847(final Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099) {
        if (!class7097.isRemote) {
            this.method12129(class7097, class7098);
            class7099.method2857(Class8276.field34034);
        }
    }
    
    @Override
    public boolean method11857(final Class7096 class7096, final World class7097, final BlockPos class7098, final int n, final int n2) {
        final int intValue = class7096.method21772((IProperty<Integer>)Class3984.field17993);
        class7097.method6705(null, class7098, class7096.method21772(Class3984.field17991).method825(), Class286.field1580, 3.0f, (float)Math.pow(2.0, (intValue - 12) / 12.0));
        class7097.addParticle(Class8432.field34635, class7098.getX() + 0.5, class7098.getY() + 1.2, class7098.getZ() + 0.5, intValue / 24.0, 0.0, 0.0);
        return true;
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3984.field17991, Class3984.field17992, Class3984.field17993);
    }
    
    static {
        field17991 = Class8970.field37798;
        field17992 = Class8970.field37741;
        field17993 = Class8970.field37788;
    }
}
