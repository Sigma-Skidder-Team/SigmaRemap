package remapped;

public class class_4859 {
   private final Identifier field_24200;
   private ClientWorld field_24199;
   private class_6325 field_24201;
   private static MinecraftClient field_24202 = MinecraftClient.getInstance();

   private class_4859(Identifier var1) {
      this.field_24200 = var1;
      this.field_24199 = field_24202.theWorld;
      this.method_22351();
   }

   private void method_22351() {
      this.field_24201 = null;
      class_8669 var3 = class_5630.method_25512(this.field_24199);
      if (var3.method_39814(this.field_24200)) {
         this.field_24201 = (class_6325)var3.method_39806(this.field_24200);
      }
   }

   public class_6325 method_22350() {
      if (this.field_24199 != field_24202.theWorld) {
         this.field_24199 = field_24202.theWorld;
         this.method_22351();
      }

      return this.field_24201;
   }

   public Identifier method_22352() {
      return this.field_24200;
   }

   @Override
   public String toString() {
      return "" + this.field_24200;
   }

   public static class_4859 method_22353(Identifier var0) {
      class_4859 var3 = new class_4859(var0);
      return var3.field_24201 != null ? var3 : null;
   }
}
