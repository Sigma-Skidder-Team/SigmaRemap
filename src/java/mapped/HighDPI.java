package mapped;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;

import com.mentalfrostbyte.jello.Client;
import net.minecraft.client.Minecraft;

public class HighDPI extends Command {
   public HighDPI() {
      super("highdpi", "Toggles macOS HiDPI, Needs mc restart.", "hidpi");
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length <= 0) {
         if (Minecraft.IS_RUNNING_ON_MAC) {
            if (!Client.getInstance().getGuiManager().method33474()) {
               var3.method20327("HighDPI was enabled!");
            } else {
               var3.method20327("HighDPI was disabled!");
            }

            Client.getInstance().getGuiManager().method33473(!Client.getInstance().getGuiManager().method33474());
         } else {
            throw new CommandException("This feature is only available on macOS!");
         }
      } else {
         throw new CommandException("Too many arguments");
      }
   }
}
