package remapped;

import com.ibm.icu.text.NumberFormat;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class class_9468 extends Module {
   private double field_48287;
   public static Map<LivingEntity, double[]> field_48289 = new HashMap<LivingEntity, double[]>();
   public static Map<LivingEntity, double[]> field_48288 = new HashMap<LivingEntity, double[]>();

   public class_9468() {
      super(Category.RENDER, "2D Esp", "You know what it is");
      this.addSetting(new BooleanSetting("Show Health", "Shows a health bar", true));
   }

   @EventListen
   public void method_43747(class_3368 var1) {
      if (this.isEnabled()) {
         this.method_43745();
      }
   }

   @EventListen
   public void method_43746(class_7285 var1) {
      if (this.isEnabled()) {
         boolean var4 = this.getModule().getBooleanValueByName("Show Invisibles");
         boolean var5 = this.getBooleanValueByName("Show Health");
         RenderSystem.method_16438();

         for (Entity var7 : field_48289.keySet()) {
            double[] var8 = field_48289.get(var7);
            double[] var9 = field_48288.get(var7);
            if (var8[3] > 0.0 || var8[3] <= 1.0) {
               RenderSystem.method_16438();
               if ((var4 || !var7.method_37109()) && var7 instanceof PlayerEntity && !(var7 instanceof ClientPlayerEntity)) {
                  this.method_43744(var7);

                  try {
                     float var10 = (float)var8[1];
                     float var11 = (float)var9[1];
                     float var12 = var11 - var10;
                     float var13 = (float)var8[0] - var12 / 4.0F;
                     float var14 = (float)var9[0] + var12 / 4.0F;
                     if (var13 > var14) {
                        var14 = var13;
                        var13 = (float)var9[0] + var12 / 4.0F;
                     }

                     RenderSystem.method_16438();
                     RenderSystem.method_16403(2.0F, 2.0F, 2.0F);
                     RenderSystem.method_16489();
                     GL11.glEnable(3042);
                     GL11.glDisable(3553);
                     int var15 = -65536;
                     if (!client.thePlayer.method_26420(var7)) {
                        var15 = -256;
                     }

                     FontManager.method_140((double)var13, (double)var10, (double)var14, (double)var11, 2.25, class_1516.method_6935(0, 0, 0, 0), var15);
                     FontManager.method_140(
                        (double)var13 - 0.5,
                        (double)var10 - 0.5,
                        (double)var14 + 0.5,
                        (double)var11 + 0.5,
                        0.9,
                        class_1516.method_6933(0, 0),
                        class_1516.method_6932(0)
                     );
                     FontManager.method_140(
                        (double)var13 + 2.5,
                        (double)var10 + 2.5,
                        (double)var14 - 2.5,
                        (double)var11 - 2.5,
                        0.9,
                        class_1516.method_6933(0, 0),
                        class_1516.method_6932(0)
                     );
                     FontManager.method_140(
                        (double)(var13 - 5.0F),
                        (double)(var10 - 1.0F),
                        (double)(var13 - 1.0F),
                        (double)var11,
                        1.0,
                        class_1516.method_6933(0, 100),
                        class_1516.method_6933(0, 255)
                     );
                     float var16 = ((PlayerEntity)var7).method_26551();
                     float[] var17 = new float[]{0.0F, 0.5F, 1.0F};
                     Color[] var18 = new Color[]{Color.RED, Color.YELLOW, Color.GREEN};
                     float var19 = var16 * 5.0F * 0.01F;
                     Color var20 = method_43749(var17, var18, var19).brighter();
                     float var21 = var11 + (var10 - var11) * var16 * 5.0F * 0.01F;
                     FontManager.method_94(var13 - 4.0F, var11 - 1.0F, var13 - 2.0F, var21, var20.getRGB());
                     if ((int)class_9687.method_44787((double)(var16 * 5.0F), 1.0) != 100 && var5) {
                        RenderSystem.method_16438();
                        RenderSystem.method_16403(2.0F, 2.0F, 2.0F);
                        String var22 = (int)class_9687.method_44787((double)(var16 * 5.0F), 1.0) + "HP";
                        RenderSystem.method_16489();
                     }
                  } catch (Exception var23) {
                  }
               }

               RenderSystem.method_16489();
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            }
         }

         GL11.glScalef(1.0F, 1.0F, 1.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.method_16489();
      }
   }

   public static Color method_43749(float[] var0, Color[] var1, float var2) {
      Object var5 = null;
      if (var0 == null) {
         throw new IllegalArgumentException("Fractions can't be null");
      } else if (var1 == null) {
         throw new IllegalArgumentException("Colours can't be null");
      } else if (var0.length != var1.length) {
         throw new IllegalArgumentException("Fractions and colours must have equal number of elements");
      } else {
         int[] var6 = method_43743(var0, var2);
         if (var6[0] >= 0 && var6[0] < var0.length && var6[1] >= 0 && var6[1] < var0.length) {
            float[] var7 = new float[]{var0[var6[0]], var0[var6[1]]};
            Color[] var8 = new Color[]{var1[var6[0]], var1[var6[1]]};
            float var9 = var7[1] - var7[0];
            float var10 = var2 - var7[0];
            float var11 = var10 / var9;
            return method_43748(var8[0], var8[1], (double)(1.0F - var11));
         } else {
            return var1[0];
         }
      }
   }

   public static int[] method_43743(float[] var0, float var1) {
      int[] var4 = new int[2];
      int var5 = 0;

      while (var5 < var0.length && var0[var5] <= var1) {
         var5++;
      }

      if (var5 >= var0.length) {
         var5 = var0.length - 1;
      }

      var4[0] = var5 - 1;
      var4[1] = var5;
      return var4;
   }

   public static Color method_43748(Color var0, Color var1, double var2) {
      float var6 = (float)var2;
      float var7 = 1.0F - var6;
      float[] var8 = new float[3];
      float[] var9 = new float[3];
      var0.getColorComponents(var8);
      var1.getColorComponents(var9);
      float var10 = var8[0] * var6 + var9[0] * var7;
      float var11 = var8[1] * var6 + var9[1] * var7;
      float var12 = var8[2] * var6 + var9[2] * var7;
      if (var10 < 0.0F) {
         var10 = 0.0F;
      } else if (var10 > 255.0F) {
         var10 = 255.0F;
      }

      if (var11 < 0.0F) {
         var11 = 0.0F;
      } else if (var11 > 255.0F) {
         var11 = 255.0F;
      }

      if (var12 < 0.0F) {
         var12 = 0.0F;
      } else if (var12 > 255.0F) {
         var12 = 255.0F;
      }

      Color var13 = null;

      try {
         var13 = new Color(var10, var11, var12);
      } catch (IllegalArgumentException var16) {
         NumberFormat var15 = NumberFormat.getNumberInstance();
         System.out.println(var15.format((double)var10) + "; " + var15.format((double)var11) + "; " + var15.format((double)var12));
         var16.printStackTrace();
      }

      return var13;
   }

   private void method_43745() {
      double var3 = client.gameRenderer.method_35949().method_41627().method_61();
      double var5 = client.gameRenderer.method_35949().method_41627().method_60();
      double var7 = client.gameRenderer.method_35949().method_41627().method_62();
      field_48289.clear();
      field_48288.clear();
      float var9 = client.theTimer.field_32600;

      for (Object var11 : client.theWorld.method_736()) {
         if (var11 instanceof PlayerEntity && !(var11 instanceof ClientPlayerEntity)) {
            PlayerEntity var12 = (PlayerEntity)var11;
            double var13 = var12.field_41713 + (var12.method_37309() - var12.field_41713) * (double)var9 - var5;
            double var15 = var12.field_41754 + (var12.getPosX() + 10.0 - (var12.field_41754 + 10.0)) * (double)var9 - var3;
            double var17 = var12.field_41724 + (var12.getPosZ() + 10.0 - (var12.field_41724 + 10.0)) * (double)var9 - var7;
            var13 += (double)var12.method_37074() + 0.2;
            double[] var19 = FontManager.method_143(var15, var13, var17);
            double var20 = Math.abs(FontManager.method_143(var15, var13 + 1.0, var17)[1] - FontManager.method_143(var15, var13, var17)[1]);

            assert var19 != null;

            if (var19[2] >= 0.0 && var19[2] < 1.0) {
               field_48289.put(var12, new double[]{var19[0], var19[1], var20, var19[2]});
               var13 = var12.field_41713 + (var12.method_37309() - 2.2 - (var12.field_41713 - 2.2)) * (double)var9 - var5;
               field_48288.put(
                  var12,
                  new double[]{
                     FontManager.method_143(var15, var13, var17)[0],
                     FontManager.method_143(var15, var13, var17)[1],
                     var20,
                     FontManager.method_143(var15, var13, var17)[2]
                  }
               );
            }
         }
      }
   }

   private void method_43744(Entity var1) {
      float var4 = 1.0F;
      float var5 = (float)((double)var4 * (client.gameOptions.field_45543 / client.gameOptions.field_45543));
      if (this.field_48287 == 0.0 || Double.isNaN(this.field_48287)) {
         this.field_48287 = (double)var5;
      }

      this.field_48287 = this.field_48287 + ((double)var5 - this.field_48287) / ((double) MinecraftClient.method_8501() * 0.7);
      var4 = (float)((double)var4 * this.field_48287);
      RenderSystem.method_16403(var4, var4, var4);
   }
}
