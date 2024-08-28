package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util.text.*;

import java.util.ArrayList;
import java.util.Random;

public class Class871 extends Class851<Class5822> {
   private static final ResourceLocation field4829 = new ResourceLocation("textures/gui/container/enchanting_table.png");
   private static final ResourceLocation field4830 = new ResourceLocation("textures/entity/enchanting_table_book.png");
   private static final Class2850 field4831 = new Class2850();
   private final Random field4832 = new Random();
   public int field4833;
   public float field4834;
   public float field4835;
   public float field4836;
   public float field4837;
   public float field4838;
   public float field4839;
   private ItemStack field4840 = ItemStack.EMPTY;

   public Class871(Class5822 var1, Class974 var2, ITextComponent var3) {
      super(var1, var2, var3);
   }

   @Override
   public void method1919() {
      super.method1919();
      this.method2700();
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      int var8 = (this.field4564 - this.field4721) / 2;
      int var9 = (this.field4565 - this.field4722) / 2;

      for (int var10 = 0; var10 < 3; var10++) {
         double var11 = var1 - (double)(var8 + 60);
         double var13 = var3 - (double)(var9 + 14 + 19 * var10);
         if (var11 >= 0.0 && var13 >= 0.0 && var11 < 108.0 && var13 < 19.0 && this.field4727.method18104(this.field4562.player, var10)) {
            this.field4562.field1337.method23146(this.field4727.field25471, var10);
            return true;
         }
      }

      return super.method1958(var1, var3, var5);
   }

