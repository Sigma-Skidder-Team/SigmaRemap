package remapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3884 {
   private static final Logger field_18903 = LogManager.getLogger();
   private final class_2335 field_18905;
   private final class_9783 field_18902;
   private final int field_18899;
   private final int field_18904;
   private final int field_18901;

   public class_3884(int var1, class_2335 var2, class_9783 var3, int var4) {
      if (!this.method_17953(var1, var3)) {
         field_18903.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
         this.field_18902 = class_9783.field_49659;
      } else {
         this.field_18902 = var3;
      }

      this.field_18905 = var2;
      this.field_18899 = var1;
      this.field_18904 = var4;
      this.field_18901 = var2.method_10685() * this.field_18904;
   }

   private boolean method_17953(int var1, class_9783 var2) {
      return var1 == 0 || var2 == class_9783.field_49659;
   }

   public final class_2335 method_17954() {
      return this.field_18905;
   }

   public final class_9783 method_17959() {
      return this.field_18902;
   }

   public final int method_17960() {
      return this.field_18899;
   }

   @Override
   public String toString() {
      return this.field_18904 + "," + this.field_18902.method_45168() + "," + this.field_18905.method_10686();
   }

   public final int method_17961() {
      return this.field_18901;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_3884 var4 = (class_3884)var1;
            if (this.field_18904 != var4.field_18904) {
               return false;
            } else if (this.field_18899 != var4.field_18899) {
               return false;
            } else {
               return this.field_18905 == var4.field_18905 ? this.field_18902 == var4.field_18902 : false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_18905.hashCode();
      var3 = 31 * var3 + this.field_18902.hashCode();
      var3 = 31 * var3 + this.field_18899;
      return 31 * var3 + this.field_18904;
   }

   public void method_17956(long var1, int var3) {
      class_9783.method_45169(this.field_18902, this.field_18904, this.field_18905.method_10687(), var3, var1, this.field_18899);
   }

   public void method_17957() {
      this.field_18902.method_45167(this.field_18899);
   }

   public final int method_17958() {
      return this.field_18904;
   }
}
