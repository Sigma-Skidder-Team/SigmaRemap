// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import java.util.Collections;

public class Class6709 extends Class6693
{
    public Class6709() {
        super("vclip", "Vertical clip through blocks", new String[] { "vc" });
        this.method20351("offset");
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
            throw new Class2332("Invalid vertical distance \"" + array[0].method26314() + "\"");
        }
        Class6709.field26420.method5269().method17285(new Class4328(Class6709.field26420.field4684.field2395, Class6709.field26420.field4684.field2396 + array[0].method26311(), Class6709.field26420.field4684.field2397, Class6709.field26420.field4684.field2399, Class6709.field26420.field4684.field2400, Collections.emptySet(), (int)(2.147483647E9 * Math.random())));
        class6428.method19104("VClip'd to position " + (Class6709.field26420.field4684.field2396 + array[0].method26311()));
    }
}
