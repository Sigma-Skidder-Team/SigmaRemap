package mapped;

public class Class8623 {
   private static String[] field38764;
   private final String field38765;

   public Class8623(String var1) {
      this.field38765 = var1;
   }

   public Class2193 method30895() {
      try {
         double var3 = Double.parseDouble(this.field38765);
      } catch (NullPointerException | NumberFormatException var6) {
         return Class2193.field14335;
      }

      return Class2193.field14336;
   }

   public double method30896() {
      try {
         return Double.parseDouble(this.field38765);
      } catch (NullPointerException | NumberFormatException var4) {
         return 0.0;
      }
   }

   public float method30897() {
      try {
         return (float)Double.parseDouble(this.field38765);
      } catch (NullPointerException | NumberFormatException var4) {
         return 0.0F;
      }
   }

   public int method30898() {
      try {
         return (int)Double.parseDouble(this.field38765);
      } catch (NullPointerException | NumberFormatException var4) {
         return 0;
      }
   }

   public String method30899() {
      return this.field38765;
   }
}
