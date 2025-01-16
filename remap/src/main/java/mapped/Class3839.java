// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3839 extends Class3834 implements Class3840
{
    public Class3839(final Class9288 class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3839.field17415, Direction.UP));
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3839.field17415);
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3839.field17415, class7097.method8142(class7096.method21772((IProperty<Direction>)Class3839.field17415)));
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((StateHolder<O, Class7096>)this.getDefaultState()).with((IProperty<Comparable>)Class3839.field17415, class7074.method21648());
    }
    
    @Nullable
    @Override
    public TileEntity method11898(final Class1855 class1855) {
        return new Class498();
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final Class7005 class7101) {
        final TileEntity method6727 = class7097.method6727(class7098);
        if (method6727 instanceof Class498 && class7099.method2908()) {
            class7099.method2831((Class498)method6727);
            return Class2201.field13400;
        }
        return Class2201.field13402;
    }
    
    public static boolean method11899(final Class9038 class9038, final Class9038 class9039) {
        return class9038.field38249.get((IProperty<Comparable>)Class3839.field17415) == class9039.field38249.get((IProperty<Direction>)Class3839.field17415).getOpposite() && class9038.field38250.method323("attachement_type").equals(class9039.field38250.method323("attachement_type"));
    }
}
