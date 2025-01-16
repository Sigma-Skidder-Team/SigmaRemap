// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Locale;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.math.MathHelper;

public class Class8412
{
    private static final SimpleCommandExceptionType field34540;
    private static final SimpleCommandExceptionType field34541;
    private static final SimpleCommandExceptionType field34542;
    private static final SimpleCommandExceptionType field34543;
    private static final SimpleCommandExceptionType field34544;
    private static final SimpleCommandExceptionType field34545;
    private static final SimpleCommandExceptionType field34546;
    private static final SimpleCommandExceptionType field34547;
    
    public static void method28085(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("worldborder").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25001("add").then(((RequiredArgumentBuilder)Class7788.method25002("distance", (com.mojang.brigadier.arguments.ArgumentType<Object>)FloatArgumentType.floatArg(-6.0E7f, 6.0E7f)).executes(commandContext -> method28092((Class7492)commandContext.getSource(), ((Class7492)commandContext.getSource()).method23250().getWorldBorder().method34791() + FloatArgumentType.getFloat(commandContext, "distance"), 0L))).then(Class7788.method25002("time", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method28092((Class7492)commandContext.getSource(), ((Class7492)commandContext.getSource()).method23250().getWorldBorder().method34791() + FloatArgumentType.getFloat(commandContext, "distance"), ((Class7492)commandContext.getSource()).method23250().getWorldBorder().method34792() + IntegerArgumentType.getInteger(commandContext, "time") * 1000L)))))).then(Class7788.method25001("set").then(((RequiredArgumentBuilder)Class7788.method25002("distance", (com.mojang.brigadier.arguments.ArgumentType<Object>)FloatArgumentType.floatArg(-6.0E7f, 6.0E7f)).executes(commandContext -> method28092((Class7492)commandContext.getSource(), FloatArgumentType.getFloat(commandContext, "distance"), 0L))).then(Class7788.method25002("time", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method28092((Class7492)commandContext.getSource(), FloatArgumentType.getFloat(commandContext, "distance"), IntegerArgumentType.getInteger(commandContext, "time") * 1000L)))))).then(Class7788.method25001("center").then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8930.method31491()).executes(commandContext -> method28091((Class7492)commandContext.getSource(), Class8930.method31492((CommandContext<Class7492>)commandContext, "pos")))))).then(((LiteralArgumentBuilder)Class7788.method25001("damage").then(Class7788.method25001("amount").then(Class7788.method25002("damagePerBlock", (com.mojang.brigadier.arguments.ArgumentType<Object>)FloatArgumentType.floatArg(0.0f)).executes(commandContext -> method28087((Class7492)commandContext.getSource(), FloatArgumentType.getFloat(commandContext, "damagePerBlock")))))).then(Class7788.method25001("buffer").then(Class7788.method25002("distance", (com.mojang.brigadier.arguments.ArgumentType<Object>)FloatArgumentType.floatArg(0.0f)).executes(commandContext -> method28086((Class7492)commandContext.getSource(), FloatArgumentType.getFloat(commandContext, "distance"))))))).then(Class7788.method25001("get").executes(commandContext -> method28090((Class7492)commandContext.getSource())))).then(((LiteralArgumentBuilder)Class7788.method25001("warning").then(Class7788.method25001("distance").then(Class7788.method25002("distance", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method28089((Class7492)commandContext.getSource(), IntegerArgumentType.getInteger(commandContext, "distance")))))).then(Class7788.method25001("time").then(Class7788.method25002("time", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method28088((Class7492)commandContext.getSource(), IntegerArgumentType.getInteger(commandContext, "time")))))));
    }
    
    private static int method28086(final Class7492 class7492, final float f) throws CommandSyntaxException {
        final WorldBorder method6787 = class7492.method23250().getWorldBorder();
        if (method6787.method34800() != f) {
            method6787.method34801(f);
            class7492.method23257(new Class2259("commands.worldborder.damage.buffer.success", new Object[] { String.format(Locale.ROOT, "%.2f", f) }), true);
            return (int)f;
        }
        throw Class8412.field34546.create();
    }
    
    private static int method28087(final Class7492 class7492, final float f) throws CommandSyntaxException {
        final WorldBorder method6787 = class7492.method23250().getWorldBorder();
        if (method6787.method34802() != f) {
            method6787.method34803(f);
            class7492.method23257(new Class2259("commands.worldborder.damage.amount.success", new Object[] { String.format(Locale.ROOT, "%.2f", f) }), true);
            return (int)f;
        }
        throw Class8412.field34547.create();
    }
    
    private static int method28088(final Class7492 class7492, final int i) throws CommandSyntaxException {
        final WorldBorder method6787 = class7492.method23250().getWorldBorder();
        if (method6787.method34805() != i) {
            method6787.method34806(i);
            class7492.method23257(new Class2259("commands.worldborder.warning.time.success", new Object[] { i }), true);
            return i;
        }
        throw Class8412.field34544.create();
    }
    
    private static int method28089(final Class7492 class7492, final int i) throws CommandSyntaxException {
        final WorldBorder method6787 = class7492.method23250().getWorldBorder();
        if (method6787.method34807() != i) {
            method6787.method34808(i);
            class7492.method23257(new Class2259("commands.worldborder.warning.distance.success", new Object[] { i }), true);
            return i;
        }
        throw Class8412.field34545.create();
    }
    
    private static int method28090(final Class7492 class7492) {
        final double method34791 = class7492.method23250().getWorldBorder().method34791();
        class7492.method23257(new Class2259("commands.worldborder.get", new Object[] { String.format(Locale.ROOT, "%.0f", method34791) }), false);
        return MathHelper.floor(method34791 + 0.5);
    }
    
    private static int method28091(final Class7492 class7492, final Vec2f class7493) throws CommandSyntaxException {
        final WorldBorder method6787 = class7492.method23250().getWorldBorder();
        if (method6787.method34777() == class7493.x && method6787.method34778() == class7493.y) {
            throw Class8412.field34540.create();
        }
        method6787.method34790(class7493.x, class7493.y);
        class7492.method23257(new Class2259("commands.worldborder.center.success", new Object[] { String.format(Locale.ROOT, "%.2f", class7493.x), String.format("%.2f", class7493.y) }), true);
        return 0;
    }
    
    private static int method28092(final Class7492 class7492, final double d, final long n) throws CommandSyntaxException {
        final WorldBorder method6787 = class7492.method23250().getWorldBorder();
        final double method6788 = method6787.method34791();
        if (method6788 == d) {
            throw Class8412.field34541.create();
        }
        if (d < 1.0) {
            throw Class8412.field34542.create();
        }
        if (d <= 6.0E7) {
            if (n <= 0L) {
                method6787.method34794(d);
                class7492.method23257(new Class2259("commands.worldborder.set.immediate", new Object[] { String.format(Locale.ROOT, "%.1f", d) }), true);
            }
            else {
                method6787.method34795(method6788, d, n);
                if (d <= method6788) {
                    class7492.method23257(new Class2259("commands.worldborder.set.shrink", new Object[] { String.format(Locale.ROOT, "%.1f", d), Long.toString(n / 1000L) }), true);
                }
                else {
                    class7492.method23257(new Class2259("commands.worldborder.set.grow", new Object[] { String.format(Locale.ROOT, "%.1f", d), Long.toString(n / 1000L) }), true);
                }
            }
            return (int)(d - method6788);
        }
        throw Class8412.field34543.create();
    }
    
    static {
        field34540 = new SimpleCommandExceptionType((Message)new Class2259("commands.worldborder.center.failed", new Object[0]));
        field34541 = new SimpleCommandExceptionType((Message)new Class2259("commands.worldborder.set.failed.nochange", new Object[0]));
        field34542 = new SimpleCommandExceptionType((Message)new Class2259("commands.worldborder.set.failed.small.", new Object[0]));
        field34543 = new SimpleCommandExceptionType((Message)new Class2259("commands.worldborder.set.failed.big.", new Object[0]));
        field34544 = new SimpleCommandExceptionType((Message)new Class2259("commands.worldborder.warning.time.failed", new Object[0]));
        field34545 = new SimpleCommandExceptionType((Message)new Class2259("commands.worldborder.warning.distance.failed", new Object[0]));
        field34546 = new SimpleCommandExceptionType((Message)new Class2259("commands.worldborder.damage.buffer.failed", new Object[0]));
        field34547 = new SimpleCommandExceptionType((Message)new Class2259("commands.worldborder.damage.amount.failed", new Object[0]));
    }
}
