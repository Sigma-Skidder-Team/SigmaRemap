// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Class8524
{
    private static final SimpleCommandExceptionType field35791;
    
    public static void method28581(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("summon").requires(class7492 -> class7492.method23210(2))).then(((RequiredArgumentBuilder)Class7788.method25002("entity", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8605.method29180()).suggests((SuggestionProvider)Class8533.field35817).executes(commandContext -> method28582((Class7492)commandContext.getSource(), Class8605.method29181((CommandContext<Class7492>)commandContext, "entity"), ((Class7492)commandContext.getSource()).method23249(), new CompoundNBT(), true))).then(((RequiredArgumentBuilder)Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7555.method23719()).executes(commandContext -> method28582((Class7492)commandContext.getSource(), Class8605.method29181((CommandContext<Class7492>)commandContext, "entity"), Class7555.method23721((CommandContext<Class7492>)commandContext, "pos"), new CompoundNBT(), true))).then(Class7788.method25002("nbt", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class7418.method22831()).executes(commandContext -> method28582((Class7492)commandContext.getSource(), Class8605.method29181((CommandContext<Class7492>)commandContext, "entity"), Class7555.method23721((CommandContext<Class7492>)commandContext, "pos"), Class7418.method22832((com.mojang.brigadier.context.CommandContext<Object>)commandContext, "nbt"), false))))));
    }
    
    private static int method28582(final Class7492 class7492, final ResourceLocation class7493, final Vec3d class7494, final CompoundNBT class7495, final boolean b) throws CommandSyntaxException {
        final CompoundNBT method333 = class7495.copy();
        method333.putString("id", class7493.toString());
        if (EntityType.method23354(EntityType.field29057).equals(class7493)) {
            final LightningBoltEntity class7496 = new LightningBoltEntity(class7492.method23250(), class7494.x, class7494.y, class7494.z, false);
            class7492.method23250().method6903(class7496);
            class7492.method23257(new Class2259("commands.summon.success", new Object[] { class7496.getDisplayName() }), true);
            return 1;
        }
        final Entity method334 = EntityType.method23378(method333, (World)class7492.method23250(), class7500 -> {
            class7500.method1730(class7497.field22770, class7497.field22771, class7497.field22772, class7500.rotationYaw, class7500.rotationPitch);
            return class7499.method6887(class7500) ? class7500 : null;
        });
        if (method334 != null) {
            if (b) {
                if (method334 instanceof Class759) {
                    ((Class759)method334).method4188(class7492.method23250(), class7492.method23250().method6784(new BlockPos(method334)), Class2101.field12187, null, null);
                }
            }
            class7492.method23257(new Class2259("commands.summon.success", new Object[] { method334.getDisplayName() }), true);
            return 1;
        }
        throw Class8524.field35791.create();
    }
    
    static {
        field35791 = new SimpleCommandExceptionType((Message)new Class2259("commands.summon.failed", new Object[0]));
    }
}
