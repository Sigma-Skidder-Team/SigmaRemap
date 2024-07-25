package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class EnchantCommand extends Command {
   public EnchantCommand() {
      super("enchant", "Enchants items in creative mode");
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length == 2) {
         if (var2[1].method_24063() == class_1451.field_7814) {
            if (!field_18219.playerController.method_42149()) {
               class_4382 var6 = null;
               ItemStack var7 = field_18219.thePlayer.method_26446().method_27973();

               for (Identifier var9 : class_8669.field_44445.method_39805()) {
                  if (var2[0].method_24060().equals(var9.method_21456())) {
                     var6 = class_8669.field_44445.method_39806(var9);
                  }
               }

               if (var6 != null) {
                  var7.method_28031(var6, var2[1].method_24059());
                  field_18219.method_8614().sendPacket(new class_6362(36 + field_18219.thePlayer.inventory.field_36404, var7));
                  var3.method_3731("Requested server to apply " + var2[0].method_24060() + " " + var2[1].method_24059());
               } else {
                  throw new class_2900("Unknown enchant '" + var2[0].method_24060() + "");
               }
            } else {
               throw new class_2900("Creative mode only!");
            }
         } else {
            throw new class_2900("Enter a valid enchant value");
         }
      } else {
         throw new class_2900("Too many arguments");
      }
   }
}
