// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Locale;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Function;
import com.mojang.brigadier.suggestion.SuggestionProvider;

public class Class5415 implements Class5414
{
    private static final SuggestionProvider<Class7492> field22581;
    public static final Function<String, Class6595> field22582;
    private final Class8965 field22583;
    private final Class1932 field22584;
    
    private static Class8965 method16532(final CommandContext<Class7492> commandContext) {
        return ((Class7492)commandContext.getSource()).method23255().method1580();
    }
    
    private Class5415(final Class8965 field22583, final Class1932 field22584) {
        this.field22583 = field22583;
        this.field22584 = field22584;
    }
    
    @Override
    public void method16525(final Class51 class51) {
        this.field22583.method31806(this.field22584, class51);
    }
    
    @Override
    public Class51 method16526() {
        return this.field22583.method31805(this.field22584);
    }
    
    @Override
    public Class2250 method16527() {
        return new Class2259("commands.data.storage.modified", new Object[] { this.field22584 });
    }
    
    @Override
    public Class2250 method16528(final Class41 class41) {
        return new Class2259("commands.data.storage.query", new Object[] { this.field22584, class41.method268() });
    }
    
    @Override
    public Class2250 method16529(final Class8570 class8570, final double d, final int i) {
        return new Class2259("commands.data.storage.get", new Object[] { class8570, this.field22584, String.format(Locale.ROOT, "%.2f", d), i });
    }
    
    static {
        field22581 = ((commandContext, suggestionsBuilder) -> Class7491.method23222(method16532((CommandContext<Class7492>)commandContext).method31807(), suggestionsBuilder));
        field22582 = (s -> new Class6596(s));
    }
}
