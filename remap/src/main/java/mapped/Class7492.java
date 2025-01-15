// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.stream.Stream;
import com.google.common.collect.Lists;
import java.util.Collection;
import com.mojang.brigadier.context.CommandContext;
import java.util.Iterator;
import javax.annotation.Nullable;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.BinaryOperator;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class7492 implements Class7491
{
    public static final SimpleCommandExceptionType field28926;
    public static final SimpleCommandExceptionType field28927;
    private final Class397 field28928;
    private final Class5487 field28929;
    private final Class1849 field28930;
    private final int field28931;
    private final String field28932;
    private final Class2250 field28933;
    private final Class394 field28934;
    private final boolean field28935;
    private final Class399 field28936;
    private final ResultConsumer<Class7492> field28937;
    private final Class2042 field28938;
    private final Class9544 field28939;
    
    public Class7492(final Class397 class397, final Class5487 class398, final Class9544 class399, final Class1849 class400, final int n, final String s, final Class2250 class401, final Class394 class402, final Class399 class403) {
        this(class397, class398, class399, class400, n, s, class401, class402, class403, false, (ResultConsumer<Class7492>)((commandContext, b, n) -> {}), Class2042.field11636);
    }
    
    public Class7492(final Class397 field28928, final Class5487 field28929, final Class9544 field28930, final Class1849 field28931, final int field28932, final String field28933, final Class2250 field28934, final Class394 field28935, final Class399 field28936, final boolean field28937, final ResultConsumer<Class7492> field28938, final Class2042 field28939) {
        this.field28928 = field28928;
        this.field28929 = field28929;
        this.field28930 = field28931;
        this.field28935 = field28937;
        this.field28936 = field28936;
        this.field28931 = field28932;
        this.field28932 = field28933;
        this.field28933 = field28934;
        this.field28934 = field28935;
        this.field28937 = field28938;
        this.field28938 = field28939;
        this.field28939 = field28930;
    }
    
    public Class7492 method23235(final Class399 class399) {
        return (this.field28936 != class399) ? new Class7492(this.field28928, this.field28929, this.field28939, this.field28930, this.field28931, class399.method1841().getString(), class399.method1871(), this.field28934, class399, this.field28935, this.field28937, this.field28938) : this;
    }
    
    public Class7492 method23236(final Class5487 class5487) {
        return this.field28929.equals(class5487) ? this : new Class7492(this.field28928, class5487, this.field28939, this.field28930, this.field28931, this.field28932, this.field28933, this.field28934, this.field28936, this.field28935, this.field28937, this.field28938);
    }
    
    public Class7492 method23237(final Class9544 class9544) {
        return this.field28939.equals(class9544) ? this : new Class7492(this.field28928, this.field28929, class9544, this.field28930, this.field28931, this.field28932, this.field28933, this.field28934, this.field28936, this.field28935, this.field28937, this.field28938);
    }
    
    public Class7492 method23238(final ResultConsumer<Class7492> obj) {
        return this.field28937.equals(obj) ? this : new Class7492(this.field28928, this.field28929, this.field28939, this.field28930, this.field28931, this.field28932, this.field28933, this.field28934, this.field28936, this.field28935, obj, this.field28938);
    }
    
    public Class7492 method23239(final ResultConsumer<Class7492> resultConsumer, final BinaryOperator<ResultConsumer<Class7492>> binaryOperator) {
        return this.method23238((ResultConsumer<Class7492>)binaryOperator.apply(this.field28937, resultConsumer));
    }
    
    public Class7492 method23240() {
        return this.field28935 ? this : new Class7492(this.field28928, this.field28929, this.field28939, this.field28930, this.field28931, this.field28932, this.field28933, this.field28934, this.field28936, true, this.field28937, this.field28938);
    }
    
    public Class7492 method23241(final int n) {
        return (n != this.field28931) ? new Class7492(this.field28928, this.field28929, this.field28939, this.field28930, n, this.field28932, this.field28933, this.field28934, this.field28936, this.field28935, this.field28937, this.field28938) : this;
    }
    
    public Class7492 method23242(final int n) {
        return (n > this.field28931) ? new Class7492(this.field28928, this.field28929, this.field28939, this.field28930, n, this.field28932, this.field28933, this.field28934, this.field28936, this.field28935, this.field28937, this.field28938) : this;
    }
    
    public Class7492 method23243(final Class2042 class2042) {
        return (class2042 != this.field28938) ? new Class7492(this.field28928, this.field28929, this.field28939, this.field28930, this.field28931, this.field28932, this.field28933, this.field28934, this.field28936, this.field28935, this.field28937, class2042) : this;
    }
    
    public Class7492 method23244(final Class1849 class1849) {
        return (class1849 != this.field28930) ? new Class7492(this.field28928, this.field28929, this.field28939, class1849, this.field28931, this.field28932, this.field28933, this.field28934, this.field28936, this.field28935, this.field28937, this.field28938) : this;
    }
    
    public Class7492 method23245(final Class399 class399, final Class2042 class400) throws CommandSyntaxException {
        return this.method23246(class400.method8122(class399));
    }
    
    public Class7492 method23246(final Class5487 class5487) throws CommandSyntaxException {
        final Class5487 method8123 = this.field28938.method8123(this);
        final double n = class5487.field22770 - method8123.field22770;
        final double n2 = class5487.field22771 - method8123.field22771;
        final double n3 = class5487.field22772 - method8123.field22772;
        return this.method23237(new Class9544(Class9546.method35668((float)(-(Class9546.method35693(n2, Class9546.method35641(n * n + n3 * n3)) * 57.2957763671875))), Class9546.method35668((float)(Class9546.method35693(n3, n) * 57.2957763671875) - 90.0f)));
    }
    
    public Class2250 method23247() {
        return this.field28933;
    }
    
    public String method23248() {
        return this.field28932;
    }
    
    @Override
    public boolean method23210(final int n) {
        return this.field28931 >= n;
    }
    
    public Class5487 method23249() {
        return this.field28929;
    }
    
    public Class1849 method23250() {
        return this.field28930;
    }
    
    @Nullable
    public Class399 method23251() {
        return this.field28936;
    }
    
    public Class399 method23252() throws CommandSyntaxException {
        if (this.field28936 != null) {
            return this.field28936;
        }
        throw Class7492.field28927.create();
    }
    
    public Class513 method23253() throws CommandSyntaxException {
        if (this.field28936 instanceof Class513) {
            return (Class513)this.field28936;
        }
        throw Class7492.field28926.create();
    }
    
    public Class9544 method23254() {
        return this.field28939;
    }
    
    public Class394 method23255() {
        return this.field28934;
    }
    
    public Class2042 method23256() {
        return this.field28938;
    }
    
    public void method23257(final Class2250 class2250, final boolean b) {
        if (this.field28928.method1575()) {
            if (!this.field28935) {
                this.field28928.method1494(class2250);
            }
        }
        if (b) {
            if (this.field28928.method1623()) {
                if (!this.field28935) {
                    this.method23258(class2250);
                }
            }
        }
    }
    
    private void method23258(final Class2250 class2250) {
        final Class2250 method8468 = new Class2259("chat.type.admin", new Object[] { this.method23247(), class2250 }).method8468(Class2116.field12316, Class2116.field12329);
        if (this.field28934.method1583().method31216(Class8878.field37328)) {
            for (final Class513 class2251 : this.field28934.method1537().method20623()) {
                if (class2251 == this.field28928) {
                    continue;
                }
                if (!this.field28934.method1537().method20597(class2251.method2844())) {
                    continue;
                }
                class2251.method1494(method8468);
            }
        }
        if (this.field28928 != this.field28934) {
            if (this.field28934.method1583().method31216(Class8878.field37325)) {
                this.field28934.method1494(method8468);
            }
        }
    }
    
    public void method23259(final Class2250 class2250) {
        if (this.field28928.method1576()) {
            if (!this.field28935) {
                this.field28928.method1494(new Class2260("").method8458(class2250).method8469(Class2116.field12321));
            }
        }
    }
    
    public void method23260(final CommandContext<Class7492> commandContext, final boolean b, final int n) {
        if (this.field28937 != null) {
            this.field28937.onCommandComplete((CommandContext)commandContext, b, n);
        }
    }
    
    @Override
    public Collection<String> method23205() {
        return Lists.newArrayList((Object[])this.field28934.method1486());
    }
    
    @Override
    public Collection<String> method23207() {
        return this.field28934.method1579().method19649();
    }
    
    @Override
    public Collection<Class1932> method23208() {
        return Class90.field205.method507();
    }
    
    @Override
    public Stream<Class1932> method23209() {
        return this.field28934.method1577().method6384();
    }
    
    @Override
    public CompletableFuture<Suggestions> method23211(final CommandContext<Class7491> commandContext, final SuggestionsBuilder suggestionsBuilder) {
        return null;
    }
    
    static {
        field28926 = new SimpleCommandExceptionType((Message)new Class2259("permissions.requires.player", new Object[0]));
        field28927 = new SimpleCommandExceptionType((Message)new Class2259("permissions.requires.entity", new Object[0]));
    }
}
