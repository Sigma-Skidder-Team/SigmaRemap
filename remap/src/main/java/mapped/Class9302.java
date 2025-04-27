// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

public class Class9302
{
    public static final SimpleCommandExceptionType field39908;
    public static final DynamicCommandExceptionType field39909;
    public static final Dynamic2CommandExceptionType field39910;
    
    public static void method34395(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class7788.method25001("replaceitem").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25001("block").then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then(Class7788.method25002("slot", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8631.method29295()).then(((RequiredArgumentBuilder)Class7788.method25002("item", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6767.method20638()).executes(commandContext -> method34396(commandContext.getSource(), Class8330.method27768(commandContext, "pos"), Class8631.method29296(commandContext, "slot"), Class6767.method20639((CommandContext<Object>)commandContext, "item").method772(1, false)))).then(Class7788.method25002("count", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(1, 64)).executes(commandContext -> method34396(commandContext.getSource(), Class8330.method27768(commandContext, "pos"), Class8631.method29296(commandContext, "slot"), Class6767.method20639((CommandContext<Object>)commandContext, "item").method772(IntegerArgumentType.getInteger(commandContext, "count"), true)))))))).then(Class7788.method25001("entity").then(Class7788.method25002("targets", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).then(Class7788.method25002("slot", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8631.method29295()).then(((RequiredArgumentBuilder)Class7788.method25002("item", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6767.method20638()).executes(commandContext -> method34397(commandContext.getSource(), Class6886.method21146(commandContext, "targets"), Class8631.method29296(commandContext, "slot"), Class6767.method20639((com.mojang.brigadier.context.CommandContext<Object>)commandContext, "item").method772(1, false)))).then(Class7788.method25002("count", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(1, 64)).executes(commandContext -> method34397(commandContext.getSource(), Class6886.method21146(commandContext, "targets"), Class8631.method29296(commandContext, "slot"), Class6767.method20639((com.mojang.brigadier.context.CommandContext<Object>)commandContext, "item").method772(IntegerArgumentType.getInteger(commandContext, "count"), true)))))))));
    }
    
    private static int method34396(final Class7492 class7492, final BlockPos class7493, final int i, final ItemStack class7494) throws CommandSyntaxException {
        final TileEntity method6727 = class7492.method23250().getTileEntity(class7493);
        if (!(method6727 instanceof IInventory)) {
            throw Class9302.field39908.create();
        }
        final IInventory class7495 = (IInventory)method6727;
        if (i >= 0 && i < class7495.getSizeInventory()) {
            class7495.method2160(i, class7494);
            class7492.method23257(new Class2259("commands.replaceitem.block.success", class7493.getX(), class7493.getY(), class7493.getZ(), class7494.method27684()), true);
            return 1;
        }
        throw Class9302.field39909.create(i);
    }
    
    private static int method34397(final Class7492 class7492, final Collection<? extends Entity> collection, final int i, final ItemStack class7493) throws CommandSyntaxException {
        final ArrayList arrayListWithCapacity = Lists.newArrayListWithCapacity(collection.size());
        for (final Entity class7494 : collection) {
            if (class7494 instanceof Class513) {
                ((Class513)class7494).container.method10876();
            }
            if (!class7494.method1893(i, class7493.method27641())) {
                continue;
            }
            arrayListWithCapacity.add(class7494);
            if (!(class7494 instanceof Class513)) {
                continue;
            }
            ((Class513)class7494).container.method10876();
        }
        if (!arrayListWithCapacity.isEmpty()) {
            if (arrayListWithCapacity.size() != 1) {
                class7492.method23257(new Class2259("commands.replaceitem.entity.success.multiple", arrayListWithCapacity.size(), class7493.method27684()), true);
            }
            else {
                class7492.method23257(new Class2259("commands.replaceitem.entity.success.single", ((Entity)arrayListWithCapacity.iterator().next()).getDisplayName(), class7493.method27684()), true);
            }
            return arrayListWithCapacity.size();
        }
        throw Class9302.field39910.create(class7493.method27684(), i);
    }
    
    static {
        field39908 = new SimpleCommandExceptionType(new Class2259("commands.replaceitem.block.failed", new Object[0]));
        field39909 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.replaceitem.slot.inapplicable", o);
            return;
        });
        field39910 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("commands.replaceitem.entity.failed", o, o2));
    }
}
