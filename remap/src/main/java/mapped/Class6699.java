// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import com.mentalfrostbyte.jello.commands.CommandException;
import net.minecraft.item.ItemStack;

public class Class6699 extends Class6693
{
    public Class6699() {
        super("killpotion", "Gives you a potion to kill creative players!", new String[0]);
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length > 0) {
            throw new Class2332("Too many arguments");
        }
        if (!Class6699.field26420.field4682.method27331()) {
            final ItemStack class6429 = new ItemStack(Items.field31579);
            final Class51 e = new Class51();
            e.method298("Amplifier", 125);
            e.method298("Duration", 2000);
            e.method298("Id", 6);
            final Class52 class6430 = new Class52();
            ((AbstractList<Class51>)class6430).add(e);
            class6429.method27676("CustomPotionEffects", class6430);
            Class6699.field26420.method5269().method17292(new Class4287(36 + Class8639.method29343(), class6429));
            class6428.method19104("Requested server a killpotion!");
            return;
        }
        throw new Class2332("Creative mode only!");
    }
}