   @Override
   public void method2618(MatrixStack var1, float var2, int var3, int var4) {
      Class7516.method24502();
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.field4562.getTextureManager().bindTexture(field4829);
      int var7 = (this.field4564 - this.field4721) / 2;
      int var8 = (this.field4565 - this.field4722) / 2;
      this.method5696(var1, var7, var8, 0, 0, this.field4721, this.field4722);
      RenderSystem.method27878(5889);
      RenderSystem.pushMatrix();
      RenderSystem.method27879();
      int var9 = (int)this.field4562.method1580().method8049();
      RenderSystem.method27869((this.field4564 - 320) / 2 * var9, (this.field4565 - 240) / 2 * var9, 320 * var9, 240 * var9);
      RenderSystem.translatef(-0.34F, 0.23F, 0.0F);
      RenderSystem.method27888(Class9367.method35511(90.0, 1.3333334F, 9.0F, 80.0F));
      RenderSystem.method27878(5888);
      var1.method35294();
      Class8892 var10 = var1.method35296();
      var10.method32361().method35503();
      var10.method32362().method32824();
      var1.method35291(0.0, 3.3F, 1984.0);
      float var11 = 5.0F;
      var1.method35292(5.0F, 5.0F, 5.0F);
      var1.method35293(Class7680.field32902.method25286(180.0F));
      var1.method35293(Class7680.field32898.method25286(20.0F));
      float var12 = MathHelper.method37821(var2, this.field4839, this.field4838);
      var1.method35291((double)((1.0F - var12) * 0.2F), (double)((1.0F - var12) * 0.1F), (double)((1.0F - var12) * 0.25F));
      float var13 = -(1.0F - var12) * 90.0F - 90.0F;
      var1.method35293(Class7680.field32900.method25286(var13));
      var1.method35293(Class7680.field32898.method25286(180.0F));
      float var14 = MathHelper.method37821(var2, this.field4835, this.field4834) + 0.25F;
      float var15 = MathHelper.method37821(var2, this.field4835, this.field4834) + 0.75F;
      var14 = (var14 - (float) MathHelper.method37768((double)var14)) * 1.6F - 0.3F;
      var15 = (var15 - (float) MathHelper.method37768((double)var15)) * 1.6F - 0.3F;
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

      RenderSystem.method27867();
      field4831.method11177(0.0F, var14, var15, var12);
      Class7735 var16 = Class7733.method25595(Class9352.method35409().method35411());
      Class5422 var17 = var16.method25597(field4831.method11028(field4830));
      field4831.method11016(var1, var17, 15728880, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
      var16.method25602();
      var1.method35295();
      RenderSystem.method27878(5889);
      RenderSystem.method27869(0, 0, this.field4562.method1580().getFramebufferWidth(), this.field4562.method1580().getFramebufferHeight());
      RenderSystem.popMatrix();
      RenderSystem.method27878(5888);
      Class7516.method24503();
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      Class6577.method19915().method19917((long)this.field4727.method18185());
      int var18 = this.field4727.method18184();

      for (int var19 = 0; var19 < 3; var19++) {
         int var20 = var7 + 60;
         int var21 = var20 + 20;
         this.method5703(0);
         this.field4562.getTextureManager().bindTexture(field4829);
         int var22 = this.field4727.field25509[var19];
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         if (var22 != 0) {
            String var23 = "" + var22;
            int var24 = 86 - this.field4568.method38820(var23);
            ITextProperties var25 = Class6577.method19915().method19916(this.field4568, var24);
            int var26 = 6839882;
            if ((var18 < var19 + 1 || this.field4562.player.field4920 < var22) && !this.field4562.player.field4919.field29609) {
               this.method5696(var1, var20, var8 + 14 + 19 * var19, 0, 185, 108, 19);
               this.method5696(var1, var20 + 1, var8 + 15 + 19 * var19, 16 * var19, 239, 16, 16);
               this.field4568.method38826(var25, var21, var8 + 16 + 19 * var19, var24, (var26 & 16711422) >> 1);
               var26 = 4226832;
            } else {
               int var27 = var3 - (var7 + 60);
               int var28 = var4 - (var8 + 14 + 19 * var19);
               if (var27 >= 0 && var28 >= 0 && var27 < 108 && var28 < 19) {
                  this.method5696(var1, var20, var8 + 14 + 19 * var19, 0, 204, 108, 19);
                  var26 = 16777088;
               } else {
                  this.method5696(var1, var20, var8 + 14 + 19 * var19, 0, 166, 108, 19);
               }

               this.method5696(var1, var20 + 1, var8 + 15 + 19 * var19, 16 * var19, 223, 16, 16);
               this.field4568.method38826(var25, var21, var8 + 16 + 19 * var19, var24, var26);
               var26 = 8453920;
            }

            this.field4568.method38799(var1, var23, (float)(var21 + 86 - this.field4568.method38820(var23)), (float)(var8 + 16 + 19 * var19 + 7), var26);
         } else {
            this.method5696(var1, var20, var8 + 14 + 19 * var19, 0, 185, 108, 19);
         }
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      var4 = this.field4562.method1562();
      this.method2469(var1);
      super.method1923(var1, var2, var3, var4);
      this.method2615(var1, var2, var3);
      boolean var7 = this.field4562.player.field4919.field29609;
      int var8 = this.field4727.method18184();

      for (int var9 = 0; var9 < 3; var9++) {
         int var10 = this.field4727.field25509[var9];
         Class6069 var11 = Class6069.method18810(this.field4727.field25510[var9]);
         int var12 = this.field4727.field25511[var9];
         int var13 = var9 + 1;
         if (this.method2625(60, 14 + 19 * var9, 108, 17, (double)var2, (double)var3) && var10 > 0 && var12 >= 0 && var11 != null) {
            ArrayList var14 = Lists.newArrayList();
            var14.add(new TranslationTextComponent("container.enchant.clue", var11.method18820(var12)).mergeStyle(TextFormatting.WHITE));
            if (!var7) {
               var14.add(StringTextComponent.EMPTY);
               if (this.field4562.player.field4920 >= var10) {
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
                  var14.add(new TranslationTextComponent("container.enchant.level.requirement", this.field4727.field25509[var9]).mergeStyle(TextFormatting.RED));
               }
            }

            this.method2460(var1, var14, var2, var3);
            break;
         }
      }
   }

   public void method2700() {
      ItemStack var3 = this.field4727.method18131(0).method18265();
      if (!ItemStack.method32128(var3, this.field4840)) {
         this.field4840 = var3;

         do {
            this.field4836 = this.field4836 + (float)(this.field4832.nextInt(4) - this.field4832.nextInt(4));
         } while (this.field4834 <= this.field4836 + 1.0F && this.field4834 >= this.field4836 - 1.0F);
      }

      this.field4833++;
      this.field4835 = this.field4834;
      this.field4839 = this.field4838;
      boolean var4 = false;

      for (int var5 = 0; var5 < 3; var5++) {
         if (this.field4727.field25509[var5] != 0) {
            var4 = true;
         }
      }

      if (!var4) {
         this.field4838 -= 0.2F;
      } else {
         this.field4838 += 0.2F;
      }

      this.field4838 = MathHelper.method37777(this.field4838, 0.0F, 1.0F);
      float var7 = (this.field4836 - this.field4834) * 0.4F;
      float var6 = 0.2F;
      var7 = MathHelper.method37777(var7, -0.2F, 0.2F);
      this.field4837 = this.field4837 + (var7 - this.field4837) * 0.9F;
      this.field4834 = this.field4834 + this.field4837;
   }
}