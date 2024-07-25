package remapped;

import java.util.Objects;

public class class_8338 implements class_5598 {
   private final class_4639 field_42729;
   private final class_1221 field_42730;
   private final boolean field_42731;
   private final int field_42732;

   public class_8338(class_4639 var1, class_1221 var2, boolean var3, int var4) {
      this.field_42729 = var1;
      this.field_42730 = var2;
      this.field_42731 = var3;
      this.field_42732 = var4;
   }

   public class_4639 method_38399() {
      return this.field_42729;
   }

   @Override
   public class_1221 method_25403() {
      return this.field_42730;
   }

   @Override
   public boolean method_25404() {
      return this.field_42731;
   }

   public int method_38398() {
      return this.field_42732;
   }

   @Override
   public String toString() {
      return "Variant{modelLocation="
         + this.field_42729
         + ", rotation="
         + this.field_42730
         + ", uvLock="
         + this.field_42731
         + ", weight="
         + this.field_42732
         + '}';
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_8338)) {
            return false;
         } else {
            class_8338 var4 = (class_8338)var1;
            return this.field_42729.equals(var4.field_42729)
               && Objects.equals(this.field_42730, var4.field_42730)
               && this.field_42731 == var4.field_42731
               && this.field_42732 == var4.field_42732;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_42729.hashCode();
      var3 = 31 * var3 + this.field_42730.hashCode();
      var3 = 31 * var3 + Boolean.valueOf(this.field_42731).hashCode();
      return 31 * var3 + this.field_42732;
   }
}
