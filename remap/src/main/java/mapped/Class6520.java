// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Table;
import java.util.Collections;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.item.crafting.IRecipeType;

import java.util.List;
import java.util.Map;

public class Class6520 extends Class6521
{
    private static String[] field25946;
    private final Class1780 field25947;
    private final Map<Class1956, List<Class9586>> field25948;
    private final List<Class9586> field25949;
    
    public Class6520(final Class1780 field25947) {
        this.field25948 = Maps.newHashMap();
        this.field25949 = Lists.newArrayList();
        this.field25947 = field25947;
    }
    
    public void method19683() {
        this.field25949.clear();
        this.field25948.clear();
        final HashBasedTable create = HashBasedTable.create();
        for (final IRecipe class3662 : this.field25947.method6383()) {
            if (class3662.isDynamic()) {
                continue;
            }
            final Class1956 method19686 = method19686(class3662);
            final String method19687 = class3662.getGroup();
            Class9586 class3663;
            if (!method19687.isEmpty()) {
                class3663 = (Class9586)((Table)create).get((Object)method19686, (Object)method19687);
                if (class3663 == null) {
                    class3663 = this.method19684(method19686);
                    ((Table)create).put((Object)method19686, (Object)method19687, (Object)class3663);
                }
            }
            else {
                class3663 = this.method19684(method19686);
            }
            class3663.method35948(class3662);
        }
    }
    
    private Class9586 method19684(final Class1956 key) {
        final Class9586 class9586 = new Class9586();
        this.field25949.add(class9586);
        this.field25948.computeIfAbsent(key, p0 -> Lists.newArrayList()).add(class9586);
        if (key != Class1956.field10655) {
            if (key != Class1956.field10654) {
                if (key != Class1956.field10656) {
                    if (key == Class1956.field10658 || key == Class1956.field10659) {
                        this.method19685(Class1956.field10657, class9586);
                        return class9586;
                    }
                    if (key == Class1956.field10661) {
                        this.method19685(Class1956.field10660, class9586);
                        return class9586;
                    }
                    if (key == Class1956.field10662) {
                        this.method19685(Class1956.field10662, class9586);
                        return class9586;
                    }
                    if (key != Class1956.field10663) {
                        this.method19685(Class1956.field10648, class9586);
                        return class9586;
                    }
                    this.method19685(Class1956.field10663, class9586);
                    return class9586;
                }
            }
        }
        this.method19685(Class1956.field10653, class9586);
        return class9586;
    }
    
    private void method19685(final Class1956 key, final Class9586 class9586) {
        this.field25948.computeIfAbsent(key, p0 -> Lists.newArrayList()).add(class9586);
    }
    
    private static Class1956 method19686(final IRecipe<?> class3662) {
        final IRecipeType<?> method11300 = class3662.getType();
        if (method11300 != IRecipeType.field37844) {
            if (method11300 == IRecipeType.field37845) {
                return (class3662.getRecipeOutput().getItem() instanceof Class4036) ? Class1956.field10658 : Class1956.field10659;
            }
            if (method11300 == IRecipeType.field37846) {
                return Class1956.field10661;
            }
            if (method11300 == IRecipeType.field37848) {
                return Class1956.field10662;
            }
            if (method11300 == IRecipeType.field37847) {
                return Class1956.field10663;
            }
            final Class7207 method11301 = class3662.getRecipeOutput().getItem().method11737();
            if (method11301 == Class7207.field27993) {
                return Class1956.field10649;
            }
            if (method11301 != Class7207.field28000 && method11301 != Class7207.field28001) {
                return (method11301 != Class7207.field27995) ? Class1956.field10652 : Class1956.field10650;
            }
            return Class1956.field10651;
        }
        else {
            if (!class3662.getRecipeOutput().getItem().method11743()) {
                return (class3662.getRecipeOutput().getItem() instanceof Class4036) ? Class1956.field10655 : Class1956.field10656;
            }
            return Class1956.field10654;
        }
    }
    
    public static List<Class1956> method19687(final Class3426<?> class3426) {
        if (class3426 instanceof Class3428 || class3426 instanceof Class3427) {
            return Lists.newArrayList((Object[])new Class1956[] { Class1956.field10648, Class1956.field10651, Class1956.field10649, Class1956.field10652, Class1956.field10650 });
        }
        if (class3426 instanceof Class3432) {
            return Lists.newArrayList((Object[])new Class1956[] { Class1956.field10653, Class1956.field10654, Class1956.field10655, Class1956.field10656 });
        }
        if (!(class3426 instanceof Class3430)) {
            return (class3426 instanceof Class3431) ? Lists.newArrayList((Object[])new Class1956[] { Class1956.field10660, Class1956.field10661 }) : Lists.newArrayList();
        }
        return Lists.newArrayList((Object[])new Class1956[] { Class1956.field10657, Class1956.field10658, Class1956.field10659 });
    }
    
    public List<Class9586> method19688() {
        return this.field25949;
    }
    
    public List<Class9586> method19689(final Class1956 key) {
        return this.field25948.getOrDefault(key, Collections.emptyList());
    }
}
