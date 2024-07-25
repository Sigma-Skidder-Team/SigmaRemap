package remapped;

public class class_1807 implements Runnable {
   private static String[] field_9201;

   public class_1807(class_5519 var1, int var2, int var3, float[][] var4, boolean var5) {
      this.field_9196 = var1;
      this.field_9197 = var2;
      this.field_9198 = var3;
      this.field_9199 = var4;
      this.field_9200 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_9197; var3 < this.field_9198; var3++) {
         class_5519.method_24991(this.field_9196).method_19204(this.field_9199[var3], this.field_9200);
      }
   }
}
