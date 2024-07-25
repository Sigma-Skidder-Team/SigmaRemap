package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2452 {
   private static final ITextComponent field_12203 = new TranslationTextComponent("event.minecraft.raid");
   private static final ITextComponent field_12184 = new TranslationTextComponent("event.minecraft.raid.victory");
   private static final ITextComponent field_12199 = new TranslationTextComponent("event.minecraft.raid.defeat");
   private static final ITextComponent field_12194 = field_12203.deepCopy().appendString(field_12192[15]).append(field_12184);
   private static final ITextComponent field_12196 = field_12203.deepCopy().appendString(field_12192[15]).append(field_12199);
   private final Map<Integer, class_4040> field_12191 = Maps.newHashMap();
   private final Map<Integer, Set<class_4040>> field_12187 = Maps.newHashMap();
   private final Set<UUID> field_12190 = Sets.newHashSet();
   private long field_12183;
   private class_1331 field_12185;
   private final class_6331 field_12189;
   private boolean field_12188;
   private final int field_12180;
   private float field_12201;
   private int field_12202;
   private boolean field_12200;
   private int field_12182;
   private final class_495 field_12186 = new class_495(field_12203, class_1062.field_5828, class_2976.field_14629);
   private int field_12178;
   private int field_12197;
   private final Random field_12181 = new Random();
   private final int field_12195;
   private class_4264 field_12198;
   private int field_12179;
   private Optional<class_1331> field_12193 = Optional.<class_1331>empty();

   public class_2452(int var1, class_6331 var2, class_1331 var3) {
      this.field_12180 = var1;
      this.field_12189 = var2;
      this.field_12200 = true;
      this.field_12197 = 300;
      this.field_12186.method_43459(0.0F);
      this.field_12185 = var3;
      this.field_12195 = this.method_11302(var2.method_43370());
      this.field_12198 = class_4264.field_20669;
   }

   public class_2452(class_6331 var1, class_5734 var2) {
      this.field_12189 = var1;
      this.field_12180 = var2.method_25947("Id");
      this.field_12188 = var2.method_25933("Started");
      this.field_12200 = var2.method_25933("Active");
      this.field_12183 = var2.method_25948("TicksActive");
      this.field_12202 = var2.method_25947("BadOmenLevel");
      this.field_12182 = var2.method_25947("GroupsSpawned");
      this.field_12197 = var2.method_25947("PreRaidTicks");
      this.field_12178 = var2.method_25947("PostRaidTicks");
      this.field_12201 = var2.method_25955("TotalHealth");
      this.field_12185 = new class_1331(var2.method_25947("CX"), var2.method_25947("CY"), var2.method_25947("CZ"));
      this.field_12195 = var2.method_25947("NumGroups");
      this.field_12198 = class_4264.method_19861(var2.method_25965("Status"));
      this.field_12190.clear();
      if (var2.method_25939("HeroesOfTheVillage", 9)) {
         class_3416 var5 = var2.method_25927("HeroesOfTheVillage", 11);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            this.field_12190.add(class_4338.method_20183(var5.get(var6)));
         }
      }
   }

   public boolean method_11259() {
      return this.method_11303() || this.method_11295();
   }

   public boolean method_11266() {
      return this.method_11291() && this.method_11268() == 0 && this.field_12197 > 0;
   }

   public boolean method_11291() {
      return this.field_12182 > 0;
   }

   public boolean method_11277() {
      return this.field_12198 == class_4264.field_20667;
   }

   public boolean method_11303() {
      return this.field_12198 == class_4264.field_20666;
   }

   public boolean method_11295() {
      return this.field_12198 == class_4264.field_20668;
   }

   public World method_11267() {
      return this.field_12189;
   }

   public boolean method_11301() {
      return this.field_12188;
   }

   public int method_11262() {
      return this.field_12182;
   }

   private Predicate<class_9359> method_11273() {
      return var1 -> {
         class_1331 var4 = var1.method_37075();
         return var1.method_37330() && this.field_12189.method_28984(var4) == this;
      };
   }

   private void method_11293() {
      HashSet var3 = Sets.newHashSet(this.field_12186.method_2406());
      List var4 = this.field_12189.method_28990(this.method_11273());

      for (class_9359 var6 : var4) {
         if (!var3.contains(var6)) {
            this.field_12186.method_2403(var6);
         }
      }

      for (class_9359 var8 : var3) {
         if (!var4.contains(var8)) {
            this.field_12186.method_2405(var8);
         }
      }
   }

   public int method_11294() {
      return 5;
   }

   public int method_11296() {
      return this.field_12202;
   }

   public void method_11258(class_704 var1) {
      if (var1.isPotionActive(Effects.field_19721)) {
         this.field_12202 = this.field_12202 + var1.method_26553(Effects.field_19721).method_10333() + 1;
         this.field_12202 = class_9299.method_42829(this.field_12202, 0, this.method_11294());
      }

      var1.removeEffect(Effects.field_19721);
   }

   public void method_11271() {
      this.field_12200 = false;
      this.field_12186.method_2408();
      this.field_12198 = class_4264.field_20667;
   }

   public void method_11261() {
      if (!this.method_11277()) {
         if (this.field_12198 != class_4264.field_20669) {
            if (this.method_11259()) {
               this.field_12179++;
               if (this.field_12179 >= 600) {
                  this.method_11271();
                  return;
               }

               if (this.field_12179 % 20 == 0) {
                  this.method_11293();
                  this.field_12186.method_2404(true);
                  if (!this.method_11303()) {
                     this.field_12186.method_43451(field_12196);
                  } else {
                     this.field_12186.method_43459(0.0F);
                     this.field_12186.method_43451(field_12194);
                  }
               }
            }
         } else {
            boolean var3 = this.field_12200;
            this.field_12200 = this.field_12189.method_22559(this.field_12185);
            if (this.field_12189.method_43370() == class_423.field_1790) {
               this.method_11271();
               return;
            }

            if (var3 != this.field_12200) {
               this.field_12186.method_2404(this.field_12200);
            }

            if (!this.field_12200) {
               return;
            }

            if (!this.field_12189.method_28994(this.field_12185)) {
               this.method_11284();
            }

            if (!this.field_12189.method_28994(this.field_12185)) {
               if (this.field_12182 <= 0) {
                  this.method_11271();
               } else {
                  this.field_12198 = class_4264.field_20668;
               }
            }

            this.field_12183++;
            if (this.field_12183 >= 48000L) {
               this.method_11271();
               return;
            }

            int var4 = this.method_11268();
            if (var4 == 0 && this.method_11305()) {
               if (this.field_12197 <= 0) {
                  if (this.field_12197 == 0 && this.field_12182 > 0) {
                     this.field_12197 = 300;
                     this.field_12186.method_43451(field_12203);
                     return;
                  }
               } else {
                  boolean var5 = this.field_12193.isPresent();
                  boolean var6 = !var5 && this.field_12197 % 5 == 0;
                  if (var5 && !this.field_12189.method_28945().method_14823(new class_2034(this.field_12193.get()))) {
                     var6 = true;
                  }

                  if (var6) {
                     byte var7 = 0;
                     if (this.field_12197 >= 100) {
                        if (this.field_12197 < 40) {
                           var7 = 2;
                        }
                     } else {
                        var7 = 1;
                     }

                     this.field_12193 = this.method_11307(var7);
                  }

                  if (this.field_12197 == 300 || this.field_12197 % 20 == 0) {
                     this.method_11293();
                  }

                  this.field_12197--;
                  this.field_12186.method_43459(class_9299.method_42828((float)(300 - this.field_12197) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.field_12183 % 20L == 0L) {
               this.method_11293();
               this.method_11270();
               if (var4 <= 0) {
                  this.field_12186.method_43451(field_12203);
               } else if (var4 > 2) {
                  this.field_12186.method_43451(field_12203);
               } else {
                  this.field_12186
                     .method_43451(
                        field_12203.deepCopy().appendString(" - ").append(new TranslationTextComponent("event.minecraft.raid.raiders_remaining", var4))
                     );
               }
            }

            boolean var12 = false;
            int var13 = 0;

            while (this.method_11300()) {
               class_1331 var14 = !this.field_12193.isPresent() ? this.method_11298(var13, 20) : this.field_12193.get();
               if (var14 == null) {
                  var13++;
               } else {
                  this.field_12188 = true;
                  this.method_11280(var14);
                  if (!var12) {
                     this.method_11286(var14);
                     var12 = true;
                  }
               }

               if (var13 > 3) {
                  this.method_11271();
                  break;
               }
            }

            if (this.method_11301() && !this.method_11305() && var4 == 0) {
               if (this.field_12178 >= 40) {
                  this.field_12198 = class_4264.field_20666;

                  for (UUID var8 : this.field_12190) {
                     Entity var9 = this.field_12189.method_28925(var8);
                     if (var9 instanceof class_5834 && !var9.method_37221()) {
                        class_5834 var10 = (class_5834)var9;
                        var10.method_26558(new class_2250(Effects.field_19741, 48000, this.field_12202 - 1, false, false, true));
                        if (var10 instanceof class_9359) {
                           class_9359 var11 = (class_9359)var10;
                           var11.method_3209(class_6234.field_31861);
                           class_8807.field_45064.method_7409(var11);
                        }
                     }
                  }
               } else {
                  this.field_12178++;
               }
            }

            this.method_11297();
         }
      }
   }

   private void method_11284() {
      Stream var3 = class_6979.method_31906(class_6979.method_31921(this.field_12185), 2);
      var3.filter(this.field_12189::method_28995)
         .<class_1331>map(class_6979::method_31892)
         .min(Comparator.comparingDouble(var1 -> var1.method_12180(this.field_12185)))
         .ifPresent(this::method_11278);
   }

   private Optional<class_1331> method_11307(int var1) {
      for (int var4 = 0; var4 < 3; var4++) {
         class_1331 var5 = this.method_11298(var1, 1);
         if (var5 != null) {
            return Optional.<class_1331>of(var5);
         }
      }

      return Optional.<class_1331>empty();
   }

   private boolean method_11305() {
      return !this.method_11299() ? !this.method_11264() : !this.method_11285();
   }

   private boolean method_11264() {
      return this.method_11262() == this.field_12195;
   }

   private boolean method_11299() {
      return this.field_12202 > 1;
   }

   private boolean method_11285() {
      return this.method_11262() > this.field_12195;
   }

   private boolean method_11283() {
      return this.method_11264() && this.method_11268() == 0 && this.method_11299();
   }

   private void method_11270() {
      Iterator var3 = this.field_12187.values().iterator();
      HashSet var4 = Sets.newHashSet();

      while (var3.hasNext()) {
         Set var5 = (Set)var3.next();

         for (class_4040 var7 : var5) {
            class_1331 var8 = var7.method_37075();
            if (var7.field_41751 || var7.field_41768.method_29545() != this.field_12189.method_29545() || this.field_12185.method_12180(var8) >= 12544.0) {
               var4.add(var7);
            } else if (var7.field_41697 > 600) {
               if (this.field_12189.method_28925(var7.method_37328()) == null) {
                  var4.add(var7);
               }

               if (!this.field_12189.method_28994(var8) && var7.method_26532() > 2400) {
                  var7.method_18588(var7.method_18595() + 1);
               }

               if (var7.method_18595() >= 30) {
                  var4.add(var7);
               }
            }
         }
      }

      for (class_4040 var10 : var4) {
         this.method_11289(var10, true);
      }
   }

   private void method_11286(class_1331 var1) {
      float var4 = 13.0F;
      byte var5 = 64;
      Collection var6 = this.field_12186.method_2406();

      for (class_9359 var8 : this.field_12189.method_25873()) {
         class_1343 var9 = var8.method_37245();
         class_1343 var10 = class_1343.method_6216(var1);
         float var11 = class_9299.method_42842(
            (var10.field_7336 - var9.field_7336) * (var10.field_7336 - var9.field_7336)
               + (var10.field_7334 - var9.field_7334) * (var10.field_7334 - var9.field_7334)
         );
         double var12 = var9.field_7336 + (double)(13.0F / var11) * (var10.field_7336 - var9.field_7336);
         double var14 = var9.field_7334 + (double)(13.0F / var11) * (var10.field_7334 - var9.field_7334);
         if (var11 <= 64.0F || var6.contains(var8)) {
            var8.field_47794.method_4156(new class_3740(class_463.field_2127, class_562.field_3328, var12, var8.method_37309(), var14, 64.0F, 1.0F));
         }
      }
   }

   private void method_11280(class_1331 var1) {
      boolean var4 = false;
      int var5 = this.field_12182 + 1;
      this.field_12201 = 0.0F;
      class_9589 var6 = this.field_12189.method_43368(var1);
      boolean var7 = this.method_11283();

      for (class_5020 var11 : class_5020.method_23118()) {
         int var12 = this.method_11263(var11, var5, var7) + this.method_11257(var11, this.field_12181, var5, var6, var7);
         int var13 = 0;

         for (int var14 = 0; var14 < var12; var14++) {
            class_4040 var15 = (class_4040)class_5020.method_23117(var11).method_30484(this.field_12189);
            if (!var4 && var15.method_21357()) {
               var15.method_21354(true);
               this.method_11281(var5, var15);
               var4 = true;
            }

            this.method_11275(var5, var15, var1, false);
            if (class_5020.method_23117(var11) == class_6629.field_34318) {
               class_4040 var16 = null;
               if (var5 != this.method_11302(class_423.field_1789)) {
                  if (var5 >= this.method_11302(class_423.field_1782)) {
                     if (var13 != 0) {
                        var16 = class_6629.field_34255.method_30484(this.field_12189);
                     } else {
                        var16 = class_6629.field_34296.method_30484(this.field_12189);
                     }
                  }
               } else {
                  var16 = class_6629.field_34265.method_30484(this.field_12189);
               }

               var13++;
               if (var16 != null) {
                  this.method_11275(var5, var16, var1, false);
                  var16.method_37253(var1, 0.0F, 0.0F);
                  var16.method_37353(var15);
               }
            }
         }
      }

      this.field_12193 = Optional.<class_1331>empty();
      this.field_12182++;
      this.method_11290();
      this.method_11297();
   }

   public void method_11275(int var1, class_4040 var2, class_1331 var3, boolean var4) {
      boolean var7 = this.method_11274(var1, var2);
      if (var7) {
         var2.method_18587(this);
         var2.method_18590(var1);
         var2.method_18585(true);
         var2.method_18588(0);
         if (!var4 && var3 != null) {
            var2.method_37256((double)var3.method_12173() + 0.5, (double)var3.method_12165() + 1.0, (double)var3.method_12185() + 0.5);
            var2.method_26864(this.field_12189, this.field_12189.method_43368(var3), class_2417.field_12040, (class_8733)null, (class_5734)null);
            var2.method_18602(var1, false);
            var2.method_37386(true);
            this.field_12189.method_7065(var2);
         }
      }
   }

   public void method_11290() {
      this.field_12186.method_43459(class_9299.method_42828(this.method_11265() / this.field_12201, 0.0F, 1.0F));
   }

   public float method_11265() {
      float var3 = 0.0F;

      for (Set var5 : this.field_12187.values()) {
         for (class_4040 var7 : var5) {
            var3 += var7.method_26551();
         }
      }

      return var3;
   }

   private boolean method_11300() {
      return this.field_12197 == 0 && (this.field_12182 < this.field_12195 || this.method_11283()) && this.method_11268() == 0;
   }

   public int method_11268() {
      return this.field_12187.values().stream().mapToInt(Set::size).sum();
   }

   public void method_11289(class_4040 var1, boolean var2) {
      Set var5 = this.field_12187.get(var1.method_18592());
      if (var5 != null) {
         boolean var6 = var5.remove(var1);
         if (var6) {
            if (var2) {
               this.field_12201 = this.field_12201 - var1.method_26551();
            }

            var1.method_18587((class_2452)null);
            this.method_11290();
            this.method_11297();
         }
      }
   }

   private void method_11297() {
      this.field_12189.method_28985().method_32923();
   }

   public static ItemStack method_11292() {
      ItemStack var2 = new ItemStack(class_4897.field_24696);
      class_5734 var3 = var2.method_27978("BlockEntityTag");
      class_3416 var4 = new class_1697()
         .method_7624(class_8427.field_43102, class_9077.field_46501)
         .method_7624(class_8427.field_43103, class_9077.field_46503)
         .method_7624(class_8427.field_43106, class_9077.field_46498)
         .method_7624(class_8427.field_43114, class_9077.field_46503)
         .method_7624(class_8427.field_43098, class_9077.field_46496)
         .method_7624(class_8427.field_43137, class_9077.field_46503)
         .method_7624(class_8427.field_43116, class_9077.field_46503)
         .method_7624(class_8427.field_43114, class_9077.field_46496)
         .method_7625();
      var3.method_25946("Patterns", var4);
      var2.method_27980(class_8749.field_44785);
      var2.method_28032(new TranslationTextComponent("block.minecraft.ominous_banner").mergeStyle(TextFormatting.GOLD));
      return var2;
   }

   @Nullable
   public class_4040 method_11282(int var1) {
      return this.field_12191.get(var1);
   }

   @Nullable
   private class_1331 method_11298(int var1, int var2) {
      int var5 = var1 != 0 ? 2 - var1 : 2;
      class_2921 var6 = new class_2921();

      for (int var7 = 0; var7 < var2; var7++) {
         float var8 = this.field_12189.field_33033.nextFloat() * (float) (Math.PI * 2);
         int var9 = this.field_12185.method_12173()
            + class_9299.method_42848(class_9299.method_42840(var8) * 32.0F * (float)var5)
            + this.field_12189.field_33033.nextInt(5);
         int var10 = this.field_12185.method_12185()
            + class_9299.method_42848(class_9299.method_42818(var8) * 32.0F * (float)var5)
            + this.field_12189.field_33033.nextInt(5);
         int var11 = this.field_12189.method_22562(class_3801.field_18592, var9, var10);
         var6.method_13362(var9, var11, var10);
         if ((!this.field_12189.method_28994(var6) || var1 >= 2)
            && this.field_12189
               .method_22569(
                  var6.method_12173() - 10,
                  var6.method_12165() - 10,
                  var6.method_12185() - 10,
                  var6.method_12173() + 10,
                  var6.method_12165() + 10,
                  var6.method_12185() + 10
               )
            && this.field_12189.method_28945().method_14823(new class_2034(var6))
            && (
               class_3815.method_17767(class_1257.field_6935, this.field_12189, var6, class_6629.field_34318)
                  || this.field_12189.method_28262(var6.method_6100()).method_8350(class_4783.field_23552) && this.field_12189.method_28262(var6).method_8345()
            )) {
            return var6;
         }
      }

      return null;
   }

   private boolean method_11274(int var1, class_4040 var2) {
      return this.method_11276(var1, var2, true);
   }

   public boolean method_11276(int var1, class_4040 var2, boolean var3) {
      this.field_12187.computeIfAbsent(var1, var0 -> Sets.newHashSet());
      Set var6 = this.field_12187.get(var1);
      class_4040 var7 = null;

      for (class_4040 var9 : var6) {
         if (var9.method_37328().equals(var2.method_37328())) {
            var7 = var9;
            break;
         }
      }

      if (var7 != null) {
         var6.remove(var7);
         var6.add(var2);
      }

      var6.add(var2);
      if (var3) {
         this.field_12201 = this.field_12201 + var2.method_26551();
      }

      this.method_11290();
      this.method_11297();
      return true;
   }

   public void method_11281(int var1, class_4040 var2) {
      this.field_12191.put(var1, var2);
      var2.method_37349(class_6943.field_35704, method_11292());
      var2.method_26861(class_6943.field_35704, 2.0F);
   }

   public void method_11287(int var1) {
      this.field_12191.remove(var1);
   }

   public class_1331 method_11269() {
      return this.field_12185;
   }

   private void method_11278(class_1331 var1) {
      this.field_12185 = var1;
   }

   public int method_11288() {
      return this.field_12180;
   }

   private int method_11263(class_5020 var1, int var2, boolean var3) {
      return !var3 ? class_5020.method_23115(var1)[var2] : class_5020.method_23115(var1)[this.field_12195];
   }

   private int method_11257(class_5020 var1, Random var2, int var3, class_9589 var4, boolean var5) {
      class_423 var8 = var4.method_44287();
      boolean var9 = var8 == class_423.field_1784;
      boolean var10 = var8 == class_423.field_1789;
      int var11;
      switch (var1) {
         case field_25969:
            if (var9 || var3 <= 2 || var3 == 4) {
               return 0;
            }

            var11 = 1;
            break;
         case field_25971:
         case field_25974:
            if (var9) {
               var11 = var2.nextInt(2);
            } else if (var10) {
               var11 = 1;
            } else {
               var11 = 2;
            }
            break;
         case field_25967:
            var11 = !var9 && var5 ? 1 : 0;
            break;
         default:
            return 0;
      }

      return var11 > 0 ? var2.nextInt(var11 + 1) : 0;
   }

   public boolean method_11306() {
      return this.field_12200;
   }

   public class_5734 method_11279(class_5734 var1) {
      var1.method_25931("Id", this.field_12180);
      var1.method_25934("Started", this.field_12188);
      var1.method_25934("Active", this.field_12200);
      var1.method_25949("TicksActive", this.field_12183);
      var1.method_25931("BadOmenLevel", this.field_12202);
      var1.method_25931("GroupsSpawned", this.field_12182);
      var1.method_25931("PreRaidTicks", this.field_12197);
      var1.method_25931("PostRaidTicks", this.field_12178);
      var1.method_25920("TotalHealth", this.field_12201);
      var1.method_25931("NumGroups", this.field_12195);
      var1.method_25941("Status", this.field_12198.method_19860());
      var1.method_25931("CX", this.field_12185.method_12173());
      var1.method_25931("CY", this.field_12185.method_12165());
      var1.method_25931("CZ", this.field_12185.method_12185());
      class_3416 var4 = new class_3416();

      for (UUID var6 : this.field_12190) {
         var4.add(class_4338.method_20181(var6));
      }

      var1.method_25946("HeroesOfTheVillage", var4);
      return var1;
   }

   public int method_11302(class_423 var1) {
      switch (var1) {
         case field_1784:
            return 3;
         case field_1789:
            return 5;
         case field_1782:
            return 7;
         default:
            return 0;
      }
   }

   public float method_11272() {
      int var3 = this.method_11296();
      if (var3 != 2) {
         if (var3 != 3) {
            if (var3 != 4) {
               return var3 != 5 ? 0.0F : 0.75F;
            } else {
               return 0.5F;
            }
         } else {
            return 0.25F;
         }
      } else {
         return 0.1F;
      }
   }

   public void method_11304(Entity var1) {
      this.field_12190.add(var1.method_37328());
   }
}
