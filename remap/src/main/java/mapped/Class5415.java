// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Function;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import net.minecraft.nbt.INBT;
import net.minecraft.util.text.ITextComponent;

public class Class5415 implements Class5414
{
    private static final SuggestionProvider<Class7492> field22581;
    public static final Function<String, Class6595> field22582;
    private final Class8965 field22583;
    private final ResourceLocation field22584;
    
    private static Class8965 method16532(final CommandContext<Class7492> commandContext) {
        return commandContext.getSource().method23255().method1580();
    }
    
    private Class5415(final Class8965 field22583, final ResourceLocation field22584) {
        this.field22583 = field22583;
        this.field22584 = field22584;
    }
    
    @Override
    public void method16525(final CompoundNBT class51) {
        this.field22583.method31806(this.field22584, class51);
    }
    
    @Override
    public CompoundNBT method16526() {
        return this.field22583.method31805(this.field22584);
    }
    
    @Override
    public ITextComponent method16527() {
        return new Class2259("commands.data.storage.modified", this.field22584);
    }
    
    @Override
    public ITextComponent method16528(final INBT class41) {
        return new Class2259("commands.data.storage.query", this.field22584, class41.toFormattedComponent());
    }
    
    @Override
    public ITextComponent method16529(final NBTPath class8570, final double d, final int i) {
        return new Class2259("commands.data.storage.get", class8570, this.field22584, String.format(Locale.ROOT, "%.2f", d), i);
    }
    
    static {
        field22581 = ((commandContext, suggestionsBuilder) -> Class7491.method23222(method16532(commandContext).method31807(), suggestionsBuilder));
        field22582 = (s -> new Class6596(s));
    }
}
