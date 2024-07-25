package remapped;

import java.util.EnumSet;

public class class_1163 extends class_6967 {
   private static String[] field_6591;
   private final class_5583 field_6590;

   public class_1163(class_5583 var1, double var2, int var4) {
      super(var1, var2, var4, 6);
      this.field_6590 = var1;
      this.field_35800 = -2;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9561, class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      return this.field_6590.method_41215() && !this.field_6590.method_41216() && !this.field_6590.method_25365() && super.method_16795();
   }

   @Override
   public void method_16796() {
      super.method_16796();
      this.field_6590.method_41214(false);
   }

   @Override
   public int method_31862(class_4612 var1) {
      return 40;
   }

   @Override
   public void method_16793() {
      super.method_16793();
      this.field_6590.method_25358(false);
   }

   @Override
   public void method_16794() {
      super.method_16794();
      this.field_6590.method_41214(false);
      if (this.method_31860()) {
         if (!this.field_6590.method_25365()) {
            this.field_6590.method_25358(true);
         }
      } else {
         this.field_6590.method_25358(false);
      }
   }

   @Override
   public boolean method_31855(class_4924 var1, BlockPos var2) {
      return var1.method_22548(var2.method_6081()) && var1.method_28262(var2).method_8360().method_29299(class_2351.field_11784);
   }
}
