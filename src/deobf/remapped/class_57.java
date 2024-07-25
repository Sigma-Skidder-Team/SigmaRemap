package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_57 extends class_2208<class_6415> {
   private static final Identifier field_48 = new Identifier("textures/gui/container/villager2.png");
   private static final ITextComponent field_46 = new TranslationTextComponent("merchant.trades");
   private static final ITextComponent field_51 = new StringTextComponent(" - ");
   private static final ITextComponent field_43 = new TranslationTextComponent("merchant.deprecated");
   private int field_47;
   private final class_9307[] field_45 = new class_9307[7];
   private int field_50;
   private boolean field_49;

   public class_57(class_6415 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.field_10981 = 276;
      this.field_10960 = 107;
   }

   private void method_16() {
      this.field_10956.method_29323(this.field_47);
      this.field_10956.method_29313(this.field_47);
      this.field_943.method_8614().sendPacket(new class_7028(this.field_47));
   }

   @Override
   public void method_1163() {
      super.method_1163();
      int var3 = (this.field_941 - this.field_10981) / 2;
      int var4 = (this.field_940 - this.field_10973) / 2;
      int var5 = var4 + 16 + 2;

      for (int var6 = 0; var6 < 7; var6++) {
         this.field_45[var6] = this.<class_9307>method_1186(new class_9307(this, var3 + 5, var5, var6, var1 -> {
            if (var1 instanceof class_9307) {
               this.field_47 = ((class_9307)var1).method_42966() + this.field_50;
               this.method_16();
            }
         }));
         var5 += 20;
      }
   }

   @Override
   public void method_10221(class_7966 var1, int var2, int var3) {
      int var6 = this.field_10956.method_29315();
      if (var6 > 0 && var6 <= 5 && this.field_10956.method_29311()) {
         IFormattableTextComponent var7 = this.field_947.deepCopy().append(field_51).append(new TranslationTextComponent("merchant.level." + var6));
         int var8 = this.field_948.method_45379(var7);
         int var9 = 49 + this.field_10981 / 2 - var8 / 2;
         this.field_948.method_45378(var1, var7, (float)var9, 6.0F, 4210752);
      } else {
         this.field_948.method_45378(var1, this.field_947, (float)(49 + this.field_10981 / 2 - this.field_948.method_45379(this.field_947) / 2), 6.0F, 4210752);
      }

      this.field_948.method_45378(var1, this.field_10967.method_19839(), (float)this.field_10960, (float)this.field_10958, 4210752);
      int var10 = this.field_948.method_45379(field_46);
      this.field_948.method_45378(var1, field_46, (float)(5 - var10 / 2 + 48), 6.0F, 4210752);
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.getTextureManager().bindTexture(field_48);
      int var7 = (this.field_941 - this.field_10981) / 2;
      int var8 = (this.field_940 - this.field_10973) / 2;
      method_9779(var1, var7, var8, this.method_9777(), 0.0F, 0.0F, this.field_10981, this.field_10973, 256, 512);
      class_2795 var9 = this.field_10956.method_29312();
      if (!var9.isEmpty()) {
         int var10 = this.field_47;
         if (var10 < 0 || var10 >= var9.size()) {
            return;
         }

         class_8014 var11 = var9.get(var10);
         if (var11.method_36378()) {
            this.field_943.getTextureManager().bindTexture(field_48);
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            method_9779(var1, this.field_10984 + 83 + 99, this.field_10962 + 35, this.method_9777(), 311.0F, 0.0F, 28, 21, 256, 512);
         }
      }
   }

   private void method_18(class_7966 var1, int var2, int var3, class_8014 var4) {
      this.field_943.getTextureManager().bindTexture(field_48);
      int var7 = this.field_10956.method_29315();
      int var8 = this.field_10956.method_29324();
      if (var7 < 5) {
         method_9779(var1, var2 + 136, var3 + 16, this.method_9777(), 0.0F, 186.0F, 102, 5, 256, 512);
         int var9 = class_3047.method_13908(var7);
         if (var8 >= var9 && class_3047.method_13907(var7)) {
            byte var10 = 100;
            float var11 = 100.0F / (float)(class_3047.method_13905(var7) - var9);
            int var12 = Math.min(class_9299.method_42848(var11 * (float)(var8 - var9)), 100);
            method_9779(var1, var2 + 136, var3 + 16, this.method_9777(), 0.0F, 191.0F, var12 + 1, 5, 256, 512);
            int var13 = this.field_10956.method_29320();
            if (var13 > 0) {
               int var14 = Math.min(class_9299.method_42848((float)var13 * var11), 100 - var12);
               method_9779(var1, var2 + 136 + var12 + 1, var3 + 16 + 1, this.method_9777(), 2.0F, 182.0F, var14, 3, 256, 512);
            }
         }
      }
   }

   private void method_21(class_7966 var1, int var2, int var3, class_2795 var4) {
      int var7 = var4.size() + 1 - 7;
      if (var7 <= 1) {
         method_9779(var1, var2 + 94, var3 + 18, this.method_9777(), 6.0F, 199.0F, 6, 27, 256, 512);
      } else {
         int var8 = 139 - (27 + (var7 - 1) * 139 / var7);
         int var9 = 1 + var8 / var7 + 139 / var7;
         byte var10 = 113;
         int var11 = Math.min(113, this.field_50 * var9);
         if (this.field_50 == var7 - 1) {
            var11 = 113;
         }

         method_9779(var1, var2 + 94, var3 + 18 + var11, this.method_9777(), 0.0F, 199.0F, 6, 27, 256, 512);
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      super.method_6767(var1, var2, var3, var4);
      class_2795 var7 = this.field_10956.method_29312();
      if (!var7.isEmpty()) {
         int var8 = (this.field_941 - this.field_10981) / 2;
         int var9 = (this.field_940 - this.field_10973) / 2;
         int var10 = var9 + 16 + 1;
         int var11 = var8 + 5 + 5;
         RenderSystem.method_16438();
         RenderSystem.method_16381();
         this.field_943.getTextureManager().bindTexture(field_48);
         this.method_21(var1, var8, var9, var7);
         int var12 = 0;

         for (class_8014 var14 : var7) {
            if (!this.method_24(var7.size()) || var12 >= this.field_50 && var12 < 7 + this.field_50) {
               ItemStack var15 = var14.method_36365();
               ItemStack var16 = var14.method_36372();
               ItemStack var17 = var14.method_36377();
               ItemStack var18 = var14.method_36362();
               this.field_945.field_44875 = 100.0F;
               int var19 = var10 + 2;
               this.method_17(var1, var16, var15, var11, var19);
               if (!var17.method_28022()) {
                  this.field_945.method_40284(var17, var8 + 5 + 35, var19);
                  this.field_945.method_40281(this.field_948, var17, var8 + 5 + 35, var19);
               }

               this.method_19(var1, var14, var8, var19);
               this.field_945.method_40284(var18, var8 + 5 + 68, var19);
               this.field_945.method_40281(this.field_948, var18, var8 + 5 + 68, var19);
               this.field_945.field_44875 = 0.0F;
               var10 += 20;
               var12++;
            } else {
               var12++;
            }
         }

         int var20 = this.field_47;
         class_8014 var21 = var7.get(var20);
         if (this.field_10956.method_29311()) {
            this.method_18(var1, var8, var9, var21);
         }

         if (var21.method_36378() && this.method_10222(186, 35, 22, 21, (double)var2, (double)var3) && this.field_10956.method_29319()) {
            this.method_1176(var1, field_43, var2, var3);
         }

         for (class_9307 var25 : this.field_45) {
            if (var25.method_32703()) {
               var25.method_32705(var1, var2, var3);
            }

            var25.field_36677 = var25.field_47535 < this.field_10956.method_29312().size();
         }

         RenderSystem.method_16489();
         RenderSystem.enableDepthTest();
      }

      this.method_10214(var1, var2, var3);
   }

   private void method_19(class_7966 var1, class_8014 var2, int var3, int var4) {
      RenderSystem.enableBlend();
      this.field_943.getTextureManager().bindTexture(field_48);
      if (!var2.method_36378()) {
         method_9779(var1, var3 + 5 + 35 + 20, var4 + 3, this.method_9777(), 15.0F, 171.0F, 10, 9, 256, 512);
      } else {
         method_9779(var1, var3 + 5 + 35 + 20, var4 + 3, this.method_9777(), 25.0F, 171.0F, 10, 9, 256, 512);
      }
   }

   private void method_17(class_7966 var1, ItemStack var2, ItemStack var3, int var4, int var5) {
      this.field_945.method_40284(var2, var4, var5);
      if (var3.method_27997() != var2.method_27997()) {
         this.field_945.method_40265(this.field_948, var3, var4, var5, var3.method_27997() != 1 ? null : "1");
         this.field_945.method_40265(this.field_948, var2, var4 + 14, var5, var2.method_27997() != 1 ? null : "1");
         this.field_943.getTextureManager().bindTexture(field_48);
         this.method_9776(this.method_9777() + 300);
         method_9779(var1, var4 + 7, var5 + 12, this.method_9777(), 0.0F, 176.0F, 9, 2, 256, 512);
         this.method_9776(this.method_9777() - 300);
      } else {
         this.field_945.method_40281(this.field_948, var2, var4, var5);
      }
   }

   private boolean method_24(int var1) {
      return var1 > 7;
   }

   @Override
   public boolean method_26945(double var1, double var3, double var5) {
      int var9 = this.field_10956.method_29312().size();
      if (this.method_24(var9)) {
         int var10 = var9 - 7;
         this.field_50 = (int)((double)this.field_50 - var5);
         this.field_50 = class_9299.method_42829(this.field_50, 0, var10);
      }

      return true;
   }

   @Override
   public boolean method_26944(double var1, double var3, int var5, double var6, double var8) {
      int var12 = this.field_10956.method_29312().size();
      if (!this.field_49) {
         return super.method_26944(var1, var3, var5, var6, var8);
      } else {
         int var13 = this.field_10962 + 18;
         int var14 = var13 + 139;
         int var15 = var12 - 7;
         float var16 = ((float)var3 - (float)var13 - 13.5F) / ((float)(var14 - var13) - 27.0F);
         var16 = var16 * (float)var15 + 0.5F;
         this.field_50 = class_9299.method_42829((int)var16, 0, var15);
         return true;
      }
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      this.field_49 = false;
      int var8 = (this.field_941 - this.field_10981) / 2;
      int var9 = (this.field_940 - this.field_10973) / 2;
      if (this.method_24(this.field_10956.method_29312().size())
         && var1 > (double)(var8 + 94)
         && var1 < (double)(var8 + 94 + 6)
         && var3 > (double)(var9 + 18)
         && var3 <= (double)(var9 + 18 + 139 + 1)) {
         this.field_49 = true;
      }

      return super.method_26940(var1, var3, var5);
   }
}
