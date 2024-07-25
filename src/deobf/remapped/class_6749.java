package remapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class class_6749 extends class_5783 {
   private static final class_7821<Byte> field_34839 = class_8073.<Byte>method_36641(class_6749.class, class_2734.field_13361);
   private static final class_7821<Byte> field_34842 = class_8073.<Byte>method_36641(class_6749.class, class_2734.field_13361);
   private class_2522 field_34836;
   public boolean field_34834;
   public int field_34840;
   public class_4237 field_34835 = class_4237.field_20564;
   public int field_34831;
   private int field_34833;
   private double field_34838 = 2.0;
   private int field_34832;
   private class_8461 field_34843 = this.method_30933();
   private IntOpenHashSet field_34837;
   private List<class_8145> field_34841;

   public class_6749(class_6629<? extends class_6749> var1, class_6486 var2) {
      super(var1, var2);
   }

   public class_6749(class_6629<? extends class_6749> var1, double var2, double var4, double var6, class_6486 var8) {
      this(var1, var8);
      this.method_37256(var2, var4, var6);
   }

   public class_6749(class_6629<? extends class_6749> var1, class_5834 var2, class_6486 var3) {
      this(var1, var2.method_37302(), var2.method_37388() - 0.1F, var2.method_37156(), var3);
      this.method_26159(var2);
      if (var2 instanceof class_704) {
         this.field_34835 = class_4237.field_20563;
      }
   }

   public void method_30941(class_8461 var1) {
      this.field_34843 = var1;
   }

   @Override
   public boolean method_37176(double var1) {
      double var5 = this.method_37241().method_18906() * 10.0;
      if (Double.isNaN(var5)) {
         var5 = 1.0;
      }

      var5 = var5 * 64.0 * method_37345();
      return var1 < var5 * var5;
   }

   @Override
   public void method_37329() {
      this.field_41735.method_36634(field_34839, (byte)0);
      this.field_41735.method_36634(field_34842, (byte)0);
   }

   @Override
   public void method_26161(double var1, double var3, double var5, float var7, float var8) {
      super.method_26161(var1, var3, var5, var7, var8);
      this.field_34833 = 0;
   }

   @Override
   public void method_37318(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.method_37256(var1, var3, var5);
      this.method_37395(var7, var8);
   }

   @Override
   public void method_37162(double var1, double var3, double var5) {
      super.method_37162(var1, var3, var5);
      this.field_34833 = 0;
   }

   @Override
   public void method_37123() {
      super.method_37123();
      boolean var3 = this.method_30926();
      class_1343 var4 = this.method_37098();
      if (this.field_41762 == 0.0F && this.field_41711 == 0.0F) {
         float var5 = class_9299.method_42842(method_37266(var4));
         this.field_41701 = (float)(class_9299.method_42821(var4.field_7336, var4.field_7334) * 180.0F / (float)Math.PI);
         this.field_41755 = (float)(class_9299.method_42821(var4.field_7333, (double)var5) * 180.0F / (float)Math.PI);
         this.field_41711 = this.field_41701;
         this.field_41762 = this.field_41755;
      }

      class_1331 var32 = this.method_37075();
      class_2522 var6 = this.field_41768.method_28262(var32);
      if (!var6.method_8345() && !var3) {
         class_4190 var7 = var6.method_8324(this.field_41768, var32);
         if (!var7.method_19485()) {
            class_1343 var8 = this.method_37245();

            for (class_4092 var23 : var7.method_19492()) {
               if (var23.method_18919(var32).method_18903(var8)) {
                  this.field_34834 = true;
                  break;
               }
            }
         }
      }

      if (this.field_34831 > 0) {
         this.field_34831--;
      }

      if (this.method_37363()) {
         this.method_37136();
      }

      if (this.field_34834 && !var3) {
         if (this.field_34836 != var6 && this.method_30923()) {
            this.method_30930();
         } else if (!this.field_41768.field_33055) {
            this.method_30932();
         }

         this.field_34840++;
      } else {
         this.field_34840 = 0;
         class_1343 var33 = this.method_37245();
         class_1343 var34 = var33.method_6215(var4);
         Object var35 = this.field_41768.method_28265(new class_972(var33, var34, class_3132.field_15553, class_9583.field_48747, this));
         if (((class_7474)var35).method_33990() != class_1430.field_7721) {
            var34 = ((class_7474)var35).method_33993();
         }

         while (!this.field_41751) {
            class_5631 var36 = this.method_30939(var33, var34);
            if (var36 != null) {
               var35 = var36;
            }

            if (var35 != null && ((class_7474)var35).method_33990() == class_1430.field_7718) {
               class_8145 var24 = ((class_5631)var35).method_25524();
               class_8145 var25 = this.method_26166();
               if (var24 instanceof class_704 && var25 instanceof class_704 && !((class_704)var25).method_3213((class_704)var24)) {
                  var35 = null;
                  var36 = null;
               }
            }

            if (var35 != null && !var3) {
               this.method_26160((class_7474)var35);
               this.field_41763 = true;
            }

            if (var36 == null || this.method_30936() <= 0) {
               break;
            }

            var35 = null;
         }

         var4 = this.method_37098();
         double var10 = var4.field_7336;
         double var12 = var4.field_7333;
         double var14 = var4.field_7334;
         if (this.method_30931()) {
            for (int var26 = 0; var26 < 4; var26++) {
               this.field_41768
                  .method_43361(
                     class_3090.field_15322,
                     this.method_37302() + var10 * (double)var26 / 4.0,
                     this.method_37309() + var12 * (double)var26 / 4.0,
                     this.method_37156() + var14 * (double)var26 / 4.0,
                     -var10,
                     -var12 + 0.2,
                     -var14
                  );
            }
         }

         double var16 = this.method_37302() + var10;
         double var18 = this.method_37309() + var12;
         double var20 = this.method_37156() + var14;
         float var22 = class_9299.method_42842(method_37266(var4));
         if (!var3) {
            this.field_41701 = (float)(class_9299.method_42821(var10, var14) * 180.0F / (float)Math.PI);
         } else {
            this.field_41701 = (float)(class_9299.method_42821(-var10, -var14) * 180.0F / (float)Math.PI);
         }

         this.field_41755 = (float)(class_9299.method_42821(var12, (double)var22) * 180.0F / (float)Math.PI);
         this.field_41755 = method_26168(this.field_41762, this.field_41755);
         this.field_41701 = method_26168(this.field_41711, this.field_41701);
         float var27 = 0.99F;
         float var28 = 0.05F;
         if (this.method_37285()) {
            for (int var29 = 0; var29 < 4; var29++) {
               float var30 = 0.25F;
               this.field_41768.method_43361(class_3090.field_15340, var16 - var10 * 0.25, var18 - var12 * 0.25, var20 - var14 * 0.25, var10, var12, var14);
            }

            var27 = this.method_30920();
         }

         this.method_37215(var4.method_6209((double)var27));
         if (!this.method_37078() && !var3) {
            class_1343 var37 = this.method_37098();
            this.method_37214(var37.field_7336, var37.field_7333 - 0.05F, var37.field_7334);
         }

         this.method_37256(var16, var18, var20);
         this.method_37097();
      }
   }

   private boolean method_30923() {
      return this.field_34834 && this.field_41768.method_6681(new class_4092(this.method_37245(), this.method_37245()).method_18898(0.06));
   }

   private void method_30930() {
      this.field_34834 = false;
      class_1343 var3 = this.method_37098();
      this.method_37215(
         var3.method_6210(
            (double)(this.field_41717.nextFloat() * 0.2F), (double)(this.field_41717.nextFloat() * 0.2F), (double)(this.field_41717.nextFloat() * 0.2F)
         )
      );
      this.field_34833 = 0;
   }

   @Override
   public void method_37226(class_7412 var1, class_1343 var2) {
      super.method_37226(var1, var2);
      if (var1 != class_7412.field_37839 && this.method_30923()) {
         this.method_30930();
      }
   }

   public void method_30932() {
      this.field_34833++;
      if (this.field_34833 >= 1200) {
         this.method_37204();
      }
   }

   private void method_30929() {
      if (this.field_34841 != null) {
         this.field_34841.clear();
      }

      if (this.field_34837 != null) {
         this.field_34837.clear();
      }
   }

   @Override
   public void method_26163(class_5631 var1) {
      super.method_26163(var1);
      class_8145 var4 = var1.method_25524();
      float var5 = (float)this.method_37098().method_6217();
      int var6 = class_9299.method_42815(class_9299.method_42827((double)var5 * this.field_34838, 0.0, 2.147483647E9));
      if (this.method_30936() > 0) {
         if (this.field_34837 == null) {
            this.field_34837 = new IntOpenHashSet(5);
         }

         if (this.field_34841 == null) {
            this.field_34841 = Lists.newArrayListWithCapacity(5);
         }

         if (this.field_34837.size() >= this.method_30936() + 1) {
            this.method_37204();
            return;
         }

         this.field_34837.add(var4.method_37145());
      }

      if (this.method_30931()) {
         long var9 = (long)this.field_41717.nextInt(var6 / 2 + 2);
         var6 = (int)Math.min(var9 + (long)var6, 2147483647L);
      }

      class_8145 var7 = this.method_26166();
      class_6199 var8;
      if (var7 != null) {
         var8 = class_6199.method_28379(this, var7);
         if (var7 instanceof class_5834) {
            ((class_5834)var7).method_26510(var4);
         }
      } else {
         var8 = class_6199.method_28379(this, this);
      }

      boolean var11 = var4.method_37387() == class_6629.field_34308;
      int var12 = var4.method_37230();
      if (this.method_37264() && !var11) {
         var4.method_37178(5);
      }

      if (!var4.method_37181(var8, (float)var6)) {
         var4.method_37164(var12);
         this.method_37215(this.method_37098().method_6209(-0.1));
         this.field_41701 += 180.0F;
         this.field_41711 += 180.0F;
         if (!this.field_41768.field_33055 && this.method_37098().method_6221() < 1.0E-7) {
            if (this.field_34835 == class_4237.field_20563) {
               this.method_37311(this.method_30925(), 0.1F);
            }

            this.method_37204();
         }
      } else {
         if (var11) {
            return;
         }

         if (var4 instanceof class_5834) {
            class_5834 var13 = (class_5834)var4;
            if (!this.field_41768.field_33055 && this.method_30936() <= 0) {
               var13.method_26508(var13.method_26569() + 1);
            }

            if (this.field_34832 > 0) {
               class_1343 var14 = this.method_37098().method_6210(1.0, 0.0, 1.0).method_6213().method_6209((double)this.field_34832 * 0.6);
               if (var14.method_6221() > 0.0) {
                  var13.method_37186(var14.field_7336, 0.1, var14.field_7334);
               }
            }

            if (!this.field_41768.field_33055 && var7 instanceof class_5834) {
               class_2931.method_13429(var13, var7);
               class_2931.method_13406((class_5834)var7, var13);
            }

            this.method_30935(var13);
            if (var7 != null && var13 != var7 && var13 instanceof class_704 && var7 instanceof class_9359 && !this.method_37378()) {
               ((class_9359)var7).field_47794.method_4156(new class_2161(class_2161.field_10780, 0.0F));
            }

            if (!var4.method_37330() && this.field_34841 != null) {
               this.field_34841.add(var13);
            }

            if (!this.field_41768.field_33055 && var7 instanceof class_9359) {
               class_9359 var15 = (class_9359)var7;
               if (this.field_34841 != null && this.method_30927()) {
                  class_8807.field_45057.method_21226(var15, this.field_34841);
               } else if (!var4.method_37330() && this.method_30927()) {
                  class_8807.field_45057.method_21226(var15, Arrays.<class_8145>asList(var4));
               }
            }
         }

         this.method_37155(this.field_34843, 1.0F, 1.2F / (this.field_41717.nextFloat() * 0.2F + 0.9F));
         if (this.method_30936() <= 0) {
            this.method_37204();
         }
      }
   }

   @Override
   public void method_26165(class_9529 var1) {
      this.field_34836 = this.field_41768.method_28262(var1.method_43955());
      super.method_26165(var1);
      class_1343 var4 = var1.method_33993().method_6193(this.method_37302(), this.method_37309(), this.method_37156());
      this.method_37215(var4);
      class_1343 var5 = var4.method_6213().method_6209(0.05F);
      this.method_37222(this.method_37302() - var5.field_7336, this.method_37309() - var5.field_7333, this.method_37156() - var5.field_7334);
      this.method_37155(this.method_30938(), 1.0F, 1.2F / (this.field_41717.nextFloat() * 0.2F + 0.9F));
      this.field_34834 = true;
      this.field_34831 = 7;
      this.method_30918(false);
      this.method_30922((byte)0);
      this.method_30941(class_463.field_2562);
      this.method_30934(false);
      this.method_30929();
   }

   public class_8461 method_30933() {
      return class_463.field_2562;
   }

   public final class_8461 method_30938() {
      return this.field_34843;
   }

   public void method_30935(class_5834 var1) {
   }

   @Nullable
   public class_5631 method_30939(class_1343 var1, class_1343 var2) {
      return class_8462.method_38931(
         this.field_41768, this, var1, var2, this.method_37241().method_18929(this.method_37098()).method_18898(1.0), this::method_26164
      );
   }

   @Override
   public boolean method_26164(class_8145 var1) {
      return super.method_26164(var1) && (this.field_34837 == null || !this.field_34837.contains(var1.method_37145()));
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25958("life", (short)this.field_34833);
      if (this.field_34836 != null) {
         var1.method_25946("inBlockState", class_4338.method_20187(this.field_34836));
      }

      var1.method_25921("shake", (byte)this.field_34831);
      var1.method_25934("inGround", this.field_34834);
      var1.method_25921("pickup", (byte)this.field_34835.ordinal());
      var1.method_25923("damage", this.field_34838);
      var1.method_25934("crit", this.method_30931());
      var1.method_25921("PierceLevel", this.method_30936());
      var1.method_25941("SoundEvent", class_8669.field_44369.method_39797(this.field_34843).toString());
      var1.method_25934("ShotFromCrossbow", this.method_30927());
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.field_34833 = var1.method_25956("life");
      if (var1.method_25939("inBlockState", 10)) {
         this.field_34836 = class_4338.method_20185(var1.method_25937("inBlockState"));
      }

      this.field_34831 = var1.method_25950("shake") & 255;
      this.field_34834 = var1.method_25933("inGround");
      if (var1.method_25939("damage", 99)) {
         this.field_34838 = var1.method_25932("damage");
      }

      if (!var1.method_25939("pickup", 99)) {
         if (var1.method_25939("player", 99)) {
            this.field_34835 = !var1.method_25933("player") ? class_4237.field_20564 : class_4237.field_20563;
         }
      } else {
         this.field_34835 = class_4237.method_19761(var1.method_25950("pickup"));
      }

      this.method_30918(var1.method_25933("crit"));
      this.method_30922(var1.method_25950("PierceLevel"));
      if (var1.method_25939("SoundEvent", 8)) {
         this.field_34843 = class_8669.field_44369.method_39794(new Identifier(var1.method_25965("SoundEvent"))).orElse(this.method_30933());
      }

      this.method_30934(var1.method_25933("ShotFromCrossbow"));
   }

   @Override
   public void method_26159(class_8145 var1) {
      super.method_26159(var1);
      if (var1 instanceof class_704) {
         this.field_34835 = !((class_704)var1).field_3876.field_4944 ? class_4237.field_20563 : class_4237.field_20565;
      }
   }

   @Override
   public void method_37347(class_704 var1) {
      if (!this.field_41768.field_33055 && (this.field_34834 || this.method_30926()) && this.field_34831 <= 0) {
         boolean var4 = this.field_34835 == class_4237.field_20563
            || this.field_34835 == class_4237.field_20565 && var1.field_3876.field_4944
            || this.method_30926() && this.method_26166().method_37328() == var1.method_37328();
         if (this.field_34835 == class_4237.field_20563 && !var1.field_3853.method_32414(this.method_30925())) {
            var4 = false;
         }

         if (var4) {
            var1.method_26467(this, 1);
            this.method_37204();
         }
      }
   }

   public abstract class_6098 method_30925();

   @Override
   public boolean method_37126() {
      return false;
   }

   public void method_30924(double var1) {
      this.field_34838 = var1;
   }

   public double method_30928() {
      return this.field_34838;
   }

   public void method_30940(int var1) {
      this.field_34832 = var1;
   }

   @Override
   public boolean method_37394() {
      return false;
   }

   @Override
   public float method_37279(class_7653 var1, class_6097 var2) {
      return 0.13F;
   }

   public void method_30918(boolean var1) {
      this.method_30921(1, var1);
   }

   public void method_30922(byte var1) {
      this.field_41735.method_36633(field_34842, var1);
   }

   private void method_30921(int var1, boolean var2) {
      byte var5 = this.field_41735.<Byte>method_36640(field_34839);
      if (!var2) {
         this.field_41735.method_36633(field_34839, (byte)(var5 & ~var1));
      } else {
         this.field_41735.method_36633(field_34839, (byte)(var5 | var1));
      }
   }

   public boolean method_30931() {
      byte var3 = this.field_41735.<Byte>method_36640(field_34839);
      return false;
   }

   public boolean method_30927() {
      byte var3 = this.field_41735.<Byte>method_36640(field_34839);
      return false;
   }

   public byte method_30936() {
      return this.field_41735.<Byte>method_36640(field_34842);
   }

   public void method_30937(class_5834 var1, float var2) {
      int var5 = class_2931.method_13399(class_3668.field_17850, var1);
      int var6 = class_2931.method_13399(class_3668.field_17845, var1);
      this.method_30924((double)(var2 * 2.0F) + this.field_41717.nextGaussian() * 0.25 + (double)((float)this.field_41768.method_43370().method_2097() * 0.11F));
      if (var5 > 0) {
         this.method_30924(this.method_30928() + (double)var5 * 0.5 + 0.5);
      }

      if (var6 > 0) {
         this.method_30940(var6);
      }

      if (class_2931.method_13399(class_3668.field_17855, var1) > 0) {
         this.method_37178(100);
      }
   }

   public float method_30920() {
      return 0.6F;
   }

   public void method_30919(boolean var1) {
      this.field_41731 = var1;
      this.method_30921(2, var1);
   }

   public boolean method_30926() {
      return this.field_41768.field_33055 ? (this.field_41735.<Byte>method_36640(field_34839) & 2) != 0 : this.field_41731;
   }

   public void method_30934(boolean var1) {
      this.method_30921(4, var1);
   }

   @Override
   public class_6310<?> method_37142() {
      class_8145 var3 = this.method_26166();
      return new class_6589(this, var3 != null ? var3.method_37145() : 0);
   }
}
