package remapped;

import java.util.Comparator;
import javax.annotation.Nullable;

public class class_8274 {
   public static final Comparator<class_8274> field_42431 = (var0, var1) -> {
      if (var0.method_38146() <= var1.method_38146()) {
         return var0.method_38146() >= var1.method_38146() ? var1.method_38147().compareToIgnoreCase(var0.method_38147()) : -1;
      } else {
         return 1;
      }
   };
   private final class_1097 field_42437;
   private final class_4399 field_42434;
   private final String field_42432;
   private int field_42433;
   private boolean field_42436;
   private boolean field_42435;

   public class_8274(class_1097 var1, class_4399 var2, String var3) {
      this.field_42437 = var1;
      this.field_42434 = var2;
      this.field_42432 = var3;
      this.field_42436 = true;
      this.field_42435 = true;
   }

   public void method_38142(int var1) {
      if (!this.field_42434.method_20491().method_31258()) {
         this.method_38140(this.method_38146() + var1);
      } else {
         throw new IllegalStateException("Cannot modify read-only score");
      }
   }

   public void method_38145() {
      this.method_38142(1);
   }

   public int method_38146() {
      return this.field_42433;
   }

   public void method_38143() {
      this.method_38140(0);
   }

   public void method_38140(int var1) {
      int var4 = this.field_42433;
      this.field_42433 = var1;
      if (var4 != var1 || this.field_42435) {
         this.field_42435 = false;
         this.method_38144().method_4868(this);
      }
   }

   @Nullable
   public class_4399 method_38149() {
      return this.field_42434;
   }

   public String method_38147() {
      return this.field_42432;
   }

   public class_1097 method_38144() {
      return this.field_42437;
   }

   public boolean method_38148() {
      return this.field_42436;
   }

   public void method_38141(boolean var1) {
      this.field_42436 = var1;
   }
}
