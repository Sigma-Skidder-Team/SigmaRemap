package remapped;

import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import java.util.List;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

public class class_2130 extends class_2089 {
   private static final Ordering<class_753> field_10660 = Ordering.from(new class_1684(null));
   private final MinecraftClient field_10666;
   private final class_3062 field_10663;
   private ITextComponent field_10665;
   private ITextComponent field_10662;
   private long field_10661;
   private boolean field_10664;

   public class_2130(MinecraftClient var1, class_3062 var2) {
      this.field_10666 = var1;
      this.field_10663 = var2;
   }

   public ITextComponent method_9938(class_753 var1) {
      return var1.method_3410() == null
         ? this.method_9941(var1, class_3903.method_18063(var1.method_3403(), new StringTextComponent(var1.method_3392().getName())))
         : this.method_9941(var1, var1.method_3410().deepCopy());
   }

   private ITextComponent method_9941(class_753 var1, IFormattableTextComponent var2) {
      return var1.method_3393() != class_4666.field_22756 ? var2 : var2.mergeStyle(TextFormatting.ITALIC);
   }

   public void method_9944(boolean var1) {
      if (var1 && !this.field_10664) {
         this.field_10661 = class_9665.method_44650();
      }

      this.field_10664 = var1;
   }

   public void method_9940(class_7966 var1, int var2, class_1097 var3, class_4399 var4) {
      class_1092 var7 = this.field_10666.field_9632.field_30532;
      List var8 = field_10660.sortedCopy(var7.method_4798());
      int var9 = 0;
      int var10 = 0;

      for (class_753 var12 : var8) {
         int var13 = this.field_10666.textRenderer.method_45379(this.method_9938(var12));
         var9 = Math.max(var9, var13);
         if (var4 != null && var4.method_20483() != class_8792.field_44982) {
            var13 = this.field_10666.textRenderer.method_45395(" " + var3.method_4855(var12.method_3392().getName(), var4).method_38146());
            var10 = Math.max(var10, var13);
         }
      }

      var8 = var8.subList(0, Math.min(var8.size(), 80));
      int var37 = var8.size();
      int var38 = var37;

      int var40;
      for (var40 = 1; var38 > 20; var38 = (var37 + var40 - 1) / var40) {
         var40++;
      }

      boolean var14 = this.field_10666.method_8566() || this.field_10666.method_8614().method_9091().method_23503();
      int var15;
      if (var4 == null) {
         var15 = 0;
      } else if (var4.method_20483() != class_8792.field_44982) {
         var15 = var10;
      } else {
         var15 = 90;
      }

      int var16 = Math.min(var40 * ((!var14 ? 0 : 9) + var9 + var15 + 13), var2 - 50) / var40;
      int var17 = var2 / 2 - (var16 * var40 + (var40 - 1) * 5) / 2;
      int var18 = 10;
      int var19 = var16 * var40 + (var40 - 1) * 5;
      List var20 = null;
      if (this.field_10662 != null) {
         var20 = this.field_10666.textRenderer.method_45391(this.field_10662, var2 - 50);

         for (class_7107 var22 : var20) {
            var19 = Math.max(var19, this.field_10666.textRenderer.method_45400(var22));
         }
      }

      List var42 = null;
      if (this.field_10665 != null) {
         var42 = this.field_10666.textRenderer.method_45391(this.field_10665, var2 - 50);

         for (class_7107 var23 : var42) {
            var19 = Math.max(var19, this.field_10666.textRenderer.method_45400(var23));
         }
      }

      if (var20 != null) {
         method_9774(var1, var2 / 2 - var19 / 2 - 1, var18 - 1, var2 / 2 + var19 / 2 + 1, var18 + var20.size() * 9, Integer.MIN_VALUE);

         for (class_7107 var46 : var20) {
            int var24 = this.field_10666.textRenderer.method_45400(var46);
            this.field_10666.textRenderer.method_45402(var1, var46, (float)(var2 / 2 - var24 / 2), (float)var18, -1);
            var18 += 9;
         }

         var18++;
      }

      method_9774(var1, var2 / 2 - var19 / 2 - 1, var18 - 1, var2 / 2 + var19 / 2 + 1, var18 + var38 * 9, Integer.MIN_VALUE);
      int var45 = this.field_10666.field_9577.method_40881(553648127);

      for (int var47 = 0; var47 < var37; var47++) {
         int var49 = var47 / var38;
         int var25 = var47 % var38;
         int var26 = var17 + var49 * var16 + var49 * 5;
         int var27 = var18 + var25 * 9;
         method_9774(var1, var26, var27, var26 + var16, var27 + 8, var45);
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_3542.method_16374();
         class_3542.method_16488();
         class_3542.method_16437();
         if (var47 < var8.size()) {
            class_753 var28 = (class_753)var8.get(var47);
            GameProfile var29 = var28.method_3392();
            if (var14) {
               class_704 var30 = this.field_10666.field_9601.method_25862(var29.getId());
               boolean var31 = var30 != null
                  && var30.method_3168(class_7742.field_39260)
                  && ("Dinnerbone".equals(var29.getName()) || "Grumm".equals(var29.getName()));
               this.field_10666.method_8577().method_35674(var28.method_3402());
               int var32 = 8 + (!var31 ? 0 : 8);
               int var33 = 8 * (!var31 ? 1 : -1);
               class_2089.method_9780(var1, var26, var27, 8, 8, 8.0F, (float)var32, 8, var33, 64, 64);
               if (var30 != null && var30.method_3168(class_7742.field_39259)) {
                  int var34 = 8 + (!var31 ? 0 : 8);
                  int var35 = 8 * (!var31 ? 1 : -1);
                  class_2089.method_9780(var1, var26, var27, 8, 8, 40.0F, (float)var34, 8, var35, 64, 64);
               }

               var26 += 9;
            }

            this.field_10666
               .textRenderer
               .method_45392(var1, this.method_9938(var28), (float)var26, (float)var27, var28.method_3393() != class_4666.field_22756 ? -1 : -1862270977);
            if (var4 != null && var28.method_3393() != class_4666.field_22756) {
               int var52 = var26 + var9 + 1;
               int var53 = var52 + var15;
               if (var53 - var52 > 5) {
                  this.method_9945(var4, var27, var29.getName(), var52, var53, var28, var1);
               }
            }

            this.method_9943(var1, var16, var26 - (!var14 ? 0 : 9), var27, var28);
         }
      }

      if (var42 != null) {
         var18 = var18 + var38 * 9 + 1;
         method_9774(var1, var2 / 2 - var19 / 2 - 1, var18 - 1, var2 / 2 + var19 / 2 + 1, var18 + var42.size() * 9, Integer.MIN_VALUE);

         for (class_7107 var50 : var42) {
            int var51 = this.field_10666.textRenderer.method_45400(var50);
            this.field_10666.textRenderer.method_45402(var1, var50, (float)(var2 / 2 - var51 / 2), (float)var18, -1);
            var18 += 9;
         }
      }
   }

