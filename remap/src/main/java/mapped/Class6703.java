// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class Class6703 extends Class6693
{
    public Class6703() {
        super("clearchat", "Clears your chat client side", "cc", "chatclear");
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length <= 0) {
            Class6703.field26420.field4647.method3807().method3760(true);
            return;
        }
        throw new Class2332("Too many arguments");
    }
}
