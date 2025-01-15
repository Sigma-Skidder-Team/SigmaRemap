// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.entity.Entity;

public class Class9250
{
    private static final SimpleCommandExceptionType field39664;
    private static final SimpleCommandExceptionType field39665;
    
    public static void method34095(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)Class7788.method25001("trigger").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("objective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).suggests((commandContext, suggestionsBuilder) -> method34096((Class7492)commandContext.getSource(), suggestionsBuilder)).executes(commandContext -> method34099((Class7492)commandContext.getSource(), method34100(((Class7492)commandContext.getSource()).method23253(), Class8717.method29934((CommandContext<Class7492>)commandContext, "objective"))))).then(Class7788.method25001("add").then(Class7788.method25002("value", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer()).executes(commandContext -> method34097((Class7492)commandContext.getSource(), method34100(((Class7492)commandContext.getSource()).method23253(), Class8717.method29934((CommandContext<Class7492>)commandContext, "objective")), IntegerArgumentType.getInteger(commandContext, "value")))))).then(Class7788.method25001("set").then(Class7788.method25002("value", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer()).executes(commandContext -> method34098((Class7492)commandContext.getSource(), method34100(((Class7492)commandContext.getSource()).method23253(), Class8717.method29934((CommandContext<Class7492>)commandContext, "objective")), IntegerArgumentType.getInteger(commandContext, "value")))))));
    }
    
    public static CompletableFuture<Suggestions> method34096(final Class7492 class7492, final SuggestionsBuilder suggestionsBuilder) {
        final Entity method23251 = class7492.method23251();
        final ArrayList arrayList = Lists.newArrayList();
        if (method23251 != null) {
            final Class6515 method23252 = class7492.method23255().method1579();
            final String method23253 = method23251.method1867();
            for (final Class9290 class7493 : method23252.method19638()) {
                if (class7493.method34313() != Class9456.field40641) {
                    continue;
                }
                if (!method23252.method19635(method23253, class7493)) {
                    continue;
                }
                if (method23252.method19636(method23253, class7493).method23975()) {
                    continue;
                }
                arrayList.add(class7493.method34312());
            }
        }
        return Class7491.method23226(arrayList, suggestionsBuilder);
    }
    
    private static int method34097(final Class7492 class7492, final Class7628 class7493, final int i) {
        class7493.method23967(i);
        class7492.method23257(new Class2259("commands.trigger.add.success", new Object[] { class7493.method23972().method34315(), i }), true);
        return class7493.method23969();
    }
    
    private static int method34098(final Class7492 class7492, final Class7628 class7493, final int i) {
        class7493.method23971(i);
        class7492.method23257(new Class2259("commands.trigger.set.success", new Object[] { class7493.method23972().method34315(), i }), true);
        return i;
    }
    
    private static int method34099(final Class7492 class7492, final Class7628 class7493) {
        class7493.method23967(1);
        class7492.method23257(new Class2259("commands.trigger.simple.success", new Object[] { class7493.method23972().method34315() }), true);
        return class7493.method23969();
    }
    
    private static Class7628 method34100(final Class513 class513, final Class9290 class514) throws CommandSyntaxException {
        if (class514.method34313() != Class9456.field40641) {
            throw Class9250.field39665.create();
        }
        final Class6516 method2890 = class513.method2890();
        final String method2891 = class513.method1867();
        if (!method2890.method19635(method2891, class514)) {
            throw Class9250.field39664.create();
        }
        final Class7628 method2892 = method2890.method19636(method2891, class514);
        if (!method2892.method23975()) {
            method2892.method23976(true);
            return method2892;
        }
        throw Class9250.field39664.create();
    }
    
    static {
        field39664 = new SimpleCommandExceptionType((Message)new Class2259("commands.trigger.failed.unprimed", new Object[0]));
        field39665 = new SimpleCommandExceptionType((Message)new Class2259("commands.trigger.failed.invalid", new Object[0]));
    }
}
