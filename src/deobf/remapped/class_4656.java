package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_4656 extends class_4785<class_4656> {
   private final class_460 field_22717;
   private final String field_22715;
   private final String field_22718;
   private final ITextComponent field_22714;

   public class_4656(class_9656 var1, class_460 var2) {
      this.field_22716 = var1;
      this.field_22717 = var2;
      this.field_22715 = var2.method_2206();
      this.field_22718 = var2.method_2203() + " (" + class_9656.method_44572(var2) + ")";
      if (!var2.method_2199()) {
         Object var5;
         if (!var2.method_2197()) {
            var5 = class_9656.method_44566(var2);
         } else {
            var5 = class_9656.method_44561();
         }

         if (var2.method_2200()) {
            var5 = ((ITextComponent)var5).deepCopy().appendString(", ").append(class_9656.method_44573());
         }

         this.field_22714 = (ITextComponent)var5;
      } else {
         this.field_22714 = class_9656.method_44558();
      }
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method_21538(var1, this.field_22717, var2, var4, var3);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      class_9656.method_44571(this.field_22716).method_33482(class_9656.method_44555(this.field_22716).indexOf(this.field_22717));
      return true;
   }

   public void method_21538(class_7966 var1, class_460 var2, int var3, int var4, int var5) {
      String var8;
      if (!this.field_22715.isEmpty()) {
         var8 = this.field_22715;
      } else {
         var8 = class_9656.method_44562() + " " + (var3 + 1);
      }

      class_9656.method_44570(this.field_22716).method_45385(var1, var8, (float)(var4 + 2), (float)(var5 + 1), 16777215);
      class_9656.method_44560(this.field_22716).method_45385(var1, this.field_22718, (float)(var4 + 2), (float)(var5 + 12), 8421504);
      class_9656.method_44556(this.field_22716).method_45378(var1, this.field_22714, (float)(var4 + 2), (float)(var5 + 12 + 10), 8421504);
   }
}
