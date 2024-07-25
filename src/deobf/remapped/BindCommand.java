package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import java.util.Map.Entry;
import net.minecraft.util.text.StringTextComponent;

public class BindCommand extends Command {
   public BindCommand() {
      super("bind", "Bind a module to a key");
      this.addArgument(new String[]{"module"});
      this.addArgument(new String[]{"key/none"});
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      Object var6 = null;
      if (var2.length == 0) {
         CommandManager.method_22657(() -> field_18219.method_8609(new class_9743(new StringTextComponent("GuiKeybinds"))));
      }

      if (var2.length < 1) {
         throw new class_2900();
      } else {
         if (var2.length != 1) {
            if (var2.length != 2) {
               if (var2.length > 2) {
                  throw new class_2900("Too many arguments");
               }
            } else {
               var6 = this.method_3683(var2[0].method_24060());
               if (var6 == null || var2[0].method_24063() != class_1451.field_7816) {
                  throw new class_2900("Module " + var2[0].method_24060() + " not found");
               }

               int var14 = this.method_3684(var2[1].method_24060().toLowerCase());
               if (var14 == -2) {
                  throw new class_2900("Key " + var2[1].method_24060() + " not found");
               }

               if (var14 != -1) {
                  SigmaMainClass.getInstance().getModuleManager().method_835().method_368(var14, (Module)var6);
                  var3.method_3731("Key " + var2[1].method_24060() + " was set for module " + ((Module)var6).getName2());
               } else {
                  SigmaMainClass.getInstance().getModuleManager().method_835().method_383(var6);
                  var3.method_3731("Keybind was reset for module " + ((Module)var6).getName2());
               }
            }
         } else {
            var6 = this.method_3683(var2[0].method_24060());
            if (var6 == null || var2[0].method_24063() != class_1451.field_7816) {
               throw new class_2900("Module " + var2[0].method_24060() + " not found");
            }

            String var7 = "key.keyboard.";
            int var8 = SigmaMainClass.getInstance().getModuleManager().method_835().method_381((Module)var6);
            String var9 = null;

            for (Entry var11 : class_3654.field_17801.entrySet()) {
               if (((String)var11.getKey()).startsWith(var7) && ((class_3654)var11.getValue()).field_17800 == var8) {
                  var9 = ((String)var11.getKey()).substring(var7.length());
               }
            }

            if (var9 != null) {
               var3.method_3731(((Module)var6).getName2() + " is bound to : " + var9);
            } else {
               var3.method_3731("§c[Error] " + ((Module)var6).getName2() + " is bound to an unknown key");
            }
         }
      }
   }

   public int method_3684(String var1) {
      if (!var1.equals("none") && !var1.equals("none")) {
         String var4 = "key.keyboard.";

         for (Entry var6 : class_3654.field_17801.entrySet()) {
            if (((String)var6.getKey()).startsWith(var4)) {
               String var7 = ((String)var6.getKey()).substring(var4.length());
               var7 = var7.replace("keypad.", "");
               var7 = var7.replace(".", "_");
               if (var1.equals(var7)) {
                  return ((class_3654)var6.getValue()).field_17800;
               }
            }
         }

         return -2;
      } else {
         return -1;
      }
   }

   public Module method_3683(String var1) {
      for (Module var5 : SigmaMainClass.getInstance().getModuleManager().method_843().values()) {
         if (var5.getName().replace(" ", "").equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return null;
   }
}
