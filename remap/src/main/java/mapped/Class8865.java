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
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.IntNBT;
import net.minecraft.util.math.BlockPos;

public class Class8865
{
    private static final Dynamic2CommandExceptionType field37261;
    private static final SimpleCommandExceptionType field37262;
    private static final DynamicCommandExceptionType field37263;
    private static final BinaryOperator<ResultConsumer<Class7492>> field37264;
    private static final SuggestionProvider<Class7492> field37265;
    
    public static void method31048(final CommandDispatcher<Class7492> commandDispatcher) {
        final LiteralCommandNode register = commandDispatcher.register(Class7788.method25001("execute").requires(class7492 -> class7492.method23210(2)));
        commandDispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class7788.method25001("execute").requires(class7493 -> class7493.method23210(2))).then(Class7788.method25001("run").redirect(commandDispatcher.getRoot())).then(method31053((CommandNode<Class7492>)register, Class7788.method25001("if"), true)).then(method31053((CommandNode<Class7492>)register, Class7788.method25001("unless"), false)).then(Class7788.method25001("as").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).fork(register, commandContext -> {
            final ArrayList arrayList = Lists.newArrayList();
            final Iterator<? extends Entity> iterator = Class6886.method21147(commandContext, "targets").iterator();
            while (iterator.hasNext()) {
                arrayList.add(commandContext.getSource().method23235(iterator.next()));
            }
            return arrayList;
        }))).then(Class7788.method25001("at").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).fork(register, commandContext -> {
            final ArrayList arrayList = Lists.newArrayList();
            for (final Entity class399 : Class6886.method21147(commandContext, "targets")) {
                arrayList.add(commandContext.getSource().method23244((Class1849)class399.world).method23236(class399.method1895()).method23237(class399.method1792()));
            }
            return arrayList;
        }))).then(Class7788.method25001("store").then(method31049((LiteralCommandNode<Class7492>)register, Class7788.method25001("result"), true)).then(method31049((LiteralCommandNode<Class7492>)register, Class7788.method25001("success"), false))).then(Class7788.method25001("positioned").then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7555.method23719()).redirect(register, commandContext -> commandContext.getSource().method23236(Class7555.method23721(commandContext, "pos")).method23243(Class2042.field11636))).then(Class7788.method25001("as").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).fork(register, commandContext -> {
            final ArrayList arrayList = Lists.newArrayList();
            final Iterator<? extends Entity> iterator = Class6886.method21147(commandContext, "targets").iterator();
            while (iterator.hasNext()) {
                arrayList.add(commandContext.getSource().method23236(iterator.next().method1895()));
            }
            return arrayList;
        })))).then(Class7788.method25001("rotated").then(Class7788.method25002("rot", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8919.method31444()).redirect(register, commandContext -> commandContext.getSource().method23237(Class8919.method31445(commandContext, "rot").method16505(commandContext.getSource())))).then(Class7788.method25001("as").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).fork(register, commandContext -> {
            final ArrayList arrayList = Lists.newArrayList();
            final Iterator<? extends Entity> iterator = Class6886.method21147(commandContext, "targets").iterator();
            while (iterator.hasNext()) {
                arrayList.add(commandContext.getSource().method23237(iterator.next().method1792()));
            }
            return arrayList;
        })))).then(Class7788.method25001("facing").then(Class7788.method25001("entity").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).then(Class7788.method25002("anchor", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8316.method27606()).fork(register, commandContext -> {
            final ArrayList arrayList = Lists.newArrayList();
            final Class2042 method27605 = Class8316.method27605(commandContext, "anchor");
            final Iterator<? extends Entity> iterator = Class6886.method21147(commandContext, "targets").iterator();
            while (iterator.hasNext()) {
                arrayList.add(commandContext.getSource().method23245(iterator.next(), method27605));
            }
            return arrayList;
        })))).then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7555.method23719()).redirect(register, commandContext -> commandContext.getSource().method23246(Class7555.method23721(commandContext, "pos"))))).then(Class7788.method25001("align").then(Class7788.method25002("axes", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8148.method26843()).redirect(register, commandContext -> commandContext.getSource().method23236(commandContext.getSource().method23249().align(Class8148.method26844(commandContext, "axes")))))).then(Class7788.method25001("anchored").then(Class7788.method25002("anchor", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8316.method27606()).redirect(register, commandContext -> commandContext.getSource().method23243(Class8316.method27605(commandContext, "anchor"))))).then(Class7788.method25001("in").then(Class7788.method25002("dimension", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9437.method35067()).redirect(register, commandContext -> commandContext.getSource().method23244(commandContext.getSource().method23255().method1481(Class9437.method35068(commandContext, "dimension")))))));
    }
    
    private static ArgumentBuilder<Class7492, ?> method31049(final LiteralCommandNode<Class7492> literalCommandNode, final LiteralArgumentBuilder<Class7492> literalArgumentBuilder, final boolean b) {
        literalArgumentBuilder.then(Class7788.method25001("score").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22954()).suggests(Class7456.field28758).then(Class7788.method25002("objective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).redirect(literalCommandNode, commandContext -> method31050(commandContext.getSource(), Class7456.method22951(commandContext, "targets"), Class8717.method29934(commandContext, "objective"), b)))));
        literalArgumentBuilder.then(Class7788.method25001("bossbar").then(Class7788.method25002("id", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class8522.field35786).then(Class7788.method25001("value").redirect(literalCommandNode, commandContext -> method31051(commandContext.getSource(), Class8522.method28551(commandContext), true, b))).then(Class7788.method25001("max").redirect(literalCommandNode, commandContext -> method31051(commandContext.getSource(), Class8522.method28551(commandContext), false, b)))));
        final Iterator<Class6595> iterator = Class5773.field23619.iterator();
        while (iterator.hasNext()) {
            iterator.next().method20042(literalArgumentBuilder, argumentBuilder2 -> argumentBuilder2.then(Class7788.method25002("path", (com.mojang.brigadier.arguments.ArgumentType<Object>) NBTPathArgument.method27403()).then(Class7788.method25001("int").then(Class7788.method25002("scale", (com.mojang.brigadier.arguments.ArgumentType<Object>)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode2, commandContext -> method31052((Class7492)commandContext.getSource(), class6595.method20041((CommandContext<Class7492>)commandContext), NBTPathArgument.method27404(commandContext, "path"), n2 -> IntNBT.valueOf((int)(n2 * DoubleArgumentType.getDouble(commandContext2, "scale"))), b2)))).then(Class7788.method25001("float").then(Class7788.method25002("scale", (com.mojang.brigadier.arguments.ArgumentType<Object>)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode2, commandContext -> method31052((Class7492)commandContext.getSource(), class6595.method20041((CommandContext<Class7492>)commandContext), NBTPathArgument.method27404(commandContext, "path"), n2 -> FloatNBT.method281((float)(n2 * DoubleArgumentType.getDouble(commandContext2, "scale"))), b2)))).then(Class7788.method25001("short").then(Class7788.method25002("scale", (com.mojang.brigadier.arguments.ArgumentType<Object>)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode2, commandContext -> method31052((Class7492)commandContext.getSource(), class6595.method20041((CommandContext<Class7492>)commandContext), NBTPathArgument.method27404(commandContext, "path"), n2 -> ShortNBT.method286((short)(n2 * DoubleArgumentType.getDouble(commandContext2, "scale"))), b2)))).then(Class7788.method25001("long").then(Class7788.method25002("scale", (com.mojang.brigadier.arguments.ArgumentType<Object>)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode2, commandContext -> method31052((Class7492)commandContext.getSource(), class6595.method20041((CommandContext<Class7492>)commandContext), NBTPathArgument.method27404(commandContext, "path"), n2 -> LongNBT.method288((long)(n2 * DoubleArgumentType.getDouble(commandContext2, "scale"))), b2)))).then(Class7788.method25001("double").then(Class7788.method25002("scale", (com.mojang.brigadier.arguments.ArgumentType<Object>)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode2, commandContext -> method31052((Class7492)commandContext.getSource(), class6595.method20041((CommandContext<Class7492>)commandContext), NBTPathArgument.method27404(commandContext, "path"), n2 -> DoubleNBT.method277(n2 * DoubleArgumentType.getDouble(commandContext2, "scale")), b2)))).then(Class7788.method25001("byte").then(Class7788.method25002("scale", (com.mojang.brigadier.arguments.ArgumentType<Object>)DoubleArgumentType.doubleArg()).redirect((CommandNode)literalCommandNode2, commandContext -> method31052((Class7492)commandContext.getSource(), class6595.method20041((CommandContext<Class7492>)commandContext), NBTPathArgument.method27404(commandContext, "path"), n2 -> ByteNBT.valueOf((byte)(n2 * DoubleArgumentType.getDouble(commandContext2, "scale"))), b2))))));
        }
        return literalArgumentBuilder;
    }
    
    private static Class7492 method31050(final Class7492 class7492, final Collection<String> collection, final Class9290 class7493, final boolean b) {
        return class7492.method23239((commandContext, b2, n) -> {
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                class6516.method19636((String)iterator.next(), class7493).method23971(b ? n : (b2 ? 1 : 0));
            }
        }, Class8865.field37264);
    }
    
    private static Class7492 method31051(final Class7492 class7492, final Class6878 class7493, final boolean b, final boolean b2) {
        return class7492.method23239((commandContext, b3, n) -> {
            final int n2 = b2 ? n : (b3 ? 1 : 0);
            if (!b) {
                class7493.method21056(n2);
            }
            else {
                class7493.method21055(n2);
            }
        }, Class8865.field37264);
    }
    
    private static Class7492 method31052(final Class7492 class7492, final Class5414 class7493, final NBTPath class7494, final IntFunction<INBT> intFunction, final boolean b) {
        return class7492.method23239((commandContext, b2, n) -> {
            try {
                final CompoundNBT method16526 = class7493.method16526();
                class7494.func_218076_b(method16526, () -> {
                    final Object o = b3 ? n3 : (b4 ? 1 : 0);
                    return (INBT)intFunction2.apply(n2);
                });
                class7493.method16525(method16526);
            }
            catch (final CommandSyntaxException ex) {}
        }, Class8865.field37264);
    }
    
    private static ArgumentBuilder<Class7492, ?> method31053(final CommandNode<Class7492> commandNode, final LiteralArgumentBuilder<Class7492> literalArgumentBuilder, final boolean b) {
        literalArgumentBuilder.then(Class7788.method25001("block").then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then(method31060(commandNode, Class7788.method25002("block", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8808.method30732()), b, commandContext -> Class8808.method30733(commandContext, "block").test(new Class7990(commandContext.getSource().method23250(), Class8330.method27768(commandContext, "pos"), true)))))).then(Class7788.method25001("score").then(Class7788.method25002("target", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests(Class7456.field28758).then(Class7788.method25002("targetObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()).then(Class7788.method25001("=").then(Class7788.method25002("source", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests(Class7456.field28758).then(method31060(commandNode, Class7788.method25002("sourceObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()), b, commandContext3 -> method31056(commandContext3, Integer::equals))))).then(Class7788.method25001("<").then(Class7788.method25002("source", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests(Class7456.field28758).then(method31060(commandNode, Class7788.method25002("sourceObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()), b, commandContext5 -> method31056(commandContext5, (n, n2) -> n < n2))))).then(Class7788.method25001("<=").then(Class7788.method25002("source", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests(Class7456.field28758).then(method31060(commandNode, Class7788.method25002("sourceObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()), b, commandContext7 -> method31056(commandContext7, (n3, n4) -> n3 <= n4))))).then(Class7788.method25001(">").then(Class7788.method25002("source", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests(Class7456.field28758).then(method31060(commandNode, Class7788.method25002("sourceObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()), b, commandContext9 -> method31056(commandContext9, (n5, n6) -> n5 > n6))))).then(Class7788.method25001(">=").then(Class7788.method25002("source", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7456.method22953()).suggests(Class7456.field28758).then(method31060(commandNode, Class7788.method25002("sourceObjective", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8717.method29933()), b, commandContext11 -> method31056(commandContext11, (n7, n8) -> n7 >= n8))))).then(Class7788.method25001("matches").then(method31060(commandNode, Class7788.method25002("range", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6807.method20838()), b, commandContext13 -> method31057(commandContext13, Class6808.method20839(commandContext13, "range")))))))).then(Class7788.method25001("blocks").then(Class7788.method25002("start", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then(Class7788.method25002("end", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then(Class7788.method25002("destination", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then(method31061(commandNode, Class7788.method25001("all"), b, false)).then(method31061(commandNode, Class7788.method25001("masked"), b, true)))))).then(Class7788.method25001("entity").then(Class7788.method25002("entities", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).fork(commandNode, commandContext -> method31059(commandContext, b, !Class6886.method21147(commandContext, "entities").isEmpty())).executes(method31054(b, commandContext15 -> Class6886.method21147(commandContext15, "entities").size())))).then(Class7788.method25001("predicate").then(method31060(commandNode, (ArgumentBuilder<Class7492, ?>)Class7788.method25002("predicate", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class8865.field37265), b, commandContext17 -> method31058(commandContext17.getSource(), Class7000.method21432(commandContext17, "predicate")))));
        final Iterator<Class6595> iterator = Class5773.field23620.iterator();
        while (iterator.hasNext()) {
            literalArgumentBuilder.then(iterator.next().method20042(Class7788.method25001("data"), argumentBuilder2 -> argumentBuilder2.then(((RequiredArgumentBuilder)Class7788.method25002("path", (com.mojang.brigadier.arguments.ArgumentType<Object>) NBTPathArgument.method27403()).fork(commandNode2, commandContext -> method31059((CommandContext<Class7492>)commandContext, b2, method31055(class6595.method20041((CommandContext<Class7492>)commandContext), NBTPathArgument.method27404(commandContext, "path")) > 0))).executes(method31054(b2, commandContext -> method31055(class6595.method20041((CommandContext<Class7492>)commandContext), NBTPathArgument.method27404(commandContext, "path")))))));
        }
        return literalArgumentBuilder;
    }
    
    private static Command<Class7492> method31054(final boolean b, final Class9571 class9571) {
        return (Command<Class7492>)(b ? (commandContext -> {
            final int method35853 = class9571.method35853(commandContext);
            if (method35853 <= 0) {
                throw Class8865.field37262.create();
            }
            commandContext.getSource().method23257(new Class2259("commands.execute.conditional.pass_count", method35853), false);
            return method35853;
        }) : (commandContext -> {
            final int method35853 = class9571.method35853(commandContext);
            if (method35853 != 0) {
                throw Class8865.field37263.create(method35853);
            }
            commandContext.getSource().method23257(new Class2259("commands.execute.conditional.pass"), false);
            return 1;
        }));
    }
    
    private static int method31055(final Class5414 class5414, final NBTPath class5415) throws CommandSyntaxException {
        return class5415.func_218069_b(class5414.method16526());
    }
    
    private static boolean method31056(final CommandContext<Class7492> commandContext, final BiPredicate<Integer, Integer> biPredicate) throws CommandSyntaxException {
        final String method22949 = Class7456.method22949(commandContext, "target");
        final Class9290 method22950 = Class8717.method29934(commandContext, "targetObjective");
        final String method22951 = Class7456.method22949(commandContext, "source");
        final Class9290 method22952 = Class8717.method29934(commandContext, "sourceObjective");
        final Class6515 method22953 = commandContext.getSource().method23255().method1579();
        return method22953.method19635(method22949, method22950) && method22953.method19635(method22951, method22952) && biPredicate.test(method22953.method19636(method22949, method22950).method23969(), method22953.method19636(method22951, method22952).method23969());
    }
    
    private static boolean method31057(final CommandContext<Class7492> commandContext, final Class8685 class8685) throws CommandSyntaxException {
        final String method22949 = Class7456.method22949(commandContext, "target");
        final Class9290 method22950 = Class8717.method29934(commandContext, "targetObjective");
        final Class6515 method22951 = commandContext.getSource().method23255().method1579();
        return method22951.method19635(method22949, method22950) && class8685.method29755(method22951.method19636(method22949, method22950).method23969());
    }
    
    private static boolean method31058(final Class7492 class7492, final Class122 class7493) {
        return class7493.test(new Class9098(class7492.method23250()).method32877(Class6683.field26367, new BlockPos(class7492.method23249())).method32878(Class6683.field26362, class7492.method23251()).method32883(Class7104.field27712));
    }
    
    private static Collection<Class7492> method31059(final CommandContext<Class7492> commandContext, final boolean b, final boolean b2) {
        return (b2 != b) ? Collections.emptyList() : Collections.singleton(commandContext.getSource());
    }
    
    private static ArgumentBuilder<Class7492, ?> method31060(final CommandNode<Class7492> commandNode, final ArgumentBuilder<Class7492, ?> argumentBuilder, final boolean b, final Class9042 class9042) {
        return (ArgumentBuilder<Class7492, ?>)argumentBuilder.fork(commandNode, commandContext -> method31059(commandContext, b, class9042.method32504(commandContext))).executes(commandContext -> {
            if (b != class9042.method32504((CommandContext<Class7492>)commandContext)) {
                throw Class8865.field37262.create();
            }
            ((Class7492)commandContext.getSource()).method23257(new Class2259("commands.execute.conditional.pass"), false);
            return 1;
        });
    }
    
    private static ArgumentBuilder<Class7492, ?> method31061(final CommandNode<Class7492> commandNode, final ArgumentBuilder<Class7492, ?> argumentBuilder, final boolean b, final boolean b2) {
        return (ArgumentBuilder<Class7492, ?>)argumentBuilder.fork(commandNode, commandContext -> method31059(commandContext, b, method31064(commandContext, b2).isPresent())).executes(b ? (commandContext -> method31062((CommandContext<Class7492>)commandContext, b2)) : (commandContext -> method31063((CommandContext<Class7492>)commandContext, b2)));
    }
    
    private static int method31062(final CommandContext<Class7492> commandContext, final boolean b) throws CommandSyntaxException {
        final OptionalInt method31064 = method31064(commandContext, b);
        if (!method31064.isPresent()) {
            throw Class8865.field37262.create();
        }
        commandContext.getSource().method23257(new Class2259("commands.execute.conditional.pass_count", method31064.getAsInt()), false);
        return method31064.getAsInt();
    }
    
    private static int method31063(final CommandContext<Class7492> commandContext, final boolean b) throws CommandSyntaxException {
        final OptionalInt method31064 = method31064(commandContext, b);
        if (!method31064.isPresent()) {
            commandContext.getSource().method23257(new Class2259("commands.execute.conditional.pass"), false);
            return 1;
        }
        throw Class8865.field37263.create(method31064.getAsInt());
    }
    
    private static OptionalInt method31064(final CommandContext<Class7492> commandContext, final boolean b) throws CommandSyntaxException {
        return method31065(commandContext.getSource().method23250(), Class8330.method27768(commandContext, "start"), Class8330.method27768(commandContext, "end"), Class8330.method27768(commandContext, "destination"), b);
    }
    
    private static OptionalInt method31065(final Class1849 class1849, final BlockPos class1850, final BlockPos class1851, final BlockPos class1852, final boolean b) throws CommandSyntaxException {
        final MutableBoundingBox class1853 = new MutableBoundingBox(class1850, class1851);
        final MutableBoundingBox class1854 = new MutableBoundingBox(class1852, class1852.add(class1853.getLength()));
        final BlockPos class1855 = new BlockPos(class1854.minX - class1853.minX, class1854.minY - class1853.minY, class1854.minZ - class1853.minZ);
        final int i = class1853.getXSize() * class1853.getYSize() * class1853.getZSize();
        if (i <= 32768) {
            int value = 0;
            for (int j = class1853.minZ; j <= class1853.maxZ; ++j) {
                for (int k = class1853.minY; k <= class1853.maxY; ++k) {
                    for (int l = class1853.minX; l <= class1853.maxX; ++l) {
                        final BlockPos class1856 = new BlockPos(l, k, j);
                        final BlockPos method1135 = class1856.add(class1855);
                        final BlockState method1136 = class1849.getBlockState(class1856);
                        if (!b || method1136.getBlock() != Blocks.AIR) {
                            if (method1136 != class1849.getBlockState(method1135)) {
                                return OptionalInt.empty();
                            }
                            final TileEntity method1137 = class1849.getTileEntity(class1856);
                            final TileEntity method1138 = class1849.getTileEntity(method1135);
                            if (method1137 != null) {
                                if (method1138 == null) {
                                    return OptionalInt.empty();
                                }
                                final CompoundNBT method1139 = method1137.method2180(new CompoundNBT());
                                method1139.remove("x");
                                method1139.remove("y");
                                method1139.remove("z");
                                final CompoundNBT method1140 = method1138.method2180(new CompoundNBT());
                                method1140.remove("x");
                                method1140.remove("y");
                                method1140.remove("z");
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
        throw Class8865.field37261.create(32768, i);
    }
    
    static {
        field37261 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("commands.execute.blocks.toobig", o, o2));
        field37262 = new SimpleCommandExceptionType(new Class2259("commands.execute.conditional.fail", new Object[0]));
        field37263 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.execute.conditional.fail_count", o);
            return;
        });
        field37264 = (BinaryOperator)((resultConsumer, resultConsumer3) -> (commandContext, b, n) -> {
            resultConsumer.onCommandComplete(commandContext, b, n);
            resultConsumer3.onCommandComplete(commandContext, b, n);
        });
        field37265 = ((commandContext, suggestionsBuilder) -> Class7491.method23220(commandContext.getSource().method23255().method1582().method6410(), suggestionsBuilder));
    }
}
