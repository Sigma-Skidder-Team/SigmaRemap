// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.context.CommandContext;
import java.util.HashMap;
import com.google.common.collect.Maps;

import java.util.HashSet;
import com.google.common.collect.Sets;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Locale;
import java.util.Random;
import java.util.Collection;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class7589
{
    private static final Dynamic4CommandExceptionType field30108;
    private static final Dynamic4CommandExceptionType field30109;
    
    public static void method23873(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("spreadplayers").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25002("center", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8930.method31491()).then(Class7788.method25002("spreadDistance", (com.mojang.brigadier.arguments.ArgumentType<Object>)FloatArgumentType.floatArg(0.0f)).then(Class7788.method25002("maxRange", (com.mojang.brigadier.arguments.ArgumentType<Object>)FloatArgumentType.floatArg(1.0f)).then(Class7788.method25002("respectTeams", (com.mojang.brigadier.arguments.ArgumentType<Object>)BoolArgumentType.bool()).then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).executes(commandContext -> method23874(commandContext.getSource(), Class8930.method31492(commandContext, "center"), FloatArgumentType.getFloat(commandContext, "spreadDistance"), FloatArgumentType.getFloat(commandContext, "maxRange"), BoolArgumentType.getBool(commandContext, "respectTeams"), Class6886.method21146(commandContext, "targets")))))))));
    }
    
    private static int method23874(final Class7492 class7492, final Vec2f class7493, final float n, final float n2, final boolean b, final Collection<? extends Entity> collection) throws CommandSyntaxException {
        final Random random = new Random();
        final double n3 = class7493.x - n2;
        final double n4 = class7493.y - n2;
        final double n5 = class7493.x + n2;
        final double n6 = class7493.y + n2;
        final Class8296[] method23878 = method23878(random, b ? method23875(collection) : collection.size(), n3, n4, n5, n6);
        method23876(class7493, n, class7492.method23250(), random, n3, n4, n5, n6, method23878, b);
        class7492.method23257(new Class2259("commands.spreadplayers.success." + (b ? "teams" : "entities"), method23878.length, class7493.x, class7493.y, String.format(Locale.ROOT, "%.2f", method23877(collection, class7492.method23250(), method23878, b))), true);
        return method23878.length;
    }
    
    private static int method23875(final Collection<? extends Entity> collection) {
        final HashSet hashSet = Sets.newHashSet();
        for (final Entity class399 : collection) {
            if (!(class399 instanceof PlayerEntity)) {
                hashSet.add(null);
            }
            else {
                hashSet.add(class399.getTeam());
            }
        }
        return hashSet.size();
    }
    
    private static void method23876(final Vec2f class9544, final double n, final Class1849 class9545, final Random random, final double n2, final double n3, final double n4, final double n5, final Class8296[] array, final boolean b) throws CommandSyntaxException {
        int n6 = 1;
        double min = 3.4028234663852886E38;
        int n7;
        for (n7 = 0; n7 < 10000 && n6 != 0; ++n7) {
            n6 = 0;
            min = 3.4028234663852886E38;
            for (int i = 0; i < array.length; ++i) {
                final Class8296 class9546 = array[i];
                int n8 = 0;
                final Class8296 class9547 = new Class8296();
                for (int j = 0; j < array.length; ++j) {
                    if (i != j) {
                        final Class8296 class9548 = array[j];
                        final double method27565 = class9546.method27565(class9548);
                        min = Math.min(method27565, min);
                        if (method27565 < n) {
                            ++n8;
                            Class8296.method27573(class9547, Class8296.method27574(class9547) + (Class8296.method27574(class9548) - Class8296.method27574(class9546)));
                            Class8296.method27575(class9547, Class8296.method27576(class9547) + (Class8296.method27576(class9548) - Class8296.method27576(class9546)));
                        }
                    }
                }
                if (n8 > 0) {
                    Class8296.method27573(class9547, Class8296.method27574(class9547) / n8);
                    Class8296.method27575(class9547, Class8296.method27576(class9547) / n8);
                    if (class9547.method27567() <= 0.0) {
                        class9546.method27572(random, n2, n3, n4, n5);
                    }
                    else {
                        class9547.method27566();
                        class9546.method27568(class9547);
                    }
                    n6 = 1;
                }
                if (class9546.method27569(n2, n3, n4, n5)) {
                    n6 = 1;
                }
            }
            if (n6 == 0) {
                for (final Class8296 class9549 : array) {
                    if (!class9549.method27571(class9545)) {
                        class9549.method27572(random, n2, n3, n4, n5);
                        n6 = 1;
                    }
                }
            }
        }
        if (min == 3.4028234663852886E38) {
            min = 0.0;
        }
        if (n7 < 10000) {
            return;
        }
        if (!b) {
            throw Class7589.field30109.create(array.length, class9544.x, class9544.y, String.format(Locale.ROOT, "%.2f", min));
        }
        throw Class7589.field30108.create(array.length, class9544.x, class9544.y, String.format(Locale.ROOT, "%.2f", min));
    }
    
    private static double method23877(final Collection<? extends Entity> collection, final Class1849 class1849, final Class8296[] array, final boolean b) {
        double n = 0.0;
        int n2 = 0;
        final HashMap hashMap = Maps.newHashMap();
        for (final Entity class1850 : collection) {
            Class8296 class1851;
            if (!b) {
                class1851 = array[n2++];
            }
            else {
                final Team class1852 = (class1850 instanceof PlayerEntity) ? class1850.getTeam() : null;
                if (!hashMap.containsKey(class1852)) {
                    hashMap.put(class1852, array[n2++]);
                }
                class1851 = (Class8296)hashMap.get(class1852);
            }
            class1850.method1877(MathHelper.floor(Class8296.method27574(class1851)) + 0.5f, class1851.method27570(class1849), MathHelper.floor(Class8296.method27576(class1851)) + 0.5);
            double min = Double.MAX_VALUE;
            for (final Class8296 class1853 : array) {
                if (class1851 != class1853) {
                    min = Math.min(class1851.method27565(class1853), min);
                }
            }
            n += min;
        }
        if (collection.size() >= 2) {
            return n / collection.size();
        }
        return 0.0;
    }
    
    private static Class8296[] method23878(final Random random, final int n, final double n2, final double n3, final double n4, final double n5) {
        final Class8296[] array = new Class8296[n];
        for (int i = 0; i < array.length; ++i) {
            final Class8296 class8296 = new Class8296();
            class8296.method27572(random, n2, n3, n4, n5);
            array[i] = class8296;
        }
        return array;
    }
    
    static {
        field30108 = new Dynamic4CommandExceptionType((o, o2, o3, o4) -> new Class2259("commands.spreadplayers.failed.teams", o, o2, o3, o4));
        field30109 = new Dynamic4CommandExceptionType((o, o2, o3, o4) -> new Class2259("commands.spreadplayers.failed.entities", o, o2, o3, o4));
    }
}
