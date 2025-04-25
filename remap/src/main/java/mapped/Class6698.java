// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.commands.CommandException;
import java.util.List;

public class Class6698 extends Class6693
{
    public final int field26425 = 7;
    
    public Class6698() {
        super("help", "Show this help dialog", new String[] { "vc" });
        this.method20351("page/command");
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        final List<Class6693> method32668 = Client.getInstance().getCommandManager().method32668();
        final int i = (int)Math.ceil(method32668.size() / 7.0f);
        final int j = (array.length == 1 && array[0].method26310() == Class1954.field10637) ? (array[0].method26313() - 1) : 0;
        if (array.length == 1 && array[0].method26310() == Class1954.field10636) {
            final Class6693 method32669 = Client.getInstance().getCommandManager().method32667(array[0].method26314());
            if (method32669 == null) {
                throw new Class2332();
            }
            class6428.method19104("§f" + method32669.method20347() + "§8" + " > " + "§7" + method32669.method20348());
            if (method32669.method20349().length() <= 0) {
                class6428.method19104("   [no options]");
            }
            else {
                class6428.method19104("   " + method32669.method20349());
            }
        }
        else {
            if (array.length > 1) {
                throw new Class2332();
            }
            if (j + 1 <= i && j >= 0) {
                class6428.method19104("§fHelp:§7 Page " + (j + 1) + "/" + i);
                class6428.method19104("");
                for (int k = 0; k < 7; ++k) {
                    final int n = k + j * 7;
                    if (method32668.size() > n) {
                        final Class6693 class6429 = method32668.get(n);
                        class6428.method19104("§f" + class6429.method20347() + "§8" + " > " + "§7" + class6429.method20348());
                        if (class6429.method20349().length() <= 0) {
                            class6428.method19104("   [no options]");
                        }
                        else {
                            class6428.method19104("   " + class6429.method20349());
                        }
                    }
                }
                return;
            }
            throw new Class2332("Page " + j + " does not exist!");
        }
    }
}
