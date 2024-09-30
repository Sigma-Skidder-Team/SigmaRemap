package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.MultiUtilities;

import java.util.ArrayList;
import java.util.List;

public class Class4350 extends Class4278 {
   public static ColorHelper field21259 = new ColorHelper(
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      ClientColors.DEEP_TEAL.getColor,
      Class2218.field14488,
      Class2218.field14492
   );
   private int field21260 = this.field20912.length();
   private int field21261;
   private int field21262;

   public Class4350(IconPanel var1, String var2, int var3, int var4, int var5, int var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, field21259, var7, false);
   }

   @Override
   public void draw(float var1) {
      if (this.field20912 != null) {
         RenderUtil.drawRect((float)this.getXA(), (float)this.getYA(), (float)this.widthA, (float)this.heightA, -14144460);
         RenderUtil.method11464(
            (float)this.getXA(), (float)this.getYA(), (float)this.widthA, (float)(this.heightA - this.getYA()), 114.0F, var1
         );
         byte var4 = 30;
         ClientResource var5 = ResourceRegistry.JelloLightFont18;
         String var6 = System.getProperty("line.separator");
         String[] var7 = this.field20912.split("(?<=" + var6 + ")");
         int var8 = this.field21260;
         int var9 = -1;
         float var10 = (float)var5.getStringWidth(this.field20912.substring(0, this.field21260));

         for (int var11 = 0; var11 < var7.length; var11++) {
            List<String> var12 = this.method13587(var7[var11]);
            int var13 = 0;

            for (String var15 : var12) {
               RenderUtil.drawString(
                  var5,
                  (float)(this.getXA() + var13 + var4),
                  (float)(this.getYA() + var4 + var11 * var5.method23952()),
                  var15,
                  MultiUtilities.applyAlpha(this.method13588(var15), var1)
               );
               var13 += var5.getStringWidth(var15);
               var8 -= var15.length();
            }

            if ((var8 >= 0 || var9 != -1) && (this.field21260 != this.field20912.length() || var8 != 0 || this.field20912.endsWith(var6))) {
               if (var9 == -1) {
                  var10 -= (float)var13;
               }
            } else {
               var9 = var11;
            }

            if (this.field21260 == this.field20912.length() && var8 == 0 && this.field20912.endsWith(var6)) {
               var9 = var11 + 1;
            }
         }

         RenderUtil.drawRect(
            (float)var4 + var10,
            (float)(this.getYA() + var4 + var9 * var5.method23952()),
            (float)var4 + var10 + 1.0F,
            (float)(this.getYA() + var4 + var5.method23941(this.field20912) + var9 * var5.method23952()),
            MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
         );
         super.draw(var1);
      }
   }

   public List<String> method13587(String var1) {
      String var4 = System.getProperty("line.separator");
      String[] var5 = var1.split("(?<=[^a-zA-Z0-9'])");
      ArrayList var6 = new ArrayList();
      StringBuilder var7 = new StringBuilder("");

      for (String var11 : var5) {
         if (this.method13588(var11) == ClientColors.LIGHT_GREYISH_BLUE.getColor) {
            var7.append(var11);
         } else {
            var6.add(var7.toString());
            var6.add(var11);
            var7 = new StringBuilder("");
         }
      }

      var6.add(var7.toString());
      return var6;
   }

   public int method13588(String var1) {
      if (var1.startsWith("var") && var1.endsWith(" ")) {
         return -4363603;
      } else if (var1.startsWith("function") && var1.endsWith(" ")) {
         return -4363603;
      } else if (!var1.endsWith(".")) {
         if (!var1.startsWith("if")) {
            if (!var1.endsWith("(")) {
               return !var1.startsWith(")") ? ClientColors.LIGHT_GREYISH_BLUE.getColor : -2774170;
            } else {
               return -2774170;
            }
         } else {
            return ClientColors.LIGHT_GREYISH_BLUE.getColor;
         }
      } else {
         return -10442018;
      }
   }

   @Override
   public void charTyped(char var1) {
      super.charTyped(var1);
      if (this.method13297() && Class8906.method32486(var1) && ResourceRegistry.JelloLightFont18.getStringWidth(Character.toString(var1)) > 1) {
         this.field20912 = Class8906.method32492(this.field20912, Character.toString(var1), this.field21260);
         this.field21260++;
      }
   }

   @Override
   public void keyPressed(int var1) {
      super.keyPressed(var1);
      String var4 = System.getProperty("line.separator");
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      if (this.field20909) {
         String var5 = System.getProperty("line.separator");
         String[] var6 = this.field20912.split("(?<=" + var5 + ")");
         int var7 = (var2 - this.method13272() - ResourceRegistry.JelloLightFont18.method23952() / 2) / ResourceRegistry.JelloLightFont18.method23952() - 1;
         if (var7 > var6.length - 1) {
            var7 = var6.length - 1;
         }

         if (var7 < 0) {
            var7 = 0;
         }

         int var8 = 0;

         for (int var9 = 0; var9 < var7; var9++) {
            var8 += var6[var9].length();
         }

         this.field21260 = var8 + Class8906.method32494(var6[var7], ResourceRegistry.JelloLightFont18, (float)this.method13271(), var1, 30.0F);
         if (this.field20912.substring(0, this.field21260).endsWith(var5) && this.field21260 != this.field20912.length()) {
            this.field21260--;
         }

         this.field21260 = Math.min(Math.max(0, this.field21260), this.field20912.length());
         this.field21262 = this.field21260;
      }
   }

   public boolean method13589() {
      return false;
   }
}
