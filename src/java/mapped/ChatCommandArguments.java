package mapped;

public class ChatCommandArguments {
    private final String arguments;

   public ChatCommandArguments(String args) {
      this.arguments = args;
   }

   public Class2193 method30895() {
      try {
         double var3 = Double.parseDouble(this.arguments);
      } catch (NullPointerException | NumberFormatException var6) {
         return Class2193.field14335;
      }

      return Class2193.field14336;
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
