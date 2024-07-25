package remapped;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class class_5834 extends Entity {
   private static final UUID field_29647 = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
   private static final UUID field_29641 = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final class_9343 field_29633 = new class_9343(field_29647, "Sprinting speed boost", 0.3F, class_9342.field_47677);
   public static final class_7821<Byte> field_29638 = class_8073.<Byte>method_36641(class_5834.class, class_2734.field_13361);
   private static final class_7821<Float> field_29627 = class_8073.<Float>method_36641(class_5834.class, class_2734.field_13350);
   private static final class_7821<Integer> field_29640 = class_8073.<Integer>method_36641(class_5834.class, class_2734.field_13366);
   private static final class_7821<Boolean> field_29626 = class_8073.<Boolean>method_36641(class_5834.class, class_2734.field_13347);
   private static final class_7821<Integer> field_29631 = class_8073.<Integer>method_36641(class_5834.class, class_2734.field_13366);
   private static final class_7821<Integer> field_29610 = class_8073.<Integer>method_36641(class_5834.class, class_2734.field_13366);
   private static final class_7821<Optional<class_1331>> field_29621 = class_8073.<Optional<class_1331>>method_36641(class_5834.class, class_2734.field_13352);
   public static final class_6097 field_29629 = class_6097.method_27941(0.2F, 0.2F);
   private final class_6711 field_29603;
   private final class_3435 field_29649 = new class_3435(this);
   private final Map<class_1425, class_2250> field_29642 = Maps.newHashMap();
   private final class_2831<ItemStack> field_29632 = class_2831.<ItemStack>method_12872(2, ItemStack.EMPTY);
   private final class_2831<ItemStack> field_29613 = class_2831.<ItemStack>method_12872(4, ItemStack.EMPTY);
   public boolean field_29599;
   public class_2584 field_29616;
   public int field_29666;
   public int field_29619;
   public int field_29646;
   public int field_29645;
   public int field_29662;
   public float field_29608;
   public int field_29677;
   public float field_29667;
   public float field_29606;
   public int field_29620;
   public float field_29598;
   public float field_29643;
   public float field_29671;
   public final int field_29615 = 20;
   public final float field_29617;
   public final float field_29637;
   public float field_29605;
   public float field_29611;
   public float field_29618;
   public float field_29657;
   public float field_29674 = 0.02F;
   public class_704 field_29634;
   public int field_29665;
   public boolean field_29659;
   public int field_29658;
   public float field_29639;
   public float field_29660;
   public float field_29672;
   public float field_29602;
   public float field_29648;
   public int field_29644;
   public float field_29601;
   public boolean field_29654;
   public float field_29676;
   public float field_29651;
   public float field_29673;
   public int field_29612;
   public double field_29597;
   public double field_29609;
   public double field_29650;
   public double field_29604;
   public double field_29625;
   public double field_29614;
   public int field_29653;
   private boolean field_29628 = true;
   private class_5834 field_29663;
   private int field_29636;
   private class_5834 field_29623;
   private int field_29635;
   private float field_29655;
   public int field_29600;
   private float field_29622;
   public ItemStack field_29668 = ItemStack.EMPTY;
   public int field_29656;
   public int field_29661;
   private class_1331 field_29664;
   private Optional<class_1331> field_29669 = Optional.<class_1331>empty();
   private class_6199 field_29652;
   private long field_29607;
   public int field_29630;
   private float field_29670;
   private float field_29624;
   public class_1150<?> field_29675;

   public class_5834(class_6629<? extends class_5834> var1, World var2) {
      super(var1, var2);
      this.field_29603 = new class_6711(class_9030.method_41423(var1));
      this.method_26456(this.method_26465());
      this.field_41759 = true;
      this.field_29637 = (float)((Math.random() + 1.0) * 0.01F);
      this.method_37351();
      this.field_29617 = (float)Math.random() * 12398.0F;
      this.field_41701 = (float)(Math.random() * (float) (Math.PI * 2));
      this.field_29618 = this.field_41701;
      this.field_41733 = 0.6F;
      class_3504 var5 = class_3504.field_17178;
      this.field_29675 = this.method_26585(new Dynamic(var5, var5.createMap(ImmutableMap.of(var5.createString("memories"), var5.emptyMap()))));
   }

   public class_1150<?> method_26525() {
      return this.field_29675;
   }

   public class_1193<?> method_26410() {
      return class_1150.method_5128(ImmutableList.of(), ImmutableList.of());
   }

   public class_1150<?> method_26585(Dynamic<?> var1) {
      return this.method_26410().method_5284(var1);
   }

   @Override
   public void method_37250() {
      this.method_37181(class_6199.field_31685, Float.MAX_VALUE);
   }

   public boolean method_26610(class_6629<?> var1) {
      return true;
   }

   @Override
   public void method_37329() {
      this.field_41735.method_36634(field_29638, (byte)0);
      this.field_41735.method_36634(field_29640, 0);
      this.field_41735.method_36634(field_29626, false);
      this.field_41735.method_36634(field_29631, 0);
      this.field_41735.method_36634(field_29610, 0);
      this.field_41735.method_36634(field_29627, 1.0F);
      this.field_41735.method_36634(field_29621, Optional.<class_1331>empty());
   }

   public static class_1313 method_26409() {
      return class_9632.method_44452()
         .method_5983(class_7331.field_37468)
         .method_5983(class_7331.field_37463)
         .method_5983(class_7331.field_37465)
         .method_5983(class_7331.field_37473)
         .method_5983(class_7331.field_37472);
   }

   @Override
   public void method_37105(double var1, boolean var3, class_2522 var4, class_1331 var5) {
      if (!this.method_37285()) {
         this.method_37362();
      }

      if (!this.field_41768.field_33055 && var3 && this.field_41706 > 0.0F) {
         this.method_26434();
         this.method_26471();
      }

      if (!this.field_41768.field_33055 && this.field_41706 > 3.0F && var3) {
         float var8 = (float)class_9299.method_42816(this.field_41706 - 3.0F);
         if (!var4.method_8345()) {
            double var9 = Math.min((double)(0.2F + var8 / 15.0F), 2.5);
            int var11 = (int)(150.0 * var9);
            ((class_6331)this.field_41768)
               .method_28957(
                  new class_7110(class_3090.field_15325, var4), this.method_37302(), this.method_37309(), this.method_37156(), var11, 0.0, 0.0, 0.0, 0.15F
               );
         }
      }

      super.method_37105(var1, var3, var4, var5);
   }

   public boolean method_26509() {
      return this.method_26550() == class_2780.field_13579;
   }

   public float method_26602(float var1) {
      return class_9299.method_42795(var1, this.field_29624, this.field_29670);
   }

   @Override
   public void method_37219() {
      this.field_29667 = this.field_29606;
      if (this.field_41716) {
         this.method_26518().ifPresent(this::method_26584);
      }

      if (this.method_26412()) {
         this.method_26535();
      }

      super.method_37219();
      this.field_41768.method_29599().startSection("livingEntityBaseTick");
      boolean var3 = this instanceof class_704;
      if (this.method_37330()) {
         if (!this.method_37153()) {
            if (var3 && !this.field_41768.method_6673().method_9815(this.method_37241())) {
               double var4 = this.field_41768.method_6673().method_9809(this) + this.field_41768.method_6673().method_9830();
               if (var4 < 0.0) {
                  double var6 = this.field_41768.method_6673().method_9826();
                  if (var6 > 0.0) {
                     this.method_37181(class_6199.field_31670, (float)Math.max(1, class_9299.method_42847(-var4 * var6)));
                  }
               }
            }
         } else {
            this.method_37181(class_6199.field_31670, 1.0F);
         }
      }

      if (this.method_37087() || this.field_41768.field_33055) {
         this.method_37136();
      }

      boolean var8 = var3 && ((class_704)this).field_3876.disableDamage;
      if (this.method_37330()) {
         if (this.method_37261(class_6503.field_33094)
            && !this.field_41768
               .method_28262(new class_1331(this.method_37302(), this.method_37388(), this.method_37156()))
               .method_8350(class_4783.field_23269)) {
            if (!this.method_26509() && !class_1493.method_6890(this) && !var8) {
               this.method_37192(this.method_26536(this.method_37229()));
               if (this.method_37229() == -20) {
                  this.method_37192(0);
                  class_1343 var9 = this.method_37098();

                  for (int var10 = 0; var10 < 8; var10++) {
                     double var11 = this.field_41717.nextDouble() - this.field_41717.nextDouble();
                     double var13 = this.field_41717.nextDouble() - this.field_41717.nextDouble();
                     double var15 = this.field_41717.nextDouble() - this.field_41717.nextDouble();
                     this.field_41768
                        .method_43361(
                           class_3090.field_15340,
                           this.method_37302() + var11,
                           this.method_37309() + var13,
                           this.method_37156() + var15,
                           var9.field_7336,
                           var9.field_7333,
                           var9.field_7334
                        );
                  }

                  this.method_37181(class_6199.field_31671, 2.0F);
               }
            }

            if (!this.field_41768.field_33055 && this.method_37070() && this.method_37243() != null && !this.method_37243().method_37168()) {
               this.method_37390();
            }
         } else if (this.method_37229() < this.method_37099()) {
            this.method_37192(this.method_26501(this.method_37229()));
         }

         if (!this.field_41768.field_33055) {
            class_1331 var17 = this.method_37075();
            if (!Objects.equal(this.field_29664, var17)) {
               this.field_29664 = var17;
               this.method_26598(var17);
            }
         }
      }

      if (this.method_37330() && this.method_37110()) {
         this.method_37136();
      }

      if (this.field_29645 > 0) {
         this.field_29645--;
      }

      if (this.field_41749 > 0 && !(this instanceof class_9359)) {
         this.field_41749--;
      }

      if (this.method_26450()) {
         this.method_26526();
      }

      if (this.field_29665 <= 0) {
         this.field_29634 = null;
      } else {
         this.field_29665--;
      }

      if (this.field_29623 != null && !this.field_29623.method_37330()) {
         this.field_29623 = null;
      }

      if (this.field_29663 != null) {
         if (this.field_29663.method_37330()) {
            if (this.field_41697 - this.field_29636 > 100) {
               this.method_26511((class_5834)null);
            }
         } else {
            this.method_26511((class_5834)null);
         }
      }

      this.method_26472();
      this.field_29602 = this.field_29672;
      this.field_29611 = this.field_29605;
      this.field_29657 = this.field_29618;
      this.field_41711 = this.field_41701;
      this.field_41762 = this.field_41755;
      this.field_41768.method_29599().endSection();
   }

   public boolean method_26412() {
      return this.field_41697 % 5 == 0
         && this.method_37098().field_7336 != 0.0
         && this.method_37098().field_7334 != 0.0
         && !this.method_37221()
         && class_2931.method_13411(this)
         && this.method_26444();
   }

   public void method_26535() {
      class_1343 var3 = this.method_37098();
      this.field_41768
         .method_43361(
            class_3090.field_15380,
            this.method_37302() + (this.field_41717.nextDouble() - 0.5) * (double)this.method_37086(),
            this.method_37309() + 0.1,
            this.method_37156() + (this.field_41717.nextDouble() - 0.5) * (double)this.method_37086(),
            var3.field_7336 * -0.2,
            0.1,
            var3.field_7334 * -0.2
         );
      float var4 = !(this.field_41717.nextFloat() * 0.4F + this.field_41717.nextFloat() > 0.9F) ? 0.0F : 0.6F;
      this.method_37155(class_463.field_2041, var4, 0.6F + this.field_41717.nextFloat() * 0.4F);
   }

   public boolean method_26444() {
      return this.field_41768.method_28262(this.method_37119()).method_8349(class_2351.field_11756);
   }

   @Override
   public float method_37364() {
      return this.method_26444() && class_2931.method_13399(class_3668.field_17849, this) > 0 ? 1.0F : super.method_37364();
   }

   public boolean method_26485(class_2522 var1) {
      return !var1.method_8345() || this.method_26618();
   }

   public void method_26434() {
      class_9747 var3 = this.method_26561(class_7331.field_37465);
      if (var3 != null && var3.method_44997(field_29641) != null) {
         var3.method_45003(field_29641);
      }
   }

   public void method_26471() {
      if (!this.method_37304().method_8345()) {
         int var3 = class_2931.method_13399(class_3668.field_17849, this);
         if (var3 > 0 && this.method_26444()) {
            class_9747 var4 = this.method_26561(class_7331.field_37465);
            if (var4 == null) {
               return;
            }

            var4.method_45011(new class_9343(field_29641, "Soul speed boost", (double)(0.03F * (1.0F + (float)var3 * 0.35F)), class_9342.field_47679));
            if (this.method_26594().nextFloat() < 0.04F) {
               ItemStack var5 = this.method_26520(class_6943.field_35700);
               var5.method_28003(1, this, var0 -> var0.method_26448(class_6943.field_35700));
            }
         }
      }
   }

   public void method_26598(class_1331 var1) {
      int var4 = class_2931.method_13399(class_3668.field_17848, this);
      if (var4 > 0) {
         class_5050.method_23231(this, this.field_41768, var1, var4);
      }

      if (this.method_26485(this.method_37304())) {
         this.method_26434();
      }

      this.method_26471();
   }

   public boolean method_26449() {
      return false;
   }

   public float method_26479() {
      return !this.method_26449() ? 1.0F : 0.5F;
   }

   public boolean method_26498() {
      return true;
   }

   @Override
   public boolean method_37168() {
      return false;
   }

   public void method_26526() {
      this.field_29677++;
      if (this.field_29677 == 20) {
         this.method_37204();

         for (int var3 = 0; var3 < 20; var3++) {
            double var4 = this.field_41717.nextGaussian() * 0.02;
            double var6 = this.field_41717.nextGaussian() * 0.02;
            double var8 = this.field_41717.nextGaussian() * 0.02;
            this.field_41768.method_43361(class_3090.field_15343, this.method_37361(1.0), this.method_37255(), this.method_37383(1.0), var4, var6, var8);
         }
      }
   }

   public boolean method_26482() {
      return !this.method_26449();
   }

   public boolean method_26534() {
      return !this.method_26449();
   }

   public int method_26536(int var1) {
      int var4 = class_2931.method_13430(this);
      return var4 > 0 && this.field_41717.nextInt(var4 + 1) > 0 ? var1 : var1 - 1;
   }

   public int method_26501(int var1) {
      return Math.min(var1 + 4, this.method_37099());
   }

   public int method_26427(class_704 var1) {
      return 0;
   }

   public boolean method_26586() {
      return false;
   }

   public Random method_26594() {
      return this.field_41717;
   }

   @Nullable
   public class_5834 method_26531() {
      return this.field_29663;
   }

   public int method_26577() {
      return this.field_29636;
   }

   public void method_26580(class_704 var1) {
      this.field_29634 = var1;
      this.field_29665 = this.field_41697;
   }

   public void method_26511(class_5834 var1) {
      this.field_29663 = var1;
      this.field_29636 = this.field_41697;
   }

   @Nullable
   public class_5834 method_26455() {
      return this.field_29623;
   }

   public int method_26581() {
      return this.field_29635;
   }

   public void method_26510(Entity var1) {
      if (!(var1 instanceof class_5834)) {
         this.field_29623 = null;
      } else {
         this.field_29623 = (class_5834)var1;
      }

      this.field_29635 = this.field_41697;
   }

   public int method_26532() {
      return this.field_29658;
   }

   public void method_26441(int var1) {
      this.field_29658 = var1;
   }

   public void method_26620(ItemStack var1) {
      if (!var1.method_28022()) {
         class_8461 var4 = class_463.field_2719;
         class_2451 var5 = var1.method_27960();
         if (!(var5 instanceof class_8228)) {
            if (var5 == class_4897.field_24503) {
               var4 = class_463.field_1923;
            }
         } else {
            var4 = ((class_8228)var5).method_37667().method_22191();
         }

         this.method_37155(var4, 1.0F, 1.0F);
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      var1.method_25920("Health", this.method_26551());
      var1.method_25958("HurtTime", (short)this.field_29645);
      var1.method_25931("HurtByTimestamp", this.field_29636);
      var1.method_25958("DeathTime", (short)this.field_29677);
      var1.method_25920("AbsorptionAmount", this.method_26493());
      var1.method_25946("Attributes", this.method_26590().method_30807());
      if (!this.field_29642.isEmpty()) {
         class_3416 var4 = new class_3416();

         for (class_2250 var6 : this.field_29642.values()) {
            var4.add(var6.method_10345(new CompoundNBT()));
         }

         var1.method_25946("ActiveEffects", var4);
      }

      var1.method_25934("FallFlying", this.method_26618());
      this.method_26518().ifPresent(var1x -> {
         var1.method_25931("SleepingX", var1x.method_12173());
         var1.method_25931("SleepingY", var1x.method_12165());
         var1.method_25931("SleepingZ", var1x.method_12185());
      });
      DataResult var7 = this.field_29675.method_5131(class_3504.field_17178);
      var7.resultOrPartial(field_41741::error).ifPresent(var1x -> var1.method_25946("Brain", var1x));
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      this.method_26460(var1.method_25955("AbsorptionAmount"));
      if (var1.method_25939("Attributes", 9) && this.field_41768 != null && !this.field_41768.field_33055) {
         this.method_26590().method_30812(var1.method_25927("Attributes", 10));
      }

      if (var1.method_25939("ActiveEffects", 9)) {
         class_3416 var4 = var1.method_25927("ActiveEffects", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            CompoundNBT var6 = var4.method_15764(var5);
            class_2250 var7 = class_2250.method_10343(var6);
            if (var7 != null) {
               this.field_29642.put(var7.method_10339(), var7);
            }
         }
      }

      if (var1.method_25939("Health", 99)) {
         this.method_26456(var1.method_25955("Health"));
      }

      this.field_29645 = var1.method_25956("HurtTime");
      this.field_29677 = var1.method_25956("DeathTime");
      this.field_29636 = var1.method_25947("HurtByTimestamp");
      if (var1.method_25939("Team", 8)) {
         String var8 = var1.method_25965("Team");
         class_3903 var10 = this.field_41768.method_29562().method_4850(var8);
         boolean var11 = var10 != null && this.field_41768.method_29562().method_4842(this.method_37225(), var10);
         if (!var11) {
            field_41741.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", var8);
         }
      }

      if (var1.method_25933("FallFlying")) {
         this.method_37220(7, true);
      }

      if (var1.method_25939("SleepingX", 99) && var1.method_25939("SleepingY", 99) && var1.method_25939("SleepingZ", 99)) {
         class_1331 var9 = new class_1331(var1.method_25947("SleepingX"), var1.method_25947("SleepingY"), var1.method_25947("SleepingZ"));
         this.method_26601(var9);
         this.field_41735.method_36633(field_41734, class_7653.field_38886);
         if (!this.field_41716) {
            this.method_26584(var9);
         }
      }

      if (var1.method_25939("Brain", 10)) {
         this.field_29675 = this.method_26585(new Dynamic(class_3504.field_17178, var1.method_25929("Brain")));
      }
   }

   public void method_26472() {
      Iterator var3 = this.field_29642.keySet().iterator();

      try {
         while (var3.hasNext()) {
            class_1425 var4 = (class_1425)var3.next();
            class_2250 var5 = this.field_29642.get(var4);
            if (!var5.method_10341(this, () -> this.method_26552(var5, true))) {
               if (!this.field_41768.field_33055) {
                  var3.remove();
                  this.method_26616(var5);
               }
            } else if (var5.method_10347() % 600 == 0) {
               this.method_26552(var5, false);
            }
         }
      } catch (ConcurrentModificationException var13) {
      }

      if (this.field_29628) {
         if (!this.field_41768.field_33055) {
            this.method_26414();
         }

         this.field_29628 = false;
      }

      int var14 = this.field_41735.<Integer>method_36640(field_29640);
      boolean var15 = this.field_41735.<Boolean>method_36640(field_29626);
      if (var14 > 0) {
         boolean var6;
         if (this.method_37109()) {
            var6 = this.field_41717.nextInt(15) == 0;
         } else {
            var6 = this.field_41717.nextBoolean();
         }

         if (var15) {
            var6 &= this.field_41717.nextInt(5) == 0;
         }

         if (var6 && var14 > 0) {
            double var7 = (double)(var14 >> 16 & 0xFF) / 255.0;
            double var9 = (double)(var14 >> 8 & 0xFF) / 255.0;
            double var11 = (double)(var14 >> 0 & 0xFF) / 255.0;
            this.field_41768
               .method_43361(
                  var15 ? class_3090.field_15364 : class_3090.field_15353,
                  this.method_37361(0.5),
                  this.method_37255(),
                  this.method_37383(0.5),
                  var7,
                  var9,
                  var11
               );
         }
      }
   }

   public void method_26414() {
      if (!this.field_29642.isEmpty()) {
         Collection var3 = this.field_29642.values();
         this.field_41735.method_36633(field_29626, method_26486(var3));
         this.field_41735.method_36633(field_29640, class_9541.method_43997(var3));
         this.method_37333(this.isPotionActive(Effects.field_19740));
      } else {
         this.method_26517();
         this.method_37333(false);
      }
   }

   public double method_26516(Entity var1) {
      double var4 = 1.0;
      if (this.method_37073()) {
         var4 *= 0.8;
      }

      if (this.method_37109()) {
         float var6 = this.method_26540();
         if (var6 < 0.1F) {
            var6 = 0.1F;
         }

         var4 *= 0.7 * (double)var6;
      }

      if (var1 != null) {
         ItemStack var9 = this.method_26520(class_6943.field_35704);
         class_2451 var7 = var9.method_27960();
         class_6629 var8 = var1.method_37387();
         if (var8 == class_6629.field_34241 && var7 == class_4897.field_24880
            || var8 == class_6629.field_34297 && var7 == class_4897.field_24349
            || var8 == class_6629.field_34210 && var7 == class_4897.field_25069) {
            var4 *= 0.5;
         }
      }

      return var4;
   }

   public boolean method_26608(class_5834 var1) {
      return true;
   }

   public boolean method_26609(class_5834 var1, class_4931 var2) {
      return var2.method_22604(this, var1);
   }

   public static boolean method_26486(Collection<class_2250> var0) {
      for (class_2250 var4 : var0) {
         if (!var4.method_10338()) {
            return false;
         }
      }

      return true;
   }

   public void method_26517() {
      this.field_41735.method_36633(field_29626, false);
      this.field_41735.method_36633(field_29640, 0);
   }

   public boolean method_26523() {
      if (this.field_41768.field_33055) {
         return false;
      } else {
         Iterator var3 = this.field_29642.values().iterator();

         boolean var4;
         for (var4 = false; var3.hasNext(); var4 = true) {
            this.method_26616((class_2250)var3.next());
            var3.remove();
         }

         return var4;
      }
   }

   public Collection<class_2250> method_26503() {
      return this.field_29642.values();
   }

   public Map<class_1425, class_2250> method_26491() {
      return this.field_29642;
   }

   public boolean isPotionActive(class_1425 var1) {
      return this.field_29642.containsKey(var1);
   }

   @Nullable
   public class_2250 method_26553(class_1425 var1) {
      return this.field_29642.get(var1);
   }

   public boolean method_26558(class_2250 var1) {
      if (this.method_26495(var1)) {
         class_2250 var4 = this.field_29642.get(var1.method_10339());
         if (var4 != null) {
            if (!var4.method_10331(var1)) {
               return false;
            } else {
               this.method_26552(var4, true);
               return true;
            }
         } else {
            this.field_29642.put(var1.method_10339(), var1);
            this.method_26494(var1);
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean method_26495(class_2250 var1) {
      if (this.method_26550() == class_2780.field_13579) {
         class_1425 var4 = var1.method_10339();
         if (var4 == Effects.field_19742 || var4 == Effects.field_19718) {
            return false;
         }
      }

      return true;
   }

   public void method_26440(class_2250 var1) {
      if (this.method_26495(var1)) {
         class_2250 var4 = this.field_29642.put(var1.method_10339(), var1);
         if (var4 != null) {
            this.method_26552(var1, true);
         } else {
            this.method_26494(var1);
         }
      }
   }

   public boolean method_26563() {
      return this.method_26550() == class_2780.field_13579;
   }

   @Nullable
   public class_2250 method_26421(class_1425 var1) {
      return this.field_29642.remove(var1);
   }

   public boolean removeEffect(class_1425 var1) {
      class_2250 var4 = this.method_26421(var1);
      if (var4 == null) {
         return false;
      } else {
         this.method_26616(var4);
         return true;
      }
   }

   public void method_26494(class_2250 var1) {
      this.field_29628 = true;
      if (!this.field_41768.field_33055) {
         var1.method_10339().method_6543(this, this.method_26590(), var1.method_10333());
      }
   }

   public void method_26552(class_2250 var1, boolean var2) {
      this.field_29628 = true;
      if (var2 && !this.field_41768.field_33055) {
         class_1425 var5 = var1.method_10339();
         var5.method_6551(this, this.method_26590(), var1.method_10333());
         var5.method_6543(this, this.method_26590(), var1.method_10333());
      }
   }

   public void method_26616(class_2250 var1) {
      this.field_29628 = true;
      if (!this.field_41768.field_33055) {
         var1.method_10339().method_6551(this, this.method_26590(), var1.method_10333());
      }
   }

   public void method_26457(float var1) {
      float var4 = this.method_26551();
      if (var4 > 0.0F) {
         this.method_26456(var4 + var1);
      }
   }

   public float method_26551() {
      return this.field_41735.<Float>method_36640(field_29627);
   }

   public void method_26456(float var1) {
      this.field_41735.method_36633(field_29627, class_9299.method_42828(var1, 0.0F, this.method_26465()));
   }

   public boolean method_26450() {
      return this.method_26551() <= 0.0F;
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      if (this.method_37180(var1)) {
         return false;
      } else if (!this.field_41768.field_33055) {
         if (this.method_26450()) {
            return false;
         } else if (var1.method_28360() && this.isPotionActive(Effects.field_19745)) {
            return false;
         } else {
            if (this.method_26507() && !this.field_41768.field_33055) {
               this.method_26557();
            }

            this.field_29658 = 0;
            float var5 = var2;
            if ((var1 == class_6199.field_31666 || var1 == class_6199.field_31681) && !this.method_26520(class_6943.field_35704).method_28022()) {
               this.method_26520(class_6943.field_35704)
                  .method_28003((int)(var2 * 4.0F + this.field_41717.nextFloat() * var2 * 2.0F), this, var0 -> var0.method_26448(class_6943.field_35704));
               var2 *= 0.75F;
            }

            boolean var6 = false;
            float var7 = 0.0F;
            if (var2 > 0.0F && this.method_26413(var1)) {
               this.method_26451(var2);
               var7 = var2;
               var2 = 0.0F;
               if (!var1.method_28357()) {
                  Entity var8 = var1.method_28353();
                  if (var8 instanceof class_5834) {
                     this.method_26548((class_5834)var8);
                  }
               }

               var6 = true;
            }

            this.field_29643 = 1.5F;
            boolean var16 = true;
            if (!((float)this.field_41749 > 10.0F)) {
               this.field_29601 = var2;
               this.field_41749 = 20;
               this.method_26574(var1, var2);
               this.field_29662 = 10;
               this.field_29645 = this.field_29662;
            } else {
               if (var2 <= this.field_29601) {
                  return false;
               }

               this.method_26574(var1, var2 - this.field_29601);
               this.field_29601 = var2;
               var16 = false;
            }

            this.field_29608 = 0.0F;
            Entity var9 = var1.method_28372();
            if (var9 != null) {
               if (var9 instanceof class_5834) {
                  this.method_26511((class_5834)var9);
               }

               if (!(var9 instanceof class_704)) {
                  if (var9 instanceof class_9408) {
                     class_9408 var10 = (class_9408)var9;
                     if (var10.method_41215()) {
                        this.field_29665 = 100;
                        class_5834 var11 = var10.method_41207();
                        if (var11 != null && var11.method_37387() == class_6629.field_34300) {
                           this.field_29634 = (class_704)var11;
                        } else {
                           this.field_29634 = null;
                        }
                     }
                  }
               } else {
                  this.field_29665 = 100;
                  this.field_29634 = (class_704)var9;
               }
            }

            if (var16) {
               if (!var6) {
                  if (var1 instanceof class_5405 && ((class_5405)var1).method_24600()) {
                     this.field_41768.method_29587(this, (byte)33);
                  } else {
                     byte var17;
                     if (var1 != class_6199.field_31671) {
                        if (!var1.method_28360()) {
                           if (var1 != class_6199.field_31687) {
                              var17 = 2;
                           } else {
                              var17 = 44;
                           }
                        } else {
                           var17 = 37;
                        }
                     } else {
                        var17 = 36;
                     }

                     this.field_41768.method_29587(this, var17);
                  }
               } else {
                  this.field_41768.method_29587(this, (byte)29);
               }

               if (var1 != class_6199.field_31671 && (!var6 || var2 > 0.0F)) {
                  this.method_37138();
               }

               if (var9 == null) {
                  this.field_29608 = (float)((int)(Math.random() * 2.0) * 180);
               } else {
                  double var12 = var9.method_37302() - this.method_37302();

                  double var14;
                  for (var14 = var9.method_37156() - this.method_37156();
                     var12 * var12 + var14 * var14 < 1.0E-4;
                     var14 = (Math.random() - Math.random()) * 0.01
                  ) {
                     var12 = (Math.random() - Math.random()) * 0.01;
                  }

                  this.field_29608 = (float)(class_9299.method_42821(var14, var12) * 180.0F / (float)Math.PI - (double)this.field_41701);
                  this.method_26567(0.4F, var12, var14);
               }
            }

            if (!this.method_26450()) {
               if (var16) {
                  this.method_26593(var1);
               }
            } else if (!this.method_26573(var1)) {
               class_8461 var18 = this.method_26599();
               if (var16 && var18 != null) {
                  this.method_37155(var18, this.method_26439(), this.method_26547());
               }

               this.method_26452(var1);
            }

            boolean var19 = !var6 || var2 > 0.0F;
            if (var19) {
               this.field_29652 = var1;
               this.field_29607 = this.field_41768.method_29546();
            }

            if (this instanceof class_9359) {
               class_8807.field_45041.method_14841((class_9359)this, var1, var5, var2, var6);
               if (var7 > 0.0F && var7 < 3.4028235E37F) {
                  ((class_9359)this).method_3210(class_6234.field_31906, Math.round(var7 * 10.0F));
               }
            }

            if (var9 instanceof class_9359) {
               class_8807.field_45070.method_32725((class_9359)var9, this, var1, var5, var2, var6);
            }

            return var19;
         }
      } else {
         return false;
      }
   }

   public void method_26548(class_5834 var1) {
      var1.method_26469(this);
   }

   public void method_26469(class_5834 var1) {
      var1.method_26567(0.5F, var1.method_37302() - this.method_37302(), var1.method_37156() - this.method_37156());
   }

   private boolean method_26573(class_6199 var1) {
      if (var1.method_28346()) {
         return false;
      } else {
         ItemStack var4 = null;

         for (class_2584 var8 : class_2584.values()) {
            ItemStack var9 = this.method_26617(var8);
            if (var9.method_27960() == class_4897.field_24472) {
               var4 = var9.method_27973();
               var9.method_27970(1);
               break;
            }
         }

         if (var4 != null) {
            if (this instanceof class_9359) {
               class_9359 var10 = (class_9359)this;
               var10.method_3211(class_6234.field_31907.method_43790(class_4897.field_24472));
               class_8807.field_45043.method_9683(var10, var4);
            }

            this.method_26456(1.0F);
            this.method_26523();
            this.method_26558(new class_2250(Effects.field_19742, 900, 1));
            this.method_26558(new class_2250(Effects.field_19731, 100, 1));
            this.method_26558(new class_2250(Effects.field_19745, 800, 0));
            this.field_41768.method_29587(this, (byte)35);
         }

         return var4 != null;
      }
   }

   @Nullable
   public class_6199 method_26429() {
      if (this.field_41768.method_29546() - this.field_29607 > 40L) {
         this.field_29652 = null;
      }

      return this.field_29652;
   }

   public void method_26593(class_6199 var1) {
      class_8461 var4 = this.method_26541(var1);
      if (var4 != null) {
         this.method_37155(var4, this.method_26439(), this.method_26547());
      }
   }

   private boolean method_26413(class_6199 var1) {
      Entity var4 = var1.method_28353();
      boolean var5 = false;
      if (var4 instanceof class_6749) {
         class_6749 var6 = (class_6749)var4;
         if (var6.method_30936() > 0) {
            var5 = true;
         }
      }

      if (!var1.method_28380() && this.method_26463() && !var5) {
         class_1343 var9 = var1.method_28365();
         if (var9 != null) {
            class_1343 var7 = this.method_37307(1.0F);
            class_1343 var8 = var9.method_6202(this.method_37245()).method_6213();
            var8 = new class_1343(var8.field_7336, 0.0, var8.field_7334);
            if (var8.method_6206(var7) < 0.0) {
               return true;
            }
         }
      }

      return false;
   }

   private void method_26464(ItemStack var1) {
      if (!var1.method_28022()) {
         if (!this.method_37378()) {
            this.field_41768
               .method_29527(
                  this.method_37302(),
                  this.method_37309(),
                  this.method_37156(),
                  class_463.field_1962,
                  this.method_37197(),
                  0.8F,
                  0.8F + this.field_41768.field_33033.nextFloat() * 0.4F,
                  false
               );
         }

         this.method_26519(var1, 5);
      }
   }

   public void method_26452(class_6199 var1) {
      if (!this.field_41751 && !this.field_29659) {
         Entity var4 = var1.method_28372();
         class_5834 var5 = this.method_26560();
         if (this.field_29644 >= 0 && var5 != null) {
            var5.method_37392(this, this.field_29644, var1);
         }

         if (this.method_26507()) {
            this.method_26557();
         }

         this.field_29659 = true;
         this.method_26476().method_15868();
         if (this.field_41768 instanceof class_6331) {
            if (var4 != null) {
               var4.method_37231((class_6331)this.field_41768, this);
            }

            this.method_26513(var1);
            this.method_26487(var5);
         }

         this.field_41768.method_29587(this, (byte)3);
         this.method_37356(class_7653.field_38887);
      }
   }

   public void method_26487(class_5834 var1) {
      if (!this.field_41768.field_33055) {
         boolean var4 = false;
         if (var1 instanceof class_4653) {
            if (this.field_41768.method_29537().method_1285(class_291.field_1047)) {
               class_1331 var5 = this.method_37075();
               class_2522 var6 = class_4783.field_23401.method_29260();
               if (this.field_41768.method_28262(var5).method_8345() && var6.method_8309(this.field_41768, var5)) {
                  this.field_41768.method_7513(var5, var6, 3);
                  var4 = true;
               }
            }

            if (!var4) {
               class_91 var7 = new class_91(
                  this.field_41768, this.method_37302(), this.method_37309(), this.method_37156(), new ItemStack(class_4897.field_24893)
               );
               this.field_41768.method_7509(var7);
            }
         }
      }
   }

   public void method_26513(class_6199 var1) {
      Entity var4 = var1.method_28372();
      int var5;
      if (!(var4 instanceof class_704)) {
         var5 = 0;
      } else {
         var5 = class_2931.method_13397((class_5834)var4);
      }

      boolean var6 = this.field_29665 > 0;
      if (this.method_26534() && this.field_41768.method_29537().method_1285(class_291.field_1033)) {
         this.method_26483(var1, var6);
         this.method_26614(var1, var5, var6);
      }

      this.method_26522();
      this.method_26604();
   }

   public void method_26522() {
   }

   public void method_26604() {
      if (!this.field_41768.field_33055
         && (this.method_26586() || this.field_29665 > 0 && this.method_26482() && this.field_41768.method_29537().method_1285(class_291.field_1033))) {
         int var3 = this.method_26427(this.field_29634);

         while (var3 > 0) {
            int var4 = class_5614.method_25476(var3);
            var3 -= var4;
            this.field_41768.method_7509(new class_5614(this.field_41768, this.method_37302(), this.method_37309(), this.method_37156(), var4));
         }
      }
   }

   public void method_26614(class_6199 var1, int var2, boolean var3) {
   }

   public Identifier method_26591() {
      return this.method_37387().method_30480();
   }

   public void method_26483(class_6199 var1, boolean var2) {
      Identifier var5 = this.method_26591();
      class_1758 var6 = this.field_41768.method_29522().method_1722().method_4604(var5);
      class_8480 var7 = this.method_26502(var2, var1);
      var6.method_7863(var7.method_39064(class_4933.field_25566), this::method_37310);
   }

   public class_8480 method_26502(boolean var1, class_6199 var2) {
      class_8480 var5 = new class_8480((class_6331)this.field_41768)
         .method_39068(this.field_41717)
         .method_39065(class_8712.field_44676, this)
         .method_39065(class_8712.field_44671, this.method_37245())
         .method_39065(class_8712.field_44674, var2)
         .method_39069(class_8712.field_44678, var2.method_28372())
         .method_39069(class_8712.field_44669, var2.method_28353());
      if (var1 && this.field_29634 != null) {
         var5 = var5.method_39065(class_8712.field_44675, this.field_29634).method_39063(this.field_29634.method_3234());
      }

      return var5;
   }

   public void method_26567(float var1, double var2, double var4) {
      var1 = (float)((double)var1 * (1.0 - this.method_26575(class_7331.field_37463)));
      if (!(var1 <= 0.0F)) {
         this.field_41763 = true;
         class_1343 var8 = this.method_37098();
         class_1343 var9 = new class_1343(var2, 0.0, var4).method_6213().method_6209((double)var1);
         this.method_37214(
            var8.field_7336 / 2.0 - var9.field_7336,
            !this.field_41726 ? var8.field_7333 : Math.min(0.4, var8.field_7333 / 2.0 + (double)var1),
            var8.field_7334 / 2.0 - var9.field_7334
         );
      }
   }

   @Nullable
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2152;
   }

   @Nullable
   public class_8461 method_26599() {
      return class_463.field_2062;
   }

   public class_8461 method_26587(int var1) {
      return var1 <= 4 ? class_463.field_2448 : class_463.field_1953;
   }

   public class_8461 method_26566(ItemStack var1) {
      return var1.method_28011();
   }

   public class_8461 method_26484(ItemStack var1) {
      return var1.method_27979();
   }

   @Override
   public void method_37386(boolean var1) {
      super.method_37386(var1);
      if (var1) {
         this.field_29669 = Optional.<class_1331>empty();
      }
   }

   public Optional<class_1331> method_26436() {
      return this.field_29669;
   }

   public boolean method_26505() {
      if (!this.method_37221()) {
         class_1331 var3 = this.method_37075();
         class_2522 var4 = this.method_26603();
         class_6414 var5 = var4.method_8360();
         if (!var5.method_29299(class_2351.field_11770)) {
            if (var5 instanceof class_7502 && this.method_26544(var3, var4)) {
               this.field_29669 = Optional.<class_1331>of(var3);
               return true;
            } else {
               return false;
            }
         } else {
            this.field_29669 = Optional.<class_1331>of(var3);
            return true;
         }
      } else {
         return false;
      }
   }

   public class_2522 method_26603() {
      return this.field_41768.method_28262(this.method_37075());
   }

   private boolean method_26544(class_1331 var1, class_2522 var2) {
      if (var2.<Boolean>method_10313(class_7502.field_38300)) {
         class_2522 var5 = this.field_41768.method_28262(var1.method_6100());
         if (var5.method_8350(class_4783.field_23748)
            && var5.<Direction>method_10313(class_5613.field_28506) == var2.<Direction>method_10313(class_7502.field_1543)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean method_37330() {
      return !this.field_41751 && this.method_26551() > 0.0F;
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      boolean var5 = super.method_37270(var1, var2);
      int var6 = this.method_26490(var1, var2);
      if (var6 <= 0) {
         return var5;
      } else {
         this.method_37155(this.method_26587(var6), 1.0F, 1.0F);
         this.method_26512();
         this.method_37181(class_6199.field_31684, (float)var6);
         return true;
      }
   }

   public int method_26490(float var1, float var2) {
      class_2250 var5 = this.method_26553(Effects.field_19730);
      float var6 = var5 != null ? (float)(var5.method_10333() + 1) : 0.0F;
      return class_9299.method_42816((var1 - 3.0F - var6) * var2);
   }

   public void method_26512() {
      if (!this.method_37378()) {
         int var3 = class_9299.method_42847(this.method_37302());
         int var4 = class_9299.method_42847(this.method_37309() - 0.2F);
         int var5 = class_9299.method_42847(this.method_37156());
         class_2522 var6 = this.field_41768.method_28262(new class_1331(var3, var4, var5));
         if (!var6.method_8345()) {
            class_4618 var7 = var6.method_8316();
            this.method_37155(var7.method_21394(), var7.method_21395() * 0.5F, var7.method_21393() * 0.75F);
         }
      }
   }

   @Override
   public void method_37082() {
      this.field_29662 = 10;
      this.field_29645 = this.field_29662;
      this.field_29608 = 0.0F;
   }

   public int method_26565() {
      return class_9299.method_42847(this.method_26575(class_7331.field_37473));
   }

   public void method_26524(class_6199 var1, float var2) {
   }

   public void method_26451(float var1) {
   }

   public float method_26555(class_6199 var1, float var2) {
      if (!var1.method_28380()) {
         this.method_26524(var1, var2);
         var2 = class_6357.method_29129(var2, (float)this.method_26565(), (float)this.method_26575(class_7331.field_37472));
      }

      return var2;
   }

   public float method_26477(class_6199 var1, float var2) {
      if (!var1.method_28348()) {
         if (this.isPotionActive(Effects.field_19727) && var1 != class_6199.field_31685) {
            int var5 = (this.method_26553(Effects.field_19727).method_10333() + 1) * 5;
            int var6 = 25 - var5;
            float var7 = var2 * (float)var6;
            float var8 = var2;
            var2 = Math.max(var7 / 25.0F, 0.0F);
            float var9 = var8 - var2;
            if (var9 > 0.0F && var9 < 3.4028235E37F) {
               if (!(this instanceof class_9359)) {
                  if (var1.method_28372() instanceof class_9359) {
                     ((class_9359)var1.method_28372()).method_3210(class_6234.field_31866, Math.round(var9 * 10.0F));
                  }
               } else {
                  ((class_9359)this).method_3210(class_6234.field_31865, Math.round(var9 * 10.0F));
               }
            }
         }

         if (!(var2 <= 0.0F)) {
            int var10 = class_2931.method_13427(this.method_37262(), var1);
            if (var10 > 0) {
               var2 = class_6357.method_29131(var2, (float)var10);
            }

            return var2;
         } else {
            return 0.0F;
         }
      } else {
         return var2;
      }
   }

   public void method_26574(class_6199 var1, float var2) {
      if (!this.method_37180(var1)) {
         var2 = this.method_26555(var1, var2);
         var2 = this.method_26477(var1, var2);
         float var5 = Math.max(var2 - this.method_26493(), 0.0F);
         this.method_26460(this.method_26493() - (var2 - var5));
         float var6 = var2 - var5;
         if (var6 > 0.0F && var6 < 3.4028235E37F && var1.method_28372() instanceof class_9359) {
            ((class_9359)var1.method_28372()).method_3210(class_6234.field_31833, Math.round(var6 * 10.0F));
         }

         if (var5 != 0.0F) {
            float var7 = this.method_26551();
            this.method_26456(var7 - var5);
            this.method_26476().method_15875(var1, var7, var5);
            this.method_26460(this.method_26493() - var5);
         }
      }
   }

   public class_3435 method_26476() {
      return this.field_29649;
   }

   @Nullable
   public class_5834 method_26560() {
      if (this.field_29649.method_15876() == null) {
         if (this.field_29634 == null) {
            return this.field_29663 == null ? null : this.field_29663;
         } else {
            return this.field_29634;
         }
      } else {
         return this.field_29649.method_15876();
      }
   }

   public final float method_26465() {
      return (float)this.method_26575(class_7331.field_37468);
   }

   public final int method_26569() {
      return this.field_41735.<Integer>method_36640(field_29631);
   }

   public final void method_26508(int var1) {
      this.field_41735.method_36633(field_29631, var1);
   }

   public final int method_26619() {
      return this.field_41735.<Integer>method_36640(field_29610);
   }

   public final void method_26504(int var1) {
      this.field_41735.method_36633(field_29610, var1);
   }

   private int method_26473() {
      if (!class_1493.method_6892(this)) {
         return !this.isPotionActive(Effects.field_19748) ? 6 : 6 + (1 + this.method_26553(Effects.field_19748).method_10333()) * 2;
      } else {
         return 6 - (1 + class_1493.method_6888(this));
      }
   }

   public void method_26597(class_2584 var1) {
      this.method_26488(var1, false);
   }

   public void method_26488(class_2584 var1, boolean var2) {
      if (!this.field_29599 || this.field_29666 >= this.method_26473() / 2 || this.field_29666 < 0) {
         this.field_29666 = -1;
         this.field_29599 = true;
         this.field_29616 = var1;
         if (this.field_41768 instanceof class_6331) {
            class_8329 var5 = new class_8329(this, var1 != class_2584.field_12791 ? 3 : 0);
            class_2206 var6 = ((class_6331)this.field_41768).method_28945();
            if (!var2) {
               var6.method_10200(this, var5);
            } else {
               var6.method_10209(this, var5);
            }
         }
      }
   }

   @Override
   public void method_37336(byte var1) {
      switch (var1) {
         case 2:
         case 33:
         case 36:
         case 37:
         case 44:
            boolean var4 = var1 == 33;
            boolean var5 = var1 == 36;
            boolean var6 = var1 == 37;
            boolean var7 = var1 == 44;
            this.field_29643 = 1.5F;
            this.field_41749 = 20;
            this.field_29662 = 10;
            this.field_29645 = this.field_29662;
            this.field_29608 = 0.0F;
            if (var4) {
               this.method_37155(class_463.field_2676, this.method_26439(), (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F);
            }

            class_6199 var8;
            if (var6) {
               var8 = class_6199.field_31665;
            } else if (var5) {
               var8 = class_6199.field_31671;
            } else if (var7) {
               var8 = class_6199.field_31687;
            } else {
               var8 = class_6199.field_31664;
            }

            class_8461 var9 = this.method_26541(var8);
            if (var9 != null) {
               this.method_37155(var9, this.method_26439(), (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F);
            }

            this.method_37181(class_6199.field_31664, 0.0F);
            break;
         case 3:
            class_8461 var10 = this.method_26599();
            if (var10 != null) {
               this.method_37155(var10, this.method_26439(), (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F);
            }

            if (!(this instanceof class_704)) {
               this.method_26456(0.0F);
               this.method_26452(class_6199.field_31664);
            }
            break;
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 31:
         case 32:
         case 34:
         case 35:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 45:
         case 53:
         default:
            super.method_37336(var1);
            break;
         case 29:
            this.method_37155(class_463.field_2771, 1.0F, 0.8F + this.field_41768.field_33033.nextFloat() * 0.4F);
            break;
         case 30:
            this.method_37155(class_463.field_2764, 0.8F, 0.8F + this.field_41768.field_33033.nextFloat() * 0.4F);
            break;
         case 46:
            short var11 = 128;

            for (int var12 = 0; var12 < 128; var12++) {
               double var13 = (double)var12 / 127.0;
               float var15 = (this.field_41717.nextFloat() - 0.5F) * 0.2F;
               float var16 = (this.field_41717.nextFloat() - 0.5F) * 0.2F;
               float var17 = (this.field_41717.nextFloat() - 0.5F) * 0.2F;
               double var18 = class_9299.method_42794(var13, this.field_41767, this.method_37302())
                  + (this.field_41717.nextDouble() - 0.5) * (double)this.method_37086() * 2.0;
               double var20 = class_9299.method_42794(var13, this.field_41698, this.method_37309())
                  + this.field_41717.nextDouble() * (double)this.method_37074();
               double var22 = class_9299.method_42794(var13, this.field_41725, this.method_37156())
                  + (this.field_41717.nextDouble() - 0.5) * (double)this.method_37086() * 2.0;
               this.field_41768.method_43361(class_3090.field_15356, var18, var20, var22, (double)var15, (double)var16, (double)var17);
            }
            break;
         case 47:
            this.method_26464(this.method_26520(class_6943.field_35707));
            break;
         case 48:
            this.method_26464(this.method_26520(class_6943.field_35701));
            break;
         case 49:
            this.method_26464(this.method_26520(class_6943.field_35704));
            break;
         case 50:
            this.method_26464(this.method_26520(class_6943.field_35708));
            break;
         case 51:
            this.method_26464(this.method_26520(class_6943.field_35698));
            break;
         case 52:
            this.method_26464(this.method_26520(class_6943.field_35700));
            break;
         case 54:
            class_5864.method_26722(this);
            break;
         case 55:
            this.method_26514();
      }
   }

   private void method_26514() {
      ItemStack var3 = this.method_26520(class_6943.field_35701);
      this.method_37349(class_6943.field_35701, this.method_26520(class_6943.field_35707));
      this.method_37349(class_6943.field_35707, var3);
   }

   @Override
   public void method_37150() {
      this.method_37181(class_6199.field_31685, 4.0F);
   }

   public void method_26489() {
      int var3 = this.method_26473();
      if (!this.field_29599) {
         this.field_29666 = 0;
      } else {
         this.field_29666++;
         if (this.field_29666 >= var3) {
            this.field_29666 = 0;
            this.field_29599 = false;
         }
      }

      this.field_29606 = (float)this.field_29666 / (float)var3;
   }

   @Nullable
   public class_9747 method_26561(class_225 var1) {
      return this.method_26590().method_30808(var1);
   }

   public double method_26575(class_225 var1) {
      return this.method_26590().method_30814(var1);
   }

   public double method_26419(class_225 var1) {
      return this.method_26590().method_30805(var1);
   }

   public class_6711 method_26590() {
      return this.field_29603;
   }

   public class_2780 method_26550() {
      return class_2780.field_13574;
   }

   public ItemStack method_26446() {
      return this.method_26520(class_6943.field_35707);
   }

   public ItemStack method_26568() {
      return this.method_26520(class_6943.field_35701);
   }

   public boolean method_26443(class_2451 var1) {
      return this.method_26564(var1x -> var1x == var1);
   }

   public boolean method_26564(Predicate<class_2451> var1) {
      return var1.test(this.method_26446().method_27960()) || var1.test(this.method_26568().method_27960());
   }

   public ItemStack method_26617(class_2584 var1) {
      if (var1 != class_2584.field_12791) {
         if (var1 != class_2584.field_12794) {
            throw new IllegalArgumentException("Invalid hand " + var1);
         } else {
            return this.method_26520(class_6943.field_35701);
         }
      } else {
         return this.method_26520(class_6943.field_35707);
      }
   }

   public void method_26615(class_2584 var1, ItemStack var2) {
      if (var1 != class_2584.field_12791) {
         if (var1 != class_2584.field_12794) {
            throw new IllegalArgumentException("Invalid hand " + var1);
         }

         this.method_37349(class_6943.field_35701, var2);
      } else {
         this.method_37349(class_6943.field_35707, var2);
      }
   }

   public boolean method_26521(class_6943 var1) {
      return !this.method_26520(var1).method_28022();
   }

   @Override
   public abstract Iterable<ItemStack> method_37262();

   public abstract ItemStack method_26520(class_6943 var1);

   @Override
   public abstract void method_37349(class_6943 var1, ItemStack var2);

   public float method_26540() {
      Iterable var3 = this.method_37262();
      int var4 = 0;
      int var5 = 0;

      for (ItemStack var7 : var3) {
         if (!var7.method_28022()) {
            var5++;
         }

         var4++;
      }

      return var4 <= 0 ? 0.0F : (float)var5 / (float)var4;
   }

   @Override
   public void method_37140(boolean var1) {
      super.method_37140(var1);
      class_9747 var4 = this.method_26561(class_7331.field_37465);
      if (var4.method_44997(field_29647) != null) {
         var4.method_45004(field_29633);
      }

      if (var1) {
         var4.method_45011(field_29633);
      }
   }

   public float method_26439() {
      return 1.0F;
   }

   public float method_26547() {
      return !this.method_26449()
         ? (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F
         : (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.5F;
   }

   public boolean method_26468() {
      return this.method_26450();
   }

   @Override
   public void method_37183(Entity var1) {
      if (!this.method_26507()) {
         super.method_37183(var1);
      }
   }

   private void method_26433(Entity var1) {
      class_1343 var4;
      if (!var1.field_41751 && !this.field_41768.method_28262(var1.method_37075()).method_8360().method_29299(class_2351.field_11740)) {
         var4 = var1.method_37282(this);
      } else {
         var4 = new class_1343(var1.method_37302(), var1.method_37309() + (double)var1.method_37074(), var1.method_37156());
      }

      this.method_37254(var4.field_7336, var4.field_7333, var4.field_7334);
   }

   @Override
   public boolean method_37141() {
      return this.method_37135();
   }

   public float method_26538() {
      return 0.42F * this.method_37281();
   }

   public void method_26595() {
      float var3 = this.method_26538();
      if (this.isPotionActive(Effects.field_19730)) {
         var3 += 0.1F * (float)(this.method_26553(Effects.field_19730).method_10333() + 1);
      }

      class_1343 var4 = this.method_37098();
      class_2911 var5 = new class_2911(new class_1343(var4.field_7336, (double)var3, var4.field_7334));
      if (this instanceof class_5989) {
         SigmaMainClass.getInstance().getEventManager().call(var5);
      }

      if (!var5.method_29716()) {
         this.method_37215(var5.method_13317());
         if (this.method_37321() && !var5.method_13314()) {
            float var6 = this.field_41701 * (float) (Math.PI / 180.0);
            this.method_37215(
               this.method_37098().method_6214((double)(-class_9299.method_42818(var6) * 0.2F), 0.0, (double)(class_9299.method_42840(var6) * 0.2F))
            );
         }

         this.field_41763 = true;
      }
   }

   public void method_26411() {
      this.method_37215(this.method_37098().method_6214(0.0, -0.04F, 0.0));
   }

   public void method_26583(class_2307<class_2340> var1) {
      this.method_37215(this.method_37098().method_6214(0.0, 0.04F, 0.0));
   }

   public float method_26458() {
      return 0.8F;
   }

   public boolean method_26496(class_2340 var1) {
      return false;
   }

   public void method_26431(class_1343 var1) {
      if (this.method_26530() || this.method_37069()) {
         double var4 = 0.08;
         boolean var6 = this.method_37098().field_7333 <= 0.0;
         if (var6 && this.isPotionActive(Effects.field_19750)) {
            var4 = 0.01;
            this.field_41706 = 0.0F;
         }

         class_4774 var7 = this.field_41768.method_28258(this.method_37075());
         if (this.method_37285() && this.method_26498() && !this.method_26496(var7.method_22005())) {
            double var34 = this.method_37309();
            float var38 = !this.method_37321() ? this.method_26458() : 0.9F;
            float var39 = 0.02F;
            float var14 = (float)class_2931.method_13417(this);
            if (var14 > 3.0F) {
               var14 = 3.0F;
            }

            if (!this.field_41726) {
               var14 *= 0.5F;
            }

            if (var14 > 0.0F) {
               var38 += (0.54600006F - var38) * var14 / 3.0F;
               var39 += (this.method_26423() - var39) * var14 / 3.0F;
            }

            if (this.isPotionActive(Effects.field_19724)) {
               var38 = 0.96F;
            }

            this.method_37092(var39, var1);
            this.method_37226(class_7412.field_37839, this.method_37098());
            class_1343 var15 = this.method_37098();
            if (this.field_41744 && this.method_26505()) {
               var15 = new class_1343(var15.field_7336, 0.2, var15.field_7334);
            }

            this.method_37215(var15.method_6210((double)var38, 0.8F, (double)var38));
            class_1343 var16 = this.method_26579(var4, var6, this.method_37098());
            this.method_37215(var16);
            if (this.field_41744 && this.method_37159(var16.field_7336, var16.field_7333 + 0.6F - this.method_37309() + var34, var16.field_7334)) {
               this.method_37214(var16.field_7336, 0.3F, var16.field_7334);
            }
         } else if (this.method_37370() && this.method_26498() && !this.method_26496(var7.method_22005())) {
            double var10 = this.method_37309();
            this.method_37092(0.02F, var1);
            this.method_37226(class_7412.field_37839, this.method_37098());
            if (!(this.method_37284(class_6503.field_33095) <= this.method_37108())) {
               this.method_37215(this.method_37098().method_6209(0.5));
            } else {
               this.method_37215(this.method_37098().method_6210(0.5, 0.8F, 0.5));
               class_1343 var36 = this.method_26579(var4, var6, this.method_37098());
               this.method_37215(var36);
            }

            if (!this.method_37078()) {
               this.method_37215(this.method_37098().method_6214(0.0, -var4 / 4.0, 0.0));
            }

            class_1343 var37 = this.method_37098();
            if (this.field_41744 && this.method_37159(var37.field_7336, var37.field_7333 + 0.6F - this.method_37309() + var10, var37.field_7334)) {
               this.method_37214(var37.field_7336, 0.3F, var37.field_7334);
            }
         } else if (!this.method_26618()) {
            class_1331 var8 = this.method_37119();
            float var9 = this.field_41768.method_28262(var8).method_8360().method_29308();
            float var12 = !this.field_41726 ? 0.91F : var9 * 0.91F;
            class_1343 var13 = this.method_26588(var1, var9);
            double var29 = var13.field_7333;
            if (!this.isPotionActive(Effects.LevitationEffect)) {
               if (this.field_41768.field_33055 && !this.field_41768.method_22559(var8)) {
                  if (!(this.method_37309() > 0.0)) {
                     var29 = 0.0;
                  } else {
                     var29 = -0.1;
                  }
               } else if (!this.method_37078()) {
                  var29 -= var4;
               }
            } else {
               var29 += (0.05 * (double)(this.method_26553(Effects.LevitationEffect).method_10333() + 1) - var13.field_7333) * 0.2;
               this.field_41706 = 0.0F;
            }

            this.method_37214(var13.field_7336 * (double)var12, var29 * 0.98F, var13.field_7334 * (double)var12);
         } else {
            class_1343 var31 = this.method_37098();
            if (var31.field_7333 > -0.5) {
               this.field_41706 = 1.0F;
            }

            class_1343 var33 = this.method_37246();
            float var35 = this.field_41755 * (float) (Math.PI / 180.0);
            double var17 = Math.sqrt(var33.field_7336 * var33.field_7336 + var33.field_7334 * var33.field_7334);
            double var19 = Math.sqrt(method_37266(var31));
            double var21 = var33.method_6217();
            float var23 = class_9299.method_42840(var35);
            var23 = (float)((double)var23 * (double)var23 * Math.min(1.0, var21 / 0.4));
            var31 = this.method_37098().method_6214(0.0, var4 * (-1.0 + (double)var23 * 0.75), 0.0);
            if (var31.field_7333 < 0.0 && var17 > 0.0) {
               double var24 = var31.field_7333 * -0.1 * (double)var23;
               var31 = var31.method_6214(var33.field_7336 * var24 / var17, var24, var33.field_7334 * var24 / var17);
            }

            if (var35 < 0.0F && var17 > 0.0) {
               double var41 = var19 * (double)(-class_9299.method_42818(var35)) * 0.04;
               var31 = var31.method_6214(-var33.field_7336 * var41 / var17, var41 * 3.2, -var33.field_7334 * var41 / var17);
            }

            if (var17 > 0.0) {
               var31 = var31.method_6214(
                  (var33.field_7336 / var17 * var19 - var31.field_7336) * 0.1, 0.0, (var33.field_7334 / var17 * var19 - var31.field_7334) * 0.1
               );
            }

            this.method_37215(var31.method_6210(0.99F, 0.98F, 0.99F));
            this.method_37226(class_7412.field_37839, this.method_37098());
            if (this.field_41744 && !this.field_41768.field_33055) {
               double var42 = Math.sqrt(method_37266(this.method_37098()));
               double var26 = var19 - var42;
               float var28 = (float)(var26 * 10.0 - 3.0);
               if (var28 > 0.0F) {
                  this.method_37155(this.method_26587((int)var28), 1.0F, 1.0F);
                  this.method_37181(class_6199.field_31672, var28);
               }
            }

            if (this.field_41726 && !this.field_41768.field_33055) {
               this.method_37220(7, false);
            }
         }
      }

      this.method_26418(this, this instanceof class_674);
   }

   public void method_26418(class_5834 var1, boolean var2) {
      var1.field_29598 = var1.field_29643;
      double var5 = var1.method_37302() - var1.field_41767;
      double var7 = !var2 ? 0.0 : var1.method_37309() - var1.field_41698;
      double var9 = var1.method_37156() - var1.field_41725;
      float var11 = class_9299.method_42842(var5 * var5 + var7 * var7 + var9 * var9) * 4.0F;
      if (var11 > 1.0F) {
         var11 = 1.0F;
      }

      var1.field_29643 = var1.field_29643 + (var11 - var1.field_29643) * 0.4F;
      var1.field_29671 = var1.field_29671 + var1.field_29643;
   }

   public class_1343 method_26588(class_1343 var1, float var2) {
      this.method_37092(this.method_26506(var2), var1);
      this.method_37215(this.method_26589(this.method_37098()));
      this.method_37226(class_7412.field_37839, this.method_37098());
      class_1343 var5 = this.method_37098();
      if ((this.field_41744 || this.field_29654) && this.method_26505()) {
         var5 = new class_1343(var5.field_7336, 0.2, var5.field_7334);
      }

      return var5;
   }

   public class_1343 method_26579(double var1, boolean var3, class_1343 var4) {
      if (!this.method_37078() && !this.method_37321()) {
         double var7;
         if (var3 && Math.abs(var4.field_7333 - 0.005) >= 0.003 && Math.abs(var4.field_7333 - var1 / 16.0) < 0.003) {
            var7 = -0.003;
         } else {
            var7 = var4.field_7333 - var1 / 16.0;
         }

         return new class_1343(var4.field_7336, var7, var4.field_7334);
      } else {
         return var4;
      }
   }

   private class_1343 method_26589(class_1343 var1) {
      if (this.method_26505()) {
         this.field_41706 = 0.0F;
         float var4 = 0.15F;
         double var5 = class_9299.method_42827(var1.field_7336, -0.15F, 0.15F);
         double var7 = class_9299.method_42827(var1.field_7334, -0.15F, 0.15F);
         double var9 = Math.max(var1.field_7333, -0.15F);
         if (var9 < 0.0 && !this.method_26603().method_8350(class_4783.field_23348) && this.method_26492() && this instanceof class_704) {
            var9 = 0.0;
         }

         var1 = new class_1343(var5, var9, var7);
      }

      return var1;
   }

   private float method_26506(float var1) {
      return !this.field_41726 ? this.field_29674 : this.method_26423() * (0.21600002F / (var1 * var1 * var1));
   }

   public float method_26423() {
      return this.field_29655;
   }

   public void method_26461(float var1) {
      this.field_29655 = var1;
   }

   public boolean method_26442(Entity var1) {
      this.method_26510(var1);
      return false;
   }

   @Override
   public void method_37123() {
      super.method_37123();
      this.method_26430();
      this.method_26572();
      if (!this.field_41768.field_33055) {
         int var11 = this.method_26569();
         if (var11 > 0) {
            if (this.field_29619 <= 0) {
               this.field_29619 = 20 * (30 - var11);
            }

            this.field_29619--;
            if (this.field_29619 <= 0) {
               this.method_26508(var11 - 1);
            }
         }

         int var12 = this.method_26619();
         if (var12 > 0) {
            if (this.field_29646 <= 0) {
               this.field_29646 = 20 * (30 - var12);
            }

            this.field_29646--;
            if (this.field_29646 <= 0) {
               this.method_26504(var12 - 1);
            }
         }

         this.method_26416();
         if (this.field_41697 % 20 == 0) {
            this.method_26476().method_15868();
         }

         if (!this.field_41760) {
            boolean var13 = this.isPotionActive(Effects.field_19722);
            if (this.method_37385(6) != var13) {
               this.method_37220(6, var13);
            }
         }

         if (this.method_26507() && !this.method_26415()) {
            this.method_26557();
         }
      }

      this.method_26606();
      double var3 = this.method_37302() - this.field_41767;
      double var5 = this.method_37156() - this.field_41725;
      float var7 = (float)(var3 * var3 + var5 * var5);
      float var8 = this.field_29605;
      float var9 = 0.0F;
      this.field_29639 = this.field_29660;
      float var10 = 0.0F;
      if (var7 > 0.0025000002F) {
         var10 = 1.0F;
         var9 = (float)Math.sqrt((double)var7) * 3.0F;
         float var14 = (float)class_9299.method_42821(var5, var3) * (180.0F / (float)Math.PI) - 90.0F;
         float var15 = class_9299.method_42804(class_9299.method_42810(this.field_41701) - var14);
         if (95.0F < var15 && var15 < 265.0F) {
            var8 = var14 - 180.0F;
         } else {
            var8 = var14;
         }
      }

      if (this.field_29606 > 0.0F) {
         var8 = this.field_41701;
      }

      if (!this.field_41726) {
         var10 = 0.0F;
      }

      this.field_29660 = this.field_29660 + (var10 - this.field_29660) * 0.3F;
      this.field_41768.method_29599().startSection("headTurn");
      var9 = this.method_26582(var8, var9);
      this.field_41768.method_29599().endSection();
      this.field_41768.method_29599().startSection("rangeChecks");

      while (this.field_41701 - this.field_41711 < -180.0F) {
         this.field_41711 -= 360.0F;
      }

      while (this.field_41701 - this.field_41711 >= 180.0F) {
         this.field_41711 += 360.0F;
      }

      while (this.field_29605 - this.field_29611 < -180.0F) {
         this.field_29611 -= 360.0F;
      }

      while (this.field_29605 - this.field_29611 >= 180.0F) {
         this.field_29611 += 360.0F;
      }

      while (this.field_41755 - this.field_41762 < -180.0F) {
         this.field_41762 -= 360.0F;
      }

      while (this.field_41755 - this.field_41762 >= 180.0F) {
         this.field_41762 += 360.0F;
      }

      while (this.field_29618 - this.field_29657 < -180.0F) {
         this.field_29657 -= 360.0F;
      }

      while (this.field_29618 - this.field_29657 >= 180.0F) {
         this.field_29657 += 360.0F;
      }

      this.field_41768.method_29599().endSection();
      this.field_29672 += var9;
      if (!this.method_26618()) {
         this.field_29661 = 0;
      } else {
         this.field_29661++;
      }

      if (this.method_26507()) {
         this.field_41755 = 0.0F;
      }
   }

   private void method_26416() {
      Map var3 = this.method_26435();
      if (var3 != null) {
         this.method_26559(var3);
         if (!var3.isEmpty()) {
            this.method_26543(var3);
         }
      }
   }

   @Nullable
   private Map<class_6943, ItemStack> method_26435() {
      EnumMap var3 = null;

      for (class_6943 var7 : class_6943.values()) {
         ItemStack var8;
         switch (var7.method_31772()) {
            case field_37218:
               var8 = this.method_26578(var7);
               break;
            case field_37219:
               var8 = this.method_26545(var7);
               break;
            default:
               continue;
         }

         ItemStack var9 = this.method_26520(var7);
         if (!ItemStack.method_27982(var9, var8)) {
            if (var3 == null) {
               var3 = Maps.newEnumMap(class_6943.class);
            }

            var3.put(var7, var9);
            if (!var8.method_28022()) {
               this.method_26590().method_30809(var8.method_28034(var7));
            }

            if (!var9.method_28022()) {
               this.method_26590().method_30802(var9.method_28034(var7));
            }
         }
      }

      return var3;
   }

   private void method_26559(Map<class_6943, ItemStack> var1) {
      ItemStack var4 = (ItemStack)var1.get(class_6943.field_35707);
      ItemStack var5 = (ItemStack)var1.get(class_6943.field_35701);
      if (var4 != null
         && var5 != null
         && ItemStack.method_27982(var4, this.method_26578(class_6943.field_35701))
         && ItemStack.method_27982(var5, this.method_26578(class_6943.field_35707))) {
         ((class_6331)this.field_41768).method_28945().method_10200(this, new class_295(this, (byte)55));
         var1.remove(class_6943.field_35707);
         var1.remove(class_6943.field_35701);
         this.method_26453(class_6943.field_35707, var4.method_27973());
         this.method_26453(class_6943.field_35701, var5.method_27973());
      }
   }

   private void method_26543(Map<class_6943, ItemStack> var1) {
      ArrayList var4 = Lists.newArrayListWithCapacity(var1.size());
      var1.forEach((var2, var3) -> {
         ItemStack var6 = var3.method_27973();
         var4.add(Pair.of(var2, var6));
         switch (var2.method_31772()) {
            case field_37218:
               this.method_26453(var2, var6);
               break;
            case field_37219:
               this.method_26481(var2, var6);
         }
      });
      ((class_6331)this.field_41768).method_28945().method_10200(this, new class_9014(this.method_37145(), var4));
   }

   private ItemStack method_26545(class_6943 var1) {
      return this.field_29613.get(var1.method_31767());
   }

   private void method_26481(class_6943 var1, ItemStack var2) {
      this.field_29613.set(var1.method_31767(), var2);
   }

   private ItemStack method_26578(class_6943 var1) {
      return this.field_29632.get(var1.method_31767());
   }

   private void method_26453(class_6943 var1, ItemStack var2) {
      this.field_29632.set(var1.method_31767(), var2);
   }

   public float method_26582(float var1, float var2) {
      float var5 = class_9299.method_42810(var1 - this.field_29605);
      this.field_29605 += var5 * 0.3F;
      float var6 = class_9299.method_42810(this.field_41701 - this.field_29605);
      boolean var7 = var6 < -90.0F || var6 >= 90.0F;
      if (var6 < -75.0F) {
         var6 = -75.0F;
      }

      if (var6 >= 75.0F) {
         var6 = 75.0F;
      }

      this.field_29605 = this.field_41701 - var6;
      if (var6 * var6 > 2500.0F) {
         this.field_29605 += var6 * 0.2F;
      }

      if (var7) {
         var2 *= -1.0F;
      }

      return var2;
   }

   public void method_26606() {
      if (this.field_29600 > 0) {
         this.field_29600--;
      }

      if (this.method_37069()) {
         this.field_29612 = 0;
         this.method_37223(this.method_37302(), this.method_37309(), this.method_37156());
      }

      if (this.field_29612 <= 0) {
         if (!this.method_26530()) {
            this.method_37215(this.method_37098().method_6209(0.98));
         }
      } else {
         double var10 = this.method_37302() + (this.field_29597 - this.method_37302()) / (double)this.field_29612;
         double var12 = this.method_37309() + (this.field_29609 - this.method_37309()) / (double)this.field_29612;
         double var14 = this.method_37156() + (this.field_29650 - this.method_37156()) / (double)this.field_29612;
         double var16 = class_9299.method_42809(this.field_29604 - (double)this.field_41701);
         this.field_41701 = (float)((double)this.field_41701 + var16 / (double)this.field_29612);
         this.field_41755 = (float)((double)this.field_41755 + (this.field_29625 - (double)this.field_41755) / (double)this.field_29612);
         this.field_29612--;
         this.method_37256(var10, var12, var14);
         this.method_37395(this.field_41701, this.field_41755);
      }

      if (this.field_29653 > 0) {
         this.field_29618 = (float)((double)this.field_29618 + class_9299.method_42809(this.field_29614 - (double)this.field_29618) / (double)this.field_29653);
         this.field_29653--;
      }

      class_1343 var3 = this.method_37098();
      double var4 = var3.field_7336;
      double var6 = var3.field_7333;
      double var8 = var3.field_7334;
      if (Math.abs(var3.field_7336) < 0.003) {
         var4 = 0.0;
      }

      if (Math.abs(var3.field_7333) < 0.003) {
         var6 = 0.0;
      }

      if (Math.abs(var3.field_7334) < 0.003) {
         var8 = 0.0;
      }

      this.method_37214(var4, var6, var8);
      this.field_41768.method_29599().startSection("ai");
      if (!this.method_26468()) {
         if (this.method_26530()) {
            this.field_41768.method_29599().startSection("newAi");
            this.method_26417();
            this.field_41768.method_29599().endSection();
         }
      } else {
         this.field_29654 = false;
         this.field_29676 = 0.0F;
         this.field_29673 = 0.0F;
      }

      this.field_41768.method_29599().endSection();
      this.field_41768.method_29599().startSection("jump");
      if (this.field_29654 && this.method_26498()) {
         double var18;
         if (!this.method_37370()) {
            var18 = this.method_37284(class_6503.field_33094);
         } else {
            var18 = this.method_37284(class_6503.field_33095);
         }

         boolean var20 = this.method_37285() && var18 > 0.0;
         double var21 = this.method_37108();
         if (!var20 || this.field_41726 && !(var18 > var21)) {
            if (!this.method_37370() || this.field_41726 && !(var18 > var21)) {
               if ((this.field_41726 || var20 && var18 <= var21) && this.field_29600 == 0) {
                  this.method_26595();
                  this.field_29600 = 10;
               }
            } else {
               this.method_26583(class_6503.field_33095);
            }
         } else {
            this.method_26583(class_6503.field_33094);
         }
      } else {
         this.field_29600 = 0;
      }

      this.field_41768.method_29599().endSection();
      this.field_41768.method_29599().startSection("travel");
      this.field_29676 *= 0.98F;
      this.field_29673 *= 0.98F;
      this.method_26571();
      class_4092 var23 = this.method_37241();
      this.method_26431(new class_1343((double)this.field_29676, (double)this.field_29651, (double)this.field_29673));
      this.field_41768.method_29599().endSection();
      this.field_41768.method_29599().startSection("push");
      if (this.field_29630 > 0) {
         this.field_29630--;
         this.method_26542(var23, this.method_37241());
      }

      this.method_26428();
      this.field_41768.method_29599().endSection();
      if (!this.field_41768.field_33055 && this.method_26537() && this.method_37110()) {
         this.method_37181(class_6199.field_31671, 1.0F);
      }
   }

   public boolean method_26537() {
      return false;
   }

   private void method_26571() {
      boolean var3 = this.method_37385(7);
      if (var3 && !this.field_41726 && !this.method_37070() && !this.isPotionActive(Effects.LevitationEffect)) {
         ItemStack var4 = this.method_26520(class_6943.field_35708);
         if (var4.method_27960() == class_4897.field_24503 && class_3286.method_15061(var4)) {
            var3 = true;
            if (!this.field_41768.field_33055 && (this.field_29661 + 1) % 20 == 0) {
               var4.method_28003(1, this, var0 -> var0.method_26448(class_6943.field_35708));
            }
         } else {
            var3 = false;
         }
      } else {
         var3 = false;
      }

      if (!this.field_41768.field_33055) {
         this.method_37220(7, var3);
      }
   }

   public void method_26417() {
   }

   public void method_26428() {
      List var3 = this.field_41768.method_25867(this, this.method_37241(), class_3572.method_16616(this));
      if (!var3.isEmpty()) {
         int var4 = this.field_41768.method_29537().method_1295(class_291.field_1027);
         if (var4 > 0 && var3.size() > var4 - 1 && this.field_41717.nextInt(4) == 0) {
            int var5 = 0;

            for (int var6 = 0; var6 < var3.size(); var6++) {
               if (!((Entity)var3.get(var6)).method_37070()) {
                  var5++;
               }
            }

            if (var5 > var4 - 1) {
               this.method_37181(class_6199.field_31676, 6.0F);
            }
         }

         for (int var7 = 0; var7 < var3.size(); var7++) {
            Entity var8 = (Entity)var3.get(var7);
            this.method_26596(var8);
         }
      }
   }

   public void method_26542(class_4092 var1, class_4092 var2) {
      class_4092 var5 = var1.method_18905(var2);
      List var6 = this.field_41768.method_25870(this, var5);
      if (var6.isEmpty()) {
         if (this.field_41744) {
            this.field_29630 = 0;
         }
      } else {
         for (int var7 = 0; var7 < var6.size(); var7++) {
            Entity var8 = (Entity)var6.get(var7);
            if (var8 instanceof class_5834) {
               this.method_26539((class_5834)var8);
               this.field_29630 = 0;
               this.method_37215(this.method_37098().method_6209(-0.2));
               break;
            }
         }
      }

      if (!this.field_41768.field_33055 && this.field_29630 <= 0) {
         this.method_26438(4, false);
      }
   }

   public void method_26596(Entity var1) {
      var1.method_37183(this);
   }

   public void method_26539(class_5834 var1) {
   }

   public void method_26445(int var1) {
      this.field_29630 = var1;
      if (!this.field_41768.field_33055) {
         this.method_26438(4, true);
      }
   }

   public boolean method_26600() {
      return (this.field_41735.<Byte>method_36640(field_29638) & 4) != 0;
   }

   @Override
   public void method_37390() {
      Entity var3 = this.method_37243();
      super.method_37390();
      if (var3 != null && var3 != this.method_37243() && !this.field_41768.field_33055) {
         this.method_26433(var3);
      }
   }

   @Override
   public void method_37189() {
      super.method_37189();
      this.field_29639 = this.field_29660;
      this.field_29660 = 0.0F;
      this.field_41706 = 0.0F;
   }

   @Override
   public void method_37318(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.field_29597 = var1;
      this.field_29609 = var3;
      this.field_29650 = var5;
      this.field_29604 = (double)var7;
      this.field_29625 = (double)var8;
      this.field_29612 = var9;
   }

   @Override
   public void method_37257(float var1, int var2) {
      this.field_29614 = (double)var1;
      this.field_29653 = var2;
   }

   public void method_26528(boolean var1) {
      this.field_29654 = var1;
   }

   public void method_26562(class_91 var1) {
      class_704 var4 = var1.method_253() == null ? null : this.field_41768.method_25862(var1.method_253());
      if (var4 instanceof class_9359) {
         class_8807.field_45055.method_14612((class_9359)var4, var1.method_264(), this);
      }
   }

   public void method_26467(Entity var1, int var2) {
      if (!var1.field_41751 && !this.field_41768.field_33055 && (var1 instanceof class_91 || var1 instanceof class_6749 || var1 instanceof class_5614)) {
         ((class_6331)this.field_41768).method_28945().method_10200(var1, new class_4476(var1.method_37145(), this.method_37145(), var2));
      }
   }

   public boolean method_26420(Entity var1) {
      class_1343 var4 = new class_1343(this.method_37302(), this.method_37388(), this.method_37156());
      class_1343 var5 = new class_1343(var1.method_37302(), var1.method_37388(), var1.method_37156());
      return this.field_41768.method_28265(new class_972(var4, var5, class_3132.field_15553, class_9583.field_48747, this)).method_33990()
         == class_1430.field_7721;
   }

   @Override
   public float method_37291(float var1) {
      return var1 != 1.0F ? class_9299.method_42795(var1, this.field_29657, this.field_29618) : this.field_29618;
   }

   public float method_26533(float var1) {
      float var4 = this.field_29606 - this.field_29667;
      if (var4 < 0.0F) {
         var4++;
      }

      return this.field_29667 + var4 * var1;
   }

   public boolean method_26530() {
      return !this.field_41768.field_33055;
   }

   @Override
   public boolean method_37167() {
      return !this.field_41751;
   }

   @Override
   public boolean method_37177() {
      return this.method_37330() && !this.method_37221() && !this.method_26505();
   }

   @Override
   public void method_37138() {
      this.field_41743 = this.field_41717.nextDouble() >= this.method_26575(class_7331.field_37463);
   }

   @Override
   public float method_37267() {
      return this.field_29618;
   }

   @Override
   public void method_37161(float var1) {
      this.field_29618 = var1;
   }

   @Override
   public void method_37090(float var1) {
      this.field_29605 = var1;
   }

   @Override
   public class_1343 method_37375(class_9249 var1, class_8623 var2) {
      return method_26437(super.method_37375(var1, var2));
   }

   public static class_1343 method_26437(class_1343 var0) {
      return new class_1343(var0.field_7336, var0.field_7333, 0.0);
   }

   public float method_26493() {
      return this.field_29622;
   }

   public void method_26460(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      this.field_29622 = var1;
   }

   public void method_26546() {
   }

   public void method_26592() {
   }

   public void method_26478() {
      this.field_29628 = true;
   }

   public abstract class_1736 method_26432();

   public boolean method_26554() {
      return (this.field_41735.<Byte>method_36640(field_29638) & 1) > 0;
   }

   public class_2584 method_26500() {
      return (this.field_41735.<Byte>method_36640(field_29638) & 2) <= 0 ? class_2584.field_12791 : class_2584.field_12794;
   }

   private void method_26430() {
      if (this.method_26554()) {
         if (!ItemStack.method_27984(this.method_26617(this.method_26500()), this.field_29668)) {
            this.method_26529();
         } else {
            this.field_29668 = this.method_26617(this.method_26500());
            this.field_29668.method_28033(this.field_41768, this, this.method_26466());
            if (this.method_26459()) {
               this.method_26515(this.field_29668, 5);
            }

            if (--this.field_29656 == 0 && !this.field_41768.field_33055 && !this.field_29668.method_28028()) {
               this.method_26527();
            }
         }
      }
   }

   private boolean method_26459() {
      int var3 = this.method_26466();
      class_8341 var4 = this.field_29668.method_27960().method_11227();
      boolean var5 = var4 != null && var4.method_38405();
      var5 |= var3 <= this.field_29668.method_28004() - 7;
      return var5 && var3 % 4 == 0;
   }

   private void method_26572() {
      this.field_29624 = this.field_29670;
      if (!this.method_37297()) {
         this.field_29670 = Math.max(0.0F, this.field_29670 - 0.09F);
      } else {
         this.field_29670 = Math.min(1.0F, this.field_29670 + 0.09F);
      }
   }

   public void method_26438(int var1, boolean var2) {
      int var5 = this.field_41735.<Byte>method_36640(field_29638);
      if (!var2) {
         var5 &= ~var1;
      } else {
         var5 |= var1;
      }

      this.field_41735.method_36633(field_29638, (byte)var5);
   }

   public void method_26462(class_2584 var1) {
      ItemStack var4 = this.method_26617(var1);
      if (!var4.method_28022() && !this.method_26554()) {
         this.field_29668 = var4;
         this.field_29656 = var4.method_28004();
         if (!this.field_41768.field_33055) {
            this.method_26438(1, true);
            this.method_26438(2, var1 == class_2584.field_12794);
         }
      }
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      super.method_37191(var1);
      if (!field_29621.equals(var1)) {
         if (field_29638.equals(var1) && this.field_41768.field_33055) {
            if (this.method_26554() && this.field_29668.method_28022()) {
               this.field_29668 = this.method_26617(this.method_26500());
               if (!this.field_29668.method_28022()) {
                  this.field_29656 = this.field_29668.method_28004();
               }
            } else if (!this.method_26554() && !this.field_29668.method_28022()) {
               this.field_29668 = ItemStack.EMPTY;
               this.field_29656 = 0;
            }
         }
      } else if (this.field_41768.field_33055) {
         this.method_26518().ifPresent(this::method_26584);
      }
   }

   @Override
   public void method_37332(class_6139 var1, class_1343 var2) {
      super.method_37332(var1, var2);
      this.field_29657 = this.field_29618;
      this.field_29605 = this.field_29618;
      this.field_29611 = this.field_29605;
   }

   public void method_26515(ItemStack var1, int var2) {
      if (!var1.method_28022() && this.method_26554()) {
         if (var1.method_27952() == class_6209.field_31739) {
            this.method_37155(this.method_26566(var1), 0.5F, this.field_41768.field_33033.nextFloat() * 0.1F + 0.9F);
         }

         if (var1.method_27952() == class_6209.field_31732) {
            this.method_26519(var1, var2);
            this.method_37155(
               this.method_26484(var1),
               0.5F + 0.5F * (float)this.field_41717.nextInt(2),
               (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F
            );
         }
      }
   }

   private void method_26519(ItemStack var1, int var2) {
      for (int var5 = 0; var5 < var2; var5++) {
         class_1343 var6 = new class_1343(((double)this.field_41717.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         var6 = var6.method_6212(-this.field_41755 * (float) (Math.PI / 180.0));
         var6 = var6.method_6192(-this.field_41701 * (float) (Math.PI / 180.0));
         double var7 = (double)(-this.field_41717.nextFloat()) * 0.6 - 0.3;
         class_1343 var9 = new class_1343(((double)this.field_41717.nextFloat() - 0.5) * 0.3, var7, 0.6);
         var9 = var9.method_6212(-this.field_41755 * (float) (Math.PI / 180.0));
         var9 = var9.method_6192(-this.field_41701 * (float) (Math.PI / 180.0));
         var9 = var9.method_6214(this.method_37302(), this.method_37388(), this.method_37156());
         this.field_41768
            .method_43361(
               new class_8661(class_3090.field_15351, var1),
               var9.field_7336,
               var9.field_7333,
               var9.field_7334,
               var6.field_7336,
               var6.field_7333 + 0.05,
               var6.field_7334
            );
      }
   }

   public void method_26527() {
      class_2584 var3 = this.method_26500();
      if (this.field_29668.equals(this.method_26617(var3))) {
         if (!this.field_29668.method_28022() && this.method_26554()) {
            this.method_26515(this.field_29668, 16);
            ItemStack var4 = this.field_29668.method_27971(this.field_41768, this);
            if (var4 != this.field_29668) {
               this.method_26615(var3, var4);
            }

            this.method_26529();
         }
      } else {
         this.method_26474();
      }
   }

   public ItemStack method_26576() {
      return this.field_29668;
   }

   public int method_26466() {
      return this.field_29656;
   }

   public int method_26613() {
      return !this.method_26554() ? 0 : this.field_29668.method_28004() - this.method_26466();
   }

   public void method_26474() {
      if (!this.field_29668.method_28022()) {
         this.field_29668.method_27989(this.field_41768, this, this.method_26466());
         if (this.field_29668.method_28028()) {
            this.method_26430();
         }
      }

      this.method_26529();
   }

   public void method_26529() {
      if (!this.field_41768.field_33055) {
         this.method_26438(1, false);
      }

      this.field_29668 = ItemStack.EMPTY;
      this.field_29656 = 0;
   }

   public boolean method_26463() {
      if (this.method_26554() && !this.field_29668.method_28022()) {
         class_2451 var3 = this.field_29668.method_27960();
         return var3.method_11233(this.field_29668) == class_6209.field_31740 ? var3.method_11230(this.field_29668) - this.field_29656 >= 5 : false;
      } else {
         return false;
      }
   }

   public boolean method_26492() {
      return this.method_37252();
   }

   public boolean method_26618() {
      return this.method_37385(7);
   }

   @Override
   public boolean method_37297() {
      return super.method_37297() || !this.method_26618() && this.method_37102() == class_7653.field_38889;
   }

   public int method_26422() {
      return this.field_29661;
   }

   public boolean method_26499(double var1, double var3, double var5, boolean var7) {
      double var10 = this.method_37302();
      double var12 = this.method_37309();
      double var14 = this.method_37156();
      double var16 = var3;
      boolean var18 = false;
      class_1331 var19 = new class_1331(var1, var3, var5);
      World var20 = this.field_41768;
      if (var20.method_22559(var19)) {
         boolean var21 = false;

         while (!var21 && var19.method_12165() > 0) {
            class_1331 var22 = var19.method_6100();
            class_2522 var23 = var20.method_28262(var22);
            if (!var23.method_8362().method_24502()) {
               var16--;
               var19 = var22;
            } else {
               var21 = true;
            }
         }

         if (var21) {
            this.method_37254(var1, var16, var5);
            if (var20.method_6682(this) && !var20.method_22550(this.method_37241())) {
               var18 = true;
            }
         }
      }

      if (var18) {
         if (var7) {
            var20.method_29587(this, (byte)46);
         }

         if (this instanceof class_4612) {
            ((class_4612)this).method_26927().method_5620();
         }

         return true;
      } else {
         this.method_37254(var10, var12, var14);
         return false;
      }
   }

   public boolean method_26611() {
      return true;
   }

   public boolean method_26556() {
      return true;
   }

   public void method_26424(class_1331 var1, boolean var2) {
   }

   public boolean method_26612(ItemStack var1) {
      return false;
   }

   @Override
   public Packet<?> method_37142() {
      return new class_4228(this);
   }

   @Override
   public class_6097 method_37190(class_7653 var1) {
      return var1 != class_7653.field_38886 ? super.method_37190(var1).method_27942(this.method_26479()) : field_29629;
   }

   public ImmutableList<class_7653> method_26454() {
      return ImmutableList.of(class_7653.field_38885);
   }

   public class_4092 method_26549(class_7653 var1) {
      class_6097 var4 = this.method_37190(var1);
      return new class_4092(
         (double)(-var4.field_31199 / 2.0F),
         0.0,
         (double)(-var4.field_31199 / 2.0F),
         (double)(var4.field_31199 / 2.0F),
         (double)var4.field_31200,
         (double)(var4.field_31199 / 2.0F)
      );
   }

   public Optional<class_1331> method_26518() {
      return this.field_41735.<Optional<class_1331>>method_36640(field_29621);
   }

   public void method_26601(class_1331 var1) {
      this.field_41735.method_36633(field_29621, Optional.<class_1331>of(var1));
   }

   public void method_26570() {
      this.field_41735.method_36633(field_29621, Optional.<class_1331>empty());
   }

   public boolean method_26507() {
      return this.method_26518().isPresent();
   }

   public void method_26470(class_1331 var1) {
      if (this.method_37070()) {
         this.method_37390();
      }

      class_2522 var4 = this.field_41768.method_28262(var1);
      if (var4.method_8360() instanceof class_3633) {
         this.field_41768.method_7513(var1, var4.method_10308(class_3633.field_17728, Boolean.valueOf(true)), 3);
      }

      this.method_37356(class_7653.field_38886);
      this.method_26584(var1);
      this.method_26601(var1);
      this.method_37215(class_1343.field_7335);
      this.field_41763 = true;
   }

   private void method_26584(class_1331 var1) {
      this.method_37256((double)var1.method_12173() + 0.5, (double)var1.method_12165() + 0.6875, (double)var1.method_12185() + 0.5);
   }

   private boolean method_26415() {
      return this.method_26518().<Boolean>map(var1 -> this.field_41768.method_28262(var1).method_8360() instanceof class_3633).orElse(false);
   }

   public void method_26557() {
      this.method_26518().filter(this.field_41768::method_22559).ifPresent(var1 -> {
         class_2522 var4 = this.field_41768.method_28262(var1);
         if (var4.method_8360() instanceof class_3633) {
            this.field_41768.method_7513(var1, var4.method_10308(class_3633.field_17728, Boolean.valueOf(false)), 3);
            class_1343 var5 = class_3633.method_16932(this.method_37387(), this.field_41768, var1, this.field_41701).orElseGet(() -> {
               class_1331 var3x = var1.method_6081();
               return new class_1343((double)var3x.method_12173() + 0.5, (double)var3x.method_12165() + 0.1, (double)var3x.method_12185() + 0.5);
            });
            class_1343 var6 = class_1343.method_6200(var1).method_6194(var5).method_6213();
            float var7 = (float)class_9299.method_42809(class_9299.method_42821(var6.field_7334, var6.field_7336) * 180.0F / (float)Math.PI - 90.0);
            this.method_37256(var5.field_7336, var5.field_7333, var5.field_7334);
            this.field_41701 = var7;
            this.field_41755 = 0.0F;
         }
      });
      class_1343 var3 = this.method_37245();
      this.method_37356(class_7653.field_38885);
      this.method_37256(var3.field_7336, var3.field_7333, var3.field_7334);
      this.method_26570();
   }

   @Nullable
   public Direction method_26408() {
      class_1331 var3 = this.method_26518().orElse((class_1331)null);
      return var3 == null ? null : class_3633.method_16936(this.field_41768, var3);
   }

   @Override
   public boolean method_37153() {
      return !this.method_26507() && super.method_37153();
   }

   @Override
   public final float method_37279(class_7653 var1, class_6097 var2) {
      return var1 != class_7653.field_38886 ? this.method_26425(var1, var2) : 0.2F;
   }

   public float method_26425(class_7653 var1, class_6097 var2) {
      return super.method_37279(var1, var2);
   }

   public ItemStack method_26475(ItemStack var1) {
      return ItemStack.EMPTY;
   }

   public ItemStack method_26426(World var1, ItemStack var2) {
      if (var2.method_28013()) {
         var1.method_29528(
            (class_704)null,
            this.method_37302(),
            this.method_37309(),
            this.method_37156(),
            this.method_26484(var2),
            class_562.field_3328,
            1.0F,
            1.0F + (var1.field_33033.nextFloat() - var1.field_33033.nextFloat()) * 0.4F
         );
         this.method_26497(var2, var1, this);
         if (!(this instanceof class_704) || !((class_704)this).field_3876.isCreativeMode) {
            var2.method_27970(1);
         }
      }

      return var2;
   }

   private void method_26497(ItemStack var1, World var2, class_5834 var3) {
      class_2451 var6 = var1.method_27960();
      if (var6.method_11247()) {
         for (Pair var8 : var6.method_11227().method_38408()) {
            if (!var2.field_33055 && var8.getFirst() != null && var2.field_33033.nextFloat() < (Float)var8.getSecond()) {
               var3.method_26558(new class_2250((class_2250)var8.getFirst()));
            }
         }
      }
   }

   private static byte method_26605(class_6943 var0) {
      switch (var0) {
         case field_35707:
            return 47;
         case field_35701:
            return 48;
         case field_35704:
            return 49;
         case field_35708:
            return 50;
         case field_35700:
            return 52;
         case field_35698:
            return 51;
         default:
            return 47;
      }
   }

   public void method_26448(class_6943 var1) {
      this.field_41768.method_29587(this, method_26605(var1));
   }

   public void method_26447(class_2584 var1) {
      this.method_26448(var1 != class_2584.field_12791 ? class_6943.field_35701 : class_6943.field_35707);
   }

   @Override
   public class_4092 method_37210() {
      if (this.method_26520(class_6943.field_35704).method_27960() != class_4897.field_24540) {
         return super.method_37210();
      } else {
         float var3 = 0.5F;
         return this.method_37241().method_18899(0.5, 0.5, 0.5);
      }
   }
}
