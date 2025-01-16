// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.ImmutableStringReader;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import java.util.Map;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.function.Function;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class7071
{
    public static final SimpleCommandExceptionType field27534;
    public static final DynamicCommandExceptionType field27535;
    private static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> field27536;
    private final StringReader field27537;
    private final boolean field27538;
    private final Map<IProperty<?>, Comparable<?>> field27539;
    private Item field27540;
    private CompoundNBT field27541;
    private ResourceLocation field27542;
    private int field27543;
    private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> field27544;
    
    public Class7071(final StringReader field27537, final boolean field27538) {
        this.field27539 = Maps.newHashMap();
        this.field27542 = new ResourceLocation("");
        this.field27544 = Class7071.field27536;
        this.field27537 = field27537;
        this.field27538 = field27538;
    }
    
    public Item method21626() {
        return this.field27540;
    }
    
    @Nullable
    public CompoundNBT method21627() {
        return this.field27541;
    }
    
    public ResourceLocation method21628() {
        return this.field27542;
    }
    
    public void method21629() throws CommandSyntaxException {
        this.field27537.getCursor();
        this.field27540 = Registry.field211.method506(ResourceLocation.method7799(this.field27537)).orElseThrow(() -> {
            this.field27537.setCursor(cursor);
            return Class7071.field27535.createWithContext((ImmutableStringReader)this.field27537, (Object)class1932.toString());
        });
    }
    
    public void method21630() throws CommandSyntaxException {
        if (this.field27538) {
            this.field27544 = this::method21634;
            this.field27537.expect('#');
            this.field27543 = this.field27537.getCursor();
            this.field27542 = ResourceLocation.method7799(this.field27537);
            return;
        }
        throw Class7071.field27534.create();
    }
    
    public void method21631() throws CommandSyntaxException {
        this.field27541 = new Class5704(this.field27537).method16945();
    }
    
    public Class7071 method21632() throws CommandSyntaxException {
        this.field27544 = this::method21635;
        if (this.field27537.canRead() && this.field27537.peek() == '#') {
            this.method21630();
        }
        else {
            this.method21629();
            this.field27544 = this::method21633;
        }
        if (this.field27537.canRead()) {
            if (this.field27537.peek() == '{') {
                this.field27544 = Class7071.field27536;
                this.method21631();
            }
        }
        return this;
    }
    
    private CompletableFuture<Suggestions> method21633(final SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf('{'));
        }
        return suggestionsBuilder.buildFuture();
    }
    
    private CompletableFuture<Suggestions> method21634(final SuggestionsBuilder suggestionsBuilder) {
        return Class7491.method23220(Class7855.method25402().method18462(), suggestionsBuilder.createOffset(this.field27543));
    }
    
    private CompletableFuture<Suggestions> method21635(final SuggestionsBuilder suggestionsBuilder) {
        if (this.field27538) {
            Class7491.method23219(Class7855.method25402().method18462(), suggestionsBuilder, String.valueOf('#'));
        }
        return Class7491.method23220(Registry.field211.method507(), suggestionsBuilder);
    }
    
    public CompletableFuture<Suggestions> method21636(final SuggestionsBuilder suggestionsBuilder) {
        return this.field27544.apply(suggestionsBuilder.createOffset(this.field27537.getCursor()));
    }
    
    static {
        field27534 = new SimpleCommandExceptionType((Message)new Class2259("argument.item.tag.disallowed", new Object[0]));
        field27535 = new DynamicCommandExceptionType(o -> {
            new Class2259("argument.item.id.invalid", new Object[] { o });
            return;
        });
        field27536 = SuggestionsBuilder::buildFuture;
    }
}
