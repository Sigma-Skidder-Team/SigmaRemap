package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7666 extends class_405 implements class_5545, class_3449 {
   private static final class_7821<class_3047> field_38975 = class_8073.<class_3047>method_36641(class_7666.class, class_2734.field_13360);
   public static final Map<class_2451, Integer> field_38968 = ImmutableMap.of(
      class_4897.field_24456, 4, class_4897.field_25273, 1, class_4897.field_25136, 1, class_4897.field_24362, 1
   );
   private static final Set<class_2451> field_38976 = ImmutableSet.of(
      class_4897.field_24456,
      class_4897.field_25273,
      class_4897.field_25136,
      class_4897.field_24813,
      class_4897.field_24621,
      class_4897.field_24362,
      new class_2451[]{class_4897.field_24883}
   );
   private int field_38964;
   private boolean field_38967;
   private class_704 field_38973;
   private byte field_38969;
   private final class_2525 field_38977 = new class_2525();
   private long field_38974;
   private long field_38960;
   private int field_38965;
   private long field_38971;
   private int field_38962;
   private long field_38972;
   private boolean field_38966;
   private static final ImmutableList<class_6044<?>> field_38970 = ImmutableList.of(
      class_6044.field_30854,
      class_6044.field_30883,
      class_6044.field_30868,
      class_6044.field_30871,
      class_6044.field_30907,
      class_6044.field_30901,
      class_6044.field_30875,
      class_6044.field_30886,
      class_6044.field_30870,
      class_6044.field_30912,
      class_6044.field_30869,
      class_6044.field_30889,
      new class_6044[]{
         class_6044.field_30874,
         class_6044.field_30861,
         class_6044.field_30892,
         class_6044.field_30888,
         class_6044.field_30872,
         class_6044.field_30910,
         class_6044.field_30867,
         class_6044.field_30859,
         class_6044.field_30896,
         class_6044.field_30887,
         class_6044.field_30899,
         class_6044.field_30894,
         class_6044.field_30909,
         class_6044.field_30898,
         class_6044.field_30858,
         class_6044.field_30881,
         class_6044.field_30877
      }
   );
   private static final ImmutableList<class_3172<? extends class_6127<? super class_7666>>> field_38978 = ImmutableList.of(
      class_3172.field_15861,
      class_3172.field_15860,
      class_3172.field_15866,
      class_3172.field_15868,
      class_3172.field_15865,
      class_3172.field_15870,
      class_3172.field_15867,
      class_3172.field_15864,
      class_3172.field_15858
   );
   public static final Map<class_6044<class_8150>, BiPredicate<class_7666, class_236>> field_38963 = ImmutableMap.of(
      class_6044.field_30854,
      (BiPredicate<class_7666, class_236>)(var0, var1) -> var1 == class_236.field_778,
      class_6044.field_30883,
      (BiPredicate<class_7666, class_236>)(var0, var1) -> var0.method_15891().method_13910().method_20723() == var1,
      class_6044.field_30868,
      (BiPredicate<class_7666, class_236>)(var0, var1) -> class_236.field_772.test(var1),
      class_6044.field_30871,
      (BiPredicate<class_7666, class_236>)(var0, var1) -> var1 == class_236.field_783
   );

   public class_7666(EntityType<? extends class_7666> var1, World var2) {
      this(var1, var2, class_8853.field_45268);
   }

   public class_7666(EntityType<? extends class_7666> var1, World var2, class_8853 var3) {
      super(var1, var2);
      ((class_8985)this.method_26927()).method_41199(true);
      this.method_26927().method_5611(true);
      this.method_26871(true);
      this.method_34716(this.method_15891().method_13914(var3).method_13909(class_4466.field_21775));
   }

   @Override
   public class_1150<class_7666> method_26525() {
      return (class_1150<class_7666>)super.method_26525();
   }

   @Override
   public class_1193<class_7666> method_26410() {
      return class_1150.<class_7666>method_5128(field_38970, field_38978);
   }

   @Override
   public class_1150<?> method_26585(Dynamic<?> var1) {
      class_1150 var4 = this.method_26410().method_5284(var1);
      this.method_34726(var4);
      return var4;
   }

   public void method_34706(class_6331 var1) {
      class_1150 var4 = this.method_26525();
      var4.method_5100(var1, this);
      this.field_29675 = var4.method_5115();
      this.method_34726(this.method_26525());
   }

   private void method_34726(class_1150<class_7666> var1) {
      class_4466 var4 = this.method_15891().method_13910();
      if (!this.method_26449()) {
         var1.method_5129(class_3975.field_19360);
         var1.method_5102(class_6275.field_32073, class_8159.method_37429(var4, 0.5F), ImmutableSet.of(Pair.of(class_6044.field_30883, class_561.field_3320)));
      } else {
         var1.method_5129(class_3975.field_19361);
         var1.method_5111(class_6275.field_32064, class_8159.method_37427(0.5F));
      }

      var1.method_5111(class_6275.field_32072, class_8159.method_37433(var4, 0.5F));
      var1.method_5102(class_6275.field_32065, class_8159.method_37434(var4, 0.5F), ImmutableSet.of(Pair.of(class_6044.field_30871, class_561.field_3320)));
      var1.method_5111(class_6275.field_32079, class_8159.method_37430(var4, 0.5F));
      var1.method_5111(class_6275.field_32075, class_8159.method_37424(var4, 0.5F));
      var1.method_5111(class_6275.field_32071, class_8159.method_37423(var4, 0.5F));
      var1.method_5111(class_6275.field_32077, class_8159.method_37432(var4, 0.5F));
      var1.method_5111(class_6275.field_32067, class_8159.method_37426(var4, 0.5F));
      var1.method_5111(class_6275.field_32076, class_8159.method_37431(var4, 0.5F));
      var1.method_5114(ImmutableSet.of(class_6275.field_32072));
      var1.method_5130(class_6275.field_32075);
      var1.method_5113(class_6275.field_32075);
      var1.method_5132(this.world.method_29584(), this.world.method_29546());
   }

   @Override
   public void method_8637() {
      super.method_8637();
      if (this.world instanceof class_6331) {
         this.method_34706((class_6331)this.world);
      }
   }

   public static class_1313 method_34690() {
      return class_5886.method_26846().method_5984(class_7331.field_37465, 0.5).method_5984(class_7331.field_37471, 48.0);
   }

   public boolean method_34698() {
      return this.field_38966;
   }

   @Override
   public void method_26919() {
      this.world.method_29599().startSection("villagerBrain");
      this.method_26525().method_5141((class_6331)this.world, this);
      this.world.method_29599().endSection();
      if (this.field_38966) {
         this.field_38966 = false;
      }

      if (!this.method_2024() && this.field_38964 > 0) {
         this.field_38964--;
         if (this.field_38964 <= 0) {
            if (this.field_38967) {
               this.method_34718();
               this.field_38967 = false;
            }

            this.method_26558(new class_2250(Effects.field_19742, 200, 0));
         }
      }

      if (this.field_38973 != null && this.world instanceof class_6331) {
         ((class_6331)this.world).method_28955(class_3894.field_18946, this.field_38973, this);
         this.world.method_29587(this, (byte)14);
         this.field_38973 = null;
      }

      if (!this.method_26859() && this.field_41717.nextInt(100) == 0) {
         class_2452 var3 = ((class_6331)this.world).method_28984(this.method_37075());
         if (var3 != null && var3.method_11306() && !var3.method_11259()) {
            this.world.method_29587(this, (byte)42);
         }
      }

      if (this.method_15891().method_13910() == class_4466.field_21775 && this.method_2024()) {
         this.method_2025();
      }

      super.method_26919();
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.method_2026() > 0) {
         this.method_2019(this.method_2026() - 1);
      }

      this.method_34694();
   }

   @Override
   public class_6910 method_26857(class_704 var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (var5.method_27960() == class_4897.field_25034 || !this.isAlive() || this.method_2024() || this.method_26507()) {
         return super.method_26857(var1, var2);
      } else if (!this.method_26449()) {
         boolean var6 = this.method_974().isEmpty();
         if (var2 == Hand.MAIN_HAND) {
            if (var6 && !this.world.field_33055) {
               this.method_34719();
            }

            var1.method_3209(class_6234.field_31910);
         }

         if (!var6) {
            if (!this.world.field_33055 && !this.field_1687.isEmpty()) {
               this.method_34732(var1);
            }

            return class_6910.method_31659(this.world.field_33055);
         } else {
            return class_6910.method_31659(this.world.field_33055);
         }
      } else {
         this.method_34719();
         return class_6910.method_31659(this.world.field_33055);
      }
   }

   private void method_34719() {
      this.method_2019(40);
      if (!this.world.method_22567()) {
         this.method_37155(class_463.field_2883, this.method_26439(), this.method_26547());
      }
   }

   private void method_34732(class_704 var1) {
      this.method_34721(var1);
      this.method_975(var1);
      this.method_977(var1, this.method_19839(), this.method_15891().method_13906());
   }

   @Override
   public void method_975(class_704 var1) {
      boolean var4 = this.method_978() != null && var1 == null;
      super.method_975(var1);
      if (var4) {
         this.method_2025();
      }
   }

   @Override
   public void method_2025() {
      super.method_2025();
      this.method_34720();
   }

   private void method_34720() {
      for (class_8014 var4 : this.method_974()) {
         var4.method_36360();
      }
   }

   @Override
   public boolean method_983() {
      return true;
   }

   public void method_34723() {
      this.method_34722();

      for (class_8014 var4 : this.method_974()) {
         var4.method_36381();
      }

      this.field_38971 = this.world.method_29546();
      this.field_38962++;
   }

   private boolean method_34707() {
      for (class_8014 var4 : this.method_974()) {
         if (var4.method_36368()) {
            return true;
         }
      }

      return false;
   }

   private boolean method_34731() {
      return this.field_38962 == 0 || this.field_38962 < 2 && this.world.method_29546() > this.field_38971 + 2400L;
   }

   public boolean method_34715() {
      long var3 = this.field_38971 + 12000L;
      long var5 = this.world.method_29546();
      boolean var7 = var5 > var3;
      long var8 = this.world.method_29584();
      if (this.field_38972 > 0L) {
         long var10 = this.field_38972 / 24000L;
         long var12 = var8 / 24000L;
         var7 |= var12 > var10;
      }

      this.field_38972 = var8;
      if (var7) {
         this.field_38971 = var5;
         this.method_34728();
      }

      return this.method_34731() && this.method_34707();
   }

   private void method_34692() {
      int var3 = 2 - this.field_38962;
      if (var3 > 0) {
         for (class_8014 var5 : this.method_974()) {
            var5.method_36381();
         }
      }

      for (int var6 = 0; var6 < var3; var6++) {
         this.method_34722();
      }
   }

   private void method_34722() {
      for (class_8014 var4 : this.method_974()) {
         var4.method_36382();
      }
   }

   private void method_34721(class_704 var1) {
      int var4 = this.method_34691(var1);
      if (var4 != 0) {
         for (class_8014 var6 : this.method_974()) {
            var6.method_36370(-class_9299.method_42848((float)var4 * var6.method_36376()));
         }
      }

      if (var1.isPotionActive(Effects.field_19741)) {
         class_2250 var12 = var1.method_26553(Effects.field_19741);
         int var13 = var12.method_10333();

         for (class_8014 var8 : this.method_974()) {
            double var9 = 0.3 + 0.0625 * (double)var13;
            int var11 = (int)Math.floor(var9 * (double)var8.method_36365().method_27997());
            var8.method_36370(-Math.max(var11, 1));
         }
      }
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_38975, new class_3047(class_8853.field_45268, class_4466.field_21775, 1));
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      class_3047.field_14935
         .encodeStart(class_3504.field_17178, this.method_15891())
         .resultOrPartial(LOGGER::error)
         .ifPresent(var1x -> var1.put("VillagerData", var1x));
      var1.method_25921("FoodLevel", this.field_38969);
      var1.put("Gossips", (class_8406)this.field_38977.method_11515(class_3504.field_17178).getValue());
      var1.method_25931("Xp", this.field_38965);
      var1.method_25949("LastRestock", this.field_38971);
      var1.method_25949("LastGossipDecay", this.field_38960);
      var1.method_25931("RestocksToday", this.field_38962);
      if (this.field_38966) {
         var1.putBoolean("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      if (var1.contains("VillagerData", 10)) {
         DataResult var4 = class_3047.field_14935.parse(new Dynamic(class_3504.field_17178, var1.method_25929("VillagerData")));
         var4.resultOrPartial(LOGGER::error).ifPresent(this::method_34716);
      }

      if (var1.contains("Offers", 10)) {
         this.field_1687 = new class_2795(var1.getCompound("Offers"));
      }

      if (var1.contains("FoodLevel", 1)) {
         this.field_38969 = var1.method_25950("FoodLevel");
      }

      class_3416 var5 = var1.method_25927("Gossips", 10);
      this.field_38977.method_11506(new Dynamic(class_3504.field_17178, var5));
      if (var1.contains("Xp", 3)) {
         this.field_38965 = var1.method_25947("Xp");
      }

      this.field_38971 = var1.method_25948("LastRestock");
      this.field_38960 = var1.method_25948("LastGossipDecay");
      this.method_26871(true);
      if (this.world instanceof class_6331) {
         this.method_34706((class_6331)this.world);
      }

      this.field_38962 = var1.method_25947("RestocksToday");
      if (var1.method_25938("AssignProfessionWhenSpawned")) {
         this.field_38966 = var1.getBoolean("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean method_26911(double var1) {
      return false;
   }

   @Nullable
   @Override
   public class_8461 method_26918() {
      if (!this.method_26507()) {
         return !this.method_2024() ? class_463.field_2793 : class_463.field_2809;
      } else {
         return null;
      }
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2300;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2283;
   }

   public void method_34724() {
      class_8461 var3 = this.method_15891().method_13910().method_20727();
      if (var3 != null) {
         this.method_37155(var3, this.method_26439(), this.method_26547());
      }
   }

   public void method_34716(class_3047 var1) {
      class_3047 var4 = this.method_15891();
      if (var4.method_13910() != var1.method_13910()) {
         this.field_1687 = null;
      }

      this.field_41735.method_36633(field_38975, var1);
   }

   @Override
   public class_3047 method_15891() {
      return this.field_41735.<class_3047>method_36640(field_38975);
   }

   @Override
   public void method_2023(class_8014 var1) {
      int var4 = 3 + this.field_41717.nextInt(4);
      this.field_38965 = this.field_38965 + var1.method_36363();
      this.field_38973 = this.method_978();
      if (this.method_34702()) {
         this.field_38964 = 40;
         this.field_38967 = true;
         var4 += 5;
      }

      if (var1.method_36374()) {
         this.world.method_7509(new class_5614(this.world, this.getPosX(), this.method_37309() + 0.5, this.getPosZ(), var4));
      }
   }

   @Override
   public void method_26511(class_5834 var1) {
      if (var1 != null && this.world instanceof class_6331) {
         ((class_6331)this.world).method_28955(class_3894.field_18943, var1, this);
         if (this.isAlive() && var1 instanceof class_704) {
            this.world.method_29587(this, (byte)13);
         }
      }

      super.method_26511(var1);
   }

   @Override
   public void method_26452(DamageSource var1) {
      LOGGER.info("Villager {} died, message: '{}'", this, var1.method_28362(this).getString());
      Entity var4 = var1.method_28372();
      if (var4 != null) {
         this.method_34729(var4);
      }

      this.method_34705();
      super.method_26452(var1);
   }

   private void method_34705() {
      this.method_34704(class_6044.field_30854);
      this.method_34704(class_6044.field_30883);
      this.method_34704(class_6044.field_30868);
      this.method_34704(class_6044.field_30871);
   }

   private void method_34729(Entity var1) {
      if (this.world instanceof class_6331) {
         Optional var4 = this.field_29675.<List<class_5834>>method_5138(class_6044.field_30901);
         if (var4.isPresent()) {
            class_6331 var5 = (class_6331)this.world;
            ((List)var4.get())
               .stream()
               .filter(var0 -> var0 instanceof class_5545)
               .forEach(var2 -> var5.method_28955(class_3894.field_18947, var1, (class_5545)var2));
         }
      }
   }

   public void method_34704(class_6044<class_8150> var1) {
      if (this.world instanceof class_6331) {
         class_341 var4 = ((class_6331)this.world).method_29522();
         this.field_29675.<class_8150>method_5138(var1).ifPresent(var3 -> {
            class_6331 var6 = var4.method_1697(var3.method_37408());
            if (var6 != null) {
               class_1489 var7 = var6.method_28969();
               Optional var8 = var7.method_6870(var3.method_37409());
               BiPredicate var9 = field_38963.get(var1);
               if (var8.isPresent() && var9.test(this, var8.get())) {
                  var7.method_6860(var3.method_37409());
                  class_1892.method_8433(var6, var3.method_37409());
               }
            }
         });
      }
   }

   @Override
   public boolean method_8636() {
      return this.field_38969 + this.method_34727() >= 12 && this.method_8634() == 0;
   }

   private boolean method_34708() {
      return this.field_38969 < 12;
   }

   private void method_34725() {
      if (this.method_34708() && this.method_34727() != 0) {
         for (int var3 = 0; var3 < this.method_2017().method_31505(); var3++) {
            ItemStack var4 = this.method_2017().method_31498(var3);
            if (!var4.method_28022()) {
               Integer var5 = field_38968.get(var4.method_27960());
               if (var5 != null) {
                  int var6 = var4.method_27997();

                  for (int var7 = var6; var7 > 0; var7--) {
                     this.field_38969 = (byte)(this.field_38969 + var5);
                     this.method_2017().method_31497(var3, 1);
                     if (!this.method_34708()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int method_34691(class_704 var1) {
      return this.field_38977.method_11512(var1.method_37328(), var0 -> true);
   }

   private void method_34711(int var1) {
      this.field_38969 = (byte)(this.field_38969 - var1);
   }

   public void method_34703() {
      this.method_34725();
      this.method_34711(12);
   }

   public void method_34699(class_2795 var1) {
      this.field_1687 = var1;
   }

   private boolean method_34702() {
      int var3 = this.method_15891().method_13906();
      return class_3047.method_13907(var3) && this.field_38965 >= class_3047.method_13905(var3);
   }

   private void method_34718() {
      this.method_34716(this.method_15891().method_13913(this.method_15891().method_13906() + 1));
      this.method_2016();
   }

   @Override
   public ITextComponent method_37391() {
      return new TranslationTextComponent(
         this.method_37387().method_30469() + '.' + class_8669.field_44425.method_39797(this.method_15891().method_13910()).method_21456()
      );
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 12) {
         if (var1 != 13) {
            if (var1 != 14) {
               if (var1 != 42) {
                  super.method_37336(var1);
               } else {
                  this.method_2022(class_3090.field_15346);
               }
            } else {
               this.method_2022(class_3090.field_15361);
            }
         } else {
            this.method_2022(class_3090.field_15352);
         }
      } else {
         this.method_2022(class_3090.field_15348);
      }
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      if (var3 == class_2417.field_12038) {
         this.method_34716(this.method_15891().method_13909(class_4466.field_21775));
      }

      if (var3 == class_2417.field_12028 || var3 == class_2417.field_12030 || var3 == class_2417.field_12024 || var3 == class_2417.field_12036) {
         this.method_34716(this.method_15891().method_13914(class_8853.method_40719(var1.method_2754(this.method_37075()))));
      }

      if (var3 == class_2417.field_12033) {
         this.field_38966 = true;
      }

      return super.method_26864(var1, var2, var3, var4, var5);
   }

   public class_7666 method_34730(class_6331 var1, class_1899 var2) {
      double var5 = this.field_41717.nextDouble();
      class_8853 var7;
      if (!(var5 < 0.5)) {
         if (!(var5 < 0.75)) {
            var7 = ((class_7666)var2).method_15891().method_13912();
         } else {
            var7 = this.method_15891().method_13912();
         }
      } else {
         var7 = class_8853.method_40719(var1.method_2754(this.method_37075()));
      }

      class_7666 var8 = new class_7666(EntityType.field_34276, var1, var7);
      var8.method_26864(var1, var1.method_43368(var8.method_37075()), class_2417.field_12038, (class_8733)null, (CompoundNBT)null);
      return var8;
   }

   @Override
   public void method_37384(class_6331 var1, class_900 var2) {
      if (var1.method_43370() == class_423.field_1790) {
         super.method_37384(var1, var2);
      } else {
         LOGGER.info("Villager {} was struck by lightning {}.", this, var2);
         class_1609 var5 = EntityType.field_34220.method_30484(var1);
         var5.method_37144(this.getPosX(), this.method_37309(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
         var5.method_26864(var1, var1.method_43368(var5.method_37075()), class_2417.field_12041, (class_8733)null, (CompoundNBT)null);
         var5.method_26888(this.method_26859());
         if (this.method_45507()) {
            var5.method_37303(this.method_45508());
            var5.method_37319(this.method_37135());
         }

         var5.method_26883();
         var1.method_7065(var5);
         this.method_34705();
         this.method_37204();
      }
   }

   @Override
   public void method_26902(class_91 var1) {
      ItemStack var4 = var1.method_264();
      if (this.method_26873(var4)) {
         class_4657 var5 = this.method_2017();
         boolean var6 = var5.method_21541(var4);
         if (!var6) {
            return;
         }

         this.method_26562(var1);
         this.method_26467(var1, var4.method_27997());
         ItemStack var7 = var5.method_21542(var4);
         if (!var7.method_28022()) {
            var4.method_28017(var7.method_27997());
         } else {
            var1.method_37204();
         }
      }
   }

   @Override
   public boolean method_26873(ItemStack var1) {
      class_2451 var4 = var1.method_27960();
      return (field_38976.contains(var4) || this.method_15891().method_13910().method_20726().contains(var4)) && this.method_2017().method_21541(var1);
   }

   public boolean method_34695() {
      return this.method_34727() >= 24;
   }

   public boolean method_34696() {
      return this.method_34727() < 12;
   }

   private int method_34727() {
      class_4657 var3 = this.method_2017();
      return field_38968.entrySet().stream().mapToInt(var1 -> var3.method_31504(var1.getKey()) * var1.getValue()).sum();
   }

   public boolean method_34700() {
      return this.method_2017().method_31496(ImmutableSet.of(class_4897.field_24621, class_4897.field_25273, class_4897.field_25136, class_4897.field_24883));
   }

   @Override
   public void method_2016() {
      class_3047 var3 = this.method_15891();
      Int2ObjectMap var4 = class_9469.field_48293.get(var3.method_13910());
      if (var4 != null && !var4.isEmpty()) {
         class_4904[] var5 = (class_4904[])var4.get(var3.method_13906());
         if (var5 != null) {
            class_2795 var6 = this.method_974();
            this.method_2021(var6, var5, 2);
         }
      }
   }

   public void method_34717(class_6331 var1, class_7666 var2, long var3) {
      if ((var3 < this.field_38974 || var3 >= this.field_38974 + 1200L) && (var3 < var2.field_38974 || var3 >= var2.field_38974 + 1200L)) {
         this.field_38977.method_11508(var2.field_38977, this.field_41717, 10);
         this.field_38974 = var3;
         var2.field_38974 = var3;
         this.method_34712(var1, var3, 5);
      }
   }

   private void method_34694() {
      long var3 = this.world.method_29546();
      if (this.field_38960 != 0L) {
         if (var3 >= this.field_38960 + 24000L) {
            this.field_38977.method_11509();
            this.field_38960 = var3;
         }
      } else {
         this.field_38960 = var3;
      }
   }

   public void method_34712(class_6331 var1, long var2, int var4) {
      if (this.method_34697(var2)) {
         Box var7 = this.method_37241().method_18899(10.0, 10.0, 10.0);
         List var8 = var1.<class_7666>method_25868(class_7666.class, var7);
         List var9 = var8.stream().filter(var2x -> var2x.method_34697(var2)).limit(5L).collect(Collectors.toList());
         if (var9.size() >= var4) {
            class_8127 var10 = this.method_34714(var1);
            if (var10 != null) {
               var8.forEach(class_9886::method_45543);
            }
         }
      }
   }

   public boolean method_34697(long var1) {
      return this.method_34693(this.world.method_29546()) ? !this.field_29675.method_5117(class_6044.field_30877) : false;
   }

   @Nullable
   private class_8127 method_34714(class_6331 var1) {
      BlockPos var4 = this.method_37075();

      for (int var5 = 0; var5 < 10; var5++) {
         double var6 = (double)(var1.field_33033.nextInt(16) - 8);
         double var8 = (double)(var1.field_33033.nextInt(16) - 8);
         BlockPos var10 = this.method_34701(var4, var6, var8);
         if (var10 != null) {
            class_8127 var11 = EntityType.field_34298
               .method_30483(var1, (CompoundNBT)null, (ITextComponent)null, (class_704)null, var10, class_2417.field_12027, false, false);
            if (var11 != null) {
               if (var11.method_26889(var1, class_2417.field_12027) && var11.method_26855(var1)) {
                  var1.method_7065(var11);
                  return var11;
               }

               var11.method_37204();
            }
         }
      }

      return null;
   }

   @Nullable
   private BlockPos method_34701(BlockPos var1, double var2, double var4) {
      byte var8 = 6;
      BlockPos var9 = var1.method_6103(var2, 6.0, var4);
      class_2522 var10 = this.world.method_28262(var9);

      for (int var11 = 6; var11 >= -6; var11--) {
         BlockPos var12 = var9;
         class_2522 var13 = var10;
         var9 = var9.method_6100();
         var10 = this.world.method_28262(var9);
         if ((var13.method_8345() || var13.method_8362().method_24494()) && var10.method_8362().method_24498()) {
            return var12;
         }
      }

      return null;
   }

   @Override
   public void method_25223(class_3894 var1, Entity var2) {
      if (var1 != class_3894.field_18945) {
         if (var1 != class_3894.field_18946) {
            if (var1 != class_3894.field_18943) {
               if (var1 == class_3894.field_18947) {
                  this.field_38977.method_11514(var2.method_37328(), class_5279.field_26992, 25);
               }
            } else {
               this.field_38977.method_11514(var2.method_37328(), class_5279.field_26999, 25);
            }
         } else {
            this.field_38977.method_11514(var2.method_37328(), class_5279.field_27004, 2);
         }
      } else {
         this.field_38977.method_11514(var2.method_37328(), class_5279.field_26995, 20);
         this.field_38977.method_11514(var2.method_37328(), class_5279.field_27000, 25);
      }
   }

   @Override
   public int method_973() {
      return this.field_38965;
   }

   public void method_34713(int var1) {
      this.field_38965 = var1;
   }

   private void method_34728() {
      this.method_34692();
      this.field_38962 = 0;
   }

   public class_2525 method_34709() {
      return this.field_38977;
   }

   public void method_34710(class_8406 var1) {
      this.field_38977.method_11506(new Dynamic(class_3504.field_17178, var1));
   }

   @Override
   public void method_26929() {
      super.method_26929();
      class_1892.method_8440(this);
   }

   @Override
   public void method_26470(BlockPos var1) {
      super.method_26470(var1);
      this.field_29675.method_5105(class_6044.field_30898, this.world.method_29546());
      this.field_29675.method_5127(class_6044.field_30889);
      this.field_29675.method_5127(class_6044.field_30909);
   }

   @Override
   public void method_26557() {
      super.method_26557();
      this.field_29675.method_5105(class_6044.field_30858, this.world.method_29546());
   }

   private boolean method_34693(long var1) {
      Optional var5 = this.field_29675.<Long>method_5138(class_6044.field_30898);
      return !var5.isPresent() ? false : var1 - (Long)var5.get() < 24000L;
   }
}
