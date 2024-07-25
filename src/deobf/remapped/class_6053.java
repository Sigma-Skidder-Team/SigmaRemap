package remapped;

public class class_6053 extends Module {
   private int field_30964;
   private int field_30963;
   private int field_30960;
   private double field_30959;
   private double field_30958;
   private double field_30961 = 0.0;
   private float field_30965;

   public class_6053() {
      super(Category.MOVEMENT, "AAC", "Speed for AAC");
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Fast1", "Fast2").method_12861("Fast2"));
      this.addSetting(new BooleanSetting("Fluid Fix", "Makes your jump fluid.", true));
      this.addSetting(new BooleanSetting("Auto Jump", "Automatically jumps for you.", true));
   }

   @Override
   public void method_42006() {
      this.field_30964 = -1;
      this.field_30963 = 0;
      this.field_30961 = mcInstance.field_9632.method_37309();
      this.field_30965 = class_8865.method_40787()[0];
      this.field_30960 = 0;
   }

   @Override
   public void method_42020() {
      class_8865.method_40779(0.27, class_8865.method_40787()[0], this.field_30965, 45.0F);
   }

   @class_9148
   public void method_27636(class_139 var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_509) {
            this.field_30963 = 0;
         }
      }
   }

   @class_9148
   public void method_27641(class_7767 var1) {
      if (this.method_42015()) {
         String var4 = this.method_42016("Mode");
         if (class_314.method_1413(mcInstance.field_9632, 0.01F)) {
            if (this.field_30960 <= 1) {
               this.field_30960++;
            } else {
               this.field_30963 = 0;
               this.field_30964 = -1;
            }

            if (class_314.method_1434() && this.method_42007("Auto Jump")) {
               mcInstance.field_9632.method_26595();
               var1.method_35235(mcInstance.field_9632.method_37098().field_7333);
            }
         } else if (this.field_30964 >= 0) {
            this.field_30964++;
         }

         if (mcInstance.field_9632.field_29673 == 0.0F && mcInstance.field_9632.field_29676 == 0.0F
            || mcInstance.field_9632.field_41744
            || mcInstance.field_9632.field_29673 <= 0.0F) {
            this.field_30963 = 0;
         }

         switch (var4) {
            case "Basic":
               this.field_30959 = method_27638(this.field_30964, this.field_30963, () -> this.field_30963 = 0);
               break;
            case "Fast1":
               this.field_30959 = this.method_27644(this.field_30964, this.field_30963);
               this.field_30958 = this.method_27640(this.field_30964);
               var1.method_35235(this.field_30958);
               mcInstance.field_9632.method_37098().field_7333 = this.field_30958;
               break;
            case "Fast2":
               this.field_30959 = this.method_27642(this.field_30964, this.field_30963);
               this.field_30958 = this.method_27643(this.field_30964);
               var1.method_35235(this.field_30958);
               mcInstance.field_9632.method_37098().field_7333 = this.field_30958;
         }

         if (!class_314.method_1434()) {
            this.field_30959 = 0.0;
         }

         if (mcInstance.field_9632.field_41744) {
            this.field_30959 = this.field_30959 * 0.9 < 0.27 ? 0.27 : this.field_30959 * 0.9;
         }

         if (this.field_30964 >= 0) {
            this.field_30965 = class_8865.method_40780(var1, this.field_30959, class_8865.method_40787()[0], this.field_30965, 45.0F);
         }

         class_314.method_1408(var1.method_35236());
      }
   }

   @class_9148
   public void method_27639(class_1711 var1) {
      if (this.method_42015()) {
         if (this.method_42007("Fluid Fix")) {
            if (!mcInstance.field_9632.field_41744 && !mcInstance.field_9632.field_41774) {
               String var4 = this.method_42016("Mode");
               float var5 = 13.0F;
               if (!var4.equals("Fast1")) {
                  if (var4.equals("Basic")) {
                     return;
                  }
               } else {
                  var5 = 11.0F;
               }

               if (!((float)this.field_30964 > var5) && this.field_30964 >= 0) {
                  double var6 = Math.cos(Math.toRadians((double)((float)this.field_30964 / var5 * 180.0F - 90.0F)));
                  mcInstance.field_9632.field_41736.field_7333 = this.field_30961 + var6;
                  mcInstance.field_9632.field_3859 = 0.0F;
               }
            } else {
               mcInstance.field_9632.field_41736.field_7333 = mcInstance.field_9632.method_37241().field_19937;
               this.field_30961 = mcInstance.field_9632.method_37309();
               this.field_30964 = -1;
            }
         }
      }
   }

   @class_9148
   public void method_27637(class_2911 var1) {
      this.field_30964 = 0;
      this.field_30960 = 0;
      this.field_30965 = class_8865.method_40787()[0];
      String var4 = this.method_42016("Mode");
      switch (var4) {
         case "Basic":
            if (this.field_30963 < 3) {
               this.field_30963++;
            }
            break;
         case "Fast1":
            if (this.field_30963 < 5) {
               this.field_30963++;
            }

            if (this.field_30964 < 11 && this.field_30964 > 0) {
               this.field_30963 = 0;
            }
            break;
         case "Fast2":
            if (this.field_30963 < 4) {
               this.field_30963++;
            }
      }
   }

   private double method_27640(int var1) {
      double var4 = mcInstance.field_9632.method_37098().field_7333;
      boolean var6 = class_314.method_1413(mcInstance.field_9632, 0.37F);
      double[] var7 = new double[]{0.41, 0.309, 0.21, 0.113, 0.03, -0.05, -0.12, -0.192, -0.26, -0.33, !var6 ? -0.4 : -0.0, !var6 ? -0.47 : -0.13};
      if (var1 >= 0 && var1 < var7.length) {
         var4 = var7[var1];
      }

      return var4;
   }

   private double method_27644(int var1, int var2) {
      boolean var5 = class_314.method_1413(mcInstance.field_9632, 0.37F);
      double[] var6 = new double[]{0.497, 0.671, 0.719, 0.733, 0.738};
      double[] var7 = new double[]{0.303, 0.407, 0.436, 0.444, 0.447};
      double[] var8 = new double[]{0.0, 0.003, 0.004, 0.004, 0.004};
      double[] var9 = new double[]{0.605, 0.685, 0.708, 0.716, 0.719};
      double[] var10 = new double[]{0.367, 0.415, 0.429, 0.434, 0.434};
      if (var1 >= 0 && var2 >= 1 && var2 <= 5) {
         if (var1 != 0) {
            if (var1 != 1) {
               if (var1 == 10 && var5) {
                  this.field_30959 = var9[var2 - 1];
               } else if (var1 == 11 && var5) {
                  this.field_30959 = var10[var2 - 1];
               } else {
                  this.field_30959 = this.field_30959 - var8[var2 - 1];
               }
            } else {
               this.field_30959 = var7[var2 - 1];
            }
         } else {
            this.field_30959 = var6[var2 - 1];
         }

         if (var2 == 1 && var1 == 2) {
            this.field_30959 -= 0.002;
         }

         if (var2 == 2 && (var1 == 2 || var1 == 3)) {
            this.field_30959 -= 0.001;
         }
      }

      return this.field_30959;
   }

   private double method_27643(int var1) {
      double var4 = mcInstance.field_9632.method_37098().field_7333;
      boolean var6 = class_314.method_1413(mcInstance.field_9632, 0.37F);
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

   private double method_27642(int var1, int var2) {
      boolean var5 = class_314.method_1413(mcInstance.field_9632, 0.37F);
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
                  this.field_30959 = var9[var2 - 1];
               } else if (var1 == 10 && var5) {
                  this.field_30959 = var10[var2 - 1];
               } else if (var1 == 12 && var5) {
                  this.field_30959 = var11[var2 - 1];
               } else if (var1 == 13 && var5) {
                  this.field_30959 = var12[var2 - 1];
               } else {
                  this.field_30959 = this.field_30959 - var8[var2 - 1];
               }
            } else {
               this.field_30959 = var7[var2 - 1];
            }
         } else {
            this.field_30959 = var6[var2 - 1];
         }

         if (var2 == 1) {
            if (var1 != 2) {
               if (var1 == 11) {
                  this.field_30959 -= 0.003;
               }
            } else {
               this.field_30959 -= 0.002;
            }
         }

         if (var2 == 2 && (var1 == 2 || var1 == 3)) {
            this.field_30959 -= 0.001;
         }
      }

      return this.field_30959;
   }

   public static double method_27638(int var0, int var1, Runnable var2) {
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

         if (mcInstance.field_9632.field_29673 <= 0.0F) {
            var5 -= 0.06;
         }

         if (mcInstance.field_9632.field_41744) {
            var5 -= 0.1;
            var2.run();
         }

         return var5;
      } else {
         return var5;
      }
   }
}
