package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.SpeedRampSetting;
import com.mentalfrostbyte.jello.unmapped.Setting;
import com.mentalfrostbyte.jello.unmapped.TextBoxSetting;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.Map.Entry;

public class Class4343 extends Class4339 implements Class4342 {
   private Module field21219;
   private boolean field21220;
   private boolean field21221;
   public int field21222 = 200;
   private HashMap<StringPanel, Setting> field21223 = new HashMap<StringPanel, Setting>();
   public HashMap<Module, IconPanel> field21224 = new HashMap<Module, IconPanel>();
   public Animation field21225 = new Animation(114, 114);
   private String field21226 = "";
   private String field21227 = "";

   public Class4343(IconPanel var1, String var2, int var3, int var4, int var5, int var6, Module var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field21219 = var7;
      this.method13300(false);
      this.method13511();
   }

   private int method13531(IconPanel var1, Setting var2, int var3, int var4, int var5) {
      switch (Class8666.field39049[var2.method18618().ordinal()]) {
         case 1:
            byte var21 = 24;
            byte var29 = 24;
            StringPanel var37 = new StringPanel(var1, var2.getName() + "lbl", var3, var4, this.field21222, 24, StringPanel.field20778, var2.getName());
            UICheckBox var45 = new UICheckBox(var1, var2.getName() + "checkbox", var1.getWidth() - 24 - var5, var4 + 6, 24, 24);
            this.field21223.put(var37, var2);
            var45.method13705((Boolean)var2.getCurrentValue(), false);
            var2.method18616(var1x -> {
               if (var45.method13703() != (Boolean)var1x.getCurrentValue()) {
                  var45.method13705((Boolean)var1x.getCurrentValue(), false);
               }
            });
            var45.method13036(var1x -> var2.method18620(((UICheckBox)var1x).method13703()));
            var45.method13261((var1x, var2x) -> var1x.setX(var2x.getWidth() - 24 - var5));
            var1.addToList(var37);
            var1.addToList(var45);
            var4 += 24 + var5;
            break;
         case 2:
            byte var20 = 126;
            byte var28 = 24;
            StringPanel var36 = new StringPanel(var1, var2.getName() + "lbl", var3, var4, this.field21222, 24, StringPanel.field20778, var2.getName());
            this.field21223.put(var36, var2);
            NumberSetting var44 = (NumberSetting)var2;
            Class4277 var47 = new Class4277(var1, var2.getName() + "slider", var1.getWidth() - 126 - var5, var4 + 6, 126, 24);
            var47.method13137().method13306(ResourceRegistry.JelloLightFont14);
            var47.method13304(Float.toString((Float)var2.getCurrentValue()));
            var47.method13140(Class4277.method13134(var44.getMin(), var44.getMax(), (Float)var44.getCurrentValue()), false);
            var47.method13143(-1.0F);
            int var13 = var44.method18636();
            var44.method18616(
               var3x -> {
                  if (Class4277.method13135(var47.method13138(), var44.getMin(), var44.getMax(), var44.getIncrement(), var13)
                     != (Float)var3x.getCurrentValue()) {
                     var47.method13304(Float.toString((Float)var3x.getCurrentValue()));
                     var47.method13140(Class4277.method13134(var44.getMin(), var44.getMax(), (Float)var3x.getCurrentValue()), false);
                  }
               }
            );
            var47.method13036(var4x -> {
               float var7 = ((Class4277)var4x).method13138();
               float var8x = Class4277.method13135(var7, var44.getMin(), var44.getMax(), var44.getIncrement(), var13);
               if (var8x != (Float)var2.getCurrentValue()) {
                  var47.method13304(Float.toString(var8x));
                  var2.method18620(var8x);
               }
            });
            var47.method13261((var1x, var2x) -> var1x.setX(var2x.getWidth() - 126 - var5));
            var1.addToList(var36);
            var1.addToList(var47);
            var4 += 24 + var5;
            break;
         case 3:
            byte var19 = 114;
            byte var27 = 27;
            StringPanel var43;
            this.addToList(
               var43 = new StringPanel(var1, var2.getName() + "lbl", var3, var4, this.field21222, var27, StringPanel.field20778, var2.getName())
            );
            this.field21223.put(var43, var2);
            Class4281 var35;
            this.addToList(
               var35 = new Class4281(
                  var1,
                  var2.getName() + "txt",
                  var1.getWidth() - var5 - var19,
                  var4 + var27 / 4 - 1,
                  var19,
                  var27,
                  Class4281.field20741,
                  (String)var2.getCurrentValue()
               )
            );
            var35.method13306(ResourceRegistry.JelloLightFont18);
            var35.method13151(var1x -> var2.method18620(var1x.method13303()));
            var2.method18616(var2x -> {
               if (var35.method13303() != ((InputSetting)var2).getCurrentValue()) {
                  var35.method13304(((InputSetting)var2).getCurrentValue());
               }
            });
            var4 += var27 + var5;
            break;
         case 4:
            byte var18 = 123;
            byte var26 = 27;
            StringPanel var34 = new StringPanel(var1, var2.getName() + "lbl", var3, var4 + 2, this.field21222, 27, StringPanel.field20778, var2.getName());
            Class4363 var42 = new Class4363(
               var1,
               var2.getName() + "btn",
               var1.getWidth() - var5,
               var4 + 6 - 1,
               123,
               27,
               ((ModeSetting)var2).method18634(),
               ((ModeSetting)var2).method18632()
            );
            this.field21223.put(var34, var2);
            var2.method18616(var2x -> {
               if (var42.method13655() != ((ModeSetting)var2).method18632()) {
                  var42.method13656(((ModeSetting)var2).method18632());
               }
            });
            var42.method13036(var2x -> {
               ((ModeSetting)var2).method18633(((Class4363)var2x).method13655());
               var42.method13656(((ModeSetting)var2).method18632());
            });
            var42.method13261((var2x, var3x) -> var2x.setX(var1.getWidth() - 123 - var5));
            var1.addToList(var34);
            var1.addToList(var42);
            var4 += 27 + var5;
         case 5:
         default:
            break;
         case 6:
            IconPanel var17 = new IconPanel(var1, var2.getName() + "view", var3, var4, var1.getWidth(), 0);
            int var25 = 0;

            for (Setting var41 : ((SubOptionSetting)var2).method18635()) {
               var25 = this.method13531(var17, var41, 0, var25, var5);
            }

            new Class6665().method20320(var17, var1);
            var17.method13261((var1x, var2x) -> var1x.setWidth(var2x.getWidth() - var5));
            var1.addToList(var17);
            var4 += var17.getHeight() + var5;
            break;
         case 7:
            byte var16 = 123;
            byte var24 = 27;
            StringPanel var32 = new StringPanel(var1, var2.getName() + "lbl", var3, var4, this.field21222, 27, StringPanel.field20778, var2.getName());
            Class4377 var40 = new Class4377(
               var1, var2.getName() + "btn", var1.getWidth() - var5, var4 + 6, 123, 27, ((TextBoxSetting)var2).method18627(), (Integer)var2.getCurrentValue()
            );
            this.field21223.put(var32, var2);
            var2.method18616(var1x -> {
               if (var40.method13720() != (Integer)var1x.getCurrentValue()) {
                  var40.method13722((Integer)var1x.getCurrentValue(), false);
               }
            });
            var40.method13036(var1x -> var2.method18620(((Class4377)var1x).method13720()));
            var40.method13261((var2x, var3x) -> var2x.setX(var1.getWidth() - 123 - var5));
            var1.addToList(var32);
            var1.addToList(var40);
            var4 += 27 + var5;
            break;
         case 8:
            short var15 = 175;
            short var23 = 200;
            StringPanel var31 = new StringPanel(var1, var2.getName() + "lbl", var3, var4, this.field21222, 200, StringPanel.field20778, var2.getName());
            Class4258 var39 = new Class4258(
               var1,
               var2.getName() + "picker",
               var1.getWidth() - var5,
               var4 + 5,
               175,
               200,
               ((BooleanSetting2)var2).method18628(),
               ((BooleanSetting2)var2).getCurrentValue().<String>toArray(new String[0])
            );
            this.field21223.put(var31, var2);
            var39.method13036(var2x -> var2.method18620(var39.method13072()));
            var39.method13261((var2x, var3x) -> var2x.setX(var1.getWidth() - 175 - var5));
            var1.addToList(var31);
            var1.addToList(var39);
            var4 += 200 + var5;
            break;
         case 9:
            short var14 = 160;
            byte var22 = 114;
            ColorSetting var30 = (ColorSetting)var2;
            StringPanel var38 = new StringPanel(var1, var2.getName() + "lbl", var3, var4, this.field21222, 24, StringPanel.field20778, var2.getName());
            Class4252 var46 = new Class4252(
               var1, var2.getName() + "color", var1.getWidth() - 160 - var5 + 10, var4, 160, 114, (Integer)var2.getCurrentValue(), var30.method18643()
            );
            this.field21223.put(var38, var2);
            var2.method18616(var3x -> {
               var46.method13048((Integer)var2.getCurrentValue());
               var46.method13046(var30.method18643());
            });
            var46.method13036(var2x -> {
               var2.isPremiumSetting(((Class4252)var2x).method13049(), false);
               var30.method18644(((Class4252)var2x).method13047());
            });
            var1.addToList(var38);
            var1.addToList(var46);
            var4 += 114 + var5 - 10;
            break;
         case 10:
            short var8 = 150;
            short var9 = 150;
            Class9318 var10 = (Class9318)var2.getCurrentValue();
            StringPanel var11 = new StringPanel(var1, var2.getName() + "lbl", var3, var4, this.field21222, 24, StringPanel.field20778, var2.getName());
            Class4250 var12 = new Class4250(
               var1,
               var2.getName() + "color",
               var1.getWidth() - 150 - var5 + 10,
               var4,
               150,
               150,
               20,
               var10.field43257,
               var10.field43258,
               var10.field43259,
               var10.field43260
            );
            this.field21223.put(var11, var2);
            var2.method18616(var2x -> {
               Class9318 var5x = (Class9318)var2.getCurrentValue();
               var12.method13041(var5x.field43257, var5x.field43258, var5x.field43259, var5x.field43260);
            });
            var12.method13036(
               var2x -> ((SpeedRampSetting)var2).method18612(var12.method13040()[0], var12.method13040()[1], var12.method13040()[2], var12.method13040()[3])
            );
            var1.addToList(var11);
            var1.addToList(var12);
            var4 += 150 + var5 - 10;
      }

      return var4 - (var5 - 10);
   }

