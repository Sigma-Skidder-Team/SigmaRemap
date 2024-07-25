package remapped;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class class_5886 extends class_5834 {
   private static final class_7821<Byte> field_29912 = class_8073.<Byte>method_36641(class_5886.class, class_2734.field_13361);
   public int field_29913;
   public int field_29915;
   public class_3711 field_29919;
   public class_2833 field_29900;
   public class_4072 field_29914;
   private final class_1902 field_29921;
   public class_1249 field_29904;
   public final class_782 field_29916;
   public final class_782 field_29908;
   private class_5834 field_29905;
   private final class_8091 field_29898;
   private final class_2831<ItemStack> field_29903 = class_2831.<ItemStack>method_12872(2, ItemStack.EMPTY);
   public final float[] field_29923 = new float[2];
   private final class_2831<ItemStack> field_29922 = class_2831.<ItemStack>method_12872(4, ItemStack.EMPTY);
   public final float[] field_29918 = new float[4];
   private boolean field_29902;
   private boolean field_29920;
   private final Map<class_1108, Float> field_29917 = Maps.newEnumMap(class_1108.class);
   private Identifier field_29906;
   private long field_29910;
   private Entity field_29911;
   private int field_29901;
   private class_5734 field_29899;
   private class_1331 field_29909 = class_1331.field_7306;
   private float field_29907 = -1.0F;

   public class_5886(class_6629<? extends class_5886> var1, World var2) {
      super(var1, var2);
      this.field_29916 = new class_782(var2.method_29559());
      this.field_29908 = new class_782(var2.method_29559());
      this.field_29919 = new class_3711(this);
      this.field_29900 = new class_2833(this);
      this.field_29914 = new class_4072(this);
      this.field_29921 = this.method_26847();
      this.field_29904 = this.method_26933(var2);
      this.field_29898 = new class_8091(this);
      Arrays.fill(this.field_29918, 0.085F);
      Arrays.fill(this.field_29923, 0.085F);
      if (var2 != null && !var2.field_33055) {
         this.method_26851();
      }
   }

   public void method_26851() {
   }

   public static class_1313 method_26846() {
      return class_5834.method_26409().method_5984(class_7331.field_37471, 16.0).method_5983(class_7331.field_37467);
   }

   public class_1249 method_26933(World var1) {
      return new class_8985(this, var1);
   }

   public boolean method_26924() {
      return false;
   }

   public float method_26931(class_1108 var1) {
      class_5886 var4;
      if (this.method_37243() instanceof class_5886 && ((class_5886)this.method_37243()).method_26924()) {
         var4 = (class_5886)this.method_37243();
      } else {
         var4 = this;
      }

      Float var5 = var4.field_29917.get(var1);
      return var5 != null ? var5 : var1.method_4913();
   }

   public void method_26895(class_1108 var1, float var2) {
      this.field_29917.put(var1, var2);
   }

   public boolean method_26854(class_1108 var1) {
      return var1 != class_1108.field_6357 && var1 != class_1108.field_6358 && var1 != class_1108.field_6367 && var1 != class_1108.field_6363;
   }

   public class_1902 method_26847() {
      return new class_1902(this);
   }

   public class_3711 method_26865() {
      return this.field_29919;
   }

   public class_2833 method_26905() {
      if (this.method_37070() && this.method_37243() instanceof class_5886) {
         class_5886 var3 = (class_5886)this.method_37243();
         return var3.method_26905();
      } else {
         return this.field_29900;
      }
   }

   public class_4072 method_26886() {
      return this.field_29914;
   }

   public class_1249 method_26927() {
      if (this.method_37070() && this.method_37243() instanceof class_5886) {
         class_5886 var3 = (class_5886)this.method_37243();
         return var3.method_26927();
      } else {
         return this.field_29904;
      }
   }

   public class_8091 method_26928() {
      return this.field_29898;
   }

   @Nullable
   public class_5834 method_17809() {
      return this.field_29905;
   }

   public void method_26860(class_5834 var1) {
      this.field_29905 = var1;
      class_7860.method_35547(class_7860.field_40009, this, var1);
   }

   @Override
   public boolean method_26610(class_6629<?> var1) {
      return var1 != class_6629.field_34281;
   }

   public boolean method_26878(class_551 var1) {
      return false;
   }

   public void method_26897() {
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_29912, (byte)0);
   }

   public int method_26850() {
      return 80;
   }

   public void method_26853() {
      class_8461 var3 = this.method_26918();
      if (var3 != null) {
         this.method_37155(var3, this.method_26439(), this.method_26547());
      }
   }

   @Override
   public void method_37219() {
      super.method_37219();
      this.field_41768.method_29599().startSection("mobBaseTick");
      if (this.method_37330() && this.field_41717.nextInt(1000) < this.field_29913++) {
         this.method_26877();
         this.method_26853();
      }

      this.field_41768.method_29599().endSection();
   }

   @Override
   public void method_26593(class_6199 var1) {
      this.method_26877();
      super.method_26593(var1);
   }

   private void method_26877() {
      this.field_29913 = -this.method_26850();
   }

   @Override
   public int method_26427(class_704 var1) {
      if (this.field_29915 <= 0) {
         return this.field_29915;
      } else {
         int var4 = this.field_29915;

         for (int var5 = 0; var5 < this.field_29922.size(); var5++) {
            if (!this.field_29922.get(var5).method_28022() && this.field_29918[var5] <= 1.0F) {
               var4 += 1 + this.field_41717.nextInt(3);
            }
         }

         for (int var6 = 0; var6 < this.field_29903.size(); var6++) {
            if (!this.field_29903.get(var6).method_28022() && this.field_29923[var6] <= 1.0F) {
               var4 += 1 + this.field_41717.nextInt(3);
            }
         }

         return var4;
      }
   }

   public void method_26909() {
      if (!this.field_41768.field_33055) {
         this.field_41768.method_29587(this, (byte)20);
      } else {
         for (int var3 = 0; var3 < 20; var3++) {
            double var4 = this.field_41717.nextGaussian() * 0.02;
            double var6 = this.field_41717.nextGaussian() * 0.02;
            double var8 = this.field_41717.nextGaussian() * 0.02;
            double var10 = 10.0;
            this.field_41768
               .method_43361(
                  class_3090.field_15343,
                  this.method_37146(1.0) - var4 * 10.0,
                  this.method_37255() - var6 * 10.0,
                  this.method_37383(1.0) - var8 * 10.0,
                  var4,
                  var6,
                  var8
               );
         }
      }
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 20) {
         super.method_37336(var1);
      } else {
         this.method_26909();
      }
   }

   @Override
   public void method_37123() {
      if (Config.method_14401() && this.method_26852()) {
         this.method_26917();
      } else {
         super.method_37123();
         if (!this.field_41768.field_33055) {
            this.method_26921();
            if (this.field_41697 % 5 == 0) {
               this.method_26872();
            }
         }
      }
   }

   public void method_26872() {
      boolean var3 = !(this.method_37259() instanceof class_5886);
      boolean var4 = !(this.method_37243() instanceof class_9149);
      this.field_29916.method_3493(class_1891.field_9564, var3);
      this.field_29916.method_3493(class_1891.field_9561, var3 && var4);
      this.field_29916.method_3493(class_1891.field_9560, var3);
   }

   @Override
   public float method_26582(float var1, float var2) {
      this.field_29921.method_8645();
      return var2;
   }

   @Nullable
   public class_8461 method_26918() {
      return null;
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25934("CanPickUpLoot", this.method_26930());
      var1.method_25934("PersistenceRequired", this.field_29920);
      class_3416 var4 = new class_3416();

      for (ItemStack var6 : this.field_29922) {
         class_5734 var7 = new class_5734();
         if (!var6.method_28022()) {
            var6.method_27998(var7);
         }

         var4.add(var7);
      }

      var1.method_25946("ArmorItems", var4);
      class_3416 var12 = new class_3416();

      for (ItemStack var15 : this.field_29903) {
         class_5734 var8 = new class_5734();
         if (!var15.method_28022()) {
            var15.method_27998(var8);
         }

         var12.add(var8);
      }

      var1.method_25946("HandItems", var12);
      class_3416 var14 = new class_3416();

      for (float var10 : this.field_29918) {
         var14.add(class_5718.method_25854(var10));
      }

      var1.method_25946("ArmorDropChances", var14);
      class_3416 var17 = new class_3416();

      for (float var11 : this.field_29923) {
         var17.add(class_5718.method_25854(var11));
      }

      var1.method_25946("HandDropChances", var17);
      if (this.field_29911 == null) {
         if (this.field_29899 != null) {
            var1.method_25946("Leash", this.field_29899.method_25944());
         }
      } else {
         class_5734 var20 = new class_5734();
         if (!(this.field_29911 instanceof class_5834)) {
            if (this.field_29911 instanceof class_4641) {
               class_1331 var22 = ((class_4641)this.field_29911).method_21469();
               var20.method_25931("X", var22.method_12173());
               var20.method_25931("Y", var22.method_12165());
               var20.method_25931("Z", var22.method_12185());
            }
         } else {
            UUID var23 = this.field_29911.method_37328();
            var20.method_25964("UUID", var23);
         }

         var1.method_25946("Leash", var20);
      }

      var1.method_25934("LeftHanded", this.method_26849());
      if (this.field_29906 != null) {
         var1.method_25941("DeathLootTable", this.field_29906.toString());
         if (this.field_29910 != 0L) {
            var1.method_25949("DeathLootTableSeed", this.field_29910);
         }
      }

      if (this.method_26859()) {
         var1.method_25934("NoAI", this.method_26859());
      }
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      if (var1.method_25939("CanPickUpLoot", 1)) {
         this.method_26871(var1.method_25933("CanPickUpLoot"));
      }

      this.field_29920 = var1.method_25933("PersistenceRequired");
      if (var1.method_25939("ArmorItems", 9)) {
         class_3416 var4 = var1.method_25927("ArmorItems", 10);

         for (int var5 = 0; var5 < this.field_29922.size(); var5++) {
            this.field_29922.set(var5, ItemStack.method_28015(var4.method_15764(var5)));
         }
      }

      if (var1.method_25939("HandItems", 9)) {
         class_3416 var6 = var1.method_25927("HandItems", 10);

         for (int var9 = 0; var9 < this.field_29903.size(); var9++) {
            this.field_29903.set(var9, ItemStack.method_28015(var6.method_15764(var9)));
         }
      }

      if (var1.method_25939("ArmorDropChances", 9)) {
         class_3416 var7 = var1.method_25927("ArmorDropChances", 5);

         for (int var10 = 0; var10 < var7.size(); var10++) {
            this.field_29918[var10] = var7.method_15769(var10);
         }
      }

      if (var1.method_25939("HandDropChances", 9)) {
         class_3416 var8 = var1.method_25927("HandDropChances", 5);

         for (int var11 = 0; var11 < var8.size(); var11++) {
            this.field_29923[var11] = var8.method_15769(var11);
         }
      }

      if (var1.method_25939("Leash", 10)) {
         this.field_29899 = var1.method_25937("Leash");
      }

      this.method_26932(var1.method_25933("LeftHanded"));
      if (var1.method_25939("DeathLootTable", 8)) {
         this.field_29906 = new Identifier(var1.method_25965("DeathLootTable"));
         this.field_29910 = var1.method_25948("DeathLootTableSeed");
      }

      this.method_26888(var1.method_25933("NoAI"));
   }

   @Override
   public void method_26483(class_6199 var1, boolean var2) {
      super.method_26483(var1, var2);
      this.field_29906 = null;
   }

   @Override
   public class_8480 method_26502(boolean var1, class_6199 var2) {
      return super.method_26502(var1, var2).method_39070(this.field_29910, this.field_41717);
   }

   @Override
   public final Identifier method_26591() {
      return this.field_29906 != null ? this.field_29906 : this.method_26934();
   }

   public Identifier method_26934() {
      return super.method_26591();
   }

   public void method_26904(float var1) {
      this.field_29673 = var1;
   }

   public void method_26845(float var1) {
      this.field_29651 = var1;
   }

   public void method_26907(float var1) {
      this.field_29676 = var1;
   }

   @Override
   public void method_26461(float var1) {
      super.method_26461(var1);
      this.method_26904(var1);
   }

   @Override
   public void method_26606() {
      super.method_26606();
      this.field_41768.method_29599().startSection("looting");
      boolean var3 = this.field_41768.method_29537().method_1285(class_291.field_1047);
      if (class_7860.field_40243.method_3596()) {
         var3 = class_7860.method_35566(class_7860.field_40243, this.field_41768, this);
      }

      if (!this.field_41768.field_33055 && this.method_26930() && this.method_37330() && !this.field_29659 && var3) {
         for (class_91 var5 : this.field_41768.<class_91>method_25868(class_91.class, this.method_37241().method_18899(1.0, 0.0, 1.0))) {
            if (!var5.field_41751 && !var5.method_264().method_28022() && !var5.method_258() && this.method_26873(var5.method_264())) {
               this.method_26902(var5);
            }
         }
      }

      this.field_41768.method_29599().endSection();
   }

   public void method_26902(class_91 var1) {
      ItemStack var4 = var1.method_264();
      if (this.method_26879(var4)) {
         this.method_26562(var1);
         this.method_26467(var1, var4.method_27997());
         var1.method_37204();
      }
   }

   public boolean method_26879(ItemStack var1) {
      class_6943 var4 = method_26896(var1);
      ItemStack var5 = this.method_26520(var4);
      boolean var6 = this.method_26881(var1, var5);
      if (var6 && this.method_26899(var1)) {
         double var7 = (double)this.method_26913(var4);
         if (!var5.method_28022() && (double)Math.max(this.field_41717.nextFloat() - 0.1F, 0.0F) < var7) {
            this.method_37310(var5);
         }

         this.method_26866(var4, var1);
         this.method_26620(var1);
         return true;
      } else {
         return false;
      }
   }

   public void method_26866(class_6943 var1, ItemStack var2) {
      this.method_37349(var1, var2);
      this.method_26858(var1);
      this.field_29920 = true;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_26858(class_6943 var1) {
      switch (var1.method_31772()) {
         case field_37218:
            this.field_29923[var1.method_31767()] = 2.0F;
            break;
         case field_37219:
            this.field_29918[var1.method_31767()] = 2.0F;
      }
   }

   public boolean method_26881(ItemStack var1, ItemStack var2) {
      if (!var2.method_28022()) {
         if (!(var1.method_27960() instanceof class_2235)) {
            if (var1.method_27960() instanceof class_2100 && var2.method_27960() instanceof class_2100) {
               return this.method_26900(var1, var2);
            } else if (var1.method_27960() instanceof class_4380 && var2.method_27960() instanceof class_4380) {
               return this.method_26900(var1, var2);
            } else if (!(var1.method_27960() instanceof class_8228)) {
               if (var1.method_27960() instanceof class_3077) {
                  if (var2.method_27960() instanceof class_6201) {
                     return true;
                  }

                  if (var2.method_27960() instanceof class_3077) {
                     class_3077 var8 = (class_3077)var1.method_27960();
                     class_3077 var10 = (class_3077)var2.method_27960();
                     if (var8.method_14105() == var10.method_14105()) {
                        return this.method_26900(var1, var2);
                     }

                     return var8.method_14105() > var10.method_14105();
                  }
               }

               return false;
            } else if (!class_2931.method_13421(var2)) {
               if (var2.method_27960() instanceof class_8228) {
                  class_8228 var7 = (class_8228)var1.method_27960();
                  class_8228 var9 = (class_8228)var2.method_27960();
                  if (var7.method_37665() == var9.method_37665()) {
                     return var7.method_37668() == var9.method_37668() ? this.method_26900(var1, var2) : var7.method_37668() > var9.method_37668();
                  } else {
                     return var7.method_37665() > var9.method_37665();
                  }
               } else {
                  return true;
               }
            } else {
               return false;
            }
         } else if (var2.method_27960() instanceof class_2235) {
            class_2235 var5 = (class_2235)var1.method_27960();
            class_2235 var6 = (class_2235)var2.method_27960();
            return var5.method_10287() == var6.method_10287() ? this.method_26900(var1, var2) : var5.method_10287() > var6.method_10287();
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public boolean method_26900(ItemStack var1, ItemStack var2) {
      if (var1.method_28026() >= var2.method_28026() && (!var1.method_28002() || var2.method_28002())) {
         return var1.method_28002() && var2.method_28002()
            ? var1.method_27990().method_25952().stream().anyMatch(var0 -> !var0.equals("Damage"))
               && !var2.method_27990().method_25952().stream().anyMatch(var0 -> !var0.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean method_26899(ItemStack var1) {
      return true;
   }

   public boolean method_26873(ItemStack var1) {
      return this.method_26899(var1);
   }

   public boolean method_26911(double var1) {
      return true;
   }

   public boolean method_26915() {
      return this.method_37070();
   }

   public boolean method_26869() {
      return false;
   }

   @Override
   public void method_37233() {
      if (this.field_41768.method_43370() == class_423.field_1790 && this.method_26869()) {
         this.method_37204();
      } else if (!this.method_26925() && !this.method_26915()) {
         class_704 var3 = this.field_41768.method_25861(this, -1.0);
         if (class_7860.field_39867.method_3596()) {
            Object var4 = class_7860.field_39867.method_3581(this);
            if (var4 != class_8835.field_45188) {
               if (var4 == class_8835.field_45190) {
                  this.method_37204();
                  var3 = null;
               }
            } else {
               this.field_29658 = 0;
               var3 = null;
            }
         }

         if (var3 != null) {
            double var5 = var3.method_37275(this);
            int var7 = this.method_37387().method_30476().method_21200();
            int var8 = var7 * var7;
            if (var5 > (double)var8 && this.method_26911(var5)) {
               this.method_37204();
            }

            int var9 = this.method_37387().method_30476().method_21196();
            int var10 = var9 * var9;
            if (this.field_29658 > 600 && this.field_41717.nextInt(800) == 0 && var5 > (double)var10 && this.method_26911(var5)) {
               this.method_37204();
            } else if (var5 < (double)var10) {
               this.field_29658 = 0;
            }
         }
      } else {
         this.field_29658 = 0;
      }
   }

   @Override
   public final void method_26417() {
      this.field_29658++;
      this.field_41768.method_29599().startSection("sensing");
      this.field_29898.method_36737();
      this.field_41768.method_29599().endSection();
      this.field_41768.method_29599().startSection("targetSelector");
      this.field_29908.method_3489();
      this.field_41768.method_29599().endSection();
      this.field_41768.method_29599().startSection("goalSelector");
      this.field_29916.method_3489();
      this.field_41768.method_29599().endSection();
      this.field_41768.method_29599().startSection("navigation");
      this.field_29904.method_5612();
      this.field_41768.method_29599().endSection();
      this.field_41768.method_29599().startSection("mob tick");
      this.method_26919();
      this.field_41768.method_29599().endSection();
      this.field_41768.method_29599().startSection("controls");
      this.field_41768.method_29599().startSection("move");
      this.field_29900.method_12883();
      this.field_41768.method_29599().method_16050("look");
      this.field_29919.method_17234();
      this.field_41768.method_29599().method_16050("jump");
      this.field_29914.method_18771();
      this.field_41768.method_29599().endSection();
      this.field_41768.method_29599().endSection();
      this.method_26929();
   }

   public void method_26929() {
      class_1892.method_8439(this.field_41768, this, this.field_29916);
   }

   public void method_26919() {
   }

   public int method_26862() {
      return 40;
   }

   public int method_26903() {
      return 75;
   }

   public int method_26926() {
      return 10;
   }

   public void method_26914(Entity var1, float var2, float var3) {
      double var6 = var1.method_37302() - this.method_37302();
      double var8 = var1.method_37156() - this.method_37156();
      double var10;
      if (!(var1 instanceof class_5834)) {
         var10 = (var1.method_37241().field_19937 + var1.method_37241().field_19939) / 2.0 - this.method_37388();
      } else {
         class_5834 var12 = (class_5834)var1;
         var10 = var12.method_37388() - this.method_37388();
      }

      double var13 = (double)class_9299.method_42842(var6 * var6 + var8 * var8);
      float var15 = (float)(class_9299.method_42821(var8, var6) * 180.0F / (float)Math.PI) - 90.0F;
      float var16 = (float)(-(class_9299.method_42821(var10, var13) * 180.0F / (float)Math.PI));
      this.field_41755 = this.method_26906(this.field_41755, var16, var3);
      this.field_41701 = this.method_26906(this.field_41701, var15, var2);
   }

   private float method_26906(float var1, float var2, float var3) {
      float var6 = class_9299.method_42810(var2 - var1);
      if (var6 > var3) {
         var6 = var3;
      }

      if (var6 < -var3) {
         var6 = -var3;
      }

      return var1 + var6;
   }

   public static boolean method_26908(class_6629<? extends class_5886> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      class_1331 var7 = var3.method_6100();
      return var2 == class_2417.field_12024 || var1.method_28262(var7).method_8305(var1, var7, var0);
   }

   public boolean method_26889(class_9379 var1, class_2417 var2) {
      return true;
   }

   public boolean method_26855(class_4924 var1) {
      return !var1.method_22550(this.method_37241()) && var1.method_6677(this);
   }

   public int method_26856() {
      return 4;
   }

   public boolean method_26841(int var1) {
      return false;
   }

   @Override
   public int method_37232() {
      if (this.method_17809() != null) {
         int var3 = (int)(this.method_26551() - this.method_26465() * 0.33F);
         var3 -= (3 - this.field_41768.method_43370().method_2097()) * 4;
         if (var3 < 0) {
            var3 = 0;
         }

         return var3 + 3;
      } else {
         return 3;
      }
   }

   @Override
   public Iterable<ItemStack> method_37294() {
      return this.field_29903;
   }

   @Override
   public Iterable<ItemStack> method_37262() {
      return this.field_29922;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public ItemStack method_26520(class_6943 var1) {
      switch (var1.method_31772()) {
         case field_37218:
            return this.field_29903.get(var1.method_31767());
         case field_37219:
            return this.field_29922.get(var1.method_31767());
         default:
            return ItemStack.EMPTY;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void method_37349(class_6943 var1, ItemStack var2) {
      switch (var1.method_31772()) {
         case field_37218:
            this.field_29903.set(var1.method_31767(), var2);
            break;
         case field_37219:
            this.field_29922.set(var1.method_31767(), var2);
      }
   }

   @Override
   public void method_26614(class_6199 var1, int var2, boolean var3) {
      super.method_26614(var1, var2, var3);

      for (class_6943 var9 : class_6943.values()) {
         ItemStack var10 = this.method_26520(var9);
         float var11 = this.method_26913(var9);
         boolean var12 = var11 > 1.0F;
         if (!var10.method_28022()
            && !class_2931.method_13408(var10)
            && (var3 || var12)
            && Math.max(this.field_41717.nextFloat() - (float)var2 * 0.01F, 0.0F) < var11) {
            if (!var12 && var10.method_27959()) {
               var10.method_27999(var10.method_27957() - this.field_41717.nextInt(1 + this.field_41717.nextInt(Math.max(var10.method_27957() - 3, 1))));
            }

            this.method_37310(var10);
            this.method_37349(var9, ItemStack.EMPTY);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float method_26913(class_6943 var1) {
      float var4;
      switch (var1.method_31772()) {
         case field_37218:
            var4 = this.field_29923[var1.method_31767()];
            break;
         case field_37219:
            var4 = this.field_29918[var1.method_31767()];
            break;
         default:
            var4 = 0.0F;
      }

      return var4;
   }

   public void method_26870(class_9589 var1) {
      if (this.field_41717.nextFloat() < 0.15F * var1.method_44284()) {
         int var4 = this.field_41717.nextInt(2);
         float var5 = this.field_41768.method_43370() != class_423.field_1782 ? 0.25F : 0.1F;
         if (this.field_41717.nextFloat() < 0.095F) {
            var4++;
         }

         if (this.field_41717.nextFloat() < 0.095F) {
            var4++;
         }

         if (this.field_41717.nextFloat() < 0.095F) {
            var4++;
         }

         boolean var6 = true;

         for (class_6943 var10 : class_6943.values()) {
            if (var10.method_31772() == class_7268.field_37219) {
               ItemStack var11 = this.method_26520(var10);
               if (!var6 && this.field_41717.nextFloat() < var5) {
                  break;
               }

               var6 = false;
               if (var11.method_28022()) {
                  class_2451 var12 = method_26875(var10, var4);
                  if (var12 != null) {
                     this.method_37349(var10, new ItemStack(var12));
                  }
               }
            }
         }
      }
   }

   public static class_6943 method_26896(ItemStack var0) {
      if (class_7860.field_40096.method_3596()) {
         class_6943 var3 = (class_6943)class_7860.method_35555(var0, class_7860.field_40096);
         if (var3 != null) {
            return var3;
         }
      }

      class_2451 var4 = var0.method_27960();
      if (var4 != class_4783.field_23281.method_10803() && (!(var4 instanceof class_6201) || !(((class_6201)var4).method_28392() instanceof class_8550))) {
         if (var4 instanceof class_8228) {
            return ((class_8228)var4).method_37669();
         } else if (var4 != class_4897.field_24503) {
            return !class_8835.method_40651(var0, (class_704)null) ? class_6943.field_35707 : class_6943.field_35701;
         } else {
            return class_6943.field_35708;
         }
      } else {
         return class_6943.field_35704;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public static class_2451 method_26875(class_6943 var0, int var1) {
      switch (var0) {
         case field_35704:
            if (var1 == 0) {
               return class_4897.field_24600;
            } else if (var1 == 1) {
               return class_4897.field_24338;
            } else if (var1 == 2) {
               return class_4897.field_24841;
            } else if (var1 == 3) {
               return class_4897.field_24701;
            } else if (var1 == 4) {
               return class_4897.field_24912;
            }
         case field_35708:
            if (var1 == 0) {
               return class_4897.field_24671;
            } else if (var1 == 1) {
               return class_4897.field_24849;
            } else if (var1 == 2) {
               return class_4897.field_25068;
            } else if (var1 == 3) {
               return class_4897.field_24708;
            } else if (var1 == 4) {
               return class_4897.field_24806;
            }
         case field_35698:
            if (var1 == 0) {
               return class_4897.field_24878;
            } else if (var1 == 1) {
               return class_4897.field_25088;
            } else if (var1 == 2) {
               return class_4897.field_24382;
            } else if (var1 == 3) {
               return class_4897.field_25042;
            } else if (var1 == 4) {
               return class_4897.field_25051;
            }
         case field_35700:
            if (var1 == 0) {
               return class_4897.field_24683;
            } else if (var1 == 1) {
               return class_4897.field_25132;
            } else if (var1 == 2) {
               return class_4897.field_24925;
            } else if (var1 == 3) {
               return class_4897.field_24576;
            } else if (var1 == 4) {
               return class_4897.field_24588;
            }
         default:
            return null;
      }
   }

   public void method_26893(class_9589 var1) {
      float var4 = var1.method_44284();
      this.method_26890(var4);

      for (class_6943 var8 : class_6943.values()) {
         if (var8.method_31772() == class_7268.field_37219) {
            this.method_26876(var4, var8);
         }
      }
   }

   public void method_26890(float var1) {
      if (!this.method_26446().method_28022() && this.field_41717.nextFloat() < 0.25F * var1) {
         this.method_37349(
            class_6943.field_35707,
            class_2931.method_13426(this.field_41717, this.method_26446(), (int)(5.0F + var1 * (float)this.field_41717.nextInt(18)), false)
         );
      }
   }

   public void method_26876(float var1, class_6943 var2) {
      ItemStack var5 = this.method_26520(var2);
      if (!var5.method_28022() && this.field_41717.nextFloat() < 0.5F * var1) {
         this.method_37349(var2, class_2931.method_13426(this.field_41717, var5, (int)(5.0F + var1 * (float)this.field_41717.nextInt(18)), false));
      }
   }

   @Nullable
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, class_5734 var5) {
      this.method_26561(class_7331.field_37471)
         .method_45005(new class_9343("Random spawn bonus", this.field_41717.nextGaussian() * 0.05, class_9342.field_47678));
      if (!(this.field_41717.nextFloat() < 0.05F)) {
         this.method_26932(false);
      } else {
         this.method_26932(true);
      }

      return var4;
   }

   public boolean method_26863() {
      return false;
   }

   public void method_26883() {
      this.field_29920 = true;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_26861(class_6943 var1, float var2) {
      switch (var1.method_31772()) {
         case field_37218:
            this.field_29923[var1.method_31767()] = var2;
            break;
         case field_37219:
            this.field_29918[var1.method_31767()] = var2;
      }
   }

   public boolean method_26930() {
      return this.field_29902;
   }

   public void method_26871(boolean var1) {
      this.field_29902 = var1;
   }

   @Override
   public boolean method_26612(ItemStack var1) {
      class_6943 var4 = method_26896(var1);
      return this.method_26520(var4).method_28022() && this.method_26930();
   }

   public boolean method_26925() {
      return this.field_29920;
   }

   @Override
   public final class_6910 method_37128(class_704 var1, class_2584 var2) {
      if (this.method_37330()) {
         if (this.method_26922() != var1) {
            class_6910 var5 = this.method_26842(var1, var2);
            if (!var5.method_31662()) {
               var5 = this.method_26857(var1, var2);
               return !var5.method_31662() ? super.method_37128(var1, var2) : var5;
            } else {
               return var5;
            }
         } else {
            this.method_26916(true, !var1.field_3876.isCreativeMode);
            return class_6910.method_31659(this.field_41768.field_33055);
         }
      } else {
         return class_6910.field_35521;
      }
   }

   private class_6910 method_26842(class_704 var1, class_2584 var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (var5.method_27960() == class_4897.field_25274 && this.method_26887(var1)) {
         this.method_26901(var1, true);
         var5.method_27970(1);
         return class_6910.method_31659(this.field_41768.field_33055);
      } else {
         if (var5.method_27960() == class_4897.field_24948) {
            class_6910 var6 = var5.method_28000(var1, this, var2);
            if (var6.method_31662()) {
               return var6;
            }
         }

         if (!(var5.method_27960() instanceof class_3003)) {
            return class_6910.field_35521;
         } else if (!(this.field_41768 instanceof class_6331)) {
            return class_6910.field_35518;
         } else {
            class_3003 var8 = (class_3003)var5.method_27960();
            Optional var7 = var8.method_13714(
               var1, this, (class_6629<? extends class_5886>)this.method_37387(), (class_6331)this.field_41768, this.method_37245(), var5
            );
            var7.ifPresent(var2x -> this.method_26874(var1, var2x));
            return !var7.isPresent() ? class_6910.field_35521 : class_6910.field_35520;
         }
      }
   }

   public void method_26874(class_704 var1, class_5886 var2) {
   }

   public class_6910 method_26857(class_704 var1, class_2584 var2) {
      return class_6910.field_35521;
   }

   public boolean method_26867() {
      return this.method_26880(this.method_37075());
   }

   public boolean method_26880(class_1331 var1) {
      return this.field_29907 != -1.0F ? this.field_29909.method_12180(var1) < (double)(this.field_29907 * this.field_29907) : true;
   }

   public void method_26843(class_1331 var1, int var2) {
      this.field_29909 = var1;
      this.field_29907 = (float)var2;
   }

   public class_1331 method_26885() {
      return this.field_29909;
   }

   public float method_26912() {
      return this.field_29907;
   }

   public boolean method_26848() {
      return this.field_29907 != -1.0F;
   }

   @Nullable
   public <T extends class_5886> T method_26898(class_6629<T> var1, boolean var2) {
      if (this.field_41751) {
         return null;
      } else {
         class_5886 var5 = (class_5886)var1.method_30484(this.field_41768);
         var5.method_37299(this);
         var5.method_26910(this.method_26449());
         var5.method_26888(this.method_26859());
         if (this.method_45507()) {
            var5.method_37303(this.method_45508());
            var5.method_37319(this.method_37135());
         }

         if (this.method_26925()) {
            var5.method_26883();
         }

         var5.method_37289(this.method_37367());
         if (var2) {
            var5.method_26871(this.method_26930());

            for (class_6943 var9 : class_6943.values()) {
               ItemStack var10 = this.method_26520(var9);
               if (!var10.method_28022()) {
                  var5.method_37349(var9, var10.method_27973());
                  var5.method_26861(var9, this.method_26913(var9));
                  var10.method_28017(0);
               }
            }
         }

         this.field_41768.method_7509(var5);
         if (this.method_37070()) {
            Entity var11 = this.method_37243();
            this.method_37390();
            var5.method_37354(var11, true);
         }

         this.method_37204();
         return (T)var5;
      }
   }

   public void method_26921() {
      if (this.field_29899 != null) {
         this.method_26844();
      }

      if (this.field_29911 != null && (!this.method_37330() || !this.field_29911.method_37330())) {
         this.method_26916(true, true);
      }
   }

   public void method_26916(boolean var1, boolean var2) {
      if (this.field_29911 != null) {
         this.field_41722 = false;
         if (!(this.field_29911 instanceof class_704)) {
            this.field_29911.field_41722 = false;
         }

         this.field_29911 = null;
         this.field_29899 = null;
         if (!this.field_41768.field_33055 && var2) {
            this.method_37312(class_4897.field_25274);
         }

         if (!this.field_41768.field_33055 && var1 && this.field_41768 instanceof class_6331) {
            ((class_6331)this.field_41768).method_28945().method_10200(this, new class_2708(this, (Entity)null));
         }
      }
   }

   public boolean method_26887(class_704 var1) {
      return !this.method_26920() && !(this instanceof class_1869);
   }

   public boolean method_26920() {
      return this.field_29911 != null;
   }

   @Nullable
   public Entity method_26922() {
      if (this.field_29911 == null && this.field_29901 != 0 && this.field_41768.field_33055) {
         this.field_29911 = this.field_41768.method_29534(this.field_29901);
      }

      return this.field_29911;
   }

   public void method_26901(Entity var1, boolean var2) {
      this.field_29911 = var1;
      this.field_29899 = null;
      this.field_41722 = true;
      if (!(this.field_29911 instanceof class_704)) {
         this.field_29911.field_41722 = true;
      }

      if (!this.field_41768.field_33055 && var2 && this.field_41768 instanceof class_6331) {
         ((class_6331)this.field_41768).method_28945().method_10200(this, new class_2708(this, this.field_29911));
      }

      if (this.method_37070()) {
         this.method_37390();
      }
   }

   public void method_26894(int var1) {
      this.field_29901 = var1;
      this.method_26916(false, false);
   }

   @Override
   public boolean method_37354(Entity var1, boolean var2) {
      boolean var5 = super.method_37354(var1, var2);
      if (var5 && this.method_26920()) {
         this.method_26916(true, true);
      }

      return var5;
   }

   private void method_26844() {
      if (this.field_29899 != null && this.field_41768 instanceof class_6331) {
         if (!this.field_29899.method_25954("UUID")) {
            if (this.field_29899.method_25939("X", 99) && this.field_29899.method_25939("Y", 99) && this.field_29899.method_25939("Z", 99)) {
               class_1331 var3 = new class_1331(this.field_29899.method_25947("X"), this.field_29899.method_25947("Y"), this.field_29899.method_25947("Z"));
               this.method_26901(class_8008.method_36331(this.field_41768, var3), true);
               return;
            }
         } else {
            UUID var5 = this.field_29899.method_25926("UUID");
            Entity var4 = ((class_6331)this.field_41768).method_28925(var5);
            if (var4 != null) {
               this.method_26901(var4, true);
               return;
            }
         }

         if (this.field_41697 > 100) {
            this.method_37312(class_4897.field_25274);
            this.field_29899 = null;
         }
      }
   }

   @Override
   public boolean method_37166(int var1, ItemStack var2) {
      class_6943 var5;
      if (var1 != 98) {
         if (var1 != 99) {
            if (var1 != 100 + class_6943.field_35704.method_31767()) {
               if (var1 != 100 + class_6943.field_35708.method_31767()) {
                  if (var1 != 100 + class_6943.field_35698.method_31767()) {
                     if (var1 != 100 + class_6943.field_35700.method_31767()) {
                        return false;
                     }

                     var5 = class_6943.field_35700;
                  } else {
                     var5 = class_6943.field_35698;
                  }
               } else {
                  var5 = class_6943.field_35708;
               }
            } else {
               var5 = class_6943.field_35704;
            }
         } else {
            var5 = class_6943.field_35701;
         }
      } else {
         var5 = class_6943.field_35707;
      }

      if (!var2.method_28022() && !method_26868(var5, var2) && var5 != class_6943.field_35704) {
         return false;
      } else {
         this.method_37349(var5, var2);
         return true;
      }
   }

   @Override
   public boolean method_37069() {
      return this.method_26863() && super.method_37069();
   }

   public static boolean method_26868(class_6943 var0, ItemStack var1) {
      class_6943 var4 = method_26896(var1);
      return var4 == var0
         || var4 == class_6943.field_35707 && var0 == class_6943.field_35701
         || var4 == class_6943.field_35701 && var0 == class_6943.field_35707;
   }

   @Override
   public boolean method_26530() {
      return super.method_26530() && !this.method_26859();
   }

   public void method_26888(boolean var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_29912);
      this.field_41735.method_36633(field_29912, !var1 ? (byte)(var4 & -2) : (byte)(var4 | 1));
   }

   public void method_26932(boolean var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_29912);
      this.field_41735.method_36633(field_29912, !var1 ? (byte)(var4 & -3) : (byte)(var4 | 2));
   }

   public void method_26891(boolean var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_29912);
      this.field_41735.method_36633(field_29912, !var1 ? (byte)(var4 & -5) : (byte)(var4 | 4));
   }

   public boolean method_26859() {
      return (this.field_41735.<Byte>method_36640(field_29912) & 1) != 0;
   }

   public boolean method_26849() {
      return (this.field_41735.<Byte>method_36640(field_29912) & 2) != 0;
   }

   public boolean method_26892() {
      return (this.field_41735.<Byte>method_36640(field_29912) & 4) != 0;
   }

   public void method_26910(boolean var1) {
   }

   @Override
   public class_1736 method_26432() {
      return !this.method_26849() ? class_1736.field_8943 : class_1736.field_8940;
   }

   @Override
   public boolean method_26608(class_5834 var1) {
      return var1.method_37387() == class_6629.field_34300 && ((class_704)var1).field_3876.disableDamage ? false : super.method_26608(var1);
   }

   @Override
   public boolean method_26442(Entity var1) {
      float var4 = (float)this.method_26575(class_7331.field_37462);
      float var5 = (float)this.method_26575(class_7331.field_37467);
      if (var1 instanceof class_5834) {
         var4 += class_2931.method_13425(this.method_26446(), ((class_5834)var1).method_26550());
         var5 += (float)class_2931.method_13433(this);
      }

      int var6 = class_2931.method_13410(this);
      if (var6 > 0) {
         var1.method_37178(var6 * 4);
      }

      boolean var7 = var1.method_37181(class_6199.method_28345(this), var4);
      if (var7) {
         if (var5 > 0.0F && var1 instanceof class_5834) {
            ((class_5834)var1)
               .method_26567(
                  var5 * 0.5F,
                  (double)class_9299.method_42818(this.field_41701 * (float) (Math.PI / 180.0)),
                  (double)(-class_9299.method_42840(this.field_41701 * (float) (Math.PI / 180.0)))
               );
            this.method_37215(this.method_37098().method_6210(0.6, 1.0, 0.6));
         }

         if (var1 instanceof class_704) {
            class_704 var8 = (class_704)var1;
            this.method_26882(var8, this.method_26446(), !var8.method_26554() ? ItemStack.EMPTY : var8.method_26576());
         }

         this.method_37096(this, var1);
         this.method_26510(var1);
      }

      return var7;
   }

   private void method_26882(class_704 var1, ItemStack var2, ItemStack var3) {
      if (!var2.method_28022() && !var3.method_28022() && var2.method_27960() instanceof class_7938 && var3.method_27960() == class_4897.field_24840) {
         float var6 = 0.25F + (float)class_2931.method_13414(this) * 0.05F;
         if (this.field_41717.nextFloat() < var6) {
            var1.method_3173().method_32957(class_4897.field_24840, 100);
            this.field_41768.method_29587(var1, (byte)30);
         }
      }
   }

   public boolean method_26884() {
      if (this.field_41768.method_29602() && !this.field_41768.field_33055) {
         float var3 = this.method_37193();
         class_1331 var4 = !(this.method_37243() instanceof class_9149)
            ? new class_1331(this.method_37302(), (double)Math.round(this.method_37309()), this.method_37156())
            : new class_1331(this.method_37302(), (double)Math.round(this.method_37309()), this.method_37156()).method_6081();
         if (var3 > 0.5F && this.field_41717.nextFloat() * 30.0F < (var3 - 0.4F) * 2.0F && this.field_41768.method_25263(var4)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void method_26583(class_2307<class_2340> var1) {
      if (!this.method_26927().method_5602()) {
         this.method_37215(this.method_37098().method_6214(0.0, 0.3, 0.0));
      } else {
         super.method_26583(var1);
      }
   }

   @Override
   public void method_37247() {
      super.method_37247();
      this.method_26916(true, false);
   }

   private boolean method_26852() {
      if (!this.method_26449()) {
         if (this.field_29645 <= 0) {
            if (this.field_41697 >= 20) {
               List var3 = this.method_26923(this.method_37084());
               if (var3 != null) {
                  if (var3.size() == 1) {
                     Entity var4 = (Entity)var3.get(0);
                     double var5 = Math.max(Math.abs(this.method_37302() - var4.method_37302()) - 16.0, 0.0);
                     double var7 = Math.max(Math.abs(this.method_37156() - var4.method_37156()) - 16.0, 0.0);
                     double var9 = var5 * var5 + var7 * var7;
                     return !this.method_37176(var9);
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private List method_26923(World var1) {
      World var4 = this.method_37084();
      if (!(var4 instanceof class_174)) {
         if (!(var4 instanceof class_6331)) {
            return null;
         } else {
            class_6331 var6 = (class_6331)var4;
            return var6.method_25873();
         }
      } else {
         class_174 var5 = (class_174)var4;
         return var5.method_25873();
      }
   }

   private void method_26917() {
      this.field_29658++;
      if (this instanceof class_1173) {
         float var3 = this.method_37193();
         if (var3 > 0.5F) {
            this.field_29658 += 2;
         }
      }

      this.method_37233();
   }
}
