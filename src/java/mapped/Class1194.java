package mapped;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.advancements.Advancement;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.*;

import javax.annotation.Nullable;
import java.util.List;

public class Class1194 extends AbstractGui {
   private static final ResourceLocation field6455 = new ResourceLocation("textures/gui/advancements/widgets.png");
   private static final int[] field6456 = new int[]{0, 10, -10, 25, -25};
   private final Class1271 field6457;
   private final Advancement field6458;
   private final Class9272 field6459;
   private final Class9125 field6460;
   private final int field6461;
   private final List<Class9125> field6462;
   private final Minecraft field6463;
   private Class1194 field6464;
   private final List<Class1194> field6465 = Lists.newArrayList();
   private Class2006 field6466;
   private final int field6467;
   private final int field6468;

   public Class1194(Class1271 var1, Minecraft var2, Advancement var3, Class9272 var4) {
      this.field6457 = var1;
      this.field6458 = var3;
      this.field6459 = var4;
      this.field6463 = var2;
      this.field6460 = LanguageMap.getInstance().func_241870_a(var2.fontRenderer.method38825(var4.method34934(), 163));
      this.field6467 = MathHelper.method37767(var4.method34939() * 28.0F);
      this.field6468 = MathHelper.method37767(var4.method34940() * 27.0F);
      int var7 = var3.method27031();
      int var8 = String.valueOf(var7).length();
      int var9 = var7 <= 1 ? 0 : var2.fontRenderer.getStringWidth("  ") + var2.fontRenderer.getStringWidth("0") * var8 * 2 + var2.fontRenderer.getStringWidth("/");
      int var10 = 29 + var2.fontRenderer.method38822(this.field6460) + var9;
      this.field6462 = LanguageMap.getInstance()
         .func_244260_a(
            this.method5705(TextComponentUtils.func_240648_a_(var4.method34935().deepCopy(), Style.EMPTY.setFormatting(var4.method34938().method8244())), var10)
         );

      for (Class9125 var12 : this.field6462) {
         var10 = Math.max(var10, var2.fontRenderer.method38822(var12));
      }

      this.field6461 = var10 + 3 + 5;
   }

   private static float method5704(CharacterManager var0, List<ITextProperties> var1) {
      return (float)var1.stream().mapToDouble(var0::func_238356_a_).max().orElse(0.0);
   }

   private List<ITextProperties> method5705(ITextComponent var1, int var2) {
      CharacterManager var5 = this.field6463.fontRenderer.method38830();
      List var6 = null;
      float var7 = Float.MAX_VALUE;

      for (int var11 : field6456) {
         List var12 = var5.func_238362_b_(var1, var2 - var11, Style.EMPTY);
         float var13 = Math.abs(method5704(var5, var12) - (float)var2);
         if (var13 <= 10.0F) {
            return var12;
         }

         if (var13 < var7) {
            var7 = var13;
            var6 = var12;
         }
      }

      return var6;
   }

   @Nullable
   private Class1194 method5706(Advancement var1) {
      do {
         var1 = var1.method27026();
      } while (var1 != null && var1.method27027() == null);

      return var1 != null && var1.method27027() != null ? this.field6457.method6012(var1) : null;
   }

   public void method5707(MatrixStack var1, int var2, int var3, boolean var4) {
      if (this.field6464 != null) {
         int var7 = var2 + this.field6464.field6467 + 13;
         int var8 = var2 + this.field6464.field6467 + 26 + 4;
         int var9 = var3 + this.field6464.field6468 + 13;
         int var10 = var2 + this.field6467 + 13;
         int var11 = var3 + this.field6468 + 13;
         int var12 = !var4 ? -1 : -16777216;
         if (!var4) {
            this.method5684(var1, var8, var7, var9, var12);
            this.method5684(var1, var10, var8, var11, var12);
            this.method5685(var1, var8, var11, var9, var12);
         } else {
            this.method5684(var1, var8, var7, var9 - 1, var12);
            this.method5684(var1, var8 + 1, var7, var9, var12);
            this.method5684(var1, var8, var7, var9 + 1, var12);
            this.method5684(var1, var10, var8 - 1, var11 - 1, var12);
            this.method5684(var1, var10, var8 - 1, var11, var12);
            this.method5684(var1, var10, var8 - 1, var11 + 1, var12);
            this.method5685(var1, var8 - 1, var11, var9, var12);
            this.method5685(var1, var8 + 1, var11, var9, var12);
         }
      }

      for (Class1194 var14 : this.field6465) {
         var14.method5707(var1, var2, var3, var4);
      }
   }

