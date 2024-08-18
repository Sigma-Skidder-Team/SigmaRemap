package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class ToggleCommand extends Command {
   public ToggleCommand() {
      super("toggle", "Toggle a module", "t");
      this.addArgument(new String[]{"module"});
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length != 1) {
         throw new class_2900();
      } else {
         Module var6 = this.method_21895(var2[0].method_24060());
         if (var6 != null) {
            var6.setEnabled2(!var6.isEnabled());
            var3.method_3731(var6.getName() + " was " + (!var6.isEnabled() ? "disabled" : "enabled"));
         } else {
            throw new class_2900("Module \"" + var2[0].method_24060() + "\" not found");
         }
      }
   }

   public Module method_21895(String var1) {
      for (Module var5 : SigmaMainClass.getInstance().getModuleManager().getModuleMap().values()) {
         if (var5.getName().replace(" ", "").equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return null;
   }
}
