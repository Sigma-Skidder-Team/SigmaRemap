// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import net.minecraft.entity.Entity;

public class Class6708 extends Class6693
{
    private Entity field26436;
    
    public Class6708() {
        super("entitydesync", "Forces a client side entity dismount", "vanish", "riderdesync");
        this.field26436 = null;
        this.method20351("remount/dismount");
    }
    
    @Override
    public void run(final String s, final Class8025[] array, final Class6428 class6428) throws CommandException {
        if (array.length == 0) {
            throw new Class2332();
        }
        if (array.length > 1) {
            throw new Class2332("Too many arguments");
        }
        if (array[0].method26310() != Class1954.field10636) {
            throw new Class2332();
        }
        if (!array[0].method26314().startsWith("d")) {
            if (!array[0].method26314().startsWith("m") && !array[0].method26314().startsWith("r")) {
                throw new Class2332();
            }
            if (this.field26436 == null) {
                throw new Class2332("No entity to remount");
            }
            Class6708.field26420.player.method1778(this.field26436);
            this.field26436.addedToChunk = true;
            class6428.method19104("Remounted entity " + this.field26436.getType().method23367().getUnformattedComponentText());
            this.field26436 = null;
        }
        else {
            if (Class6708.field26420.player.method1920() == null) {
                throw new Class2332("You must be riding an entity to use this command");
            }
            this.field26436 = Class6708.field26420.player.method1920();
            this.field26436.addedToChunk = true;
            Class6708.field26420.player.stopRiding();
            class6428.method19104("Dismounted entity " + this.field26436.getType().method23367().getUnformattedComponentText());
        }
    }
}
