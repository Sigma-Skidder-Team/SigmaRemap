// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import java.util.Iterator;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.suggestion.SuggestionProvider;

public class Class8641
{
    public static final SuggestionProvider<Class7492> field36242;
    
    public static void method29385(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("function").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25002("name", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9179.method33537()).suggests((SuggestionProvider)Class8641.field36242).executes(commandContext -> method29386((Class7492)commandContext.getSource(), Class9179.method33540((CommandContext<Class7492>)commandContext, "name")))));
    }
    
    private static int method29386(final Class7492 class7492, final Collection<Class8263> collection) {
        int n = 0;
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            n += class7492.method23255().method1567().method6508((Class8263)iterator.next(), class7492.method23240().method23242(2));
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.function.success.multiple", new Object[] { n, collection.size() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.function.success.single", new Object[] { n, collection.iterator().next().method27443() }), true);
        }
        return n;
    }
    
    static {
        field36242 = ((commandContext, suggestionsBuilder) -> {
            final Class1794 method1567 = ((Class7492)commandContext.getSource()).method23255().method1567();
            Class7491.method23219(method1567.method6513().method18462(), suggestionsBuilder, "#");
            return Class7491.method23220(method1567.method6505().keySet(), suggestionsBuilder);
        });
    }
}
