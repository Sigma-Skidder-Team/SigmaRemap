// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;
import java.util.Map;

public class Class7667
{
    public static Object field30452;
    public static Object field30453;
    public static Object field30454;
    public static final boolean field30455;
    public static final boolean field30456;
    private static Boolean field30457;
    
    public static void method24301(final String s, final Object o) {
        final Map map = (Map)Class9570.method35827(Class9570.field41377);
        if (map != null) {
            map.put(s, o);
        }
    }
    
    public static InputStream method24302(String method35517) {
        if (Class9570.field41565.method22623()) {
            method35517 = Class9518.method35517(method35517, "/");
            return (InputStream)Class9570.method35818(Class9570.field41566, method35517);
        }
        return null;
    }
    
    public static Class7363 method24303() {
        final String str = "optifine.OptiFineResourceLocator";
        final Object value = System.getProperties().get(str + ".class");
        if (!(value instanceof Class)) {
            return new Class7363(str);
        }
        return new Class7363((Class)value);
    }
    
    public static boolean method24304(final BlockState class7096) {
        return Class7667.field30455 ? Class9570.method35820(class7096, Class9570.field41246) : class7096.getBlock().method11802();
    }
    
    public static boolean method24305(final ItemStack class8321) {
        return Class9570.field41332.method22605() ? Class9570.method35820(class8321.getItem(), Class9570.field41332, class8321) : class8321.method27631();
    }
    
    public static int method24306(final BlockState class7096, final Class1856 class7097, final BlockPos class7098) {
        return Class9570.field41243.method22605() ? Class9570.method35821(class7096, Class9570.field41243, class7097, class7098) : class7096.getLightValue();
    }
    
    public static Class6356 method24307(final ItemStack class8321, final World class8322) {
        if (!Class9570.field41282.method22623()) {
            return Class4094.method12328(class8321, class8322);
        }
        final Class4094 class8323 = (Class4094)class8321.getItem();
        return Class4094.method12328(class8321, class8322);
    }
    
    public static String[] method24308() {
        if (!Class9570.field41382.method22623()) {
            return new String[0];
        }
        final List list = (List)Class9570.method35826(Class9570.method35818(Class9570.field41384), Class9570.field41383, new Object[0]);
        if (list != null) {
            final ArrayList list2 = new ArrayList();
            for (final Object next : list) {
                if (!Class9570.field41389.method22625(next)) {
                    continue;
                }
                final String method35825 = Class9570.method35825(next, Class9570.field41390);
                if (method35825 == null) {
                    continue;
                }
                list2.add(method35825);
            }
            return (String[])list2.toArray(new String[list2.size()]);
        }
        return new String[0];
    }
    
    public static boolean method24309(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return Class9570.field41247.method22605() ? Class9570.method35820(class7096, Class9570.field41247, class7097, class7098) : class7096.method21706();
    }
    
    public static boolean method24310(final ItemStack class8321, final ItemStack class8322, final PlayerEntity class8323, final Class759 class8324) {
        return Class9570.field41334.method22605() ? Class9570.method35820(class8321, Class9570.field41334, class8322, class8323, class8324) : (class8321.getItem() instanceof Class4075);
    }
    
    public static boolean method24311(final ItemStack class8321, final PlayerEntity class8322) {
        if (!Class9570.field41337.method22605()) {
            return class8321.getItem() == Items.field31583;
        }
        return Class9570.method35820(class8321, Class9570.field41337);
    }
    
    public static Class654 method24312(final MainMenu mainMenu, final int n, final int n2) {
        if (Class9570.field41399.method22619()) {
            return new Class654(mainMenu.width / 2 - 100, n + n2 * 2, 98, 20, Class8822.method30773("fml.menu.mods"), class549 -> Minecraft.getInstance().displayGuiScreen((Screen)Class9570.field41399.method22621(mainMenu)));
        }
        return null;
    }
    
    public static void method24313(final boolean b) {
        if (Class9570.field41316.method22634()) {
            method24315(Class9570.field41316, b);
        }
    }
    
    public static boolean method24314(final Class7364 class7364, final boolean b) {
        if (!class7364.method22634()) {
            return b;
        }
        final Object method22630 = Class9570.field41314.method22630();
        if (method22630 == null) {
            return b;
        }
        final Object method22631 = Class9570.method35828(method22630, class7364);
        if (method22631 != null) {
            return Class9570.method35820(method22631, Class9570.field41322);
        }
        return b;
    }
    
    private static void method24315(final Class7364 class7364, final boolean b) {
        if (class7364.method22634()) {
            final Object method22630 = Class9570.field41314.method22630();
            if (method22630 != null) {
                final Object method22631 = Class9570.method35828(method22630, class7364);
                if (method22631 != null) {
                    Class9570.method35837(method22631, Class9570.field41320, new Class8146(b));
                    final Object method22632 = Class9570.method35828(method22631, Class9570.field41321);
                    if (method22632 != null) {
                        Class9570.method35837(method22632, Class9570.field41318, null);
                    }
                    Class7497.method23333("Set ForgeConfig.CLIENT." + class7364.method22629().getName() + "=" + b);
                }
            }
        }
    }
    
    public static boolean method24316(final Entity class399) {
        return !Class7667.field30456 || Class9570.method35820(class399, Class9570.field41252);
    }
    
    static {
        Class7667.field30452 = Class9570.method35827(Class9570.field41231);
        Class7667.field30453 = Class9570.method35827(Class9570.field41230);
        Class7667.field30454 = Class9570.method35827(Class9570.field41232);
        field30455 = Class9570.field41246.method22605();
        field30456 = Class9570.field41252.method22605();
    }
}
