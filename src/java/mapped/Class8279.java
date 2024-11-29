package mapped;

public class Class8279 extends Class8280 {
   private static String[] field35573;
   private Class7898 field35574;

   public Class8279() {
   }

   @Override
   public synchronized Class7897 method28941(int var1) {
      if (this.field35574 != null && Class7898.method26470(this.field35574) == var1) {
         return this.field35574;
      } else {
         this.field35574 = new Class7898(var1);
         return this.field35574;
      }
   }
}
