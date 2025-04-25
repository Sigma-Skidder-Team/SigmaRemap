// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.commands.CommandException;
import com.mentalfrostbyte.jello.mods.Module;

public class Class6695 extends Class6693
{
    public Class6695() {
        super("toggle", "Toggle a module", new String[] { "t" });
        this.method20351("module");
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length != 1) {
            throw new Class2332();
        }
        final Module method20352 = this.method20352(array[0].method26314());
        if (method20352 != null) {
            method20352.method9909(!method20352.isEnabled());
            class6428.method19104(method20352.getName() + " was " + (method20352.isEnabled() ? "enabled" : "disabled"));
            return;
        }
        throw new Class2332("Module \"" + array[0].method26314() + "\" not found");
    }
    
    public Module method20352(final String anotherString) {
        for (final Module class3167 : Client.getInstance().moduleManager().getModuleMap().values()) {
            if (!class3167.getName().replace(" ", "").equalsIgnoreCase(anotherString)) {
                continue;
            }
            return class3167;
        }
        return null;
    }
}
