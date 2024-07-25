package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_107 extends class_7819 implements class_674 {
   private static final class_7821<Integer> field_267 = class_8073.<Integer>method_36641(class_107.class, class_2734.field_13366);
   private static final Predicate<class_5886> field_271 = new class_5179();
   private static final class_2451 field_261 = class_4897.field_24763;
   private static final Set<class_2451> field_273 = Sets.newHashSet(
      new class_2451[]{class_4897.field_24621, class_4897.field_24435, class_4897.field_24480, class_4897.field_24883}
   );
   private static final Map<class_6629<?>, class_8461> field_265 = Util.<Map<class_6629<?>, class_8461>>method_44659(Maps.newHashMap(), var0 -> {
      var0.put(class_6629.field_34301, class_463.field_1989);
      var0.put(class_6629.field_34272, class_463.field_2315);
      var0.put(class_6629.field_34210, class_463.field_2407);
      var0.put(class_6629.field_34211, class_463.field_2230);
      var0.put(class_6629.field_34324, class_463.field_2130);
      var0.put(class_6629.field_34310, class_463.field_1929);
      var0.put(class_6629.field_34264, class_463.field_2349);
      var0.put(class_6629.field_34296, class_463.field_2468);
      var0.put(class_6629.field_34281, class_463.field_2116);
      var0.put(class_6629.field_34307, class_463.field_2812);
      var0.put(class_6629.field_34306, class_463.field_2123);
      var0.put(class_6629.field_34266, class_463.field_2256);
      var0.put(class_6629.field_34270, class_463.field_2540);
      var0.put(class_6629.field_34295, class_463.field_2799);
      var0.put(class_6629.field_34246, class_463.field_1959);
      var0.put(class_6629.field_34240, class_463.field_2774);
      var0.put(class_6629.field_34257, class_463.field_2387);
      var0.put(class_6629.field_34265, class_463.field_2516);
      var0.put(class_6629.field_34318, class_463.field_2618);
      var0.put(class_6629.field_34231, class_463.field_1946);
      var0.put(class_6629.field_34314, class_463.field_2866);
      var0.put(class_6629.field_34241, class_463.field_2649);
      var0.put(class_6629.field_34222, class_463.field_2260);
      var0.put(class_6629.field_34223, class_463.field_2315);
      var0.put(class_6629.field_34322, class_463.field_2616);
      var0.put(class_6629.field_34277, class_463.field_2746);
      var0.put(class_6629.field_34255, class_463.field_2007);
      var0.put(class_6629.field_34220, class_463.field_2760);
      var0.put(class_6629.field_34212, class_463.field_2722);
      var0.put(class_6629.field_34317, class_463.field_2373);
      var0.put(class_6629.field_34244, class_463.field_2352);
      var0.put(class_6629.field_34297, class_463.field_2860);
      var0.put(class_6629.field_34227, class_463.field_2002);
   });
   public float field_262;
   public float field_270;
   public float field_263;
   public float field_269;
   private float field_272 = 1.0F;
   private boolean field_268;
   private class_1331 field_266;

   public class_107(class_6629<? extends class_107> var1, World var2) {
      super(var1, var2);
      this.field_29900 = new class_2112(this, 10, false);
      this.method_26895(class_1108.field_6357, -1.0F);
      this.method_26895(class_1108.field_6352, -1.0F);
      this.method_26895(class_1108.field_6344, -1.0F);
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, class_5734 var5) {
      this.method_329(this.field_41717.nextInt(5));
      if (var4 == null) {
         var4 = new class_1821(false);
      }

      return super.method_26864(var1, var2, var3, (class_8733)var4, var5);
   }

   @Override
   public boolean method_26449() {
      return false;
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(0, new class_518(this, 1.25));
      this.field_29916.method_3485(0, new class_787(this));
      this.field_29916.method_3485(1, new class_4407(this, class_704.class, 8.0F));
      this.field_29916.method_3485(2, new class_8453(this));
      this.field_29916.method_3485(2, new class_5591(this, 1.0, 5.0F, 1.0F, true));
      this.field_29916.method_3485(2, new class_3539(this, 1.0));
      this.field_29916.method_3485(3, new class_2331(this));
      this.field_29916.method_3485(3, new class_2652(this, 1.0, 3.0F, 7.0F));
   }

   public static class_1313 method_331() {
      return class_5886.method_26846()
         .method_5984(class_7331.field_37468, 6.0)
         .method_5984(class_7331.field_37474, 0.4F)
         .method_5984(class_7331.field_37465, 0.2F);
   }

   @Override
   public class_1249 method_26933(World var1) {
      class_5133 var4 = new class_5133(this, var1);
      var4.method_23534(false);
      var4.method_5611(true);
      var4.method_23535(true);
      return var4;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return var2.field_31200 * 0.6F;
   }

   @Override
   public void method_26606() {
      if (this.field_266 == null
         || !this.field_266.method_12170(this.method_37245(), 3.46)
         || !this.field_41768.method_28262(this.field_266).method_8350(class_4783.field_23312)) {
         this.field_268 = false;
         this.field_266 = null;
      }

      if (this.field_41768.field_33033.nextInt(400) == 0) {
         method_325(this.field_41768, this);
      }

      super.method_26606();
      this.method_328();
   }

   @Override
   public void method_26424(class_1331 var1, boolean var2) {
      this.field_266 = var1;
      this.field_268 = var2;
   }

   public boolean method_327() {
      return this.field_268;
   }

   private void method_328() {
      this.field_269 = this.field_262;
      this.field_263 = this.field_270;
      this.field_270 = (float)((double)this.field_270 + (double)(!this.field_41726 && !this.method_37070() ? 4 : -1) * 0.3);
      this.field_270 = class_9299.method_42828(this.field_270, 0.0F, 1.0F);
      if (!this.field_41726 && this.field_272 < 1.0F) {
         this.field_272 = 1.0F;
      }

      this.field_272 = (float)((double)this.field_272 * 0.9);
      class_1343 var3 = this.method_37098();
      if (!this.field_41726 && var3.field_7333 < 0.0) {
         this.method_37215(var3.method_6210(1.0, 0.6, 1.0));
      }

      this.field_262 = this.field_262 + this.field_272 * 2.0F;
   }

   public static boolean method_325(World var0, Entity var1) {
      if (var1.method_37330() && !var1.method_37378() && var0.field_33033.nextInt(2) == 0) {
         List var4 = var0.<class_5886>method_25869(class_5886.class, var1.method_37241().method_18898(20.0), field_271);
         if (!var4.isEmpty()) {
            class_5886 var5 = (class_5886)var4.get(var0.field_33033.nextInt(var4.size()));
            if (!var5.method_37378()) {
               class_8461 var6 = method_326(var5.method_37387());
               var0.method_29528(
                  (class_704)null, var1.method_37302(), var1.method_37309(), var1.method_37156(), var6, var1.method_37197(), 0.7F, method_324(var0.field_33033)
               );
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public class_6910 method_26857(class_704 var1, class_2584 var2) {
      class_6098 var5 = var1.method_26617(var2);
      if (!this.method_41215() && field_273.contains(var5.method_27960())) {
         if (!var1.field_3876.field_4944) {
            var5.method_27970(1);
         }

         if (!this.method_37378()) {
            this.field_41768
               .method_29528(
                  (class_704)null,
                  this.method_37302(),
                  this.method_37309(),
                  this.method_37156(),
                  class_463.field_2094,
                  this.method_37197(),
                  1.0F,
                  1.0F + (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F
               );
         }

         if (!this.field_41768.field_33055) {
            if (this.field_41717.nextInt(10) != 0) {
               this.field_41768.method_29587(this, (byte)6);
            } else {
               this.method_41212(var1);
               this.field_41768.method_29587(this, (byte)7);
            }
         }

         return class_6910.method_31659(this.field_41768.field_33055);
      } else if (var5.method_27960() != field_261) {
         if (!this.method_323() && this.method_41215() && this.method_41206(var1)) {
            if (!this.field_41768.field_33055) {
               this.method_41208(!this.method_41216());
            }

            return class_6910.method_31659(this.field_41768.field_33055);
         } else {
            return super.method_26857(var1, var2);
         }
      } else {
         if (!var1.field_3876.field_4944) {
            var5.method_27970(1);
         }

         this.method_26558(new class_2250(Effects.field_19718, 900));
         if (var1.method_3186() || !this.method_37367()) {
            this.method_37181(class_6199.method_28344(var1), Float.MAX_VALUE);
         }

         return class_6910.method_31659(this.field_41768.field_33055);
      }
   }

   @Override
   public boolean method_24866(class_6098 var1) {
      return false;
   }

   public static boolean method_321(class_6629<class_107> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      class_2522 var7 = var1.method_28262(var3.method_6100());
      return (
            var7.method_8349(class_2351.field_11737)
               || var7.method_8350(class_4783.field_23259)
               || var7.method_8349(class_2351.field_11730)
               || var7.method_8350(class_4783.field_23184)
         )
         && var1.method_25261(var3, 0) > 8;
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      return false;
   }

   @Override
   public void method_37105(double var1, boolean var3, class_2522 var4, class_1331 var5) {
   }

   @Override
   public boolean method_24873(class_5467 var1) {
      return false;
   }

   @Nullable
   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      return null;
   }

   @Override
   public boolean method_26442(Entity var1) {
      return var1.method_37181(class_6199.method_28345(this), 3.0F);
   }

   @Nullable
   @Override
   public class_8461 method_26918() {
      return method_322(this.field_41768, this.field_41768.field_33033);
   }

   public static class_8461 method_322(World var0, Random var1) {
      if (var0.method_43370() != class_423.field_1790 && var1.nextInt(1000) == 0) {
         ArrayList var4 = Lists.newArrayList(field_265.keySet());
         return method_326((class_6629<?>)var4.get(var1.nextInt(var4.size())));
      } else {
         return class_463.field_2583;
      }
   }

   private static class_8461 method_326(class_6629<?> var0) {
      return field_265.getOrDefault(var0, class_463.field_2583);
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2018;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2631;
   }

   @Override
   public void method_37207(class_1331 var1, class_2522 var2) {
      this.method_37155(class_463.field_2696, 0.15F, 1.0F);
   }

   @Override
   public float method_37147(float var1) {
      this.method_37155(class_463.field_2305, 0.15F, 1.0F);
      return var1 + this.field_270 / 2.0F;
   }

   @Override
   public boolean method_37217() {
      return true;
   }

   @Override
   public float method_26547() {
      return method_324(this.field_41717);
   }

   public static float method_324(Random var0) {
      return (var0.nextFloat() - var0.nextFloat()) * 0.2F + 1.0F;
   }

   @Override
   public class_562 method_37197() {
      return class_562.field_3328;
   }

   @Override
   public boolean method_37177() {
      return true;
   }

   @Override
   public void method_26596(Entity var1) {
      if (!(var1 instanceof class_704)) {
         super.method_26596(var1);
      }
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      if (!this.method_37180(var1)) {
         this.method_41208(false);
         return super.method_37181(var1, var2);
      } else {
         return false;
      }
   }

   public int method_330() {
      return class_9299.method_42829(this.field_41735.<Integer>method_36640(field_267), 0, 4);
   }

   public void method_329(int var1) {
      this.field_41735.method_36633(field_267, var1);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_267, 0);
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25931("Variant", this.method_330());
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      this.method_329(var1.method_25947("Variant"));
   }

   public boolean method_323() {
      return !this.field_41726;
   }

   @Override
   public class_1343 method_37323() {
      return new class_1343(0.0, (double)(0.5F * this.method_37277()), (double)(this.method_37086() * 0.4F));
   }
}
