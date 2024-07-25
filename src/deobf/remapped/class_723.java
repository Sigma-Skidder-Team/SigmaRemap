package remapped;

public class class_723<T> {
   private final T field_3931;
   public final BlockPos field_3928;
   public final int field_3930;
   public final class_1716 field_3932;

   private class_723(T var1, BlockPos var2, int var3, class_1716 var4) {
      this.field_3931 = (T)var1;
      this.field_3928 = var2;
      this.field_3930 = var3;
      this.field_3932 = var4;
   }

   @Override
   public String toString() {
      return this.field_3931 + ": " + this.field_3928 + ", " + this.field_3930 + ", " + this.field_3932;
   }
}
