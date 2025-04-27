// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Objects;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class Class7798
{
    public static final SuggestionProvider<Class7492> field31959;
    private static final DynamicCommandExceptionType field31960;
    private static final DynamicCommandExceptionType field31961;
    
    public static void method25156(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register(method25157((LiteralArgumentBuilder)Class7788.method25001("loot").requires(class7492 -> class7492.method23210(2)), (argumentBuilder, class8917) -> argumentBuilder.then(Class7788.method25001("fish").then(Class7788.method25002("loot_table", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class7798.field31959).then(((RequiredArgumentBuilder)Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).executes(commandContext -> method25173(commandContext, Class7000.method21433(commandContext, "loot_table"), Class8330.method27768(commandContext, "pos"), ItemStack.EMPTY, class8917))).then(Class7788.method25002("tool", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6767.method20638()).executes(commandContext -> method25173(commandContext, Class7000.method21433(commandContext, "loot_table"), Class8330.method27768(commandContext, "pos"), Class6767.method20639((CommandContext<Object>)commandContext, "tool").method772(1, false), class8917))).then(Class7788.method25001("mainhand").executes(commandContext -> method25173(commandContext, Class7000.method21433(commandContext, "loot_table"), Class8330.method27768(commandContext, "pos"), method25169(commandContext.getSource(), Class2215.field13600), class8917))).then(Class7788.method25001("offhand").executes(commandContext -> method25173(commandContext, Class7000.method21433(commandContext, "loot_table"), Class8330.method27768(commandContext, "pos"), method25169(commandContext.getSource(), Class2215.field13601), class8917)))))).then(Class7788.method25001("loot").then(Class7788.method25002("loot_table", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7000.method21429()).suggests(Class7798.field31959).executes(commandContext -> method25172((CommandContext<Class7492>)commandContext, Class7000.method21433((CommandContext<Class7492>)commandContext, "loot_table"), class8917)))).then(Class7788.method25001("kill").then(Class7788.method25002("target", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21143()).executes(commandContext -> method25171(commandContext, Class6886.method21144(commandContext, "target"), class8917)))).then(Class7788.method25001("mine").then(((RequiredArgumentBuilder)Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).executes(commandContext -> method25170(commandContext, Class8330.method27768(commandContext, "pos"), ItemStack.EMPTY, class8917))).then(Class7788.method25002("tool", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6767.method20638()).executes(commandContext -> method25170(commandContext, Class8330.method27768(commandContext, "pos"), Class6767.method20639((CommandContext<Object>)commandContext, "tool").method772(1, false), class8917))).then(Class7788.method25001("mainhand").executes(commandContext -> method25170(commandContext, Class8330.method27768(commandContext, "pos"), method25169(commandContext.getSource(), Class2215.field13600), class8917))).then(Class7788.method25001("offhand").executes(commandContext -> method25170(commandContext, Class8330.method27768(commandContext, "pos"), method25169(commandContext.getSource(), Class2215.field13601), class8917)))))));
    }
    
    private static <T extends ArgumentBuilder<Class7492, T>> T method25157(final T t, final Class8618 class8618) {
        return (T)t.then(Class7788.method25001("replace").then(Class7788.method25001("entity").then(Class7788.method25002("entities", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21145()).then(class8618.method29233(Class7788.method25002("slot", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8631.method29295()), (commandContext, list, class7945) -> method25165(Class6886.method21146(commandContext, "entities"), Class8631.method29296(commandContext, "slot"), list.size(), list, class7945)).then(class8618.method29233(Class7788.method25002("count", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)), (commandContext, list, class7945) -> method25165(Class6886.method21146(commandContext, "entities"), Class8631.method29296(commandContext, "slot"), IntegerArgumentType.getInteger(commandContext, "count"), list, class7945)))))).then(Class7788.method25001("block").then(Class7788.method25002("targetPos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).then(class8618.method29233(Class7788.method25002("slot", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8631.method29295()), (commandContext, list, class7945) -> method25161(commandContext.getSource(), Class8330.method27768(commandContext, "targetPos"), Class8631.method29296(commandContext, "slot"), list.size(), list, class7945)).then(class8618.method29233(Class7788.method25002("count", (com.mojang.brigadier.arguments.ArgumentType<Object>)IntegerArgumentType.integer(0)), (commandContext, list, class7945) -> method25161(commandContext.getSource(), Class8330.method27768(commandContext, "targetPos"), IntegerArgumentType.getInteger(commandContext, "slot"), IntegerArgumentType.getInteger(commandContext, "count"), list, class7945))))))).then(Class7788.method25001("insert").then(class8618.method29233(Class7788.method25002("targetPos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()), (commandContext, list, class7945) -> method25159(commandContext.getSource(), Class8330.method27768(commandContext, "targetPos"), list, class7945)))).then(Class7788.method25001("give").then(class8618.method29233(Class7788.method25002("players", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class6886.method21151()), (commandContext, list, class7945) -> method25163(Class6886.method21152(commandContext, "players"), list, class7945)))).then(Class7788.method25001("spawn").then(class8618.method29233(Class7788.method25002("targetPos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7555.method23719()), (commandContext, list, class7945) -> method25166(commandContext.getSource(), Class7555.method23721(commandContext, "targetPos"), list, class7945))));
    }
    
    private static IInventory method25158(final Class7492 class7492, final BlockPos class7493) throws CommandSyntaxException {
        final TileEntity method6727 = class7492.method23250().getTileEntity(class7493);
        if (method6727 instanceof IInventory) {
            return (IInventory)method6727;
        }
        throw Class9302.field39908.create();
    }
    
    private static int method25159(final Class7492 class7492, final BlockPos class7493, final List<ItemStack> list, final Class7945 class7494) throws CommandSyntaxException {
        final IInventory method25158 = method25158(class7492, class7493);
        final ArrayList arrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
        for (final ItemStack class7495 : list) {
            if (!method25160(method25158, class7495.method27641())) {
                continue;
            }
            method25158.method2161();
            arrayListWithCapacity.add(class7495);
        }
        class7494.method25768(arrayListWithCapacity);
        return arrayListWithCapacity.size();
    }
    
    private static boolean method25160(final IInventory class446, final ItemStack class447) {
        boolean b = false;
        for (int i = 0; i < class446.getSizeInventory(); ++i) {
            if (class447.method27620()) {
                break;
            }
            final ItemStack method2157 = class446.getStackInSlot(i);
            if (class446.method2264(i, class447)) {
                if (method2157.method27620()) {
                    class446.method2160(i, class447);
                    b = true;
                    break;
                }
                if (method25162(method2157, class447)) {
                    final int min = Math.min(class447.method27690(), class447.method27628() - method2157.method27690());
                    class447.method27693(min);
                    method2157.method27692(min);
                    b = true;
                }
            }
        }
        return b;
    }
    
    private static int method25161(final Class7492 class7492, final BlockPos class7493, final int i, final int n, final List<ItemStack> list, final Class7945 class7494) throws CommandSyntaxException {
        final IInventory method25158 = method25158(class7492, class7493);
        final int method25159 = method25158.getSizeInventory();
        if (i >= 0 && i < method25159) {
            final ArrayList arrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
            for (int j = 0; j < n; ++j) {
                final int n2 = i + j;
                final ItemStack class7495 = (j >= list.size()) ? ItemStack.EMPTY : list.get(j);
                if (method25158.method2264(n2, class7495)) {
                    method25158.method2160(n2, class7495);
                    arrayListWithCapacity.add(class7495);
                }
            }
            class7494.method25768(arrayListWithCapacity);
            return arrayListWithCapacity.size();
        }
        throw Class9302.field39909.create(i);
    }
    
    private static boolean method25162(final ItemStack class8321, final ItemStack class8322) {
        if (class8321.getItem() == class8322.getItem()) {
            if (class8321.method27632() == class8322.method27632()) {
                if (class8321.method27690() <= class8321.method27628()) {
                    return Objects.equals(class8321.method27657(), class8322.method27657());
                }
            }
        }
        return false;
    }
    
    private static int method25163(final Collection<Class513> collection, final List<ItemStack> list, final Class7945 class7945) throws CommandSyntaxException {
        final ArrayList arrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
        for (final ItemStack class7946 : list) {
            final Iterator<Class513> iterator2 = collection.iterator();
            while (iterator2.hasNext()) {
                if (!iterator2.next().inventory.method2362(class7946.method27641())) {
                    continue;
                }
                arrayListWithCapacity.add(class7946);
            }
        }
        class7945.method25768(arrayListWithCapacity);
        return arrayListWithCapacity.size();
    }
    
    private static void method25164(final Entity class399, final List<ItemStack> list, final int n, final int n2, final List<ItemStack> list2) {
        for (int i = 0; i < n2; ++i) {
            final ItemStack class400 = (i >= list.size()) ? ItemStack.EMPTY : list.get(i);
            if (class399.method1893(n + i, class400.method27641())) {
                list2.add(class400);
            }
        }
    }
    
    private static int method25165(final Collection<? extends Entity> collection, final int n, final int n2, final List<ItemStack> list, final Class7945 class7945) throws CommandSyntaxException {
        final ArrayList arrayListWithCapacity = Lists.newArrayListWithCapacity(list.size());
        for (final Entity class7946 : collection) {
            if (!(class7946 instanceof Class513)) {
                method25164(class7946, list, n, n2, arrayListWithCapacity);
            }
            else {
                final Class513 class7947 = (Class513)class7946;
                class7947.container.method10876();
                method25164(class7946, list, n, n2, arrayListWithCapacity);
                class7947.container.method10876();
            }
        }
        class7945.method25768(arrayListWithCapacity);
        return arrayListWithCapacity.size();
    }
    
    private static int method25166(final Class7492 class7492, final Vec3d class7493, final List<ItemStack> list, final Class7945 class7494) throws CommandSyntaxException {
        list.forEach(class7498 -> {
            class7495.method23250();
            final Class427 class7499 = new Class427(class7496, class7497.field22770, class7497.field22771, class7497.field22772, class7498.method27641());
            class7499.method2114();
            class7496.method6886(class7499);
        });
        class7494.method25768(list);
        return list.size();
    }
    
    private static void method25167(final Class7492 class7492, final List<ItemStack> list) {
        if (list.size() != 1) {
            class7492.method23257(new Class2259("commands.drop.success.multiple", list.size()), false);
        }
        else {
            final ItemStack class7493 = list.get(0);
            class7492.method23257(new Class2259("commands.drop.success.single", class7493.method27690(), class7493.method27684()), false);
        }
    }
    
    private static void method25168(final Class7492 class7492, final List<ItemStack> list, final ResourceLocation class7493) {
        if (list.size() != 1) {
            class7492.method23257(new Class2259("commands.drop.success.multiple_with_table", list.size(), class7493), false);
        }
        else {
            final ItemStack class7494 = list.get(0);
            class7492.method23257(new Class2259("commands.drop.success.single_with_table", class7494.method27690(), class7494.method27684(), class7493), false);
        }
    }
    
    private static ItemStack method25169(final Class7492 class7492, final Class2215 class7493) throws CommandSyntaxException {
        final Entity method23252 = class7492.method23252();
        if (!(method23252 instanceof LivingEntity)) {
            throw Class7798.field31960.create(method23252.getDisplayName());
        }
        return ((LivingEntity)method23252).method2718(class7493);
    }
    
    private static int method25170(final CommandContext<Class7492> commandContext, final BlockPos class354, final ItemStack class355, final Class8917 class356) throws CommandSyntaxException {
        final Class7492 class357 = commandContext.getSource();
        final Class1849 method23250 = class357.method23250();
        final Class7096 method23251 = method23250.getBlockState(class354);
        return class356.method31443(commandContext, method23251.method21743(new Class9098(method23250).method32877(Class6683.field26367, class354).method32877(Class6683.field26368, method23251).method32878(Class6683.field26369, method23250.getTileEntity(class354)).method32878(Class6683.field26362, class357.method23251()).method32877(Class6683.field26370, class355)), list -> method25168(class357, list, method23251.method21696().method11832()));
    }
    
    private static int method25171(final CommandContext<Class7492> commandContext, final Entity class399, final Class8917 class400) throws CommandSyntaxException {
        if (class399 instanceof LivingEntity) {
            final ResourceLocation method2679 = ((LivingEntity)class399).method2679();
            final Class7492 class401 = commandContext.getSource();
            final Class9098 class402 = new Class9098(class401.method23250());
            final Entity method2680 = class401.method23251();
            if (method2680 instanceof PlayerEntity) {
                class402.method32877(Class6683.field26363, (PlayerEntity)method2680);
            }
            class402.method32877(Class6683.field26364, DamageSource.field32576);
            class402.method32878(Class6683.field26366, method2680);
            class402.method32878(Class6683.field26365, method2680);
            class402.method32877(Class6683.field26362, class399);
            class402.method32877(Class6683.field26367, new BlockPos(class401.method23249()));
            return class400.method31443(commandContext, class401.method23255().method1581().method6402(method2679).method34485(class402.method32883(Class7104.field27715)), list -> method25168(class401, list, method2679));
        }
        throw Class7798.field31961.create(class399.getDisplayName());
    }
    
    private static int method25172(final CommandContext<Class7492> commandContext, final ResourceLocation class1932, final Class8917 class1933) throws CommandSyntaxException {
        final Class7492 class1934 = commandContext.getSource();
        return method25174(commandContext, class1932, new Class9098(class1934.method23250()).method32878(Class6683.field26362, class1934.method23251()).method32877(Class6683.field26367, new BlockPos(class1934.method23249())).method32883(Class7104.field27711), class1933);
    }
    
    private static int method25173(final CommandContext<Class7492> commandContext, final ResourceLocation class1932, final BlockPos class1933, final ItemStack class1934, final Class8917 class1935) throws CommandSyntaxException {
        return method25174(commandContext, class1932, new Class9098(commandContext.getSource().method23250()).method32877(Class6683.field26367, class1933).method32877(Class6683.field26370, class1934).method32883(Class7104.field27714), class1935);
    }
    
    private static int method25174(final CommandContext<Class7492> commandContext, final ResourceLocation class1932, final Class7529 class1933, final Class8917 class1934) throws CommandSyntaxException {
        final Class7492 class1935 = commandContext.getSource();
        return class1934.method31443(commandContext, class1935.method23255().method1581().method6402(class1932).method34485(class1933), list -> method25167(class1935, list));
    }
    
    static {
        field31959 = ((commandContext, suggestionsBuilder) -> Class7491.method23220(commandContext.getSource().method23255().method1581().method6405(), suggestionsBuilder));
        field31960 = new DynamicCommandExceptionType(o -> {
            new Class2259("commands.drop.no_held_items", o);
            return;
        });
        field31961 = new DynamicCommandExceptionType(o3 -> {
            new Class2259("commands.drop.no_loot_table", o3);
            return;
        });
    }
}
