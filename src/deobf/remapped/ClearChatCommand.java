package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class ClearChatCommand extends Command {
   public ClearChatCommand() {
      super("clearchat", "Clears your chat client side", "cc", "chatclear");
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length <= 0) {
         field_18219.field_9614.method_13991().method_18690(true);
      } else {
         throw new class_2900("Too many arguments");
      }
   }
}
