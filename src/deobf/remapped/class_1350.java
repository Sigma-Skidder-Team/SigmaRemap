package remapped;

public class class_1350 implements class_9420 {
   public class_1350(class_4364 var1) {
      this.field_7370 = var1;
   }

   private class_9420 method_6238(class_1621 var1) {
      Class var4 = this.field_7370.method_20238(var1);
      var1.method_7226(var4);
      return this.field_7370.field_47065.get(var1.method_7221());
   }

   @Override
   public Object method_43611(class_1621 var1) {
      try {
         return this.method_6238(var1).method_43611(var1);
      } catch (class_8665 var5) {
         throw var5;
      } catch (Exception var6) {
         throw new class_8665(
            null, null, "Can't construct a java object for " + var1.method_7232() + "; exception=" + var6.getMessage(), var1.method_7224(), var6
         );
      }
   }

   @Override
   public void method_43612(class_1621 var1, Object var2) {
      try {
         this.method_6238(var1).method_43612(var1, var2);
      } catch (Exception var6) {
         throw new class_8665(
            null,
            null,
            "Can't construct a second step for a java object for " + var1.method_7232() + "; exception=" + var6.getMessage(),
            var1.method_7224(),
            var6
         );
      }
   }
}
