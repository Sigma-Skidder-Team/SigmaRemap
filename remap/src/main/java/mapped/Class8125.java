// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.Style;

public class Class8125
{
    private static final SimpleCommandExceptionType field33474;
    
    public static void method26750(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("locate").requires(class7492 -> class7492.method23210(2))).then(Class7788.method25001("Pillager_Outpost").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Pillager_Outpost")))).then(Class7788.method25001("Mineshaft").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Mineshaft")))).then(Class7788.method25001("Mansion").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Mansion")))).then(Class7788.method25001("Igloo").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Igloo")))).then(Class7788.method25001("Desert_Pyramid").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Desert_Pyramid")))).then(Class7788.method25001("Jungle_Pyramid").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Jungle_Pyramid")))).then(Class7788.method25001("Swamp_Hut").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Swamp_Hut")))).then(Class7788.method25001("Stronghold").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Stronghold")))).then(Class7788.method25001("Monument").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Monument")))).then(Class7788.method25001("Fortress").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Fortress")))).then(Class7788.method25001("EndCity").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "EndCity")))).then(Class7788.method25001("Ocean_Ruin").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Ocean_Ruin")))).then(Class7788.method25001("Buried_Treasure").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Buried_Treasure")))).then(Class7788.method25001("Shipwreck").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Shipwreck")))).then(Class7788.method25001("Village").executes(commandContext -> method26751((Class7492)commandContext.getSource(), "Village"))));
    }
    
    private static int method26751(final Class7492 class7492, final String s) throws CommandSyntaxException {
        final BlockPos class7493 = new BlockPos(class7492.method23249());
        final BlockPos method6915 = class7492.method23250().method6915(s, class7493, 100, false);
        if (method6915 != null) {
            final int method6916 = MathHelper.method35642(method26752(class7493.getX(), class7493.getZ(), method6915.getX(), method6915.getZ()));
            class7492.method23257(new Class2259("commands.locate.success", new Object[] { s, Class9479.method35299(new Class2259("chat.coordinates", new Object[] { method6915.getX(), "~", method6915.getZ() })).applyTextStyle(class7495 -> {
                    class7495.setColor(TextFormatting.GREEN);
                    new Class9485(Class2075.field11974, "/tp @s " + class7494.method1074() + " ~ " + class7494.method1076());
                    final Class9485 class7496;
                    final Object o;
                    ((Style)o).method30419(class7496);
                    new HoverEvent(HoverEvent.Action.field10697, new Class2259("chat.coordinates.tooltip", new Object[0]));
                    final HoverEvent class7497;
                    final Object o2;
                    ((Style)o2).method30420(class7497);
                    return;
                }), method6916 }), false);
            return method6916;
        }
        throw Class8125.field33474.create();
    }
    
    private static float method26752(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n3 - n;
        final int n6 = n4 - n2;
        return MathHelper.method35640((float)(n5 * n5 + n6 * n6));
    }
    
    static {
        field33474 = new SimpleCommandExceptionType((Message)new Class2259("commands.locate.failed", new Object[0]));
    }
}
