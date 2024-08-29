package mapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.*;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ServerWorld extends World implements Class1658 {
   public static final BlockPos field9038 = new BlockPos(100, 50, 0);
   private static final Logger field8997 = LogManager.getLogger();
   private final Int2ObjectMap<Entity> field9039 = new Int2ObjectLinkedOpenHashMap();
   private final Map<UUID, Entity> field9040 = Maps.newHashMap();
   private final Queue<Entity> field9041 = Queues.newArrayDeque();
   private final List<ServerPlayerEntity> field9042 = Lists.newArrayList();
   private final Class1703 field9043;
   public boolean field9044;
   private final MinecraftServer field9045;
   private final Class6608 field9046;
   public boolean field9047;
   private boolean field9048;
   private int field9049;
   private final Class3634 field9050;
   private final Class6805<Block> field9051 = new Class6805<Block>(
      this, var0 -> var0 == null || var0.method11579().isAir(), Registry.BLOCK::getKey, this::method6906
   );
   private final Class6805<Class7631> field9052 = new Class6805<Class7631>(
      this, var0 -> var0 == null || var0 == Class9479.field44064, Registry.field16070::getKey, this::method6905
   );
   private final Set<Class6990> field9053 = Sets.newHashSet();
   public final Class7531 field9054;
   private final ObjectLinkedOpenHashSet<Class6808> field9055 = new ObjectLinkedOpenHashSet();
   private boolean field9056;
   private final List<Class7016> field9057;
   private final Class7819 field9058;
   private final Class7480 field9059;
   private final boolean field9060;

   public ServerWorld(
      MinecraftServer var1,
      Executor var2,
      SaveFormat.LevelSave var3,
      Class6608 var4,
      RegistryKey<World> var5,
      Class9535 var6,
      Class7243 var7,
      Class5646 var8,
      boolean var9,
      long var10,
      List<Class7016> var12,
      boolean var13
   ) {
      super(var4, var5, var6, var1::method1420, false, var9, var10);
      this.field9060 = var13;
      this.field9045 = var1;
      this.field9057 = var12;
      this.field9046 = var4;
      this.field9043 = new Class1703(
         this,
         var3,
         var1.method1394(),
         var1.method1435(),
         var2,
         var8,
         var1.getPlayerList().method19478(),
         var1.method1434(),
         var7,
         () -> var1.method1317().method6945()
      );
      this.field9050 = new Class3634(this);
      this.method6766();
      this.method6768();
      this.method6810().method24544(var1.method1389());
      this.field9054 = this.method6945().<Class7531>method28767(() -> new Class7531(this), Class7531.method24615(this.method6812()));
      if (!var1.method1334()) {
         var4.method20073(var1.method1286());
      }

      this.field9059 = new Class7480(this, var1.method1436().getDimensionGeneratorSettings());
      if (!this.method6812().method36885()) {
         this.field9058 = null;
      } else {
         this.field9058 = new Class7819(this, var1.method1436().getDimensionGeneratorSettings().method26259(), var1.method1436().method20089());
      }
   }

   public void method6892(int var1, int var2, boolean var3, boolean var4) {
      this.field9046.method20061(var1);
      this.field9046.method20057(var2);
      this.field9046.method20058(var2);
      this.field9046.method20044(var3);
      this.field9046.method20055(var4);
   }

   @Override
   public Biome method6871(int var1, int var2, int var3) {
      return this.method6883().method7370().method17824().method7005(var1, var2, var3);
   }

   public Class7480 method6893() {
      return this.field9059;
   }

   public void method6894(BooleanSupplier var1) {
      IProfiler var4 = this.method6820();
      this.field9056 = true;
      var4.startSection("world border");
      this.method6810().method24555();
      var4.endStartSection("weather");
      boolean var5 = this.method6795();
      if (this.method6812().method36875()) {
         if (this.method6789().method17135(Class5462.field24242)) {
            int var6 = this.field9046.method20060();
            int var7 = this.field9046.method20059();
            int var8 = this.field9046.method20056();
            boolean var9 = this.field9018.method20042();
            boolean var10 = this.field9018.method20043();
            if (var6 <= 0) {
               if (var7 <= 0) {
                  if (!var9) {
                     var7 = this.field9016.nextInt(168000) + 12000;
                  } else {
                     var7 = this.field9016.nextInt(12000) + 3600;
                  }
               } else if (--var7 == 0) {
                  var9 = !var9;
               }

               if (var8 <= 0) {
                  if (!var10) {
                     var8 = this.field9016.nextInt(168000) + 12000;
                  } else {
                     var8 = this.field9016.nextInt(12000) + 12000;
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

            this.field9046.method20058(var7);
            this.field9046.method20057(var8);
            this.field9046.method20061(var6);
            this.field9046.method20055(var9);
            this.field9046.method20044(var10);
         }

         this.field9014 = this.field9015;
         if (!this.field9018.method20042()) {
            this.field9015 = (float)((double)this.field9015 - 0.01);
         } else {
            this.field9015 = (float)((double)this.field9015 + 0.01);
         }

         this.field9015 = MathHelper.method37777(this.field9015, 0.0F, 1.0F);
         this.field9012 = this.field9013;
         if (!this.field9018.method20043()) {
            this.field9013 = (float)((double)this.field9013 - 0.01);
         } else {
            this.field9013 = (float)((double)this.field9013 + 0.01);
         }

         this.field9013 = MathHelper.method37777(this.field9013, 0.0F, 1.0F);
      }

      if (this.field9012 != this.field9013) {
         this.field9045.getPlayerList().method19457(new Class5534(Class5534.field24567, this.field9013), this.getDimensionKey());
      }

      if (this.field9014 != this.field9015) {
         this.field9045.getPlayerList().method19457(new Class5534(Class5534.field24568, this.field9015), this.getDimensionKey());
      }

      if (var5 != this.method6795()) {
         if (!var5) {
            this.field9045.getPlayerList().method19456(new Class5534(Class5534.field24561, 0.0F));
         } else {
            this.field9045.getPlayerList().method19456(new Class5534(Class5534.field24562, 0.0F));
         }

         this.field9045.getPlayerList().method19456(new Class5534(Class5534.field24567, this.field9013));
         this.field9045.getPlayerList().method19456(new Class5534(Class5534.field24568, this.field9015));
      }

      if (this.field9048 && this.field9042.stream().noneMatch(var0 -> !var0.isSpectator() && !var0.method2909())) {
         this.field9048 = false;
         if (this.method6789().method17135(Class5462.field24232)) {
            long var11 = this.field9018.method20034() + 24000L;
            this.method6896(var11 - var11 % 24000L);
         }

         this.method6898();
         if (this.method6789().method17135(Class5462.field24242)) {
            this.method6903();
         }
      }

      this.method6766();
      this.method6895();
      var4.endStartSection("chunkSource");
      this.method6883().method7366(var1);
      var4.endStartSection("tickPending");
      if (!this.method6823()) {
         this.field9051.method20728();
         this.field9052.method20728();
      }

      var4.endStartSection("raid");
      this.field9054.method24611();
      var4.endStartSection("blockEvents");
      this.method6935();
      this.field9056 = false;
      var4.endStartSection("entities");
      boolean var13 = !this.field9042.isEmpty() || !this.method6949().isEmpty();
      if (var13) {
         this.method6904();
      }

      if (var13 || this.field9049++ < 300) {
         if (this.field9058 != null) {
            this.field9058.method26110();
         }

         this.field9044 = true;
         ObjectIterator var15 = this.field9039.int2ObjectEntrySet().iterator();

         while (var15.hasNext()) {
            Entry var18 = (Entry)var15.next();
            Entity var17 = (Entity)var18.getValue();
            Entity var20 = var17.getRidingEntity();
            if (!this.field9045.method1354() && (var17 instanceof Class1018 || var17 instanceof Class1047)) {
               var17.method2904();
            }

            if (!this.field9045.method1355() && var17 instanceof Class1059) {
               var17.method2904();
            }

            var4.startSection("checkDespawn");
            if (!var17.field5041) {
               var17.method3447();
            }

            var4.endSection();
            if (var20 != null) {
               if (!var20.field5041 && var20.method3409(var17)) {
                  continue;
               }

               var17.method2759();
            }

            var4.startSection("tick");
            if (!var17.field5041 && !(var17 instanceof Class908)) {
               this.method6754(this::method6907, var17);
            }

            var4.endSection();
            var4.startSection("remove");
            if (var17.field5041) {
               this.method6933(var17);
               var15.remove();
               this.method6930(var17);
            }

            var4.endSection();
         }

         this.field9044 = false;

         Entity var19;
         while ((var19 = this.field9041.poll()) != null) {
            this.method6931(var19);
         }

         this.method6753();
      }

      var4.endSection();
   }

   public void method6895() {
      if (this.field9060) {
         long var3 = this.field9018.method20033() + 1L;
         this.field9046.method20075(var3);
         this.field9046.method20074().run(this.field9045, var3);
         if (this.field9018.method20046().method17135(Class5462.field24232)) {
            this.method6896(this.field9018.method20034() + 1L);
         }
      }
   }

   public void method6896(long var1) {
      this.field9046.method20076(var1);
   }

   public void method6897(boolean var1, boolean var2) {
      for (Class7016 var6 : this.field9057) {
         var6.method21742(this, var1, var2);
      }
   }

   private void method6898() {
      this.field9042.stream().filter(Class880::isSleeping).collect(Collectors.toList()).forEach(var0 -> var0.stopSleepInBed(false, false));
   }

   public void method6899(Class1674 var1, int var2) {
      Class7481 var5 = var1.method7072();
      boolean var6 = this.method6795();
      int var7 = var5.method24356();
      int var8 = var5.method24357();
      IProfiler var9 = this.method6820();
      var9.startSection("thunder");
      if (var6 && this.method6794() && this.field9016.nextInt(100000) == 0) {
         BlockPos var10 = this.method6900(this.method6818(var7, 0, var8, 15));
         if (this.method6796(var10)) {
            Class9755 var11 = this.method6807(var10);
            boolean var12 = this.method6789().method17135(Class5462.field24226) && this.field9016.nextDouble() < (double)var11.method38328() * 0.01;
            if (var12) {
               Class1076 var13 = EntityType.field41079.method33215(this);
               var13.method5001(true);
               var13.method4770(0);
               var13.method3215((double)var10.getX(), (double)var10.getY(), (double)var10.getZ());
               this.method6916(var13);
            }

            Class906 var25 = EntityType.field41046.method33215(this);
            var25.method3271(Vector3d.method11330(var10));
            var25.method3549(var12);
            this.method6916(var25);
         }
      }

      var9.endStartSection("iceandsnow");
      if (this.field9016.nextInt(16) == 0) {
         BlockPos var19 = this.method7006(Class101.field299, this.method6818(var7, 0, var8, 15));
         BlockPos var21 = var19.method8313();
         Biome var23 = this.getBiome(var19);
         if (var23.method32504(this, var21)) {
            this.method6730(var21, Blocks.ICE.method11579());
         }

         if (var6 && var23.method32506(this, var19)) {
            this.method6730(var19, Blocks.SNOW.method11579());
         }

         if (var6 && this.getBiome(var21).method32500() == Class87.field224) {
            this.getBlockState(var21).getBlock().method11575(this, var21);
         }
      }

      var9.endStartSection("tickBlocks");
      if (var2 > 0) {
         for (Class7038 var26 : var1.method7067()) {
            if (var26 != Class1674.field9111 && var26.method21860()) {
               int var14 = var26.method21863();

               for (int var15 = 0; var15 < var2; var15++) {
                  BlockPos var16 = this.method6818(var7, var14, var8, 15);
                  var9.startSection("randomTick");
                  BlockState var17 = var26.method21852(var16.getX() - var7, var16.getY() - var14, var16.getZ() - var8);
                  if (var17.method23450()) {
                     var17.method23431(this, var16, this.field9016);
                  }

                  Class7379 var18 = var17.method23449();
                  if (var18.method23481()) {
                     var18.method23482(this, var16, this.field9016);
                  }

                  var9.endSection();
               }
            }
         }
      }

      var9.endSection();
   }

   public BlockPos method6900(BlockPos var1) {
      BlockPos var4 = this.method7006(Class101.field299, var1);
      Class6488 var5 = new Class6488(var4, new BlockPos(var4.getX(), this.method7034(), var4.getZ())).method19664(3.0);
      List var6 = this.<Class880>method6772(Class880.class, var5, var1x -> var1x != null && var1x.method3066() && this.method7022(var1x.getPosition()));
      if (var6.isEmpty()) {
         if (var4.getY() == -1) {
            var4 = var4.method8339(2);
         }

         return var4;
      } else {
         return ((Class880)var6.get(this.field9016.nextInt(var6.size()))).getPosition();
      }
   }

   public boolean method6901() {
      return this.field9056;
   }

   public void method6902() {
      this.field9048 = false;
      if (!this.field9042.isEmpty()) {
         int var3 = 0;
         int var4 = 0;

         for (ServerPlayerEntity var6 : this.field9042) {
            if (!var6.isSpectator()) {
               if (var6.isSleeping()) {
                  var4++;
               }
            } else {
               var3++;
            }
         }

         this.field9048 = var4 > 0 && var4 >= this.field9042.size() - var3;
      }
   }

   public Class6887 method6805() {
      return this.field9045.method1409();
   }

   private void method6903() {
      this.field9046.method20057(0);
      this.field9046.method20044(false);
      this.field9046.method20058(0);
      this.field9046.method20055(false);
   }

   public void method6904() {
      this.field9049 = 0;
   }

   private void method6905(Class8269<Class7631> var1) {
      Class7379 var4 = this.method6739(var1.field35556);
      if (var4.method23472() == var1.method28874()) {
         var4.method23479(this, var1.field35556);
      }
   }

   private void method6906(Class8269<Block> var1) {
      BlockState var4 = this.getBlockState(var1.field35556);
      if (var4.method23448(var1.method28874())) {
         var4.method23430(this, var1.field35556, this.field9016);
      }
   }

   public void method6907(Entity var1) {
      if (!(var1 instanceof PlayerEntity) && !this.method6883().method7351(var1)) {
         this.method6909(var1);
      } else {
         var1.method3274(var1.getPosX(), var1.getPosY(), var1.getPosZ());
         var1.field5033 = var1.field5031;
         var1.field5034 = var1.field5032;
         if (var1.field5071) {
            var1.field5055++;
            IProfiler var4 = this.method6820();
            var4.method22504(() -> Registry.ENTITY_TYPE.getKey(var1.getType()).toString());
            var4.func_230035_c_("tickNonPassenger");
            var1.tick();
            var4.endSection();
         }

         this.method6909(var1);
         if (var1.field5071) {
            for (Entity var5 : var1.method3408()) {
               this.method6908(var1, var5);
            }
         }
      }
   }

   public void method6908(Entity var1, Entity var2) {
      if (var2.field5041 || var2.getRidingEntity() != var1) {
         var2.method2759();
      } else if (var2 instanceof PlayerEntity || this.method6883().method7351(var2)) {
         var2.method3274(var2.getPosX(), var2.getPosY(), var2.getPosZ());
         var2.field5033 = var2.field5031;
         var2.field5034 = var2.field5032;
         if (var2.field5071) {
            var2.field5055++;
            IProfiler var5 = this.method6820();
            var5.method22504(() -> Registry.ENTITY_TYPE.getKey(var2.getType()).toString());
            var5.func_230035_c_("tickPassenger");
            var2.method2868();
            var5.endSection();
         }

         this.method6909(var2);
         if (var2.field5071) {
            for (Entity var6 : var2.method3408()) {
               this.method6908(var2, var6);
            }
         }
      }
   }

   public void method6909(Entity var1) {
      if (var1.method3406()) {
         this.method6820().startSection("chunkCheck");
         int var4 = MathHelper.floor(var1.getPosX() / 16.0);
         int var5 = MathHelper.floor(var1.getPosY() / 16.0);
         int var6 = MathHelper.floor(var1.getPosZ() / 16.0);
         if (!var1.field5071 || var1.field5072 != var4 || var1.field5073 != var5 || var1.field5074 != var6) {
            if (var1.field5071 && this.method6843(var1.field5072, var1.field5074)) {
               this.method6824(var1.field5072, var1.field5074).method7133(var1, var1.field5073);
            }

            if (!var1.method3405() && !this.method6843(var4, var6)) {
               if (var1.field5071) {
                  field8997.warn("Entity {} left loaded chunk area", var1);
               }

               var1.field5071 = false;
            } else {
               this.method6824(var4, var6).method7063(var1);
            }
         }

         this.method6820().endSection();
      }
   }

   @Override
   public boolean method6785(PlayerEntity var1, BlockPos var2) {
      return !this.field9045.method1378(this, var2, var1) && this.method6810().method24523(var2);
   }

   public void method6910(Class1339 var1, boolean var2, boolean var3) {
      Class1703 var6 = this.method6883();
      if (!var3) {
         if (var1 != null) {
            var1.displaySavingString(new TranslationTextComponent("menu.savingLevel"));
         }

         this.method6911();
         if (var1 != null) {
            var1.method6418(new TranslationTextComponent("menu.savingChunks"));
         }

         var6.method7365(var2);
      }
   }

   private void method6911() {
      if (this.field9058 != null) {
         this.field9045.method1436().method20090(this.field9058.method26109());
      }

      this.method6883().method7383().method28773();
   }

   public List<Entity> method6912(EntityType<?> var1, Predicate<? super Entity> var2) {
      ArrayList var5 = Lists.newArrayList();
      Class1703 var6 = this.method6883();
      ObjectIterator var7 = this.field9039.values().iterator();

      while (var7.hasNext()) {
         Entity var8 = (Entity)var7.next();
         if ((var1 == null || var8.getType() == var1)
            && var6.method7345(MathHelper.floor(var8.getPosX()) >> 4, MathHelper.floor(var8.getPosZ()) >> 4)
            && var2.test(var8)) {
            var5.add(var8);
         }
      }

      return var5;
   }

   public List<Class1007> method6913() {
      ArrayList var3 = Lists.newArrayList();
      ObjectIterator var4 = this.field9039.values().iterator();

      while (var4.hasNext()) {
         Entity var5 = (Entity)var4.next();
         if (var5 instanceof Class1007 && var5.method3066()) {
            var3.add((Class1007)var5);
         }
      }

      return var3;
   }

   public List<ServerPlayerEntity> method6914(Predicate<? super ServerPlayerEntity> var1) {
      ArrayList var4 = Lists.newArrayList();

      for (ServerPlayerEntity var6 : this.field9042) {
         if (var1.test(var6)) {
            var4.add(var6);
         }
      }

      return var4;
   }

   @Nullable
   public ServerPlayerEntity method6915() {
      List var3 = this.method6914(Class880::method3066);
      return !var3.isEmpty() ? (ServerPlayerEntity)var3.get(this.field9016.nextInt(var3.size())) : null;
   }

   @Override
   public boolean method6916(Entity var1) {
      return this.method6924(var1);
   }

   public boolean method6917(Entity var1) {
      return this.method6924(var1);
   }

   public void method6918(Entity var1) {
      boolean var4 = var1.field5023;
      var1.field5023 = true;
      this.method6917(var1);
      var1.field5023 = var4;
      this.method6909(var1);
   }

   public void method6919(ServerPlayerEntity var1) {
      this.method6923(var1);
      this.method6909(var1);
   }

   public void method6920(ServerPlayerEntity var1) {
      this.method6923(var1);
      this.method6909(var1);
   }

   public void method6921(ServerPlayerEntity var1) {
      this.method6923(var1);
   }

   public void method6922(ServerPlayerEntity var1) {
      this.method6923(var1);
   }

   private void method6923(ServerPlayerEntity var1) {
      Entity var4 = this.field9040.get(var1.getUniqueID());
      if (var4 != null) {
         field8997.warn("Force-added player with duplicate UUID {}", var1.getUniqueID().toString());
         var4.method3200();
         this.method6934((ServerPlayerEntity)var4);
      }

      this.field9042.add(var1);
      this.method6902();
      Class1670 var5 = this.method6724(
         MathHelper.floor(var1.getPosX() / 16.0), MathHelper.floor(var1.getPosZ() / 16.0), Class9176.field42145, true
      );
      if (var5 instanceof Class1674) {
         var5.method7063(var1);
      }

      this.method6931(var1);
   }

   private boolean method6924(Entity var1) {
      if (!var1.field5041) {
         if (!this.method6926(var1)) {
            Class1670 var4 = this.method6724(
               MathHelper.floor(var1.getPosX() / 16.0), MathHelper.floor(var1.getPosZ() / 16.0), Class9176.field42145, var1.field5023
            );
            if (var4 instanceof Class1674) {
               var4.method7063(var1);
               this.method6931(var1);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         field8997.warn("Tried to add entity {} but it was marked as removed already", EntityType.method33198(var1.getType()));
         return false;
      }
   }

   public boolean method6925(Entity var1) {
      if (!this.method6926(var1)) {
         this.method6931(var1);
         return true;
      } else {
         return false;
      }
   }

   private boolean method6926(Entity var1) {
      UUID var4 = var1.getUniqueID();
      Entity var5 = this.method6927(var4);
      if (var5 != null) {
         field8997.warn(
            "Trying to add entity with duplicated UUID {}. Existing {}#{}, new: {}#{}",
            var4,
            EntityType.method33198(var5.getType()),
            var5.method3205(),
            EntityType.method33198(var1.getType()),
            var1.method3205()
         );
         return true;
      } else {
         return false;
      }
   }

   @Nullable
   private Entity method6927(UUID var1) {
      Entity var4 = this.field9040.get(var1);
      if (var4 != null) {
         return var4;
      } else {
         if (this.field9044) {
            for (Entity var6 : this.field9041) {
               if (var6.getUniqueID().equals(var1)) {
                  return var6;
               }
            }
         }

         return null;
      }
   }

   public boolean method6928(Entity var1) {
      if (!var1.method3412().anyMatch(this::method6926)) {
         this.method6995(var1);
         return true;
      } else {
         return false;
      }
   }

   public void method6929(Class1674 var1) {
      this.field9006.addAll(var1.method7145().values());
      Class51<Entity>[] var4 = var1.method7146();
      int var5 = var4.length;

      for (int var6 = 0; var6 < var5; var6++) {
         for (Entity var8 : var4[var6]) {
            if (!(var8 instanceof ServerPlayerEntity)) {
               if (this.field9044) {
                  throw (IllegalStateException) Util.method38516(new IllegalStateException("Removing entity while ticking!"));
               }

               this.field9039.remove(var8.method3205());
               this.method6930(var8);
            }
         }
      }
   }

   public void method6930(Entity var1) {
      if (var1 instanceof Class1007) {
         for (Class908 var7 : ((Class1007)var1).method4332()) {
            var7.method2904();
         }
      }

      this.field9040.remove(var1.getUniqueID());
      this.method6883().method7377(var1);
      if (var1 instanceof ServerPlayerEntity) {
         ServerPlayerEntity var8 = (ServerPlayerEntity)var1;
         this.field9042.remove(var8);
      }

      this.method6805().method21011(var1);
      if (var1 instanceof Class1006) {
         this.field9053.remove(((Class1006)var1).method4230());
      }
   }

   private void method6931(Entity var1) {
      if (!this.field9044) {
         this.field9039.put(var1.method3205(), var1);
         if (var1 instanceof Class1007) {
            for (Class908 var7 : ((Class1007)var1).method4332()) {
               this.field9039.put(var7.method3205(), var7);
            }
         }

         this.field9040.put(var1.getUniqueID(), var1);
         this.method6883().method7378(var1);
         if (var1 instanceof Class1006) {
            this.field9053.add(((Class1006)var1).method4230());
         }
      } else {
         this.field9041.add(var1);
      }
   }

   public void method6932(Entity var1) {
      if (!this.field9044) {
         this.method6933(var1);
         this.field9039.remove(var1.method3205());
         this.method6930(var1);
      } else {
         throw (IllegalStateException) Util.method38516(new IllegalStateException("Removing entity while ticking!"));
      }
   }

   private void method6933(Entity var1) {
      Class1670 var4 = this.method6724(var1.field5072, var1.field5074, Class9176.field42145, false);
      if (var4 instanceof Class1674) {
         ((Class1674)var4).method7132(var1);
      }
   }

   public void method6934(ServerPlayerEntity var1) {
      var1.method2904();
      this.method6932(var1);
      this.method6902();
   }

   @Override
   public void method6803(int var1, BlockPos var2, int var3) {
      for (ServerPlayerEntity var7 : this.field9045.getPlayerList().method19488()) {
         if (var7 != null && var7.world == this && var7.method3205() != var1) {
            double var8 = (double)var2.getX() - var7.getPosX();
            double var10 = (double)var2.getY() - var7.getPosY();
            double var12 = (double)var2.getZ() - var7.getPosZ();
            if (var8 * var8 + var10 * var10 + var12 * var12 < 1024.0) {
               var7.field4855.sendPacket(new Class5524(var1, var2, var3));
            }
         }
      }
   }

   @Override
   public void method6743(PlayerEntity var1, double var2, double var4, double var6, Class9455 var8, Class2266 var9, float var10, float var11) {
      this.field9045
         .getPlayerList()
         .method19466(
            var1,
            var2,
            var4,
            var6,
            !(var10 > 1.0F) ? 16.0 : (double)(16.0F * var10),
            this.getDimensionKey(),
            new Class5584(var8, var9, var2, var4, var6, var10, var11)
         );
   }

   @Override
   public void method6744(PlayerEntity var1, Entity var2, Class9455 var3, Class2266 var4, float var5, float var6) {
      this.field9045
         .getPlayerList()
         .method19466(
            var1,
            var2.getPosX(),
            var2.getPosY(),
            var2.getPosZ(),
            !(var5 > 1.0F) ? 16.0 : (double)(16.0F * var5),
            this.getDimensionKey(),
            new Class5546(var3, var4, var2, var5, var6)
         );
   }

   @Override
   public void method6801(int var1, BlockPos var2, int var3) {
      this.field9045.getPlayerList().method19456(new Class5481(var1, var2, var3, true));
   }

   @Override
   public void method6869(PlayerEntity var1, int var2, BlockPos var3, int var4) {
      this.field9045
         .getPlayerList()
         .method19466(
            var1,
            (double)var3.getX(),
            (double)var3.getY(),
            (double)var3.getZ(),
            64.0,
            this.getDimensionKey(),
            new Class5481(var2, var3, var4, false)
         );
   }

   @Override
   public void method6731(BlockPos var1, BlockState var2, BlockState var3, int var4) {
      this.method6883().method7372(var1);
      Class6408 var7 = var2.method23414(this, var1);
      Class6408 var8 = var3.method23414(this, var1);
      if (Class8022.method27435(var7, var8, Class9477.field44043)) {
         for (Class6990 var10 : this.field9053) {
            if (!var10.method21646()) {
               var10.method21676(var1);
            }
         }
      }
   }

   @Override
   public void method6786(Entity var1, byte var2) {
      this.method6883().method7379(var1, new Class5464(var1, var2));
   }

   public Class1703 method6883() {
      return this.field9043;
   }

   @Override
   public Class7782 method6757(
           Entity var1, Class8654 var2, Class5924 var3, double var4, double var6, double var8, float var10, boolean var11, Class2141 var12
   ) {
      Class7782 var15 = new Class7782(this, var1, var2, var3, var4, var6, var8, var10, var11, var12);
      var15.method25784();
      var15.method25785(false);
      if (var12 == Class2141.field14014) {
         var15.method25790();
      }

      for (ServerPlayerEntity var17 : this.field9042) {
         if (var17.method3276(var4, var6, var8) < 4096.0) {
            var17.field4855.sendPacket(new Class5515(var4, var6, var8, var10, var15.method25791(), var15.method25788().get(var17)));
         }
      }

      return var15;
   }

   @Override
   public void method6787(BlockPos var1, Block var2, int var3, int var4) {
      this.field9055.add(new Class6808(var1, var2, var3, var4));
   }

   private void method6935() {
      while (!this.field9055.isEmpty()) {
         Class6808 var3 = (Class6808)this.field9055.removeFirst();
         if (this.method6936(var3)) {
            this.field9045
               .getPlayerList()
               .method19466(
                  (PlayerEntity)null,
                  (double)var3.method20740().getX(),
                  (double)var3.method20740().getY(),
                  (double)var3.method20740().getZ(),
                  64.0,
                  this.getDimensionKey(),
                  new Class5495(var3.method20740(), var3.method20741(), var3.method20742(), var3.method20743())
               );
         }
      }
   }

   private boolean method6936(Class6808 var1) {
      BlockState var4 = this.getBlockState(var1.method20740());
      return !var4.method23448(var1.method20741()) ? false : var4.method23422(this, var1.method20740(), var1.method20742(), var1.method20743());
   }

   public Class6805<Block> method6860() {
      return this.field9051;
   }

   public Class6805<Class7631> method6861() {
      return this.field9052;
   }

   @Nonnull
   @Override
   public MinecraftServer method6715() {
      return this.field9045;
   }

   public Class3634 method6937() {
      return this.field9050;
   }

   public Class8761 method6938() {
      return this.field9045.method1435();
   }

   public <T extends Class7436> int method6939(T var1, double var2, double var4, double var6, int var8, double var9, double var11, double var13, double var15) {
      Class5547 var19 = new Class5547(var1, false, var2, var4, var6, (float)var9, (float)var11, (float)var13, (float)var15, var8);
      int var20 = 0;

      for (int var21 = 0; var21 < this.field9042.size(); var21++) {
         ServerPlayerEntity var22 = this.field9042.get(var21);
         if (this.method6941(var22, false, var2, var4, var6, var19)) {
            var20++;
         }
      }

      return var20;
   }

   public <T extends Class7436> boolean method6940(
           ServerPlayerEntity var1, T var2, boolean var3, double var4, double var6, double var8, int var10, double var11, double var13, double var15, double var17
   ) {
      Class5547 var21 = new Class5547(var2, var3, var4, var6, var8, (float)var11, (float)var13, (float)var15, (float)var17, var10);
      return this.method6941(var1, var3, var4, var6, var8, var21);
   }

   private boolean method6941(ServerPlayerEntity var1, boolean var2, double var3, double var5, double var7, Packet<?> var9) {
      if (var1.getServerWorld() == this) {
         BlockPos var12 = var1.getPosition();
         if (!var12.method8317(new Vector3d(var3, var5, var7), !var2 ? 32.0 : 512.0)) {
            return false;
         } else {
            var1.field4855.sendPacket(var9);
            return true;
         }
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public Entity method6774(int var1) {
      return (Entity)this.field9039.get(var1);
   }

   @Nullable
   public Entity method6942(UUID var1) {
      return this.field9040.get(var1);
   }

   @Nullable
   public BlockPos method6943(Structure<?> var1, BlockPos var2, int var3, boolean var4) {
      return this.field9045.method1436().getDimensionGeneratorSettings().method26260() ? this.method6883().method7370().method17820(this, var1, var2, var3, var4) : null;
   }

   @Nullable
   public BlockPos method6944(Biome var1, BlockPos var2, int var3, int var4) {
      return this.method6883()
         .method7370()
         .method17824()
         .method7204(var2.getX(), var2.getY(), var2.getZ(), var3, var4, var1x -> var1x == var1, this.field9016, true);
   }

   @Override
   public Class282 method6816() {
      return this.field9045.method1407();
   }

   @Override
   public Class8933 method6817() {
      return this.field9045.method1408();
   }

   @Override
   public boolean method6819() {
      return this.field9047;
   }

   @Override
   public DynamicRegistries method6867() {
      return this.field9045.method1437();
   }

   public Class8250 method6945() {
      return this.method6883().method7383();
   }

   @Nullable
   @Override
   public Class7529 method6798(String var1) {
      return this.method6715().method1317().method6945().<Class7529>method28768(() -> new Class7529(var1), var1);
   }

   @Override
   public void method6799(Class7529 var1) {
      this.method6715().method1317().method6945().method28770(var1);
   }

   @Override
   public int method6800() {
      return this.method6715().method1317().method6945().<Class7532>method28767(Class7532::new, "idcounts").method24618();
   }

   public void method6946(BlockPos var1, float var2) {
      Class7481 var5 = new Class7481(new BlockPos(this.field9018.method20029(), 0, this.field9018.method20031()));
      this.field9018.method20041(var1, var2);
      this.method6883().method7375(Class8561.field38480, var5, 11, Class2341.field16010);
      this.method6883().method7374(Class8561.field38480, new Class7481(var1), 11, Class2341.field16010);
      this.method6715().getPlayerList().method19456(new Class5525(var1, var2));
   }

   public BlockPos method6947() {
      BlockPos var3 = new BlockPos(this.field9018.method20029(), this.field9018.method20030(), this.field9018.method20031());
      if (!this.method6810().method24523(var3)) {
         var3 = this.method7006(Class101.field299, new BlockPos(this.method6810().method24534(), 0.0, this.method6810().method24535()));
      }

      return var3;
   }

   public float method6948() {
      return this.field9018.method20032();
   }

   public LongSet method6949() {
      Class7536 var3 = this.method6945().<Class7536>method28768(Class7536::new, "chunks");
      return (LongSet)(var3 == null ? LongSets.EMPTY_SET : LongSets.unmodifiable(var3.method24638()));
   }

   public boolean method6950(int var1, int var2, boolean var3) {
      Class7536 var6 = this.method6945().<Class7536>method28767(Class7536::new, "chunks");
      Class7481 var7 = new Class7481(var1, var2);
      long var8 = var7.method24352();
      boolean var10;
      if (!var3) {
         var10 = var6.method24638().remove(var8);
      } else {
         var10 = var6.method24638().add(var8);
         if (var10) {
            this.method6824(var1, var2);
         }
      }

      var6.method24606(var10);
      if (var10) {
         this.method6883().method7350(var7, var3);
      }

      return var10;
   }

   @Override
   public List<ServerPlayerEntity> method6870() {
      return this.field9042;
   }

   @Override
   public void method6727(BlockPos var1, BlockState var2, BlockState var3) {
      Optional<Class4913> var6 = Class4913.method15187(var2);
      Optional<Class4913> var7 = Class4913.method15187(var3);
      if (!Objects.equals(var6, var7)) {
         BlockPos var8 = var1.method8353();
         var6.ifPresent(var2x -> this.method6715().execute(() -> {
               this.method6951().method6662(var8);
               Class7393.method23614(this, var8);
            }));
         var7.ifPresent(var2x -> this.method6715().execute(() -> {
               this.method6951().method6661(var8, var2x);
               Class7393.method23613(this, var8);
            }));
      }
   }

   public Class1653 method6951() {
      return this.method6883().method7384();
   }

   public boolean method6952(BlockPos var1) {
      return this.method6954(var1, 1);
   }

   public boolean method6953(Class2002 var1) {
      return this.method6952(var1.method8422());
   }

   public boolean method6954(BlockPos var1, int var2) {
      return var2 <= 6 ? this.method6955(Class2002.method8390(var1)) <= var2 : false;
   }

   public int method6955(Class2002 var1) {
      return this.method6951().method6677(var1);
   }

   public Class7531 method6956() {
      return this.field9054;
   }

   @Nullable
   public Class7699 method6957(BlockPos var1) {
      return this.field9054.method24617(var1, 9216);
   }

   public boolean method6958(BlockPos var1) {
      return this.method6957(var1) != null;
   }

   public void method6959(Class8214 var1, Entity var2, Class1062 var3) {
      var3.method4720(var1, var2);
   }

   public void method6960(Path var1) throws IOException {
      Class1649 var4 = this.method6883().field9279;

      try (BufferedWriter var5 = Files.newBufferedWriter(var1.resolve("stats.txt"))) {
         var5.write(String.format("spawning_chunks: %d\n", var4.method6566().method35138()));
         Class7307 var7 = this.method6883().method7385();
         if (var7 != null) {
            ObjectIterator var8 = var7.method23091().object2IntEntrySet().iterator();

            while (var8.hasNext()) {
               it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var9 = (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry)var8.next();
               var5.write(String.format("spawn_count.%s: %d\n", ((Class179)var9.getKey()).method517(), var9.getIntValue()));
            }
         }

         var5.write(String.format("entities: %d\n", this.field9039.size()));
         var5.write(String.format("block_entities: %d\n", this.field9003.size()));
         var5.write(String.format("block_ticks: %d\n", this.method6860().method20736()));
         var5.write(String.format("fluid_ticks: %d\n", this.method6861().method20736()));
         var5.write("distance_manager: " + var4.method6566().method35140() + "\n");
         var5.write(String.format("pending_tasks: %d\n", this.method6883().method7369()));
      }

      CrashReport var125 = new CrashReport("Level dump", new Exception("dummy"));
      this.fillCrashReport(var125);

      try (BufferedWriter var126 = Files.newBufferedWriter(var1.resolve("example_crash.txt"))) {
         var126.write(var125.getCompleteReport());
      }

      Path var127 = var1.resolve("chunks.csv");

      try (BufferedWriter var129 = Files.newBufferedWriter(var127)) {
         var4.method6568(var129);
      }

      Path var130 = var1.resolve("entities.csv");

      try (BufferedWriter var132 = Files.newBufferedWriter(var130)) {
         method6961(var132, this.field9039.values());
      }

      Path var133 = var1.resolve("block_entities.csv");

      try (BufferedWriter var135 = Files.newBufferedWriter(var133)) {
         this.method6962(var135);
      }
   }

   private static void method6961(Writer var0, Iterable<Entity> var1) throws IOException {
      Class9101 var4 = Class9101.method33937()
         .method37003("x")
         .method37003("y")
         .method37003("z")
         .method37003("uuid")
         .method37003("type")
         .method37003("alive")
         .method37003("display_name")
         .method37003("custom_name")
         .method37004(var0);

      for (Entity var6 : var1) {
         ITextComponent var7 = var6.method3380();
         ITextComponent var8 = var6.getDisplayName();
         var4.method33938(
            var6.getPosX(),
            var6.getPosY(),
            var6.getPosZ(),
            var6.getUniqueID(),
            Registry.ENTITY_TYPE.getKey(var6.getType()),
            var6.method3066(),
            var8.getString(),
            var7 == null ? null : var7.getString()
         );
      }
   }

   private void method6962(Writer var1) throws IOException {
      Class9101 var4 = Class9101.method33937().method37003("x").method37003("y").method37003("z").method37003("type").method37004(var1);

      for (TileEntity var6 : this.field9003) {
         BlockPos var7 = var6.getPos();
         var4.method33938(var7.getX(), var7.getY(), var7.getZ(), Registry.field16078.getKey(var6.method3786()));
      }
   }

   @VisibleForTesting
   public void method6963(Class9764 var1) {
      this.field9055.removeIf(var1x -> var1.method38396(var1x.method20740()));
   }

   @Override
   public void method6964(BlockPos var1, Block var2) {
      if (!this.method6823()) {
         this.method6733(var1, var2);
      }
   }

   @Override
   public float method6877(Direction var1, boolean var2) {
      return 1.0F;
   }

   public Iterable<Entity> method6965() {
      return Iterables.unmodifiableIterable(this.field9039.values());
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.field9046.method20054() + "]";
   }

   public boolean method6966() {
      return this.field9045.method1436().getDimensionGeneratorSettings().method26268();
   }

   @Override
   public long method6967() {
      return this.field9045.method1436().getDimensionGeneratorSettings().method26259();
   }

   @Nullable
   public Class7819 method6968() {
      return this.field9058;
   }

   @Override
   public Stream<? extends Class5444<?>> method6969(Class2002 var1, Structure<?> var2) {
      return this.method6893().method24340(var1, var2);
   }

   @Override
   public ServerWorld method6970() {
      return this;
   }

   @VisibleForTesting
   public String method6971() {
      return String.format(
         "players: %s, entities: %d [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.field9042.size(),
         this.field9039.size(),
         method6972(this.field9039.values(), var0 -> Registry.ENTITY_TYPE.getKey(var0.getType())),
         this.field9004.size(),
         method6972(this.field9004, var0 -> Registry.field16078.getKey(var0.method3786())),
         this.method6860().method20736(),
         this.method6861().method20736(),
         this.method6758()
      );
   }

   private static <T> String method6972(Collection<T> var0, Function<T, ResourceLocation> var1) {
      try {
         Object2IntOpenHashMap<ResourceLocation> object2intopenhashmap = new Object2IntOpenHashMap<>();

         for(T t : var0) {
            ResourceLocation resourcelocation = var1.apply(t);
            object2intopenhashmap.addTo(resourcelocation, 1);
         }

         return object2intopenhashmap.object2IntEntrySet().stream().sorted(Comparator.comparing(it.unimi.dsi.fastutil.objects.Object2IntMap.Entry<ResourceLocation>::getIntValue).reversed()).limit(5L).map((p_244523_0_) -> {
            return p_244523_0_.getKey() + ":" + p_244523_0_.getIntValue();
         }).collect(Collectors.joining(","));
      } catch (Exception exception) {
         return "";
      }
   }

   public static void method6973(ServerWorld var0) {
      BlockPos var3 = field9038;
      int var4 = var3.getX();
      int var5 = var3.getY() - 2;
      int var6 = var3.getZ();
      BlockPos.method8364(var4 - 2, var5 + 1, var6 - 2, var4 + 2, var5 + 3, var6 + 2)
         .forEach(var1 -> var0.method6730(var1, Blocks.AIR.method11579()));
      BlockPos.method8364(var4 - 2, var5, var6 - 2, var4 + 2, var5, var6 + 2).forEach(var1 -> var0.method6730(var1, Blocks.field36527.method11579()));
   }
}
