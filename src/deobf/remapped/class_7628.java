package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_7628 extends class_446 {
   private static String[] field_38820;
   public float field_38818 = 0.0F;
   public class_3246 field_38819 = class_3246.field_16133;
   public final int field_38817 = 0;
   public final List<class_6220> field_38815 = new ArrayList<class_6220>();
   private class_8343 field_38816;

   public class_7628(class_7038 var1, String var2) {
      super(var1, var2, 0, MinecraftClient.getInstance().window.method_43163() - 70, MinecraftClient.getInstance().window.method_43166(), 110, false);
      this.method_32187(true);
      this.method_32105(false);
   }

   public float method_34576() {
      return 1.0F - this.field_38818;
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      byte var5 = 20;
      if (this.field_38819 == class_3246.field_16133
         && Math.abs(MinecraftClient.getInstance().window.method_43163() - var2) < var5
         && !this.field_36283.method_32116(((JelloMenu)this.field_36283).field_4006)) {
         this.field_38819 = class_3246.field_16135;
      }

      float var6 = 0.05F;
      this.field_38818 = this.field_38818 + (this.field_38819 != class_3246.field_16135 ? (this.field_38819 != class_3246.field_16137 ? 0.0F : -var6) : var6);
      if (!(this.field_38818 >= 1.0F)) {
         if (this.field_38818 <= 0.0F) {
            this.field_38818 = 0.0F;
            this.field_38819 = class_3246.field_16133;
         }
      } else {
         this.field_38818 = 1.0F;
         this.field_38819 = class_3246.field_16133;
      }

      if (MinecraftClient.getInstance().window.method_43163() - var2 > this.method_32137()) {
         this.field_38819 = class_3246.field_16137;
      }

      float var7 = class_9556.method_44073(this.field_38818, 0.0F, 1.0F, 1.0F);
      if (this.field_38819 == class_3246.field_16137) {
         var7 = class_9556.method_44078(this.field_38818, 0.0F, 1.0F, 1.0F);
      }

      this.method_32117(MinecraftClient.getInstance().window.method_43163() - (int)((float)this.method_32137() * var7));
   }

   @Override
   public void method_32178(float var1) {
      byte var4 = 20;
      if (!((double)var1 < 0.6)) {
         class_73.method_115(
            this.field_36270 + var4,
            this.field_36261 + var4,
            this.field_36278 - var4 * 2,
            this.field_36257 - var4 * 2,
            class_314.method_1444(class_1255.field_6918.field_6917, 0.9F * var1)
         );
         super.method_32178(var1);
      }
   }
}
