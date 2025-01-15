// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;

import java.util.HashSet;
import java.util.Set;

public class Class6981 extends Class6977
{
    private static String[] field27277;
    
    public Class6981() {
        super(Class3999.class);
    }
    
    @Override
    public Set<Class9488> method21398(final BlockPos class354, final BlockState class355, final Class7614 class356) {
        final HashSet set = new HashSet();
        final BlockState method6701 = Class869.method5277().field4683.method6701(class354);
        if (method6701.method21696() instanceof Class3999) {
            set.add(new Class9488(class354, ((Class7097<Object, BlockState>)method6701).method21773((Class7111<Comparable>)Class3999.field18026, (Comparable)class355.method21772((Class7111<V>)Class3999.field18026))));
        }
        return set;
    }
    
    @Override
    public Set<Class9488> method21399(final BlockPos field27548, final BlockState class7096, final Class7614 class7097) {
        final HashSet set = new HashSet();
        final Class7074 class7098 = new Class7074(this.field27275.field4683, this.field27275.field4684, Class316.field1877, new ItemStack(class7096.method21696()), new Class7005(new Vec3d(0.0, 0.0, 0.0), Direction.UP, field27548, false));
        class7098.field27548 = field27548;
        class7098.field27549 = false;
        set.add(new Class9488(field27548, (BlockState)((Class7097<Object, Object>)class7096.method21696().method11846(class7098)).method21773((Class7111<Comparable>)Class3999.field18026, (Comparable)class7096.method21772((Class7111<V>)Class3999.field18026))));
        return set;
    }
}
