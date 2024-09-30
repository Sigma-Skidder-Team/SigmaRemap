package mapped;

import com.mentalfrostbyte.jello.command.CommandType;

public class ChatCommandArguments {
    private final String arguments;

   public ChatCommandArguments(String args) {
      this.arguments = args;
   }

   public CommandType getCommandType() {
      try {
         double var3 = Double.parseDouble(this.arguments);
      } catch (NullPointerException | NumberFormatException var6) {
         return CommandType.TEXT;
      }

      return CommandType.field14336;
   }

   public double method30896() {
      try {
         return Double.parseDouble(this.arguments);
      } catch (NullPointerException | NumberFormatException var4) {
         return 0.0;
      }
   }

   public float method30897() {
      try {
         return (float)Double.parseDouble(this.arguments);
      } catch (NullPointerException | NumberFormatException var4) {
         return 0.0F;
      }
   }

   public int method30898() {
      try {
         return (int)Double.parseDouble(this.arguments);
      } catch (NullPointerException | NumberFormatException var4) {
         return 0;
      }
   }

   public String getArguments() {
      return this.arguments;
   }
}
