// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Locale;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class9232
{
    public static void method34033(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("title").requires(class7492 -> class7492.method23210(2))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).then(Class7788.method25001("clear").executes(commandContext -> method34034((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"))))).then(Class7788.method25001("reset").executes(commandContext -> method34035((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"))))).then(Class7788.method25001("title").then(Class7788.method25002("title", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9502.method35390()).executes(commandContext -> method34036((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class9502.method35389((CommandContext<Class7492>)commandContext, "title"), Class2019.field11514))))).then(Class7788.method25001("subtitle").then(Class7788.method25002("title", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9502.method35390()).executes(commandContext -> method34036((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class9502.method35389((CommandContext<Class7492>)commandContext, "title"), Class2019.field11515))))).then(Class7788.method25001("actionbar").then(Class7788.method25002("title", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9502.method35390()).executes(commandContext -> method34036((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Class9502.method35389((CommandContext<Class7492>)commandContext, "title"), Class2019.field11516))))).then(Class7788.method25001("times").then(Class7788.method25002("fadeIn", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).then(Class7788.method25002("stay", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).then(Class7788.method25002("fadeOut", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method34037((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), IntegerArgumentType.getInteger(commandContext, "fadeIn"), IntegerArgumentType.getInteger(commandContext, "stay"), IntegerArgumentType.getInteger(commandContext, "fadeOut")))))))));
    }
    
    private static int method34034(final Class7492 class7492, final Collection<Class513> collection) {
        final Class4352 class7493 = new Class4352(Class2019.field11518, null);
        final Iterator<Class513> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().field3039.method17469(class7493);
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.title.cleared.multiple", new Object[] { collection.size() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.title.cleared.single", new Object[] { collection.iterator().next().method1871() }), true);
        }
        return collection.size();
    }
    
    private static int method34035(final Class7492 class7492, final Collection<Class513> collection) {
        final Class4352 class7493 = new Class4352(Class2019.field11519, null);
        final Iterator<Class513> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().field3039.method17469(class7493);
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.title.reset.multiple", new Object[] { collection.size() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.title.reset.single", new Object[] { collection.iterator().next().method1871() }), true);
        }
        return collection.size();
    }
    
    private static int method34036(final Class7492 class7492, final Collection<Class513> collection, final Class2250 class7493, final Class2019 class7494) throws CommandSyntaxException {
        for (final Class513 class7495 : collection) {
            class7495.field3039.method17469(new Class4352(class7494, Class9479.method35294(class7492, class7493, class7495, 0)));
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.title.show." + class7494.name().toLowerCase(Locale.ROOT) + ".multiple", new Object[] { collection.size() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.title.show." + class7494.name().toLowerCase(Locale.ROOT) + ".single", new Object[] { collection.iterator().next().method1871() }), true);
        }
        return collection.size();
    }
    
    private static int method34037(final Class7492 class7492, final Collection<Class513> collection, final int n, final int n2, final int n3) {
        final Class4352 class7493 = new Class4352(n, n2, n3);
        final Iterator<Class513> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().field3039.method17469(class7493);
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.title.times.multiple", new Object[] { collection.size() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.title.times.single", new Object[] { collection.iterator().next().method1871() }), true);
        }
        return collection.size();
    }
}
