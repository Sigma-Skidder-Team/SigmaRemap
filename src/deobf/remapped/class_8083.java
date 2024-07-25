package remapped;

public class class_8083 extends class_9128 {
   private float field_41376;
   private float field_41370;
   private class_2899 field_41372;
   private int field_41378 = -1;
   private int field_41380;
   private int field_41381;
   private class_2584 field_41379;
   private class_3709 field_41373 = null;
   private boolean field_41374;
   private boolean field_41377 = false;
   private double field_41371;
   private int field_41375 = 0;

   public class_8083() {
      super(class_5664.field_28716, "Smooth", "Places block underneath");
      this.method_42010(new class_2826("Speed Mode", "Speed mode", 0, "None", "Jump", "AAC", "Cubecraft", "Slow", "Sneak"));
   }

   @Override
   public void method_42012() {
      this.field_41373 = (class_3709)this.method_42017();
   }

   @Override
   public void method_42006() {
      this.field_41378 = field_46692.field_9632.field_3853.field_36404;
      this.field_41370 = this.field_41376 = 999.0F;
      ((class_3709)this.method_42017()).field_18196 = -1;
      this.field_41371 = -1.0;
      this.field_41377 = false;
      if (field_46692.field_9632.field_41726) {
         this.field_41371 = field_46692.field_9632.method_37309();
      }

      this.field_41381 = -1;
   }

   @Override
   public void method_42020() {
      if (this.field_41378 != -1 && this.method_42017().method_42016("ItemSpoof").equals("Switch")) {
         field_46692.field_9632.field_3853.field_36404 = this.field_41378;
      }

      this.field_41378 = -1;
      if (((class_3709)this.method_42017()).field_18196 >= 0) {
         field_46692.method_8614().method_4813(new class_7371(field_46692.field_9632.field_3853.field_36404));
         ((class_3709)this.method_42017()).field_18196 = -1;
      }

      class_8865.method_40776(class_8865.method_40775() * 0.9);
      field_46692.field_9616.field_32603 = 1.0F;
      if (this.method_42016("Speed Mode").equals("Cubecraft") && this.field_41381 == 0) {
         class_314.method_1408(-0.0789);
      }
   }

   @class_9148
   public void method_36707(class_7982 var1) {
      if (this.method_42015()) {
         if (this.method_42016("Speed Mode").equals("Cubecraft") && !SigmaMainClass.method_3328().method_3298().method_847(class_2368.class).method_42015()) {
            if (field_46692.field_9601
                     .method_6680(
                        field_46692.field_9632,
                        field_46692.field_9632.field_41712.method_18928(0.0, -1.5, 0.0).method_18900(0.05, 0.0, 0.05).method_18900(-0.05, 0.0, -0.05)
                     )
                     .count()
                  == 0L
               && field_46692.field_9632.field_41706 < 1.0F) {
               var1.method_36186(true);
            }
         } else if (field_46692.field_9632.field_41726 && SigmaMainClass.method_3328().method_3298().method_847(class_1396.class).method_42015()) {
            var1.method_36186(true);
         }
      }
   }

