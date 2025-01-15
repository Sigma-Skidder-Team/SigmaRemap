// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import net.minecraft.item.ItemStack;

public class Class6692 extends Class6693
{
    public Class6692() {
        super("enchant", "Enchants items in creative mode", new String[0]);
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length != 2) {
            throw new Class2332("Too many arguments");
        }
        if (array[1].method26310() != Class1954.field10637) {
            throw new Class2332("Enter a valid enchant value");
        }
        if (Class6692.field26420.field4682.method27331()) {
            throw new Class2332("Creative mode only!");
        }
        Class6257 class6429 = null;
        final ItemStack method27641 = Class6692.field26420.field4684.method2713().method27641();
        for (final Class1932 class6430 : Class90.field209.method507()) {
            if (!array[0].method26314().equals(class6430.method7797())) {
                continue;
            }
            class6429 = Class90.field209.method505(class6430);
        }
        if (class6429 != null) {
            method27641.method27674(class6429, array[1].method26313());
            Class6692.field26420.method5269().method17292(new Class4287(36 + Class6692.field26420.field4684.field3006.field2743, method27641));
            class6428.method19104("Requested server to apply " + array[0].method26314() + " " + array[1].method26313());
            return;
        }
        throw new Class2332("Unknown enchant '" + array[0].method26314() + "");
    }
}
