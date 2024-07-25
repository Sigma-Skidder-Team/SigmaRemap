package remapped;

import java.util.HashMap;

public class class_5329 extends class_2612 {
   private Module field_27182;
   public class_3384 field_27184 = class_3054.field_14994;
   public class_2440 field_27181 = new class_2440(150, 150);
   public HashMap<Module, class_7038> field_27185 = new HashMap<Module, class_7038>();

   public class_5329(class_7038 var1, String var2, int var3, int var4, int var5, int var6, Module var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field_27182 = var7;
      this.method_32105(false);
      this.method_24301();
   }

   private int method_24303(class_7038 var1, Setting var2, int var3, int var4, int var5) {
      class_1552 var8 = new class_1552(var1, var2.method_23032() + "lbl", var3, var4, 0, 0, class_1552.field_8208, var2.method_23032(), this.field_27184);
      class_5412 var9 = new class_5412(var1, var2.method_23032() + "desc", var3 + 195, var4 + 4, 330, 18, var2);
      var1.method_32148(var8);
      var1.method_32148(var9);
      switch (var2.method_23030()) {
         case field_26724:
            byte var18 = 40;
            byte var22 = 18;
            class_3540 var26 = new class_3540(var1, var2.method_23032() + "checkbox", var3 + 135, var4 + 4, 40, 18);
            var26.method_16324((Boolean)var2.method_23031(), false);
            var2.method_23029(var1x -> {
               if (var26.method_16328() != (Boolean)var1x.method_23031()) {
                  var26.method_16324((Boolean)var1x.method_23031(), false);
               }
            });
            var26.method_8236(var1x -> var2.method_23037(((class_3540)var1x).method_16328()));
            var1.method_32148(var26);
            var4 += 18 + var5;
            break;
         case field_26718:
            short var17 = 240;
            byte var21 = 4;
            FloatSetting var25 = (FloatSetting)var2;
            class_397 var13 = new class_397(var1, var2.method_23032() + "slider", var3, var4 + 31, 240, 4);
            var13.method_32186(Float.toString((Float)var2.method_23031()));
            var8.method_32186(var2.method_23032() + ": " + Float.toString((Float)var2.method_23031()));
            var13.method_1989(class_1479.method_6825(var25.method_12385(), var25.method_12387(), (Float)var25.method_23031()), false);
            int var14 = var25.method_12386();
            var25.method_23029(
               var5x -> {
                  if (class_397.method_1993(var13.method_1987(), var25.method_12385(), var25.method_12387(), var25.method_12382(), var14)
                     != (Float)var5x.method_23031()) {
                     var13.method_32186(Float.toString((Float)var5x.method_23031()));
                     var13.method_1989(class_397.method_1992(var25.method_12385(), var25.method_12387(), (Float)var5x.method_23031()), false);
                     var8.method_32186(var2.method_23032() + ": " + Float.toString((Float)var2.method_23031()));
                  }
               }
            );
            var13.method_8236(var5x -> {
               float var8x = ((class_397)var5x).method_1987();
               float var9x = class_397.method_1993(var8x, var25.method_12385(), var25.method_12387(), var25.method_12382(), var14);
               if (var9x != (Float)var2.method_23031()) {
                  var13.method_32186(Float.toString(var9x));
                  var2.method_23037(var9x);
               }

               var8.method_32186(var2.method_23032() + ": " + Float.toString((Float)var2.method_23031()));
            });
            var1.method_32148(var13);
            var4 += 54;
            break;
         case field_26723:
            byte var16 = 114;
            byte var20 = 27;
            class_9486 var24;
            this.method_32148(
               var24 = new class_9486(
                  var1,
                  var2.method_23032() + "txt",
                  var3,
                  var4 + 27,
                  var16,
                  var20,
                  class_3004.field_14738,
                  (String)var2.method_23031(),
                  var2.method_23032(),
                  class_5320.field_27156
               )
            );
            var24.method_32144(class_5320.field_27139);
            var24.method_13721(var1x -> var2.method_23037(var1x.method_32165()));
            var2.method_23029(var2x -> {
               if (var24.method_32165() != ((HippieModeValue)var2).method_23031()) {
                  var24.method_32186(((HippieModeValue)var2).method_23031());
               }
            });
            var4 += var20 + var5;
            break;
         case field_26722:
            byte var15 = 80;
            byte var19 = 20;
            class_2003 var23 = new class_2003(
               var1, var2.method_23032() + "btn", var3, var4 + 27, 80, 20, ((ModeSetting)var2).method_12860(), ((ModeSetting)var2).method_12858()
            );
            var2.method_23029(var2x -> {
               if (var23.method_9311() != ((ModeSetting)var2).method_12858()) {
                  var23.method_9309(((ModeSetting)var2).method_12858());
               }
            });
            var23.method_8236(var1x -> ((ModeSetting)var2).method_12859(((class_2003)var1x).method_9311()));
            var1.method_32148(var23);
            var4 += 65;
            break;
         case field_26720:
            byte var10 = 123;
            byte var11 = 27;
            class_9563 var12 = new class_9563(
               var1,
               var2.method_23032() + "btn",
               var1.method_32109() - var5,
               var4 + 6,
               123,
               27,
               ((SomeWeirdIntegerSetting)var2).method_32991(),
               (Integer)var2.method_23031()
            );
            var2.method_23029(var1x -> {
               if (var12.method_44209() != (Integer)var1x.method_23031()) {
                  var12.method_44211((Integer)var1x.method_23031(), false);
               }
            });
            var12.method_8236(var1x -> var2.method_23037(((class_9563)var1x).method_44209()));
            var12.method_32135((var2x, var3x) -> var2x.method_32175(var1.method_32109() - 123 - var5));
            var1.method_32148(var12);
            var4 += 27 + var5;
         case field_26716:
         case field_26719:
         case field_26717:
      }

      return var4 - (var5 - 10);
   }

