// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Collection;
import java.util.function.Function;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.util.text.ITextComponent;

public class Class9587
{
    public static void method35950(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("list").executes(commandContext -> method35951(commandContext.getSource()))).then(Class7788.method25001("uuids").executes(commandContext -> method35952(commandContext.getSource()))));
    }
    
    private static int method35951(final Class7492 class7492) {
        return method35953(class7492, PlayerEntity::getDisplayName);
    }
    
    private static int method35952(final Class7492 class7492) {
        return method35953(class7492, PlayerEntity::method2891);
    }
    
    private static int method35953(final Class7492 class7492, final Function<Class513, ITextComponent> function) {
        final Class6765 method1537 = class7492.method23255().method1537();
        final List<Class513> method1538 = method1537.method20623();
        class7492.method23257(new Class2259("commands.list.players", method1538.size(), method1537.method20609(), Class9479.method35298((Collection<Object>)method1538, (Function<Object, ITextComponent>)function)), false);
        return method1538.size();
    }
}
