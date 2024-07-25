package remapped;

import java.util.Optional;
import javax.annotation.Nullable;

public class class_2825 extends class_4855<class_803> {
   private static String[] field_13857;

   public class_2825(class_1893 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.field_40880 = false;
   }

   public int method_12852(class_1013 var1) {
      return this.method_36202(class_803.method_3548(this.field_40883.field_9577, this.field_40891, var1));
   }

   public void method_12853(class_1013 var1, class_1013 var2) {
      this.method_36202(class_803.method_3549(this.field_40883.field_9577, this.field_40891, var1, var2));
   }

   public void method_12856(class_1013[] var1) {
      for (byte var4 = 0; var4 < var1.length; var4 += 2) {
         this.method_12853(var1[var4], var4 >= var1.length - 1 ? null : var1[var4 + 1]);
      }
   }

   @Override
   public int method_36195() {
      return 400;
   }

   @Override
   public int method_36191() {
      return super.method_36191() + 32;
   }

   @Nullable
   public class_7114 method_12854(class_1013 var1) {
      for (class_803 var5 : this.method_41183()) {
         for (class_7114 var7 : class_803.method_3550(var5)) {
            if (var7 instanceof class_2116 && ((class_2116)var7).method_9911() == var1) {
               return var7;
            }
         }
      }

      return null;
   }

   public Optional<class_7114> method_12855(double var1, double var3) {
      for (class_803 var8 : this.method_41183()) {
         for (class_7114 var10 : class_803.method_3550(var8)) {
            if (var10.method_26937(var1, var3)) {
               return Optional.<class_7114>of(var10);
            }
         }
      }

      return Optional.<class_7114>empty();
   }
}
