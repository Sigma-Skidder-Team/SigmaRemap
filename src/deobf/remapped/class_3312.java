package remapped;

public class class_3312 extends class_1174 {
   private static String[] field_16371;
   private int field_16367;
   private String field_16368;
   private String field_16369;
   private long field_16370;

   public class_3312(class_1455 var1) {
      super(var1);
   }

   public void method_15189() {
      if (this.field_16369 != null && this.field_16370 <= System.currentTimeMillis()) {
         class_5051 var3 = new class_5051(1, null, this.method_5205());
         var3.method_23236(class_8039.field_41171, this.field_16369);
         var3.method_23236(class_8039.field_41161, false);
         var3.method_23236(class_8039.field_41140, null);

         try {
            var3.method_23263(class_8633.class);
         } catch (Exception var5) {
            var5.printStackTrace();
         }

         this.field_16369 = null;
      }
   }

   public int method_15185() {
      return this.field_16367;
   }

   public void method_15187(int var1) {
      this.field_16367 = var1;
   }

   public String method_15190() {
      return this.field_16368;
   }

   public void method_15191(String var1) {
      this.field_16368 = var1;
   }

   public String method_15186() {
      return this.field_16369;
   }

   public void method_15192(String var1) {
      this.field_16369 = var1;
   }

   public long method_15188() {
      return this.field_16370;
   }

   public void method_15193(long var1) {
      this.field_16370 = var1;
   }
}
