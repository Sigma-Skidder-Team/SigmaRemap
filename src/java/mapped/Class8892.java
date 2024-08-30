package mapped;

public final class Class8892 {
   private static String[] field40236;
   private final Matrix4f field40237;
   private final Class8967 field40238;

   public Class8892(Matrix4f var1, Class8967 var2) {
      this.field40237 = var1;
      this.field40238 = var2;
   }

   public Matrix4f getMatrix() {
      return this.field40237;
   }

   public Class8967 method32362() {
      return this.field40238;
   }

   @Override
   public String toString() {
      return this.field40237.toString() + this.field40238.toString();
   }

   // $VF: synthetic method
   public static Matrix4f method32363(Class8892 var0) {
      return var0.field40237;
   }

   // $VF: synthetic method
   public static Class8967 method32364(Class8892 var0) {
      return var0.field40238;
   }
}
