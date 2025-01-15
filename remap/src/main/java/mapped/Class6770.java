// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.List;

import it.unimi.dsi.fastutil.longs.Long2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import net.minecraft.util.Direction;

public class Class6770
{
    private static String[] field26582;
    private static final ThreadLocal<Class9554> field26583;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<Class9554>> field26584;
    
    public static boolean method20647(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099, final Class9145 class7100) {
        final Class5719 class7101 = new Class5719(class7096);
        Class9463.method35173().method35188().method21097(class7101);
        if (class7101.method16987()) {
            return true;
        }
        if (!class7101.method16962()) {
            final BlockPos method1149 = class7098.method1149(class7099);
            final Class7096 method1150 = class7097.method6701(method1149);
            return !class7096.method21724(method1150, class7099) && (!method1150.method21723() || method20648(class7096, class7097, class7098, class7099, class7100, method1150, method1149));
        }
        return false;
    }
    
    public static boolean method20648(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Direction class7099, final Class9145 class7100, final Class7096 class7101, final BlockPos class7102) {
        final long n = (long)class7096.method21694() << 36 | (long)class7101.method21694() << 4 | (long)class7099.ordinal();
        final Long2ByteLinkedOpenHashMap method33401 = class7100.method33401();
        final byte andMoveToFirst = method33401.getAndMoveToFirst(n);
        if (andMoveToFirst == 0) {
            final boolean method33402 = Class7698.method24496(class7096.method21701(class7097, class7098, class7099), class7101.method21701(class7097, class7102, class7099.getOpposite()), Class9306.field39920);
            if (method33401.size() > 400) {
                method33401.removeLastByte();
            }
            method33401.putAndMoveToFirst(n, (byte)(method33402 ? 1 : -1));
            return method33402;
        }
        return andMoveToFirst > 0;
    }
    
    public static int method20649(final Class3833 class3833) {
        return Class90.field208.method504(class3833);
    }
    
    public static Class3833 method20650(final Class1932 class1932) {
        return Class90.field208.method510(class1932) ? Class90.field208.method505(class1932) : null;
    }
    
    public static int method20651(final Class7096 class7096) {
        return ((List)class7096.method21696().method11876().method32902()).indexOf(class7096);
    }
    
    public static int method20652(final Class3833 class3833) {
        return ((List)class3833.method11876().method32902()).size();
    }
    
    public static Class7096 method20653(final Class3833 class3833, final int n) {
        final com.google.common.collect.ImmutableList<Class7096> method32902 = class3833.method11876().method32902();
        if (n >= 0 && n < ((List)method32902).size()) {
            return (Class7096)((List)method32902).get(n);
        }
        return null;
    }
    
    public static List<Class7096> method20654(final Class3833 class3833) {
        return (List<Class7096>)class3833.method11876().method32902();
    }
    
    public static boolean method20655(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return Class3833.method11816(class7096.method21727(class7097, class7098));
    }
    
    public static Collection<Class7111<?>> method20656(final Class7096 class7096) {
        return class7096.method21770();
    }
    
    static {
        field26583 = ThreadLocal.withInitial(() -> new Class9554(null, null, null, null));
        field26584 = ThreadLocal.withInitial(() -> {
            final Class2268 class2268 = new Class2268(200);
            class2268.defaultReturnValue((byte)127);
            return class2268;
        });
    }
}
