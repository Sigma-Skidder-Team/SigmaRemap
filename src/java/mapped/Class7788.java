// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Collection;
import com.mojang.brigadier.context.CommandContext;
import javax.annotation.Nullable;
import com.mojang.brigadier.ParseResults;
import java.util.function.Predicate;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.ArgumentBuilder;
import java.util.Iterator;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.HashMap;
import java.util.Map;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.google.common.collect.Maps;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.CommandDispatcher;
import org.apache.logging.log4j.Logger;

public class Class7788
{
    private static final Logger field31874;
    private final CommandDispatcher<Class7492> field31875;
    
    public Class7788(final boolean b) {
        Class8721.method29951(this.field31875 = (CommandDispatcher<Class7492>)new CommandDispatcher());
        Class8865.method31048(this.field31875);
        Class8522.method28536(this.field31875);
        Class9158.method33427(this.field31875);
        Class8942.method31711(this.field31875);
        Class5773.method17173(this.field31875);
        Class7489.method23174(this.field31875);
        Class8001.method26175(this.field31875);
        Class9584.method35935(this.field31875);
        Class9350.method34660(this.field31875);
        Class7981.method26020(this.field31875);
        Class7123.method21862(this.field31875);
        Class6848.method20944(this.field31875);
        Class8781.method30548(this.field31875);
        Class8232.method27272(this.field31875);
        Class8914.method31409(this.field31875);
        Class8641.method29385(this.field31875);
        Class9519.method35534(this.field31875);
        Class9233.method34045(this.field31875);
        Class9200.method33670(this.field31875);
        Class7631.method23983(this.field31875);
        Class9555.method35745(this.field31875);
        Class9338.method34607(this.field31875);
        Class9587.method35950(this.field31875);
        Class8125.method26750(this.field31875);
        Class7798.method25156(this.field31875);
        Class6365.method19010(this.field31875);
        Class9545.method35628(this.field31875);
        Class9165.method33452(this.field31875);
        Class8931.method31493(this.field31875);
        Class8801.method30706(this.field31875);
        Class7780.method24971(this.field31875);
        Class9302.method34395(this.field31875);
        Class7565.method23749(this.field31875);
        Class9514.method35487(this.field31875);
        Class6884.method21098(this.field31875);
        Class8030.method26334(this.field31875);
        Class8595.method29101(this.field31875);
        Class8701.method29849(this.field31875);
        Class8667.method29672(this.field31875);
        Class8348.method27827(this.field31875);
        Class7589.method23873(this.field31875);
        Class8403.method28024(this.field31875);
        Class8524.method28581(this.field31875);
        Class8464.method28249(this.field31875);
        Class6544.method19785(this.field31875);
        Class6517.method19665(this.field31875);
        Class9051.method32546(this.field31875);
        Class7880.method25532(this.field31875);
        Class7633.method23988(this.field31875);
        Class9232.method34033(this.field31875);
        Class9250.method34095(this.field31875);
        Class9391.method34913(this.field31875);
        Class8412.method28085(this.field31875);
        if (Class9528.field41021) {
            Class7321.method22439(this.field31875);
        }
        if (b) {
            Class6519.method19677(this.field31875);
            Class8689.method29779(this.field31875);
            Class9537.method35605(this.field31875);
            Class9177.method33532(this.field31875);
            Class8168.method27005(this.field31875);
            Class8811.method30739(this.field31875);
            Class8920.method31446(this.field31875);
            Class8080.method26498(this.field31875);
            Class9452.method35129(this.field31875);
            Class8872.method31180(this.field31875);
            Class8607.method29186(this.field31875);
            Class9156.method33414(this.field31875);
            Class9053.method32560(this.field31875);
        }
        this.field31875.findAmbiguities((commandNode, commandNode2, commandNode3, collection) -> Class7788.field31874.warn("Ambiguity between arguments {} and {} with inputs: {}", (Object)this.field31875.getPath(commandNode2), (Object)this.field31875.getPath(commandNode3), (Object)collection));
        this.field31875.setConsumer((commandContext, b, n) -> ((Class7492)commandContext.getSource()).method23260((CommandContext<Class7492>)commandContext, b, n));
    }
    
