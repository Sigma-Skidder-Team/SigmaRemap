// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.builder.ArgumentBuilder;

public class Class8624
{
    private static String[] field36189;
    private final ArgumentBuilder<Class7491, ?> field36190;
    private final byte field36191;
    private final int field36192;
    private final int[] field36193;
    private CommandNode<Class7491> field36194;
    
    private Class8624(final ArgumentBuilder<Class7491, ?> field36190, final byte field36191, final int field36192, final int[] field36193) {
        this.field36190 = field36190;
        this.field36191 = field36191;
        this.field36192 = field36192;
        this.field36193 = field36193;
    }
    
    public boolean method29264(final Class8624[] array) {
        if (this.field36194 == null) {
            if (this.field36190 != null) {
                if ((this.field36191 & 0x8) != 0x0) {
                    if (array[this.field36192].field36194 == null) {
                        return false;
                    }
                    this.field36190.redirect((CommandNode)array[this.field36192].field36194);
                }
                if ((this.field36191 & 0x4) != 0x0) {
                    this.field36190.executes(commandContext -> 0);
                }
                this.field36194 = (CommandNode<Class7491>)this.field36190.build();
            }
            else {
                this.field36194 = (CommandNode<Class7491>)new RootCommandNode();
            }
        }
        final int[] field36193 = this.field36193;
        for (int length = field36193.length, i = 0; i < length; ++i) {
            if (array[field36193[i]].field36194 == null) {
                return false;
            }
        }
        final int[] field36194 = this.field36193;
        for (int length2 = field36194.length, j = 0; j < length2; ++j) {
            final CommandNode<Class7491> field36195 = array[field36194[j]].field36194;
            if (!(field36195 instanceof RootCommandNode)) {
                this.field36194.addChild((CommandNode)field36195);
            }
        }
        return true;
    }
}
