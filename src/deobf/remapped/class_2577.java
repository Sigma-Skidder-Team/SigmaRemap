package remapped;

import java.util.Collections;
import java.util.List;

public abstract class class_2577 extends FocusableGui implements IRenderable {
   public static final int field_12759 = -1;
   public static final int field_12766 = -2;
   public final MinecraftClient field_12768;
   public int field_12760;
   public int field_12757;
   public int field_12765;
   public int field_12755;
   public int field_12756;
   public int field_12762;
   public final int field_12770;
   public boolean field_12767 = true;
   public int field_12764 = -2;
   public double field_12769;
   public boolean field_12761 = true;
   public boolean field_12754 = true;
   public boolean field_12771;
   public int field_12763;
   private boolean field_12758;

   public class_2577(MinecraftClient var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_12768 = var1;
      this.field_12760 = var2;
      this.field_12757 = var3;
      this.field_12765 = var4;
      this.field_12755 = var5;
      this.field_12770 = var6;
      this.field_12762 = 0;
      this.field_12756 = var2;
   }

   public void method_11726(int var1, int var2, int var3, int var4) {
      this.field_12760 = var1;
      this.field_12757 = var2;
      this.field_12765 = var3;
      this.field_12755 = var4;
      this.field_12762 = 0;
      this.field_12756 = var1;
   }

   public void method_11727(boolean var1) {
      this.field_12754 = var1;
   }

   public void method_11707(boolean var1, int var2) {
      this.field_12771 = var1;
      this.field_12763 = var2;
      if (!var1) {
         this.field_12763 = 0;
      }
   }

   public void method_11733(boolean var1) {
      this.field_12761 = var1;
   }

   public boolean method_11709() {
      return this.field_12761;
   }

   public abstract int method_11725();

   @Override
   public List<? extends class_5888> method_41183() {
      return Collections.emptyList();
   }

   public boolean method_11730(int var1, int var2, double var3, double var5) {
      return true;
   }

   public abstract boolean method_11722(int var1);

   public int method_11718() {
      return this.method_11725() * this.field_12770 + this.field_12763;
   }

   public abstract void method_11705();

   public void method_11702(int var1, int var2, int var3, float var4) {
   }

   public abstract void method_11704(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8);

   public void method_11710(int var1, int var2, class_8042 var3) {
   }

   public void method_11706(int var1, int var2) {
   }

   public void method_11731(int var1, int var2) {
   }

   public int method_11703(double var1, double var3) {
      int var7 = this.field_12762 + this.field_12760 / 2 - this.method_11732() / 2;
      int var8 = this.field_12762 + this.field_12760 / 2 + this.method_11732() / 2;
      int var9 = MathHelper.floor(var3 - (double)this.field_12765) - this.field_12763 + (int)this.field_12769 - 4;
      int var10 = var9 / this.field_12770;
      return var1 < (double)this.method_11719() && var1 >= (double)var7 && var1 <= (double)var8 && var10 >= 0 && var9 >= 0 && var10 < this.method_11725()
         ? var10
         : -1;
   }

   public void method_11715() {
      this.field_12769 = MathHelper.clamp(this.field_12769, 0.0, (double)this.method_11714());
   }

   public int method_11714() {
      return Math.max(0, this.method_11718() - (this.field_12755 - this.field_12765 - 4));
   }

   public void method_11723(int var1) {
      this.field_12769 = (double)(var1 * this.field_12770 + this.field_12770 / 2 - (this.field_12755 - this.field_12765) / 2);
      this.method_11715();
   }

   public int method_11716() {
      return (int)this.field_12769;
   }

   public boolean method_11721(double var1, double var3) {
      return var3 >= (double)this.field_12765 && var3 <= (double)this.field_12755 && var1 >= (double)this.field_12762 && var1 <= (double)this.field_12756;
   }

   public int method_11720() {
      return (int)this.field_12769 - this.field_12757 - this.field_12763;
   }

