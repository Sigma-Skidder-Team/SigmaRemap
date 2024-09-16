package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestion;
import java.util.List;

import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentUtils;

public class Class8368 {
   private final Class9518 field35920;
   private final String field35921;
   private final List<Suggestion> field35922;
   private int field35923;
   private int field35924;
   private Vector2f field35925;
   private boolean field35926;
   private int field35927;
   public final Class6850 field35928;

   public Class8368(Class6850 var0, int var1, int var2, int var3, List<Suggestion> var4, boolean var5) {
      this.field35928 = var0;
      this.field35925 = Vector2f.field37212;
      int var9 = var1 - 1;
      int var10 = !Class6850.method20846(var0) ? var2 : var2 - 3 - Math.min(var4.size(), Class6850.method20847(var0)) * 12;
      this.field35920 = new Class9518(var9, var10, var3 + 1, Math.min(var4.size(), Class6850.method20847(var0)) * 12);
      this.field35921 = Class6850.method20848(var0).getText();
      this.field35927 = !var5 ? 0 : -1;
      this.field35922 = var4;
      this.method29313(0);
   }

   public void method29308(MatrixStack var1, int var2, int var3) {
      int var6 = Math.min(this.field35922.size(), Class6850.method20847(this.field35928));
      boolean var8 = this.field35923 > 0;
      boolean var9 = this.field35922.size() > this.field35923 + var6;
      boolean var10 = var8 || var9;
      boolean var11 = this.field35925.field37220 != (float)var2 || this.field35925.field37221 != (float)var3;
      if (var11) {
         this.field35925 = new Vector2f((float)var2, (float)var3);
      }

      if (var10) {
         AbstractGui.method5686(
            var1,
            this.field35920.method36780(),
            this.field35920.method36781() - 1,
            this.field35920.method36780() + this.field35920.method36782(),
            this.field35920.method36781(),
            Class6850.method20849(this.field35928)
         );
         AbstractGui.method5686(
            var1,
            this.field35920.method36780(),
            this.field35920.method36781() + this.field35920.method36783(),
            this.field35920.method36780() + this.field35920.method36782(),
            this.field35920.method36781() + this.field35920.method36783() + 1,
            Class6850.method20849(this.field35928)
         );
         if (var8) {
            for (int var12 = 0; var12 < this.field35920.method36782(); var12++) {
               if (var12 % 2 == 0) {
                  AbstractGui.method5686(
                     var1,
                     this.field35920.method36780() + var12,
                     this.field35920.method36781() - 1,
                     this.field35920.method36780() + var12 + 1,
                     this.field35920.method36781(),
                     -1
                  );
               }
            }
         }

         if (var9) {
            for (int var15 = 0; var15 < this.field35920.method36782(); var15++) {
               if (var15 % 2 == 0) {
                  AbstractGui.method5686(
                     var1,
                     this.field35920.method36780() + var15,
                     this.field35920.method36781() + this.field35920.method36783(),
                     this.field35920.method36780() + var15 + 1,
                     this.field35920.method36781() + this.field35920.method36783() + 1,
                     -1
                  );
               }
            }
         }
      }

      boolean var16 = false;

      for (int var13 = 0; var13 < var6; var13++) {
         Suggestion var14 = this.field35922.get(var13 + this.field35923);
         AbstractGui.method5686(
            var1,
            this.field35920.method36780(),
            this.field35920.method36781() + 12 * var13,
            this.field35920.method36780() + this.field35920.method36782(),
            this.field35920.method36781() + 12 * var13 + 12,
            Class6850.method20849(this.field35928)
         );
         if (var2 > this.field35920.method36780()
            && var2 < this.field35920.method36780() + this.field35920.method36782()
            && var3 > this.field35920.method36781() + 12 * var13
            && var3 < this.field35920.method36781() + 12 * var13 + 12) {
            if (var11) {
               this.method29313(var13 + this.field35923);
            }

            var16 = true;
         }

         Class6850.method20850(this.field35928)
            .drawStringWithShadow(
               var1,
               var14.getText(),
               (float)(this.field35920.method36780() + 1),
               (float)(this.field35920.method36781() + 2 + 12 * var13),
               var13 + this.field35923 != this.field35924 ? -5592406 : -256
            );
      }

      if (var16) {
         Message var17 = this.field35922.get(this.field35924).getTooltip();
         if (var17 != null) {
            Class6850.method20851(this.field35928).method2459(var1, TextComponentUtils.toTextComponent(var17), var2, var3);
         }
      }
   }

