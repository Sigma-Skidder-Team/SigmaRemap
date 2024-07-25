package remapped;

public class class_7452 implements Runnable {
   private static String[] field_37982;
   private class_9716 field_37981;
   private Identifier field_37979;
   private boolean field_37980;

   public class_7452(class_9716 var1, Identifier var2) {
      this.field_37981 = var1;
      this.field_37979 = var2;
   }

   @Override
   public void run() {
   }

   public class_5797 method_33914(class_5797 var1) {
      class_5797 var4 = class_3773.method_17456(var1);
      this.field_37980 = class_3773.method_17460(var1, var4);
      return var4;
   }

   public void method_33916() {
      if (this.field_37981 != null) {
         this.field_37981.method_44886(this.field_37979);
         this.field_37981.method_44875(this.field_37980);
      }

      this.method_33917();
   }

   public void method_33917() {
      this.field_37981 = null;
   }

   public boolean method_33918() {
      return this.field_37980;
   }
}
