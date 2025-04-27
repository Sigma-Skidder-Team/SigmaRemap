// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class8781
{
    private static final SimpleCommandExceptionType field36921;
    
    public static void method30548(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("xp").requires(class7492 -> class7492.method23210(2))).redirect(commandDispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class7788.method25001("experience").requires(class7493 -> class7493.method23210(2))).then(Class7788.method25001("add").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).then(((RequiredArgumentBuilder)Class7788.method25002("amount", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer()).executes(commandContext -> method30550(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), IntegerArgumentType.getInteger(commandContext, "amount"), Class2120.field12359))).then(Class7788.method25001("points").executes(commandContext -> method30550(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), IntegerArgumentType.getInteger(commandContext, "amount"), Class2120.field12359))).then(Class7788.method25001("levels").executes(commandContext -> method30550(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), IntegerArgumentType.getInteger(commandContext, "amount"), Class2120.field12360)))))).then(Class7788.method25001("set").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).then(((RequiredArgumentBuilder)Class7788.method25002("amount", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method30551(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), IntegerArgumentType.getInteger(commandContext, "amount"), Class2120.field12359))).then(Class7788.method25001("points").executes(commandContext -> method30551(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), IntegerArgumentType.getInteger(commandContext, "amount"), Class2120.field12359))).then(Class7788.method25001("levels").executes(commandContext -> method30551(commandContext.getSource(), Class6886.method21152(commandContext, "targets"), IntegerArgumentType.getInteger(commandContext, "amount"), Class2120.field12360)))))).then(Class7788.method25001("query").then(((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21149()).then(Class7788.method25001("points").executes(commandContext -> method30549(commandContext.getSource(), Class6886.method21150(commandContext, "targets"), Class2120.field12359)))).then(Class7788.method25001("levels").executes(commandContext -> method30549(commandContext.getSource(), Class6886.method21150(commandContext, "targets"), Class2120.field12360))))))));
    }
    
    private static int method30549(final Class7492 class7492, final Class513 class7493, final Class2120 class7494) {
        final int applyAsInt = Class2120.method8272(class7494).applyAsInt(class7493);
        class7492.method23257(new Class2259("commands.experience.query." + class7494.field12363, class7493.getDisplayName(), applyAsInt), false);
        return applyAsInt;
    }
    
    private static int method30550(final Class7492 class7492, final Collection<? extends Class513> collection, final int i, final Class2120 class7493) {
        final Iterator<? extends Class513> iterator = collection.iterator();
        while (iterator.hasNext()) {
            class7493.field12361.accept(iterator.next(), i);
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.experience.add." + class7493.field12363 + ".success.multiple", i, collection.size()), true);
        }
        else {
            class7492.method23257(new Class2259("commands.experience.add." + class7493.field12363 + ".success.single", i, collection.iterator().next().getDisplayName()), true);
        }
        return collection.size();
    }
    
    private static int method30551(final Class7492 class7492, final Collection<? extends Class513> collection, final int i, final Class2120 class7493) throws CommandSyntaxException {
        int n = 0;
        final Iterator<? extends Class513> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!class7493.field12362.test(iterator.next(), i)) {
                continue;
            }
            ++n;
        }
        if (n != 0) {
            if (collection.size() != 1) {
                class7492.method23257(new Class2259("commands.experience.set." + class7493.field12363 + ".success.multiple", i, collection.size()), true);
            }
            else {
                class7492.method23257(new Class2259("commands.experience.set." + class7493.field12363 + ".success.single", i, collection.iterator().next().getDisplayName()), true);
            }
            return collection.size();
        }
        throw Class8781.field36921.create();
    }
    
    static {
        field36921 = new SimpleCommandExceptionType(new Class2259("commands.experience.set.points.invalid", new Object[0]));
    }
}
