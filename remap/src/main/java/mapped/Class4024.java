// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.WeakHashMap;
import com.google.common.collect.Lists;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;
import java.util.List;
import java.util.Map;

public class Class4024 extends Class4022
{
    private static String[] field18112;
    public static final Class7113 field18113;
    private static final Map<IBlockReader, List<Class7387>> field18114;
    
    public Class4024(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, BlockState>)this.field17406.method32903()).with((IProperty<Comparable>)Class4024.field18113, true));
    }
    
    @Override
    public int tickRate(final Class1852 class1852) {
        return 2;
    }
    
    @Override
    public void onBlockAdded(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        final Direction[] values = Direction.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            class7097.method6696(class7098.method1149(values[i]), this);
        }
    }
    
    @Override
    public void onReplaced(final BlockState class7096, final World class7097, final BlockPos class7098, final BlockState class7099, final boolean b) {
        if (!b) {
            final Direction[] values = Direction.values();
            for (int length = values.length, i = 0; i < length; ++i) {
                class7097.method6696(class7098.method1149(values[i]), this);
            }
        }
    }
    
    @Override
    public int method11848(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return (class7096.get(Class4024.field18113) && Direction.UP != class7099) ? 15 : 0;
    }
    
    public boolean method12216(final World class1847, final BlockPos class1848, final BlockState class1849) {
        return class1847.method6747(class1848.method1139(), Direction.DOWN);
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        method12217(class7096, class7097, class7098, random, this.method12216(class7097, class7098, class7096));
    }
    
    public static void method12217(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random, final boolean b) {
        final List list = Class4024.field18114.get(class7097);
        while (list != null) {
            if (list.isEmpty()) {
                break;
            }
            if (class7097.method6754() - Class7387.method22687((Class7387)list.get(0)) <= 60L) {
                break;
            }
            list.remove(0);
        }
        if (!class7096.get(Class4024.field18113)) {
            if (!b) {
                if (!method12218(class7097, class7098, false)) {
                    class7097.setBlockState(class7098, ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class4024.field18113, true), 3);
                }
            }
        }
        else if (b) {
            class7097.setBlockState(class7098, ((StateHolder<O, BlockState>)class7096).with((IProperty<Comparable>)Class4024.field18113, false), 3);
            if (method12218(class7097, class7098, true)) {
                class7097.method6955(1502, class7098, 0);
                class7097.method6833().method21345(class7098, class7097.getBlockState(class7098).method21696(), 160);
            }
        }
    }
    
    @Override
    public void method11825(final BlockState class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        if (class7096.get(Class4024.field18113) == this.method12216(class7097, class7098, class7096)) {
            if (!class7097.method6833().method21342(class7098, this)) {
                class7097.method6833().method21345(class7098, this, this.tickRate(class7097));
            }
        }
    }
    
    @Override
    public int method11851(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Direction class7099) {
        return (class7099 != Direction.DOWN) ? 0 : class7096.method21715(class7097, class7098, class7099);
    }
    
    @Override
    public boolean method11849(final BlockState class7096) {
        return true;
    }
    
    @Override
    public void method11823(final BlockState class7096, final World class7097, final BlockPos class7098, final Random random) {
        if (class7096.get(Class4024.field18113)) {
            class7097.addParticle(Class6912.field27101, class7098.getX() + 0.5 + (random.nextDouble() - 0.5) * 0.2, class7098.getY() + 0.7 + (random.nextDouble() - 0.5) * 0.2, class7098.getZ() + 0.5 + (random.nextDouble() - 0.5) * 0.2, 0.0, 0.0, 0.0);
        }
    }
    
    @Override
    public int getLightValue(final BlockState class7096) {
        return class7096.get(Class4024.field18113) ? super.getLightValue(class7096) : 0;
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class4024.field18113);
    }
    
    private static boolean method12218(final World key, final BlockPos class354, final boolean b) {
        final List list = Class4024.field18114.computeIfAbsent(key, p0 -> Lists.newArrayList());
        if (b) {
            list.add(new Class7387(class354.toImmutable(), key.method6754()));
        }
        int n = 0;
        for (int i = 0; i < list.size(); ++i) {
            if (Class7387.method22688((Class7387)list.get(i)).equals(class354) && ++n >= 8) {
                return true;
            }
        }
        return false;
    }
    
    static {
        field18113 = Class8970.field37736;
        field18114 = new WeakHashMap<IBlockReader, List<Class7387>>();
    }
}
