// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.mentalfrostbyte.jello.commands.CommandException;

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
        final Class3167 method20352 = this.method20352(array[0].method26314());
        if (method20352 != null) {
            method20352.method9909(!method20352.method9906());
            class6428.method19104(method20352.method9901() + " was " + (method20352.method9906() ? "enabled" : "disabled"));
            return;
        }
        throw new Class2332("Module \"" + array[0].method26314() + "\" not found");
    }
    
    public Class3167 method20352(final String anotherString) {
        for (final Class3167 class3167 : Class9463.method35173().method35189().method21553().values()) {
            if (!class3167.method9901().replace(" ", "").equalsIgnoreCase(anotherString)) {
                continue;
            }
            return class3167;
        }
        return null;
    }
}
