package mapped;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;


public class ClearChat extends Command {
   public ClearChat() {
      super("clearchat", "Clears your chat client side", "cc", "chatclear");
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length <= 0) {
         mc.field1298.method5989().method5929(true);
      } else {
         throw new CommandException("Too many arguments");
      }
   }
}
