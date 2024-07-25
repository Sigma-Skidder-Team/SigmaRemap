package remapped;

public final class class_5803 implements Runnable {
   private static String[] field_29301;

   public class_5803(long var1, long var3, class_878 var5, long var6, class_878 var8, long var9) {
      this.field_29304 = var1;
      this.field_29303 = var3;
      this.field_29306 = var5;
      this.field_29305 = var6;
      this.field_29302 = var8;
      this.field_29307 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_29304; var3 < this.field_29303; var3++) {
         this.field_29306.method_36131(this.field_29305 + var3, this.field_29302.method_36076(this.field_29307 + var3));
      }
   }
}
