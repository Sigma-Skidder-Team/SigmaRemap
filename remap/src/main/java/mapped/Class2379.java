// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.util.text.ITextComponent;

public class Class2379 extends RuntimeException
{
    private static String[] field14176;
    private final ITextComponent field14177;
    
    public Class2379(final ITextComponent field14177) {
        super(field14177.method8459(), null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
        this.field14177 = field14177;
    }
    
    public ITextComponent method9506() {
        return this.field14177;
    }
}
