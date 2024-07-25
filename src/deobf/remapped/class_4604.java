package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.util.text.CharacterManager;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.LanguageMap;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentUtils;

public class class_4604 extends AbstractGui {
   private static final Identifier field_22405 = new Identifier("textures/gui/advancements/widgets.png");
   private static final int[] field_22407 = new int[]{0, 10, -10, 25, -25};
   private final class_7797 field_22404;
   private final class_3139 field_22400;
   private final class_7750 field_22398;
   private final class_7107 field_22408;
   private final int field_22403;
   private final List<class_7107> field_22397;
   private final MinecraftClient field_22406;
   private class_4604 field_22401;
   private final List<class_4604> field_22396 = Lists.newArrayList();
   private class_3604 field_22399;
   private final int field_22402;
   private final int field_22409;

   public class_4604(class_7797 var1, MinecraftClient var2, class_3139 var3, class_7750 var4) {
      this.field_22404 = var1;
      this.field_22400 = var3;
      this.field_22398 = var4;
      this.field_22406 = var2;
      this.field_22408 = LanguageMap.getInstance().func_241870_a(var2.textRenderer.method_45399(var4.method_35160(), 163));
      this.field_22402 = class_9299.method_42848(var4.method_35153() * 28.0F);
      this.field_22409 = class_9299.method_42848(var4.method_35162() * 27.0F);
      int var7 = var3.method_14513();
      int var8 = String.valueOf(var7).length();
      int var9 = var7 <= 1 ? 0 : var2.textRenderer.method_45395("  ") + var2.textRenderer.method_45395("0") * var8 * 2 + var2.textRenderer.method_45395("/");
      int var10 = 29 + var2.textRenderer.method_45400(this.field_22408) + var9;
      this.field_22397 = LanguageMap.getInstance()
         .func_244260_a(
            this.method_21346(
               TextComponentUtils.func_240648_a_(var4.method_35167().deepCopy(), Style.EMPTY.setFormatting(var4.method_35157().method_15386())), var10
            )
         );

      for (class_7107 var12 : this.field_22397) {
         var10 = Math.max(var10, var2.textRenderer.method_45400(var12));
      }

      this.field_22403 = var10 + 3 + 5;
   }

   private static float method_21337(CharacterManager var0, List<ITextProperties> var1) {
      return (float)var1.stream().mapToDouble(var0::func_238356_a_).max().orElse(0.0);
   }

