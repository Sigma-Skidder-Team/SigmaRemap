// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.Predicate;
import java.util.Random;

public class Class4018 extends Class4017
{
    private static String[] field18096;
    public static final Class7114<Class104> field18097;
    public static final Class7113 field18098;
    
    public Class4018(final Class9288 class9288) {
        super(true, class9288);
        this.method11877(((StateHolder<O, Class7096>)((StateHolder<O, Class7096>)this.field17406.method32903()).with((IProperty<Comparable>)Class4018.field18098, false)).with(Class4018.field18097, Class104.field311));
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return 20;
    }
    
    @Override
    public boolean method11849(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public void method11850(final Class7096 class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        if (!class7097.isRemote) {
            if (!class7096.method21772((IProperty<Boolean>)Class4018.field18098)) {
                this.method12206(class7097, class7098, class7096);
            }
        }
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21772((IProperty<Boolean>)Class4018.field18098)) {
            this.method12206(class7097, class7098, class7096);
        }
    }
    
    @Override
    public int method11848(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        return class7096.method21772((IProperty<Boolean>)Class4018.field18098) ? 15 : 0;
    }
    
    @Override
    public int method11851(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099) {
        if (class7096.method21772((IProperty<Boolean>)Class4018.field18098)) {
            return (class7099 != Direction.UP) ? 0 : 15;
        }
        return 0;
    }
    
    private void method12206(final World class1847, final BlockPos class1848, final Class7096 class1849) {
        final boolean booleanValue = class1849.method21772((IProperty<Boolean>)Class4018.field18098);
        boolean b = false;
        if (!this.method12208(class1847, class1848, Class428.class, null).isEmpty()) {
            b = true;
        }
        if (b) {
            if (!booleanValue) {
                final Class7096 class1850 = ((StateHolder<O, Class7096>)class1849).with((IProperty<Comparable>)Class4018.field18098, true);
                class1847.setBlockState(class1848, class1850, 3);
                this.method12207(class1847, class1848, class1850, true);
                class1847.method6696(class1848, this);
                class1847.method6696(class1848.method1139(), this);
                class1847.markBlockRangeForRenderUpdate(class1848, class1849, class1850);
            }
        }
        if (!b) {
            if (booleanValue) {
                final Class7096 class1851 = ((StateHolder<O, Class7096>)class1849).with((IProperty<Comparable>)Class4018.field18098, false);
                class1847.setBlockState(class1848, class1851, 3);
                this.method12207(class1847, class1848, class1851, false);
                class1847.method6696(class1848, this);
                class1847.method6696(class1848.method1139(), this);
                class1847.markBlockRangeForRenderUpdate(class1848, class1849, class1851);
            }
        }
        if (b) {
            class1847.method6833().method21345(class1848, this, this.method11826(class1847));
        }
        class1847.method6783(class1848, this);
    }
    
    public void method12207(final World class1847, final BlockPos class1848, final Class7096 class1849, final boolean b) {
        for (final BlockPos class1850 : new Class8354(class1847, class1848, class1849).method27877()) {
            final Class7096 method6701 = class1847.getBlockState(class1850);
            method6701.method21734(class1847, class1850, method6701.method21696(), class1848, false);
        }
    }
    
    @Override
    public void method11828(final Class7096 class7096, final World class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (class7099.method21696() != class7096.method21696()) {
            super.method11828(class7096, class7097, class7098, class7099, b);
            this.method12206(class7097, class7098, class7096);
        }
    }
    
    @Override
    public IProperty<Class104> method12205() {
        return Class4018.field18097;
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final World class7097, final BlockPos class7098) {
        if (class7096.method21772((IProperty<Boolean>)Class4018.field18098)) {
            final List<Class429> method12208 = this.method12208(class7097, class7098, Class429.class, null);
            if (!method12208.isEmpty()) {
                return ((Class429)method12208.get(0)).method2149().method5206();
            }
            final List<Class428> method12209 = this.method12208(class7097, class7098, Class428.class, Class9170.field38848);
            if (!method12209.isEmpty()) {
                return Class3418.method10898((Class446)method12209.get(0));
            }
        }
        return 0;
    }
    
