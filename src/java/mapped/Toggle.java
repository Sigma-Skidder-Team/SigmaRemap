package mapped;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;

public class Toggle extends Command {
   public Toggle() {
      super("toggle", "Toggle a module", "t");
      this.registerSubCommands(new String[]{"module"});
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length != 1) {
         throw new CommandException();
      } else {
         Module var6 = this.method18336(var2[0].method30899());
         if (var6 != null) {
            var6.method15999(!var6.method15996());
            var3.method20327(var6.method15991() + " was " + (!var6.method15996() ? "disabled" : "enabled"));
         } else {
            throw new CommandException("Module \"" + var2[0].method30899() + "\" not found");
         }
      }
   }

   public Module method18336(String var1) {
      for (Module var5 : Client.getInstance().getModuleManager().method14664().values()) {
         if (var5.method15991().replace(" ", "").equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return null;
   }
}
