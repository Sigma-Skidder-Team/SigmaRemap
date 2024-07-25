package remapped;

public class class_526 implements Runnable {
   private static String[] field_3203;

   public class_526(class_5519 var1, int var2, long var3, int var5, class_4330 var6, boolean var7) {
      this.field_3201 = var1;
      this.field_3199 = var2;
      this.field_3205 = var3;
      this.field_3202 = var5;
      this.field_3204 = var6;
      this.field_3200 = var7;
   }

   @Override
   public void run() {
      if (this.field_3199 != -1) {
         for (long var3 = this.field_3205; var3 < (long)class_5519.method_24995(this.field_3201); var3 += (long)this.field_3202) {
            class_5519.method_24991(this.field_3201).method_19201(this.field_3204, var3 * class_5519.method_25007(this.field_3201), this.field_3200);
         }
      } else {
         for (long var5 = this.field_3205; var5 < class_5519.method_24996(this.field_3201); var5 += (long)this.field_3202) {
            class_5519.method_24991(this.field_3201).method_19194(this.field_3204, var5 * class_5519.method_25007(this.field_3201), this.field_3200);
         }
      }
   }
}