   public void method_9943(class_7966 var1, int var2, int var3, int var4, class_753 var5) {
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_10666.method_8577().method_35674(field_10507);
      boolean var8 = false;
      byte var9;
      if (var5.method_3394() >= 0) {
         if (var5.method_3394() >= 150) {
            if (var5.method_3394() >= 300) {
               if (var5.method_3394() >= 600) {
                  if (var5.method_3394() >= 1000) {
                     var9 = 4;
                  } else {
                     var9 = 3;
                  }
               } else {
                  var9 = 2;
               }
            } else {
               var9 = 1;
            }
         } else {
            var9 = 0;
         }
      } else {
         var9 = 5;
      }

      this.method_9776(this.method_9777() + 100);
      this.method_9781(var1, var3 + var2 - 11, var4, 0, 176 + var9 * 8, 10, 8);
      this.method_9776(this.method_9777() - 100);
   }

   private void method_9945(class_4399 var1, int var2, String var3, int var4, int var5, class_753 var6, class_7966 var7) {
      int var10 = var1.method_20486().method_4855(var3, var1).method_38146();
      if (var1.method_20483() != class_8792.field_44982) {
         String var11 = TextFormatting.YELLOW + "" + var10;
         this.field_10666.textRenderer.method_45390(var7, var11, (float)(var5 - this.field_10666.textRenderer.method_45395(var11)), (float)var2, 16777215);
      } else {
         this.field_10666.method_8577().method_35674(field_10507);
         long var12 = class_9665.method_44650();
         if (this.field_10661 == var6.method_3391()) {
            if (var10 >= var6.method_3407()) {
               if (var10 > var6.method_3407()) {
                  var6.method_3405(var12);
                  var6.method_3398((long)(this.field_10663.method_13995() + 10));
               }
            } else {
               var6.method_3405(var12);
               var6.method_3398((long)(this.field_10663.method_13995() + 20));
            }
         }

         if (var12 - var6.method_3408() > 1000L || this.field_10661 != var6.method_3391()) {
            var6.method_3406(var10);
            var6.method_3399(var10);
            var6.method_3405(var12);
         }

         var6.method_3400(this.field_10661);
         var6.method_3406(var10);
         int var14 = class_9299.method_42816((float)Math.max(var10, var6.method_3396()) / 2.0F);
         int var15 = Math.max(class_9299.method_42816((float)(var10 / 2)), Math.max(class_9299.method_42816((float)(var6.method_3396() / 2)), 10));
         boolean var16 = var6.method_3411() > (long)this.field_10663.method_13995()
            && (var6.method_3411() - (long)this.field_10663.method_13995()) / 3L % 2L == 1L;
         if (var14 > 0) {
            int var17 = class_9299.method_42848(Math.min((float)(var5 - var4 - 4) / (float)var15, 9.0F));
            if (var17 <= 3) {
               float var18 = class_9299.method_42828((float)var10 / 20.0F, 0.0F, 1.0F);
               int var19 = (int)((1.0F - var18) * 255.0F) << 16 | (int)(var18 * 255.0F) << 8;
               String var20 = "" + (float)var10 / 2.0F;
               if (var5 - this.field_10666.textRenderer.method_45395(var20 + "hp") >= var4) {
                  var20 = var20 + "hp";
               }

               this.field_10666
                  .textRenderer
                  .method_45390(var7, var20, (float)((var5 + var4) / 2 - this.field_10666.textRenderer.method_45395(var20) / 2), (float)var2, var19);
            } else {
               for (int var21 = var14; var21 < var15; var21++) {
                  this.method_9781(var7, var4 + var21 * var17, var2, !var16 ? 16 : 25, 0, 9, 9);
               }

               for (int var22 = 0; var22 < var14; var22++) {
                  this.method_9781(var7, var4 + var22 * var17, var2, !var16 ? 16 : 25, 0, 9, 9);
                  if (var16) {
                     if (var22 * 2 + 1 < var6.method_3396()) {
                        this.method_9781(var7, var4 + var22 * var17, var2, 70, 0, 9, 9);
                     }

                     if (var22 * 2 + 1 == var6.method_3396()) {
                        this.method_9781(var7, var4 + var22 * var17, var2, 79, 0, 9, 9);
                     }
                  }

                  if (var22 * 2 + 1 < var10) {
                     this.method_9781(var7, var4 + var22 * var17, var2, var22 < 10 ? 52 : 160, 0, 9, 9);
                  }

                  if (var22 * 2 + 1 == var10) {
                     this.method_9781(var7, var4 + var22 * var17, var2, var22 < 10 ? 61 : 169, 0, 9, 9);
                  }
               }
            }
         }
      }
   }

   public void method_9939(ITextComponent var1) {
      this.field_10665 = var1;
   }

   public void method_9942(ITextComponent var1) {
      this.field_10662 = var1;
   }

   public void method_9937() {
      this.field_10662 = null;
      this.field_10665 = null;
   }
}
