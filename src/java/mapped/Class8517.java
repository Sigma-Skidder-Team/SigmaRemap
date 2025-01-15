// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;

public class Class8517 implements SuggestionProvider<Class7491>
{
    private static String[] field34931;
    private final SuggestionProvider<Class7491> field34932;
    private final Class1932 field34933;
    
    public Class8517(final Class1932 field34933, final SuggestionProvider<Class7491> field34934) {
        this.field34932 = field34934;
        this.field34933 = field34933;
    }
    
    public CompletableFuture<Suggestions> getSuggestions(final CommandContext<Class7491> commandContext, final SuggestionsBuilder suggestionsBuilder) throws CommandSyntaxException {
        return this.field34932.getSuggestions((CommandContext)commandContext, suggestionsBuilder);
    }
}
