package remapped;

import javax.annotation.Nullable;

public class class_7079 extends class_8143 {
   private static String[] field_36558;
   private final class_4639 field_36557;
   private final class_3581 field_36559;
   private final class_3581 field_36556;
   private final boolean field_36560;
   private final class_4673 field_36555;

   public class_7079(class_4639 var1, boolean var2) {
      this.field_36557 = var1;
      this.field_36560 = var2;
      this.field_36555 = new class_4673(0, 0, 256, 256, null);
      class_4970.method_22842(!var2 ? class_2757.field_13479 : class_2757.field_13482, this.method_37055(), 256, 256);
      this.field_36559 = class_3581.method_16732(var1);
      this.field_36556 = class_3581.method_16752(var1);
   }

   @Override
   public void method_37053(class_7832 var1) {
   }

   @Override
   public void close() {
      this.method_37052();
   }

   @Nullable
   public class_6938 method_32577(class_3354 var1) {
      if (var1.method_15370() == this.field_36560) {
         class_4673 var4 = this.field_36555.method_21618(var1);
         if (var4 == null) {
            return null;
         } else {
            this.method_37048();
            var1.method_15364(class_4673.method_21620(var4), class_4673.method_21621(var4));
            float var5 = 256.0F;
            float var6 = 256.0F;
            float var7 = 0.01F;
            return new class_6938(
               this.field_36559,
               this.field_36556,
               ((float)class_4673.method_21620(var4) + 0.01F) / 256.0F,
               ((float)class_4673.method_21620(var4) - 0.01F + (float)var1.method_15371()) / 256.0F,
               ((float)class_4673.method_21621(var4) + 0.01F) / 256.0F,
               ((float)class_4673.method_21621(var4) - 0.01F + (float)var1.method_15366()) / 256.0F,
               var1.method_15367(),
               var1.method_15369(),
               var1.method_15368(),
               var1.method_15363()
            );
         }
      } else {
         return null;
      }
   }

   public class_4639 method_32578() {
      return this.field_36557;
   }
}
