package remapped;

public class class_2462 extends Module {
   private int field_12323;
   private double field_12322;
   private double field_12324;
   private double field_12319;
   private class_8988 field_12321 = class_8988.field_46028;

   public class_2462() {
      super(class_5664.field_28716, "Hypixel", "Speed for Hypixel");
      this.method_42010(new class_8563("AutoJump", "Automatically jumps for you.", true));
      this.method_42010(new class_8563("Timer", "Use timer", true));
      this.method_42010(new class_8563("GroundSpeed", "Move faster on ground", true));
      this.method_42010(new class_8563("BorderJump", "Automatically jumps off edges with speed", true));
   }

   @Override
   public void method_42006() {
      this.field_12322 = class_8865.method_40767();
      this.field_12323 = 6;
      this.field_12321 = class_8988.field_46028;
      this.field_12324 = -1.0;
      this.field_12319 = 0.0;
   }

   @Override
   public void method_42020() {
      if (this.field_12321 == class_8988.field_46026 && field_46692.field_9632.method_37098().field_7333 > 0.0 && this.field_12323 == 0) {
         class_314.method_1408(-class_8865.method_40786() - 1.0E-5 - 0.0625);
      }

      if (Math.abs((double)field_46692.field_9616.field_32603 - 1.4123) < 0.001
         && !SigmaMainClass.method_3328().method_3298().method_847(class_6803.class).method_42015()) {
         field_46692.field_9616.field_32603 = 1.0F;
      }
   }

   @class_9148
   @class_7664
   public void method_11348(class_1393 var1) {
      if (field_46692.field_9632.field_41726) {
         if (!SigmaMainClass.method_3328().method_3298().method_847(class_9801.class).method_42003()
            || class_2534.field_12558 == null && class_2534.field_12556 == null
            || this.field_12321 != class_8988.field_46026) {
            this.field_12319 = 0.0;
         } else if (var1.method_6449()) {
            if (this.field_12319 > 3.0) {
               this.field_12319 = 0.0;
               field_46692.method_8614().method_4813(new class_4609(true));
            }

            var1.method_6451(false);
         }
      }
   }

   @class_9148
   @class_3932
   @class_315
   public void method_11349(class_7767 var1) {
      if (!this.method_42015()) {
         if (field_46692.field_9632.field_41726
            || class_314.method_1413(field_46692.field_9632, 0.001F)
            || field_46692.field_9632.method_37309() < this.field_12324) {
            this.field_12324 = -1.0;
         }
      } else {
         field_46692.field_9632.field_29600 = 0;
         if (field_46692.field_9632.field_41726) {
            this.field_12324 = field_46692.field_9632.method_37309();
            if (!SigmaMainClass.method_3328().method_3298().method_847(class_6803.class).method_42015()) {
               field_46692.field_9616.field_32603 = 1.0F;
            }

            if (this.field_12323 >= 0 && class_4181.field_20352 >= 2) {
               if ((var1.method_35236() > 0.0 || this.method_42007("AutoJump") && class_314.method_1434()) && !class_314.method_1437(field_46692.field_9632)) {
                  field_46692.field_9632.method_26595();
                  var1.method_35235(class_8865.method_40786());
                  class_8865.method_40777(var1, 0.644348756324588 + Math.random() * 1.0E-6 + (double)class_8865.method_40770() * 0.13);
                  if (this.method_42007("Timer") && !SigmaMainClass.method_3328().method_3298().method_847(class_6803.class).method_42015()) {
                     field_46692.field_9616.field_32603 = 1.4123F;
                  }

                  this.field_12323 = 0;
                  this.field_12321 = class_8988.field_46028;
               } else if (class_314.method_1434() && this.method_42007("GroundSpeed") && !class_314.method_1437(field_46692.field_9632)) {
                  field_46692.field_9632.field_41733 = 0.5F;
                  field_46692.field_9632.method_26595();
                  var1.method_35235(0.399 + (double)class_8865.method_40769() * 0.1 + 1.0E-14);
                  class_8865.method_40777(var1, 0.51 + Math.random() * 1.0E-6 + (double)class_8865.method_40770() * 0.098);
                  this.field_12323 = 0;
                  if (this.method_42007("Timer") && !SigmaMainClass.method_3328().method_3298().method_847(class_6803.class).method_42015()) {
                     field_46692.field_9616.field_32603 = 1.1123F;
                  }

                  this.field_12321 = class_8988.field_46026;
               } else {
                  this.field_12319 = 0.0;
               }
            } else {
               class_8865.method_40777(var1, 0.25);
               if (this.field_12323 < 0) {
                  this.field_12323++;
               }
            }
         } else if (this.field_12323 >= 0) {
            double var4 = class_8865.method_40775();
            if (!SigmaMainClass.method_3328().method_3298().method_847(class_6803.class).method_42015()) {
               field_46692.field_9616.field_32603 = 1.0F;
            }

            switch (this.field_12321) {
               case field_46028:
                  if (this.field_12323 == 0) {
                     this.field_12322 = 0.3893478969348657 + Math.random() * 1.0E-6 + (double)class_8865.method_40770() * 0.077;
                  } else {
                     double var8 = 0.99375 - (double)this.field_12323 * 1.0E-13;
                     this.field_12322 *= var8;
                  }

                  if (class_8865.method_40769() == 0 && !SigmaMainClass.method_3328().method_3298().method_847(class_3709.class).method_42015()) {
                     this.method_11344(var1, this.field_12323);
                  }

                  if (this.field_12319 > 3.0) {
                     this.field_12319 = 0.0;
                     field_46692.method_8614().method_4813(new class_4609(true));
                  }
                  break;
               case field_46026:
                  if (this.field_12323 == 0) {
                     double var6 = 0.399 + (double)class_8865.method_40769() * 0.1 + 1.0E-5;
                     if (this.method_42007("BorderJump")
                        && field_46692.field_9601
                              .method_6680(field_46692.field_9632, field_46692.field_9632.field_41712.method_18928(0.0, -var6 - 0.0625, 0.0))
                              .count()
                           == 0L) {
                        this.field_12322 = 0.4103345672948576 + Math.random() * 1.0E-6 + (double)class_8865.method_40770() * 0.085;
                        this.field_12324 = -1.0;
                     } else {
                        var1.method_35235(-var6 - 0.0625);
                        this.field_12319 = this.field_12319 - var1.method_35236();
                        this.field_12322 = 0.3 + Math.random() * 1.0E-6 + (double)class_8865.method_40770() * 0.067;
                     }
                  } else if (this.field_12323 == 1 && var1.method_35236() < 0.0) {
                     this.field_12322 *= 0.7;
                  } else {
                     this.field_12322 *= 0.981;
                  }
            }

            if (this.field_12322 < var4 || field_46692.field_9632.field_41744 || !class_314.method_1434() || class_314.method_1437(field_46692.field_9632)) {
               this.field_12322 = var4;
            }

            class_8865.method_40777(var1, this.field_12322);
            this.field_12323++;
         }
      }
   }