   @class_9148
   @class_7664
   public void method_36714(class_1393 var1) {
      if (this.method_42015() && this.field_41373.method_17219() != 0) {
         if (!var1.method_6449()) {
            if (this.field_41370 != 999.0F) {
               this.field_41373.method_17215();
               if (this.field_41372 != null) {
                  class_9529 var13 = class_7494.method_34080(this.field_41370, this.field_41376, 5.0F, var1);
                  if (var13.method_33990() == class_1430.field_7721) {
                     return;
                  }

                  if (var13.method_43956() == Direction.field_817
                     && (double)var13.method_43955().method_12165() <= field_46692.field_9632.method_37309() - 1.0
                     && field_46692.field_9632.field_41726) {
                     return;
                  }

                  int var14 = field_46692.field_9632.field_3853.field_36404;
                  if (!this.method_42017().method_42016("ItemSpoof").equals("None")) {
                     this.field_41373.method_17211();
                  }

                  class_6098 var15 = field_46692.field_9632.method_26617(class_2584.field_12791);
                  new class_4734(field_46692.field_9632, class_2584.field_12791, var13);
                  int var17 = var15.method_27997();
                  field_46692.field_9647.method_42147(field_46692.field_9632, field_46692.field_9601, this.field_41379, var13);
                  this.field_41372 = null;
                  if (!this.method_42017().method_42007("NoSwing")) {
                     field_46692.field_9632.method_26597(this.field_41379);
                  } else {
                     field_46692.method_8614().method_4813(new class_3195(this.field_41379));
                  }

                  if (this.method_42017().method_42016("ItemSpoof").equals("Spoof") || this.method_42017().method_42016("ItemSpoof").equals("LiteSpoof")) {
                     field_46692.field_9632.field_3853.field_36404 = var14;
                  }
               }
            }
         } else {
            this.field_41380++;
            this.field_41375--;
            var1.method_6444(true);
            this.field_41379 = class_2584.field_12791;
            if (class_3709.method_17216(field_46692.field_9632.method_26617(class_2584.field_12794).method_27960())
               && (
                  field_46692.field_9632.method_26617(this.field_41379).method_28022()
                     || !class_3709.method_17216(field_46692.field_9632.method_26617(this.field_41379).method_27960())
               )) {
               this.field_41379 = class_2584.field_12794;
            }

            double var4 = var1.method_6450();
            double var6 = var1.method_6438();
            double var8 = var1.method_6454();
            if (!field_46692.field_9632.field_41744 && !field_46692.field_9577.field_45450.field_30024) {
               double[] var10 = this.method_36710();
               var4 = var10[0];
               var6 = var10[1];
            }

            if (field_46692.field_9632.method_37098().field_7333 < 0.0
               && field_46692.field_9632.field_41706 > 1.0F
               && class_7494.method_34079(0.0F, 90.0F, 3.0F).method_33990() == class_1430.field_7721) {
               var8 += Math.min(field_46692.field_9632.method_37098().field_7333 * 2.0, 4.0);
            } else if ((this.method_42016("Speed Mode").equals("Jump") || this.method_42016("Speed Mode").equals("Cubecraft"))
               && !field_46692.field_9577.field_45450.method_27060()) {
               var8 = this.field_41371;
            }

            if (!class_7494.method_34090(
               new class_1331(
                  field_46692.field_9632.method_37245().method_61(),
                  field_46692.field_9632.method_37245().method_60() - 1.0,
                  field_46692.field_9632.method_37245().method_62()
               )
            )) {
               var4 = field_46692.field_9632.method_37245().method_61();
               var6 = field_46692.field_9632.method_37245().method_62();
            }

            class_1331 var18 = new class_1331(var4, var8 - 1.0, var6);
            if (!class_7494.method_34090(var18) && this.field_41373.method_17224(this.field_41379) && this.field_41375 <= 0) {
               class_2899 var11 = class_7494.method_34118(var18, false);
               this.field_41372 = var11;
               float[] var12 = class_7494.method_34112();
               if (var11 != null && var12 != null) {
                  this.field_41370 = var12[0];
                  this.field_41376 = var12[1];
               }
            } else {
               this.field_41372 = null;
            }

            if (this.field_41370 != 999.0F) {
               var1.method_6441(this.field_41370);
               var1.method_6448(this.field_41376);
            }

            if (field_46692.field_9632.field_41701 != var1.method_6442() && field_46692.field_9632.field_41755 != var1.method_6439()) {
               this.field_41380 = 0;
            }
         }
      }
   }

