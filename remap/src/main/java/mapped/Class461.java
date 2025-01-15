// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.text.ITextComponent;

import java.util.Arrays;
import java.util.Iterator;

public class Class461 extends Class460 implements Class441, Class439
{
    private static final int[] field2718;
    private static final int[] field2719;
    private static final int[] field2720;
    private Class2265<ItemStack> field2721;
    private int field2722;
    private boolean[] field2723;
    private Item field2724;
    private int field2725;
    public final Class7604 field2726;
    
    public Class461() {
        super(Class5412.field22551);
        this.field2721 = Class2265.method8507(5, ItemStack.field34174);
        this.field2726 = new Class7608(this);
    }
    
    @Override
    public ITextComponent method2243() {
        return new Class2259("container.brewing", new Object[0]);
    }
    
    @Override
    public int method2239() {
        return this.field2721.size();
    }
    
    @Override
    public boolean method2156() {
        final Iterator<Object> iterator = this.field2721.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method27620()) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public void method2229() {
        final ItemStack class8321 = this.field2721.get(4);
        if (this.field2725 <= 0) {
            if (class8321.getItem() == Items.field31445) {
                this.field2725 = 20;
                class8321.method27693(1);
                this.method2161();
            }
        }
        final boolean method2338 = this.method2338();
        final boolean b = this.field2722 > 0;
        final ItemStack class8322 = this.field2721.get(3);
        if (!b) {
            if (method2338) {
                if (this.field2725 > 0) {
                    --this.field2725;
                    this.field2722 = 400;
                    this.field2724 = class8322.getItem();
                    this.method2161();
                }
            }
        }
        else {
            --this.field2722;
            if (this.field2722 == 0 && method2338) {
                this.method2339();
                this.method2161();
            }
            else if (method2338) {
                if (this.field2724 != class8322.getItem()) {
                    this.field2722 = 0;
                    this.method2161();
                }
            }
            else {
                this.field2722 = 0;
                this.method2161();
            }
        }
        if (!this.field2656.isRemote) {
            final boolean[] method2339 = this.method2337();
            if (!Arrays.equals(method2339, this.field2723)) {
                this.field2723 = method2339;
                BlockState method2340 = this.field2656.method6701(this.method2193());
                if (!(method2340.method21696() instanceof Class3954)) {
                    return;
                }
                for (int i = 0; i < Class3954.field17856.length; ++i) {
                    method2340 = ((Class7097<Object, BlockState>)method2340).method21773((Class7111<Comparable>)Class3954.field17856[i], method2339[i]);
                }
                this.field2656.method6688(this.field2657, method2340, 2);
            }
        }
    }
    
    public boolean[] method2337() {
        final boolean[] array = new boolean[3];
        for (int i = 0; i < 3; ++i) {
            if (!this.field2721.get(i).method27620()) {
                array[i] = true;
            }
        }
        return array;
    }
    
    private boolean method2338() {
        final ItemStack class8321 = this.field2721.get(3);
        if (class8321.method27620()) {
            return false;
        }
        if (Class7652.method24240(class8321)) {
            for (int i = 0; i < 3; ++i) {
                final ItemStack class8322 = this.field2721.get(i);
                if (!class8322.method27620() && Class7652.method24244(class8322, class8321)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    private void method2339() {
        ItemStack class8321 = this.field2721.get(3);
        for (int i = 0; i < 3; ++i) {
            this.field2721.set(i, Class7652.method24247(class8321, this.field2721.get(i)));
        }
        class8321.method27693(1);
        final BlockPos method2193 = this.method2193();
        if (class8321.getItem().method11721()) {
            final ItemStack class8322 = new ItemStack(class8321.getItem().method11720());
            if (!class8321.method27620()) {
                if (!this.field2656.isRemote) {
                    Class9193.method33642(this.field2656, method2193.getX(), method2193.getY(), method2193.getZ(), class8322);
                }
            }
            else {
                class8321 = class8322;
            }
        }
        this.field2721.set(3, class8321);
        this.field2656.method6955(1035, method2193, 0);
    }
    
    @Override
    public void method2179(final Class51 class51) {
        super.method2179(class51);
        Class8508.method28426(class51, this.field2721 = Class2265.method8507(this.method2239(), ItemStack.field34174));
        this.field2722 = class51.method318("BrewTime");
        this.field2725 = class51.method317("Fuel");
    }
    
    @Override
    public Class51 method2180(final Class51 class51) {
        super.method2180(class51);
        class51.method297("BrewTime", (short)this.field2722);
        Class8508.method28424(class51, this.field2721);
        class51.method296("Fuel", (byte)this.field2725);
        return class51;
    }
    
    @Override
    public ItemStack method2157(final int n) {
        return (n >= 0 && n < this.field2721.size()) ? this.field2721.get(n) : ItemStack.field34174;
    }
    
    @Override
    public ItemStack method2158(final int n, final int n2) {
        return Class8508.method28422(this.field2721, n, n2);
    }
    
    @Override
    public ItemStack method2159(final int n) {
        return Class8508.method28423(this.field2721, n);
    }
    
    @Override
    public void method2160(final int n, final ItemStack class8321) {
        if (n >= 0) {
            if (n < this.field2721.size()) {
                this.field2721.set(n, class8321);
            }
        }
    }
    
    @Override
    public boolean method2162(final Class512 class512) {
        return this.field2656.method6727(this.field2657) == this && class512.method1733(this.field2657.getX() + 0.5, this.field2657.getY() + 0.5, this.field2657.getZ() + 0.5) <= 64.0;
    }
    
    @Override
    public boolean method2264(final int n, final ItemStack class8321) {
        if (n == 3) {
            return Class7652.method24240(class8321);
        }
        final Item method27622 = class8321.getItem();
        if (n != 4) {
            if (method27622 != Items.field31441) {
                if (method27622 != Items.field31579) {
                    if (method27622 != Items.field31582) {
                        if (method27622 != Items.field31442) {
                            return false;
                        }
                    }
                }
            }
            if (this.method2157(n).method27620()) {
                return true;
            }
            return false;
        }
        return method27622 == Items.field31445;
    }
    
    @Override
    public int[] method2248(final Direction class179) {
        if (class179 != Direction.UP) {
            return (class179 != Direction.DOWN) ? Class461.field2720 : Class461.field2719;
        }
        return Class461.field2718;
    }
    
    @Override
    public boolean method2249(final int n, final ItemStack class8321, final Direction class8322) {
        return this.method2264(n, class8321);
    }
    
    @Override
    public boolean method2250(final int n, final ItemStack class8321, final Direction class8322) {
        return n != 3 || class8321.getItem() == Items.field31442;
    }
    
    @Override
    public void method2164() {
        this.field2721.clear();
    }
    
    @Override
    public Class3418 method2253(final int n, final Class464 class464) {
        return new Class3421(n, class464, this, this.field2726);
    }
    
    static {
        field2718 = new int[] { 3 };
        field2719 = new int[] { 0, 1, 2, 3 };
        field2720 = new int[] { 0, 1, 2, 4 };
    }
}
