package remapped;

public final class class_9419 implements AutoCloseable {
   private static String[] field_48144;
   private final class_1893 field_48143;
   private final class_7962 field_48145;

   public class_9419(class_1893 var1) {
      this.field_48143 = var1;
      this.field_48145 = new class_7962(class_2078::new);
   }

   public class_9352 method_43609(class_9706 var1, String var2, String var3) {
      return new class_9352(this.field_48143, this.field_48145, var1, var2, var3);
   }

   @Override
   public void close() {
      this.field_48145.method_36025();
   }
}