    public int method24998(final Class7492 class7492, final String str) {
        final StringReader stringReader = new StringReader(str);
        if (stringReader.canRead() && stringReader.peek() == '/') {
            stringReader.skip();
        }
        class7492.method23255().method1590().method15297(str);
        try {
            return this.field31875.execute(stringReader, (Object)class7492);
        }
        catch (final Class2379 class7493) {
            class7492.method23259(class7493.method9506());
            return 0;
        }
        catch (final CommandSyntaxException ex) {
            class7492.method23259(Class9479.method35300(ex.getRawMessage()));
            if (ex.getInput() != null && ex.getCursor() >= 0) {
                final int min = Math.min(ex.getInput().length(), ex.getCursor());
                final Class2250 method8467 = new Class2260("").method8469(Class2116.field12316).method8467(class7496 -> class7496.method30419(new Class9485(Class2075.field11974, s2)));
                if (min > 10) {
                    method8467.method8457("...");
                }
                method8467.method8457(ex.getInput().substring(Math.max(0, min - 10), min));
                if (min < ex.getInput().length()) {
                    method8467.method8458(new Class2260(ex.getInput().substring(min)).method8468(Class2116.field12321, Class2116.field12328));
                }
                method8467.method8458(new Class2259("command.context.here", new Object[0]).method8468(Class2116.field12321, Class2116.field12329));
                class7492.method23259(method8467);
            }
            return 0;
            final Exception ex2;
            Class7788.field31874.error("Command exception: {}", (Object)str, (Object)ex2);
            final StackTraceElement[] stackTrace = ex2.getStackTrace();
            int n = 0;
            while (true) {
                iftrue(Label_0499:)(n >= Math.min(stackTrace.length, 3));
                Block_15: {
                    break Block_15;
                    Label_0499: {
                        class7492.method23259(new Class2259("command.failed", new Object[0]).method8467(class7498 -> class7498.method30420(new Class9390(Class1961.field10697, class7497))));
                    }
                    iftrue(Label_0585:)(!Class9528.field41021);
                    class7492.method23259(new Class2260(Class8349.method27860(ex2)));
                    Class7788.field31874.error("'" + str + "' threw an exception", (Throwable)ex2);
                    return 0;
                }
                final Class2250 class7494;
                class7494.method8457("\n\n").method8457(stackTrace[n].getMethodName()).method8457("\n ").method8457(stackTrace[n].getFileName()).method8457(":").method8457(String.valueOf(stackTrace[n].getLineNumber()));
                ++n;
                continue;
            }
            Label_0585: {
                return 0;
            }
            String s = ex2.getMessage();
            Label_0371: {
                break Label_0371;
                s = ex2.getClass().getName();
            }
            new Class2260(s);
            final Class2250 class7495;
            final Class2250 class7494 = class7495;
            iftrue(Label_0499:)(!Class7788.field31874.isDebugEnabled());
        }
        catch (final Exception ex3) {}
        finally {
            class7492.method23255().method1590().method15299();
        }
    }
    
    public void method24999(final Class513 class513) {
        final HashMap hashMap = Maps.newHashMap();
        final RootCommandNode rootCommandNode = new RootCommandNode();
        hashMap.put(this.field31875.getRoot(), rootCommandNode);
        this.method25000((CommandNode<Class7492>)this.field31875.getRoot(), (CommandNode<Class7491>)rootCommandNode, class513.method1924(), hashMap);
        class513.field3039.method17469(new Class4369((RootCommandNode<Class7491>)rootCommandNode));
    }
    
    private void method25000(final CommandNode<Class7492> commandNode, final CommandNode<Class7491> commandNode2, final Class7492 class7492, final Map<CommandNode<Class7492>, CommandNode<Class7491>> map) {
        for (final CommandNode commandNode3 : commandNode.getChildren()) {
            if (!commandNode3.canUse((Object)class7492)) {
                continue;
            }
            final ArgumentBuilder builder = commandNode3.createBuilder();
            builder.requires(p0 -> true);
            if (builder.getCommand() != null) {
                builder.executes(commandContext -> 0);
            }
            if (builder instanceof RequiredArgumentBuilder) {
                final RequiredArgumentBuilder requiredArgumentBuilder = (RequiredArgumentBuilder)builder;
                if (requiredArgumentBuilder.getSuggestionsProvider() != null) {
                    requiredArgumentBuilder.suggests((SuggestionProvider)Class8533.method28627((SuggestionProvider<Class7491>)requiredArgumentBuilder.getSuggestionsProvider()));
                }
            }
            if (builder.getRedirect() != null) {
                builder.redirect((CommandNode)map.get(builder.getRedirect()));
            }
            final CommandNode build = builder.build();
            map.put((CommandNode<Class7492>)commandNode3, (CommandNode<Class7491>)build);
            commandNode2.addChild(build);
            if (commandNode3.getChildren().isEmpty()) {
                continue;
            }
            this.method25000((CommandNode<Class7492>)commandNode3, (CommandNode<Class7491>)build, class7492, map);
        }
    }
    
    public static LiteralArgumentBuilder<Class7492> method25001(final String s) {
        return (LiteralArgumentBuilder<Class7492>)LiteralArgumentBuilder.literal(s);
    }
    
    public static <T> RequiredArgumentBuilder<Class7492, T> method25002(final String s, final ArgumentType<T> argumentType) {
        return (RequiredArgumentBuilder<Class7492, T>)RequiredArgumentBuilder.argument(s, (ArgumentType)argumentType);
    }
    
    public static Predicate<String> method25003(final Class9351 class9351) {
        return s -> {
            try {
                class9352.method34666(new StringReader(s));
                return true;
            }
            catch (final CommandSyntaxException ex) {
                return false;
            }
        };
    }
    
    public CommandDispatcher<Class7492> method25004() {
        return this.field31875;
    }
    
    @Nullable
    public static <S> CommandSyntaxException method25005(final ParseResults<S> parseResults) {
        if (!parseResults.getReader().canRead()) {
            return null;
        }
        if (parseResults.getExceptions().size() != 1) {
            return parseResults.getContext().getRange().isEmpty() ? CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(parseResults.getReader()) : CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext(parseResults.getReader());
        }
        return parseResults.getExceptions().values().iterator().next();
    }
    
    static {
        field31874 = LogManager.getLogger();
    }
}
