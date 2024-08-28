package mapped;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;


public class Enchant extends Command {
   public Enchant() {
      super("enchant", "Enchants items in creative mode");
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length == 2) {
         if (var2[1].method30895() == Class2193.field14336) {
            if (!mc.field1337.method23151()) {
               Class6069 var6 = null;
               ItemStack var7 = mc.field1339.method3090().copy();

               for (ResourceLocation var9 : Class2348.field16073.method9190()) {
                  if (var2[0].method30899().equals(var9.method8292())) {
                     var6 = Class2348.field16073.method9184(var9);
                  }
               }

               if (var6 != null) {
                  var7.method32162(var6, var2[1].method30898());
                  mc.getClientPlayNetHandler().sendPacket(new Class5514(36 + mc.field1339.field4902.field5443, var7));
                  var3.method20327("Requested server to apply " + var2[0].method30899() + " " + var2[1].method30898());
               } else {
                  throw new CommandException("Unknown enchant '" + var2[0].method30899() + "");
               }
            } else {
               throw new CommandException("Creative mode only!");
            }
         } else {
            throw new CommandException("Enter a valid enchant value");
         }
      } else {
         throw new CommandException("Too many arguments");
      }
   }
}
