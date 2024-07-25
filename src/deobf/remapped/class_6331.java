package remapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6331 extends World implements class_700 {
   public static final BlockPos field_32327 = new BlockPos(100, 50, 0);
   private static final Logger field_32339 = LogManager.getLogger();
   private final Int2ObjectMap<Entity> field_32326 = new Int2ObjectLinkedOpenHashMap();
   private final Map<UUID, Entity> field_32341 = Maps.newHashMap();
   private final Queue<Entity> field_32336 = Queues.newArrayDeque();
   private final List<class_9359> field_32340 = Lists.newArrayList();
   private final class_2206 field_32342;
   public boolean field_32334;
   private final class_341 field_32343;
   private final class_7203 field_32345;
   public boolean field_32325;
   private boolean field_32344;
   private int field_32329;
   private final class_90 field_32337;
   private final class_2858<class_6414> field_32333 = new class_2858<class_6414>(
      this, var0 -> var0 == null || var0.method_29260().method_8345(), class_8669.field_44462::method_39797, this::method_28951
   );
   private final class_2858<class_2340> field_32348 = new class_2858<class_2340>(
      this, var0 -> var0 == null || var0 == class_8532.field_43673, class_8669.field_44447::method_39797, this::method_28949
   );
   private final Set<class_1249> field_32338 = Sets.newHashSet();
   public final class_8996 field_32346;
   private final ObjectLinkedOpenHashSet<class_970> field_32331 = new ObjectLinkedOpenHashSet();
   private boolean field_32349;
   private final List<class_1517> field_32330;
   private final class_2810 field_32332;
   private final class_2033 field_32335;
   private final boolean field_32347;

   public class_6331(
      class_341 var1,
      Executor var2,
      class_3676 var3,
      class_7203 var4,
      class_5621<World> var5,
      class_8760 var6,
      class_1870 var7,
      class_6541 var8,
      boolean var9,
      long var10,
      List<class_1517> var12,
      boolean var13
   ) {
      super(var4, var5, var6, var1::method_1704, false, var9, var10);
      this.field_32347 = var13;
      this.field_32343 = var1;
      this.field_32330 = var12;
      this.field_32345 = var4;
      this.field_32342 = new class_2206(
         this,
         var3,
         var1.method_1607(),
         var1.method_1670(),
         var2,
         var8,
         var1.method_1600().method_39970(),
         var1.method_1709(),
         var7,
         () -> var1.method_1736().method_28980()
      );
      this.field_32337 = new class_90(this);
      this.method_29541();
      this.method_29525();
      this.method_6673().method_9810(var1.method_1742());
      this.field_32346 = this.method_28980().<class_8996>method_18708(() -> new class_8996(this), class_8996.method_41270(this.method_22572()));
      if (!var1.method_1689()) {
         var4.method_25711(var1.method_1602());
      }

      this.field_32335 = new class_2033(this, var1.method_1601().method_25703());
      if (!this.method_22572().method_40224()) {
         this.field_32332 = null;
      } else {
         this.field_32332 = new class_2810(this, var1.method_1601().method_25703().method_13295(), var1.method_1601().method_25717());
      }
   }

   public void method_28927(int var1, int var2, boolean var3, boolean var4) {
      this.field_32345.method_32977(var1);
      this.field_32345.method_32971(var2);
      this.field_32345.method_32980(var2);
      this.field_32345.method_8665(var3);
      this.field_32345.method_32978(var4);
   }

   @Override
   public class_6325 method_22558(int var1, int var2, int var3) {
      return this.method_28945().method_10189().method_29817().method_28192(var1, var2, var3);
   }

   public class_2033 method_28991() {
      return this.field_32335;
   }

   public void method_28982(BooleanSupplier var1) {
      class_3492 var4 = this.method_29599();
      this.field_32349 = true;
      var4.startSection("world border");
      this.method_6673().method_9805();
      var4.method_16050("weather");
      boolean var5 = this.method_29561();
      if (this.method_22572().method_40229()) {
         if (this.method_29537().method_1285(class_291.field_1025)) {
            int var6 = this.field_32345.method_32984();
            int var7 = this.field_32345.method_32972();
            int var8 = this.field_32345.method_32975();
            boolean var9 = this.field_33035.method_8663();
            boolean var10 = this.field_33035.method_8664();
            if (var6 <= 0) {
               if (var7 <= 0) {
                  if (!var9) {
                     var7 = this.field_33033.nextInt(168000) + 12000;
                  } else {
                     var7 = this.field_33033.nextInt(12000) + 3600;
                  }
               } else if (--var7 == 0) {
                  var9 = !var9;
               }

               if (var8 <= 0) {
                  if (!var10) {
                     var8 = this.field_33033.nextInt(168000) + 12000;
                  } else {
                     var8 = this.field_33033.nextInt(12000) + 12000;
                  }
               } else if (--var8 == 0) {
                  var10 = !var10;
               }
            } else {
               var6--;
               var7 = !var9 ? 1 : 0;
               var8 = !var10 ? 1 : 0;
               var9 = false;
               var10 = false;
            }

            this.field_32345.method_32980(var7);
            this.field_32345.method_32971(var8);
            this.field_32345.method_32977(var6);
            this.field_32345.method_32978(var9);
            this.field_32345.method_8665(var10);
         }

         this.field_33040 = this.field_33045;
         if (!this.field_33035.method_8663()) {
            this.field_33045 = (float)((double)this.field_33045 - 0.01);
         } else {
            this.field_33045 = (float)((double)this.field_33045 + 0.01);
         }

         this.field_33045 = class_9299.method_42828(this.field_33045, 0.0F, 1.0F);
         this.field_33049 = this.field_33050;
         if (!this.field_33035.method_8664()) {
            this.field_33050 = (float)((double)this.field_33050 - 0.01);
         } else {
            this.field_33050 = (float)((double)this.field_33050 + 0.01);
         }

         this.field_33050 = class_9299.method_42828(this.field_33050, 0.0F, 1.0F);
      }

      if (this.field_33049 != this.field_33050) {
         this.field_32343.method_1600().method_39958(new class_2161(class_2161.field_10777, this.field_33050), this.method_29545());
      }

      if (this.field_33040 != this.field_33045) {
         this.field_32343.method_1600().method_39958(new class_2161(class_2161.field_10789, this.field_33045), this.method_29545());
      }

      if (var5 != this.method_29561()) {
         if (!var5) {
            this.field_32343.method_1600().method_39972(new class_2161(class_2161.field_10786, 0.0F));
         } else {
            this.field_32343.method_1600().method_39972(new class_2161(class_2161.field_10778, 0.0F));
         }

         this.field_32343.method_1600().method_39972(new class_2161(class_2161.field_10777, this.field_33050));
         this.field_32343.method_1600().method_39972(new class_2161(class_2161.field_10789, this.field_33045));
      }

      if (this.field_32344 && this.field_32340.stream().noneMatch(var0 -> !var0.method_37221() && !var0.method_3195())) {
         this.field_32344 = false;
         if (this.method_29537().method_1285(class_291.field_1037)) {
            long var11 = this.field_33035.method_8666() + 24000L;
            this.method_28970(var11 - var11 % 24000L);
         }

         this.method_28939();
         if (this.method_29537().method_1285(class_291.field_1025)) {
            this.method_28974();
         }
      }

      this.method_29541();
      this.method_28999();
      var4.method_16050("chunkSource");
      this.method_28945().method_10174(var1);
      var4.method_16050("tickPending");
      if (!this.method_29581()) {
         this.field_32333.method_13089();
         this.field_32348.method_13089();
      }

      var4.method_16050("raid");
      this.field_32346.method_41276();
      var4.method_16050("blockEvents");
      this.method_28963();
      this.field_32349 = false;
      var4.method_16050("entities");
      boolean var13 = !this.field_32340.isEmpty() || !this.method_28923().isEmpty();
      if (var13) {
         this.method_28932();
      }

      if (var13 || this.field_32329++ < 300) {
         if (this.field_32332 != null) {
            this.field_32332.method_12766();
         }

         this.field_32334 = true;
         ObjectIterator var15 = this.field_32326.int2ObjectEntrySet().iterator();

         while (var15.hasNext()) {
            Entry var18 = (Entry)var15.next();
            Entity var17 = (Entity)var18.getValue();
            Entity var20 = var17.method_37243();
            if (!this.field_32343.method_1702() && (var17 instanceof class_5467 || var17 instanceof class_1829)) {
               var17.method_37204();
            }

            if (!this.field_32343.method_1734() && var17 instanceof class_5908) {
               var17.method_37204();
            }

            var4.startSection("checkDespawn");
            if (!var17.field_41751) {
               var17.method_37233();
            }

            var4.endSection();
            if (var20 != null) {
               if (!var20.field_41751 && var20.method_37072(var17)) {
                  continue;
               }

               var17.method_37390();
            }

            var4.startSection("tick");
            if (!var17.field_41751 && !(var17 instanceof class_5708)) {
               this.method_29532(this::method_28997, var17);
            }

            var4.endSection();
            var4.startSection("remove");
            if (var17.field_41751) {
               this.method_28952(var17);
               var15.remove();
               this.method_28979(var17);
            }

            var4.endSection();
         }

         this.field_32334 = false;

         Entity var19;
         while ((var19 = this.field_32336.poll()) != null) {
            this.method_28960(var19);
         }

         this.method_29547();
      }

      var4.endSection();
   }

   public void method_28999() {
      if (this.field_32347) {
         long var3 = this.field_33035.method_8658() + 1L;
         this.field_32345.method_32979(var3);
         this.field_32345.method_32969().run(this.field_32343, var3);
         if (this.field_33035.method_8653().method_1285(class_291.field_1037)) {
            this.method_28970(this.field_33035.method_8666() + 1L);
         }
      }
   }

   public void method_28970(long var1) {
      this.field_32345.method_32983(var1);
   }

   public void method_28942(boolean var1, boolean var2) {
      for (class_1517 var6 : this.field_32330) {
         var6.method_6937(this, var1, var2);
      }
   }

   private void method_28939() {
      this.field_32340.stream().filter(class_5834::method_26507).collect(Collectors.toList()).forEach(var0 -> var0.method_3162(false, false));
   }

   public void method_28929(class_2654 var1, int var2) {
      class_2034 var5 = var1.method_27352();
      boolean var6 = this.method_29561();
      int var7 = var5.method_9535();
      int var8 = var5.method_9545();
      class_3492 var9 = this.method_29599();
      var9.startSection("thunder");
      if (var6 && this.method_29570() && this.field_33033.nextInt(100000) == 0) {
         BlockPos var10 = this.method_28993(this.method_29596(var7, 0, var8, 15));
         if (this.method_29569(var10)) {
            class_9589 var11 = this.method_43368(var10);
            boolean var12 = this.method_29537().method_1285(class_291.field_1028) && this.field_33033.nextDouble() < (double)var11.method_44283() * 0.01;
            if (var12) {
               class_5948 var13 = EntityType.field_34261.method_30484(this);
               var13.method_27190(true);
               var13.method_8635(0);
               var13.method_37256((double)var10.method_12173(), (double)var10.method_12165(), (double)var10.method_12185());
               this.method_7509(var13);
            }

            class_900 var25 = EntityType.field_34224.method_30484(this);
            var25.method_37196(class_1343.method_6200(var10));
            var25.method_3858(var12);
            this.method_7509(var25);
         }
      }

      var9.method_16050("iceandsnow");
      if (this.field_33033.nextInt(16) == 0) {
         BlockPos var19 = this.method_22563(class_3801.field_18595, this.method_29596(var7, 0, var8, 15));
         BlockPos var21 = var19.method_6100();
         class_6325 var23 = this.method_22561(var19);
         if (var23.method_28858(this, var21)) {
            this.method_29594(var21, class_4783.field_23496.method_29260());
         }

         if (var6 && var23.method_28882(this, var19)) {
            this.method_29594(var19, class_4783.field_23552.method_29260());
         }

         if (var6 && this.method_22561(var21).method_28866() == class_6750.field_34844) {
            this.method_28262(var21).method_8360().method_29259(this, var21);
         }
      }

      var9.method_16050("tickBlocks");
      if (var2 > 0) {
         for (class_1315 var26 : var1.method_27349()) {
            if (var26 != class_2654.field_13073 && var26.method_5994()) {
               int var14 = var26.method_5997();

               for (int var15 = 0; var15 < var2; var15++) {
                  BlockPos var16 = this.method_29596(var7, var14, var8, 15);
                  var9.startSection("randomTick");
                  class_2522 var17 = var26.method_5999(var16.method_12173() - var7, var16.method_12165() - var14, var16.method_12185() - var8);
                  if (var17.method_8331()) {
                     var17.method_8373(this, var16, this.field_33033);
                  }

                  class_4774 var18 = var17.method_8364();
                  if (var18.method_22000()) {
                     var18.method_21999(this, var16, this.field_33033);
                  }

                  var9.endSection();
               }
            }
         }
      }

      var9.endSection();
   }

   public BlockPos method_28993(BlockPos var1) {
      BlockPos var4 = this.method_22563(class_3801.field_18595, var1);
      Box var5 = new Box(var4, new BlockPos(var4.method_12173(), this.method_28261(), var4.method_12185())).method_18898(3.0);
      List var6 = this.<class_5834>method_25869(
         class_5834.class, var5, var1x -> var1x != null && var1x.method_37330() && this.method_25263(var1x.method_37075())
      );
      if (var6.isEmpty()) {
         if (var4.method_12165() == -1) {
            var4 = var4.method_6082(2);
         }

         return var4;
      } else {
         return ((class_5834)var6.get(this.field_33033.nextInt(var6.size()))).method_37075();
      }
   }

   public boolean method_28965() {
      return this.field_32349;
   }

   public void method_28928() {
      this.field_32344 = false;
      if (!this.field_32340.isEmpty()) {
         int var3 = 0;
         int var4 = 0;

         for (class_9359 var6 : this.field_32340) {
            if (!var6.method_37221()) {
               if (var6.method_26507()) {
                  var4++;
               }
            } else {
               var3++;
            }
         }

         this.field_32344 = var4 > 0 && var4 >= this.field_32340.size() - var3;
      }
   }

   public class_2917 method_28959() {
      return this.field_32343.method_1655();
   }

   private void method_28974() {
      this.field_32345.method_32971(0);
      this.field_32345.method_8665(false);
      this.field_32345.method_32980(0);
      this.field_32345.method_32978(false);
   }

   public void method_28932() {
      this.field_32329 = 0;
   }

   private void method_28949(class_4110<class_2340> var1) {
      class_4774 var4 = this.method_28258(var1.field_20034);
      if (var4.method_22005() == var1.method_19096()) {
         var4.method_22004(this, var1.field_20034);
      }
   }

   private void method_28951(class_4110<class_6414> var1) {
      class_2522 var4 = this.method_28262(var1.field_20034);
      if (var4.method_8350(var1.method_19096())) {
         var4.method_8332(this, var1.field_20034, this.field_33033);
      }
   }

   public void method_28997(Entity var1) {
      if (!(var1 instanceof class_704) && !this.method_28945().method_14824(var1)) {
         this.method_28987(var1);
      } else {
         var1.method_37306(var1.getPosX(), var1.method_37309(), var1.getPosZ());
         var1.prevRotationYaw = var1.rotationYaw;
         var1.field_41762 = var1.rotationPitch;
         if (var1.field_41727) {
            var1.field_41697++;
            class_3492 var4 = this.method_29599();
            var4.method_16057(() -> class_8669.field_44400.method_39797(var1.method_37387()).toString());
            var4.method_16055("tickNonPassenger");
            var1.method_37123();
            var4.endSection();
         }

         this.method_28987(var1);
         if (var1.field_41727) {
            for (Entity var5 : var1.method_37114()) {
               this.method_28975(var1, var5);
            }
         }
      }
   }

   public void method_28975(Entity var1, Entity var2) {
      if (var2.field_41751 || var2.method_37243() != var1) {
         var2.method_37390();
      } else if (var2 instanceof class_704 || this.method_28945().method_14824(var2)) {
         var2.method_37306(var2.getPosX(), var2.method_37309(), var2.getPosZ());
         var2.prevRotationYaw = var2.rotationYaw;
         var2.field_41762 = var2.rotationPitch;
         if (var2.field_41727) {
            var2.field_41697++;
            class_3492 var5 = this.method_29599();
            var5.method_16057(() -> class_8669.field_44400.method_39797(var2.method_37387()).toString());
            var5.method_16055("tickPassenger");
            var2.method_37189();
            var5.endSection();
         }

         this.method_28987(var2);
         if (var2.field_41727) {
            for (Entity var6 : var2.method_37114()) {
               this.method_28975(var2, var6);
            }
         }
      }
   }

   public void method_28987(Entity var1) {
      if (var1.method_37251()) {
         this.method_29599().startSection("chunkCheck");
         int var4 = class_9299.method_42847(var1.getPosX() / 16.0);
         int var5 = class_9299.method_42847(var1.method_37309() / 16.0);
         int var6 = class_9299.method_42847(var1.getPosZ() / 16.0);
         if (!var1.field_41727 || var1.field_41742 != var4 || var1.field_41747 != var5 || var1.field_41714 != var6) {
            if (var1.field_41727 && this.method_22560(var1.field_41742, var1.field_41714)) {
               this.method_29554(var1.field_41742, var1.field_41714).method_12000(var1, var1.field_41747);
            }

            if (!var1.method_37265() && !this.method_22560(var4, var6)) {
               if (var1.field_41727) {
                  field_32339.warn("Entity {} left loaded chunk area", var1);
               }

               var1.field_41727 = false;
            } else {
               this.method_29554(var4, var6).method_27342(var1);
            }
         }

         this.method_29599().endSection();
      }
   }

   @Override
   public boolean method_29538(class_704 var1, BlockPos var2) {
      return !this.field_32343.method_1618(this, var2, var1) && this.method_6673().method_9813(var2);
   }

   public void method_28971(class_1215 var1, boolean var2, boolean var3) {
      class_2206 var6 = this.method_28945();
      if (!var3) {
         if (var1 != null) {
            var1.method_5391(new TranslationTextComponent("menu.savingLevel"));
         }

         this.method_28944();
         if (var1 != null) {
            var1.method_5388(new TranslationTextComponent("menu.savingChunks"));
         }

         var6.method_10197(var2);
      }
   }

   private void method_28944() {
      if (this.field_32332 != null) {
         this.field_32343.method_1601().method_25705(this.field_32332.method_12785());
      }

      this.method_28945().method_10182().method_18705();
   }

   public List<Entity> method_28926(EntityType<?> var1, Predicate<? super Entity> var2) {
      ArrayList var5 = Lists.newArrayList();
      class_2206 var6 = this.method_28945();
      ObjectIterator var7 = this.field_32326.values().iterator();

      while (var7.hasNext()) {
         Entity var8 = (Entity)var7.next();
         if ((var1 == null || var8.method_37387() == var1)
            && var6.method_14816(class_9299.method_42847(var8.getPosX()) >> 4, class_9299.method_42847(var8.getPosZ()) >> 4)
            && var2.test(var8)) {
            var5.add(var8);
         }
      }

      return var5;
   }

   public List<class_2770> method_28947() {
      ArrayList var3 = Lists.newArrayList();
      ObjectIterator var4 = this.field_32326.values().iterator();

      while (var4.hasNext()) {
         Entity var5 = (Entity)var4.next();
         if (var5 instanceof class_2770 && var5.method_37330()) {
            var3.add((class_2770)var5);
         }
      }

      return var3;
   }

   public List<class_9359> method_28990(Predicate<? super class_9359> var1) {
      ArrayList var4 = Lists.newArrayList();

      for (class_9359 var6 : this.field_32340) {
         if (var1.test(var6)) {
            var4.add(var6);
         }
      }

      return var4;
   }

   @Nullable
   public class_9359 method_28948() {
      List var3 = this.method_28990(class_5834::method_37330);
      return !var3.isEmpty() ? (class_9359)var3.get(this.field_33033.nextInt(var3.size())) : null;
   }

   @Override
   public boolean method_7509(Entity var1) {
      return this.method_28986(var1);
   }

   public boolean method_28972(Entity var1) {
      return this.method_28986(var1);
   }

   public void method_28954(Entity var1) {
      boolean var4 = var1.field_41722;
      var1.field_41722 = true;
      this.method_28972(var1);
      var1.field_41722 = var4;
      this.method_28987(var1);
   }

   public void method_28966(class_9359 var1) {
      this.method_28973(var1);
      this.method_28987(var1);
   }

   public void method_28989(class_9359 var1) {
      this.method_28973(var1);
      this.method_28987(var1);
   }

   public void method_28931(class_9359 var1) {
      this.method_28973(var1);
   }

   public void method_28946(class_9359 var1) {
      this.method_28973(var1);
   }

   private void method_28973(class_9359 var1) {
      Entity var4 = this.field_32341.get(var1.method_37328());
      if (var4 != null) {
         field_32339.warn("Force-added player with duplicate UUID {}", var1.method_37328().toString());
         var4.method_37269();
         this.method_28964((class_9359)var4);
      }

      this.field_32340.add(var1);
      this.method_28928();
      class_5990 var5 = this.method_22555(
         class_9299.method_42847(var1.getPosX() / 16.0), class_9299.method_42847(var1.getPosZ() / 16.0), class_7335.field_37514, true
      );
      if (var5 instanceof class_2654) {
         var5.method_27342(var1);
      }

      this.method_28960(var1);
   }

   private boolean method_28986(Entity var1) {
      if (!var1.field_41751) {
         if (!this.method_28922(var1)) {
            class_5990 var4 = this.method_22555(
               class_9299.method_42847(var1.getPosX() / 16.0),
               class_9299.method_42847(var1.getPosZ() / 16.0),
               class_7335.field_37514,
               var1.field_41722
            );
            if (var4 instanceof class_2654) {
               var4.method_27342(var1);
               this.method_28960(var1);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         field_32339.warn("Tried to add entity {} but it was marked as removed already", EntityType.method_30472(var1.method_37387()));
         return false;
      }
   }

   public boolean method_28953(Entity var1) {
      if (!this.method_28922(var1)) {
         this.method_28960(var1);
         return true;
      } else {
         return false;
      }
   }

   private boolean method_28922(Entity var1) {
      UUID var4 = var1.method_37328();
      Entity var5 = this.method_28935(var4);
      if (var5 != null) {
         field_32339.warn(
            "Trying to add entity with duplicated UUID {}. Existing {}#{}, new: {}#{}",
            var4,
            EntityType.method_30472(var5.method_37387()),
            var5.method_37145(),
            EntityType.method_30472(var1.method_37387()),
            var1.method_37145()
         );
         return true;
      } else {
         return false;
      }
   }

   @Nullable
   private Entity method_28935(UUID var1) {
      Entity var4 = this.field_32341.get(var1);
      if (var4 != null) {
         return var4;
      } else {
         if (this.field_32334) {
            for (Entity var6 : this.field_32336) {
               if (var6.method_37328().equals(var1)) {
                  return var6;
               }
            }
         }

         return null;
      }
   }

   public boolean method_28933(Entity var1) {
      if (!var1.method_37122().anyMatch(this::method_28922)) {
         this.method_7065(var1);
         return true;
      } else {
         return false;
      }
   }

   public void method_28962(class_2654 var1) {
      this.field_33037.addAll(var1.method_12004().values());
      class_4722[] var4 = var1.method_11979();
      int var5 = var4.length;

      for (int var6 = 0; var6 < var5; var6++) {
         for (Entity var8 : var4[var6]) {
            if (!(var8 instanceof class_9359)) {
               if (this.field_32334) {
                  throw (IllegalStateException) Util.method_44658(new IllegalStateException("Removing entity while ticking!"));
               }

               this.field_32326.remove(var8.method_37145());
               this.method_28979(var8);
            }
         }
      }
   }

   public void method_28979(Entity var1) {
      if (var1 instanceof class_2770) {
         for (class_5708 var7 : ((class_2770)var1).method_12615()) {
            var7.method_37204();
         }
      }

      this.field_32341.remove(var1.method_37328());
      this.method_28945().method_10203(var1);
      if (var1 instanceof class_9359) {
         class_9359 var8 = (class_9359)var1;
         this.field_32340.remove(var8);
      }

      this.method_28959().method_4866(var1);
      if (var1 instanceof class_5886) {
         this.field_32338.remove(((class_5886)var1).method_26927());
      }
   }

   private void method_28960(Entity var1) {
      if (!this.field_32334) {
         this.field_32326.put(var1.method_37145(), var1);
         if (var1 instanceof class_2770) {
            for (class_5708 var7 : ((class_2770)var1).method_12615()) {
               this.field_32326.put(var7.method_37145(), var7);
            }
         }

         this.field_32341.put(var1.method_37328(), var1);
         this.method_28945().method_10180(var1);
         if (var1 instanceof class_5886) {
            this.field_32338.add(((class_5886)var1).method_26927());
         }
      } else {
         this.field_32336.add(var1);
      }
   }

   public void method_28977(Entity var1) {
      if (!this.field_32334) {
         this.method_28952(var1);
         this.field_32326.remove(var1.method_37145());
         this.method_28979(var1);
      } else {
         throw (IllegalStateException) Util.method_44658(new IllegalStateException("Removing entity while ticking!"));
      }
   }

   private void method_28952(Entity var1) {
      class_5990 var4 = this.method_22555(var1.field_41742, var1.field_41714, class_7335.field_37514, false);
      if (var4 instanceof class_2654) {
         ((class_2654)var4).method_11995(var1);
      }
   }

   public void method_28964(class_9359 var1) {
      var1.method_37204();
      this.method_28977(var1);
      this.method_28928();
   }

   @Override
   public void method_29568(int var1, BlockPos var2, int var3) {
      for (class_9359 var7 : this.field_32343.method_1600().method_39951()) {
         if (var7 != null && var7.world == this && var7.method_37145() != var1) {
            double var8 = (double)var2.method_12173() - var7.getPosX();
            double var10 = (double)var2.method_12165() - var7.method_37309();
            double var12 = (double)var2.method_12185() - var7.getPosZ();
            if (var8 * var8 + var10 * var10 + var12 * var12 < 1024.0) {
               var7.field_47794.method_4156(new class_4729(var1, var2, var3));
            }
         }
      }
   }

   @Override
   public void method_29528(class_704 var1, double var2, double var4, double var6, class_8461 var8, class_562 var9, float var10, float var11) {
      this.field_32343
         .method_1600()
         .method_39996(
            var1,
            var2,
            var4,
            var6,
            !(var10 > 1.0F) ? 16.0 : (double)(16.0F * var10),
            this.method_29545(),
            new class_3740(var8, var9, var2, var4, var6, var10, var11)
         );
   }

   @Override
   public void method_29540(class_704 var1, Entity var2, class_8461 var3, class_562 var4, float var5, float var6) {
      this.field_32343
         .method_1600()
         .method_39996(
            var1,
            var2.getPosX(),
            var2.method_37309(),
            var2.getPosZ(),
            !(var5 > 1.0F) ? 16.0 : (double)(16.0F * var5),
            this.method_29545(),
            new class_2404(var3, var4, var2, var5, var6)
         );
   }

   @Override
   public void method_29589(int var1, BlockPos var2, int var3) {
      this.field_32343.method_1600().method_39972(new class_6639(var1, var2, var3, true));
   }

   @Override
   public void method_43365(class_704 var1, int var2, BlockPos var3, int var4) {
      this.field_32343
         .method_1600()
         .method_39996(
            var1,
            (double)var3.method_12173(),
            (double)var3.method_12165(),
            (double)var3.method_12185(),
            64.0,
            this.method_29545(),
            new class_6639(var2, var3, var4, false)
         );
   }

   @Override
   public void method_29572(BlockPos var1, class_2522 var2, class_2522 var3, int var4) {
      this.method_28945().method_10195(var1);
      class_4190 var7 = var2.method_8324(this, var1);
      class_4190 var8 = var3.method_8324(this, var1);
      if (class_3370.method_15537(var7, var8, class_8529.field_43658)) {
         for (class_1249 var10 : this.field_32338) {
            if (!var10.method_5604()) {
               var10.method_5625(var1);
            }
         }
      }
   }

   @Override
   public void method_29587(Entity var1, byte var2) {
      this.method_28945().method_10209(var1, new class_295(var1, var2));
   }

   public class_2206 method_28945() {
      return this.field_32342;
   }

   @Override
   public class_2730 method_29575(
           Entity var1, DamageSource var2, class_7571 var3, double var4, double var6, double var8, float var10, boolean var11, class_7298 var12
   ) {
      class_2730 var15 = new class_2730(this, var1, var2, var3, var4, var6, var8, var10, var11, var12);
      var15.method_12266();
      var15.method_12272(false);
      if (var12 == class_7298.field_37310) {
         var15.method_12269();
      }

      for (class_9359 var17 : this.field_32340) {
         if (var17.method_37273(var4, var6, var8) < 4096.0) {
            var17.field_47794.method_4156(new class_1897(var4, var6, var8, var10, var15.method_12275(), var15.method_12267().get(var17)));
         }
      }

      return var15;
   }

   @Override
   public void method_29521(BlockPos var1, class_6414 var2, int var3, int var4) {
      this.field_32331.add(new class_970(var1, var2, var3, var4));
   }

   private void method_28963() {
      while (!this.field_32331.isEmpty()) {
         class_970 var3 = (class_970)this.field_32331.removeFirst();
         if (this.method_28924(var3)) {
            this.field_32343
               .method_1600()
               .method_39996(
                  (class_704)null,
                  (double)var3.method_4248().method_12173(),
                  (double)var3.method_4248().method_12165(),
                  (double)var3.method_4248().method_12185(),
                  64.0,
                  this.method_29545(),
                  new class_6944(var3.method_4248(), var3.method_4252(), var3.method_4251(), var3.method_4250())
               );
         }
      }
   }

   private boolean method_28924(class_970 var1) {
      class_2522 var4 = this.method_28262(var1.method_4248());
      return !var4.method_8350(var1.method_4252()) ? false : var4.method_8354(this, var1.method_4248(), var1.method_4251(), var1.method_4250());
   }

   public class_2858<class_6414> method_28968() {
      return this.field_32333;
   }

   public class_2858<class_2340> method_28940() {
      return this.field_32348;
   }

   @Nonnull
   @Override
   public class_341 method_29522() {
      return this.field_32343;
   }

   public class_90 method_28996() {
      return this.field_32337;
   }

   public class_5799 method_28978() {
      return this.field_32343.method_1670();
   }

   public <T extends class_5079> int method_28957(
      T var1, double var2, double var4, double var6, int var8, double var9, double var11, double var13, double var15
   ) {
      class_662 var19 = new class_662(var1, false, var2, var4, var6, (float)var9, (float)var11, (float)var13, (float)var15, var8);
      int var20 = 0;

      for (int var21 = 0; var21 < this.field_32340.size(); var21++) {
         class_9359 var22 = this.field_32340.get(var21);
         if (this.method_28976(var22, false, var2, var4, var6, var19)) {
            var20++;
         }
      }

      return var20;
   }

   public <T extends class_5079> boolean method_28958(
      class_9359 var1, T var2, boolean var3, double var4, double var6, double var8, int var10, double var11, double var13, double var15, double var17
   ) {
      class_662 var21 = new class_662(var2, var3, var4, var6, var8, (float)var11, (float)var13, (float)var15, (float)var17, var10);
      return this.method_28976(var1, var3, var4, var6, var8, var21);
   }

   private boolean method_28976(class_9359 var1, boolean var2, double var3, double var5, double var7, Packet<?> var9) {
      if (var1.method_43235() == this) {
         BlockPos var12 = var1.method_37075();
         if (!var12.method_12170(new class_1343(var3, var5, var7), !var2 ? 32.0 : 512.0)) {
            return false;
         } else {
            var1.field_47794.method_4156(var9);
            return true;
         }
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public Entity method_29534(int var1) {
      return (Entity)this.field_32326.get(var1);
   }

   @Nullable
   public Entity method_28925(UUID var1) {
      return this.field_32341.get(var1);
   }

   @Nullable
   public BlockPos method_29000(class_5390<?> var1, BlockPos var2, int var3, boolean var4) {
      return this.field_32343.method_1601().method_25703().method_13287()
         ? this.method_28945().method_10189().method_29820(this, var1, var2, var3, var4)
         : null;
   }

   @Nullable
   public BlockPos method_29001(class_6325 var1, BlockPos var2, int var3, int var4) {
      return this.method_28945()
         .method_10189()
         .method_29817()
         .method_16084(var2.method_12173(), var2.method_12165(), var2.method_12185(), var3, var4, var1x -> var1x == var1, this.field_33033, true);
   }

   @Override
   public class_5023 method_29549() {
      return this.field_32343.method_1705();
   }

   @Override
   public class_6437 method_29600() {
      return this.field_32343.method_1754();
   }

   @Override
   public boolean method_29590() {
      return this.field_32325;
   }

   @Override
   public class_6322 method_2755() {
      return this.field_32343.method_1735();
   }

   public class_4050 method_28980() {
      return this.method_28945().method_10182();
   }

   @Nullable
   @Override
   public class_2134 method_29533(String var1) {
      return this.method_29522().method_1736().method_28980().<class_2134>method_18707(() -> new class_2134(var1), var1);
   }

   @Override
   public void method_29524(class_2134 var1) {
      this.method_29522().method_1736().method_28980().method_18702(var1);
   }

   @Override
   public int method_29564() {
      return this.method_29522().method_1736().method_28980().<class_5265>method_18708(class_5265::new, "idcounts").method_24031();
   }

   public void method_28941(BlockPos var1, float var2) {
      class_2034 var5 = new class_2034(new BlockPos(this.field_33035.method_8654(), 0, this.field_33035.method_8655()));
      this.field_33035.method_4988(var1, var2);
      this.method_28945().method_10193(class_5032.field_26021, var5, 11, Unit.INSTANCE);
      this.method_28945().method_10177(class_5032.field_26021, new class_2034(var1), 11, Unit.INSTANCE);
      this.method_29522().method_1600().method_39972(new class_2073(var1, var2));
   }

   public BlockPos method_28998() {
      BlockPos var3 = new BlockPos(this.field_33035.method_8654(), this.field_33035.method_8660(), this.field_33035.method_8655());
      if (!this.method_6673().method_9813(var3)) {
         var3 = this.method_22563(class_3801.field_18595, new BlockPos(this.method_6673().method_9807(), 0.0, this.method_6673().method_9835()));
      }

      return var3;
   }

   public float method_28988() {
      return this.field_33035.method_8657();
   }

   public LongSet method_28923() {
      class_2497 var3 = this.method_28980().<class_2497>method_18707(class_2497::new, "chunks");
      return (LongSet)(var3 == null ? LongSets.EMPTY_SET : LongSets.unmodifiable(var3.method_11410()));
   }

   public boolean method_28961(int var1, int var2, boolean var3) {
      class_2497 var6 = this.method_28980().<class_2497>method_18708(class_2497::new, "chunks");
      class_2034 var7 = new class_2034(var1, var2);
      long var8 = var7.method_9539();
      boolean var10;
      if (!var3) {
         var10 = var6.method_11410().remove(var8);
      } else {
         var10 = var6.method_11410().add(var8);
         if (var10) {
            this.method_29554(var1, var2);
         }
      }

      var6.method_32922(var10);
      if (var10) {
         this.method_28945().method_14817(var7, var3);
      }

      return var10;
   }

   @Override
   public List<class_9359> method_25873() {
      return this.field_32340;
   }

   @Override
   public void method_29550(BlockPos var1, class_2522 var2, class_2522 var3) {
      Optional var6 = class_236.method_1004(var2);
      Optional var7 = class_236.method_1004(var3);
      if (!Objects.equals(var6, var7)) {
         BlockPos var8 = var1.method_6072();
         var6.ifPresent(var2x -> this.method_29522().execute(() -> {
               this.method_28969().method_6864(var8);
               class_1892.method_8432(this, var8);
            }));
         var7.ifPresent(var2x -> this.method_29522().execute(() -> {
               this.method_28969().method_6878(var8, var2x);
               class_1892.method_8434(this, var8);
            }));
      }
   }

   public class_1489 method_28969() {
      return this.method_28945().method_10176();
   }

   public boolean method_28994(BlockPos var1) {
      return this.method_28981(var1, 1);
   }

   public boolean method_28995(class_6979 var1) {
      return this.method_28994(var1.method_31892());
   }

   public boolean method_28981(BlockPos var1, int var2) {
      return var2 <= 6 ? this.method_28956(class_6979.method_31921(var1)) <= var2 : false;
   }

   public int method_28956(class_6979 var1) {
      return this.method_28969().method_6871(var1);
   }

   public class_8996 method_28985() {
      return this.field_32346;
   }

   @Nullable
   public class_2452 method_28984(BlockPos var1) {
      return this.field_32346.method_41272(var1, 9216);
   }

   public boolean method_28983(BlockPos var1) {
      return this.method_28984(var1) != null;
   }

   public void method_28955(class_3894 var1, Entity var2, class_5545 var3) {
      var3.method_25223(var1, var2);
   }

   public void method_28992(Path var1) throws IOException {
      class_916 var4 = this.method_28945().field_10934;

      try (BufferedWriter var5 = Files.newBufferedWriter(var1.resolve("stats.txt"))) {
         var5.write(String.format("spawning_chunks: %d\n", var4.method_3996().method_42677()));
         class_1728 var7 = this.method_28945().method_10185();
         if (var7 != null) {
            ObjectIterator var8 = var7.method_7732().object2IntEntrySet().iterator();

            while (var8.hasNext()) {
               it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var9 = (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry)var8.next();
               var5.write(String.format("spawn_count.%s: %d\n", ((class_4565)var9.getKey()).method_21202(), var9.getIntValue()));
            }
         }

         var5.write(String.format("entities: %d\n", this.field_32326.size()));
         var5.write(String.format("block_entities: %d\n", this.field_33053.size()));
         var5.write(String.format("block_ticks: %d\n", this.method_28968().method_13097()));
         var5.write(String.format("fluid_ticks: %d\n", this.method_28940().method_13097()));
         var5.write("distance_manager: " + var4.method_3996().method_42698() + "\n");
         var5.write(String.format("pending_tasks: %d\n", this.method_28945().method_10184()));
      }

      class_159 var125 = new class_159("Level dump", new Exception("dummy"));
      this.method_29548(var125);

      try (BufferedWriter var126 = Files.newBufferedWriter(var1.resolve("example_crash.txt"))) {
         var126.write(var125.method_632());
      }

      Path var127 = var1.resolve("chunks.csv");

      try (BufferedWriter var129 = Files.newBufferedWriter(var127)) {
         var4.method_3999(var129);
      }

      Path var130 = var1.resolve("entities.csv");

      try (BufferedWriter var132 = Files.newBufferedWriter(var130)) {
         method_28950(var132, this.field_32326.values());
      }

      Path var133 = var1.resolve("block_entities.csv");

      try (BufferedWriter var135 = Files.newBufferedWriter(var133)) {
         this.method_28921(var135);
      }
   }

   private static void method_28950(Writer var0, Iterable<Entity> var1) throws IOException {
      class_7012 var4 = class_7012.method_32026()
         .method_40500("x")
         .method_40500("y")
         .method_40500("z")
         .method_40500("uuid")
         .method_40500("type")
         .method_40500("alive")
         .method_40500("display_name")
         .method_40500("custom_name")
         .method_40499(var0);

      for (Entity var6 : var1) {
         ITextComponent var7 = var6.method_45508();
         ITextComponent var8 = var6.method_19839();
         var4.method_32024(
            var6.getPosX(),
            var6.method_37309(),
            var6.getPosZ(),
            var6.method_37328(),
            class_8669.field_44400.method_39797(var6.method_37387()),
            var6.method_37330(),
            var8.getString(),
            var7 == null ? null : var7.getString()
         );
      }
   }

   private void method_28921(Writer var1) throws IOException {
      class_7012 var4 = class_7012.method_32026().method_40500("x").method_40500("y").method_40500("z").method_40500("type").method_40499(var1);

      for (class_3757 var6 : this.field_33053) {
         BlockPos var7 = var6.method_17399();
         var4.method_32024(var7.method_12173(), var7.method_12165(), var7.method_12185(), class_8669.field_44426.method_39797(var6.method_17405()));
      }
   }

   @VisibleForTesting
   public void method_28937(class_9616 var1) {
      this.field_32331.removeIf(var1x -> var1.method_44395(var1x.method_4248()));
   }

   @Override
   public void method_43369(BlockPos var1, class_6414 var2) {
      if (!this.method_29581()) {
         this.method_29563(var1, var2);
      }
   }

   @Override
   public float method_25265(Direction var1, boolean var2) {
      return 1.0F;
   }

   public Iterable<Entity> method_28938() {
      return Iterables.unmodifiableIterable(this.field_32326.values());
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.field_32345.method_25716() + "]";
   }

   public boolean method_28943() {
      return this.field_32343.method_1601().method_25703().method_13288();
   }

   @Override
   public long method_3133() {
      return this.field_32343.method_1601().method_25703().method_13295();
   }

   @Nullable
   public class_2810 method_28967() {
      return this.field_32332;
   }

   @Override
   public Stream<? extends class_3200<?>> method_3132(class_6979 var1, class_5390<?> var2) {
      return this.method_28991().method_9531(var1, var2);
   }

   @Override
   public class_6331 method_7066() {
      return this;
   }

   @VisibleForTesting
   public String method_28934() {
      return String.format(
         "players: %s, entities: %d [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.field_32340.size(),
         this.field_32326.size(),
         method_28930(this.field_32326.values(), var0 -> class_8669.field_44400.method_39797(var0.method_37387())),
         this.field_33031.size(),
         method_28930(this.field_33031, var0 -> class_8669.field_44426.method_39797(var0.method_17405())),
         this.method_28968().method_13097(),
         this.method_28940().method_13097(),
         this.method_29580()
      );
   }

   private static <T> String method_28930(Collection<T> var0, Function<T, Identifier> var1) {
      try {
         Object2IntOpenHashMap var4 = new Object2IntOpenHashMap();

         for (Object var6 : var0) {
            Identifier var7 = (Identifier)var1.apply(var6);
            var4.addTo(var7, 1);
         }

         return var4.object2IntEntrySet()
            .stream()
            .sorted(Comparator.comparing(it.unimi.dsi.fastutil.objects.Object2IntMap.Entry::getIntValue).reversed())
            .limit(5L)
            .<CharSequence>map(var0x -> var0x.getKey() + ":" + var0x.getIntValue())
            .collect(Collectors.joining(","));
      } catch (Exception var8) {
         return "";
      }
   }

   public static void method_28936(class_6331 var0) {
      BlockPos var3 = field_32327;
      int var4 = var3.method_12173();
      int var5 = var3.method_12165() - 2;
      int var6 = var3.method_12185();
      BlockPos.method_6075(var4 - 2, var5 + 1, var6 - 2, var4 + 2, var5 + 3, var6 + 2)
         .forEach(var1 -> var0.method_29594(var1, class_4783.field_23184.method_29260()));
      BlockPos.method_6075(var4 - 2, var5, var6 - 2, var4 + 2, var5, var6 + 2)
         .forEach(var1 -> var0.method_29594(var1, class_4783.field_23881.method_29260()));
   }
}
