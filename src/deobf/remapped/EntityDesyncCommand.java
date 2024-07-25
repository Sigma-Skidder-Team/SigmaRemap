package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class EntityDesyncCommand extends Command {
   private Entity field_40286 = null;

   public EntityDesyncCommand() {
      super("entitydesync", "Forces a client side entity dismount", "vanish", "riderdesync");
      this.addArgument(new String[]{"remount/dismount"});
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length != 0) {
         if (var2.length <= 1) {
            if (var2[0].method_24063() != class_1451.field_7816) {
               throw new class_2900();
            } else {
               if (!var2[0].method_24060().startsWith("d")) {
                  if (!var2[0].method_24060().startsWith("m") && !var2[0].method_24060().startsWith("r")) {
                     throw new class_2900();
                  }

                  if (this.field_40286 == null) {
                     throw new class_2900("No entity to remount");
                  }

                  field_18219.thePlayer.method_37353(this.field_40286);
                  this.field_40286.field_41727 = true;
                  var3.method_3731("Remounted entity " + this.field_40286.method_37387().method_30464().getUnformattedComponentText());
                  this.field_40286 = null;
               } else {
                  Entity var6 = field_18219.thePlayer.method_37243();
                  if (var6 == null) {
                     throw new class_2900("You must be riding an entity to use this command");
                  }

                  this.field_40286 = field_18219.thePlayer.method_37243();
                  this.field_40286.field_41727 = true;
                  field_18219.thePlayer.method_37390();
                  var3.method_3731("Dismounted entity " + this.field_40286.method_37387().method_30464().getUnformattedComponentText());
               }
            }
         } else {
            throw new class_2900("Too many arguments");
         }
      } else {
         throw new class_2900();
      }
   }
}
