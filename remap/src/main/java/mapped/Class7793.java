// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.primitives.Doubles;
import java.util.Collections;
import com.mojang.brigadier.Message;
import javax.annotation.Nullable;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.ImmutableStringReader;
import java.util.function.ToDoubleFunction;
import java.util.function.Function;
import java.util.UUID;
import java.util.function.Predicate;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.function.BiFunction;
import java.util.List;
import java.util.function.BiConsumer;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class7793
{
    public static final SimpleCommandExceptionType field31891;
    public static final DynamicCommandExceptionType field31892;
    public static final SimpleCommandExceptionType field31893;
    public static final SimpleCommandExceptionType field31894;
    public static final SimpleCommandExceptionType field31895;
    public static final DynamicCommandExceptionType field31896;
    public static final BiConsumer<Vec3d, List<? extends Entity>> field31897;
    public static final BiConsumer<Vec3d, List<? extends Entity>> field31898;
    public static final BiConsumer<Vec3d, List<? extends Entity>> field31899;
    public static final BiConsumer<Vec3d, List<? extends Entity>> field31900;
    public static final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> field31901;
    private final StringReader field31902;
    private final boolean field31903;
    private int field31904;
    private boolean field31905;
    private boolean field31906;
    private Class8683 field31907;
    private Class8685 field31908;
    private Double field31909;
    private Double field31910;
    private Double field31911;
    private Double field31912;
    private Double field31913;
    private Double field31914;
    private Class9588 field31915;
    private Class9588 field31916;
    private Predicate<Entity> field31917;
    private BiConsumer<Vec3d, List<? extends Entity>> field31918;
    private boolean field31919;
    private String field31920;
    private int field31921;
    private UUID field31922;
    private BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> field31923;
    private boolean field31924;
    private boolean field31925;
    private boolean field31926;
    private boolean field31927;
    private boolean field31928;
    private boolean field31929;
    private boolean field31930;
    private boolean field31931;
    private EntityType<?> field31932;
    private boolean field31933;
    private boolean field31934;
    private boolean field31935;
    private boolean field31936;
    
    public Class7793(final StringReader stringReader) {
        this(stringReader, true);
    }
    
    public Class7793(final StringReader field31902, final boolean field31903) {
        this.field31907 = Class8683.field36492;
        this.field31908 = Class8685.field36500;
        this.field31915 = Class9588.field41797;
        this.field31916 = Class9588.field41797;
        this.field31917 = (p0 -> true);
        this.field31918 = Class7793.field31897;
        this.field31923 = Class7793.field31901;
        this.field31902 = field31902;
        this.field31903 = field31903;
    }
    
    public Class9043 method25035() {
        AxisAlignedBB method25036 = null;
        Label_0161: {
            if (this.field31912 == null) {
                if (this.field31913 == null) {
                    if (this.field31914 == null) {
                        if (this.field31907.method29743() == null) {
                            method25036 = null;
                            break Label_0161;
                        }
                        final float floatValue = this.field31907.method29743();
                        method25036 = new AxisAlignedBB(-floatValue, -floatValue, -floatValue, floatValue + 1.0f, floatValue + 1.0f, floatValue + 1.0f);
                        break Label_0161;
                    }
                }
            }
            method25036 = this.method25036((this.field31912 != null) ? ((double)this.field31912) : 0.0, (this.field31913 != null) ? ((double)this.field31913) : 0.0, (this.field31914 != null) ? ((double)this.field31914) : 0.0);
        }
        if (this.field31909 == null) {
            if (this.field31910 == null) {
                if (this.field31911 == null) {
                    final Object o = class5487 -> class5487;
                    return new Class9043(this.field31904, this.field31905, this.field31906, this.field31917, this.field31907, (Function<Vec3d, Vec3d>)o, method25036, this.field31918, this.field31919, this.field31920, this.field31922, this.field31932, this.field31936);
                }
            }
        }
        final Object o = class5488 -> {
            new Vec3d((this.field31909 != null) ? this.field31909 : class5488.field22770, (this.field31910 != null) ? this.field31910 : class5488.field22771, (this.field31911 != null) ? this.field31911 : class5488.field22772);
            return;
        };
        return new Class9043(this.field31904, this.field31905, this.field31906, this.field31917, this.field31907, (Function<Vec3d, Vec3d>)o, method25036, this.field31918, this.field31919, this.field31920, this.field31922, this.field31932, this.field31936);
    }
    
    private AxisAlignedBB method25036(final double n, final double n2, final double n3) {
        final boolean b = n < 0.0;
        final boolean b2 = n2 < 0.0;
        final boolean b3 = n3 < 0.0;
        return new AxisAlignedBB(b ? n : 0.0, b2 ? n2 : 0.0, b3 ? n3 : 0.0, (b ? 0.0 : n) + 1.0, (b2 ? 0.0 : n2) + 1.0, (b3 ? 0.0 : n3) + 1.0);
    }
    
    private void method25037() {
        if (this.field31915 != Class9588.field41797) {
            this.field31917 = this.field31917.and(this.method25038(this.field31915, class399 -> class399.rotationPitch));
        }
        if (this.field31916 != Class9588.field41797) {
            this.field31917 = this.field31917.and(this.method25038(this.field31916, class400 -> class400.rotationYaw));
        }
        if (!this.field31908.method29744()) {
            this.field31917 = this.field31917.and(class401 -> class401 instanceof Class513 && this.field31908.method29755(((Class513)class401).field3026));
        }
    }
    
    private Predicate<Entity> method25038(final Class9588 class9588, final ToDoubleFunction<Entity> toDoubleFunction) {
        return class9590 -> {
            final Object o = MathHelper.method35668((class9589.method35956() != null) ? ((float)class9589.method35956()) : 0.0f);
            final Object o2 = MathHelper.method35668((class9589.method35957() != null) ? ((float)class9589.method35957()) : 359.0f);
            MathHelper.method35669(toDoubleFunction2.applyAsDouble(class9590));
            if (n <= n2) {
                final double n3;
                return n3 >= n && n3 <= n2;
            }
            else {
                final double n3;
                return n3 >= n || n3 <= n2;
            }
        };
    }
    
    public void method25039() throws CommandSyntaxException {
        this.field31936 = true;
        this.field31923 = this::method25074;
        if (this.field31902.canRead()) {
            final int cursor = this.field31902.getCursor();
            final char read = this.field31902.read();
            if (read != 'p') {
                if (read != 'a') {
                    if (read != 'r') {
                        if (read != 's') {
                            if (read != 'e') {
                                this.field31902.setCursor(cursor);
                                throw Class7793.field31892.createWithContext((ImmutableStringReader)this.field31902, (Object)('@' + String.valueOf(read)));
                            }
                            this.field31904 = Integer.MAX_VALUE;
                            this.field31905 = true;
                            this.field31918 = Class7793.field31897;
                            this.field31917 = Entity::isAlive;
                        }
                        else {
                            this.field31904 = 1;
                            this.field31905 = true;
                            this.field31919 = true;
                        }
                    }
                    else {
                        this.field31904 = 1;
                        this.field31905 = false;
                        this.field31918 = Class7793.field31900;
                        this.method25097(EntityType.field29058);
                    }
                }
                else {
                    this.field31904 = Integer.MAX_VALUE;
                    this.field31905 = false;
                    this.field31918 = Class7793.field31897;
                    this.method25097(EntityType.field29058);
                }
            }
            else {
                this.field31904 = 1;
                this.field31905 = false;
                this.field31918 = Class7793.field31898;
                this.method25097(EntityType.field29058);
            }
            this.field31923 = this::method25075;
            if (this.field31902.canRead()) {
                if (this.field31902.peek() == '[') {
                    this.field31902.skip();
                    this.field31923 = this::method25076;
                    this.method25041();
                }
            }
            return;
        }
        throw Class7793.field31894.createWithContext((ImmutableStringReader)this.field31902);
    }
    
    public void method25040() throws CommandSyntaxException {
        if (this.field31902.canRead()) {
            this.field31923 = this::method25073;
        }
        final int cursor = this.field31902.getCursor();
        final String string = this.field31902.readString();
        Label_0106: {
            try {
                this.field31922 = UUID.fromString(string);
                this.field31905 = true;
                break Label_0106;
            }
            catch (final IllegalArgumentException ex) {
                if (string.isEmpty() || string.length() > 16) {
                    this.field31902.setCursor(cursor);
                    throw Class7793.field31891.createWithContext((ImmutableStringReader)this.field31902);
                }
            }
            this.field31905 = false;
            this.field31920 = string;
        }
        this.field31904 = 1;
    }
    
    public void method25041() throws CommandSyntaxException {
        this.field31923 = this::method25077;
        this.field31902.skipWhitespace();
        while (this.field31902.canRead()) {
            if (this.field31902.peek() == ']') {
                break;
            }
            this.field31902.skipWhitespace();
            final int cursor = this.field31902.getCursor();
            final String string = this.field31902.readString();
            final Class8421 method32366 = Class9030.method32366(this, string, cursor);
            this.field31902.skipWhitespace();
            if (!this.field31902.canRead() || this.field31902.peek() != '=') {
                this.field31902.setCursor(cursor);
                throw Class7793.field31896.createWithContext((ImmutableStringReader)this.field31902, (Object)string);
            }
            this.field31902.skip();
            this.field31902.skipWhitespace();
            this.field31923 = Class7793.field31901;
            method32366.method28111(this);
            this.field31902.skipWhitespace();
            this.field31923 = this::method25078;
            if (!this.field31902.canRead()) {
                continue;
            }
            if (this.field31902.peek() != ',') {
                if (this.field31902.peek() == ']') {
                    break;
                }
                throw Class7793.field31895.createWithContext((ImmutableStringReader)this.field31902);
            }
            else {
                this.field31902.skip();
                this.field31923 = this::method25077;
            }
        }
        if (!this.field31902.canRead()) {
            throw Class7793.field31895.createWithContext((ImmutableStringReader)this.field31902);
        }
        this.field31902.skip();
        this.field31923 = Class7793.field31901;
    }
    
    public boolean method25042() {
        this.field31902.skipWhitespace();
        if (this.field31902.canRead() && this.field31902.peek() == '!') {
            this.field31902.skip();
            this.field31902.skipWhitespace();
            return true;
        }
        return false;
    }
    
    public boolean method25043() {
        this.field31902.skipWhitespace();
        if (this.field31902.canRead() && this.field31902.peek() == '#') {
            this.field31902.skip();
            this.field31902.skipWhitespace();
            return true;
        }
        return false;
    }
    
    public StringReader method25044() {
        return this.field31902;
    }
    
    public void method25045(final Predicate<Entity> other) {
        this.field31917 = this.field31917.and(other);
    }
    
    public void method25046() {
        this.field31906 = true;
    }
    
    public Class8683 method25047() {
        return this.field31907;
    }
    
    public void method25048(final Class8683 field31907) {
        this.field31907 = field31907;
    }
    
    public Class8685 method25049() {
        return this.field31908;
    }
    
    public void method25050(final Class8685 field31908) {
        this.field31908 = field31908;
    }
    
    public Class9588 method25051() {
        return this.field31915;
    }
    
    public void method25052(final Class9588 field31915) {
        this.field31915 = field31915;
    }
    
    public Class9588 method25053() {
        return this.field31916;
    }
    
    public void method25054(final Class9588 field31916) {
        this.field31916 = field31916;
    }
    
    @Nullable
    public Double method25055() {
        return this.field31909;
    }
    
    @Nullable
    public Double method25056() {
        return this.field31910;
    }
    
    @Nullable
    public Double method25057() {
        return this.field31911;
    }
    
    public void method25058(final double d) {
        this.field31909 = d;
    }
    
    public void method25059(final double d) {
        this.field31910 = d;
    }
    
    public void method25060(final double d) {
        this.field31911 = d;
    }
    
    public void method25061(final double d) {
        this.field31912 = d;
    }
    
    public void method25062(final double d) {
        this.field31913 = d;
    }
    
    public void method25063(final double d) {
        this.field31914 = d;
    }
    
    @Nullable
    public Double method25064() {
        return this.field31912;
    }
    
    @Nullable
    public Double method25065() {
        return this.field31913;
    }
    
    @Nullable
    public Double method25066() {
        return this.field31914;
    }
    
    public void method25067(final int field31904) {
        this.field31904 = field31904;
    }
    
    public void method25068(final boolean field31905) {
        this.field31905 = field31905;
    }
    
    public void method25069(final BiConsumer<Vec3d, List<? extends Entity>> field31918) {
        this.field31918 = field31918;
    }
    
    public Class9043 method25070() throws CommandSyntaxException {
        this.field31921 = this.field31902.getCursor();
        this.field31923 = this::method25072;
        if (this.field31902.canRead() && this.field31902.peek() == '@') {
            if (!this.field31903) {
                throw Class7793.field31893.createWithContext((ImmutableStringReader)this.field31902);
            }
            this.field31902.skip();
            this.method25039();
        }
        else {
            this.method25040();
        }
        this.method25037();
        return this.method25035();
    }
    
    private static void method25071(final SuggestionsBuilder suggestionsBuilder) {
        suggestionsBuilder.suggest("@p", (Message)new Class2259("argument.entity.selector.nearestPlayer", new Object[0]));
        suggestionsBuilder.suggest("@a", (Message)new Class2259("argument.entity.selector.allPlayers", new Object[0]));
        suggestionsBuilder.suggest("@r", (Message)new Class2259("argument.entity.selector.randomPlayer", new Object[0]));
        suggestionsBuilder.suggest("@s", (Message)new Class2259("argument.entity.selector.self", new Object[0]));
        suggestionsBuilder.suggest("@e", (Message)new Class2259("argument.entity.selector.allEntities", new Object[0]));
    }
    
    private CompletableFuture<Suggestions> method25072(final SuggestionsBuilder suggestionsBuilder, final Consumer<SuggestionsBuilder> consumer) {
        consumer.accept(suggestionsBuilder);
        if (this.field31903) {
            method25071(suggestionsBuilder);
        }
        return suggestionsBuilder.buildFuture();
    }
    
    private CompletableFuture<Suggestions> method25073(final SuggestionsBuilder suggestionsBuilder, final Consumer<SuggestionsBuilder> consumer) {
        final SuggestionsBuilder offset = suggestionsBuilder.createOffset(this.field31921);
        consumer.accept(offset);
        return suggestionsBuilder.add(offset).buildFuture();
    }
    
    private CompletableFuture<Suggestions> method25074(final SuggestionsBuilder suggestionsBuilder, final Consumer<SuggestionsBuilder> consumer) {
        final SuggestionsBuilder offset = suggestionsBuilder.createOffset(suggestionsBuilder.getStart() - 1);
        method25071(offset);
        suggestionsBuilder.add(offset);
        return suggestionsBuilder.buildFuture();
    }
    
    private CompletableFuture<Suggestions> method25075(final SuggestionsBuilder suggestionsBuilder, final Consumer<SuggestionsBuilder> consumer) {
        suggestionsBuilder.suggest(String.valueOf('['));
        return suggestionsBuilder.buildFuture();
    }
    
    private CompletableFuture<Suggestions> method25076(final SuggestionsBuilder suggestionsBuilder, final Consumer<SuggestionsBuilder> consumer) {
        suggestionsBuilder.suggest(String.valueOf(']'));
        Class9030.method32367(this, suggestionsBuilder);
        return suggestionsBuilder.buildFuture();
    }
    
    private CompletableFuture<Suggestions> method25077(final SuggestionsBuilder suggestionsBuilder, final Consumer<SuggestionsBuilder> consumer) {
        Class9030.method32367(this, suggestionsBuilder);
        return suggestionsBuilder.buildFuture();
    }
    
    private CompletableFuture<Suggestions> method25078(final SuggestionsBuilder suggestionsBuilder, final Consumer<SuggestionsBuilder> consumer) {
        suggestionsBuilder.suggest(String.valueOf(','));
        suggestionsBuilder.suggest(String.valueOf(']'));
        return suggestionsBuilder.buildFuture();
    }
    
    public boolean method25079() {
        return this.field31919;
    }
    
    public void method25080(final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> field31923) {
        this.field31923 = field31923;
    }
    
    public CompletableFuture<Suggestions> method25081(final SuggestionsBuilder suggestionsBuilder, final Consumer<SuggestionsBuilder> consumer) {
        return this.field31923.apply(suggestionsBuilder.createOffset(this.field31902.getCursor()), consumer);
    }
    
    public boolean method25082() {
        return this.field31924;
    }
    
    public void method25083(final boolean field31924) {
        this.field31924 = field31924;
    }
    
    public boolean method25084() {
        return this.field31925;
    }
    
    public void method25085(final boolean field31925) {
        this.field31925 = field31925;
    }
    
    public boolean method25086() {
        return this.field31926;
    }
    
    public void method25087(final boolean field31926) {
        this.field31926 = field31926;
    }
    
    public boolean method25088() {
        return this.field31927;
    }
    
    public void method25089(final boolean field31927) {
        this.field31927 = field31927;
    }
    
    public boolean method25090() {
        return this.field31928;
    }
    
    public void method25091(final boolean field31928) {
        this.field31928 = field31928;
    }
    
    public boolean method25092() {
        return this.field31929;
    }
    
    public void method25093(final boolean field31929) {
        this.field31929 = field31929;
    }
    
    public boolean method25094() {
        return this.field31930;
    }
    
    public void method25095(final boolean field31930) {
        this.field31930 = field31930;
    }
    
    public void method25096(final boolean field31931) {
        this.field31931 = field31931;
    }
    
    public void method25097(final EntityType<?> field31932) {
        this.field31932 = field31932;
    }
    
    public void method25098() {
        this.field31933 = true;
    }
    
    public boolean method25099() {
        return this.field31932 != null;
    }
    
    public boolean method25100() {
        return this.field31933;
    }
    
    public boolean method25101() {
        return this.field31934;
    }
    
    public void method25102(final boolean field31934) {
        this.field31934 = field31934;
    }
    
    public boolean method25103() {
        return this.field31935;
    }
    
    public void method25104(final boolean field31935) {
        this.field31935 = field31935;
    }
    
    static {
        field31891 = new SimpleCommandExceptionType((Message)new Class2259("argument.entity.invalid", new Object[0]));
        field31892 = new DynamicCommandExceptionType(o -> {
            new Class2259("argument.entity.selector.unknown", new Object[] { o });
            return;
        });
        field31893 = new SimpleCommandExceptionType((Message)new Class2259("argument.entity.selector.not_allowed", new Object[0]));
        field31894 = new SimpleCommandExceptionType((Message)new Class2259("argument.entity.selector.missing", new Object[0]));
        field31895 = new SimpleCommandExceptionType((Message)new Class2259("argument.entity.options.unterminated", new Object[0]));
        field31896 = new DynamicCommandExceptionType(o3 -> {
            new Class2259("argument.entity.options.valueless", new Object[] { o3 });
            return;
        });
        field31897 = ((p0, p1) -> {});
        field31898 = ((p0, list) -> list.sort((class2262, class2263) -> Doubles.compare(class2262.method1735(class2261), class2263.method1735(class2261))));
        field31899 = ((p0, list2) -> list2.sort((class2265, class2266) -> Doubles.compare(class2266.method1735(class2264), class2265.method1735(class2264))));
        field31900 = ((p0, list3) -> Collections.shuffle(list3));
        field31901 = ((suggestionsBuilder, p1) -> suggestionsBuilder.buildFuture());
    }
}