   public void method5708(MatrixStack var1, int var2, int var3) {
      if (!this.field6459.method34943() || this.field6466 != null && this.field6466.method8489()) {
         float var6 = this.field6466 != null ? this.field6466.method8496() : 0.0F;
         Class2082 var7;
         if (!(var6 >= 1.0F)) {
            var7 = Class2082.field13561;
         } else {
            var7 = Class2082.field13560;
         }

         this.field6463.getTextureManager().bindTexture(field6455);
         this.blit(
            var1, var2 + this.field6467 + 3, var3 + this.field6468, this.field6459.method34938().method8242(), 128 + var7.method8737() * 26, 26, 26
         );
         this.field6463.getItemRenderer().method794(this.field6459.method34936(), var2 + this.field6467 + 8, var3 + this.field6468 + 5);
      }

      for (Class1194 var9 : this.field6465) {
         var9.method5708(var1, var2, var3);
      }
   }

   public void method5709(Class2006 var1) {
      this.field6466 = var1;
   }

   public void method5710(Class1194 var1) {
      this.field6465.add(var1);
   }

   public void method5711(MatrixStack var1, int var2, int var3, float var4, int var5, int var6) {
      boolean var9 = var5 + var2 + this.field6467 + this.field6461 + 26 >= this.field6457.method6013().width;
      String var10 = this.field6466 != null ? this.field6466.method8497() : null;
      int var11 = var10 != null ? this.field6463.fontRenderer.getStringWidth(var10) : 0;
      boolean var12 = 113 - var3 - this.field6468 - 26 <= 6 + this.field6462.size() * 9;
      float var13 = this.field6466 != null ? this.field6466.method8496() : 0.0F;
      int var14 = MathHelper.method37767(var13 * (float)this.field6461);
      Class2082 var15;
      Class2082 var16;
      Class2082 var17;
      if (!(var13 >= 1.0F)) {
         if (var14 >= 2) {
            if (var14 <= this.field6461 - 2) {
               var15 = Class2082.field13560;
               var16 = Class2082.field13561;
               var17 = Class2082.field13561;
            } else {
               var14 = this.field6461 / 2;
               var15 = Class2082.field13560;
               var16 = Class2082.field13560;
               var17 = Class2082.field13561;
            }
         } else {
            var14 = this.field6461 / 2;
            var15 = Class2082.field13561;
            var16 = Class2082.field13561;
            var17 = Class2082.field13561;
         }
      } else {
         var14 = this.field6461 / 2;
         var15 = Class2082.field13560;
         var16 = Class2082.field13560;
         var17 = Class2082.field13560;
      }

      int var18 = this.field6461 - var14;
      this.field6463.getTextureManager().bindTexture(field6455);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableBlend();
      int var19 = var3 + this.field6468;
      int var20;
      if (!var9) {
         var20 = var2 + this.field6467;
      } else {
         var20 = var2 + this.field6467 - this.field6461 + 26 + 6;
      }

      int var21 = 32 + this.field6462.size() * 9;
      if (!this.field6462.isEmpty()) {
         if (!var12) {
            this.method5712(var1, var20, var19, this.field6461, var21, 10, 200, 26, 0, 52);
         } else {
            this.method5712(var1, var20, var19 + 26 - var21, this.field6461, var21, 10, 200, 26, 0, 52);
         }
      }

      this.blit(var1, var20, var19, 0, var15.method8737() * 26, var14, 26);
      this.blit(var1, var20 + var14, var19, 200 - var18, var16.method8737() * 26, var18, 26);
      this.blit(var1, var2 + this.field6467 + 3, var3 + this.field6468, this.field6459.method34938().method8242(), 128 + var17.method8737() * 26, 26, 26);
      if (!var9) {
         this.field6463.fontRenderer.method38802(var1, this.field6460, (float)(var2 + this.field6467 + 32), (float)(var3 + this.field6468 + 9), -1);
         if (var10 != null) {
            this.field6463
               .fontRenderer
               .drawStringWithShadow(var1, var10, (float)(var2 + this.field6467 + this.field6461 - var11 - 5), (float)(var3 + this.field6468 + 9), -1);
         }
      } else {
         this.field6463.fontRenderer.method38802(var1, this.field6460, (float)(var20 + 5), (float)(var3 + this.field6468 + 9), -1);
         if (var10 != null) {
            this.field6463.fontRenderer.drawStringWithShadow(var1, var10, (float)(var2 + this.field6467 - var11), (float)(var3 + this.field6468 + 9), -1);
         }
      }

      if (!var12) {
         for (int var22 = 0; var22 < this.field6462.size(); var22++) {
            this.field6463
               .fontRenderer
               .method38804(var1, this.field6462.get(var22), (float)(var20 + 5), (float)(var3 + this.field6468 + 9 + 17 + var22 * 9), -5592406);
         }
      } else {
         for (int var23 = 0; var23 < this.field6462.size(); var23++) {
            this.field6463.fontRenderer.method38804(var1, this.field6462.get(var23), (float)(var20 + 5), (float)(var19 + 26 - var21 + 7 + var23 * 9), -5592406);
         }
      }

      this.field6463.getItemRenderer().method794(this.field6459.method34936(), var2 + this.field6467 + 8, var3 + this.field6468 + 5);
   }

