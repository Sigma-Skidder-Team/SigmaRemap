package remapped;

import java.util.logging.Level;
import net.sourceforge.jaad.aac.AACException;

public class class_940 implements class_3471 {
   private class_6616 field_4801;
   private boolean field_4796;
   private boolean field_4802;
   private int field_4795;
   private final class_6828 field_4793;
   private final class_7958[] field_4800;
   private final class_7569[] field_4790;
   private final class_5480[] field_4797;
   private final class_9893[] field_4791;
   private int field_4799;
   private int field_4792;
   private int field_4788;
   private int field_4789;
   private float[][] field_4798;

   public class_940(class_6616 var1) {
      this.field_4801 = var1;
      this.field_4793 = new class_6828();
      this.field_4800 = new class_7958[64];
      this.field_4790 = new class_7569[16];
      this.field_4797 = new class_5480[16];
      this.field_4791 = new class_9893[16];
      this.method_4066();
   }

   public final void method_4066() {
      this.field_4799 = 0;
      this.field_4792 = 0;
      this.field_4788 = 0;
      this.field_4789 = 0;
      this.field_4796 = false;
      this.field_4802 = false;
      this.field_4795 = 0;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_4061(class_7390 var1) throws AACException {
      int var4 = var1.method_33665();
      class_7958 var5 = null;
      boolean var6 = true;
      if (this.field_4801.method_30415().method_38276()) {
         switch (this.field_4801.method_30410()) {
            case field_35389:
               this.method_4067(var1);
               break;
            case field_35385:
               this.method_4074(var1);
               break;
            case field_35392:
               this.method_4067(var1);
               this.method_4074(var1);
               break;
            case field_35388:
               this.method_4067(var1);
               this.method_4074(var1);
               this.method_4067(var1);
               break;
            case field_35383:
               this.method_4067(var1);
               this.method_4074(var1);
               this.method_4074(var1);
               break;
            case field_35384:
               this.method_4067(var1);
               this.method_4074(var1);
               this.method_4074(var1);
               this.method_4067(var1);
               break;
            case field_35391:
               this.method_4067(var1);
               this.method_4074(var1);
               this.method_4074(var1);
               this.method_4074(var1);
               this.method_4067(var1);
               break;
            default:
               throw new class_5060("unsupported channel configuration for error resilience: " + this.field_4801.method_30410());
         }
      } else {
         int var7;
         while (var6 && (var7 = var1.method_33662(3)) != 7) {
            switch (var7) {
               case 0:
               case 3:
                  field_17021.finest("SCE");
                  var5 = this.method_4067(var1);
                  break;
               case 1:
                  field_17021.finest("CPE");
                  var5 = this.method_4074(var1);
                  break;
               case 2:
                  field_17021.finest("CCE");
                  this.method_4068(var1);
                  var5 = null;
                  break;
               case 4:
                  field_17021.finest("DSE");
                  this.method_4063(var1);
                  var5 = null;
                  break;
               case 5:
                  field_17021.finest("PCE");
                  this.method_4071(var1);
                  var5 = null;
                  break;
               case 6:
                  field_17021.finest("FIL");
                  this.method_4062(var1, var5);
                  var5 = null;
            }
         }

         field_17021.finest("END");
         var6 = false;
         var5 = null;
      }

      var1.method_33653();
      this.field_4795 = var1.method_33665() - var4;
   }

   private class_7958 method_4067(class_7390 var1) throws AACException {
      if (this.field_4800[this.field_4799] == null) {
         this.field_4800[this.field_4799] = new class_3976(this.field_4801.method_30421());
      }

      ((class_3976)this.field_4800[this.field_4799]).method_18356(var1, this.field_4801);
      this.field_4799++;
      return this.field_4800[this.field_4799 - 1];
   }

   private class_7958 method_4074(class_7390 var1) throws AACException {
      if (this.field_4800[this.field_4799] == null) {
         this.field_4800[this.field_4799] = new class_4444(this.field_4801.method_30421());
      }

      ((class_4444)this.field_4800[this.field_4799]).method_20611(var1, this.field_4801);
      this.field_4799++;
      return this.field_4800[this.field_4799 - 1];
   }

   private void method_4068(class_7390 var1) throws AACException {
      if (this.field_4792 != 16) {
         if (this.field_4790[this.field_4792] == null) {
            this.field_4790[this.field_4792] = new class_7569(this.field_4801.method_30421());
         }

         this.field_4790[this.field_4792].method_34420(var1, this.field_4801);
         this.field_4792++;
      } else {
         throw new class_5060("too much CCE elements");
      }
   }

   private void method_4063(class_7390 var1) throws AACException {
      if (this.field_4788 != 16) {
         if (this.field_4797[this.field_4788] == null) {
            this.field_4797[this.field_4788] = new class_5480();
         }

         this.field_4797[this.field_4788].method_24900(var1);
         this.field_4788++;
      } else {
         throw new class_5060("too much CCE elements");
      }
   }

   private void method_4071(class_7390 var1) throws AACException {
      this.field_4793.method_31315(var1);
      this.field_4801.method_30408(this.field_4793.method_31318());
      this.field_4801.method_30426(this.field_4793.method_31316());
      this.field_4801.method_30427(class_6871.method_31523(this.field_4793.method_31317()));
   }

   private void method_4062(class_7390 var1, class_7958 var2) throws AACException {
      if (this.field_4789 != 16) {
         if (this.field_4791[this.field_4789] == null) {
            this.field_4791[this.field_4789] = new class_9893(this.field_4801.method_30430());
         }

         this.field_4791[this.field_4789]
            .method_45573(var1, var2, this.field_4801.method_30420(), this.field_4801.method_30412(), this.field_4801.method_30429());
         this.field_4789++;
         if (var2 != null && var2.method_36004()) {
            this.field_4796 = true;
            if (!this.field_4802 && var2.method_36006().method_38971()) {
               this.field_4802 = true;
            }
         }
      } else {
         throw new class_5060("too much FIL elements");
      }
   }

   public void method_4072(class_5346 var1) throws AACException {
      class_8296 var4 = this.field_4801.method_30415();
      class_8965 var5 = this.field_4801.method_30420();
      int var6 = this.field_4801.method_30410().method_31522();
      if (var6 == 1 && this.field_4802) {
         var6++;
      }

      int var7 = !this.field_4796 ? 1 : 2;
      if (this.field_4798 == null || var6 != this.field_4798.length || var7 * this.field_4801.method_30421() != this.field_4798[0].length) {
         this.field_4798 = new float[var6][var7 * this.field_4801.method_30421()];
      }

      int var8 = 0;

      for (int var9 = 0; var9 < this.field_4800.length && var8 < var6; var9++) {
         class_7958 var10 = this.field_4800[var9];
         if (var10 != null) {
            if (!(var10 instanceof class_3976)) {
               if (!(var10 instanceof class_4444)) {
                  if (var10 instanceof class_7569) {
                     ((class_7569)var10).method_34414();
                     var8++;
                  }
               } else {
                  class_4444 var12 = (class_4444)var10;
                  this.method_4065(var12, var1, var8, var4, var5);
                  var8 += 2;
               }
            } else {
               class_3976 var11 = (class_3976)var10;
               var8 += this.method_4075(var11, var1, var8, var4, var5);
            }
         }
      }
   }

   private int method_4075(class_3976 var1, class_5346 var2, int var3, class_8296 var4, class_8965 var5) throws AACException {
      class_9143 var8 = var1.method_18355();
      class_2568 var9 = var8.method_42072();
      class_9214 var10 = var9.method_11664();
      int var11 = var1.method_36007();
      float[] var12 = var8.method_42059();
      if (var4.equals(class_8296.field_42513) && var9.method_11675()) {
         var9.method_11668().method_43628(var8, var12, var5);
      }

      if (class_9214.method_42560(var4) && var9.method_11658()) {
         var10.method_42555(var8, var12, var2, var5);
      }

      this.method_4069(false, var11, 0, var12, null);
      if (var8.method_42060()) {
         var8.method_42061().method_22371(var8, var12, var5, false);
      }

      this.method_4069(false, var11, 1, var12, null);
      var2.method_24372(var9.method_11669(), var9.method_11677(1), var9.method_11677(0), var12, this.field_4798[var3], var3);
      if (class_9214.method_42560(var4)) {
         var10.method_42557(this.field_4798[var3], var2.method_24370(var3), var4);
      }

      this.method_4064(false, var11, this.field_4798[var3], null);
      if (var8.method_42073()) {
         var8.method_42070().method_19284(var12, var9.method_11677(1), var9.method_11677(0), var9.method_11669());
      }

      byte var13 = 1;
      if (this.field_4796 && this.field_4801.method_30412()) {
         if (this.field_4798[var3].length == this.field_4801.method_30421()) {
            field_17021.log(Level.WARNING, "SBR data present, but buffer has normal size!");
         }

         class_8470 var14 = var1.method_36006();
         if (!var14.method_38971()) {
            var1.method_36006().method_38975(this.field_4798[var3], false);
         } else {
            var13 = 2;
            var1.method_36006().method_38976(this.field_4798[var3], this.field_4798[var3 + 1], false);
         }
      }

      return var13;
   }

   private void method_4065(class_4444 var1, class_5346 var2, int var3, class_8296 var4, class_8965 var5) throws AACException {
      class_9143 var8 = var1.method_20608();
      class_9143 var9 = var1.method_20607();
      class_2568 var10 = var8.method_42072();
      class_2568 var11 = var9.method_42072();
      class_9214 var12 = var10.method_11664();
      class_9214 var13 = !var1.method_20612() ? var11.method_11664() : var10.method_11663();
      int var14 = var1.method_36007();
      float[] var15 = var8.method_42059();
      float[] var16 = var9.method_42059();
      if (var1.method_20612() && var1.method_20610()) {
         class_3652.method_16980(var1, var15, var16);
      }

      if (var4.equals(class_8296.field_42513)) {
         if (var10.method_11675()) {
            var10.method_11668().method_43628(var8, var15, var5);
         }

         if (var11.method_11675()) {
            var11.method_11668().method_43628(var9, var16, var5);
         }
      }

      class_1834.method_8108(var1, var15, var16);
      if (class_9214.method_42560(var4)) {
         if (var10.method_11658()) {
            var12.method_42555(var8, var15, var2, var5);
         }

         if (var1.method_20612() && var10.method_11666()) {
            var13.method_42555(var9, var16, var2, var5);
         } else if (var11.method_11658()) {
            var13.method_42555(var9, var16, var2, var5);
         }
      }

      this.method_4069(true, var14, 0, var15, var16);
      if (var8.method_42060()) {
         var8.method_42061().method_22371(var8, var15, var5, false);
      }

      if (var9.method_42060()) {
         var9.method_42061().method_22371(var9, var16, var5, false);
      }

      this.method_4069(true, var14, 1, var15, var16);
      var2.method_24372(var10.method_11669(), var10.method_11677(1), var10.method_11677(0), var15, this.field_4798[var3], var3);
      var2.method_24372(var11.method_11669(), var11.method_11677(1), var11.method_11677(0), var16, this.field_4798[var3 + 1], var3 + 1);
      if (class_9214.method_42560(var4)) {
         var12.method_42557(this.field_4798[var3], var2.method_24370(var3), var4);
         var13.method_42557(this.field_4798[var3 + 1], var2.method_24370(var3 + 1), var4);
      }

      this.method_4064(true, var14, this.field_4798[var3], this.field_4798[var3 + 1]);
      if (var8.method_42073()) {
         var8.method_42070().method_19284(var15, var10.method_11677(1), var10.method_11677(0), var10.method_11669());
      }

      if (var9.method_42073()) {
         var9.method_42070().method_19284(var16, var11.method_11677(1), var11.method_11677(0), var11.method_11669());
      }

      if (this.field_4796 && this.field_4801.method_30412()) {
         if (this.field_4798[var3].length == this.field_4801.method_30421()) {
            field_17021.log(Level.WARNING, "SBR data present, but buffer has normal size!");
         }

         var1.method_36006().method_38976(this.field_4798[var3], this.field_4798[var3 + 1], false);
      }
   }

   private void method_4064(boolean var1, int var2, float[] var3, float[] var4) {
      for (int var7 = 0; var7 < this.field_4790.length; var7++) {
         class_7569 var8 = this.field_4790[var7];
         int var9 = 0;
         if (var8 != null && var8.method_34415() == 2) {
            for (int var10 = 0; var10 <= var8.method_34421(); var10++) {
               int var11 = var8.method_34418(var10);
               if (var8.method_34419(var10) == var1 && var8.method_34422(var10) == var2) {
                  if (var11 != 1) {
                     var8.method_34416(var9, var3);
                     if (var11 != 0) {
                        var9++;
                     }
                  }

                  if (var11 != 2) {
                     var8.method_34416(var9, var4);
                     var9++;
                  }
               } else {
                  var9 += 1 + (var11 != 3 ? 0 : 1);
               }
            }
         }
      }
   }

   private void method_4069(boolean var1, int var2, int var3, float[] var4, float[] var5) {
      for (int var8 = 0; var8 < this.field_4790.length; var8++) {
         class_7569 var9 = this.field_4790[var8];
         int var10 = 0;
         if (var9 != null && var9.method_34415() == var3) {
            for (int var11 = 0; var11 <= var9.method_34421(); var11++) {
               int var12 = var9.method_34418(var11);
               if (var9.method_34419(var11) == var1 && var9.method_34422(var11) == var2) {
                  if (var12 != 1) {
                     var9.method_34417(var10, var4);
                     if (var12 != 0) {
                        var10++;
                     }
                  }

                  if (var12 != 2) {
                     var9.method_34417(var10, var5);
                     var10++;
                  }
               } else {
                  var10 += 1 + (var12 != 3 ? 0 : 1);
               }
            }
         }
      }
   }

   public void method_4073(class_3885 var1) {
      boolean var4 = var1.method_17967();
      int var5 = this.field_4798.length;
      int var6 = this.field_4796 && this.field_4801.method_30412() ? 2 : 1;
      int var7 = var6 * this.field_4801.method_30421();
      int var8 = var6 * this.field_4801.method_30420().method_41132();
      byte[] var9 = var1.method_17971();
      if (var9.length != var5 * var7 * 2) {
         var9 = new byte[var5 * var7 * 2];
      }

      for (int var10 = 0; var10 < var5; var10++) {
         float[] var11 = this.field_4798[var10];

         for (int var12 = 0; var12 < var7; var12++) {
            short var13 = (short)Math.max(Math.min(Math.round(var11[var12]), 32767), -32768);
            int var14 = (var12 * var5 + var10) * 2;
            if (!var4) {
               var9[var14 + 1] = (byte)(var13 >> 8 & 0xFF);
               var9[var14] = (byte)(var13 & 255);
            } else {
               var9[var14] = (byte)(var13 >> 8 & 0xFF);
               var9[var14 + 1] = (byte)(var13 & 255);
            }
         }
      }

      var1.method_17965(var9, var8, var5, 16, this.field_4795);
   }
}
