package remapped;

import java.awt.Color;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class ActiveModsModule extends Module {
   private List<Module> field_43173 = new ArrayList<Module>();
   public int field_43171 = 0;
   public int field_43170;
   public HashMap<Module, class_2440> field_43168 = new HashMap<Module, class_2440>();
   public FontRenderer field_43169 = class_5320.field_27152;

   public ActiveModsModule() {
      super(Category.GUI, "ActiveMods", "Renders active mods");
      this.addSetting(new ModeSetting("Size", "The font size", 0, "Normal", "Small", "Tiny"));
      this.addSetting(new BooleanSetting("Animations", "Scale in animation", true));
      this.addSetting(new BooleanSetting("Sound", "Toggle sound", true));
      this.method_41996().get("Size").setModeClass(var1 -> this.initModes());
      this.method_42011(false);
   }

   @Override
   public void onEnable() {
      this.initModes();
   }

   public void initModes() {
      String var3 = this.getStringValueByName("Size");
      switch (var3) {
         case "Normal":
            this.field_43169 = class_5320.field_27152;
            break;
         case "Small":
            this.field_43169 = class_5320.field_27139;
            break;
         default:
            this.field_43169 = class_5320.field_27138;
      }
   }

   @Override
   public void method_42012() {
      this.field_43173.clear();

      for (Module var4 : SigmaMainClass.getInstance().getModuleManager().getModuleMap().values()) {
         if (var4.method_42004() != Category.GUI) {
            this.field_43173.add(var4);
            this.field_43168.put(var4, new class_2440(150, 150, class_4043.field_19618));
            if (this.getBooleanValueByName("Animations")) {
               this.field_43168.get(var4).method_11119(!var4.method_42015() ? class_4043.field_19618 : class_4043.field_19620);
            }
         }
      }

      Collections.sort(this.field_43173, new class_7327(this));
   }

   @EventListen
   private void method_38820(class_4459 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (!var1.method_20668()) {
            GlStateManager.translatef(0.0F, (float)(-this.field_43170), 0.0F);
         } else {
            class_1097 var4 = client.theWorld.method_29562();
            class_4399 var5 = null;
            class_3903 var6 = var4.method_4848(client.thePlayer.method_37206());
            if (var6 != null) {
               int var7 = var6.method_23381().getColorIndex();
               if (var7 >= 0) {
                  var5 = var4.method_4833(3 + var7);
               }
            }

            class_4399 var14 = var5 == null ? var4.method_4833(1) : var5;
            Collection var8 = var4.method_4863(var14);
            int var9 = 0;

            for (Module var11 : this.field_43173) {
               if (var11.method_42015()) {
                  var9++;
               }
            }

            int var15 = 23 + var9 * (this.field_43169.method_15654() + 1);
            int var16 = var8.size();
            int var12 = MinecraftClient.getInstance().window.method_43163();
            int var13 = var12 / 2 - (9 + 5) * (var16 - 3 + 2);
            if (var15 <= var13) {
               this.field_43170 = 0;
            } else {
               this.field_43170 = (var15 - var13) / 2;
               GlStateManager.translatef(0.0F, (float)this.field_43170, 0.0F);
            }
         }
      }
   }

   @EventListen
   private void method_38819(class_3278 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         for (Module var5 : this.field_43168.keySet()) {
            if (this.getBooleanValueByName("Animations")) {
               this.field_43168.get(var5).method_11119(!var5.method_42015() ? class_4043.field_19618 : class_4043.field_19620);
            }
         }

         if (!MinecraftClient.getInstance().gameOptions.hideGUI) {
            byte var20 = 10;
            byte var21 = 1;
            int var6 = MinecraftClient.getInstance().window.method_43166();
            FontRenderer var8 = this.field_43169;
            byte var9 = -1;
            int var7 = var20 - 4;
            if (this.field_43169 == class_5320.field_27138) {
               var20 -= 3;
            }

            if (MinecraftClient.getInstance().gameOptions.field_45470) {
               var7 = (int)((double)(client.field_9614.overlayDebug.field_18917.size() * 9) * client.window.method_43189() + 7.0);
            }

            byte var10 = 0;
            int var11 = class_314.method_1444(-1, 0.95F);

            for (Module var13 : this.field_43173) {
               float var14 = 1.0F;
               float var15 = 1.0F;
               if (!this.getBooleanValueByName("Animations")) {
                  if (!var13.method_42015()) {
                     continue;
                  }
               } else {
                  class_2440 var16 = this.field_43168.get(var13);
                  if (var16.method_11123() == 0.0F) {
                     continue;
                  }

                  var15 = var16.method_11123();
                  var14 = 0.86F + 0.14F * var15;
               }

               String var22 = var13.getName2();
               GL11.glAlphaFunc(519, 0.0F);
               GL11.glPushMatrix();
               int var17 = var6 - var20 - var8.method_18547(var22) / 2;
               int var18 = var7 + 12;
               GL11.glTranslatef((float)var17, (float)var18, 0.0F);
               GL11.glScalef(var14, var14, 1.0F);
               GL11.glTranslatef((float)(-var17), (float)(-var18), 0.0F);
               float var19 = (float)Math.sqrt((double)Math.min(1.2F, (float)var8.method_18547(var22) / 63.0F));
               FontManager.method_99(
                  (float)var6 - (float)var8.method_18547(var22) * 1.5F - (float)var20 - 20.0F,
                  (float)(var7 - 20),
                  (float)var8.method_18547(var22) * 3.0F,
                  (float)(var8.method_15654() + var21 + 40),
                  NotificationIcons.altshadow,
                  class_314.method_1444(class_1255.field_6918.field_6917, 0.36F * var15 * var19)
               );
               FontManager.method_87(
                  var8, (float)(var6 - var20 - var8.method_18547(var22)), (float)var7, var22, var15 != 1.0F ? class_314.method_1444(-1, var15 * 0.95F) : var11
               );
               GL11.glPopMatrix();
               var10 -= 100;
               var7 = (int)((float)var7 + (float)(var8.method_15654() + var21) * class_9681.method_44754(var15, 0.0F, 1.0F, 1.0F));
            }

            this.field_43171 = var7;
         }
      }
   }

   public int method_38822() {
      return this.field_43171;
   }

   private Color method_38823(int var1, int var2, Color var3) {
      ByteBuffer var6 = ByteBuffer.allocateDirect(3);
      GL11.glPixelStorei(3317, 1);
      GL11.glReadPixels(var1, MinecraftClient.getInstance().window.method_43163() - var2, 1, 1, 6407, 5120, var6);
      Color var7 = new Color(var6.get(0) * 2, var6.get(1) * 2, var6.get(2) * 2, 1);
      if (var3 != null) {
         var7 = class_314.method_1388(var7, var3, 0.08F);
      }

      return var7;
   }
}
