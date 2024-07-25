package remapped;

import java.util.List;

public class class_5206 extends class_5986 {
   private static String[] field_26752;
   private final class_1296 field_26753;
   private float field_26754;

   public class_5206(class_1296 var1) {
      super(0, 0, 35, 27, false);
      this.field_26753 = var1;
      this.method_27297(153, 2, 35, 0, class_8002.field_40990);
   }

   public void method_23881(class_1893 var1) {
      class_2716 var4 = var1.field_9632.method_27334();
      List var5 = var4.method_12233(this.field_26753);
      if (var1.field_9632.field_3874 instanceof class_3954) {
         for (class_7735 var7 : var5) {
            for (class_8932 var9 : var7.method_35017(var4.method_5079((class_3954<?>)var1.field_9632.field_3874))) {
               if (var4.method_5081(var9)) {
                  this.field_26754 = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      if (this.field_26754 > 0.0F) {
         float var7 = 1.0F + 0.1F * (float)Math.sin((double)(this.field_26754 / 15.0F * (float) Math.PI));
         class_3542.method_16438();
         class_3542.method_16413((float)(this.field_36670 + 8), (float)(this.field_36674 + 12), 0.0F);
         class_3542.method_16403(1.0F, var7, 1.0F);
         class_3542.method_16413((float)(-(this.field_36670 + 8)), (float)(-(this.field_36674 + 12)), 0.0F);
      }

      class_1893 var11 = class_1893.method_8510();
      var11.method_8577().method_35674(this.field_30492);
      class_3542.method_16491();
      int var8 = this.field_30493;
      int var9 = this.field_30494;
      if (this.field_30498) {
         var8 += this.field_30497;
      }

      if (this.method_32703()) {
         var9 += this.field_30495;
      }

      int var10 = this.field_36670;
      if (this.field_30498) {
         var10 -= 2;
      }

      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.method_9781(var1, var10, this.field_36674, var8, var9, this.field_36671, this.field_36681);
      class_3542.method_16428();
      this.method_23883(var11.method_8511());
      if (this.field_26754 > 0.0F) {
         class_3542.method_16489();
         this.field_26754 -= var4;
      }
   }

   private void method_23883(class_8765 var1) {
      List var4 = this.field_26753.method_5872();
      int var5 = !this.field_30498 ? 0 : -2;
      if (var4.size() != 1) {
         if (var4.size() == 2) {
            var1.method_40284((class_6098)var4.get(0), this.field_36670 + 3 + var5, this.field_36674 + 5);
            var1.method_40284((class_6098)var4.get(1), this.field_36670 + 14 + var5, this.field_36674 + 5);
         }
      } else {
         var1.method_40284((class_6098)var4.get(0), this.field_36670 + 9 + var5, this.field_36674 + 5);
      }
   }

   public class_1296 method_23884() {
      return this.field_26753;
   }

   public boolean method_23882(class_2716 var1) {
      List var4 = var1.method_12233(this.field_26753);
      this.field_36677 = false;
      if (var4 != null) {
         for (class_7735 var6 : var4) {
            if (var6.method_35012() && var6.method_35010()) {
               this.field_36677 = true;
               break;
            }
         }
      }

      return this.field_36677;
   }
}
