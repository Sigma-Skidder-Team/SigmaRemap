// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.math.Vec3d;

public class Class9545
{
    private static final SimpleCommandExceptionType field41093;
    
    public static void method35628(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("particle").requires(class7492 -> class7492.method23210(2))).then(((RequiredArgumentBuilder)Class7788.method25002("name", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7384.method22672()).executes(commandContext -> method35629(commandContext.getSource(), Class7384.method22673(commandContext, "name"), commandContext.getSource().method23249(), Vec3d.ZERO, 0.0f, 0, false, commandContext.getSource().method23255().method1537().method20623()))).then(((RequiredArgumentBuilder)Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7555.method23719()).executes(commandContext -> method35629(commandContext.getSource(), Class7384.method22673(commandContext, "name"), Class7555.method23721(commandContext, "pos"), Vec3d.ZERO, 0.0f, 0, false, commandContext.getSource().method23255().method1537().method20623()))).then(Class7788.method25002("delta", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7555.method23720(false)).then(Class7788.method25002("speed", (com.mojang.brigadier.arguments.ArgumentType<Object>)FloatArgumentType.floatArg(0.0f)).then(((RequiredArgumentBuilder)Class7788.method25002("count", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method35629(commandContext.getSource(), Class7384.method22673(commandContext, "name"), Class7555.method23721(commandContext, "pos"), Class7555.method23721(commandContext, "delta"), FloatArgumentType.getFloat(commandContext, "speed"), IntegerArgumentType.getInteger(commandContext, "count"), false, commandContext.getSource().method23255().method1537().method20623()))).then(((LiteralArgumentBuilder)Class7788.method25001("force").executes(commandContext -> method35629(commandContext.getSource(), Class7384.method22673(commandContext, "name"), Class7555.method23721(commandContext, "pos"), Class7555.method23721(commandContext, "delta"), FloatArgumentType.getFloat(commandContext, "speed"), IntegerArgumentType.getInteger(commandContext, "count"), true, commandContext.getSource().method23255().method1537().method20623()))).then(Class7788.method25002("viewers", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).executes(commandContext -> method35629(commandContext.getSource(), Class7384.method22673(commandContext, "name"), Class7555.method23721(commandContext, "pos"), Class7555.method23721(commandContext, "delta"), FloatArgumentType.getFloat(commandContext, "speed"), IntegerArgumentType.getInteger(commandContext, "count"), true, Class6886.method21152(commandContext, "viewers"))))).then(((LiteralArgumentBuilder)Class7788.method25001("normal").executes(commandContext -> method35629(commandContext.getSource(), Class7384.method22673(commandContext, "name"), Class7555.method23721(commandContext, "pos"), Class7555.method23721(commandContext, "delta"), FloatArgumentType.getFloat(commandContext, "speed"), IntegerArgumentType.getInteger(commandContext, "count"), false, commandContext.getSource().method23255().method1537().method20623()))).then(Class7788.method25002("viewers", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).executes(commandContext -> method35629(commandContext.getSource(), Class7384.method22673(commandContext, "name"), Class7555.method23721(commandContext, "pos"), Class7555.method23721(commandContext, "delta"), FloatArgumentType.getFloat(commandContext, "speed"), IntegerArgumentType.getInteger(commandContext, "count"), false, Class6886.method21152(commandContext, "viewers")))))))))));
    }
    
    private static int method35629(final Class7492 class7492, final IParticleData class7493, final Vec3d class7494, final Vec3d class7495, final float n, final int n2, final boolean b, final Collection<Class513> collection) throws CommandSyntaxException {
        int n3 = 0;
        final Iterator<Class513> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!class7492.method23250().method6912(iterator.next(), class7493, b, class7494.x, class7494.y, class7494.z, n2, class7495.x, class7495.y, class7495.z, n)) {
                continue;
            }
            ++n3;
        }
        if (n3 != 0) {
            class7492.method23257(new Class2259("commands.particle.success", Registry.field222.getKey(class7493.method21272()).toString()), true);
            return n3;
        }
        throw Class9545.field41093.create();
    }
    
    static {
        field41093 = new SimpleCommandExceptionType(new Class2259("commands.particle.failed", new Object[0]));
    }
}
