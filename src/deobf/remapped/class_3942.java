package remapped;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class class_3942 extends class_5783 {
   private static String[] field_19149;
   private final Random field_19140 = new Random();
   private boolean field_19145;
   private int field_19139;
   private static final class_7821<Integer> field_19146 = class_8073.<Integer>method_36641(class_3942.class, class_2734.field_13366);
   private static final class_7821<Boolean> field_19150 = class_8073.<Boolean>method_36641(class_3942.class, class_2734.field_13347);
   private int field_19148;
   private int field_19142;
   private int field_19147;
   private int field_19137;
   private float field_19136;
   private boolean field_19141 = true;
   private class_8145 field_19144;
   private class_2753 field_19135 = class_2753.field_13471;
   private final int field_19143;
   private final int field_19138;

   private class_3942(class_6486 var1, class_704 var2, int var3, int var4) {
      super(class_6629.field_34215, var1);
      this.field_41750 = true;
      this.method_26159(var2);
      var2.field_3841 = this;
      this.field_19143 = Math.max(0, var3);
      this.field_19138 = Math.max(0, var4);
   }

   public class_3942(class_6486 var1, class_704 var2, double var3, double var5, double var7) {
      this(var1, var2, 0, 0);
      this.method_37256(var3, var5, var7);
      this.field_41767 = this.method_37302();
      this.field_41698 = this.method_37309();
      this.field_41725 = this.method_37156();
   }

   public class_3942(class_704 var1, class_6486 var2, int var3, int var4) {
      this(var2, var1, var3, var4);
      float var7 = var1.field_41755;
      float var8 = var1.field_41701;
      float var9 = class_9299.method_42840(-var8 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var10 = class_9299.method_42818(-var8 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float var11 = -class_9299.method_42840(-var7 * (float) (Math.PI / 180.0));
      float var12 = class_9299.method_42818(-var7 * (float) (Math.PI / 180.0));
      double var13 = var1.method_37302() - (double)var10 * 0.3;
      double var15 = var1.method_37388();
      double var17 = var1.method_37156() - (double)var9 * 0.3;
      this.method_37144(var13, var15, var17, var8, var7);
      class_1343 var19 = new class_1343((double)(-var10), (double)class_9299.method_42828(-(var12 / var11), -5.0F, 5.0F), (double)(-var9));
      double var20 = var19.method_6217();
      var19 = var19.method_6210(
         0.6 / var20 + 0.5 + this.field_41717.nextGaussian() * 0.0045,
         0.6 / var20 + 0.5 + this.field_41717.nextGaussian() * 0.0045,
         0.6 / var20 + 0.5 + this.field_41717.nextGaussian() * 0.0045
      );
      this.method_37215(var19);
      this.field_41701 = (float)(class_9299.method_42821(var19.field_7336, var19.field_7334) * 180.0F / (float)Math.PI);
      this.field_41755 = (float)(class_9299.method_42821(var19.field_7333, (double)class_9299.method_42842(method_37266(var19))) * 180.0F / (float)Math.PI);
      this.field_41711 = this.field_41701;
      this.field_41762 = this.field_41755;
   }

   @Override
   public void method_37329() {
      this.method_37372().method_36634(field_19146, 0);
      this.method_37372().method_36634(field_19150, false);
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_19146.equals(var1)) {
         int var4 = this.method_37372().<Integer>method_36640(field_19146);
         this.field_19144 = var4 <= 0 ? null : this.field_41768.method_29534(var4 - 1);
      }

      if (field_19150.equals(var1)) {
         this.field_19145 = this.method_37372().<Boolean>method_36640(field_19150);
         if (this.field_19145) {
            this.method_37214(
               this.method_37098().field_7336, (double)(-0.4F * class_9299.method_42819(this.field_19140, 0.6F, 1.0F)), this.method_37098().field_7334
            );
         }
      }

      super.method_37191(var1);
   }

   @Override
   public boolean method_37176(double var1) {
      double var5 = 64.0;
      return var1 < 4096.0;
   }

   @Override
   public void method_37318(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
   }

   @Override
   public void method_37123() {
      this.field_19140.setSeed(this.method_37328().getLeastSignificantBits() ^ this.field_41768.method_29546());
      super.method_37123();
      class_704 var3 = this.method_18219();
      if (var3 != null) {
         if (this.field_41768.field_33055 || !this.method_18225(var3)) {
            if (!this.field_41726) {
               this.field_19148 = 0;
            } else {
               this.field_19148++;
               if (this.field_19148 >= 1200) {
                  this.method_37204();
                  return;
               }
            }

            float var4 = 0.0F;
            class_1331 var5 = this.method_37075();
            class_4774 var6 = this.field_41768.method_28258(var5);
            if (var6.method_22007(class_6503.field_33094)) {
               var4 = var6.method_22008(this.field_41768, var5);
            }

            boolean var7 = var4 > 0.0F;
            if (this.field_19135 != class_2753.field_13471) {
               if (this.field_19135 == class_2753.field_13474) {
                  if (this.field_19144 != null) {
                     if (!this.field_19144.field_41751) {
                        this.method_37256(this.field_19144.method_37302(), this.field_19144.method_37080(0.8), this.field_19144.method_37156());
                     } else {
                        this.field_19144 = null;
                        this.field_19135 = class_2753.field_13471;
                     }
                  }

                  return;
               }

               if (this.field_19135 == class_2753.field_13475) {
                  class_1343 var10 = this.method_37098();
                  double var11 = this.method_37309() + var10.field_7333 - (double)var5.method_12165() - (double)var4;
                  if (Math.abs(var11) < 0.01) {
                     var11 += Math.signum(var11) * 0.1;
                  }

                  this.method_37214(var10.field_7336 * 0.9, var10.field_7333 - var11 * (double)this.field_41717.nextFloat() * 0.2, var10.field_7334 * 0.9);
                  if (this.field_19142 <= 0 && this.field_19137 <= 0) {
                     this.field_19141 = true;
                  } else {
                     this.field_19141 = this.field_19141 && this.field_19139 < 10 && this.method_18222(var5);
                  }

                  if (!var7) {
                     this.field_19139 = Math.min(10, this.field_19139 + 1);
                  } else {
                     this.field_19139 = Math.max(0, this.field_19139 - 1);
                     if (this.field_19145) {
                        this.method_37215(
                           this.method_37098().method_6214(0.0, -0.1 * (double)this.field_19140.nextFloat() * (double)this.field_19140.nextFloat(), 0.0)
                        );
                     }

                     if (!this.field_41768.field_33055) {
                        this.method_18217(var5);
                     }
                  }
               }
            } else {
               if (this.field_19144 != null) {
                  this.method_37215(class_1343.field_7335);
                  this.field_19135 = class_2753.field_13474;
                  return;
               }

               if (var7) {
                  this.method_37215(this.method_37098().method_6210(0.3, 0.2, 0.3));
                  this.field_19135 = class_2753.field_13475;
                  return;
               }

               this.method_18223();
            }

            if (!var6.method_22007(class_6503.field_33094)) {
               this.method_37215(this.method_37098().method_6214(0.0, -0.03, 0.0));
            }

            this.method_37226(class_7412.field_37839, this.method_37098());
            this.method_26167();
            if (this.field_19135 == class_2753.field_13471 && (this.field_41726 || this.field_41744)) {
               this.method_37215(class_1343.field_7335);
            }

            double var8 = 0.92;
            this.method_37215(this.method_37098().method_6209(0.92));
            this.method_37351();
         }
      } else {
         this.method_37204();
      }
   }

   private boolean method_18225(class_704 var1) {
      class_6098 var4 = var1.method_26446();
      class_6098 var5 = var1.method_26568();
      boolean var6 = var4.method_27960() == class_4897.field_24505;
      boolean var7 = var5.method_27960() == class_4897.field_24505;
      if (!var1.field_41751 && var1.method_37330() && (var6 || var7) && !(this.method_37275(var1) > 1024.0)) {
         return false;
      } else {
         this.method_37204();
         return true;
      }
   }

   private void method_18223() {
      class_7474 var3 = class_8462.method_38935(this, this::method_26164);
      this.method_26160(var3);
   }

   @Override
   public boolean method_26164(class_8145 var1) {
      return super.method_26164(var1) || var1.method_37330() && var1 instanceof class_91;
   }

   @Override
   public void method_26163(class_5631 var1) {
      super.method_26163(var1);
      if (!this.field_41768.field_33055) {
         this.field_19144 = var1.method_25524();
         this.method_18218();
      }
   }

   @Override
   public void method_26165(class_9529 var1) {
      super.method_26165(var1);
      this.method_37215(this.method_37098().method_6213().method_6209(var1.method_33991(this)));
   }

   private void method_18218() {
      this.method_37372().method_36633(field_19146, this.field_19144.method_37145() + 1);
   }

   private void method_18217(class_1331 var1) {
      class_6331 var4 = (class_6331)this.field_41768;
      int var5 = 1;
      class_1331 var6 = var1.method_6081();
      if (this.field_41717.nextFloat() < 0.25F && this.field_41768.method_29569(var6)) {
         var5++;
      }

      if (this.field_41717.nextFloat() < 0.5F && !this.field_41768.method_25263(var6)) {
         var5--;
      }

      if (this.field_19142 <= 0) {
         if (this.field_19137 <= 0) {
            if (this.field_19147 <= 0) {
               this.field_19147 = class_9299.method_42824(this.field_41717, 100, 600);
               this.field_19147 = this.field_19147 - this.field_19138 * 20 * 5;
            } else {
               this.field_19147 -= var5;
               float var9 = 0.15F;
               if (this.field_19147 >= 20) {
                  if (this.field_19147 >= 40) {
                     if (this.field_19147 < 60) {
                        var9 = (float)((double)var9 + (double)(60 - this.field_19147) * 0.01);
                     }
                  } else {
                     var9 = (float)((double)var9 + (double)(40 - this.field_19147) * 0.02);
                  }
               } else {
                  var9 = (float)((double)var9 + (double)(20 - this.field_19147) * 0.05);
               }

               if (this.field_41717.nextFloat() < var9) {
                  float var10 = class_9299.method_42819(this.field_41717, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
                  float var11 = class_9299.method_42819(this.field_41717, 25.0F, 60.0F);
                  double var12 = this.method_37302() + (double)(class_9299.method_42818(var10) * var11 * 0.1F);
                  double var14 = (double)((float)class_9299.method_42847(this.method_37309()) + 1.0F);
                  double var16 = this.method_37156() + (double)(class_9299.method_42840(var10) * var11 * 0.1F);
                  class_2522 var18 = var4.method_28262(new class_1331(var12, var14 - 1.0, var16));
                  if (var18.method_8350(class_4783.field_23900)) {
                     var4.method_28957(class_3090.field_15346, var12, var14, var16, 2 + this.field_41717.nextInt(2), 0.1F, 0.0, 0.1F, 0.0);
                  }
               }

               if (this.field_19147 <= 0) {
                  this.field_19136 = class_9299.method_42819(this.field_41717, 0.0F, 360.0F);
                  this.field_19137 = class_9299.method_42824(this.field_41717, 20, 80);
               }
            }
         } else {
            this.field_19137 -= var5;
            if (this.field_19137 <= 0) {
               this.method_37155(class_463.field_2403, 0.25F, 1.0F + (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.4F);
               double var7 = this.method_37309() + 0.5;
               var4.method_28957(
                  class_3090.field_15340,
                  this.method_37302(),
                  var7,
                  this.method_37156(),
                  (int)(1.0F + this.method_37086() * 20.0F),
                  (double)this.method_37086(),
                  0.0,
                  (double)this.method_37086(),
                  0.2F
               );
               var4.method_28957(
                  class_3090.field_15341,
                  this.method_37302(),
                  var7,
                  this.method_37156(),
                  (int)(1.0F + this.method_37086() * 20.0F),
                  (double)this.method_37086(),
                  0.0,
                  (double)this.method_37086(),
                  0.2F
               );
               this.field_19142 = class_9299.method_42824(this.field_41717, 20, 40);
               this.method_37372().method_36633(field_19150, true);
            } else {
               this.field_19136 = (float)((double)this.field_19136 + this.field_41717.nextGaussian() * 4.0);
               float var21 = this.field_19136 * (float) (Math.PI / 180.0);
               float var22 = class_9299.method_42818(var21);
               float var23 = class_9299.method_42840(var21);
               double var24 = this.method_37302() + (double)(var22 * (float)this.field_19137 * 0.1F);
               double var25 = (double)((float)class_9299.method_42847(this.method_37309()) + 1.0F);
               double var26 = this.method_37156() + (double)(var23 * (float)this.field_19137 * 0.1F);
               class_2522 var27 = var4.method_28262(new class_1331(var24, var25 - 1.0, var26));
               if (var27.method_8350(class_4783.field_23900)) {
                  if (this.field_41717.nextFloat() < 0.15F) {
                     var4.method_28957(class_3090.field_15340, var24, var25 - 0.1F, var26, 1, (double)var22, 0.1, (double)var23, 0.0);
                  }

                  float var19 = var22 * 0.04F;
                  float var20 = var23 * 0.04F;
                  var4.method_28957(class_3090.field_15341, var24, var25, var26, 0, (double)var20, 0.01, (double)(-var19), 1.0);
                  var4.method_28957(class_3090.field_15341, var24, var25, var26, 0, (double)(-var20), 0.01, (double)var19, 1.0);
               }
            }
         }
      } else {
         this.field_19142--;
         if (this.field_19142 <= 0) {
            this.field_19147 = 0;
            this.field_19137 = 0;
            this.method_37372().method_36633(field_19150, false);
         }
      }
   }

   private boolean method_18222(class_1331 var1) {
      class_897 var4 = class_897.field_4606;

      for (int var5 = -1; var5 <= 2; var5++) {
         class_897 var6 = this.method_18221(var1.method_6104(-2, var5, -2), var1.method_6104(2, var5, 2));
         switch (var6) {
            case field_4606:
               return false;
            case field_4608:
               if (var4 == class_897.field_4606) {
                  return false;
               }
               break;
            case field_4607:
               if (var4 == class_897.field_4608) {
                  return false;
               }
         }

         var4 = var6;
      }

      return true;
   }

   private class_897 method_18221(class_1331 var1, class_1331 var2) {
      return class_1331.method_6084(var1, var2)
         .<class_897>map(this::method_18220)
         .reduce((var0, var1x) -> var0 != var1x ? class_897.field_4606 : var0)
         .orElse(class_897.field_4606);
   }

   private class_897 method_18220(class_1331 var1) {
      class_2522 var4 = this.field_41768.method_28262(var1);
      if (!var4.method_8345() && !var4.method_8350(class_4783.field_23860)) {
         class_4774 var5 = var4.method_8364();
         return var5.method_22007(class_6503.field_33094) && var5.method_21993() && var4.method_8324(this.field_41768, var1).method_19485()
            ? class_897.field_4607
            : class_897.field_4606;
      } else {
         return class_897.field_4608;
      }
   }

   public boolean method_18215() {
      return this.field_19141;
   }

   @Override
   public void method_37376(class_5734 var1) {
   }

   @Override
   public void method_37314(class_5734 var1) {
   }

   public int method_18216(class_6098 var1) {
      class_704 var4 = this.method_18219();
      if (!this.field_41768.field_33055 && var4 != null) {
         int var5 = 0;
         if (this.field_19144 == null) {
            if (this.field_19142 > 0) {
               class_8480 var6 = new class_8480((class_6331)this.field_41768)
                  .method_39065(class_8712.field_44671, this.method_37245())
                  .method_39065(class_8712.field_44670, var1)
                  .method_39065(class_8712.field_44676, this)
                  .method_39068(this.field_41717)
                  .method_39063((float)this.field_19143 + var4.method_3234());
               class_1758 var7 = this.field_41768.method_29522().method_1722().method_4604(class_5931.field_30096);
               List var8 = var7.method_7862(var6.method_39064(class_4933.field_25570));
               class_8807.field_45056.method_6617((class_9359)var4, var1, this, var8);

               for (class_6098 var10 : var8) {
                  class_91 var11 = new class_91(this.field_41768, this.method_37302(), this.method_37309(), this.method_37156(), var10);
                  double var12 = var4.method_37302() - this.method_37302();
                  double var14 = var4.method_37309() - this.method_37309();
                  double var16 = var4.method_37156() - this.method_37156();
                  double var18 = 0.1;
                  var11.method_37214(var12 * 0.1, var14 * 0.1 + Math.sqrt(Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16)) * 0.08, var16 * 0.1);
                  this.field_41768.method_7509(var11);
                  var4.field_41768
                     .method_7509(
                        new class_5614(
                           var4.field_41768, var4.method_37302(), var4.method_37309() + 0.5, var4.method_37156() + 0.5, this.field_41717.nextInt(6) + 1
                        )
                     );
                  if (var10.method_27960().method_11250(class_391.field_1613)) {
                     var4.method_3210(class_6234.field_31852, 1);
                  }
               }

               var5 = 1;
            }
         } else {
            this.method_18224();
            class_8807.field_45056.method_6617((class_9359)var4, var1, this, Collections.<class_6098>emptyList());
            this.field_41768.method_29587(this, (byte)31);
            var5 = !(this.field_19144 instanceof class_91) ? 5 : 3;
         }

         if (this.field_41726) {
            var5 = 2;
         }

         this.method_37204();
         return var5;
      } else {
         return 0;
      }
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 == 31 && this.field_41768.field_33055 && this.field_19144 instanceof class_704 && ((class_704)this.field_19144).method_3183()) {
         this.method_18224();
      }

      super.method_37336(var1);
   }

   public void method_18224() {
      class_8145 var3 = this.method_26166();
      if (var3 != null) {
         class_1343 var4 = new class_1343(
               var3.method_37302() - this.method_37302(), var3.method_37309() - this.method_37309(), var3.method_37156() - this.method_37156()
            )
            .method_6209(0.1);
         this.field_19144.method_37215(this.field_19144.method_37098().method_6215(var4));
      }
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public void method_37204() {
      super.method_37204();
      class_704 var3 = this.method_18219();
      if (var3 != null) {
         var3.field_3841 = null;
      }
   }

   @Nullable
   public class_704 method_18219() {
      class_8145 var3 = this.method_26166();
      return !(var3 instanceof class_704) ? null : (class_704)var3;
   }

   @Nullable
   public class_8145 method_18226() {
      return this.field_19144;
   }

   @Override
   public boolean method_37148() {
      return false;
   }

   @Override
   public class_6310<?> method_37142() {
      class_8145 var3 = this.method_26166();
      return new class_6589(this, var3 != null ? var3.method_37145() : this.method_37145());
   }
}
