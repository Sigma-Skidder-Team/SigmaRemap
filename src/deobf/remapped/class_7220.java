package remapped;

public class class_7220 extends class_4785<class_7220> {
   private class_7220(class_4114 var1) {
      this.field_37067 = var1;
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      class_8764 var13 = class_9675.method_44749(this.field_37067.field_20043)
         .method_43905()
         .get(class_9675.method_44749(this.field_37067.field_20043).method_43905().size() - var2 - 1);
      class_2522 var14 = var13.method_40255();
      class_2451 var15 = var14.method_8360().method_10803();
      if (var15 == class_4897.field_25302) {
         if (!var14.method_8350(class_4783.field_23900)) {
            if (var14.method_8350(class_4783.field_23811)) {
               var15 = class_4897.field_24938;
            }
         } else {
            var15 = class_4897.field_24999;
         }
      }

      ItemStack var16 = new ItemStack(var15);
      this.method_33070(var1, var4, var3, var16);
      this.field_37067.field_20043.field_948.method_45378(var1, var15.method_11249(var16), (float)(var4 + 18 + 5), (float)(var3 + 3), 16777215);
      String var17;
      if (var2 != 0) {
         if (var2 != class_9675.method_44749(this.field_37067.field_20043).method_43905().size() - 1) {
            var17 = class_6956.method_31803("createWorld.customize.flat.layer", var13.method_40252());
         } else {
            var17 = class_6956.method_31803("createWorld.customize.flat.layer.bottom", var13.method_40252());
         }
      } else {
         var17 = class_6956.method_31803("createWorld.customize.flat.layer.top", var13.method_40252());
      }

      this.field_37067
         .field_20043
         .field_948
         .method_45385(var1, var17, (float)(var4 + 2 + 213 - this.field_37067.field_20043.field_948.method_45395(var17)), (float)(var3 + 3), 16777215);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         this.field_37067.method_19101(this);
         return true;
      }
   }

   private void method_33070(class_7966 var1, int var2, int var3, ItemStack var4) {
      this.method_33069(var1, var2 + 1, var3 + 1);
      RenderSystem.method_16381();
      if (!var4.method_28022()) {
         this.field_37067.field_20043.field_945.method_40264(var4, var2 + 2, var3 + 2);
      }

      RenderSystem.method_16443();
   }

   private void method_33069(class_7966 var1, int var2, int var3) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      class_4114.method_19103(this.field_37067).method_8577().method_35674(AbstractGui.field_10506);
      AbstractGui.method_9779(var1, var2, var3, this.field_37067.field_20043.method_9777(), 0.0F, 0.0F, 18, 18, 128, 128);
   }
}