   private List<ITextProperties> method_21346(ITextComponent var1, int var2) {
      CharacterManager var5 = this.field_22406.textRenderer.method_45381();
      List var6 = null;
      float var7 = Float.MAX_VALUE;

      for (int var11 : field_22407) {
         List var12 = var5.func_238362_b_(var1, var2 - var11, Style.EMPTY);
         float var13 = Math.abs(method_21337(var5, var12) - (float)var2);
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
   private class_4604 method_21344(class_3139 var1) {
      do {
         var1 = var1.method_14510();
      } while (var1 != null && var1.method_14511() == null);

      return var1 != null && var1.method_14511() != null ? this.field_22404.method_35366(var1) : null;
   }

   public void method_21342(class_7966 var1, int var2, int var3, boolean var4) {
      if (this.field_22401 != null) {
         int var7 = var2 + this.field_22401.field_22402 + 13;
         int var8 = var2 + this.field_22401.field_22402 + 26 + 4;
         int var9 = var3 + this.field_22401.field_22409 + 13;
         int var10 = var2 + this.field_22402 + 13;
         int var11 = var3 + this.field_22409 + 13;
         int var12 = !var4 ? -1 : -16777216;
         if (!var4) {
            this.method_9789(var1, var8, var7, var9, var12);
            this.method_9789(var1, var10, var8, var11, var12);
            this.method_9790(var1, var8, var11, var9, var12);
         } else {
            this.method_9789(var1, var8, var7, var9 - 1, var12);
            this.method_9789(var1, var8 + 1, var7, var9, var12);
            this.method_9789(var1, var8, var7, var9 + 1, var12);
            this.method_9789(var1, var10, var8 - 1, var11 - 1, var12);
            this.method_9789(var1, var10, var8 - 1, var11, var12);
            this.method_9789(var1, var10, var8 - 1, var11 + 1, var12);
            this.method_9790(var1, var8 - 1, var11, var9, var12);
            this.method_9790(var1, var8 + 1, var11, var9, var12);
         }
      }

      for (class_4604 var14 : this.field_22396) {
         var14.method_21342(var1, var2, var3, var4);
      }
   }

   public void method_21345(class_7966 var1, int var2, int var3) {
      if (!this.field_22398.method_35158() || this.field_22399 != null && this.field_22399.method_16811()) {
         float var6 = this.field_22399 != null ? this.field_22399.method_16805() : 0.0F;
         class_2139 var7;
         if (!(var6 >= 1.0F)) {
            var7 = class_2139.field_10720;
         } else {
            var7 = class_2139.field_10721;
         }

         this.field_22406.getTextureManager().bindTexture(field_22405);
         this.method_9781(
            var1, var2 + this.field_22402 + 3, var3 + this.field_22409, this.field_22398.method_35157().method_15382(), 128 + var7.method_9998() * 26, 26, 26
         );
         this.field_22406.method_8511().method_40284(this.field_22398.method_35151(), var2 + this.field_22402 + 8, var3 + this.field_22409 + 5);
      }

      for (class_4604 var9 : this.field_22396) {
         var9.method_21345(var1, var2, var3);
      }
   }

   public void method_21339(class_3604 var1) {
      this.field_22399 = var1;
   }

   public void method_21333(class_4604 var1) {
      this.field_22396.add(var1);
   }

   public void method_21335(class_7966 var1, int var2, int var3, float var4, int var5, int var6) {
      boolean var9 = var5 + var2 + this.field_22402 + this.field_22403 + 26 >= this.field_22404.method_35362().field_941;
      String var10 = this.field_22399 != null ? this.field_22399.method_16806() : null;
      int var11 = var10 != null ? this.field_22406.textRenderer.method_45395(var10) : 0;
      boolean var12 = 113 - var3 - this.field_22409 - 26 <= 6 + this.field_22397.size() * 9;
      float var13 = this.field_22399 != null ? this.field_22399.method_16805() : 0.0F;
      int var14 = class_9299.method_42848(var13 * (float)this.field_22403);
      class_2139 var15;
      class_2139 var16;
      class_2139 var17;
      if (!(var13 >= 1.0F)) {
         if (var14 >= 2) {
            if (var14 <= this.field_22403 - 2) {
               var15 = class_2139.field_10721;
               var16 = class_2139.field_10720;
               var17 = class_2139.field_10720;
            } else {
               var14 = this.field_22403 / 2;
               var15 = class_2139.field_10721;
               var16 = class_2139.field_10721;
               var17 = class_2139.field_10720;
            }
         } else {
            var14 = this.field_22403 / 2;
            var15 = class_2139.field_10720;
            var16 = class_2139.field_10720;
            var17 = class_2139.field_10720;
         }
      } else {
         var14 = this.field_22403 / 2;
         var15 = class_2139.field_10721;
         var16 = class_2139.field_10721;
         var17 = class_2139.field_10721;
      }

      int var18 = this.field_22403 - var14;
      this.field_22406.getTextureManager().bindTexture(field_22405);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableBlend();
      int var19 = var3 + this.field_22409;
      int var20;
      if (!var9) {
         var20 = var2 + this.field_22402;
      } else {
         var20 = var2 + this.field_22402 - this.field_22403 + 26 + 6;
      }

      int var21 = 32 + this.field_22397.size() * 9;
      if (!this.field_22397.isEmpty()) {
         if (!var12) {
            this.method_21343(var1, var20, var19, this.field_22403, var21, 10, 200, 26, 0, 52);
         } else {
            this.method_21343(var1, var20, var19 + 26 - var21, this.field_22403, var21, 10, 200, 26, 0, 52);
         }
      }

      this.method_9781(var1, var20, var19, 0, var15.method_9998() * 26, var14, 26);
      this.method_9781(var1, var20 + var14, var19, 200 - var18, var16.method_9998() * 26, var18, 26);
      this.method_9781(
         var1, var2 + this.field_22402 + 3, var3 + this.field_22409, this.field_22398.method_35157().method_15382(), 128 + var17.method_9998() * 26, 26, 26
      );
      if (!var9) {
         this.field_22406.textRenderer.method_45402(var1, this.field_22408, (float)(var2 + this.field_22402 + 32), (float)(var3 + this.field_22409 + 9), -1);
         if (var10 != null) {
            this.field_22406
               .textRenderer
               .method_45390(var1, var10, (float)(var2 + this.field_22402 + this.field_22403 - var11 - 5), (float)(var3 + this.field_22409 + 9), -1);
         }
      } else {
         this.field_22406.textRenderer.method_45402(var1, this.field_22408, (float)(var20 + 5), (float)(var3 + this.field_22409 + 9), -1);
         if (var10 != null) {
            this.field_22406.textRenderer.method_45390(var1, var10, (float)(var2 + this.field_22402 - var11), (float)(var3 + this.field_22409 + 9), -1);
         }
      }

      if (!var12) {
         for (int var22 = 0; var22 < this.field_22397.size(); var22++) {
            this.field_22406
               .textRenderer
               .method_45382(var1, this.field_22397.get(var22), (float)(var20 + 5), (float)(var3 + this.field_22409 + 9 + 17 + var22 * 9), -5592406);
         }
      } else {
         for (int var23 = 0; var23 < this.field_22397.size(); var23++) {
            this.field_22406
               .textRenderer
               .method_45382(var1, this.field_22397.get(var23), (float)(var20 + 5), (float)(var19 + 26 - var21 + 7 + var23 * 9), -5592406);
         }
      }

      this.field_22406.method_8511().method_40284(this.field_22398.method_35151(), var2 + this.field_22402 + 8, var3 + this.field_22409 + 5);
   }

   public void method_21343(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.method_9781(var1, var2, var3, var9, var10, var6, var6);
      this.method_21341(var1, var2 + var6, var3, var4 - var6 - var6, var6, var9 + var6, var10, var7 - var6 - var6, var8);
      this.method_9781(var1, var2 + var4 - var6, var3, var9 + var7 - var6, var10, var6, var6);
      this.method_9781(var1, var2, var3 + var5 - var6, var9, var10 + var8 - var6, var6, var6);
      this.method_21341(var1, var2 + var6, var3 + var5 - var6, var4 - var6 - var6, var6, var9 + var6, var10 + var8 - var6, var7 - var6 - var6, var8);
      this.method_9781(var1, var2 + var4 - var6, var3 + var5 - var6, var9 + var7 - var6, var10 + var8 - var6, var6, var6);
      this.method_21341(var1, var2, var3 + var6, var6, var5 - var6 - var6, var9, var10 + var6, var7, var8 - var6 - var6);
      this.method_21341(
         var1, var2 + var6, var3 + var6, var4 - var6 - var6, var5 - var6 - var6, var9 + var6, var10 + var6, var7 - var6 - var6, var8 - var6 - var6
      );
      this.method_21341(var1, var2 + var4 - var6, var3 + var6, var6, var5 - var6 - var6, var9 + var7 - var6, var10 + var6, var7, var8 - var6 - var6);
   }

   public void method_21341(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var12 = 0;

      while (var12 < var4) {
         int var13 = var2 + var12;
         int var14 = Math.min(var8, var4 - var12);
         int var15 = 0;

         while (var15 < var5) {
            int var16 = var3 + var15;
            int var17 = Math.min(var9, var5 - var15);
            this.method_9781(var1, var13, var16, var6, var7, var14, var17);
            var15 += var9;
         }

         var12 += var8;
      }
   }

   public boolean method_21336(int var1, int var2, int var3, int var4) {
      if (!this.field_22398.method_35158() || this.field_22399 != null && this.field_22399.method_16811()) {
         int var7 = var1 + this.field_22402;
         int var8 = var7 + 26;
         int var9 = var2 + this.field_22409;
         int var10 = var9 + 26;
         return var3 >= var7 && var3 <= var8 && var4 >= var9 && var4 <= var10;
      } else {
         return false;
      }
   }

   public void method_21334() {
      if (this.field_22401 == null && this.field_22400.method_14510() != null) {
         this.field_22401 = this.method_21344(this.field_22400);
         if (this.field_22401 != null) {
            this.field_22401.method_21333(this);
         }
      }
   }

   public int method_21340() {
      return this.field_22409;
   }

   public int method_21338() {
      return this.field_22402;
   }
}
