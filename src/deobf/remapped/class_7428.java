package remapped;

import jaco.mp3.resources.DecoderException;

public class class_7428 extends class_6364 {
   private static String[] field_37901;
   public float field_37900;

   public class_7428(int var1) {
      super(var1);
   }

   @Override
   public void method_20555(class_8212 var1, class_1915 var2, class_4546 var3) throws DecoderException {
      super.method_20555(var1, var2, var3);
   }

   @Override
   public void method_20558(class_8212 var1, class_1915 var2) {
      if (this.field_32535 != 0) {
         this.field_32536 = field_21609[var1.method_37602(6)];
         this.field_37900 = field_21609[var1.method_37602(6)];
      }
   }

   @Override
   public boolean method_20556(class_8212 var1) {
      return super.method_20556(var1);
   }

   @Override
   public boolean method_20554(int var1, class_2948 var2, class_2948 var3) {
      if (this.field_32535 != 0) {
         this.field_32537 = this.field_32537 * this.field_32532 + this.field_32539;
         if (var1 != 0) {
            if (var1 != 1) {
               float var6 = this.field_32537 * this.field_37900;
               var2.method_13496(var6, this.field_32538);
            } else {
               float var8 = this.field_32537 * this.field_32536;
               var2.method_13496(var8, this.field_32538);
            }
         } else {
            float var9 = this.field_32537 * this.field_32536;
            float var7 = this.field_32537 * this.field_37900;
            var2.method_13496(var9, this.field_32538);
            var3.method_13496(var7, this.field_32538);
         }
      }

      return true;
   }
}