   public boolean method29309(int var1, int var2, int var3) {
      if (this.field35920.method36784(var1, var2)) {
         int var6 = (var2 - this.field35920.method36781()) / 12 + this.field35923;
         if (var6 >= 0 && var6 < this.field35922.size()) {
            this.method29313(var6);
            this.method29314();
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean method29310(double var1) {
      int var5 = (int)(
         Class6850.method20852(this.field35928).mouseHelper.method36738()
            * (double)Class6850.method20852(this.field35928).getMainWindow().getScaledWidth()
            / (double)Class6850.method20852(this.field35928).getMainWindow().getWidth()
      );
      int var6 = (int)(
         Class6850.method20852(this.field35928).mouseHelper.method36739()
            * (double)Class6850.method20852(this.field35928).getMainWindow().getScaledHeight()
            / (double)Class6850.method20852(this.field35928).getMainWindow().getHeight()
      );
      if (!this.field35920.method36784(var5, var6)) {
         return false;
      } else {
         this.field35923 = MathHelper.method37775(
            (int)((double)this.field35923 - var1), 0, Math.max(this.field35922.size() - Class6850.method20847(this.field35928), 0)
         );
         return true;
      }
   }

   public boolean method29311(int var1, int var2, int var3) {
      if (var1 != 265) {
         if (var1 != 264) {
            if (var1 != 258) {
               if (var1 != 256) {
                  return false;
               } else {
                  this.method29316();
                  return true;
               }
            } else {
               if (this.field35926) {
                  this.method29312(!Screen.method2476() ? 1 : -1);
               }

               this.method29314();
               return true;
            }
         } else {
            this.method29312(1);
            this.field35926 = false;
            return true;
         }
      } else {
         this.method29312(-1);
         this.field35926 = false;
         return true;
      }
   }

   public void method29312(int var1) {
      this.method29313(this.field35924 + var1);
      int var4 = this.field35923;
      int var5 = this.field35923 + Class6850.method20847(this.field35928) - 1;
      if (this.field35924 >= var4) {
         if (this.field35924 > var5) {
            this.field35923 = MathHelper.method37775(
               this.field35924 + Class6850.method20853(this.field35928) - Class6850.method20847(this.field35928),
               0,
               Math.max(this.field35922.size() - Class6850.method20847(this.field35928), 0)
            );
         }
      } else {
         this.field35923 = MathHelper.method37775(this.field35924, 0, Math.max(this.field35922.size() - Class6850.method20847(this.field35928), 0));
      }
   }

   public void method29313(int var1) {
      this.field35924 = var1;
      if (this.field35924 < 0) {
         this.field35924 = this.field35924 + this.field35922.size();
      }

      if (this.field35924 >= this.field35922.size()) {
         this.field35924 = this.field35924 - this.field35922.size();
      }

      Suggestion var4 = this.field35922.get(this.field35924);
      Class6850.method20848(this.field35928)
         .method5672(Class6850.method20854(Class6850.method20848(this.field35928).getText(), var4.apply(this.field35921)));
      if (NarratorChatListener.INSTANCE.method20405() && this.field35927 != this.field35924) {
         NarratorChatListener.INSTANCE.say(this.method29315());
      }
   }

   public void method29314() {
      Suggestion var3 = this.field35922.get(this.field35924);
      Class6850.method20855(this.field35928, true);
      Class6850.method20848(this.field35928).method5635(var3.apply(this.field35921));
      int var4 = var3.getRange().getStart() + var3.getText().length();
      Class6850.method20848(this.field35928).method5650(var4);
      Class6850.method20848(this.field35928).method5668(var4);
      this.method29313(this.field35924);
      Class6850.method20855(this.field35928, false);
      this.field35926 = true;
   }

   private String method29315() {
      this.field35927 = this.field35924;
      Suggestion var3 = this.field35922.get(this.field35924);
      Message var4 = var3.getTooltip();
      return var4 == null
         ? I18n.format("narration.suggestion", this.field35924 + 1, this.field35922.size(), var3.getText())
         : I18n.format("narration.suggestion.tooltip", this.field35924 + 1, this.field35922.size(), var3.getText(), var4.getString());
   }

   public void method29316() {
      Class6850.method20856(this.field35928, null);
   }

   // $VF: synthetic method
   public static String method29317(Class8368 var0) {
      return var0.method29315();
   }
}
