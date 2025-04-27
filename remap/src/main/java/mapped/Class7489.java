// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.world.dimension.DimensionType;

public class Class7489
{
    private static final DynamicCommandExceptionType field28917;
    private static final DynamicCommandExceptionType field28918;
    private static final DynamicCommandExceptionType field28919;
    private static final SuggestionProvider<Class7492> field28920;
    private static final SuggestionProvider<Class7492> field28921;
    
    public static void method23174(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class7788.method25001("datapack").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25001("enable").then(Class7788.method25002("name", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.string()).suggests(Class7489.field28921).executes(commandContext -> method23175((Class7492)commandContext.getSource(), method23180((CommandContext<Class7492>)commandContext, "name", true), (list, class1921) -> class1921.method7624().method8128(list, class1921, class1922 -> class1922, false))).then(Class7788.method25001("after").then(Class7788.method25002("existing", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.string()).suggests(Class7489.field28920).executes(commandContext -> method23175((Class7492)commandContext.getSource(), method23180((CommandContext<Class7492>)commandContext, "name", true), (list, class1921) -> list.add(list.indexOf(method23180((CommandContext<Class7492>)commandContext, "existing", false)) + 1, class1921))))).then(Class7788.method25001("before").then(Class7788.method25002("existing", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.string()).suggests(Class7489.field28920).executes(commandContext -> method23175((Class7492)commandContext.getSource(), method23180((CommandContext<Class7492>)commandContext, "name", true), (list, class1921) -> list.add(list.indexOf(method23180((CommandContext<Class7492>)commandContext, "existing", false)), class1921))))).then(Class7788.method25001("last").executes(commandContext -> method23175(commandContext.getSource(), method23180(commandContext, "name", true), List::add))).then(Class7788.method25001("first").executes(commandContext -> method23175(commandContext.getSource(), method23180(commandContext, "name", true), (list, class1921) -> list.add(0, class1921)))))).then(Class7788.method25001("disable").then(Class7788.method25002("name", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.string()).suggests(Class7489.field28920).executes(commandContext -> method23176((Class7492)commandContext.getSource(), method23180((CommandContext<Class7492>)commandContext, "name", false))))).then(((LiteralArgumentBuilder)Class7788.method25001("list").executes(commandContext -> method23177(commandContext.getSource()))).then(Class7788.method25001("available").executes(commandContext -> method23178(commandContext.getSource()))).then(Class7788.method25001("enabled").executes(commandContext -> method23179(commandContext.getSource())))));
    }
    
    private static int method23175(final Class7492 class7492, final Class1921 class7493, final Class8860 class7494) throws CommandSyntaxException {
        final Class1920<Class1921> method1572 = class7492.method23255().method1572();
        final ArrayList arrayList = Lists.newArrayList((Iterable)method1572.method7611());
        class7494.method31023(arrayList, class7493);
        method1572.method7608(arrayList);
        final WorldInfo method1573 = class7492.method23255().method1481(DimensionType.field2223).method6764();
        method1573.method29609().clear();
        method1572.method7611().forEach(class7496 -> class7495.method29609().add(class7496.method7621()));
        method1573.method29608().remove(class7493.method7621());
        class7492.method23257(new Class2259("commands.datapack.enable.success", class7493.method7618(true)), true);
        class7492.method23255().method1568();
        return method1572.method7611().size();
    }
    
    private static int method23176(final Class7492 class7492, final Class1921 class7493) {
        final Class1920<Class1921> method1572 = class7492.method23255().method1572();
        final ArrayList arrayList = Lists.newArrayList((Iterable)method1572.method7611());
        arrayList.remove(class7493);
        method1572.method7608(arrayList);
        final WorldInfo method1573 = class7492.method23255().method1481(DimensionType.field2223).method6764();
        method1573.method29609().clear();
        method1572.method7611().forEach(class7495 -> class7494.method29609().add(class7495.method7621()));
        method1573.method29608().add(class7493.method7621());
        class7492.method23257(new Class2259("commands.datapack.disable.success", class7493.method7618(true)), true);
        class7492.method23255().method1568();
        return method1572.method7611().size();
    }
    
    private static int method23177(final Class7492 class7492) {
        return method23179(class7492) + method23178(class7492);
    }
    
    private static int method23178(final Class7492 class7492) {
        final Class1920<Class1921> method1572 = class7492.method23255().method1572();
        if (!method1572.method7610().isEmpty()) {
            class7492.method23257(new Class2259("commands.datapack.list.available.success", method1572.method7610().size(), Class9479.method35298(method1572.method7610(), class7493 -> class7493.method7618(false))), false);
        }
        else {
            class7492.method23257(new Class2259("commands.datapack.list.available.none"), false);
        }
        return method1572.method7610().size();
    }
    
    private static int method23179(final Class7492 class7492) {
        final Class1920<Class1921> method1572 = class7492.method23255().method1572();
        if (!method1572.method7611().isEmpty()) {
            class7492.method23257(new Class2259("commands.datapack.list.enabled.success", method1572.method7611().size(), Class9479.method35298(method1572.method7611(), class7493 -> class7493.method7618(true))), false);
        }
        else {
            class7492.method23257(new Class2259("commands.datapack.list.enabled.none"), false);
        }
        return method1572.method7611().size();
    }
    
    private static Class1921 method23180(final CommandContext<Class7492> commandContext, final String s, final boolean b) throws CommandSyntaxException {
        final String string = StringArgumentType.getString(commandContext, s);
        final Class1920<Class1921> method1572 = commandContext.getSource().method23255().method1572();
        final Class1921 method1573 = method1572.method7612(string);
        if (method1573 == null) {
            throw Class7489.field28917.create(string);
        }
        final boolean contains = method1572.method7611().contains(method1573);
        if (b && contains) {
            throw Class7489.field28918.create(string);
        }
        if (!b && !contains) {
            throw Class7489.field28919.create(string);
        }
        return method1573;
    }
    
    static {
        field28917 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.datapack.unknown", o);
            return;
        });
        field28918 = new DynamicCommandExceptionType(o3 -> {
            new Class2259("commands.datapack.enable.failed", o3);
            return;
        });
        field28919 = new DynamicCommandExceptionType(o5 -> {
            new Class2259("commands.datapack.disable.failed", o5);
            return;
        });
        field28920 = ((commandContext, suggestionsBuilder) -> Class7491.method23227(commandContext.getSource().method23255().method1572().method7611().stream().map((Function<? super Class1921, ?>)Class1921::method7621).map((Function<? super Object, ? extends String>)StringArgumentType::escapeIfRequired), suggestionsBuilder));
        field28921 = ((commandContext, suggestionsBuilder) -> Class7491.method23227(commandContext.getSource().method23255().method1572().method7610().stream().map((Function<? super Class1921, ?>)Class1921::method7621).map((Function<? super Object, ? extends String>)StringArgumentType::escapeIfRequired), suggestionsBuilder));
    }
}
