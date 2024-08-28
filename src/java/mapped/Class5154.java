package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.event.impl.Class4422;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.event.impl.Class4436;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5154 extends Module {
   private int field23398;
   private int field23399;
   private int field23400;
   private double field23401;
   private double field23402;
   private double field23403 = 0.0;
   private float field23404;

   public Class5154() {
      super(ModuleCategory.MOVEMENT, "AAC", "Speed for AAC");
      this.method15972(new Class6005("Mode", "Mode", 0, "Basic", "Fast1", "Fast2").method18631("Fast2"));
      this.method15972(new Class6004("Fluid Fix", "Makes your jump fluid.", true));
      this.method15972(new Class6004("Auto Jump", "Automatically jumps for you.", true));
   }

   @Override
   public void isInDevelopment() {
      this.field23398 = -1;
      this.field23399 = 0;
      this.field23403 = mc.player.getPosY();
      this.field23404 = Class9567.method37083()[0];
      this.field23400 = 0;
   }

   @Override
   public void method15965() {
      Class9567.method37093(0.27, Class9567.method37083()[0], this.field23404, 45.0F);
   }

   @EventTarget
   public void method16008(Class4396 var1) {
      if (this.method15996()) {
         if (var1.method13898() instanceof Class5473) {
            this.field23399 = 0;
         }
      }
   }

   @EventTarget
   public void method16009(Class4435 var1) {
      if (this.method15996()) {
         String var4 = this.getStringSettingValueByName("Mode");
         if (Class5628.method17730(mc.player, 0.01F)) {
            if (this.field23400 <= 1) {
               this.field23400++;
            } else {
               this.field23399 = 0;
               this.field23398 = -1;
            }

            if (Class5628.method17686() && this.method15974("Auto Jump")) {
               mc.player.method2914();
               var1.method13995(mc.player.method3433().field18049);
            }
         } else if (this.field23398 >= 0) {
            this.field23398++;
         }

         if (mc.player.field4984 == 0.0F && mc.player.field4982 == 0.0F
            || mc.player.field5037
            || mc.player.field4984 <= 0.0F) {
            this.field23399 = 0;
         }

         switch (var4) {
            case "Basic":
               this.field23401 = method16016(this.field23398, this.field23399, () -> this.field23399 = 0);
               break;
            case "Fast1":
               this.field23401 = this.method16013(this.field23398, this.field23399);
               this.field23402 = this.method16012(this.field23398);
               var1.method13995(this.field23402);
               mc.player.method3433().field18049 = this.field23402;
               break;
            case "Fast2":
               this.field23401 = this.method16015(this.field23398, this.field23399);
               this.field23402 = this.method16014(this.field23398);
               var1.method13995(this.field23402);
               mc.player.method3433().field18049 = this.field23402;
         }

         if (!Class5628.method17686()) {
            this.field23401 = 0.0;
         }

         if (mc.player.field5037) {
            this.field23401 = this.field23401 * 0.9 < 0.27 ? 0.27 : this.field23401 * 0.9;
         }

         if (this.field23398 >= 0) {
            this.field23404 = Class9567.method37092(var1, this.field23401, Class9567.method37083()[0], this.field23404, 45.0F);
         }

         Class5628.method17725(var1.method13994());
      }
   }

   @EventTarget
   public void method16010(Class4422 var1) {
      if (this.method15996()) {
         if (this.method15974("Fluid Fix")) {
            if (!mc.player.field5037 && !mc.player.field5038) {
               String var4 = this.getStringSettingValueByName("Mode");
               float var5 = 13.0F;
               if (!var4.equals("Fast1")) {
                  if (var4.equals("Basic")) {
                     return;
                  }
               } else {
                  var5 = 11.0F;
               }

               if (!((float)this.field23398 > var5) && this.field23398 >= 0) {
                  double var6 = Math.cos(Math.toRadians((double)((float)this.field23398 / var5 * 180.0F - 90.0F)));
                  mc.player.field5028.field18049 = this.field23403 + var6;
                  mc.player.field4909 = 0.0F;
               }
            } else {
               mc.player.field5028.field18049 = mc.player.method3389().field28450;
               this.field23403 = mc.player.getPosY();
               this.field23398 = -1;
            }
         }
      }
   }

   @EventTarget
   public void method16011(Class4436 var1) {
      this.field23398 = 0;
      this.field23400 = 0;
      this.field23404 = Class9567.method37083()[0];
      String var4 = this.getStringSettingValueByName("Mode");
      switch (var4) {
         case "Basic":
            if (this.field23399 < 3) {
               this.field23399++;
            }
            break;
         case "Fast1":
            if (this.field23399 < 5) {
               this.field23399++;
            }

            if (this.field23398 < 11 && this.field23398 > 0) {
               this.field23399 = 0;
            }
            break;
         case "Fast2":
            if (this.field23399 < 4) {
               this.field23399++;
            }
      }
   }

   private double method16012(int var1) {
      double var4 = mc.player.method3433().field18049;
      boolean var6 = Class5628.method17730(mc.player, 0.37F);
      double[] var7 = new double[]{0.41, 0.309, 0.21, 0.113, 0.03, -0.05, -0.12, -0.192, -0.26, -0.33, !var6 ? -0.4 : -0.0, !var6 ? -0.47 : -0.13};
      if (var1 >= 0 && var1 < var7.length) {
         var4 = var7[var1];
      }

      return var4;
   }

   private double method16013(int var1, int var2) {
      boolean var5 = Class5628.method17730(mc.player, 0.37F);
      double[] var6 = new double[]{0.497, 0.671, 0.719, 0.733, 0.738};
      double[] var7 = new double[]{0.303, 0.407, 0.436, 0.444, 0.447};
      double[] var8 = new double[]{0.0, 0.003, 0.004, 0.004, 0.004};
      double[] var9 = new double[]{0.605, 0.685, 0.708, 0.716, 0.719};
      double[] var10 = new double[]{0.367, 0.415, 0.429, 0.434, 0.434};
      if (var1 >= 0 && var2 >= 1 && var2 <= 5) {
         if (var1 != 0) {
            if (var1 != 1) {
               if (var1 == 10 && var5) {
                  this.field23401 = var9[var2 - 1];
               } else if (var1 == 11 && var5) {
                  this.field23401 = var10[var2 - 1];
               } else {
                  this.field23401 = this.field23401 - var8[var2 - 1];
               }
            } else {
               this.field23401 = var7[var2 - 1];
            }
         } else {
            this.field23401 = var6[var2 - 1];
         }

         if (var2 == 1 && var1 == 2) {
            this.field23401 -= 0.002;
         }

         if (var2 == 2 && (var1 == 2 || var1 == 3)) {
            this.field23401 -= 0.001;
         }
      }

      return this.field23401;
   }

   private double method16014(int var1) {
      double var4 = mc.player.method3433().field18049;
      boolean var6 = Class5628.method17730(mc.player, 0.37F);
      double[] var7 = new double[]{0.41, 0.309, 0.21, 0.113, 0.03, -0.06, -0.14, -0.22, -0.29, 0.0, -0.082, -0.11, 0.0, -0.18};
      if (var1 >= 0 && var1 < var7.length) {
         var4 = var7[var1];
      }

      if (var1 >= 9 && var1 <= 11 && !var6) {
         var4 -= 0.36;
      }

      if (var1 >= 12 && var1 <= 13 && !var6) {
         var4 -= 0.5;
      }

      return var4;
   }

   private double method16015(int var1, int var2) {
      boolean var5 = Class5628.method17730(mc.player, 0.37F);
      double[] var6 = new double[]{0.497, 0.709, 0.746, 0.753};
      double[] var7 = new double[]{0.303, 0.43, 0.4525, 0.456};
      double[] var8 = new double[]{0.0, 0.0036, 0.0041, 0.0042};
      double[] var9 = new double[]{0.605, 0.707, 0.728, 0.731};
      double[] var10 = new double[]{0.367, 0.429, 0.441, 0.443};
      double[] var11 = new double[]{0.668, 0.73, 0.741, 0.743};
      double[] var12 = new double[]{0.405, 0.442, 0.449, 0.45};
      if (var1 >= 0 && var2 >= 1 && var2 <= 4) {
         if (var1 != 0) {
            if (var1 != 1) {
               if (var1 == 9 && var5) {
                  this.field23401 = var9[var2 - 1];
               } else if (var1 == 10 && var5) {
                  this.field23401 = var10[var2 - 1];
               } else if (var1 == 12 && var5) {
                  this.field23401 = var11[var2 - 1];
               } else if (var1 == 13 && var5) {
                  this.field23401 = var12[var2 - 1];
               } else {
                  this.field23401 = this.field23401 - var8[var2 - 1];
               }
            } else {
               this.field23401 = var7[var2 - 1];
            }
         } else {
            this.field23401 = var6[var2 - 1];
         }

         if (var2 == 1) {
            if (var1 != 2) {
               if (var1 == 11) {
                  this.field23401 -= 0.003;
               }
            } else {
               this.field23401 -= 0.002;
            }
         }

         if (var2 == 2 && (var1 == 2 || var1 == 3)) {
            this.field23401 -= 0.001;
         }
      }

      return this.field23401;
   }

   public static double method16016(int var0, int var1, Runnable var2) {
      double var5 = 0.29;
      double var7 = 0.3019;
      double var9 = 0.0286 - (double)var0 / 1000.0;
      double[] var11 = new double[]{0.497, 0.3031, 0.302, var7, var7, var7, var7, var7, var7, var7, var7, 0.3, 0.301, 0.298, 0.297};
      double[] var12 = new double[]{0.1069, 0.0642, 0.0629, 0.0607, 0.0584, 0.0561, 0.0539, 0.0517, 0.0496, 0.0475, 0.0455, 0.045, 0.042, 0.042, 0.042};
      double[] var13 = new double[]{0.046, var9, var9, var9, var9, var9, var9, var9, var9, var9, var9, 0.018, var9 + 0.001, var9 + 0.001, var9 + 0.001};
      if (var0 >= 0) {
         if (var0 < var11.length) {
            var5 = var11[var0];
         }

         if (var1 >= 2 && var0 < var12.length) {
            var5 += var12[var0];
         }

         if (var1 >= 3 && var0 < var13.length) {
            var5 += var13[var0];
         }

         if (var0 == 12 && var1 <= 2) {
            var2.run();
         }

         if (mc.player.field4984 <= 0.0F) {
            var5 -= 0.06;
         }

         if (mc.player.field5037) {
            var5 -= 0.1;
            var2.run();
         }

         return var5;
      } else {
         return var5;
      }
   }
}