   @class_9148
   @class_315
   public void method_36705(class_7767 var1) {
      if (this.method_42015() && this.field_41373.method_17219() != 0) {
         if (field_46692.field_9632.field_41726 || class_314.method_1413(field_46692.field_9632, 0.01F)) {
            this.field_41371 = field_46692.field_9632.method_37309();
         }

         if (this.method_42017().method_42007("No Sprint")) {
            field_46692.field_9632.method_37140(false);
         }

         if (field_46692.field_9632.field_41726) {
            this.field_41381 = 0;
         } else if (this.field_41381 >= 0) {
            this.field_41381++;
         }

         if (this.field_41373 == null) {
            this.field_41373 = (class_3709)this.method_42017();
         }

         String var4 = this.method_42016("Speed Mode");
         switch (var4) {
            case "Jump":
               if (field_46692.field_9632.field_41726 && class_314.method_1434() && !field_46692.field_9632.method_37252() && !this.field_41374) {
                  this.field_41377 = false;
                  field_46692.field_9632.method_26595();
                  ((class_6908) SigmaMainClass.method_3328().method_3298().method_847(class_6908.class)).method_31653();
                  this.field_41377 = true;
                  var1.method_35235(field_46692.field_9632.method_37098().field_7333);
                  var1.method_35232(field_46692.field_9632.method_37098().field_7336);
                  var1.method_35229(field_46692.field_9632.method_37098().field_7334);
               }
               break;
            case "AAC":
               if (this.field_41380 == 0 && field_46692.field_9632.field_41726) {
                  class_8865.method_40777(var1, class_8865.method_40775() * 0.82);
               }
               break;
            case "Cubecraft":
               double var6 = 0.2;
               float var8 = this.method_36706(class_9299.method_42810(field_46692.field_9632.field_41701));
               if (field_46692.field_9577.field_45450.method_27060()) {
                  field_46692.field_9616.field_32603 = 1.0F;
               } else if (field_46692.field_9632.field_41726) {
                  if (class_314.method_1434() && !field_46692.field_9632.method_37252() && !this.field_41374) {
                     var1.method_35235(1.00000000000001);
                  }
               } else if (this.field_41381 == 1) {
                  if (var1.method_35236() <= 0.9) {
                     this.field_41381 = -1;
                  } else {
                     var1.method_35235(0.122);
                     field_46692.field_9616.field_32603 = 0.7F;
                     var6 = 2.4;
                  }
               } else if (this.field_41381 == 2) {
                  if (var1.method_35236() > 0.05) {
                     this.field_41381 = -1;
                  } else {
                     field_46692.field_9616.field_32603 = 0.7F;
                     var6 = 0.28;
                  }
               } else if (this.field_41381 == 3) {
                  field_46692.field_9616.field_32603 = 0.3F;
                  var6 = 2.4;
               } else if (this.field_41381 == 4) {
                  var6 = 0.28;
                  field_46692.field_9616.field_32603 = 1.0F;
               } else if (this.field_41381 == 6) {
                  var1.method_35235(-1.023456987345906);
               }

               if (!class_314.method_1434()) {
                  var6 = 0.0;
               }

               if (field_46692.field_9632.field_41706 < 1.0F) {
                  class_8865.method_40780(var1, var6, var8, var8, 360.0F);
               }

               class_314.method_1408(var1.method_35236());
               break;
            case "Slow":
               if (field_46692.field_9632.field_41726) {
                  var1.method_35232(var1.method_35234() * 0.75);
                  var1.method_35229(var1.method_35231() * 0.75);
               } else {
                  var1.method_35232(var1.method_35234() * 0.93);
                  var1.method_35229(var1.method_35231() * 0.93);
               }
               break;
            case "Sneak":
               if (field_46692.field_9632.field_41726) {
                  var1.method_35232(var1.method_35234() * 0.65);
                  var1.method_35229(var1.method_35231() * 0.65);
               } else {
                  var1.method_35232(var1.method_35234() * 0.85);
                  var1.method_35229(var1.method_35231() * 0.85);
               }
         }

         this.field_41373.method_17220(var1);
      }
   }

   @class_9148
   @class_7664
   public void method_36713(class_2157 var1) {
      if (this.method_42015() && field_46692.field_9632 != null) {
         if (var1.method_10047() instanceof class_7371 && ((class_3709)this.method_42017()).field_18196 >= 0) {
            var1.method_29715(true);
         }
      }
   }

   @class_9148
   public void method_36709(class_2911 var1) {
      if (this.method_42015() && this.field_41377) {
         if (this.method_42017().method_42016("Tower Mode").equalsIgnoreCase("Vanilla")
            && (!class_314.method_1434() || this.method_42017().method_42007("Tower while moving"))) {
            var1.method_29715(true);
         }
      }
   }