   public void method_11711(int var1) {
      this.field_12769 += (double)var1;
      this.method_11715();
      this.field_12764 = -2;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      if (this.field_12761) {
         this.method_11705();
         int var7 = this.method_11719();
         int var8 = var7 + 6;
         this.method_11715();
         class_8042 var9 = class_8042.method_36499();
         class_9633 var10 = var9.method_36501();
         this.field_12768.getTextureManager().bindTexture(AbstractGui.field_10505);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         float var11 = 32.0F;
         var10.method_44471(7, class_7985.field_40905);
         var10.method_35761((double)this.field_12762, (double)this.field_12755, 0.0)
            .method_35745((float)this.field_12762 / 32.0F, (float)(this.field_12755 + (int)this.field_12769) / 32.0F)
            .method_35743(32, 32, 32, 255)
            .method_35735();
         var10.method_35761((double)this.field_12756, (double)this.field_12755, 0.0)
            .method_35745((float)this.field_12756 / 32.0F, (float)(this.field_12755 + (int)this.field_12769) / 32.0F)
            .method_35743(32, 32, 32, 255)
            .method_35735();
         var10.method_35761((double)this.field_12756, (double)this.field_12765, 0.0)
            .method_35745((float)this.field_12756 / 32.0F, (float)(this.field_12765 + (int)this.field_12769) / 32.0F)
            .method_35743(32, 32, 32, 255)
            .method_35735();
         var10.method_35761((double)this.field_12762, (double)this.field_12765, 0.0)
            .method_35745((float)this.field_12762 / 32.0F, (float)(this.field_12765 + (int)this.field_12769) / 32.0F)
            .method_35743(32, 32, 32, 255)
            .method_35735();
         var9.method_36500();
         int var12 = this.field_12762 + this.field_12760 / 2 - this.method_11732() / 2 + 2;
         int var13 = this.field_12765 + 4 - (int)this.field_12769;
         if (this.field_12771) {
            this.method_11710(var12, var13, var9);
         }

         this.method_11712(var1, var12, var13, var2, var3, var4);
         RenderSystem.disableDepthTest();
         this.method_11713(0, this.field_12765, 255, 255);
         this.method_11713(this.field_12755, this.field_12757, 255, 255);
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.field_43697, SourceFactor.ZERO, DestFactor.field_43691);
         RenderSystem.method_16458();
         RenderSystem.method_16486(7425);
         RenderSystem.method_16354();
         byte var14 = 4;
         var10.method_44471(7, class_7985.field_40905);
         var10.method_35761((double)this.field_12762, (double)(this.field_12765 + 4), 0.0).method_35745(0.0F, 1.0F).method_35743(0, 0, 0, 0).method_35735();
         var10.method_35761((double)this.field_12756, (double)(this.field_12765 + 4), 0.0).method_35745(1.0F, 1.0F).method_35743(0, 0, 0, 0).method_35735();
         var10.method_35761((double)this.field_12756, (double)this.field_12765, 0.0).method_35745(1.0F, 0.0F).method_35743(0, 0, 0, 255).method_35735();
         var10.method_35761((double)this.field_12762, (double)this.field_12765, 0.0).method_35745(0.0F, 0.0F).method_35743(0, 0, 0, 255).method_35735();
         var9.method_36500();
         var10.method_44471(7, class_7985.field_40905);
         var10.method_35761((double)this.field_12762, (double)this.field_12755, 0.0).method_35745(0.0F, 1.0F).method_35743(0, 0, 0, 255).method_35735();
         var10.method_35761((double)this.field_12756, (double)this.field_12755, 0.0).method_35745(1.0F, 1.0F).method_35743(0, 0, 0, 255).method_35735();
         var10.method_35761((double)this.field_12756, (double)(this.field_12755 - 4), 0.0).method_35745(1.0F, 0.0F).method_35743(0, 0, 0, 0).method_35735();
         var10.method_35761((double)this.field_12762, (double)(this.field_12755 - 4), 0.0).method_35745(0.0F, 0.0F).method_35743(0, 0, 0, 0).method_35735();
         var9.method_36500();
         int var15 = this.method_11714();
         if (var15 > 0) {
            int var16 = (int)((float)((this.field_12755 - this.field_12765) * (this.field_12755 - this.field_12765)) / (float)this.method_11718());
            var16 = MathHelper.clamp(var16, 32, this.field_12755 - this.field_12765 - 8);
            int var17 = (int)this.field_12769 * (this.field_12755 - this.field_12765 - var16) / var15 + this.field_12765;
            if (var17 < this.field_12765) {
               var17 = this.field_12765;
            }

            var10.method_44471(7, class_7985.field_40905);
            var10.method_35761((double)var7, (double)this.field_12755, 0.0).method_35745(0.0F, 1.0F).method_35743(0, 0, 0, 255).method_35735();
            var10.method_35761((double)var8, (double)this.field_12755, 0.0).method_35745(1.0F, 1.0F).method_35743(0, 0, 0, 255).method_35735();
            var10.method_35761((double)var8, (double)this.field_12765, 0.0).method_35745(1.0F, 0.0F).method_35743(0, 0, 0, 255).method_35735();
            var10.method_35761((double)var7, (double)this.field_12765, 0.0).method_35745(0.0F, 0.0F).method_35743(0, 0, 0, 255).method_35735();
            var9.method_36500();
            var10.method_44471(7, class_7985.field_40905);
            var10.method_35761((double)var7, (double)(var17 + var16), 0.0).method_35745(0.0F, 1.0F).method_35743(128, 128, 128, 255).method_35735();
            var10.method_35761((double)var8, (double)(var17 + var16), 0.0).method_35745(1.0F, 1.0F).method_35743(128, 128, 128, 255).method_35735();
            var10.method_35761((double)var8, (double)var17, 0.0).method_35745(1.0F, 0.0F).method_35743(128, 128, 128, 255).method_35735();
            var10.method_35761((double)var7, (double)var17, 0.0).method_35745(0.0F, 0.0F).method_35743(128, 128, 128, 255).method_35735();
            var9.method_36500();
            var10.method_44471(7, class_7985.field_40905);
            var10.method_35761((double)var7, (double)(var17 + var16 - 1), 0.0).method_35745(0.0F, 1.0F).method_35743(192, 192, 192, 255).method_35735();
            var10.method_35761((double)(var8 - 1), (double)(var17 + var16 - 1), 0.0).method_35745(1.0F, 1.0F).method_35743(192, 192, 192, 255).method_35735();
            var10.method_35761((double)(var8 - 1), (double)var17, 0.0).method_35745(1.0F, 0.0F).method_35743(192, 192, 192, 255).method_35735();
            var10.method_35761((double)var7, (double)var17, 0.0).method_35745(0.0F, 0.0F).method_35743(192, 192, 192, 255).method_35735();
            var9.method_36500();
         }

         this.method_11731(var2, var3);
         RenderSystem.method_16432();
         RenderSystem.method_16486(7424);
         RenderSystem.enableAlphaTest();
         RenderSystem.disableBlend();
      }
   }

   public void method_11708(double var1, double var3, int var5) {
      this.field_12758 = var5 == 0 && var1 >= (double)this.method_11719() && var1 < (double)(this.method_11719() + 6);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      this.method_11708(var1, var3, var5);
      if (this.method_11709() && this.method_11721(var1, var3)) {
         int var8 = this.method_11703(var1, var3);
         if (var8 == -1 && var5 == 0) {
            this.method_11706(
               (int)(var1 - (double)(this.field_12762 + this.field_12760 / 2 - this.method_11732() / 2)),
               (int)(var3 - (double)this.field_12765) + (int)this.field_12769 - 4
            );
            return true;
         } else if (var8 != -1 && this.method_11730(var8, var5, var1, var3)) {
            if (this.method_41183().size() > var8) {
               this.method_41180(this.method_41183().get(var8));
            }

            this.method_41179(true);
            return true;
         } else {
            return this.field_12758;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_26941(double var1, double var3, int var5) {
      if (this.method_41185() != null) {
         this.method_41185().method_26941(var1, var3, var5);
      }

      return false;
   }

   @Override
   public boolean method_26944(double var1, double var3, int var5, double var6, double var8) {
      if (!super.method_26944(var1, var3, var5, var6, var8)) {
         if (this.method_11709() && var5 == 0 && this.field_12758) {
            if (!(var3 < (double)this.field_12765)) {
               if (!(var3 > (double)this.field_12755)) {
                  double var12 = (double)this.method_11714();
                  if (var12 < 1.0) {
                     var12 = 1.0;
                  }

                  int var14 = (int)((float)((this.field_12755 - this.field_12765) * (this.field_12755 - this.field_12765)) / (float)this.method_11718());
                  var14 = MathHelper.clamp(var14, 32, this.field_12755 - this.field_12765 - 8);
                  double var15 = var12 / (double)(this.field_12755 - this.field_12765 - var14);
                  if (var15 < 1.0) {
                     var15 = 1.0;
                  }

                  this.field_12769 += var8 * var15;
                  this.method_11715();
               } else {
                  this.field_12769 = (double)this.method_11714();
               }
            } else {
               this.field_12769 = 0.0;
            }

            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean method_26945(double var1, double var3, double var5) {
      if (this.method_11709()) {
         this.field_12769 = this.field_12769 - var5 * (double)this.field_12770 / 2.0;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (this.method_11709()) {
         if (!super.method_26946(var1, var2, var3)) {
            if (var1 != 264) {
               if (var1 != 265) {
                  return false;
               } else {
                  this.method_11724(-1);
                  return true;
               }
            } else {
               this.method_11724(1);
               return true;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public void method_11724(int var1) {
   }

   @Override
   public boolean method_26938(char var1, int var2) {
      return this.method_11709() ? super.method_26938(var1, var2) : false;
   }

   @Override
   public boolean method_26937(double var1, double var3) {
      return this.method_11721(var1, var3);
   }

   public int method_11732() {
      return 220;
   }

   public void method_11712(class_7966 var1, int var2, int var3, int var4, int var5, float var6) {
      int var9 = this.method_11725();
      class_8042 var10 = class_8042.method_36499();
      class_9633 var11 = var10.method_36501();

      for (int var12 = 0; var12 < var9; var12++) {
         int var13 = var3 + var12 * this.field_12770 + this.field_12763;
         int var14 = this.field_12770 - 4;
         if (var13 > this.field_12755 || var13 + var14 < this.field_12765) {
            this.method_11702(var12, var2, var13, var6);
         }

         if (this.field_12754 && this.method_11722(var12)) {
            int var15 = this.field_12762 + this.field_12760 / 2 - this.method_11732() / 2;
            int var16 = this.field_12762 + this.field_12760 / 2 + this.method_11732() / 2;
            RenderSystem.method_16354();
            float var17 = !this.method_11717() ? 0.5F : 1.0F;
            RenderSystem.color4f(var17, var17, var17, 1.0F);
            var11.method_44471(7, class_7985.field_40915);
            var11.method_35761((double)var15, (double)(var13 + var14 + 2), 0.0).method_35735();
            var11.method_35761((double)var16, (double)(var13 + var14 + 2), 0.0).method_35735();
            var11.method_35761((double)var16, (double)(var13 - 2), 0.0).method_35735();
            var11.method_35761((double)var15, (double)(var13 - 2), 0.0).method_35735();
            var10.method_36500();
            RenderSystem.color4f(0.0F, 0.0F, 0.0F, 1.0F);
            var11.method_44471(7, class_7985.field_40915);
            var11.method_35761((double)(var15 + 1), (double)(var13 + var14 + 1), 0.0).method_35735();
            var11.method_35761((double)(var16 - 1), (double)(var13 + var14 + 1), 0.0).method_35735();
            var11.method_35761((double)(var16 - 1), (double)(var13 - 1), 0.0).method_35735();
            var11.method_35761((double)(var15 + 1), (double)(var13 - 1), 0.0).method_35735();
            var10.method_36500();
            RenderSystem.method_16432();
         }

         if (var13 + this.field_12770 >= this.field_12765 && var13 <= this.field_12755) {
            this.method_11704(var1, var12, var2, var13, var14, var4, var5, var6);
         }
      }
   }

   public boolean method_11717() {
      return false;
   }

   public int method_11719() {
      return this.field_12760 / 2 + 124;
   }

   public void method_11713(int var1, int var2, int var3, int var4) {
      class_8042 var7 = class_8042.method_36499();
      class_9633 var8 = var7.method_36501();
      this.field_12768.getTextureManager().bindTexture(AbstractGui.field_10505);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var9 = 32.0F;
      var8.method_44471(7, class_7985.field_40905);
      var8.method_35761((double)this.field_12762, (double)var2, 0.0).method_35745(0.0F, (float)var2 / 32.0F).method_35743(64, 64, 64, var4).method_35735();
      var8.method_35761((double)(this.field_12762 + this.field_12760), (double)var2, 0.0)
         .method_35745((float)this.field_12760 / 32.0F, (float)var2 / 32.0F)
         .method_35743(64, 64, 64, var4)
         .method_35735();
      var8.method_35761((double)(this.field_12762 + this.field_12760), (double)var1, 0.0)
         .method_35745((float)this.field_12760 / 32.0F, (float)var1 / 32.0F)
         .method_35743(64, 64, 64, var3)
         .method_35735();
      var8.method_35761((double)this.field_12762, (double)var1, 0.0).method_35745(0.0F, (float)var1 / 32.0F).method_35743(64, 64, 64, var3).method_35735();
      var7.method_36500();
   }

   public void method_11728(int var1) {
      this.field_12762 = var1;
      this.field_12756 = var1 + this.field_12760;
   }

   public int method_11729() {
      return this.field_12770;
   }
}