   private void method_24301() {
      class_1552 var3 = new class_1552(
         this, "settingsname", 12, 2, this.field_36278, 20, class_1552.field_8208, this.field_27182.method_41987() + " Settings", this.field_27184
      );
      this.method_32148(var3);
      byte var4 = 20;
      byte var5 = 30;
      int var6 = 35;

      for (Setting var8 : this.field_27182.method_41996().values()) {
         if (var8.method_23030() != class_5195.field_26721 && var8.method_23030() != class_5195.field_26727) {
            var6 = this.method_24303(this, var8, 30, var6, 20);
         }
      }

      if (this.field_27182 instanceof SecondModule) {
         SecondModule var16 = (SecondModule)this.field_27182;

         for (Module var11 : var16.field_17661) {
            int var12 = 10;
            class_7038 var13 = new class_7038(this, var11.method_41992() + "SubView", 0, var6, this.field_36278, this.field_36257 - var6);
            var13.method_32135((var0, var1) -> var0.method_32142(var1.method_32109()));

            for (Setting var15 : var11.method_41996().values()) {
               var12 = this.method_24303(var13, var15, 30, var12, 20);
            }

            this.method_32148(var13);
            this.field_27185.put(var11, var13);
         }

         var16.method_16865((var1, var2, var3x) -> this.field_27185.get(var2).method_32104(var3x));
         var16.method_16866();
      }

      this.method_32148(new class_1552(this, "lbl", 5, 200, 0, 33, class_1552.field_8208, this.field_36275));
   }

   public void method_24304() {
      this.field_27181.method_11119(class_4043.field_19618);
   }

   public boolean method_24302() {
      return this.field_27181.method_11128() == class_4043.field_19618 && this.field_27181.method_11123() == 0.0F;
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      int var4 = Math.round((float)this.method_32137() * class_3483.method_15985(this.field_27181.method_11123(), 0.0F, 1.0F, 1.0F));
      if (this.field_27181.method_11128() == class_4043.field_19618) {
         var4 = Math.round((float)this.method_32137() * class_3483.method_15984(this.field_27181.method_11123(), 0.0F, 1.0F, 1.0F));
      }

      class_73.method_135((float)this.field_36270, (float)(70 + this.method_32137() - var4), (float)this.method_32109(), (float)var4);
      class_73.method_103((float)this.field_36270, (float)(70 + this.method_32137() - var4), (float)this.method_32109(), (float)var4, -2631721);
      super.method_32178(var1);
      class_73.method_141();
   }
}