    public <T extends Class428> List<T> method12208(final World class1847, final BlockPos class1848, final Class<T> clazz, final Predicate<Entity> predicate) {
        return class1847.method6739((Class<? extends T>)clazz, this.method12209(class1848), (Predicate<? super T>)predicate);
    }
    
    private AxisAlignedBB method12209(final BlockPos class354) {
        return new AxisAlignedBB(class354.getX() + 0.2f, class354.getY(), class354.getZ() + 0.2f, class354.getX() + 1 - 0.2f, class354.getY() + 1 - 0.2f, class354.getZ() + 1 - 0.2f);
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        Label_0443: {
            switch (Class8350.field34273[class7097.ordinal()]) {
                case 1: {
                    switch (Class8350.field34272[class7096.method21772(Class4018.field18097).ordinal()]) {
                        case 1: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field314);
                        }
                        case 2: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field313);
                        }
                        case 3: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field316);
                        }
                        case 4: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field315);
                        }
                        case 5: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field319);
                        }
                        case 6: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field320);
                        }
                        case 7: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field317);
                        }
                        case 8: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field318);
                        }
                        default: {
                            break Label_0443;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (Class8350.field34272[class7096.method21772(Class4018.field18097).ordinal()]) {
                        case 1: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field315);
                        }
                        case 2: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field316);
                        }
                        case 3: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field314);
                        }
                        case 4: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field313);
                        }
                        case 5: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field320);
                        }
                        case 6: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field317);
                        }
                        case 7: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field318);
                        }
                        case 8: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field319);
                        }
                        case 9: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field312);
                        }
                        case 10: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field311);
                        }
                        default: {
                            break Label_0443;
                        }
                    }
                    break;
                }
                case 3: {
                    switch (Class8350.field34272[class7096.method21772(Class4018.field18097).ordinal()]) {
                        case 1: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field316);
                        }
                        case 2: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field315);
                        }
                        case 3: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field313);
                        }
                        case 4: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field314);
                        }
                        case 5: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field318);
                        }
                        case 6: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field319);
                        }
                        case 7: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field320);
                        }
                        case 8: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field317);
                        }
                        case 9: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field312);
                        }
                        case 10: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field311);
                        }
                        default: {
                            break Label_0443;
                        }
                    }
                    break;
                }
            }
        }
        return class7096;
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        final Class104 class7098 = class7096.method21772(Class4018.field18097);
        Label_0347: {
            switch (Class8350.field34274[class7097.ordinal()]) {
                case 1: {
                    switch (Class8350.field34272[class7098.ordinal()]) {
                        case 3: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field316);
                        }
                        case 4: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field315);
                        }
                        case 5: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field320);
                        }
                        case 6: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field319);
                        }
                        case 7: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field318);
                        }
                        case 8: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field317);
                        }
                        default: {
                            return super.method11791(class7096, class7097);
                        }
                    }
                    break;
                }
                case 2: {
                    switch (Class8350.field34272[class7098.ordinal()]) {
                        case 1: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field314);
                        }
                        case 2: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field313);
                        }
                        default: {
                            break Label_0347;
                        }
                        case 5: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field318);
                        }
                        case 6: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field317);
                        }
                        case 7: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field320);
                        }
                        case 8: {
                            return ((StateHolder<O, Class7096>)class7096).with(Class4018.field18097, Class104.field319);
                        }
                    }
                    break;
                }
            }
        }
        return super.method11791(class7096, class7097);
    }
    
    @Override
    public void method11875(final Class9500<Block, Class7096> class9500) {
        class9500.method35378(Class4018.field18097, Class4018.field18098);
    }
    
    static {
        field18097 = Class8970.field37768;
        field18098 = Class8970.field37741;
    }
}
