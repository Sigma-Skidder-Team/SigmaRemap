package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8226 extends class_2208<class_8372> {
   private static final Identifier field_42231 = new Identifier("textures/gui/container/enchanting_table.png");
   private static final Identifier field_42227 = new Identifier("textures/entity/enchanting_table_book.png");
   private static final class_8197 field_42233 = new class_8197();
   private final Random field_42234 = new Random();
   public int field_42237;
   public float field_42226;
   public float field_42235;
   public float field_42230;
   public float field_42232;
   public float field_42229;
   public float field_42228;
   private ItemStack field_42236 = ItemStack.EMPTY;

   public class_8226(class_8372 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3);
   }

   @Override
   public void method_5312() {
      super.method_5312();
      this.method_37660();
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      int var8 = (this.field_941 - this.field_10981) / 2;
      int var9 = (this.field_940 - this.field_10973) / 2;

      for (int var10 = 0; var10 < 3; var10++) {
         double var11 = var1 - (double)(var8 + 60);
         double var13 = var3 - (double)(var9 + 14 + 19 * var10);
         if (var11 >= 0.0 && var13 >= 0.0 && var11 < 108.0 && var13 < 19.0 && this.field_10956.method_18886(this.field_943.thePlayer, var10)) {
            this.field_943.playerController.method_42154(this.field_10956.field_19925, var10);
            return true;
         }
      }

      return super.method_26940(var1, var3, var5);
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      class_2083.method_9716();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.getTextureManager().bindTexture(field_42231);
      int var7 = (this.field_941 - this.field_10981) / 2;
      int var8 = (this.field_940 - this.field_10973) / 2;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
      RenderSystem.method_16463(5889);
      RenderSystem.method_16438();
      RenderSystem.method_16476();
      int var9 = (int)this.field_943.getMainWindow().method_43189();
      RenderSystem.method_16392((this.field_941 - 320) / 2 * var9, (this.field_940 - 240) / 2 * var9, 320 * var9, 240 * var9);
      RenderSystem.method_16413(-0.34F, 0.23F, 0.0F);
      RenderSystem.method_16358(class_8107.method_36820(90.0, 1.3333334F, 9.0F, 80.0F));
      RenderSystem.method_16463(5888);
      var1.method_36063();
      class_6279 var10 = var1.method_36058();
      var10.method_28620().method_36817();
      var10.method_28618().method_29888();
      var1.method_36065(0.0, 3.3F, 1984.0);
      float var11 = 5.0F;
      var1.method_36062(5.0F, 5.0F, 5.0F);
      var1.method_36060(class_2426.field_12076.method_11074(180.0F));
      var1.method_36060(class_2426.field_12080.method_11074(20.0F));
      float var12 = class_9299.method_42795(var2, this.field_42228, this.field_42229);
      var1.method_36065((double)((1.0F - var12) * 0.2F), (double)((1.0F - var12) * 0.1F), (double)((1.0F - var12) * 0.25F));
      float var13 = -(1.0F - var12) * 90.0F - 90.0F;
      var1.method_36060(class_2426.field_12074.method_11074(var13));
      var1.method_36060(class_2426.field_12080.method_11074(180.0F));
      float var14 = class_9299.method_42795(var2, this.field_42235, this.field_42226) + 0.25F;
      float var15 = class_9299.method_42795(var2, this.field_42235, this.field_42226) + 0.75F;
      var14 = (var14 - (float)class_9299.method_42808((double)var14)) * 1.6F - 0.3F;
      var15 = (var15 - (float)class_9299.method_42808((double)var15)) * 1.6F - 0.3F;
      if (var14 < 0.0F) {
         var14 = 0.0F;
      }

      if (var15 < 0.0F) {
         var15 = 0.0F;
      }

      if (var14 > 1.0F) {
         var14 = 1.0F;
      }

      if (var15 > 1.0F) {
         var15 = 1.0F;
      }

      RenderSystem.method_16381();
      field_42233.method_37551(0.0F, var14, var15, var12);
      class_3758 var16 = class_2565.method_11648(class_8042.method_36499().method_36501());
      class_7907 var17 = var16.method_11645(field_42233.method_45498(field_42227));
      field_42233.method_45499(var1, var17, 15728880, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
      var16.method_17415();
      var1.method_36064();
      RenderSystem.method_16463(5889);
      RenderSystem.method_16392(0, 0, this.field_943.getMainWindow().method_43178(), this.field_943.getMainWindow().method_43198());
      RenderSystem.method_16489();
      RenderSystem.method_16463(5888);
      class_2083.method_9717();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      class_726.method_3294().method_3293((long)this.field_10956.method_38581());
      int var18 = this.field_10956.method_38582();

      for (int var19 = 0; var19 < 3; var19++) {
         int var20 = var7 + 60;
         int var21 = var20 + 20;
         this.method_9776(0);
         this.field_943.getTextureManager().bindTexture(field_42231);
         int var22 = this.field_10956.field_42870[var19];
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         if (var22 != 0) {
            String var23 = "" + var22;
            int var24 = 86 - this.field_948.method_45395(var23);
            ITextProperties var25 = class_726.method_3294().method_3295(this.field_948, var24);
            int var26 = 6839882;
            if ((var18 < var19 + 1 || this.field_943.thePlayer.field_3840 < var22) && !this.field_943.thePlayer.field_3876.field_4944) {
               this.method_9781(var1, var20, var8 + 14 + 19 * var19, 0, 185, 108, 19);
               this.method_9781(var1, var20 + 1, var8 + 15 + 19 * var19, 16 * var19, 239, 16, 16);
               this.field_948.method_45407(var25, var21, var8 + 16 + 19 * var19, var24, (var26 & 16711422) >> 1);
               var26 = 4226832;
            } else {
               int var27 = var3 - (var7 + 60);
               int var28 = var4 - (var8 + 14 + 19 * var19);
               if (var27 >= 0 && var28 >= 0 && var27 < 108 && var28 < 19) {
                  this.method_9781(var1, var20, var8 + 14 + 19 * var19, 0, 204, 108, 19);
                  var26 = 16777088;
               } else {
                  this.method_9781(var1, var20, var8 + 14 + 19 * var19, 0, 166, 108, 19);
               }

               this.method_9781(var1, var20 + 1, var8 + 15 + 19 * var19, 16 * var19, 223, 16, 16);
               this.field_948.method_45407(var25, var21, var8 + 16 + 19 * var19, var24, var26);
               var26 = 8453920;
            }

            this.field_948.method_45390(var1, var23, (float)(var21 + 86 - this.field_948.method_45395(var23)), (float)(var8 + 16 + 19 * var19 + 7), var26);
         } else {
            this.method_9781(var1, var20, var8 + 14 + 19 * var19, 0, 185, 108, 19);
         }
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      var4 = this.field_943.method_8554();
      this.method_1183(var1);
      super.method_6767(var1, var2, var3, var4);
      this.method_10214(var1, var2, var3);
      boolean var7 = this.field_943.thePlayer.field_3876.field_4944;
      int var8 = this.field_10956.method_38582();

      for (int var9 = 0; var9 < 3; var9++) {
         int var10 = this.field_10956.field_42870[var9];
         class_4382 var11 = class_4382.method_20431(this.field_10956.field_42867[var9]);
         int var12 = this.field_10956.field_42864[var9];
         int var13 = var9 + 1;
         if (this.method_10222(60, 14 + 19 * var9, 108, 17, (double)var2, (double)var3) && var10 > 0 && var12 >= 0 && var11 != null) {
            ArrayList var14 = Lists.newArrayList();
            var14.add(new TranslationTextComponent("container.enchant.clue", var11.method_20423(var12)).mergeStyle(TextFormatting.WHITE));
            if (!var7) {
               var14.add(StringTextComponent.EMPTY);
               if (this.field_943.thePlayer.field_3840 >= var10) {
                  TranslationTextComponent var15;
                  if (var13 != 1) {
                     var15 = new TranslationTextComponent("container.enchant.lapis.many", var13);
                  } else {
                     var15 = new TranslationTextComponent("container.enchant.lapis.one");
                  }

                  var14.add(var15.mergeStyle(var8 < var13 ? TextFormatting.RED : TextFormatting.GRAY));
                  TranslationTextComponent var16;
                  if (var13 != 1) {
                     var16 = new TranslationTextComponent("container.enchant.level.many", var13);
                  } else {
                     var16 = new TranslationTextComponent("container.enchant.level.one");
                  }

                  var14.add(var16.mergeStyle(TextFormatting.GRAY));
               } else {
                  var14.add(
                     new TranslationTextComponent("container.enchant.level.requirement", this.field_10956.field_42870[var9]).mergeStyle(TextFormatting.RED)
                  );
               }
            }

            this.method_1160(var1, var14, var2, var3);
            break;
         }
      }
   }

   public void method_37660() {
      ItemStack var3 = this.field_10956.method_18878(0).method_35898();
      if (!ItemStack.method_27982(var3, this.field_42236)) {
         this.field_42236 = var3;

         do {
            this.field_42230 = this.field_42230 + (float)(this.field_42234.nextInt(4) - this.field_42234.nextInt(4));
         } while (this.field_42226 <= this.field_42230 + 1.0F && this.field_42226 >= this.field_42230 - 1.0F);
      }

      this.field_42237++;
      this.field_42235 = this.field_42226;
      this.field_42228 = this.field_42229;
      boolean var4 = false;

      for (int var5 = 0; var5 < 3; var5++) {
         if (this.field_10956.field_42870[var5] != 0) {
            var4 = true;
         }
      }

      if (!var4) {
         this.field_42229 -= 0.2F;
      } else {
         this.field_42229 += 0.2F;
      }

      this.field_42229 = class_9299.method_42828(this.field_42229, 0.0F, 1.0F);
      float var7 = (this.field_42230 - this.field_42226) * 0.4F;
      float var6 = 0.2F;
      var7 = class_9299.method_42828(var7, -0.2F, 0.2F);
      this.field_42232 = this.field_42232 + (var7 - this.field_42232) * 0.9F;
      this.field_42226 = this.field_42226 + this.field_42232;
   }
}
