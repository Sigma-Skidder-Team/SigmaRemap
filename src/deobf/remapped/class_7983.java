package remapped;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class class_7983<E extends class_4686<E>> extends FocusableGui implements IRenderable {
   public final MinecraftClient field_40883;
   public final int field_40878;
   private final List<E> field_40888 = new class_631(this, null);
   public int field_40891;
   public int field_40886;
   public int field_40876;
   public int field_40877;
   public int field_40882;
   public int field_40887;
   public boolean field_40880 = true;
   private double field_40875;
   private boolean field_40890 = true;
   private boolean field_40885;
   public int field_40874;
   private boolean field_40884;
   private E field_40889;
   private boolean field_40879 = true;
   private boolean field_40881 = true;

   public class_7983(MinecraftClient var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_40883 = var1;
      this.field_40891 = var2;
      this.field_40886 = var3;
      this.field_40876 = var4;
      this.field_40877 = var5;
      this.field_40878 = var6;
      this.field_40887 = 0;
      this.field_40882 = var2;
   }

   public void method_36188(boolean var1) {
      this.field_40890 = var1;
   }

   public void method_36203(boolean var1, int var2) {
      this.field_40885 = var1;
      this.field_40874 = var2;
      if (!var1) {
         this.field_40874 = 0;
      }
   }

   public int method_36195() {
      return 220;
   }

   @Nullable
   public E method_36226() {
      return this.field_40889;
   }

   public void method_36197(E var1) {
      this.field_40889 = (E)var1;
   }

   public void method_36201(boolean var1) {
      this.field_40879 = var1;
   }

   public void method_36207(boolean var1) {
      this.field_40881 = var1;
   }

   @Nullable
   public E method_36230() {
      return (E)super.method_41185();
   }

   @Override
   public final List<E> method_41183() {
      return this.field_40888;
   }

   public final void method_36192() {
      this.field_40888.clear();
   }

   public void method_36225(Collection<E> var1) {
      this.field_40888.clear();
      this.field_40888.addAll(var1);
   }

   public E method_36208(int var1) {
      return this.method_41183().get(var1);
   }

   public int method_36202(E var1) {
      this.field_40888.add((E)var1);
      return this.field_40888.size() - 1;
   }

   public int method_36218() {
      return this.method_41183().size();
   }

   public boolean method_36190(int var1) {
      return Objects.equals(this.method_36226(), this.method_41183().get(var1));
   }

   @Nullable
   public final E method_36193(double var1, double var3) {
      int var7 = this.method_36195() / 2;
      int var8 = this.field_40887 + this.field_40891 / 2;
      int var9 = var8 - var7;
      int var10 = var8 + var7;
      int var11 = class_9299.method_42847(var3 - (double)this.field_40876) - this.field_40874 + (int)this.method_36228() - 4;
      int var12 = var11 / this.field_40878;
      return var1 < (double)this.method_36191() && var1 >= (double)var9 && var1 <= (double)var10 && var12 >= 0 && var11 >= 0 && var12 < this.method_36218()
         ? this.method_41183().get(var12)
         : null;
   }

   public void method_36216(int var1, int var2, int var3, int var4) {
      this.field_40891 = var1;
      this.field_40886 = var2;
      this.field_40876 = var3;
      this.field_40877 = var4;
      this.field_40887 = 0;
      this.field_40882 = var1;
   }

   public void method_36212(int var1) {
      this.field_40887 = var1;
      this.field_40882 = var1 + this.field_40891;
   }

   public int method_36205() {
      return this.method_36218() * this.field_40878 + this.field_40874;
   }

   public void method_36214(int var1, int var2) {
   }

   public void method_36196(class_7966 var1, int var2, int var3, class_8042 var4) {
   }

   public void method_36199(class_7966 var1) {
   }

   public void method_36220(class_7966 var1, int var2, int var3) {
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_36199(var1);
      int var7 = this.method_36191();
      int var8 = var7 + 6;
      class_8042 var9 = class_8042.method_36499();
      class_9633 var10 = var9.method_36501();
      if (this.field_40879) {
         this.field_40883.getTextureManager().bindTexture(AbstractGui.field_10505);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         float var11 = 32.0F;
         var10.method_44471(7, class_7985.field_40905);
         var10.method_35761((double)this.field_40887, (double)this.field_40877, 0.0)
            .method_35745((float)this.field_40887 / 32.0F, (float)(this.field_40877 + (int)this.method_36228()) / 32.0F)
            .method_35743(32, 32, 32, 255)
            .method_35735();
         var10.method_35761((double)this.field_40882, (double)this.field_40877, 0.0)
            .method_35745((float)this.field_40882 / 32.0F, (float)(this.field_40877 + (int)this.method_36228()) / 32.0F)
            .method_35743(32, 32, 32, 255)
            .method_35735();
         var10.method_35761((double)this.field_40882, (double)this.field_40876, 0.0)
            .method_35745((float)this.field_40882 / 32.0F, (float)(this.field_40876 + (int)this.method_36228()) / 32.0F)
            .method_35743(32, 32, 32, 255)
            .method_35735();
         var10.method_35761((double)this.field_40887, (double)this.field_40876, 0.0)
            .method_35745((float)this.field_40887 / 32.0F, (float)(this.field_40876 + (int)this.method_36228()) / 32.0F)
            .method_35743(32, 32, 32, 255)
            .method_35735();
         var9.method_36500();
      }

      int var16 = this.method_36229();
      int var12 = this.field_40876 + 4 - (int)this.method_36228();
      if (this.field_40885) {
         this.method_36196(var1, var16, var12, var9);
      }

      this.method_36211(var1, var16, var12, var2, var3, var4);
      if (this.field_40881) {
         this.field_40883.getTextureManager().bindTexture(AbstractGui.field_10505);
         RenderSystem.enableDepthTest();
         RenderSystem.method_16457(519);
         float var13 = 32.0F;
         byte var14 = -100;
         var10.method_44471(7, class_7985.field_40905);
         var10.method_35761((double)this.field_40887, (double)this.field_40876, -100.0)
            .method_35745(0.0F, (float)this.field_40876 / 32.0F)
            .method_35743(64, 64, 64, 255)
            .method_35735();
         var10.method_35761((double)(this.field_40887 + this.field_40891), (double)this.field_40876, -100.0)
            .method_35745((float)this.field_40891 / 32.0F, (float)this.field_40876 / 32.0F)
            .method_35743(64, 64, 64, 255)
            .method_35735();
         var10.method_35761((double)(this.field_40887 + this.field_40891), 0.0, -100.0)
            .method_35745((float)this.field_40891 / 32.0F, 0.0F)
            .method_35743(64, 64, 64, 255)
            .method_35735();
         var10.method_35761((double)this.field_40887, 0.0, -100.0).method_35745(0.0F, 0.0F).method_35743(64, 64, 64, 255).method_35735();
         var10.method_35761((double)this.field_40887, (double)this.field_40886, -100.0)
            .method_35745(0.0F, (float)this.field_40886 / 32.0F)
            .method_35743(64, 64, 64, 255)
            .method_35735();
         var10.method_35761((double)(this.field_40887 + this.field_40891), (double)this.field_40886, -100.0)
            .method_35745((float)this.field_40891 / 32.0F, (float)this.field_40886 / 32.0F)
            .method_35743(64, 64, 64, 255)
            .method_35735();
         var10.method_35761((double)(this.field_40887 + this.field_40891), (double)this.field_40877, -100.0)
            .method_35745((float)this.field_40891 / 32.0F, (float)this.field_40877 / 32.0F)
            .method_35743(64, 64, 64, 255)
            .method_35735();
         var10.method_35761((double)this.field_40887, (double)this.field_40877, -100.0)
            .method_35745(0.0F, (float)this.field_40877 / 32.0F)
            .method_35743(64, 64, 64, 255)
            .method_35735();
         var9.method_36500();
         RenderSystem.method_16457(515);
         RenderSystem.method_16491();
         RenderSystem.enableBlend();
         RenderSystem.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26048, class_8535.field_43691);
         RenderSystem.method_16458();
         RenderSystem.method_16486(7425);
         RenderSystem.method_16354();
         byte var15 = 4;
         var10.method_44471(7, class_7985.field_40905);
         var10.method_35761((double)this.field_40887, (double)(this.field_40876 + 4), 0.0).method_35745(0.0F, 1.0F).method_35743(0, 0, 0, 0).method_35735();
         var10.method_35761((double)this.field_40882, (double)(this.field_40876 + 4), 0.0).method_35745(1.0F, 1.0F).method_35743(0, 0, 0, 0).method_35735();
         var10.method_35761((double)this.field_40882, (double)this.field_40876, 0.0).method_35745(1.0F, 0.0F).method_35743(0, 0, 0, 255).method_35735();
         var10.method_35761((double)this.field_40887, (double)this.field_40876, 0.0).method_35745(0.0F, 0.0F).method_35743(0, 0, 0, 255).method_35735();
         var10.method_35761((double)this.field_40887, (double)this.field_40877, 0.0).method_35745(0.0F, 1.0F).method_35743(0, 0, 0, 255).method_35735();
         var10.method_35761((double)this.field_40882, (double)this.field_40877, 0.0).method_35745(1.0F, 1.0F).method_35743(0, 0, 0, 255).method_35735();
         var10.method_35761((double)this.field_40882, (double)(this.field_40877 - 4), 0.0).method_35745(1.0F, 0.0F).method_35743(0, 0, 0, 0).method_35735();
         var10.method_35761((double)this.field_40887, (double)(this.field_40877 - 4), 0.0).method_35745(0.0F, 0.0F).method_35743(0, 0, 0, 0).method_35735();
         var9.method_36500();
      }

      int var17 = this.method_36209();
      if (var17 > 0) {
         RenderSystem.method_16354();
         int var18 = (int)((float)((this.field_40877 - this.field_40876) * (this.field_40877 - this.field_40876)) / (float)this.method_36205());
         var18 = class_9299.method_42829(var18, 32, this.field_40877 - this.field_40876 - 8);
         int var20 = (int)this.method_36228() * (this.field_40877 - this.field_40876 - var18) / var17 + this.field_40876;
         if (var20 < this.field_40876) {
            var20 = this.field_40876;
         }

         var10.method_44471(7, class_7985.field_40905);
         var10.method_35761((double)var7, (double)this.field_40877, 0.0).method_35745(0.0F, 1.0F).method_35743(0, 0, 0, 255).method_35735();
         var10.method_35761((double)var8, (double)this.field_40877, 0.0).method_35745(1.0F, 1.0F).method_35743(0, 0, 0, 255).method_35735();
         var10.method_35761((double)var8, (double)this.field_40876, 0.0).method_35745(1.0F, 0.0F).method_35743(0, 0, 0, 255).method_35735();
         var10.method_35761((double)var7, (double)this.field_40876, 0.0).method_35745(0.0F, 0.0F).method_35743(0, 0, 0, 255).method_35735();
         var10.method_35761((double)var7, (double)(var20 + var18), 0.0).method_35745(0.0F, 1.0F).method_35743(128, 128, 128, 255).method_35735();
         var10.method_35761((double)var8, (double)(var20 + var18), 0.0).method_35745(1.0F, 1.0F).method_35743(128, 128, 128, 255).method_35735();
         var10.method_35761((double)var8, (double)var20, 0.0).method_35745(1.0F, 0.0F).method_35743(128, 128, 128, 255).method_35735();
         var10.method_35761((double)var7, (double)var20, 0.0).method_35745(0.0F, 0.0F).method_35743(128, 128, 128, 255).method_35735();
         var10.method_35761((double)var7, (double)(var20 + var18 - 1), 0.0).method_35745(0.0F, 1.0F).method_35743(192, 192, 192, 255).method_35735();
         var10.method_35761((double)(var8 - 1), (double)(var20 + var18 - 1), 0.0).method_35745(1.0F, 1.0F).method_35743(192, 192, 192, 255).method_35735();
         var10.method_35761((double)(var8 - 1), (double)var20, 0.0).method_35745(1.0F, 0.0F).method_35743(192, 192, 192, 255).method_35735();
         var10.method_35761((double)var7, (double)var20, 0.0).method_35745(0.0F, 0.0F).method_35743(192, 192, 192, 255).method_35735();
         var9.method_36500();
      }

      this.method_36220(var1, var2, var3);
      RenderSystem.method_16432();
      RenderSystem.method_16486(7424);
      RenderSystem.enableAlphaTest();
      RenderSystem.disableBlend();
   }

   public void method_36189(E var1) {
      this.method_36222((double)(this.method_41183().indexOf(var1) * this.field_40878 + this.field_40878 / 2 - (this.field_40877 - this.field_40876) / 2));
   }

   public void method_36223(E var1) {
      int var4 = this.method_36224(this.method_41183().indexOf(var1));
      int var5 = var4 - this.field_40876 - 4 - this.field_40878;
      if (var5 < 0) {
         this.method_36200(var5);
      }

      int var6 = this.field_40877 - var4 - this.field_40878 - this.field_40878;
      if (var6 < 0) {
         this.method_36200(-var6);
      }
   }

   private void method_36200(int var1) {
      this.method_36222(this.method_36228() + (double)var1);
   }

   public double method_36228() {
      return this.field_40875;
   }

   public void method_36222(double var1) {
      this.field_40875 = class_9299.method_42827(var1, 0.0, (double)this.method_36209());
   }

   public int method_36209() {
      return Math.max(0, this.method_36205() - (this.field_40877 - this.field_40876 - 4));
   }

   public void method_36194(double var1, double var3, int var5) {
      this.field_40884 = var5 == 0 && var1 >= (double)this.method_36191() && var1 < (double)(this.method_36191() + 6);
   }

   public int method_36191() {
      return this.field_40891 / 2 + 124;
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      this.method_36194(var1, var3, var5);
      if (this.method_26937(var1, var3)) {
         class_4686 var8 = this.method_36193(var1, var3);
         if (var8 == null) {
            if (var5 == 0) {
               this.method_36214(
                  (int)(var1 - (double)(this.field_40887 + this.field_40891 / 2 - this.method_36195() / 2)),
                  (int)(var3 - (double)this.field_40876) + (int)this.method_36228() - 4
               );
               return true;
            }
         } else if (var8.method_26940(var1, var3, var5)) {
            this.method_41180(var8);
            this.method_41179(true);
            return true;
         }

         return this.field_40884;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_26941(double var1, double var3, int var5) {
      if (this.method_36230() != null) {
         this.method_36230().method_26941(var1, var3, var5);
      }

      return false;
   }

   @Override
   public boolean method_26944(double var1, double var3, int var5, double var6, double var8) {
      if (!super.method_26944(var1, var3, var5, var6, var8)) {
         if (var5 == 0 && this.field_40884) {
            if (!(var3 < (double)this.field_40876)) {
               if (!(var3 > (double)this.field_40877)) {
                  double var12 = (double)Math.max(1, this.method_36209());
                  int var14 = this.field_40877 - this.field_40876;
                  int var15 = class_9299.method_42829((int)((float)(var14 * var14) / (float)this.method_36205()), 32, var14 - 8);
                  double var16 = Math.max(1.0, var12 / (double)(var14 - var15));
                  this.method_36222(this.method_36228() + var8 * var16);
               } else {
                  this.method_36222((double)this.method_36209());
               }
            } else {
               this.method_36222(0.0);
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
      this.method_36222(this.method_36228() - var5 * (double)this.field_40878 / 2.0);
      return true;
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (!super.method_26946(var1, var2, var3)) {
         if (var1 != 264) {
            if (var1 != 265) {
               return false;
            } else {
               this.method_36206(class_792.field_4257);
               return true;
            }
         } else {
            this.method_36206(class_792.field_4255);
            return true;
         }
      } else {
         return true;
      }
   }

   public void method_36206(class_792 var1) {
      this.method_36219(var1, var0 -> true);
   }

   public void method_36215() {
      class_4686 var3 = this.method_36226();
      if (var3 != null) {
         this.method_36197((E)var3);
         this.method_36223((E)var3);
      }
   }

   public void method_36219(class_792 var1, Predicate<E> var2) {
      int var5 = var1 != class_792.field_4257 ? 1 : -1;
      if (!this.method_41183().isEmpty()) {
         int var6 = this.method_41183().indexOf(this.method_36226());

         while (true) {
            int var7 = class_9299.method_42829(var6 + var5, 0, this.method_36218() - 1);
            if (var6 == var7) {
               break;
            }

            class_4686 var8 = this.method_41183().get(var7);
            if (var2.test(var8)) {
               this.method_36197((E)var8);
               this.method_36223((E)var8);
               break;
            }

            var6 = var7;
         }
      }
   }

   @Override
   public boolean method_26937(double var1, double var3) {
      return var3 >= (double)this.field_40876 && var3 <= (double)this.field_40877 && var1 >= (double)this.field_40887 && var1 <= (double)this.field_40882;
   }

   public void method_36211(class_7966 var1, int var2, int var3, int var4, int var5, float var6) {
      int var9 = this.method_36218();
      class_8042 var10 = class_8042.method_36499();
      class_9633 var11 = var10.method_36501();

      for (int var12 = 0; var12 < var9; var12++) {
         int var13 = this.method_36224(var12);
         int var14 = this.method_36210(var12);
         if (var14 >= this.field_40876 && var13 <= this.field_40877) {
            int var15 = var3 + var12 * this.field_40878 + this.field_40874;
            int var16 = this.field_40878 - 4;
            class_4686 var17 = this.method_36208(var12);
            int var18 = this.method_36195();
            if (this.field_40890 && this.method_36190(var12)) {
               int var19 = this.field_40887 + this.field_40891 / 2 - var18 / 2;
               int var20 = this.field_40887 + this.field_40891 / 2 + var18 / 2;
               RenderSystem.method_16354();
               float var21 = !this.method_36221() ? 0.5F : 1.0F;
               RenderSystem.color4f(var21, var21, var21, 1.0F);
               var11.method_44471(7, class_7985.field_40915);
               var11.method_35761((double)var19, (double)(var15 + var16 + 2), 0.0).method_35735();
               var11.method_35761((double)var20, (double)(var15 + var16 + 2), 0.0).method_35735();
               var11.method_35761((double)var20, (double)(var15 - 2), 0.0).method_35735();
               var11.method_35761((double)var19, (double)(var15 - 2), 0.0).method_35735();
               var10.method_36500();
               RenderSystem.color4f(0.0F, 0.0F, 0.0F, 1.0F);
               var11.method_44471(7, class_7985.field_40915);
               var11.method_35761((double)(var19 + 1), (double)(var15 + var16 + 1), 0.0).method_35735();
               var11.method_35761((double)(var20 - 1), (double)(var15 + var16 + 1), 0.0).method_35735();
               var11.method_35761((double)(var20 - 1), (double)(var15 - 1), 0.0).method_35735();
               var11.method_35761((double)(var19 + 1), (double)(var15 - 1), 0.0).method_35735();
               var10.method_36500();
               RenderSystem.method_16432();
            }

            int var22 = this.method_36229();
            var17.method_21644(
               var1,
               var12,
               var13,
               var22,
               var18,
               var16,
               var4,
               var5,
               this.method_26937((double)var4, (double)var5) && Objects.equals(this.method_36193((double)var4, (double)var5), var17),
               var6
            );
         }
      }
   }

   public int method_36229() {
      return this.field_40887 + this.field_40891 / 2 - this.method_36195() / 2 + 2;
   }

   public int method_36198() {
      return this.method_36229() + this.method_36195();
   }

   public int method_36224(int var1) {
      return this.field_40876 + 4 - (int)this.method_36228() + var1 * this.field_40878 + this.field_40874;
   }

   private int method_36210(int var1) {
      return this.method_36224(var1) + this.field_40878;
   }

   public boolean method_36221() {
      return false;
   }

   public E method_36217(int var1) {
      class_4686 var4 = this.field_40888.get(var1);
      return (E)(!this.method_36204(this.field_40888.get(var1)) ? null : var4);
   }

   public boolean method_36204(E var1) {
      boolean var4 = this.field_40888.remove(var1);
      if (var4 && var1 == this.method_36226()) {
         this.method_36197(null);
      }

      return var4;
   }

   private void method_36213(class_4686<E> var1) {
      class_4686.method_21645(var1, this);
   }
}
