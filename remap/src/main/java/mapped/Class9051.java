// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Iterator;
import java.util.Set;
import java.util.EnumSet;
import java.util.Collection;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class9051
{
    public static void method32546(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("tp").requires(class7492 -> class7492.method23210(2))).redirect((CommandNode)commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("teleport").requires(class7493 -> class7493.method23210(2))).then(((RequiredArgumentBuilder)Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class7788.method25002("location", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7555.method23719()).executes(commandContext -> method32548((Class7492)commandContext.getSource(), Class6886.method21146((CommandContext<Class7492>)commandContext, "targets"), ((Class7492)commandContext.getSource()).method23250(), Class7555.method23722((CommandContext<Class7492>)commandContext, "location"), null, null))).then(Class7788.method25002("rotation", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8919.method31444()).executes(commandContext -> method32548((Class7492)commandContext.getSource(), Class6886.method21146((CommandContext<Class7492>)commandContext, "targets"), ((Class7492)commandContext.getSource()).method23250(), Class7555.method23722((CommandContext<Class7492>)commandContext, "location"), Class8919.method31445((CommandContext<Class7492>)commandContext, "rotation"), null)))).then(((LiteralArgumentBuilder)Class7788.method25001("facing").then(Class7788.method25001("entity").then(((RequiredArgumentBuilder)Class7788.method25002("facingEntity", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21143()).executes(commandContext -> method32548((Class7492)commandContext.getSource(), Class6886.method21146((CommandContext<Class7492>)commandContext, "targets"), ((Class7492)commandContext.getSource()).method23250(), Class7555.method23722((CommandContext<Class7492>)commandContext, "location"), null, new Class8140(Class6886.method21144((CommandContext<Class7492>)commandContext, "facingEntity"), Class2042.field11636)))).then(Class7788.method25002("facingAnchor", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8316.method27606()).executes(commandContext -> method32548((Class7492)commandContext.getSource(), Class6886.method21146((CommandContext<Class7492>)commandContext, "targets"), ((Class7492)commandContext.getSource()).method23250(), Class7555.method23722((CommandContext<Class7492>)commandContext, "location"), null, new Class8140(Class6886.method21144((CommandContext<Class7492>)commandContext, "facingEntity"), Class8316.method27605((CommandContext<Class7492>)commandContext, "facingAnchor")))))))).then(Class7788.method25002("facingLocation", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7555.method23719()).executes(commandContext -> method32548((Class7492)commandContext.getSource(), Class6886.method21146((CommandContext<Class7492>)commandContext, "targets"), ((Class7492)commandContext.getSource()).method23250(), Class7555.method23722((CommandContext<Class7492>)commandContext, "location"), null, new Class8140(Class7555.method23721((CommandContext<Class7492>)commandContext, "facingLocation")))))))).then(Class7788.method25002("destination", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21143()).executes(commandContext -> method32547((Class7492)commandContext.getSource(), Class6886.method21146((CommandContext<Class7492>)commandContext, "targets"), Class6886.method21144((CommandContext<Class7492>)commandContext, "destination")))))).then(Class7788.method25002("location", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7555.method23719()).executes(commandContext -> method32548((Class7492)commandContext.getSource(), Collections.singleton(((Class7492)commandContext.getSource()).method23252()), ((Class7492)commandContext.getSource()).method23250(), Class7555.method23722((CommandContext<Class7492>)commandContext, "location"), Class5347.method16512(), null)))).then(Class7788.method25002("destination", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21143()).executes(commandContext -> method32547((Class7492)commandContext.getSource(), Collections.singleton(((Class7492)commandContext.getSource()).method23252()), Class6886.method21144((CommandContext<Class7492>)commandContext, "destination")))))));
    }
    
    private static int method32547(final Class7492 class7492, final Collection<? extends Entity> collection, final Entity class7493) {
        final Iterator<? extends Entity> iterator = collection.iterator();
        while (iterator.hasNext()) {
            method32549(class7492, (Entity)iterator.next(), (Class1849)class7493.field2391, class7493.getPosX(), class7493.getPosY(), class7493.getPosZ(), EnumSet.noneOf(Class2143.class), class7493.field2399, class7493.field2400, null);
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.teleport.success.entity.multiple", new Object[] { collection.size(), class7493.getDisplayName() }), true);
        }
        else {
            class7492.method23257(new Class2259("commands.teleport.success.entity.single", new Object[] { ((Entity)collection.iterator().next()).getDisplayName(), class7493.getDisplayName() }), true);
        }
        return collection.size();
    }
    
    private static int method32548(final Class7492 class7492, final Collection<? extends Entity> collection, final Class1849 class7493, final Class5346 class7494, final Class5346 class7495, final Class8140 class7496) throws CommandSyntaxException {
        final Vec3d method16504 = class7494.method16504(class7492);
        final Vec2f class7497 = (class7495 != null) ? class7495.method16505(class7492) : null;
        final EnumSet<Class2143> none = EnumSet.noneOf(Class2143.class);
        if (class7494.method16507()) {
            none.add(Class2143.field12617);
        }
        if (class7494.method16508()) {
            none.add(Class2143.field12618);
        }
        if (class7494.method16509()) {
            none.add(Class2143.field12619);
        }
        if (class7495 != null) {
            if (class7495.method16507()) {
                none.add(Class2143.field12621);
            }
            if (class7495.method16508()) {
                none.add(Class2143.field12620);
            }
        }
        else {
            none.add(Class2143.field12621);
            none.add(Class2143.field12620);
        }
        for (final Entity class7498 : collection) {
            if (class7495 != null) {
                method32549(class7492, class7498, class7493, method16504.x, method16504.y, method16504.z, none, class7497.y, class7497.x, class7496);
            }
            else {
                method32549(class7492, class7498, class7493, method16504.x, method16504.y, method16504.z, none, class7498.field2399, class7498.field2400, class7496);
            }
        }
        if (collection.size() != 1) {
            class7492.method23257(new Class2259("commands.teleport.success.location.multiple", new Object[] { collection.size(), method16504.x, method16504.y, method16504.z}), true);
        }
        else {
            class7492.method23257(new Class2259("commands.teleport.success.location.single", new Object[] { ((Entity)collection.iterator().next()).getDisplayName(), method16504.x, method16504.y, method16504.z}), true);
        }
        return collection.size();
    }
    
    private static void method32549(final Class7492 class7492, Entity method23371, final Class1849 class7493, final double n, final double n2, final double n3, final Set<Class2143> set, final float n4, final float n5, final Class8140 class7494) {
        if (!(method23371 instanceof Class513)) {
            final float method23372 = MathHelper.method35668(n4);
            final float method23373 = MathHelper.clamp(MathHelper.method35668(n5), -90.0f, 90.0f);
            if (class7493 != method23371.field2391) {
                method23371.method1640();
                method23371.field2452 = class7493.field10063.method20487();
                final Entity class7495 = method23371;
                method23371 = (Entity)method23371.method1642().method23371(class7493);
                if (method23371 == null) {
                    return;
                }
                method23371.method1853(class7495);
                method23371.method1730(n, n2, n3, method23372, method23373);
                method23371.method1845(method23372);
                class7493.method6888(method23371);
                class7495.field2410 = true;
            }
            else {
                method23371.method1730(n, n2, n3, method23372, method23373);
                method23371.method1845(method23372);
            }
        }
        else {
            class7493.method6904().method7441(Class9105.field38571, new Class7859(new BlockPos(n, n2, n3)), 1, method23371.method1643());
            method23371.method1784();
            if (((Class513)method23371).method2783()) {
                ((Class513)method23371).method2849(true, true);
            }
            if (class7493 != method23371.field2391) {
                ((Class513)method23371).method2958(class7493, n, n2, n3, n4, n5);
            }
            else {
                ((Class513)method23371).field3039.method17468(n, n2, n3, n4, n5, set);
            }
            method23371.method1845(n4);
        }
        if (class7494 != null) {
            class7494.method26828(class7492, method23371);
        }
        if (!(method23371 instanceof Class511) || !((Class511)method23371).method2773()) {
            method23371.method1936(method23371.method1935().mul(1.0, 0.0, 1.0));
            method23371.field2404 = true;
        }
    }
}
