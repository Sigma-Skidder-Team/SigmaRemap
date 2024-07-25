package remapped;

import java.util.Optional;
import javax.annotation.Nullable;

public class class_7181 {
   private static String[] field_36926;
   public static final class_7181 field_36927 = new class_7181((Identifier)null);
   private final Identifier field_36924;
   private boolean field_36925;
   private Optional<class_2581> field_36923 = Optional.<class_2581>empty();

   public class_7181(Identifier var1) {
      this.field_36924 = var1;
   }

   public class_7181(class_2581 var1) {
      this.field_36925 = true;
      this.field_36924 = null;
      this.field_36923 = Optional.<class_2581>of(var1);
   }

   public Optional<class_2581> method_32900(class_1626 var1) {
      if (!this.field_36925) {
         if (this.field_36924 != null) {
            this.field_36923 = var1.method_7252(this.field_36924);
         }

         this.field_36925 = true;
      }

      return this.field_36923;
   }

   @Nullable
   public Identifier method_32899() {
      return this.field_36923.<Identifier>map(var0 -> class_2581.method_11749(var0)).orElse(this.field_36924);
   }
}
