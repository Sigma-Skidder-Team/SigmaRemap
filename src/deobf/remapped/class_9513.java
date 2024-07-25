package remapped;

import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class class_9513 extends class_3599 {
   private static String[] field_48440;
   private static final class_4931 field_48436 = new class_4931().method_22607(8.0).method_22603().method_22601().method_22602();
   public final class_5467 field_48435;
   private final Class<? extends class_5467> field_48434;
   public final World field_48439;
   public class_5467 field_48441;
   private int field_48437;
   private final double field_48438;

   public class_9513(class_5467 var1, double var2) {
      this(var1, var2, (Class<? extends class_5467>)var1.getClass());
   }

   public class_9513(class_5467 var1, double var2, Class<? extends class_5467> var4) {
      this.field_48435 = var1;
      this.field_48439 = var1.field_41768;
      this.field_48434 = var4;
      this.field_48438 = var2;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
   }

   @Override
   public boolean method_16795() {
      if (this.field_48435.method_24875()) {
         this.field_48441 = this.method_43907();
         return this.field_48441 != null;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return this.field_48441.method_37330() && this.field_48441.method_24875() && this.field_48437 < 60;
   }

   @Override
   public void method_16793() {
      this.field_48441 = null;
      this.field_48437 = 0;
   }

   @Override
   public void method_16794() {
      this.field_48435.method_26865().method_17240(this.field_48441, 10.0F, (float)this.field_48435.method_26862());
      this.field_48435.method_26927().method_5616(this.field_48441, this.field_48438);
      this.field_48437++;
      if (this.field_48437 >= 60 && this.field_48435.method_37275(this.field_48441) < 9.0) {
         this.method_43906();
      }
   }

   @Nullable
   private class_5467 method_43907() {
      List var3 = this.field_48439.<class_5467>method_25863(this.field_48434, field_48436, this.field_48435, this.field_48435.method_37241().method_18898(8.0));
      double var4 = Double.MAX_VALUE;
      class_5467 var6 = null;

      for (class_5467 var8 : var3) {
         if (this.field_48435.method_24873(var8) && this.field_48435.method_37275(var8) < var4) {
            var6 = var8;
            var4 = this.field_48435.method_37275(var8);
         }
      }

      return var6;
   }

   public void method_43906() {
      this.field_48435.method_24874((class_6331)this.field_48439, this.field_48441);
   }
}
