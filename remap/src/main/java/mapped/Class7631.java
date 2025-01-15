// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.tree.CommandNode;

import java.util.Iterator;
import java.util.Map;
import com.mojang.brigadier.ParseResults;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class7631
{
    private static final SimpleCommandExceptionType field30223;
    
    public static void method23983(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("help").executes(commandContext -> {
            final Map smartUsage = commandDispatcher.getSmartUsage((CommandNode)commandDispatcher.getRoot(), commandContext.getSource());
            final Iterator iterator = smartUsage.values().iterator();
            while (iterator.hasNext()) {
                ((Class7492)commandContext.getSource()).method23257(new StringTextComponent("/" + (String)iterator.next()), false);
            }
            return smartUsage.size();
        })).then(Class7788.method25002("command", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.greedyString()).executes(commandContext -> {
            final ParseResults parse = commandDispatcher.parse(StringArgumentType.getString(commandContext, "command"), commandContext.getSource());
            if (!parse.getContext().getNodes().isEmpty()) {
                final Map smartUsage = commandDispatcher.getSmartUsage(((ParsedCommandNode)Iterables.getLast((Iterable)parse.getContext().getNodes())).getNode(), commandContext.getSource());
                final Iterator iterator = smartUsage.values().iterator();
                while (iterator.hasNext()) {
                    ((Class7492)commandContext.getSource()).method23257(new StringTextComponent("/" + parse.getReader().getString() + " " + (String)iterator.next()), false);
                }
                return smartUsage.size();
            }
            throw Class7631.field30223.create();
        })));
    }
    
    static {
        field30223 = new SimpleCommandExceptionType((Message)new Class2259("commands.help.failed", new Object[0]));
    }
}