   @class_9148
   @class_7664
   public void method_11346(class_2911 var1) {
      if (!class_7033.method_32081() && !SigmaMainClass.method_3328().method_3298().method_847(class_2368.class).method_42015()) {
         if (this.method_42007("Auto Jump") || field_46692.field_9632.field_29654) {
            if (this.field_12323 < 0) {
               var1.method_29715(true);
            }
         }
      }
   }

   @class_9148
   public void method_11343(class_139 var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_509) {
            this.field_12323 = -2;
         }
      }
   }

   @class_9148
   public void method_11350(class_717 var1) {
      this.field_12324 = -1.0;
   }

   @class_9148
   @class_3932
   public void method_11345(class_1711 var1) {
      if (!field_46692.field_9632.field_41726
         && !class_314.method_1413(field_46692.field_9632, 1.0E-4F)
         && class_314.method_1413(field_46692.field_9632, (float)(class_8865.method_40786() + 1.0E-5 + 0.0625))
         && class_4181.field_20352 >= 2
         && !(this.field_12324 < 0.0)
         && this.field_12321 == class_8988.field_46026
         && !(field_46692.field_9632.method_37309() < this.field_12324)) {
         field_46692.field_9632.field_41736.field_7333 = this.field_12324;
         field_46692.field_9632.field_41713 = this.field_12324;
         field_46692.field_9632.field_3864 = this.field_12324;
         field_46692.field_9632.field_41698 = this.field_12324;
         if (class_8865.method_40772()) {
            field_46692.field_9632.field_3859 = 0.099999994F;
         }
      }
   }

   @Override
   public boolean method_42003() {
      return this.method_42015()
         && (
            !field_46692.field_9632.field_41726
               || field_46692.field_9632.field_29654
               || this.method_42007("AutoJump")
               || this.field_12321 == class_8988.field_46026
         );
   }

   private void method_11344(class_7767 var1, int var2) {
      if (var2 != 0) {
         if (var2 != 1) {
            if (var2 != 2) {
               if (var2 == 3 && Math.abs(var1.method_35236()) < 0.1 && class_3347.method_15349() == class_412.field_1747.method_2055()) {
                  var1.method_35235(0.0300011120129438);
               }
            } else {
               var1.method_35235(var1.method_35236() * 0.967);
            }
         } else {
            var1.method_35235(var1.method_35236() * 0.98);
         }
      } else {
         var1.method_35235(var1.method_35236() * 0.985);
      }
   }

   public void method_11347() {
      this.field_12323 = 0;
   }
}
