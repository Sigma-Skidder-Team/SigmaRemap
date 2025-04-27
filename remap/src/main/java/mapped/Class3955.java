// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Random;
import java.util.Map;

public class Class3955 extends Class3841
{
    private static String[] field17858;
    public static final Class7115 field17859;
    public static final Class7113 field17860;
    private static final Map<Item, Class6423> field17861;
    
    public static void method12069(final Class3832 class3832, final Class6423 class3833) {
        Class3955.field17861.put(class3832.method11704(), class3833);
    }
    
    public Class3955(final Properties class9288) {
        super(class9288);
        this.method11877(((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class3955.field17859, Direction.NORTH)).with((IProperty<Comparable>)Class3955.field17860, false));
    }
    
    @Override
    public int tickRate(final Class1852 class1852) {
        return 4;
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final World class7097, final BlockPos class7098, final PlayerEntity class7099, final Class316 class7100, final BlockRayTraceResult class7101) {
        if (!class7097.isRemote) {
            final TileEntity method6727 = class7097.getTileEntity(class7098);
            if (method6727 instanceof Class458) {
                class7099.method2833((INamedContainerProvider)method6727);
                if (!(method6727 instanceof Class459)) {
                    class7099.method2857(Class8276.field34033);
                }
                else {
                    class7099.method2857(Class8276.field34031);
                }
            }
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    public void method12070(final World class1847, final BlockPos class1848) {
        final Class5492 class1849 = new Class5492(class1847, class1848);
        final Class458 class1850 = class1849.method16766();
        final int method2333 = class1850.method2333();
        if (method2333 >= 0) {
            final ItemStack method2334 = class1850.getStackInSlot(method2333);
            final Class6423 method2335 = this.method12071(method2334);
            if (method2335 != Class6423.field25532) {
                class1850.method2160(method2333, method2335.method19090(class1849, method2334));
            }
        }
        else {
            class1847.method6955(1001, class1848, 0);
        }
    }
    
    public Class6423 method12071(final ItemStack class8321) {
        return Class3955.field17861.get(class8321.getItem());
    }
    
    @Override
    public void method11825(final Class7096 class7096, final World class7097, final BlockPos class7098, final Block class7099, final BlockPos class7100, final boolean b) {
        final boolean b2 = class7097.method6749(class7098) || class7097.method6749(class7098.method1137());
        final boolean booleanValue = class7096.method21772((IProperty<Boolean>)Class3955.field17860);
        if (b2 && !booleanValue) {
            class7097.method6833().method21345(class7098, this, this.tickRate(class7097));
            class7097.setBlockState(class7098, ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3955.field17860, true), 4);
        }
        else if (!b2) {
            if (booleanValue) {
                class7097.setBlockState(class7098, ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3955.field17860, false), 4);
            }
        }
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        this.method12070(class7097, class7098);
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class458();
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((StateHolder<O, Class7096>)this.getDefaultState()).with((IProperty<Comparable>)Class3955.field17859, class7074.method21642().getOpposite());
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final Class7096 class1849, final LivingEntity class1850, final ItemStack class1851) {
        if (class1851.method27667()) {
            final TileEntity method6727 = class1847.getTileEntity(class1848);
            if (method6727 instanceof Class458) {
                ((Class458)method6727).method2335(class1851.method27664());
            }
        }
    }
    
    @Override
    public void method11829(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7099.method21696()) {
            final TileEntity method6727 = class7097.getTileEntity(class7098);
            if (method6727 instanceof Class458) {
                Class9193.method33638(class7097, class7098, (IInventory)method6727);
                class7097.method6783(class7098, this);
            }
            super.onReplaced(class7096, class7097, class7098, class7099, b);
        }
    }
    
    public static IPosition method12072(final Class5491 class5491) {
        final Direction class5492 = class5491.method16765().get(Class3955.field17859);
        return new Class5493(class5491.getX() + 0.7 * class5492.getXOffset(), class5491.getY() + 0.7 * class5492.getYOffset(), class5491.getZ() + 0.7 * class5492.getZOffset());
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        return Class3418.method10897(class7097.getTileEntity(class7098));
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((StateHolder<O, Class7096>)class7096).with((IProperty<Comparable>)Class3955.field17859, class7097.method8142(class7096.method21772((IProperty<Direction>)Class3955.field17859)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((IProperty<Direction>)Class3955.field17859)));
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class3955.field17859, Class3955.field17860);
    }
    
    static {
        field17859 = Class3834.field17415;
        field17860 = Class8970.field37745;
        field17861 = Util.method27851((Map<Item, Class6423>)new Object2ObjectOpenHashMap(), object2ObjectOpenHashMap -> object2ObjectOpenHashMap.defaultReturnValue((Object)new Class6404()));
    }
}
