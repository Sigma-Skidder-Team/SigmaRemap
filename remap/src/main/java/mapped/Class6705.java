// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.commands.CommandException;

public class Class6705 extends Class6693
{
    public Class6705() {
        super("highdpi", "Toggles macOS HiDPI, Needs mc restart.", new String[] { "hidpi" });
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length > 0) {
            throw new Class2332("Too many arguments");
        }
        final Minecraft field26420 = Class6705.field26420;
        if (Minecraft.field4623) {
            if (!Client.method35173().method35193().method32148()) {
                class6428.method19104("HighDPI was enabled!");
            }
            else {
                class6428.method19104("HighDPI was disabled!");
            }
            Client.method35173().method35193().method32147(!Client.method35173().method35193().method32148());
            return;
        }
        throw new Class2332("This feature is only available on macOS!");
    }
}
