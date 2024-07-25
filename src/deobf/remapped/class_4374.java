package remapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestion;
import java.util.List;
import net.minecraft.util.text.TextComponentUtils;

public class class_4374 {
   private final class_8697 field_21470;
   private final String field_21461;
   private final List<Suggestion> field_21466;
   private int field_21468;
   private int field_21469;
   private class_4895 field_21463;
   private boolean field_21462;
   private int field_21465;

   private class_4374(int var1, int var2, int var3, List<Suggestion> var4, boolean var5, boolean var6) {
      this.field_21467 = var1;
      this.field_21463 = class_4895.field_24322;
      int var9 = var2 - 1;
      int var10 = !class_1027.method_4529(var1) ? var3 : var3 - 3 - Math.min(var5.size(), class_1027.method_4550(var1)) * 12;
      this.field_21470 = new class_8697(var9, var10, var4 + 1, Math.min(var5.size(), class_1027.method_4550(var1)) * 12);
      this.field_21461 = class_1027.method_4536(var1).method_8246();
      this.field_21465 = !var6 ? 0 : -1;
      this.field_21466 = var5;
      this.method_20380(0);
   }

   public void method_20379(class_7966 var1, int var2, int var3) {
      int var6 = Math.min(this.field_21466.size(), class_1027.method_4550(this.field_21467));
      boolean var8 = this.field_21468 > 0;
      boolean var9 = this.field_21466.size() > this.field_21468 + var6;
      boolean var10 = var8 || var9;
      boolean var11 = this.field_21463.field_24326 != (float)var2 || this.field_21463.field_24329 != (float)var3;
      if (var11) {
         this.field_21463 = new class_4895((float)var2, (float)var3);
      }

      if (var10) {
         AbstractGui.method_9774(
            var1,
            this.field_21470.method_39928(),
            this.field_21470.method_39924() - 1,
            this.field_21470.method_39928() + this.field_21470.method_39926(),
            this.field_21470.method_39924(),
            class_1027.method_4537(this.field_21467)
         );
         AbstractGui.method_9774(
            var1,
            this.field_21470.method_39928(),
            this.field_21470.method_39924() + this.field_21470.method_39927(),
            this.field_21470.method_39928() + this.field_21470.method_39926(),
            this.field_21470.method_39924() + this.field_21470.method_39927() + 1,
            class_1027.method_4537(this.field_21467)
         );
         if (var8) {
            for (int var12 = 0; var12 < this.field_21470.method_39926(); var12++) {
               if (var12 % 2 == 0) {
                  AbstractGui.method_9774(
                     var1,
                     this.field_21470.method_39928() + var12,
                     this.field_21470.method_39924() - 1,
                     this.field_21470.method_39928() + var12 + 1,
                     this.field_21470.method_39924(),
                     -1
                  );
               }
            }
         }

         if (var9) {
            for (int var15 = 0; var15 < this.field_21470.method_39926(); var15++) {
               if (var15 % 2 == 0) {
                  AbstractGui.method_9774(
                     var1,
                     this.field_21470.method_39928() + var15,
                     this.field_21470.method_39924() + this.field_21470.method_39927(),
                     this.field_21470.method_39928() + var15 + 1,
                     this.field_21470.method_39924() + this.field_21470.method_39927() + 1,
                     -1
                  );
               }
            }
         }
      }

      boolean var16 = false;

      for (int var13 = 0; var13 < var6; var13++) {
         Suggestion var14 = this.field_21466.get(var13 + this.field_21468);
         AbstractGui.method_9774(
            var1,
            this.field_21470.method_39928(),
            this.field_21470.method_39924() + 12 * var13,
            this.field_21470.method_39928() + this.field_21470.method_39926(),
            this.field_21470.method_39924() + 12 * var13 + 12,
            class_1027.method_4537(this.field_21467)
         );
         if (var2 > this.field_21470.method_39928()
            && var2 < this.field_21470.method_39928() + this.field_21470.method_39926()
            && var3 > this.field_21470.method_39924() + 12 * var13
            && var3 < this.field_21470.method_39924() + 12 * var13 + 12) {
            if (var11) {
               this.method_20380(var13 + this.field_21468);
            }

            var16 = true;
         }

         class_1027.method_4548(this.field_21467)
            .method_45390(
               var1,
               var14.getText(),
               (float)(this.field_21470.method_39928() + 1),
               (float)(this.field_21470.method_39924() + 2 + 12 * var13),
               var13 + this.field_21468 != this.field_21469 ? -5592406 : -256
            );
      }

      if (var16) {
         Message var17 = this.field_21466.get(this.field_21469).getTooltip();
         if (var17 != null) {
            class_1027.method_4528(this.field_21467).method_1176(var1, TextComponentUtils.toTextComponent(var17), var2, var3);
         }
      }
   }

