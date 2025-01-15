// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.List;

public class Class4002 extends Class4000
{
    private static String[] field18037;
    public static final Class7113 field18038;
    private final Class318 field18039;
    
    public Class4002(final Class318 field18039, final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, BlockState>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class4002.field18038, false));
        this.field18039 = field18039;
    }
    
    @Override
    public int method12166(final BlockState class7096) {
        return class7096.method21772((Class7111<Boolean>)Class4002.field18038) ? 15 : 0;
    }
    
    @Override
    public BlockState method12167(final BlockState class7096, final int n) {
        return ((Class7097<O, BlockState>)class7096).method21773((Class7111<Comparable>)Class4002.field18038, n > 0);
    }
    
    @Override
    public void method12162(final Class1851 class1851, final BlockPos class1852) {
        if (this.field17401 != Class8059.field33176) {
            class1851.method6705(null, class1852, Class8520.field35622, Class286.field1582, 0.3f, 0.6f);
        }
        else {
            class1851.method6705(null, class1852, Class8520.field35749, Class286.field1582, 0.3f, 0.8f);
        }
    }
    
    @Override
    public void method12163(final Class1851 class1851, final BlockPos class1852) {
        if (this.field17401 != Class8059.field33176) {
            class1851.method6705(null, class1852, Class8520.field35621, Class286.field1582, 0.3f, 0.5f);
        }
        else {
            class1851.method6705(null, class1852, Class8520.field35748, Class286.field1582, 0.3f, 0.7f);
        }
    }
    
    @Override
    public int method12165(final World class1847, final BlockPos class1848) {
        final AxisAlignedBB method18500 = Class4002.field18033.method18500(class1848);
        List<Entity> list = null;
        switch (Class8318.field34167[this.field18039.ordinal()]) {
            case 1: {
                list = class1847.method7127(null, method18500);
                break;
            }
            case 2: {
                list = class1847.method7128((Class<? extends Entity>) LivingEntity.class, method18500);
                break;
            }
            default: {
                return 0;
            }
        }
        if (!list.isEmpty()) {
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!((Entity)iterator.next()).method1861()) {
                    return 15;
                }
            }
        }
        return 0;
    }
    
    @Override
    public void method11875(final Class9500<Class3833, BlockState> class9500) {
        class9500.method35378(Class4002.field18038);
    }
    
    static {
        field18038 = Class8970.field37741;
    }
}
