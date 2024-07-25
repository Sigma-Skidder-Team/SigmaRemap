package remapped;

import org.lwjgl.opengl.GL11;

public class class_7684 extends Module {
   public float field_39044 = 0.0F;

   public class_7684() {
      super(class_5664.field_28708, "Info HUD", "Shows a bunch of usefull stuff");
      this.addSetting(new ModeSetting("Cords", "Coordinate display type", 1, "None", "Normal", "Precise"));
      this.addSetting(new BooleanSetting("Show Player", "Renders a miniature version of your character", true));
      this.addSetting(new BooleanSetting("Show Armor", "Shows your armor's status", true));
      this.method_42011(false);
   }

   @class_9148
   private void method_34825(class_3278 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (!MinecraftClient.getInstance().field_9577.field_45567) {
            if (!(mcInstance.field_9623 instanceof class_5766)) {
               float var4 = mcInstance.field_9632.field_41701 % 360.0F - this.field_39044 % 360.0F;
               this.field_39044 = this.field_39044 + var4 / (float) MinecraftClient.method_8501() * 1.5F;
               boolean var5 = false;
               int var6 = 14;
               if (this.method_42007("Show Player")) {
                  var6 += this.method_34823(0, mcInstance.window.method_43163() - 23, 114);
               }

               if (this.method_42007("Show Armor")) {
                  var6 += this.method_34822(var6, mcInstance.window.method_43163() - 14) + 10;
               }

               if (!this.method_42016("Cords").equals("None")) {
                  var6 += this.method_34824(var6, 42) + 10;
               }
            }
         }
      }
   }

   public String method_34826(boolean var1) {
      return !var1
         ? Math.round(mcInstance.field_9632.method_37302())
            + " "
            + Math.round(mcInstance.field_9632.method_37309())
            + " "
            + Math.round(mcInstance.field_9632.method_37156())
         : (float)Math.round(mcInstance.field_9632.method_37302() * 10.0) / 10.0F
            + " "
            + (float)Math.round(mcInstance.field_9632.method_37309() * 10.0) / 10.0F
            + " "
            + (float)Math.round(mcInstance.field_9632.method_37156() * 10.0) / 10.0F;
   }

   public int method_34824(int var1, int var2) {
      String var5 = "Facing South";
      String var6 = this.method_34826(this.method_42016("Cords").equals("Precise"));
      class_73.method_87(
         class_5320.field_27161,
         (float)var1,
         (float)(mcInstance.window.method_43163() - var2),
         var6,
         class_314.method_1444(class_1255.field_6918.field_6917, 0.8F)
      );
      return Math.max(class_5320.field_27152.method_18547(var5), class_5320.field_27161.method_18547(var6));
   }

   public int method_34822(int var1, int var2) {
      int var5 = 0;

      for (int var6 = 0; var6 < mcInstance.field_9632.field_3853.field_36405.size(); var6++) {
         class_6098 var7 = mcInstance.field_9632.field_3853.field_36405.get(var6);
         if (!(var7.method_27960() instanceof class_221)) {
            var5++;
            int var8 = var2 - 32 * var5;
            class_73.method_126(var7, var1, var8, 32, 32);
            GL11.glDisable(2896);
            float var9 = 1.0F - (float)var7.method_28026() / (float)var7.method_27957();
            if (var9 != 1.0F) {
               class_73.method_103((float)(var1 + 2), (float)(var8 + 28), 28.0F, 5.0F, class_314.method_1444(class_1255.field_6929.field_6917, 0.5F));
               class_73.method_103(
                  (float)(var1 + 2),
                  (float)(var8 + 28),
                  28.0F * var9,
                  3.0F,
                  class_314.method_1444(!((double)var9 <= 0.2) ? class_1255.field_6932.field_6917 : class_1255.field_6928.field_6917, 0.9F)
               );
            }
         }
      }

      return var5 != 0 ? 32 : -7;
   }

   public int method_34823(int var1, int var2, int var3) {
      return var3 - 24;
   }
}
