// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.HashSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.entity.Entity;

public class Class8464
{
    private static final SimpleCommandExceptionType field34744;
    private static final SimpleCommandExceptionType field34745;
    
    public static void method28249(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("tag").requires(class7492 -> class7492.method23210(2))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).then(Class7788.method25001("add").then(Class7788.method25002("name", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.word()).executes(commandContext -> method28251((Class7492)commandContext.getSource(), Class6886.method21146((CommandContext<Class7492>)commandContext, "targets"), StringArgumentType.getString(commandContext, "name")))))).then(Class7788.method25001("remove").then(Class7788.method25002("name", (com.mojang.brigadier.arguments.ArgumentType<Object>)StringArgumentType.word()).suggests((commandContext, suggestionsBuilder) -> Class7491.method23226(method28250(Class6886.method21146((CommandContext<Class7492>)commandContext, "targets")), suggestionsBuilder)).executes(commandContext -> method28252((Class7492)commandContext.getSource(), Class6886.method21146((CommandContext<Class7492>)commandContext, "targets"), StringArgumentType.getString(commandContext, "name")))))).then(Class7788.method25001("list").executes(commandContext -> method28253((Class7492)commandContext.getSource(), Class6886.method21146((CommandContext<Class7492>)commandContext, "targets"))))));
    }
    
    private static Collection<String> method28250(final Collection<? extends Entity> collection) {
        final HashSet hashSet = Sets.newHashSet();
        final Iterator<? extends Entity> iterator = collection.iterator();
        while (iterator.hasNext()) {
            hashSet.addAll(((Entity)iterator.next()).method1645());
        }
        return hashSet;
    }
    
    private static int method28251(final Class7492 class7492, final Collection<? extends Entity> collection, final String s) throws CommandSyntaxException {
        int n = 0;
        final Iterator<? extends Entity> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!((Entity)iterator.next()).method1646(s)) {
                continue;
            }
            ++n;
        }
        if (n != 0) {
            if (collection.size() != 1) {
                class7492.method23257(new Class2259("commands.tag.add.success.multiple", new Object[] { s, collection.size() }), true);
            }
            else {
                class7492.method23257(new Class2259("commands.tag.add.success.single", new Object[] { s, ((Entity)collection.iterator().next()).getDisplayName() }), true);
            }
            return n;
        }
        throw Class8464.field34744.create();
    }
    
    private static int method28252(final Class7492 class7492, final Collection<? extends Entity> collection, final String s) throws CommandSyntaxException {
        int n = 0;
        final Iterator<? extends Entity> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!((Entity)iterator.next()).method1647(s)) {
                continue;
            }
            ++n;
        }
        if (n != 0) {
            if (collection.size() != 1) {
                class7492.method23257(new Class2259("commands.tag.remove.success.multiple", new Object[] { s, collection.size() }), true);
            }
            else {
                class7492.method23257(new Class2259("commands.tag.remove.success.single", new Object[] { s, ((Entity)collection.iterator().next()).getDisplayName() }), true);
            }
            return n;
        }
        throw Class8464.field34745.create();
    }
    
    private static int method28253(final Class7492 class7492, final Collection<? extends Entity> collection) {
        final HashSet hashSet = Sets.newHashSet();
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            hashSet.addAll(((Entity)iterator.next()).method1645());
        }
        if (collection.size() != 1) {
            if (!hashSet.isEmpty()) {
                class7492.method23257(new Class2259("commands.tag.list.multiple.success", new Object[] { collection.size(), hashSet.size(), Class9479.method35296(hashSet) }), false);
            }
            else {
                class7492.method23257(new Class2259("commands.tag.list.multiple.empty", new Object[] { collection.size() }), false);
            }
        }
        else {
            final Entity class7493 = (Entity)collection.iterator().next();
            if (!hashSet.isEmpty()) {
                class7492.method23257(new Class2259("commands.tag.list.single.success", new Object[] { class7493.getDisplayName(), hashSet.size(), Class9479.method35296(hashSet) }), false);
            }
            else {
                class7492.method23257(new Class2259("commands.tag.list.single.empty", new Object[] { class7493.getDisplayName() }), false);
            }
        }
        return hashSet.size();
    }
    
    static {
        field34744 = new SimpleCommandExceptionType((Message)new Class2259("commands.tag.add.failed", new Object[0]));
        field34745 = new SimpleCommandExceptionType((Message)new Class2259("commands.tag.remove.failed", new Object[0]));
    }
}
