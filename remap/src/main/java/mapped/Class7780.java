// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.Collections;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class7780
{
    private static final SimpleCommandExceptionType field31853;
    private static final SimpleCommandExceptionType field31854;
    
    public static void method24971(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("recipe").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25001("give").then(((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).then(Class7788.method25002("recipe", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests((SuggestionProvider)Class8533.field35815).executes(commandContext -> method24972((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Collections.singleton(Class7000.method21431((CommandContext<Class7492>)commandContext, "recipe")))))).then(Class7788.method25001("*").executes(commandContext -> method24972((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), ((Class7492)commandContext.getSource()).method23255().method1577().method6383())))))).then(Class7788.method25001("take").then(((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).then(Class7788.method25002("recipe", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests((SuggestionProvider)Class8533.field35815).executes(commandContext -> method24973((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), Collections.singleton(Class7000.method21431((CommandContext<Class7492>)commandContext, "recipe")))))).then(Class7788.method25001("*").executes(commandContext -> method24973((Class7492)commandContext.getSource(), Class6886.method21152((CommandContext<Class7492>)commandContext, "targets"), ((Class7492)commandContext.getSource()).method23255().method1577().method6383()))))));
    }
    
    private static int method24972(final Class7492 class7492, final Collection<Class513> collection, final Collection<IRecipe<?>> collection2) throws CommandSyntaxException {
        int n = 0;
        final Iterator<Class513> iterator = collection.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().method2862(collection2);
        }
        if (n != 0) {
            if (collection.size() != 1) {
                class7492.method23257(new Class2259("commands.recipe.give.success.multiple", new Object[] { collection2.size(), collection.size() }), true);
            }
            else {
                class7492.method23257(new Class2259("commands.recipe.give.success.single", new Object[] { collection2.size(), collection.iterator().next().getDisplayName() }), true);
            }
            return n;
        }
        throw Class7780.field31853.create();
    }
    
    private static int method24973(final Class7492 class7492, final Collection<Class513> collection, final Collection<IRecipe<?>> collection2) throws CommandSyntaxException {
        int n = 0;
        final Iterator<Class513> iterator = collection.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().method2864(collection2);
        }
        if (n != 0) {
            if (collection.size() != 1) {
                class7492.method23257(new Class2259("commands.recipe.take.success.multiple", new Object[] { collection2.size(), collection.size() }), true);
            }
            else {
                class7492.method23257(new Class2259("commands.recipe.take.success.single", new Object[] { collection2.size(), collection.iterator().next().getDisplayName() }), true);
            }
            return n;
        }
        throw Class7780.field31854.create();
    }
    
    static {
        field31853 = new SimpleCommandExceptionType((Message)new Class2259("commands.recipe.give.failed", new Object[0]));
        field31854 = new SimpleCommandExceptionType((Message)new Class2259("commands.recipe.take.failed", new Object[0]));
    }
}