   public void method5712(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.blit(var1, var2, var3, var9, var10, var6, var6);
      this.method5713(var1, var2 + var6, var3, var4 - var6 - var6, var6, var9 + var6, var10, var7 - var6 - var6, var8);
      this.blit(var1, var2 + var4 - var6, var3, var9 + var7 - var6, var10, var6, var6);
      this.blit(var1, var2, var3 + var5 - var6, var9, var10 + var8 - var6, var6, var6);
      this.method5713(var1, var2 + var6, var3 + var5 - var6, var4 - var6 - var6, var6, var9 + var6, var10 + var8 - var6, var7 - var6 - var6, var8);
      this.blit(var1, var2 + var4 - var6, var3 + var5 - var6, var9 + var7 - var6, var10 + var8 - var6, var6, var6);
      this.method5713(var1, var2, var3 + var6, var6, var5 - var6 - var6, var9, var10 + var6, var7, var8 - var6 - var6);
      this.method5713(var1, var2 + var6, var3 + var6, var4 - var6 - var6, var5 - var6 - var6, var9 + var6, var10 + var6, var7 - var6 - var6, var8 - var6 - var6);
      this.method5713(var1, var2 + var4 - var6, var3 + var6, var6, var5 - var6 - var6, var9 + var7 - var6, var10 + var6, var7, var8 - var6 - var6);
   }

   public void method5713(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var12 = 0;

      while (var12 < var4) {
         int var13 = var2 + var12;
         int var14 = Math.min(var8, var4 - var12);
         int var15 = 0;

         while (var15 < var5) {
            int var16 = var3 + var15;
            int var17 = Math.min(var9, var5 - var15);
            this.blit(var1, var13, var16, var6, var7, var14, var17);
            var15 += var9;
         }

         var12 += var8;
      }
   }

   public boolean method5714(int var1, int var2, int var3, int var4) {
      if (!this.field6459.method34943() || this.field6466 != null && this.field6466.method8489()) {
         int var7 = var1 + this.field6467;
         int var8 = var7 + 26;
         int var9 = var2 + this.field6468;
         int var10 = var9 + 26;
         return var3 >= var7 && var3 <= var8 && var4 >= var9 && var4 <= var10;
      } else {
         return false;
      }
   }

   public void method5715() {
      if (this.field6464 == null && this.field6458.method27026() != null) {
         this.field6464 = this.method5706(this.field6458);
         if (this.field6464 != null) {
            this.field6464.method5710(this);
         }
      }
   }

   public int method5716() {
      return this.field6468;
   }

   public int method5717() {
      return this.field6467;
   }
}
