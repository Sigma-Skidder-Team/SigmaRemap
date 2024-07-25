package remapped;

public final class class_249 {
   public final long field_886;
   public final class_7059 field_885 = new class_7059();
   public boolean field_883;
   public boolean field_888;
   private final class_4131 field_884 = new class_6626(this);
   private final class_5322 field_887 = new class_6376(this);

   public class_249(long var1) {
      if (var1 >= 1L) {
         this.field_886 = var1;
      } else {
         throw new IllegalArgumentException("maxBufferSize < 1: " + var1);
      }
   }

   public class_5322 method_1088() {
      return this.field_887;
   }

   public class_4131 method_1089() {
      return this.field_884;
   }
}
