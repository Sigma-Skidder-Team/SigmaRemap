// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;

import java.util.Collections;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.util.text.ITextComponent;

public class Class8522
{
    private static final DynamicCommandExceptionType field35776;
    private static final DynamicCommandExceptionType field35777;
    private static final SimpleCommandExceptionType field35778;
    private static final SimpleCommandExceptionType field35779;
    private static final SimpleCommandExceptionType field35780;
    private static final SimpleCommandExceptionType field35781;
    private static final SimpleCommandExceptionType field35782;
    private static final SimpleCommandExceptionType field35783;
    private static final SimpleCommandExceptionType field35784;
    private static final SimpleCommandExceptionType field35785;
    public static final SuggestionProvider<Class7492> field35786;
    
    public static void method28536(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("bossbar").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25001("add").then(Class7788.method25002("id", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).then(Class7788.method25002("name", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9502.method35390()).executes(commandContext -> method28549((Class7492)commandContext.getSource(), Class7000.method21433((CommandContext<Class7492>)commandContext, "id"), Class9502.method35389((CommandContext<Class7492>)commandContext, "name"))))))).then(Class7788.method25001("remove").then(Class7788.method25002("id", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests((SuggestionProvider)Class8522.field35786).executes(commandContext -> method28550((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext)))))).then(Class7788.method25001("list").executes(commandContext -> method28548((Class7492)commandContext.getSource())))).then(Class7788.method25001("set").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("id", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests((SuggestionProvider)Class8522.field35786).then(Class7788.method25001("name").then(Class7788.method25002("name", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class9502.method35390()).executes(commandContext -> method28546((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class9502.method35389((CommandContext<Class7492>)commandContext, "name")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("color").then(Class7788.method25001("pink").executes(commandContext -> method28544((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class2200.field13390)))).then(Class7788.method25001("blue").executes(commandContext -> method28544((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class2200.field13391)))).then(Class7788.method25001("red").executes(commandContext -> method28544((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class2200.field13392)))).then(Class7788.method25001("green").executes(commandContext -> method28544((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class2200.field13393)))).then(Class7788.method25001("yellow").executes(commandContext -> method28544((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class2200.field13394)))).then(Class7788.method25001("purple").executes(commandContext -> method28544((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class2200.field13395)))).then(Class7788.method25001("white").executes(commandContext -> method28544((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class2200.field13396))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("style").then(Class7788.method25001("progress").executes(commandContext -> method28545((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class342.field2105)))).then(Class7788.method25001("notched_6").executes(commandContext -> method28545((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class342.field2106)))).then(Class7788.method25001("notched_10").executes(commandContext -> method28545((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class342.field2107)))).then(Class7788.method25001("notched_12").executes(commandContext -> method28545((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class342.field2108)))).then(Class7788.method25001("notched_20").executes(commandContext -> method28545((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class342.field2109))))).then(Class7788.method25001("value").then(Class7788.method25002("value", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)).executes(commandContext -> method28542((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), IntegerArgumentType.getInteger(commandContext, "value")))))).then(Class7788.method25001("max").then(Class7788.method25002("max", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(1)).executes(commandContext -> method28543((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), IntegerArgumentType.getInteger(commandContext, "max")))))).then(Class7788.method25001("visible").then(Class7788.method25002("visible", (com.mojang.brigadier.arguments.ArgumentType<Object>)BoolArgumentType.bool()).executes(commandContext -> method28541((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), BoolArgumentType.getBool(commandContext, "visible")))))).then(((LiteralArgumentBuilder)Class7788.method25001("players").executes(commandContext -> method28547((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), (Collection<Class513>)Collections.emptyList()))).then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()).executes(commandContext -> method28547((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext), Class6886.method21148((CommandContext<Class7492>)commandContext, "targets")))))))).then(Class7788.method25001("get").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("id", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests((SuggestionProvider)Class8522.field35786).then(Class7788.method25001("value").executes(commandContext -> method28537((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext))))).then(Class7788.method25001("max").executes(commandContext -> method28538((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext))))).then(Class7788.method25001("visible").executes(commandContext -> method28539((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext))))).then(Class7788.method25001("players").executes(commandContext -> method28540((Class7492)commandContext.getSource(), method28551((CommandContext<Class7492>)commandContext)))))));
    }
    
    private static int method28537(final Class7492 class7492, final Class6878 class7493) {
        class7492.method23257(new Class2259("commands.bossbar.get.value", new Object[] { class7493.method21057(), class7493.method21053() }), true);
        return class7493.method21053();
    }
    
    private static int method28538(final Class7492 class7492, final Class6878 class7493) {
        class7492.method23257(new Class2259("commands.bossbar.get.max", new Object[] { class7493.method21057(), class7493.method21054() }), true);
        return class7493.method21054();
    }
    
    private static int method28539(final Class7492 class7492, final Class6878 class7493) {
        if (!class7493.method21072()) {
            class7492.method23257(new Class2259("commands.bossbar.get.visible.hidden", new Object[] { class7493.method21057() }), true);
            return 0;
        }
        class7492.method23257(new Class2259("commands.bossbar.get.visible.visible", new Object[] { class7493.method21057() }), true);
        return 1;
    }
    
    private static int method28540(final Class7492 class7492, final Class6878 class7493) {
        if (!class7493.method21074().isEmpty()) {
            class7492.method23257(new Class2259("commands.bossbar.get.players.some", new Object[] { class7493.method21057(), class7493.method21074().size(), Class9479.method35298(class7493.method21074(), Class512::getDisplayName) }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.bossbar.get.players.none", new Object[] { class7493.method21057() }), true);
        }
        return class7493.method21074().size();
    }
    
    private static int method28541(final Class7492 class7492, final Class6878 class7493, final boolean b) throws CommandSyntaxException {
        if (class7493.method21072() != b) {
            class7493.method21073(b);
            if (!b) {
                class7492.method23257(new Class2259("commands.bossbar.set.visible.success.hidden", new Object[] { class7493.method21057() }), true);
            }
            else {
                class7492.method23257(new Class2259("commands.bossbar.set.visible.success.visible", new Object[] { class7493.method21057() }), true);
            }
            return 0;
        }
        if (!b) {
            throw Class8522.field35784.create();
        }
        throw Class8522.field35785.create();
    }
    
    private static int method28542(final Class7492 class7492, final Class6878 class7493, final int i) throws CommandSyntaxException {
        if (class7493.method21053() != i) {
            class7493.method21055(i);
            class7492.method23257(new Class2259("commands.bossbar.set.value.success", new Object[] { class7493.method21057(), i }), true);
            return i;
        }
        throw Class8522.field35782.create();
    }
    
    private static int method28543(final Class7492 class7492, final Class6878 class7493, final int i) throws CommandSyntaxException {
        if (class7493.method21054() != i) {
            class7493.method21056(i);
            class7492.method23257(new Class2259("commands.bossbar.set.max.success", new Object[] { class7493.method21057(), i }), true);
            return i;
        }
        throw Class8522.field35783.create();
    }
    
    private static int method28544(final Class7492 class7492, final Class6878 class7493, final Class2200 other) throws CommandSyntaxException {
        if (!class7493.method21078().equals(other)) {
            class7493.method21065(other);
            class7492.method23257(new Class2259("commands.bossbar.set.color.success", new Object[] { class7493.method21057() }), true);
            return 0;
        }
        throw Class8522.field35780.create();
    }
    
    private static int method28545(final Class7492 class7492, final Class6878 class7493, final Class342 other) throws CommandSyntaxException {
        if (!class7493.method21079().equals(other)) {
            class7493.method21066(other);
            class7492.method23257(new Class2259("commands.bossbar.set.style.success", new Object[] { class7493.method21057() }), true);
            return 0;
        }
        throw Class8522.field35781.create();
    }
    
    private static int method28546(final Class7492 class7492, final Class6878 class7493, final ITextComponent class7494) throws CommandSyntaxException {
        final ITextComponent method35294 = Class9479.method35294(class7492, class7494, null, 0);
        if (!class7493.method21076().equals(method35294)) {
            class7493.method21070(method35294);
            class7492.method23257(new Class2259("commands.bossbar.set.name.success", new Object[] { class7493.method21057() }), true);
            return 0;
        }
        throw Class8522.field35779.create();
    }
    
    private static int method28547(final Class7492 class7492, final Class6878 class7493, final Collection<Class513> collection) throws CommandSyntaxException {
        if (class7493.method21058(collection)) {
            if (!class7493.method21074().isEmpty()) {
                class7492.method23257(new Class2259("commands.bossbar.set.players.success.some", new Object[] { class7493.method21057(), collection.size(), Class9479.method35298((Collection<Object>)collection, Class512::getDisplayName) }), true);
            }
            else {
                class7492.method23257(new Class2259("commands.bossbar.set.players.success.none", new Object[] { class7493.method21057() }), true);
            }
            return class7493.method21074().size();
        }
        throw Class8522.field35778.create();
    }
    
    private static int method28548(final Class7492 class7492) {
        final Collection<Class6878> method28264 = class7492.method23255().method1584().method28264();
        if (!method28264.isEmpty()) {
            class7492.method23257(new Class2259("commands.bossbar.list.bars.some", new Object[] { method28264.size(), Class9479.method35298((Collection<Object>)method28264, Class6878::method21057) }), false);
        }
        else {
            class7492.method23257(new Class2259("commands.bossbar.list.bars.none", new Object[0]), false);
        }
        return method28264.size();
    }
    
    private static int method28549(final Class7492 class7492, final ResourceLocation class7493, final ITextComponent class7494) throws CommandSyntaxException {
        final Class8467 method1584 = class7492.method23255().method1584();
        if (method1584.method28260(class7493) == null) {
            class7492.method23257(new Class2259("commands.bossbar.create.success", new Object[] { method1584.method28261(class7493, Class9479.method35294(class7492, class7494, null, 0)).method21057() }), true);
            return method1584.method28264().size();
        }
        throw Class8522.field35776.create((Object)class7493.toString());
    }
    
    private static int method28550(final Class7492 class7492, final Class6878 class7493) {
        final Class8467 method1584 = class7492.method23255().method1584();
        class7493.method21052();
        method1584.method28262(class7493);
        class7492.method23257(new Class2259("commands.bossbar.remove.success", new Object[] { class7493.method21057() }), true);
        return method1584.method28264().size();
    }
    
    public static Class6878 method28551(final CommandContext<Class7492> commandContext) throws CommandSyntaxException {
        final ResourceLocation method21433 = Class7000.method21433(commandContext, "id");
        final Class6878 method21434 = ((Class7492)commandContext.getSource()).method23255().method1584().method28260(method21433);
        if (method21434 != null) {
            return method21434;
        }
        throw Class8522.field35777.create((Object)method21433.toString());
    }
    
    static {
        field35776 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.bossbar.create.failed", new Object[] { o });
            return;
        });
        field35777 = new DynamicCommandExceptionType(o3 -> {
            new Class2259("commands.bossbar.unknown", new Object[] { o3 });
            return;
        });
        field35778 = new SimpleCommandExceptionType((Message)new Class2259("commands.bossbar.set.players.unchanged", new Object[0]));
        field35779 = new SimpleCommandExceptionType((Message)new Class2259("commands.bossbar.set.name.unchanged", new Object[0]));
        field35780 = new SimpleCommandExceptionType((Message)new Class2259("commands.bossbar.set.color.unchanged", new Object[0]));
        field35781 = new SimpleCommandExceptionType((Message)new Class2259("commands.bossbar.set.style.unchanged", new Object[0]));
        field35782 = new SimpleCommandExceptionType((Message)new Class2259("commands.bossbar.set.value.unchanged", new Object[0]));
        field35783 = new SimpleCommandExceptionType((Message)new Class2259("commands.bossbar.set.max.unchanged", new Object[0]));
        field35784 = new SimpleCommandExceptionType((Message)new Class2259("commands.bossbar.set.visibility.unchanged.hidden", new Object[0]));
        field35785 = new SimpleCommandExceptionType((Message)new Class2259("commands.bossbar.set.visibility.unchanged.visible", new Object[0]));
        field35786 = ((commandContext, suggestionsBuilder) -> Class7491.method23220(((Class7492)commandContext.getSource()).method23255().method1584().method28263(), suggestionsBuilder));
    }
}