   private void method13511() {
      byte var3 = 20;
      int var4 = 20;

      for (Setting var6 : this.field21219.getSettingMap().values()) {
         var4 = this.method13531(this, var6, 20, var4, 20);
      }

      int var17 = var4;
      if (this.field21219 instanceof ModuleWithModuleSettings) {
         ModuleWithModuleSettings var18 = (ModuleWithModuleSettings)this.field21219;

         for (Module var10 : var18.moduleArray) {
            int var11 = 0;
            IconPanel var12 = new IconPanel(this, var10.getName() + "SubView", 0, var17, this.width, this.height - var4);
            var12.method13261((var0, var1) -> var0.setWidth(var1.getWidth()));

            for (Setting var14 : var10.getSettingMap().values()) {
               var11 = this.method13531(var12, var14, 20, var11, 20);
            }

            var4 = Math.max(var4 + var11, var4);

            for (IconPanel var20 : var12.method13241()) {
               if (var20 instanceof Class4363) {
                  Class4363 var15 = (Class4363)var20;
                  int var16 = var15.method13649() + var15.getY() + var15.getHeight() + 14;
                  var11 = Math.max(var11, var16);
               }
            }

            var12.setHeight(var11);
            this.addToList(var12);
            this.field21224.put(var10, var12);
         }

         var18.method16727((var1, var2, var3x) -> this.field21224.get(var2).method13288(var3x));
         var18.method16724();
      }

      this.addToList(new IconPanel(this, "extentionhack", 0, var4, 0, 20));
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      boolean var4 = false;

      for (Entry var6 : this.field21223.entrySet()) {
         StringPanel var7 = (StringPanel)var6.getKey();
         Setting var8 = (Setting)var6.getValue();
         if (var7.method13298() && var7.method13289()) {
            var4 = true;
            this.field21226 = var8.method18626();
            this.field21227 = var8.getName();
            break;
         }
      }

      GL11.glPushMatrix();
      super.draw(var1);
      GL11.glPopMatrix();
      this.field21225.changeDirection(!var4 ? Direction.BACKWARDS : Direction.FORWARDS);
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont14,
         (float)(this.getX() + 10),
         (float)(this.getY() + this.getHeight() + 24),
         this.field21227,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F * this.field21225.calcPercent())
      );
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont14,
         (float)(this.getX() + 11),
         (float)(this.getY() + this.getHeight() + 24),
         this.field21227,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F * this.field21225.calcPercent())
      );
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont14,
         (float)(this.getX() + 14 + ResourceRegistry.JelloLightFont14.method23942(this.field21227) + 2),
         (float)(this.getY() + this.getHeight() + 24),
         this.field21226,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F * this.field21225.calcPercent())
      );
   }

   @Override
   public boolean method13525() {
      return this.field21220;
   }

   @Override
   public void method13526() {
      this.field21220 = true;
   }

   @Override
   public boolean method13527() {
      return this.field21221;
   }

   @Override
   public void method13528(boolean var1) {
      if (var1 != this.method13527()) {
         this.method13526();
      }
   }
}
