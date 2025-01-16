// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;

import java.util.Optional;
import com.mojang.brigadier.ImmutableStringReader;
import java.util.Iterator;
import java.util.Locale;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import java.util.Map;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.function.Function;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class7572
{
    public static final SimpleCommandExceptionType field30024;
    public static final DynamicCommandExceptionType field30025;
    public static final Dynamic2CommandExceptionType field30026;
    public static final Dynamic2CommandExceptionType field30027;
    public static final Dynamic3CommandExceptionType field30028;
    public static final Dynamic2CommandExceptionType field30029;
    public static final SimpleCommandExceptionType field30030;
    private static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> field30031;
    private final StringReader field30032;
    private final boolean field30033;
    private final Map<IProperty<?>, Comparable<?>> field30034;
    private final Map<String, String> field30035;
    private ResourceLocation field30036;
    private StateContainer<Block, Class7096> field30037;
    private Class7096 field30038;
    private CompoundNBT field30039;
    private ResourceLocation field30040;
    private int field30041;
    private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> field30042;
    
    public Class7572(final StringReader field30032, final boolean field30033) {
        this.field30034 = Maps.newHashMap();
        this.field30035 = Maps.newHashMap();
        this.field30036 = new ResourceLocation("");
        this.field30040 = new ResourceLocation("");
        this.field30042 = Class7572.field30031;
        this.field30032 = field30032;
        this.field30033 = field30033;
    }
    
    public Map<IProperty<?>, Comparable<?>> method23798() {
        return this.field30034;
    }
    
    @Nullable
    public Class7096 method23799() {
        return this.field30038;
    }
    
    @Nullable
    public CompoundNBT method23800() {
        return this.field30039;
    }
    
    @Nullable
    public ResourceLocation method23801() {
        return this.field30040;
    }
    
    public Class7572 method23802(final boolean b) throws CommandSyntaxException {
        this.field30042 = this::method23816;
        if (this.field30032.canRead() && this.field30032.peek() == '#') {
            this.method23818();
            this.field30042 = this::method23813;
            if (this.field30032.canRead()) {
                if (this.field30032.peek() == '[') {
                    this.method23820();
                    this.field30042 = this::method23807;
                }
            }
        }
        else {
            this.method23817();
            this.field30042 = this::method23814;
            if (this.field30032.canRead()) {
                if (this.field30032.peek() == '[') {
                    this.method23819();
                    this.field30042 = this::method23807;
                }
            }
        }
        if (b) {
            if (this.field30032.canRead()) {
                if (this.field30032.peek() == '{') {
                    this.field30042 = Class7572.field30031;
                    this.method23821();
                }
            }
        }
        return this;
    }
    
    private CompletableFuture<Suggestions> method23803(final SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf(']'));
        }
        return this.method23805(suggestionsBuilder);
    }
    
    private CompletableFuture<Suggestions> method23804(final SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf(']'));
        }
        return this.method23806(suggestionsBuilder);
    }
    
    private CompletableFuture<Suggestions> method23805(final SuggestionsBuilder suggestionsBuilder) {
        final String lowerCase = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        for (final IProperty class7111 : this.field30038.method21770()) {
            if (this.field30034.containsKey(class7111)) {
                continue;
            }
            if (!class7111.getName().startsWith(lowerCase)) {
                continue;
            }
            suggestionsBuilder.suggest(class7111.getName() + '=');
        }
        return suggestionsBuilder.buildFuture();
    }
    
    private CompletableFuture<Suggestions> method23806(final SuggestionsBuilder suggestionsBuilder) {
        final String lowerCase = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
        if (this.field30040 != null) {
            if (!this.field30040.method7797().isEmpty()) {
                final Class7909<Block> method18460 = Class7188.method22057().method18460(this.field30040);
                if (method18460 != null) {
                    final Iterator<Block> iterator = method18460.method25616().iterator();
                    while (iterator.hasNext()) {
                        for (final IProperty class7111 : iterator.next().getStateContainer().method32905()) {
                            if (this.field30035.containsKey(class7111.getName())) {
                                continue;
                            }
                            if (!class7111.getName().startsWith(lowerCase)) {
                                continue;
                            }
                            suggestionsBuilder.suggest(class7111.getName() + '=');
                        }
                    }
                }
            }
        }
        return suggestionsBuilder.buildFuture();
    }
    
    private CompletableFuture<Suggestions> method23807(final SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            if (this.method23808()) {
                suggestionsBuilder.suggest(String.valueOf('{'));
            }
        }
        return suggestionsBuilder.buildFuture();
    }
    
    private boolean method23808() {
        if (this.field30038 == null) {
            if (this.field30040 != null) {
                final Class7909<Block> method18460 = Class7188.method22057().method18460(this.field30040);
                if (method18460 != null) {
                    final Iterator<Block> iterator = method18460.method25616().iterator();
                    while (iterator.hasNext()) {
                        if (!iterator.next().method11802()) {
                            continue;
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return this.field30038.method21696().method11802();
    }
    
    private CompletableFuture<Suggestions> method23809(final SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf('='));
        }
        return suggestionsBuilder.buildFuture();
    }
    
    private CompletableFuture<Suggestions> method23810(final SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            suggestionsBuilder.suggest(String.valueOf(']'));
        }
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            if (this.field30034.size() < this.field30038.method21770().size()) {
                suggestionsBuilder.suggest(String.valueOf(','));
            }
        }
        return suggestionsBuilder.buildFuture();
    }
    
    private static <T extends Comparable<T>> SuggestionsBuilder method23811(final SuggestionsBuilder suggestionsBuilder, final IProperty<T> class7111) {
        for (final Comparable<T> comparable : class7111.getAllowedValues()) {
            if (!(comparable instanceof Integer)) {
                suggestionsBuilder.suggest(class7111.getName((T)comparable));
            }
            else {
                suggestionsBuilder.suggest((int)comparable);
            }
        }
        return suggestionsBuilder;
    }
    
    private CompletableFuture<Suggestions> method23812(final SuggestionsBuilder suggestionsBuilder, final String s) {
        int n = 0;
        if (this.field30040 != null) {
            if (!this.field30040.method7797().isEmpty()) {
                final Class7909<Block> method18460 = Class7188.method22057().method18460(this.field30040);
                if (method18460 != null) {
                    for (final Block class3833 : method18460.method25616()) {
                        final IProperty<?> method18461 = class3833.getStateContainer().getProperty(s);
                        if (method18461 != null) {
                            method23811(suggestionsBuilder, method18461);
                        }
                        if (n != 0) {
                            continue;
                        }
                        final Iterator<IProperty<?>> iterator2 = class3833.getStateContainer().method32905().iterator();
                        while (iterator2.hasNext()) {
                            if (this.field30035.containsKey(iterator2.next().getName())) {
                                continue;
                            }
                            n = 1;
                            break;
                        }
                    }
                }
            }
        }
        if (n != 0) {
            suggestionsBuilder.suggest(String.valueOf(','));
        }
        suggestionsBuilder.suggest(String.valueOf(']'));
        return suggestionsBuilder.buildFuture();
    }
    
    private CompletableFuture<Suggestions> method23813(final SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            final Class7909<Block> method18460 = Class7188.method22057().method18460(this.field30040);
            if (method18460 != null) {
                boolean b = false;
                boolean b2 = false;
                for (final Block class3833 : method18460.method25616()) {
                    b |= !class3833.getStateContainer().method32905().isEmpty();
                    b2 |= class3833.method11802();
                    if (b && b2) {
                        break;
                    }
                }
                if (b) {
                    suggestionsBuilder.suggest(String.valueOf('['));
                }
                if (b2) {
                    suggestionsBuilder.suggest(String.valueOf('{'));
                }
            }
        }
        return this.method23815(suggestionsBuilder);
    }
    
    private CompletableFuture<Suggestions> method23814(final SuggestionsBuilder suggestionsBuilder) {
        if (suggestionsBuilder.getRemaining().isEmpty()) {
            if (!this.field30038.method21696().method11876().method32905().isEmpty()) {
                suggestionsBuilder.suggest(String.valueOf('['));
            }
            if (this.field30038.method21696().method11802()) {
                suggestionsBuilder.suggest(String.valueOf('{'));
            }
        }
        return suggestionsBuilder.buildFuture();
    }
    
    private CompletableFuture<Suggestions> method23815(final SuggestionsBuilder suggestionsBuilder) {
        return Class7491.method23220(Class7188.method22057().method18462(), suggestionsBuilder.createOffset(this.field30041).add(suggestionsBuilder));
    }
    
    private CompletableFuture<Suggestions> method23816(final SuggestionsBuilder suggestionsBuilder) {
        if (this.field30033) {
            Class7491.method23219(Class7188.method22057().method18462(), suggestionsBuilder, String.valueOf('#'));
        }
        Class7491.method23220(Registry.BLOCK.method507(), suggestionsBuilder);
        return suggestionsBuilder.buildFuture();
    }
    
    public void method23817() throws CommandSyntaxException {
        this.field30032.getCursor();
        this.field30036 = ResourceLocation.method7799(this.field30032);
        final Block class3833 = Registry.BLOCK.method506(this.field30036).orElseThrow(() -> {
            this.field30032.setCursor(cursor);
            return Class7572.field30025.createWithContext((ImmutableStringReader)this.field30032, (Object)this.field30036.toString());
        });
        this.field30037 = class3833.getStateContainer();
        this.field30038 = class3833.getDefaultState();
    }
    
    public void method23818() throws CommandSyntaxException {
        if (this.field30033) {
            this.field30042 = this::method23815;
            this.field30032.expect('#');
            this.field30041 = this.field30032.getCursor();
            this.field30040 = ResourceLocation.method7799(this.field30032);
            return;
        }
        throw Class7572.field30024.create();
    }
    
    public void method23819() throws CommandSyntaxException {
        this.field30032.skip();
        this.field30042 = this::method23803;
        this.field30032.skipWhitespace();
        while (this.field30032.canRead()) {
            if (this.field30032.peek() == ']') {
                break;
            }
            this.field30032.skipWhitespace();
            final int cursor = this.field30032.getCursor();
            final String string = this.field30032.readString();
            final IProperty<?> method32906 = this.field30037.getProperty(string);
            if (method32906 == null) {
                this.field30032.setCursor(cursor);
                throw Class7572.field30026.createWithContext((ImmutableStringReader)this.field30032, (Object)this.field30036.toString(), (Object)string);
            }
            if (this.field30034.containsKey(method32906)) {
                this.field30032.setCursor(cursor);
                throw Class7572.field30027.createWithContext((ImmutableStringReader)this.field30032, (Object)this.field30036.toString(), (Object)string);
            }
            this.field30032.skipWhitespace();
            this.field30042 = this::method23809;
            if (!this.field30032.canRead() || this.field30032.peek() != '=') {
                throw Class7572.field30029.createWithContext((ImmutableStringReader)this.field30032, (Object)this.field30036.toString(), (Object)string);
            }
            this.field30032.skip();
            this.field30032.skipWhitespace();
            this.field30042 = (Function<SuggestionsBuilder, CompletableFuture<Suggestions>>)(suggestionsBuilder2 -> method23811(suggestionsBuilder2, (IProperty<Comparable>)class7111).buildFuture());
            this.method23822(method32906, this.field30032.readString(), this.field30032.getCursor());
            this.field30042 = this::method23810;
            this.field30032.skipWhitespace();
            if (!this.field30032.canRead()) {
                continue;
            }
            if (this.field30032.peek() != ',') {
                if (this.field30032.peek() == ']') {
                    break;
                }
                throw Class7572.field30030.createWithContext((ImmutableStringReader)this.field30032);
            }
            else {
                this.field30032.skip();
                this.field30042 = this::method23805;
            }
        }
        if (!this.field30032.canRead()) {
            throw Class7572.field30030.createWithContext((ImmutableStringReader)this.field30032);
        }
        this.field30032.skip();
    }
    
    public void method23820() throws CommandSyntaxException {
        this.field30032.skip();
        this.field30042 = this::method23804;
        int cursor = -1;
        this.field30032.skipWhitespace();
        while (this.field30032.canRead()) {
            if (this.field30032.peek() == ']') {
                break;
            }
            this.field30032.skipWhitespace();
            final int cursor2 = this.field30032.getCursor();
            final String string = this.field30032.readString();
            if (this.field30035.containsKey(string)) {
                this.field30032.setCursor(cursor2);
                throw Class7572.field30027.createWithContext((ImmutableStringReader)this.field30032, (Object)this.field30036.toString(), (Object)string);
            }
            this.field30032.skipWhitespace();
            if (!this.field30032.canRead() || this.field30032.peek() != '=') {
                this.field30032.setCursor(cursor2);
                throw Class7572.field30029.createWithContext((ImmutableStringReader)this.field30032, (Object)this.field30036.toString(), (Object)string);
            }
            this.field30032.skip();
            this.field30032.skipWhitespace();
            this.field30042 = (Function<SuggestionsBuilder, CompletableFuture<Suggestions>>)(suggestionsBuilder2 -> this.method23812(suggestionsBuilder2, s));
            cursor = this.field30032.getCursor();
            this.field30035.put(string, this.field30032.readString());
            this.field30032.skipWhitespace();
            if (!this.field30032.canRead()) {
                continue;
            }
            cursor = -1;
            if (this.field30032.peek() != ',') {
                if (this.field30032.peek() == ']') {
                    break;
                }
                throw Class7572.field30030.createWithContext((ImmutableStringReader)this.field30032);
            }
            else {
                this.field30032.skip();
                this.field30042 = this::method23806;
            }
        }
        if (!this.field30032.canRead()) {
            if (cursor >= 0) {
                this.field30032.setCursor(cursor);
            }
            throw Class7572.field30030.createWithContext((ImmutableStringReader)this.field30032);
        }
        this.field30032.skip();
    }
    
    public void method23821() throws CommandSyntaxException {
        this.field30039 = new Class5704(this.field30032).method16945();
    }
    
    private <T extends Comparable<T>> void method23822(final IProperty<T> class7111, final String s, final int cursor) throws CommandSyntaxException {
        final Optional method21830 = class7111.parseValue(s);
        if (!method21830.isPresent()) {
            this.field30032.setCursor(cursor);
            throw Class7572.field30028.createWithContext((ImmutableStringReader)this.field30032, (Object)this.field30036.toString(), (Object)class7111.getName(), (Object)s);
        }
        this.field30038 = (Class7096)((StateHolder<Object, Object>)this.field30038).with(class7111, method21830.get());
        this.field30034.put(class7111, (Comparable<?>)method21830.get());
    }
    
    public static String toString(final Class7096 class7096) {
        final StringBuilder sb = new StringBuilder(Registry.BLOCK.getKey(class7096.method21696()).toString());
        if (!class7096.method21770().isEmpty()) {
            sb.append('[');
            int n = 0;
            for (final Map.Entry entry : class7096.method21776().entrySet()) {
                if (n != 0) {
                    sb.append(',');
                }
                method23823(sb, (IProperty<Comparable>)entry.getKey(), (Comparable<?>)entry.getValue());
                n = 1;
            }
            sb.append(']');
        }
        return sb.toString();
    }
    
    private static <T extends Comparable<T>> void method23823(final StringBuilder sb, final IProperty<T> class7111, final Comparable<?> comparable) {
        sb.append(class7111.getName());
        sb.append('=');
        sb.append(class7111.getName((T)comparable));
    }
    
    public CompletableFuture<Suggestions> method23824(final SuggestionsBuilder suggestionsBuilder) {
        return this.field30042.apply(suggestionsBuilder.createOffset(this.field30032.getCursor()));
    }
    
    public Map<String, String> method23825() {
        return this.field30035;
    }
    
    static {
        field30024 = new SimpleCommandExceptionType((Message)new Class2259("argument.block.tag.disallowed", new Object[0]));
        field30025 = new DynamicCommandExceptionType(o -> {
            new Class2259("argument.block.id.invalid", new Object[] { o });
            return;
        });
        field30026 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("argument.block.property.unknown", new Object[] { o, o2 }));
        field30027 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("argument.block.property.duplicate", new Object[] { o2, o }));
        field30028 = new Dynamic3CommandExceptionType((o, o2, o3) -> new Class2259("argument.block.property.invalid", new Object[] { o, o3, o2 }));
        field30029 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("argument.block.property.novalue", new Object[] { o, o2 }));
        field30030 = new SimpleCommandExceptionType((Message)new Class2259("argument.block.property.unclosed", new Object[0]));
        field30031 = SuggestionsBuilder::buildFuture;
    }
}
