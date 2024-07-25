package remapped;

import java.util.Iterator;
import java.util.stream.Stream;

public class class_7033 extends Module {
   public int field_36213;
   public int field_36210;
   public int field_36212;

   public class_7033() {
      super(Category.MOVEMENT, "Jesus", "Where's the scientific proof?");
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Dolphin").method_12861("Dolphin"));
      this.addSetting(new BooleanSetting("Swim up", "Automatically swim up", true));
   }

   @Override
   public void onDisable() {
   }

   @EventListen
   public void method_32082(class_5243 var1) {
      if (this.method_42015() && mc.field_9601 != null && !class_3588.method_16781()) {
         if (mc.field_9601.method_28262(var1.method_23989()).method_8362() == class_5371.field_27410
            || mc.field_9601.method_28262(var1.method_23989()).method_8362() == class_5371.field_27439
            || mc.field_9601.method_28262(var1.method_23989()).method_8362() == class_5371.field_27413) {
            if (!(
               (double)var1.method_23989().method_12165()
                  >= mc.field_9632.method_37309() - (double)(mc.field_9632.method_37309() % 0.5 != 0.0 ? 0.0F : 0.5F)
            )) {
               if (!this.method_32078(mc.field_9632.field_41712)) {
                  if (!mc.field_9632.method_37252()) {
                     if (!(mc.field_9632.field_41706 > 10.0F)) {
                        class_2522 var4 = mc.field_9601.method_28262(var1.method_23989());
                        int var5 = var4.method_8364().method_21996();
                        float var6 = 0.0F;
                        if (var5 > 3) {
                           var6++;
                        }

                        if (mc.field_9632.field_41706 > 10.0F) {
                           var6 -= 0.8F;
                        }

                        class_4190 var7 = class_3370.method_15522(0.0, 0.0, 0.0, 1.0, (double)var6, 1.0);
                        var1.method_23986(var7);
                     }
                  }
               }
            }
         }
      }
   }

   @EventListen
   public void method_32076(class_1393 var1) {
      if (this.method_42015() && mc.field_9601 != null && var1.method_6449() && mc.method_8530() != null) {
         if (method_32081() && !this.method_32078(mc.field_9632.field_41712)) {
            this.field_36212++;
         } else {
            this.field_36212 = 0;
         }

         if (method_32081() && !this.method_32078(mc.field_9632.field_41712)) {
            mc.field_9632.field_29600 = 0;
            var1.method_6444(true);
            this.field_36213++;
            if (this.field_36213 % 2 == 0) {
               var1.method_6455(var1.method_6454() - 0.001);
            }
         } else {
            this.field_36213 = !mc.field_9632.field_41726 ? 1 : 0;
         }
      }
   }

   @EventListen
   @class_7664
   public void method_32079(class_7767 var1) {
      if (this.method_42015() && mc.field_9601 != null && !class_3588.method_16781()) {
         if (this.method_32078(mc.field_9632.field_41712) && !mc.field_9632.method_37252()) {
            class_2522 var4 = mc.field_9601.method_28262(mc.field_9632.method_37075());
            if (var4 != null && !var4.method_8364().method_22001()) {
               double var5 = (double)var4.method_8364().method_21998();
               if (var5 > 0.4) {
                  if (this.getBooleanValueByName("Swim up")) {
                     var1.method_35235(0.13);
                  }

                  boolean var7 = this.method_32078(mc.field_9632.field_41712.method_18918(0.0, var1.method_35236(), 0.0));
                  if (!var7) {
                     double var8 = (double)((int) mc.field_9632.method_37309() + 1);
                     double var10 = var8 - mc.field_9632.method_37309();
                     var1.method_35235(var10);
                     mc.field_9632.field_41726 = true;
                     this.field_36213 = 1;
                  }
               }
            }
         } else {
            if (method_32081() && var1.method_35236() != -0.0784000015258789 && var1.method_35236() != class_8865.method_40786()) {
               var1.method_35235(-0.078);
            }

            if (this.getStringValueByName("Mode").equals("Dolphin")) {
               if (this.field_36210 > 0) {
                  if (class_314.method_1413(mc.field_9632, 0.001F)) {
                     this.field_36210 = 0;
                  } else {
                     if (mc.field_9632.method_37252() || mc.field_9632.field_41774) {
                        this.field_36210 = 0;
                        return;
                     }

                     if (this.field_36210 > 0) {
                        class_8865.method_40777(var1, 0.25 + (double)class_8865.method_40770() * 0.05);
                        this.field_36210++;
                     }

                     double var14 = this.method_32080((double)this.field_36210);
                     if (var14 != -999.0) {
                        mc.field_9632.field_30502 = 0.0;
                        var1.method_35235(var14);
                     }
                  }
               } else if (method_32081() && this.field_36213 % 2 == 0) {
                  this.field_36210++;
                  double var12 = this.method_32080((double)this.field_36210);
                  class_8865.method_40777(var1, 0.25);
                  if (var12 != -999.0) {
                     var1.method_35235(var12);
                  }
               }
            }

            class_314.method_1408(var1.method_35236());
         }
      }
   }

