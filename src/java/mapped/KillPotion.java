package mapped;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;


public class KillPotion extends Command {
   public KillPotion() {
      super("killpotion", "Gives you a potion to kill creative players!");
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length <= 0) {
         if (!mc.field1337.method23151()) {
            Class8848 var6 = new Class8848(Class8514.field38115);
            Class39 var7 = new Class39();
            var7.method102("Amplifier", 125);
            var7.method102("Duration", 2000);
            var7.method102("Id", 6);
            Class41 var8 = new Class41();
            var8.add(var7);
            var6.method32164("CustomPotionEffects", var8);
            mc.getClientPlayNetHandler().sendPacket(new Class5514(36 + Class7789.method25846(), var6));
            var3.method20327("Requested server a killpotion!");
         } else {
            throw new CommandException("Creative mode only!");
         }
      } else {
         throw new CommandException("Too many arguments");
      }
   }
}
