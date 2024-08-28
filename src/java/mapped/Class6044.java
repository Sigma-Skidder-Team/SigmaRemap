package mapped;

public class Class6044 extends Class6037 {
   private static String[] field26239;
   private long field26261 = 0L;
   private Class9695 field26262 = null;

   public Class6044(Class7161 var1) {
      super(var1);
   }

   public boolean method18717(int var1) {
      return System.currentTimeMillis() > this.field26261 + (long)var1;
   }

   public void method18718() {
      this.field26261 = System.currentTimeMillis();
   }

   public long method18719() {
      return this.field26261;
   }

   public Class9695 method18720() {
      return this.field26262;
   }

   public void method18721(Class9695 var1) {
      this.field26262 = var1;
   }
}
