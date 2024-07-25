package remapped;

import jaco.mp3.resources.DecoderException;

public class class_2592 extends class_6364 {
   private static String[] field_12823;
   public int field_12817;
   public float field_12820;
   public int field_12818;
   public float field_12822;
   public float field_12821;
   public float field_12819;

   public class_2592(int var1) {
      super(var1);
   }

   @Override
   public void method_20555(class_8212 var1, class_1915 var2, class_4546 var3) throws DecoderException {
      this.field_32535 = var1.method_37602(4);
      this.field_12817 = var1.method_37602(4);
      if (var3 != null) {
         var3.method_21089(this.field_32535, 4);
         var3.method_21089(this.field_12817, 4);
      }

      if (this.field_32535 != 0) {
         this.field_32531 = this.field_32535 + 1;
         this.field_32532 = field_32533[this.field_32535];
         this.field_32539 = field_32534[this.field_32535];
      }

      if (this.field_12817 != 0) {
         this.field_12818 = this.field_12817 + 1;
         this.field_12821 = field_32533[this.field_12817];
         this.field_12819 = field_32534[this.field_12817];
      }
   }

   @Override
   public void method_20558(class_8212 var1, class_1915 var2) {
      if (this.field_32535 != 0) {
         this.field_32536 = field_21609[var1.method_37602(6)];
      }

      if (this.field_12817 != 0) {
         this.field_12820 = field_21609[var1.method_37602(6)];
      }
   }

   @Override
   public boolean method_20556(class_8212 var1) {
      boolean var4 = super.method_20556(var1);
      if (this.field_12817 != 0) {
         this.field_12822 = (float)var1.method_37602(this.field_12818);
      }

      return var4;
   }

   @Override
   public boolean method_20554(int var1, class_2948 var2, class_2948 var3) {
      super.method_20554(var1, var2, var3);
      if (this.field_12817 != 0 && var1 != 1) {
         float var6 = (this.field_12822 * this.field_12821 + this.field_12819) * this.field_12820;
         if (var1 != 0) {
            var2.method_13496(var6, this.field_32538);
         } else {
            var3.method_13496(var6, this.field_32538);
         }
      }

      return true;
   }
}
