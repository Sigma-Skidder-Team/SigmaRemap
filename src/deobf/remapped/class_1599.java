package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_1599 extends class_2208<class_338> {
   private static final Identifier field_8323 = new Identifier("textures/gui/container/stonecutter.png");
   private float field_8328;
   private boolean field_8327;
   private int field_8326;
   private boolean field_8324;

   public class_1599(class_338 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3);
      var1.method_1570(this::method_7174);
      this.field_10971--;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      super.method_6767(var1, var2, var3, var4);
      this.method_10214(var1, var2, var3);
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      this.method_1183(var1);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.getTextureManager().bindTexture(field_8323);
      int var7 = this.field_10984;
      int var8 = this.field_10962;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
      int var9 = (int)(41.0F * this.field_8328);
      this.method_9781(var1, var7 + 119, var8 + 15 + var9, 176 + (!this.method_7170() ? 12 : 0), 0, 12, 15);
      int var10 = this.field_10984 + 52;
      int var11 = this.field_10962 + 14;
      int var12 = this.field_8326 + 12;
      this.method_7171(var1, var3, var4, var10, var11, var12);
      this.method_7173(var10, var11, var12);
   }

   @Override
   public void method_10214(class_7966 var1, int var2, int var3) {
      super.method_10214(var1, var2, var3);
      if (this.field_8324) {
         int var6 = this.field_10984 + 52;
         int var7 = this.field_10962 + 14;
         int var8 = this.field_8326 + 12;
         List var9 = this.field_10956.method_1568();

         for (int var10 = this.field_8326; var10 < var8 && var10 < this.field_10956.method_1566(); var10++) {
            int var11 = var10 - this.field_8326;
            int var12 = var6 + var11 % 4 * 16;
            int var13 = var7 + var11 / 4 * 18 + 2;
            if (var2 >= var12 && var2 < var12 + 16 && var3 >= var13 && var3 < var13 + 18) {
               this.method_1177(var1, ((class_5638)var9.get(var10)).method_41044(), var2, var3);
            }
         }
      }
   }

   private void method_7171(class_7966 var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var9 = this.field_8326; var9 < var6 && var9 < this.field_10956.method_1566(); var9++) {
         int var10 = var9 - this.field_8326;
         int var11 = var4 + var10 % 4 * 16;
         int var12 = var10 / 4;
         int var13 = var5 + var12 * 18 + 2;
         int var14 = this.field_10973;
         if (var9 != this.field_10956.method_1567()) {
            if (var2 >= var11 && var3 >= var13 && var2 < var11 + 16 && var3 < var13 + 18) {
               var14 += 36;
            }
         } else {
            var14 += 18;
         }

         this.method_9781(var1, var11, var13 - 1, 0, var14, 16, 18);
      }
   }

   private void method_7173(int var1, int var2, int var3) {
      List var6 = this.field_10956.method_1568();

      for (int var7 = this.field_8326; var7 < var3 && var7 < this.field_10956.method_1566(); var7++) {
         int var8 = var7 - this.field_8326;
         int var9 = var1 + var8 % 4 * 16;
         int var10 = var8 / 4;
         int var11 = var2 + var10 * 18 + 2;
         this.field_943.method_8511().method_40274(((class_5638)var6.get(var7)).method_41044(), var9, var11);
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      this.field_8327 = false;
      if (this.field_8324) {
         int var8 = this.field_10984 + 52;
         int var9 = this.field_10962 + 14;
         int var10 = this.field_8326 + 12;

         for (int var11 = this.field_8326; var11 < var10; var11++) {
            int var12 = var11 - this.field_8326;
            double var13 = var1 - (double)(var8 + var12 % 4 * 16);
            double var15 = var3 - (double)(var9 + var12 / 4 * 18);
            if (var13 >= 0.0 && var15 >= 0.0 && var13 < 16.0 && var15 < 18.0 && this.field_10956.method_18886(this.field_943.thePlayer, var11)) {
               MinecraftClient.getInstance().method_8590().method_16345(class_4949.method_22675(class_463.field_2242, 1.0F));
               this.field_943.playerController.method_42154(this.field_10956.field_19925, var11);
               return true;
            }
         }

         var8 = this.field_10984 + 119;
         var9 = this.field_10962 + 9;
         if (var1 >= (double)var8 && var1 < (double)(var8 + 12) && var3 >= (double)var9 && var3 < (double)(var9 + 54)) {
            this.field_8327 = true;
         }
      }

      return super.method_26940(var1, var3, var5);
   }

   @Override
   public boolean method_26944(double var1, double var3, int var5, double var6, double var8) {
      if (this.field_8327 && this.method_7170()) {
         int var12 = this.field_10962 + 14;
         int var13 = var12 + 54;
         this.field_8328 = ((float)var3 - (float)var12 - 7.5F) / ((float)(var13 - var12) - 15.0F);
         this.field_8328 = class_9299.method_42828(this.field_8328, 0.0F, 1.0F);
         this.field_8326 = (int)((double)(this.field_8328 * (float)this.method_7172()) + 0.5) * 4;
         return true;
      } else {
         return super.method_26944(var1, var3, var5, var6, var8);
      }
   }

   @Override
   public boolean method_26945(double var1, double var3, double var5) {
      if (this.method_7170()) {
         int var9 = this.method_7172();
         this.field_8328 = (float)((double)this.field_8328 - var5 / (double)var9);
         this.field_8328 = class_9299.method_42828(this.field_8328, 0.0F, 1.0F);
         this.field_8326 = (int)((double)(this.field_8328 * (float)var9) + 0.5) * 4;
      }

      return true;
   }

   private boolean method_7170() {
      return this.field_8324 && this.field_10956.method_1566() > 12;
   }

   public int method_7172() {
      return (this.field_10956.method_1566() + 4 - 1) / 4 - 3;
   }

   private void method_7174() {
      this.field_8324 = this.field_10956.method_1563();
      if (!this.field_8324) {
         this.field_8328 = 0.0F;
         this.field_8326 = 0;
      }
   }
}
