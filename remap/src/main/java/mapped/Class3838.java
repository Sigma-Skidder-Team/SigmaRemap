// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Random;

public class Class3838 extends Class3834
{
    private static String[] field17450;
    public static final Class7113 field17451;
    
    public Class3838(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class3838.field17415, Direction.SOUTH)).with((IProperty<Comparable>)Class3838.field17451, false));
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3838.field17415, Class3838.field17451);
    }
    
    @Override
    public BlockState method11790(final BlockState class7096, final Class2052 class7097) {
        return ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3838.field17415, class7097.method8142(class7096.get((IProperty<Direction>)Class3838.field17415)));
    }
    
    @Override
    public BlockState method11791(final BlockState class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.get((IProperty<Direction>)Class3838.field17415)));
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (!class7096.get((IProperty<Boolean>)Class3838.field17451)) {
            class7097.setBlockState(class7098, ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3838.field17451, true), 2);
            class7097.method6907().method21345(class7098, this, 2);
        }
        else {
            class7097.setBlockState(class7098, ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3838.field17451, false), 2);
        }
        this.method11897(class7097, class7098, class7096);
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.get((IProperty<Comparable>)Class3838.field17415) == class7097) {
            if (!class7096.get((IProperty<Boolean>)Class3838.field17451)) {
                this.method11896(class7099, class7100);
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    private void method11896(final Class1851 class1851, final BlockPos class1852) {
        if (!class1851.isRemote()) {
            if (!class1851.method6833().method21340(class1852, this)) {
                class1851.method6833().method21345(class1852, this, 2);
            }
        }
    }
    
    public void method11897(final World class1847, final BlockPos class1848, final BlockState class1849) {
        final Direction class1850 = class1849.get((IProperty<Direction>)Class3838.field17415);
        final BlockPos method1149 = class1848.method1149(class1850.getOpposite());
        class1847.method6698(method1149, this, class1848);
        class1847.method6697(method1149, this, class1850);
    }
    
    @Override
    public boolean method11849(final BlockState class7096) {
        return true;
    }
    
    @Override
    public int method11851(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        return class7096.method21715(class7097, class7098, class7099);
    }
    
    @Override
    public int method11848(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        return (class7096.get((IProperty<Boolean>)Class3838.field17451) && class7096.get((IProperty<Comparable>)Class3838.field17415) == class7099) ? 15 : 0;
    }
    
    @Override
    public void method11828(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (class7096.getBlock() != class7099.getBlock()) {
            if (!class7097.isRemote()) {
                if (class7096.get((IProperty<Boolean>)Class3838.field17451)) {
                    if (!class7097.method6833().method21340(class7098, this)) {
                        final BlockState class7100 = ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3838.field17451, false);
                        class7097.setBlockState(class7098, class7100, 18);
                        this.method11897(class7097, class7098, class7100);
                    }
                }
            }
        }
    }
    
    @Override
    public void method11829(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (class7096.getBlock() != class7099.getBlock()) {
            if (!class7097.isRemote) {
                if (class7096.get((IProperty<Boolean>)Class3838.field17451)) {
                    if (class7097.method6833().method21340(class7098, this)) {
                        this.method11897(class7097, class7098, ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class3838.field17451, false));
                    }
                }
            }
        }
    }
    
    @Override
    public BlockState method11846(final Class7074 class7074) {
        return ((StateHolder<O, BlockState>)this.getDefaultState()).with((IProperty<Comparable>)Class3838.field17415, class7074.method21642().getOpposite().getOpposite());
    }
    
    static {
        field17451 = Class8970.field37741;
    }
}
