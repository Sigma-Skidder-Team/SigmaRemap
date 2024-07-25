package remapped;

import java.util.Date;

public class class_6738 extends class_1859 {
   public float field_34784;
   public class_1226 field_34787;
   public Date field_34788;
   public int field_34785;
   public Date field_34789;
   public class_9635 field_34783;

   public class_6738(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_1226 var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method_32148(this.field_34783 = new class_9635(this, "delete", 200, 20, 20, 20));
      this.field_34783.method_32100((var1x, var2x) -> {
         this.field_34788 = new Date();
         this.method_8235();
      });
      this.field_34787 = var7;
      this.field_34785 = var8;
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   public void method_30882() {
      this.method_32158(0);
      this.field_34789 = new Date();
   }

   @Override
   public void method_32178(float var1) {
      if (this.field_34789 != null) {
         float var4 = class_2440.method_11124(this.field_34789, 150.0F);
         var4 = class_9681.method_44756(var4, 0.0F, 1.0F, 1.0F);
         this.method_32158((int)(55.0F * var4));
         if (var4 == 1.0F) {
            this.field_34789 = null;
         }
      }

      if (this.field_34788 != null) {
         float var6 = class_2440.method_11124(this.field_34788, 180.0F);
         var6 = class_9681.method_44756(var6, 0.0F, 1.0F, 1.0F);
         this.method_32158((int)(55.0F * (1.0F - var6)));
         if (var6 == 1.0F) {
            this.field_34788 = null;
         }
      }

      class_73.method_150(this.field_36270, this.field_36261, this.field_36270 + this.field_36278, this.field_36261 + this.field_36257, true);
      class_73.method_87(
         class_5320.field_27154,
         (float)(this.field_36270 + 25),
         (float)this.field_36261 + (float)this.field_36257 / 2.0F - 17.5F,
         this.field_34787.method_5460(),
         class_314.method_1444(class_1255.field_6929.field_6917, 0.6F * var1)
      );
      class_73.method_87(
         class_5320.field_27145,
         (float)(this.field_36270 + 25),
         (float)this.field_36261 + (float)this.field_36257 / 2.0F + 7.5F,
         this.field_34787.method_5461(),
         class_314.method_1444(class_1255.field_6929.field_6917, 0.6F * var1)
      );
      this.field_34783.method_32117((int)((float)this.field_36257 / 2.0F - 7.5F));
      super.method_32178(var1);
      class_73.method_141();
   }
}
