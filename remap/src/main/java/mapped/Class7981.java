// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import java.util.Collection;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class Class7981
{
    private static final SimpleCommandExceptionType field32842;
    private static final SimpleCommandExceptionType field32843;
    private static final SimpleCommandExceptionType field32844;
    
    public static void method26020(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class7788.method25001("effect").requires(class7492 -> class7492.method23210(2))).then(((LiteralArgumentBuilder)Class7788.method25001("clear").executes(commandContext -> method26022(commandContext.getSource(), (Collection<? extends Entity>)ImmutableList.of((Object) commandContext.getSource().method23252())))).then(((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).executes(commandContext -> method26022(commandContext.getSource(), Class6886.method21146(commandContext, "targets")))).then(Class7788.method25002("effect", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6877.method21044()).executes(commandContext -> method26023(commandContext.getSource(), Class6886.method21146(commandContext, "targets"), Class6877.method21045(commandContext, "effect")))))).then(Class7788.method25001("give").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).then(((RequiredArgumentBuilder)Class7788.method25002("effect", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6877.method21044()).executes(commandContext -> method26021(commandContext.getSource(), Class6886.method21146(commandContext, "targets"), Class6877.method21045(commandContext, "effect"), null, 0, true))).then(((RequiredArgumentBuilder)Class7788.method25002("seconds", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(1, 1000000)).executes(commandContext -> method26021(commandContext.getSource(), Class6886.method21146(commandContext, "targets"), Class6877.method21045(commandContext, "effect"), IntegerArgumentType.getInteger(commandContext, "seconds"), 0, true))).then(((RequiredArgumentBuilder)Class7788.method25002("amplifier", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0, 255)).executes(commandContext -> method26021(commandContext.getSource(), Class6886.method21146(commandContext, "targets"), Class6877.method21045(commandContext, "effect"), IntegerArgumentType.getInteger(commandContext, "seconds"), IntegerArgumentType.getInteger(commandContext, "amplifier"), true))).then(Class7788.method25002("hideParticles", (com.mojang.brigadier.arguments.ArgumentType<Object>)BoolArgumentType.bool()).executes(commandContext -> method26021(commandContext.getSource(), Class6886.method21146(commandContext, "targets"), Class6877.method21045(commandContext, "effect"), IntegerArgumentType.getInteger(commandContext, "seconds"), IntegerArgumentType.getInteger(commandContext, "amplifier"), !BoolArgumentType.getBool(commandContext, "hideParticles"))))))))));
    }
    
    private static int method26021(final Class7492 class7492, final Collection<? extends Entity> collection, final Class5328 class7493, final Integer n, final int n2, final boolean b) throws CommandSyntaxException {
        int n3 = 0;
        int intValue;
        if (n == null) {
            if (!class7493.method16453()) {
                intValue = 600;
            }
            else {
                intValue = 1;
            }
        }
        else if (!class7493.method16453()) {
            intValue = n * 20;
        }
        else {
            intValue = n;
        }
        for (final Entity class7494 : collection) {
            if (!(class7494 instanceof LivingEntity)) {
                continue;
            }
            if (!((LivingEntity)class7494).method2655(new Class1948(class7493, intValue, n2, false, b))) {
                continue;
            }
            ++n3;
        }
        if (n3 != 0) {
            if (collection.size() != 1) {
                class7492.method23257(new Class2259("commands.effect.give.success.multiple", class7493.method16456(), collection.size(), intValue / 20), true);
            }
            else {
                class7492.method23257(new Class2259("commands.effect.give.success.single", class7493.method16456(), collection.iterator().next().getDisplayName(), intValue / 20), true);
            }
            return n3;
        }
        throw Class7981.field32842.create();
    }
    
    private static int method26022(final Class7492 class7492, final Collection<? extends Entity> collection) throws CommandSyntaxException {
        int n = 0;
        for (final Entity class7493 : collection) {
            if (!(class7493 instanceof LivingEntity)) {
                continue;
            }
            if (!((LivingEntity)class7493).method2650()) {
                continue;
            }
            ++n;
        }
        if (n != 0) {
            if (collection.size() != 1) {
                class7492.method23257(new Class2259("commands.effect.clear.everything.success.multiple", collection.size()), true);
            }
            else {
                class7492.method23257(new Class2259("commands.effect.clear.everything.success.single", collection.iterator().next().getDisplayName()), true);
            }
            return n;
        }
        throw Class7981.field32843.create();
    }
    
    private static int method26023(final Class7492 class7492, final Collection<? extends Entity> collection, final Class5328 class7493) throws CommandSyntaxException {
        int n = 0;
        for (final Entity class7494 : collection) {
            if (!(class7494 instanceof LivingEntity)) {
                continue;
            }
            if (!((LivingEntity)class7494).method2659(class7493)) {
                continue;
            }
            ++n;
        }
        if (n != 0) {
            if (collection.size() != 1) {
                class7492.method23257(new Class2259("commands.effect.clear.specific.success.multiple", class7493.method16456(), collection.size()), true);
            }
            else {
                class7492.method23257(new Class2259("commands.effect.clear.specific.success.single", class7493.method16456(), collection.iterator().next().getDisplayName()), true);
            }
            return n;
        }
        throw Class7981.field32844.create();
    }
    
    static {
        field32842 = new SimpleCommandExceptionType(new Class2259("commands.effect.give.failed", new Object[0]));
        field32843 = new SimpleCommandExceptionType(new Class2259("commands.effect.clear.everything.failed", new Object[0]));
        field32844 = new SimpleCommandExceptionType(new Class2259("commands.effect.clear.specific.failed", new Object[0]));
    }
}
