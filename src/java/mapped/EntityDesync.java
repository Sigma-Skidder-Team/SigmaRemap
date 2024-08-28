package mapped;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;


public class EntityDesync extends Command {
   private Entity field25711 = null;

   public EntityDesync() {
      super("entitydesync", "Forces a client side entity dismount", "vanish", "riderdesync");
      this.registerSubCommands(new String[]{"remount/dismount"});
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length != 0) {
         if (var2.length <= 1) {
            if (var2[0].method30895() != Class2193.field14335) {
               throw new CommandException();
            } else {
               if (!var2[0].method30899().startsWith("d")) {
                  if (!var2[0].method30899().startsWith("m") && !var2[0].method30899().startsWith("r")) {
                     throw new CommandException();
                  }

                  if (this.field25711 == null) {
                     throw new CommandException("No entity to remount");
                  }

                  mc.field1339.method3311(this.field25711);
                  this.field25711.field5071 = true;
                  var3.method20327("Remounted entity " + this.field25711.method3204().method33211().getUnformattedComponentText());
                  this.field25711 = null;
               } else {
                  Entity var6 = mc.field1339.getRidingEntity();
                  if (var6 == null) {
                     throw new CommandException("You must be riding an entity to use this command");
                  }

                  this.field25711 = mc.field1339.getRidingEntity();
                  this.field25711.field5071 = true;
                  mc.field1339.method2759();
                  var3.method20327("Dismounted entity " + this.field25711.method3204().method33211().getUnformattedComponentText());
               }
            }
         } else {
            throw new CommandException("Too many arguments");
         }
      } else {
         throw new CommandException();
      }
   }
}
