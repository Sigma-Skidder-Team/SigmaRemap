package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import java.util.List;

public class HelpCommand extends Command {
   public final int field_30335 = 7;

   public HelpCommand() {
      super("help", "Show this help dialog", "vc");
      this.addArgument(new String[]{"page/command"});
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      List var6 = SigmaMainClass.getInstance().getCommandManager().getCommandList();
      int var7 = (int)Math.ceil((double)((float)var6.size() / 7.0F));
      int var8 = var2.length == 1 && var2[0].method_24063() == class_1451.field_7814 ? var2[0].method_24059() - 1 : 0;
      if (var2.length == 1 && var2[0].method_24063() == class_1451.field_7816) {
         Command var12 = SigmaMainClass.getInstance().getCommandManager().getCommandByName(var2[0].method_24060());
         if (var12 == null) {
            throw new class_2900();
         } else {
            var3.method_3731("§f" + var12.method_17258() + "§8" + " > " + "§7" + var12.method_17256());
            if (var12.method_17255().length() <= 0) {
               var3.method_3731("   [no options]");
            } else {
               var3.method_3731("   " + var12.method_17255());
            }
         }
      } else if (var2.length <= 1) {
         if (var8 + 1 <= var7 && var8 >= 0) {
            var3.method_3731("§fHelp:§7 Page " + (var8 + 1) + "/" + var7);
            var3.method_3731("");

            for (int var9 = 0; var9 < 7; var9++) {
               int var10 = var9 + var8 * 7;
               if (var6.size() > var10) {
                  Command var11 = (Command)var6.get(var10);
                  var3.method_3731("§f" + var11.method_17258() + "§8" + " > " + "§7" + var11.method_17256());
                  if (var11.method_17255().length() <= 0) {
                     var3.method_3731("   [no options]");
                  } else {
                     var3.method_3731("   " + var11.method_17255());
                  }
               }
            }
         } else {
            throw new class_2900("Page " + var8 + " does not exist!");
         }
      } else {
         throw new class_2900();
      }
   }
}