   @class_9148
   public void method_36708(class_1711 var1) {
      if (this.method_42015() && this.method_42016("Speed Mode").equals("Cubecraft") && this.field_41381 >= 0) {
         if (!(field_46692.field_9632.field_41706 > 1.2F)) {
            if (!(field_46692.field_9632.field_3864 < this.field_41371)) {
               if (!field_46692.field_9632.field_29654) {
                  field_46692.field_9632.field_41736.field_7333 = this.field_41371;
                  field_46692.field_9632.field_41713 = this.field_41371;
                  field_46692.field_9632.field_3864 = this.field_41371;
                  field_46692.field_9632.field_41698 = this.field_41371;
                  if (class_8865.method_40772()) {
                     field_46692.field_9632.field_3859 = 0.099999994F;
                  }
               }
            }
         }
      }
   }

   public double[] method_36710() {
      double var3 = field_46692.field_9632.method_37302();
      double var5 = field_46692.field_9632.method_37156();
      double var7 = (double)field_46692.field_9632.field_30533.field_45287;
      double var9 = (double)field_46692.field_9632.field_30533.field_45282;
      float var11 = field_46692.field_9632.field_41701;
      class_1331 var12 = new class_1331(var3, field_46692.field_9632.method_37309() - 1.0, var5);
      double var13 = var3;
      double var15 = var5;
      double var17 = 0.0;

      for (double var19 = (double)(this.method_42002("Extend") * 2.0F);
         class_7494.method_34090(var12);
         var12 = new class_1331(var13, field_46692.field_9632.method_37309() - 1.0, var15)
      ) {
         if (++var17 > var19) {
            var17 = var19;
         }

         var13 = var3
            + (var7 * 0.45 * Math.cos(Math.toRadians((double)(var11 + 90.0F))) + var9 * 0.45 * Math.sin(Math.toRadians((double)(var11 + 90.0F)))) * var17;
         var15 = var5
            + (var7 * 0.45 * Math.sin(Math.toRadians((double)(var11 + 90.0F))) - var9 * 0.45 * Math.cos(Math.toRadians((double)(var11 + 90.0F)))) * var17;
         if (var17 == var19) {
            break;
         }
      }

      return new double[]{var13, var15};
   }

   public static class_1343 method_36711(class_1331 var0, Direction var1) {
      double var4 = (double)var0.method_12173() + 0.5;
      double var6 = (double)var0.method_12165() + 0.5;
      double var8 = (double)var0.method_12185() + 0.5;
      var4 += (double)var1.method_1041() / 2.0;
      var8 += (double)var1.method_1034() / 2.0;
      var6 += (double)var1.method_1054() / 2.0;
      double var10 = 0.2;
      if (var1 != Direction.field_817 && var1 != Direction.field_802) {
         var6 += method_36712(var10, -var10);
      } else {
         var4 += method_36712(var10, -var10);
         var8 += method_36712(var10, -var10);
      }

      if (var1 == Direction.field_809 || var1 == Direction.field_804) {
         var8 += method_36712(var10, -var10);
      }

      if (var1 == Direction.field_800 || var1 == Direction.field_818) {
         var4 += method_36712(var10, -var10);
      }

      return new class_1343(var4, var6, var8);
   }

   public static double method_36712(double var0, double var2) {
      return Math.random() * (var0 - var2) + var2;
   }

   public float method_36706(float var1) {
      float var4 = 0.0F;
      float var5 = field_46692.field_9632.field_29676;
      float var6 = field_46692.field_9632.field_29673;
      if (!(var5 > 0.0F)) {
         if (var5 < 0.0F) {
            if (!(var6 > 0.0F)) {
               if (!(var6 < 0.0F)) {
                  var1 += 90.0F;
               } else {
                  var1 -= 45.0F;
               }
            } else {
               var1 += 45.0F;
            }
         }
      } else if (!(var6 > 0.0F)) {
         if (!(var6 < 0.0F)) {
            var1 -= 90.0F;
         } else {
            var1 += 45.0F;
         }
      } else {
         var1 -= 45.0F;
      }

      if (var1 >= 45.0F && var1 <= 135.0F) {
         var4 = 90.0F;
      } else if (var1 >= 135.0F || var1 <= -135.0F) {
         var4 = 180.0F;
      } else if (var1 <= -45.0F && var1 >= -135.0F) {
         var4 = -90.0F;
      } else if (var1 >= -45.0F && var1 <= 45.0F) {
         var4 = 0.0F;
      }

      if (var6 < 0.0F) {
         var4 -= 180.0F;
      }

      return var4 + 90.0F;
   }
}
