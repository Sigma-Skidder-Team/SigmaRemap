package remapped;

public class class_774 implements Runnable {
   private static String[] field_4187;

   public class_774(class_8720 var1, long var2, long var4, class_8720 var6, class_8720 var7) {
      this.field_4188 = var1;
      this.field_4186 = var2;
      this.field_4189 = var4;
      this.field_4185 = var6;
      this.field_4184 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_4186; var3 < this.field_4189; var3++) {
         this.field_4185.method_36117(var3, (byte)(this.field_4188.method_36121(var3) & this.field_4184.method_36121(var3)));
      }
   }
}
