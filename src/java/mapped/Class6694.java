// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class Class6694 extends Class6693
{
    public Class6694() {
        super("damage", "Damages you", new String[] { "dmg" });
        this.method20351("hearts");
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length == 0) {
            throw new Class2332();
        }
        if (array.length > 1) {
            throw new Class2332("Too many arguments");
        }
        if (array[0].method26310() != Class1954.field10637) {
            throw new Class2332("Invalid heart damage amount \"" + array[0].method26314() + "\"");
        }
        for (int n = 0; n < 80.0 + 40.0 * (array[0].method26311() - 0.5); ++n) {
            Class6694.field26420.method5269().method17292(new Class4354(Class6694.field26420.field4684.field2395, Class6694.field26420.field4684.field2396 + 0.06, Class6694.field26420.field4684.field2397, false));
            Class6694.field26420.method5269().method17292(new Class4354(Class6694.field26420.field4684.field2395, Class6694.field26420.field4684.field2396, Class6694.field26420.field4684.field2397, false));
        }
        Class6694.field26420.method5269().method17292(new Class4354(Class6694.field26420.field4684.field2395, Class6694.field26420.field4684.field2396, Class6694.field26420.field4684.field2397, false));
        Class6694.field26420.method5269().method17292(new Class4354(Class6694.field26420.field4684.field2395, Class6694.field26420.field4684.field2396 + 0.02, Class6694.field26420.field4684.field2397, false));
        class6428.method19104("Sent damage packets");
    }
}