   public boolean method_20382(int var1, int var2, int var3) {
      if (this.field_21470.method_39929(var1, var2)) {
         int var6 = (var2 - this.field_21470.method_39924()) / 12 + this.field_21468;
         if (var6 >= 0 && var6 < this.field_21466.size()) {
            this.method_20380(var6);
            this.method_20385();
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean method_20377(double var1) {
      int var5 = (int)(
         class_1027.method_4534(this.field_21467).field_9625.method_39835()
            * (double)class_1027.method_4534(this.field_21467).method_8552().method_43165()
            / (double)class_1027.method_4534(this.field_21467).method_8552().method_43166()
      );
      int var6 = (int)(
         class_1027.method_4534(this.field_21467).field_9625.method_39832()
            * (double)class_1027.method_4534(this.field_21467).method_8552().method_43177()
            / (double)class_1027.method_4534(this.field_21467).method_8552().method_43163()
      );
      if (!this.field_21470.method_39929(var5, var6)) {
         return false;
      } else {
         this.field_21468 = MathHelper.clamp(
            (int)((double)this.field_21468 - var1), 0, Math.max(this.field_21466.size() - class_1027.method_4550(this.field_21467), 0)
         );
         return true;
      }
   }

   public boolean method_20383(int var1, int var2, int var3) {
      if (var1 != 265) {
         if (var1 != 264) {
            if (var1 != 258) {
               if (var1 != 256) {
                  return false;
               } else {
                  this.method_20381();
                  return true;
               }
            } else {
               if (this.field_21462) {
                  this.method_20378(!Screen.method_1190() ? 1 : -1);
               }

               this.method_20385();
               return true;
            }
         } else {
            this.method_20378(1);
            this.field_21462 = false;
            return true;
         }
      } else {
         this.method_20378(-1);
         this.field_21462 = false;
         return true;
      }
   }

   public void method_20378(int var1) {
      this.method_20380(this.field_21469 + var1);
      int var4 = this.field_21468;
      int var5 = this.field_21468 + class_1027.method_4550(this.field_21467) - 1;
      if (this.field_21469 >= var4) {
         if (this.field_21469 > var5) {
            this.field_21468 = MathHelper.clamp(
               this.field_21469 + class_1027.method_4544(this.field_21467) - class_1027.method_4550(this.field_21467),
               0,
               Math.max(this.field_21466.size() - class_1027.method_4550(this.field_21467), 0)
            );
         }
      } else {
         this.field_21468 = MathHelper.clamp(this.field_21469, 0, Math.max(this.field_21466.size() - class_1027.method_4550(this.field_21467), 0));
      }
   }

   public void method_20380(int var1) {
      this.field_21469 = var1;
      if (this.field_21469 < 0) {
         this.field_21469 = this.field_21469 + this.field_21466.size();
      }

      if (this.field_21469 >= this.field_21466.size()) {
         this.field_21469 = this.field_21469 - this.field_21466.size();
      }

      Suggestion var4 = this.field_21466.get(this.field_21469);
      class_1027.method_4536(this.field_21467)
         .method_8251(class_1027.method_4530(class_1027.method_4536(this.field_21467).method_8246(), var4.apply(this.field_21461)));
      if (NarratorChatListener.INSTANCE.method_34346() && this.field_21465 != this.field_21469) {
         NarratorChatListener.INSTANCE.method_34341(this.method_20376());
      }
   }

   public void method_20385() {
      Suggestion var3 = this.field_21466.get(this.field_21469);
      class_1027.method_4551(this.field_21467, true);
      class_1027.method_4536(this.field_21467).method_8281(var3.apply(this.field_21461));
      int var4 = var3.getRange().getStart() + var3.getText().length();
      class_1027.method_4536(this.field_21467).method_8266(var4);
      class_1027.method_4536(this.field_21467).method_8248(var4);
      this.method_20380(this.field_21469);
      class_1027.method_4551(this.field_21467, false);
      this.field_21462 = true;
   }

   private String method_20376() {
      this.field_21465 = this.field_21469;
      Suggestion var3 = this.field_21466.get(this.field_21469);
      Message var4 = var3.getTooltip();
      return var4 == null
         ? class_6956.method_31803("narration.suggestion", this.field_21469 + 1, this.field_21466.size(), var3.getText())
         : class_6956.method_31803("narration.suggestion.tooltip", this.field_21469 + 1, this.field_21466.size(), var3.getText(), var4.getString());
   }

   public void method_20381() {
      class_1027.method_4543(this.field_21467, null);
   }
}
