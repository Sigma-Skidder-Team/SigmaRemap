package remapped;

import java.util.ArrayList;

public class CompassModule extends Module {
   public CompassModule() {
      super(Category.GUI, "Compass", "Fornite style directions");
      this.method_42011(false);
   }

   @EventListen
   private void method_42042(class_3278 var1) {
      if (this.method_42015() && mc.field_9632 != null) {
         if (!MinecraftClient.getInstance().gameOptions.field_45567) {
            byte var4 = 5;
            byte var5 = 60;
            int var6 = !MinecraftClient.getInstance().gameOptions.field_45470 ? 0 : 60;
            ArrayList var7 = this.method_42041((int)this.method_42039(mc.field_9632.field_41701), var4);
            int var8 = (Integer)var7.get(var4);
            if (var8 == 0 && this.method_42039(mc.field_9632.field_41701) > 345.0F) {
               var8 = 360;
            }

            float var9 = 7.0F + this.method_42039(mc.field_9632.field_41701) - (float)var8;
            double var10 = (double)(var9 / 15.0F * (float)var5);
            class_73.method_99(
               (float)(mc.window.method_43166() / 2) - (float)(var4 * var5) * 1.5F,
               -40.0F,
               (float)(var4 * var5 * 2) * 1.5F,
               (float)(220 + var6),
               NotificationIcons.field_11045,
               class_314.method_1444(class_1255.field_6918.field_6917, 0.25F)
            );
            int var12 = 0;

            for (int var14 : var7) {
               var12++;
               double var15 = Math.max(0.0, Math.min(((double)(var12 * var5) - var10) / (double)((float)(var5 * var4)), 1.0));
               double var17 = Math.max(0.0, Math.min(2.25 - ((double)(var12 * var5) - var10) / (double)((float)(var5 * var4)), 1.0));
               float var19 = (float)Math.min(var15, var17);
               this.method_42040(
                  mc.window.method_43166() / 2 + var12 * var5 - (int)var10 - (var4 + 1) * var5 - 2, 30 + var6, var5, var14, var19 * 0.8F
               );
            }
         }
      }
   }

   private void method_42040(int var1, int var2, int var3, int var4, float var5) {
      String var8 = var4 + "";
      if (!var8.equals("0")) {
         if (!var8.equals("90")) {
            if (!var8.equals("180")) {
               if (!var8.equals("270")) {
                  if (!var8.equals("45")) {
                     if (!var8.equals("135")) {
                        if (!var8.equals("225")) {
                           if (var8.equals("315")) {
                              var8 = "SE";
                           }
                        } else {
                           var8 = "NE";
                        }
                     } else {
                        var8 = "NW";
                     }
                  } else {
                     var8 = "SW";
                  }
               } else {
                  var8 = "E";
               }
            } else {
               var8 = "N";
            }
         } else {
            var8 = "W";
         }
      } else {
         var8 = "S";
      }

      if (!var8.matches(".*\\d+.*")) {
         if (var8.length() != 1) {
            class_73.method_87(
               class_5320.field_27141,
               (float)(var1 + (var3 - class_5320.field_27141.method_18547(var8)) / 2),
               (float)(var2 + 20),
               var8,
               class_314.method_1444(class_1255.field_6918.field_6917, var5)
            );
         } else {
            class_73.method_87(
               class_5320.field_27147,
               (float)(var1 + (var3 - class_5320.field_27147.method_18547(var8)) / 2),
               (float)(var2 + 10),
               var8,
               class_314.method_1444(class_1255.field_6918.field_6917, var5)
            );
         }
      } else {
         class_73.method_94(
            (float)(var1 + var3 / 2 - 1),
            (float)(var2 + 28),
            (float)(var1 + var3 / 2 + 1),
            (float)(var2 + 38),
            class_314.method_1444(class_1255.field_6918.field_6917, var5 * 0.5F)
         );
         class_73.method_87(
            class_5320.field_27139,
            (float)(var1 + (var3 - class_5320.field_27139.method_18547(var8)) / 2),
            (float)(var2 + 40),
            var8,
            class_314.method_1444(class_1255.field_6918.field_6917, var5)
         );
      }
   }

   private int method_42037(int var1, int var2) {
      int var5 = Math.abs(var2 - var1) % 360;
      return var5 <= 180 ? var5 : 360 - var5;
   }

   private ArrayList<Integer> method_42041(int var1, int var2) {
      int var5 = this.method_42038(var1);
      ArrayList var6 = new ArrayList();

      for (int var7 = var5 - 15 * var2; var7 < var5; var7 += 15) {
         var6.add((int)this.method_42039((float)var7));
      }

      for (int var8 = var5; var8 < var5 + 15 * (var2 + 1); var8 += 15) {
         var6.add((int)this.method_42039((float)var8));
      }

      return var6;
   }

   private int method_42038(int var1) {
      return (var1 + 7) / 15 * 15;
   }

   public float method_42039(float var1) {
      var1 %= 360.0F;
      if (var1 < 0.0F) {
         var1 += 360.0F;
      }

      return var1;
   }
}
