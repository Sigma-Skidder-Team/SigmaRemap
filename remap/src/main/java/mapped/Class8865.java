// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.OptionalInt;
import java.util.Collections;
import java.util.function.BiPredicate;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.IntFunction;
import java.util.Collection;
import java.util.Iterator;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.ResultConsumer;
import java.util.function.BinaryOperator;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import net.minecraft.entity.Entity;

public class Class8865
{
    private static final Dynamic2CommandExceptionType field37261;
    private static final SimpleCommandExceptionType field37262;
    private static final DynamicCommandExceptionType field37263;
    private static final BinaryOperator<ResultConsumer<Class7492>> field37264;
    private static final SuggestionProvider<Class7492> field37265;
    
    public static void method31048(final CommandDispatcher<Class7492> commandDispatcher) {
        final LiteralCommandNode register = commandDispatcher.register((LiteralArgumentBuilder)Class7788.method25001("execute").requires(class7492 -> class7492.method23210(2)));
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("execute").requires(class7493 -> class7493.method23210(2))).then(Class7788.method25001("run").redirect((CommandNode)commandDispatcher.getRoot()))).then((ArgumentBuilder)method31053((CommandNode<Class7492>)register, Class7788.method25001("if"), true))).then((ArgumentBuilder)method31053((CommandNode<Class7492>)register, Class7788.method25001("unless"), false))).then(Class7788.method25001("as").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).fork((CommandNode)register, commandContext -> {
            final ArrayList arrayList = Lists.newArrayList();
            final Iterator<? extends Entity> iterator = Class6886.method21147((CommandContext<Class7492>)commandContext, "targets").iterator();
            while (iterator.hasNext()) {
                arrayList.add(((Class7492)commandContext.getSource()).method23235((Entity)iterator.next()));
            }
            return arrayList;
        })))).then(Class7788.method25001("at").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).fork((CommandNode)register, commandContext -> {
            final ArrayList arrayList = Lists.newArrayList();
            for (final Entity class399 : Class6886.method21147((CommandContext<Class7492>)commandContext, "targets")) {
                arrayList.add(((Class7492)commandContext.getSource()).method23244((Class1849)class399.field2391).method23236(class399.method1895()).method23237(class399.method1792()));
            }
            return arrayList;
        })))).then(((LiteralArgumentBuilder)Class7788.method25001("store").then((ArgumentBuilder)method31049((LiteralCommandNode<Class7492>)register, Class7788.method25001("result"), true))).then((ArgumentBuilder)method31049((LiteralCommandNode<Class7492>)register, Class7788.method25001("success"), false)))).then(((LiteralArgumentBuilder)Class7788.method25001("positioned").then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7555.method23719()).redirect((CommandNode)register, commandContext -> ((Class7492)commandContext.getSource()).method23236(Class7555.method23721((CommandContext<Class7492>)commandContext, "pos")).method23243(Class2042.field11636)))).then(Class7788.method25001("as").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).fork((CommandNode)register, commandContext -> {
            final ArrayList arrayList = Lists.newArrayList();
            final Iterator<? extends Entity> iterator = Class6886.method21147((CommandContext<Class7492>)commandContext, "targets").iterator();
            while (iterator.hasNext()) {
                arrayList.add(((Class7492)commandContext.getSource()).method23236(((Entity)iterator.next()).method1895()));
            }
            return arrayList;
        }))))).then(((LiteralArgumentBuilder)Class7788.method25001("rotated").then(Class7788.method25002("rot", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8919.method31444()).redirect((CommandNode)register, commandContext -> ((Class7492)commandContext.getSource()).method23237(Class8919.method31445((CommandContext<Class7492>)commandContext, "rot").method16505((Class7492)commandContext.getSource()))))).then(Class7788.method25001("as").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).fork((CommandNode)register, commandContext -> {
            final ArrayList arrayList = Lists.newArrayList();
            final Iterator<? extends Entity> iterator = Class6886.method21147((CommandContext<Class7492>)commandContext, "targets").iterator();
            while (iterator.hasNext()) {
                arrayList.add(((Class7492)commandContext.getSource()).method23237(((Entity)iterator.next()).method1792()));
            }
            return arrayList;
        }))))).then(((LiteralArgumentBuilder)Class7788.method25001("facing").then(Class7788.method25001("entity").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).then(Class7788.method25002("anchor", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8316.method27606()).fork((CommandNode)register, commandContext -> {
            final ArrayList arrayList = Lists.newArrayList();
            final Class2042 method27605 = Class8316.method27605((CommandContext<Class7492>)commandContext, "anchor");
            final Iterator<? extends Entity> iterator = Class6886.method21147((CommandContext<Class7492>)commandContext, "targets").iterator();
            while (iterator.hasNext()) {
                arrayList.add(((Class7492)commandContext.getSource()).method23245((Entity)iterator.next(), method27605));
            }
            return arrayList;
        }))))).then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7555.method23719()).redirect((CommandNode)register, commandContext -> ((Class7492)commandContext.getSource()).method23246(Class7555.method23721((CommandContext<Class7492>)commandContext, "pos")))))).then(Class7788.method25001("align").then(Class7788.method25002("axes", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8148.method26843()).redirect((CommandNode)register, commandContext -> ((Class7492)commandContext.getSource()).method23236(((Class7492)commandContext.getSource()).method23249().method16758(Class8148.method26844((CommandContext<Class7492>)commandContext, "axes"))))))).then(Class7788.method25001("anchored").then(Class7788.method25002("anchor", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8316.method27606()).redirect((CommandNode)register, commandContext -> ((Class7492)commandContext.getSource()).method23243(Class8316.method27605((CommandContext<Class7492>)commandContext, "anchor")))))).then(Class7788.method25001("in").then(Class7788.method25002("dimension", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9437.method35067()).redirect((CommandNode)register, commandContext -> ((Class7492)commandContext.getSource()).method23244(((Class7492)commandContext.getSource()).method23255().method1481(Class9437.method35068((CommandContext<Class7492>)commandContext, "dimension")))))));
    }
    
    private static ArgumentBuilder<Class7492, ?> method31049(final LiteralCommandNode<Class7492> literalCommandNode, final LiteralArgumentBuilder<Class7492> literalArgumentBuilder, final boolean b) {
        literalArgumentBuilder.then(Class7788.method25001("score").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22954()).suggests((SuggestionProvider)Class7456.field28758).then(Class7788.method25002("objective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).redirect((CommandNode)literalCommandNode, commandContext -> method31050((Class7492)commandContext.getSource(), Class7456.method22951((CommandContext<Class7492>)commandContext, "targets"), Class8717.method29934((CommandContext<Class7492>)commandContext, "objective"), b)))));
        literalArgumentBuilder.then(Class7788.method25001("bossbar").then(((RequiredArgumentBuilder)Class7788.method25002("id", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests((SuggestionProvider)Class8522.field35786).then(Class7788.method25001("value").redirect((CommandNode)literalCommandNode, commandContext -> method31051((Class7492)commandContext.getSource(), Class8522.method28551((CommandContext<Class7492>)commandContext), true, b)))).then(Class7788.method25001("max").redirect((CommandNode)literalCommandNode, commandContext -> method31051((Class7492)commandContext.getSource(), Class8522.method28551((CommandContext<Class7492>)commandContext), false, b)))));
        final Iterator<Class6595> iterator = Class5773.field23619.iterator();
        while (iterator.hasNext()) {
            iterator.next().method20042((ArgumentBuilder<Class7492, ?>)literalArgumentBuilder, argumentBuilder2 -> argumentBuilder2.then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("path", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8258.method27403()).then(Class7788.method25001("int").then(Class7788.method25002("scale", (com.mojang.brigadier.arguments.ArgumentType<Object>)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode2, commandContext -> method31052((Class7492)commandContext.getSource(), class6595.method20041((CommandContext<Class7492>)commandContext), Class8258.method27404((CommandContext<Class7492>)commandContext, "path"), n2 -> Class45.method279((int)(n2 * DoubleArgumentType.getDouble(commandContext2, "scale"))), b2))))).then(Class7788.method25001("float").then(Class7788.method25002("scale", (com.mojang.brigadier.arguments.ArgumentType<Object>)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode2, commandContext -> method31052((Class7492)commandContext.getSource(), class6595.method20041((CommandContext<Class7492>)commandContext), Class8258.method27404((CommandContext<Class7492>)commandContext, "path"), n2 -> Class46.method281((float)(n2 * DoubleArgumentType.getDouble(commandContext2, "scale"))), b2))))).then(Class7788.method25001("short").then(Class7788.method25002("scale", (com.mojang.brigadier.arguments.ArgumentType<Object>)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode2, commandContext -> method31052((Class7492)commandContext.getSource(), class6595.method20041((CommandContext<Class7492>)commandContext), Class8258.method27404((CommandContext<Class7492>)commandContext, "path"), n2 -> Class48.method286((short)(n2 * DoubleArgumentType.getDouble(commandContext2, "scale"))), b2))))).then(Class7788.method25001("long").then(Class7788.method25002("scale", (com.mojang.brigadier.arguments.ArgumentType<Object>)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode2, commandContext -> method31052((Class7492)commandContext.getSource(), class6595.method20041((CommandContext<Class7492>)commandContext), Class8258.method27404((CommandContext<Class7492>)commandContext, "path"), n2 -> Class49.method288((long)(n2 * DoubleArgumentType.getDouble(commandContext2, "scale"))), b2))))).then(Class7788.method25001("double").then(Class7788.method25002("scale", (com.mojang.brigadier.arguments.ArgumentType<Object>)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode2, commandContext -> method31052((Class7492)commandContext.getSource(), class6595.method20041((CommandContext<Class7492>)commandContext), Class8258.method27404((CommandContext<Class7492>)commandContext, "path"), n2 -> Class44.method277(n2 * DoubleArgumentType.getDouble(commandContext2, "scale")), b2))))).then(Class7788.method25001("byte").then(Class7788.method25002("scale", (com.mojang.brigadier.arguments.ArgumentType<Object>)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode2, commandContext -> method31052((Class7492)commandContext.getSource(), class6595.method20041((CommandContext<Class7492>)commandContext), Class8258.method27404((CommandContext<Class7492>)commandContext, "path"), n2 -> Class47.method283((byte)(n2 * DoubleArgumentType.getDouble(commandContext2, "scale"))), b2))))));
        }
        return (ArgumentBuilder<Class7492, ?>)literalArgumentBuilder;
    }
    
    private static Class7492 method31050(final Class7492 class7492, final Collection<String> collection, final Class9290 class7493, final boolean b) {
        return class7492.method23239((ResultConsumer<Class7492>)((commandContext, b2, n) -> {
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                class6516.method19636((String)iterator.next(), class7493).method23971(b ? n : (b2 ? 1 : 0));
            }
        }), Class8865.field37264);
    }
    
    private static Class7492 method31051(final Class7492 class7492, final Class6878 class7493, final boolean b, final boolean b2) {
        return class7492.method23239((ResultConsumer<Class7492>)((commandContext, b3, n) -> {
            final int n2 = b2 ? n : (b3 ? 1 : 0);
            if (!b) {
                class7493.method21056(n2);
            }
            else {
                class7493.method21055(n2);
            }
        }), Class8865.field37264);
    }
    
    private static Class7492 method31052(final Class7492 class7492, final Class5414 class7493, final Class8570 class7494, final IntFunction<Class41> intFunction, final boolean b) {
        return class7492.method23239((ResultConsumer<Class7492>)((commandContext, b2, n) -> {
            try {
                final Class51 method16526 = class7493.method16526();
                class7494.method28809(method16526, () -> {
                    final Object o = b3 ? n3 : (b4 ? 1 : 0);
                    return (Class41)intFunction2.apply(n2);
                });
                class7493.method16525(method16526);
            }
            catch (final CommandSyntaxException ex) {}
        }), Class8865.field37264);
    }
    
    private static ArgumentBuilder<Class7492, ?> method31053(final CommandNode<Class7492> commandNode, final LiteralArgumentBuilder<Class7492> literalArgumentBuilder, final boolean b) {
        ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder.then(Class7788.method25001("block").then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then((ArgumentBuilder)method31060(commandNode, (ArgumentBuilder<Class7492, ?>)Class7788.method25002("block", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8808.method30732()), b, commandContext -> Class8808.method30733((CommandContext<Class7492>)commandContext, "block").test(new Class7990(((Class7492)commandContext.getSource()).method23250(), Class8330.method27768((CommandContext<Class7492>)commandContext, "pos"), true))))))).then(Class7788.method25001("score").then(Class7788.method25002("target", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests((SuggestionProvider)Class7456.field28758).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("targetObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).then(Class7788.method25001("=").then(Class7788.method25002("source", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests((SuggestionProvider)Class7456.field28758).then((ArgumentBuilder)method31060(commandNode, (ArgumentBuilder<Class7492, ?>)Class7788.method25002("sourceObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()), b, commandContext3 -> method31056((CommandContext<Class7492>)commandContext3, Integer::equals)))))).then(Class7788.method25001("<").then(Class7788.method25002("source", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests((SuggestionProvider)Class7456.field28758).then((ArgumentBuilder)method31060(commandNode, (ArgumentBuilder<Class7492, ?>)Class7788.method25002("sourceObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()), b, commandContext5 -> method31056((CommandContext<Class7492>)commandContext5, (n, n2) -> n < n2)))))).then(Class7788.method25001("<=").then(Class7788.method25002("source", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests((SuggestionProvider)Class7456.field28758).then((ArgumentBuilder)method31060(commandNode, (ArgumentBuilder<Class7492, ?>)Class7788.method25002("sourceObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()), b, commandContext7 -> method31056((CommandContext<Class7492>)commandContext7, (n3, n4) -> n3 <= n4)))))).then(Class7788.method25001(">").then(Class7788.method25002("source", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests((SuggestionProvider)Class7456.field28758).then((ArgumentBuilder)method31060(commandNode, (ArgumentBuilder<Class7492, ?>)Class7788.method25002("sourceObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()), b, commandContext9 -> method31056((CommandContext<Class7492>)commandContext9, (n5, n6) -> n5 > n6)))))).then(Class7788.method25001(">=").then(Class7788.method25002("source", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests((SuggestionProvider)Class7456.field28758).then((ArgumentBuilder)method31060(commandNode, (ArgumentBuilder<Class7492, ?>)Class7788.method25002("sourceObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()), b, commandContext11 -> method31056((CommandContext<Class7492>)commandContext11, (n7, n8) -> n7 >= n8)))))).then(Class7788.method25001("matches").then((ArgumentBuilder)method31060(commandNode, (ArgumentBuilder<Class7492, ?>)Class7788.method25002("range", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6807.method20838()), b, commandContext13 -> method31057((CommandContext<Class7492>)commandContext13, Class6808.method20839((CommandContext<Class7492>)commandContext13, "range"))))))))).then(Class7788.method25001("blocks").then(Class7788.method25002("start", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then(Class7788.method25002("end", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then(((RequiredArgumentBuilder)Class7788.method25002("destination", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then((ArgumentBuilder)method31061(commandNode, (ArgumentBuilder<Class7492, ?>)Class7788.method25001("all"), b, false))).then((ArgumentBuilder)method31061(commandNode, (ArgumentBuilder<Class7492, ?>)Class7788.method25001("masked"), b, true))))))).then(Class7788.method25001("entity").then(((RequiredArgumentBuilder)Class7788.method25002("entities", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).fork((CommandNode)commandNode, commandContext -> method31059((CommandContext<Class7492>)commandContext, b, !Class6886.method21147((CommandContext<Class7492>)commandContext, "entities").isEmpty()))).executes((Command)method31054(b, commandContext15 -> Class6886.method21147((CommandContext<Class7492>)commandContext15, "entities").size()))))).then(Class7788.method25001("predicate").then((ArgumentBuilder)method31060(commandNode, (ArgumentBuilder<Class7492, ?>)Class7788.method25002("predicate", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests((SuggestionProvider)Class8865.field37265), b, commandContext17 -> method31058((Class7492)commandContext17.getSource(), Class7000.method21432((CommandContext<Class7492>)commandContext17, "predicate")))));
        final Iterator<Class6595> iterator = Class5773.field23620.iterator();
        while (iterator.hasNext()) {
            literalArgumentBuilder.then((ArgumentBuilder)iterator.next().method20042((ArgumentBuilder<Class7492, ?>)Class7788.method25001("data"), argumentBuilder2 -> argumentBuilder2.then(((RequiredArgumentBuilder)Class7788.method25002("path", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8258.method27403()).fork(commandNode2, commandContext -> method31059((CommandContext<Class7492>)commandContext, b2, method31055(class6595.method20041((CommandContext<Class7492>)commandContext), Class8258.method27404((CommandContext<Class7492>)commandContext, "path")) > 0))).executes((Command)method31054(b2, commandContext -> method31055(class6595.method20041((CommandContext<Class7492>)commandContext), Class8258.method27404((CommandContext<Class7492>)commandContext, "path")))))));
        }
        return (ArgumentBuilder<Class7492, ?>)literalArgumentBuilder;
    }
    
    private static Command<Class7492> method31054(final boolean b, final Class9571 class9571) {
        return (Command<Class7492>)(b ? (commandContext -> {
            final int method35853 = class9571.method35853((CommandContext<Class7492>)commandContext);
            if (method35853 <= 0) {
                throw Class8865.field37262.create();
            }
            ((Class7492)commandContext.getSource()).method23257(new Class2259("commands.execute.conditional.pass_count", new Object[] { method35853 }), false);
            return method35853;
        }) : (commandContext -> {
            final int method35853 = class9571.method35853((CommandContext<Class7492>)commandContext);
            if (method35853 != 0) {
                throw Class8865.field37263.create((Object)method35853);
            }
            ((Class7492)commandContext.getSource()).method23257(new Class2259("commands.execute.conditional.pass", new Object[0]), false);
            return 1;
        }));
    }
    
    private static int method31055(final Class5414 class5414, final Class8570 class5415) throws CommandSyntaxException {
        return class5415.method28805(class5414.method16526());
    }
    
    private static boolean method31056(final CommandContext<Class7492> commandContext, final BiPredicate<Integer, Integer> biPredicate) throws CommandSyntaxException {
        final String method22949 = Class7456.method22949(commandContext, "target");
        final Class9290 method22950 = Class8717.method29934(commandContext, "targetObjective");
        final String method22951 = Class7456.method22949(commandContext, "source");
        final Class9290 method22952 = Class8717.method29934(commandContext, "sourceObjective");
        final Class6515 method22953 = ((Class7492)commandContext.getSource()).method23255().method1579();
        return method22953.method19635(method22949, method22950) && method22953.method19635(method22951, method22952) && biPredicate.test(method22953.method19636(method22949, method22950).method23969(), method22953.method19636(method22951, method22952).method23969());
    }
    
    private static boolean method31057(final CommandContext<Class7492> commandContext, final Class8685 class8685) throws CommandSyntaxException {
        final String method22949 = Class7456.method22949(commandContext, "target");
        final Class9290 method22950 = Class8717.method29934(commandContext, "targetObjective");
        final Class6515 method22951 = ((Class7492)commandContext.getSource()).method23255().method1579();
        return method22951.method19635(method22949, method22950) && class8685.method29755(method22951.method19636(method22949, method22950).method23969());
    }
    
    private static boolean method31058(final Class7492 class7492, final Class122 class7493) {
        return class7493.test(new Class9098(class7492.method23250()).method32877(Class6683.field26367, new BlockPos(class7492.method23249())).method32878(Class6683.field26362, class7492.method23251()).method32883(Class7104.field27712));
    }
    
    private static Collection<Class7492> method31059(final CommandContext<Class7492> commandContext, final boolean b, final boolean b2) {
        return (Collection<Class7492>)((b2 != b) ? Collections.emptyList() : Collections.singleton(commandContext.getSource()));
    }
    
    private static ArgumentBuilder<Class7492, ?> method31060(final CommandNode<Class7492> commandNode, final ArgumentBuilder<Class7492, ?> argumentBuilder, final boolean b, final Class9042 class9042) {
        return (ArgumentBuilder<Class7492, ?>)argumentBuilder.fork((CommandNode)commandNode, commandContext -> method31059((CommandContext<Class7492>)commandContext, b, class9042.method32504((CommandContext<Class7492>)commandContext))).executes(commandContext -> {
            if (b != class9042.method32504((CommandContext<Class7492>)commandContext)) {
                throw Class8865.field37262.create();
            }
            ((Class7492)commandContext.getSource()).method23257(new Class2259("commands.execute.conditional.pass", new Object[0]), false);
            return 1;
        });
    }
    
    private static ArgumentBuilder<Class7492, ?> method31061(final CommandNode<Class7492> commandNode, final ArgumentBuilder<Class7492, ?> argumentBuilder, final boolean b, final boolean b2) {
        return (ArgumentBuilder<Class7492, ?>)argumentBuilder.fork((CommandNode)commandNode, commandContext -> method31059((CommandContext<Class7492>)commandContext, b, method31064((CommandContext<Class7492>)commandContext, b2).isPresent())).executes(b ? (commandContext -> method31062((CommandContext<Class7492>)commandContext, b2)) : (commandContext -> method31063((CommandContext<Class7492>)commandContext, b2)));
    }
    
    private static int method31062(final CommandContext<Class7492> commandContext, final boolean b) throws CommandSyntaxException {
        final OptionalInt method31064 = method31064(commandContext, b);
        if (!method31064.isPresent()) {
            throw Class8865.field37262.create();
        }
        ((Class7492)commandContext.getSource()).method23257(new Class2259("commands.execute.conditional.pass_count", new Object[] { method31064.getAsInt() }), false);
        return method31064.getAsInt();
    }
    
    private static int method31063(final CommandContext<Class7492> commandContext, final boolean b) throws CommandSyntaxException {
        final OptionalInt method31064 = method31064(commandContext, b);
        if (!method31064.isPresent()) {
            ((Class7492)commandContext.getSource()).method23257(new Class2259("commands.execute.conditional.pass", new Object[0]), false);
            return 1;
        }
        throw Class8865.field37263.create((Object)method31064.getAsInt());
    }
    
    private static OptionalInt method31064(final CommandContext<Class7492> commandContext, final boolean b) throws CommandSyntaxException {
        return method31065(((Class7492)commandContext.getSource()).method23250(), Class8330.method27768(commandContext, "start"), Class8330.method27768(commandContext, "end"), Class8330.method27768(commandContext, "destination"), b);
    }
    
    private static OptionalInt method31065(final Class1849 class1849, final BlockPos class1850, final BlockPos class1851, final BlockPos class1852, final boolean b) throws CommandSyntaxException {
        final Class6997 class1853 = new Class6997(class1850, class1851);
        final Class6997 class1854 = new Class6997(class1852, class1852.method1135(class1853.method21416()));
        final BlockPos class1855 = new BlockPos(class1854.field27293 - class1853.field27293, class1854.field27294 - class1853.field27294, class1854.field27295 - class1853.field27295);
        final int i = class1853.method21417() * class1853.method21418() * class1853.method21419();
        if (i <= 32768) {
            int value = 0;
            for (int j = class1853.field27295; j <= class1853.field27298; ++j) {
                for (int k = class1853.field27294; k <= class1853.field27297; ++k) {
                    for (int l = class1853.field27293; l <= class1853.field27296; ++l) {
                        final BlockPos class1856 = new BlockPos(l, k, j);
                        final BlockPos method1135 = class1856.method1135(class1855);
                        final Class7096 method1136 = class1849.method6701(class1856);
                        if (!b || method1136.method21696() != Class7521.field29147) {
                            if (method1136 != class1849.method6701(method1135)) {
                                return OptionalInt.empty();
                            }
                            final Class436 method1137 = class1849.method6727(class1856);
                            final Class436 method1138 = class1849.method6727(method1135);
                            if (method1137 != null) {
                                if (method1138 == null) {
                                    return OptionalInt.empty();
                                }
                                final Class51 method1139 = method1137.method2180(new Class51());
                                method1139.method330("x");
                                method1139.method330("y");
                                method1139.method330("z");
                                final Class51 method1140 = method1138.method2180(new Class51());
                                method1140.method330("x");
                                method1140.method330("y");
                                method1140.method330("z");
                                if (!method1139.equals(method1140)) {
                                    return OptionalInt.empty();
                                }
                            }
                            ++value;
                        }
                    }
                }
            }
            return OptionalInt.of(value);
        }
        throw Class8865.field37261.create((Object)32768, (Object)i);
    }
    
    static {
        field37261 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("commands.execute.blocks.toobig", new Object[] { o, o2 }));
        field37262 = new SimpleCommandExceptionType((Message)new Class2259("commands.execute.conditional.fail", new Object[0]));
        field37263 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.execute.conditional.fail_count", new Object[] { o });
            return;
        });
        field37264 = (BinaryOperator)((resultConsumer, resultConsumer3) -> (commandContext, b, n) -> {
            resultConsumer.onCommandComplete(commandContext, b, n);
            resultConsumer3.onCommandComplete(commandContext, b, n);
        });
        field37265 = ((commandContext, suggestionsBuilder) -> Class7491.method23220(((Class7492)commandContext.getSource()).method23255().method1582().method6410(), suggestionsBuilder));
    }
}