   @EventListen
   public void method_32085(class_2911 var1) {
      if (this.method_42015() && mc.field_9601 != null && mc.method_8530() != null) {
         if (method_32081()) {
            if (this.field_36213 % 2 != 0) {
               var1.method_29715(true);
            }

            var1.method_13315(0.2);
         }
      }
   }

   @EventListen
   public void method_32084(class_8544 var1) {
      if (this.method_42015() && !(var1.method_39326() < 0.2)) {
         if (method_32081()) {
            var1.method_29715(true);
         }
      }
   }

   @Override
   public boolean method_42003() {
      return this.method_42015() && method_32081() && !this.method_32077();
   }

   public boolean method_32077() {
      return class_8865.method_40771();
   }

   public boolean method_32078(class_4092 var1) {
      return this.method_32083(var1, class_5371.field_27439) || this.method_32083(var1, class_5371.field_27413);
   }

   public boolean method_32083(class_4092 var1, class_5371 var2) {
      int var5 = class_9299.method_42847(var1.field_19941);
      int var6 = class_9299.method_42815(var1.field_19940);
      int var7 = class_9299.method_42847(var1.field_19937);
      int var8 = class_9299.method_42815(var1.field_19939);
      int var9 = class_9299.method_42847(var1.field_19938);
      int var10 = class_9299.method_42815(var1.field_19942);
      class_2927 var11 = class_2927.method_13381(var2);
      return class_1331.method_6083(var5, var7, var9, var6 - 1, var8 - 1, var10 - 1).anyMatch(var1x -> var11.test(mc.field_9601.method_28262(var1x)));
   }

   public static boolean method_32081() {
      class_4092 var2 = mc.field_9632.field_41712.method_18918(0.0, -0.001, 0.0);
      Stream var3 = mc.field_9601.method_6680(mc.field_9632, var2);
      Iterator var4 = var3.iterator();
      boolean var5 = true;
      if (var4.hasNext()) {
         while (var4.hasNext()) {
            class_4190 var6 = (class_4190)var4.next();
            class_4092 var7 = var6.method_19483();
            class_1331 var8 = new class_1331(var7.method_18926());
            class_6414 var9 = mc.field_9601.method_28262(var8).method_8360();
            if (var9 != class_4783.field_23900
               && var9 != class_4783.field_23811
               && var9 != class_4783.field_23184
               && var9 != class_4783.field_23563
               && var9 != class_4783.field_23535) {
               var5 = false;
            }
         }

         return var5;
      } else {
         return false;
      }
   }

   public double method_32080(double var1) {
      var1--;
      double[] var5 = new double[]{
         0.499,
         0.484,
         0.468,
         0.436,
         0.404,
         0.372,
         0.34,
         0.308,
         0.276,
         0.244,
         0.212,
         0.18,
         0.166,
         0.166,
         0.156,
         0.123,
         0.135,
         0.111,
         0.086,
         0.098,
         0.073,
         0.048,
         0.06,
         0.036,
         0.0106,
         0.015,
         0.0,
         0.0,
         0.0,
         -0.013,
         -0.045,
         -0.077,
         -0.109
      };
      return var1 < (double)var5.length && var1 >= 0.0 ? var5[(int)var1] : -999.0;
   }
}
