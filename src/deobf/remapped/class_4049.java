package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4049 extends class_2089 {
   private static final Logger field_19693 = LogManager.getLogger();
   private final MinecraftClient field_19686;
   private final List<String> field_19684 = Lists.newArrayList();
   private final List<class_8618<ITextComponent>> field_19691 = Lists.newArrayList();
   private final List<class_8618<class_7107>> field_19694 = Lists.newArrayList();
   private final Deque<ITextComponent> field_19692 = Queues.newArrayDeque();
   private int field_19689;
   private boolean field_19685;
   private long field_19688 = 0L;
   private int field_19690 = 0;

   public class_4049(MinecraftClient var1) {
      this.field_19686 = var1;
   }

   public void method_18678(class_7966 var1, int var2) {
      int var5 = this.method_18700();
      if (this.field_19690 != var5) {
         this.field_19690 = var5;
         this.method_18693();
      }

      if (!this.method_18698()) {
         this.method_18685();
         int var6 = this.method_18681();
         int var7 = this.field_19694.size();
         if (var7 > 0) {
            boolean var8 = false;
            if (this.method_18695()) {
               var8 = true;
            }

            double var9 = this.method_18689();
            int var11 = class_9299.method_42815((double)this.method_18700() / var9);
            class_3542.method_16438();
            class_3542.method_16413(2.0F, 8.0F, 0.0F);
            class_3542.method_16356(var9, var9, 1.0);
            double var12 = this.field_19686.gameOptions.field_45402 * 0.9F + 0.1F;
            double var14 = this.field_19686.gameOptions.field_45563;
            double var16 = 9.0 * (this.field_19686.gameOptions.field_45465 + 1.0);
            double var18 = -8.0 * (this.field_19686.gameOptions.field_45465 + 1.0) + 4.0 * this.field_19686.gameOptions.field_45465;
            int var20 = 0;

            for (int var21 = 0; var21 + this.field_19689 < this.field_19694.size() && var21 < var6; var21++) {
               class_8618 var22 = this.field_19694.get(var21 + this.field_19689);
               if (var22 != null) {
                  int var23 = var2 - var22.method_39606();
                  if (var23 < 200 || var8) {
                     double var24 = !var8 ? method_18699(var23) : 1.0;
                     int var26 = (int)(255.0 * var24 * var12);
                     int var27 = (int)(255.0 * var24 * var14);
                     var20++;
                     if (var26 > 3) {
                        boolean var28 = false;
                        double var29 = (double)(-var21) * var16;
                        var1.method_36063();
                        var1.method_36065(0.0, 0.0, 50.0);
                        if (this.field_19686.gameOptions.field_45574 == 5) {
                           var11 = this.field_19686.textRenderer.method_45400((class_7107)var22.method_39608()) - 2;
                        }

                        if (this.field_19686.gameOptions.field_45574 != 3) {
                           method_9774(var1, -2, (int)(var29 - var16), 0 + var11 + 4, (int)var29, var27 << 24);
                        }

                        class_3542.method_16488();
                        var1.method_36065(0.0, 0.0, 50.0);
                        if (this.field_19686.gameOptions.field_45472) {
                           this.field_19686
                              .textRenderer
                              .method_45402(var1, (class_7107)var22.method_39608(), 0.0F, (float)((int)(var29 + var18)), 16777215 + (var26 << 24));
                        } else {
                           this.field_19686
                              .textRenderer
                              .method_45382(var1, (class_7107)var22.method_39608(), 0.0F, (float)((int)(var29 + var18)), 16777215 + (var26 << 24));
                        }

                        class_3542.method_16458();
                        class_3542.method_16448();
                        var1.method_36064();
                     }
                  }
               }
            }

            if (!this.field_19692.isEmpty()) {
               int var33 = (int)(128.0 * var12);
               int var35 = (int)(255.0 * var14);
               var1.method_36063();
               var1.method_36065(0.0, 0.0, 50.0);
               method_9774(var1, -2, 0, var11 + 4, 9, var35 << 24);
               class_3542.method_16488();
               var1.method_36065(0.0, 0.0, 50.0);
               this.field_19686
                  .textRenderer
                  .method_45392(var1, new TranslationTextComponent("chat.queue", this.field_19692.size()), 0.0F, 1.0F, 16777215 + (var33 << 24));
               var1.method_36064();
               class_3542.method_16458();
               class_3542.method_16448();
            }

            if (var8) {
               byte var34 = 9;
               class_3542.method_16413(-3.0F, 0.0F, 0.0F);
               int var36 = var7 * var34 + var7;
               int var37 = var20 * var34 + var20;
               int var31 = this.field_19689 * var37 / var7;
               int var32 = var37 * var37 / var36;
               if (var36 != var37) {
                  int var38 = var31 <= 0 ? 96 : 170;
                  int var39 = !this.field_19685 ? 3355562 : 13382451;
                  method_9774(var1, 0, -var31, 2, -var31 - var32, var39 + (var38 << 24));
                  method_9774(var1, 2, -var31, 1, -var31 - var32, 13421772 + (var38 << 24));
               }
            }

            class_3542.method_16489();
         }
      }
   }

   private boolean method_18698() {
      return this.field_19686.gameOptions.field_45443 == class_1803.field_9186;
   }

   private static double method_18699(int var0) {
      double var3 = (double)var0 / 200.0;
      var3 = 1.0 - var3;
      var3 *= 10.0;
      var3 = class_9299.method_42827(var3, 0.0, 1.0);
      return var3 * var3;
   }

   public void method_18690(boolean var1) {
      this.field_19692.clear();
      this.field_19694.clear();
      this.field_19691.clear();
      if (var1) {
         this.field_19684.clear();
      }
   }

   public void method_18676(ITextComponent var1) {
      this.method_18684(var1, 0);
   }

   public void method_18684(ITextComponent var1, int var2) {
      this.method_18694(var1, var2, this.field_19686.field_9614.method_13995(), false);
      field_19693.info("[CHAT] {}", var1.getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n"));
   }

   private void method_18694(ITextComponent var1, int var2, int var3, boolean var4) {
      if (var2 != 0) {
         this.method_18692(var2);
      }

      int var7 = class_9299.method_42847((double)this.method_18700() / this.method_18689());
      List var8 = class_1091.method_4783(var1, var7, this.field_19686.textRenderer);
      boolean var9 = this.method_18695();

      for (class_7107 var11 : var8) {
         if (var9 && this.field_19689 > 0) {
            this.field_19685 = true;
            this.method_18687(1.0);
         }

         this.field_19694.add(0, new class_8618<class_7107>(var3, var11, var2));
      }

      while (this.field_19694.size() > 100) {
         this.field_19694.remove(this.field_19694.size() - 1);
      }

      if (!var4) {
         this.field_19691.add(0, new class_8618<ITextComponent>(var3, var1, var2));

         while (this.field_19691.size() > 100) {
            this.field_19691.remove(this.field_19691.size() - 1);
         }
      }
   }

   public void method_18693() {
      this.field_19694.clear();
      this.method_18691();

      for (int var3 = this.field_19691.size() - 1; var3 >= 0; var3--) {
         class_8618 var4 = this.field_19691.get(var3);
         this.method_18694((ITextComponent)var4.method_39608(), var4.method_39607(), var4.method_39606(), true);
      }
   }

   public List<String> method_18683() {
      return this.field_19684;
   }

   public void method_18697(String var1) {
      if (this.field_19684.isEmpty() || !this.field_19684.get(this.field_19684.size() - 1).equals(var1)) {
         this.field_19684.add(var1);
      }
   }

   public void method_18691() {
      this.field_19689 = 0;
      this.field_19685 = false;
   }

   public void method_18687(double var1) {
      this.field_19689 = (int)((double)this.field_19689 + var1);
      int var5 = this.field_19694.size();
      if (this.field_19689 > var5 - this.method_18681()) {
         this.field_19689 = var5 - this.method_18681();
      }

      if (this.field_19689 <= 0) {
         this.field_19689 = 0;
         this.field_19685 = false;
      }
   }

   public boolean method_18696(double var1, double var3) {
      if (this.method_18695() && !this.field_19686.gameOptions.field_45567 && !this.method_18698() && !this.field_19692.isEmpty()) {
         double var7 = var1 - 2.0;
         double var9 = (double)this.field_19686.method_8552().method_43177() - var3 - 40.0;
         if (var7 <= (double)class_9299.method_42847((double)this.method_18700() / this.method_18689())
            && var9 < 0.0
            && var9 > (double)class_9299.method_42847(-9.0 * this.method_18689())) {
            this.method_18676(this.field_19692.remove());
            this.field_19688 = System.currentTimeMillis();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Nullable
   public Style method_18680(double var1, double var3) {
      if (this.method_18695() && !this.field_19686.gameOptions.field_45567 && !this.method_18698()) {
         double var7 = var1 - 2.0;
         double var9 = (double)this.field_19686.method_8552().method_43177() - var3 - 40.0;
         var7 = (double)class_9299.method_42847(var7 / this.method_18689());
         var9 = (double)class_9299.method_42847(var9 / (this.method_18689() * (this.field_19686.gameOptions.field_45465 + 1.0)));
         if (!(var7 < 0.0) && !(var9 < 0.0)) {
            int var11 = Math.min(this.method_18681(), this.field_19694.size());
            if (var7 <= (double)class_9299.method_42847((double)this.method_18700() / this.method_18689()) && var9 < (double)(9 * var11 + var11)) {
               int var12 = (int)(var9 / 9.0 + (double)this.field_19689);
               if (var12 >= 0 && var12 < this.field_19694.size()) {
                  class_8618 var13 = this.field_19694.get(var12);
                  return this.field_19686.textRenderer.method_45381().func_243239_a((class_7107)var13.method_39608(), (int)var7);
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private boolean method_18695() {
      return this.field_19686.field_9623 instanceof class_5766;
   }

   public void method_18692(int var1) {
      this.field_19694.removeIf(var1x -> var1x.method_39607() == var1);
      this.field_19691.removeIf(var1x -> var1x.method_39607() == var1);
   }

   public int method_18700() {
      int var3 = method_18686(this.field_19686.gameOptions.field_45388);
      Window var4 = MinecraftClient.getInstance().method_8552();
      int var5 = (int)((double)(var4.method_43178() - 3) / var4.method_43189());
      return class_9299.method_42829(var3, 0, var5);
   }

   public int method_18677() {
      return method_18688(
         (!this.method_18695() ? this.field_19686.gameOptions.field_45488 : this.field_19686.gameOptions.field_45480)
            / (this.field_19686.gameOptions.field_45465 + 1.0)
      );
   }

   public double method_18689() {
      return this.field_19686.gameOptions.field_45419;
   }

   public static int method_18686(double var0) {
      short var4 = 320;
      byte var5 = 40;
      return class_9299.method_42847(var0 * 280.0 + 40.0);
   }

   public static int method_18688(double var0) {
      short var4 = 180;
      byte var5 = 20;
      return class_9299.method_42847(var0 * 160.0 + 20.0);
   }

   public int method_18681() {
      return this.method_18677() / 9;
   }

   private long method_18679() {
      return (long)(this.field_19686.gameOptions.field_45479 * 1000.0);
   }

   private void method_18685() {
      if (!this.field_19692.isEmpty()) {
         long var3 = System.currentTimeMillis();
         if (var3 - this.field_19688 >= this.method_18679()) {
            this.method_18676(this.field_19692.remove());
            this.field_19688 = var3;
         }
      }
   }

   public void method_18682(ITextComponent var1) {
      if (!(this.field_19686.gameOptions.field_45479 <= 0.0)) {
         long var4 = System.currentTimeMillis();
         if (var4 - this.field_19688 < this.method_18679()) {
            this.field_19692.add(var1);
         } else {
            this.method_18676(var1);
            this.field_19688 = var4;
         }
      } else {
         this.method_18676(var1);
      }
   }
}
