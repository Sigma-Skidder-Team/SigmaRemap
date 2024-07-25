package remapped;

public class class_2697 {
   private static String[] field_13216;
   private class_1347[] field_13215 = new class_1347[0];
   private boolean field_13217 = false;

   public void method_12152(class_2344 var1, class_9716 var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      if (this.field_13217) {
         for (int var9 = 0; var9 < this.field_13215.length; var9++) {
            class_1347 var10 = this.field_13215[var9];
            var10.method_6231(var1, var2, var3, var4, var5, var6);
         }
      }
   }

   public boolean method_12156() {
      return this.field_13217;
   }

   public void method_12155(boolean var1) {
      this.field_13217 = var1;
   }

   public class_1347[] method_12157() {
      return this.field_13215;
   }

   public void method_12154(class_1347 var1) {
      this.field_13215 = (class_1347[])class_3111.method_14441(this.field_13215, var1);
   }
}
