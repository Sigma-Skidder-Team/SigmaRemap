package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public abstract class World implements Class1660, AutoCloseable {
   public static final Logger field8997 = LogManager.getLogger();
   public static final Codec<RegistryKey<World>> field8998 = ResourceLocation.field13020
      .xmap(RegistryKey.<World>method31400(Registry.field16067), RegistryKey::method31399);
   public static final RegistryKey<World> field8999 = RegistryKey.<World>method31395(Registry.field16067, new ResourceLocation("overworld"));
   public static final RegistryKey<World> field9000 = RegistryKey.<World>method31395(Registry.field16067, new ResourceLocation("the_nether"));
   public static final RegistryKey<World> THE_END = RegistryKey.<World>method31395(Registry.field16067, new ResourceLocation("the_end"));
   private static final Direction[] field9002 = Direction.values();
   public final List<Class944> field9003 = Lists.newArrayList();
   public final List<Class944> field9004 = Lists.newArrayList();
   public final List<Class944> field9005 = Lists.newArrayList();
   public final List<Class944> field9006 = Lists.newArrayList();
   private final Thread field9007;
   private final boolean field9008;
   private int field9009;
   public int field9010 = new Random().nextInt();
   public final int field9011 = 1013904223;
   public float field9012;
   public float field9013;
   public float field9014;
   public float field9015;
   public final Random field9016 = new Random();
   private final Class9535 field9017;
   public final Class6607 field9018;
   private final Supplier<Class7165> field9019;
   public final boolean field9020;
   public boolean field9021;
   private final Class7522 field9022;
   private final Class6668 field9023;
   private final RegistryKey<World> field9024;

   public World(Class6607 var1, RegistryKey<World> var2, Class9535 var3, Supplier<Class7165> var4, boolean var5, boolean var6, long var7) {
      this.field9019 = var4;
      this.field9018 = var1;
      this.field9017 = var3;
      this.field9024 = var2;
      this.field9020 = var5;
      if (var3.method36879() == 1.0) {
         this.field9022 = new Class7522();
      } else {
         this.field9022 = new Class7523(this, var3);
      }

      this.field9007 = Thread.currentThread();
      this.field9023 = new Class6668(this, var7, var3.method36886());
      this.field9008 = var6;
   }

   @Override
   public boolean method6714() {
      return this.field9020;
   }

   @Nullable
   public MinecraftServer method6715() {
      return null;
   }

   public static boolean method6716(BlockPos var0) {
      return !method6720(var0) && method6718(var0);
   }

   public static boolean method6717(BlockPos var0) {
      return !method6719(var0.getY()) && method6718(var0);
   }

   private static boolean method6718(BlockPos var0) {
      return var0.method8304() >= -30000000 && var0.method8306() >= -30000000 && var0.method8304() < 30000000 && var0.method8306() < 30000000;
   }

   private static boolean method6719(int var0) {
      return var0 < -20000000 || var0 >= 20000000;
   }

   public static boolean method6720(BlockPos var0) {
      return method6721(var0.getY());
   }

   public static boolean method6721(int var0) {
      return var0 < 0 || var0 >= 256;
   }

   public Class1674 method6722(BlockPos var1) {
      return this.method6824(var1.method8304() >> 4, var1.method8306() >> 4);
   }

   public Class1674 method6824(int var1, int var2) {
      return (Class1674)this.method7012(var1, var2, Class9176.field42145);
   }

   @Override
   public Class1670 method6724(int var1, int var2, Class9176 var3, boolean var4) {
      Class1670 var7 = this.method6883().method7346(var1, var2, var3, var4);
      if (var7 == null && var4) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return var7;
      }
   }

   @Override
   public boolean method6725(BlockPos var1, Class7380 var2, int var3) {
      return this.method6726(var1, var2, var3, 512);
   }

   @Override
   public boolean method6726(BlockPos var1, Class7380 var2, int var3, int var4) {
      if (method6720(var1)) {
         return false;
      } else if (!this.field9020 && this.method6823()) {
         return false;
      } else {
         Class1674 var7 = this.method6722(var1);
         Block var8 = var2.method23383();
         Class7380 var9 = var7.method7061(var1, var2, (var3 & 64) != 0);
         if (var9 == null) {
            return false;
         } else {
            Class7380 var10 = this.method6738(var1);
            if ((var3 & 128) == 0
               && var10 != var9
               && (
                  var10.method23387(this, var1) != var9.method23387(this, var1)
                     || var10.method23392() != var9.method23392()
                     || var10.method23391()
                     || var9.method23391()
               )) {
               this.method6820().startSection("queueCheckLight");
               this.method6883().method7348().method602(var1);
               this.method6820().endSection();
            }

            if (var10 == var2) {
               if (var9 != var10) {
                  this.method6732(var1, var9, var10);
               }

               if ((var3 & 2) != 0
                  && (!this.field9020 || (var3 & 4) == 0)
                  && (this.field9020 || var7.method7152() != null && var7.method7152().method249(Class77.field168))) {
                  this.method6731(var1, var9, var2, var3);
               }

               if ((var3 & 1) != 0) {
                  this.method6964(var1, var9.method23383());
                  if (!this.field9020 && var2.method23403()) {
                     this.method6806(var1, var8);
                  }
               }

               if ((var3 & 16) == 0 && var4 > 0) {
                  int var11 = var3 & -34;
                  var9.method23427(this, var1, var11, var4 - 1);
                  var2.method23425(this, var1, var11, var4 - 1);
                  var2.method23427(this, var1, var11, var4 - 1);
               }

               this.method6727(var1, var9, var10);
            }

            return true;
         }
      }
   }

   public void method6727(BlockPos var1, Class7380 var2, Class7380 var3) {
   }

   @Override
   public boolean method6728(BlockPos var1, boolean var2) {
      Class7379 var5 = this.method6739(var1);
      return this.method6725(var1, var5.method23484(), 3 | (!var2 ? 0 : 64));
   }

   @Override
   public boolean method6729(BlockPos var1, boolean var2, Entity var3, int var4) {
      Class7380 var7 = this.method6738(var1);
      if (!var7.method23393()) {
         Class7379 var8 = this.method6739(var1);
         if (!(var7.method23383() instanceof Class3397)) {
            this.method6999(2001, var1, Block.method11535(var7));
         }

         if (var2) {
            Class944 var9 = !var7.method23383().method11998() ? null : this.method6759(var1);
            Block.method11556(var7, this, var1, var9, var3, ItemStack.EMPTY);
         }

         return this.method6726(var1, var8.method23484(), 3, var4);
      } else {
         return false;
      }
   }

   public boolean method6730(BlockPos var1, Class7380 var2) {
      return this.method6725(var1, var2, 3);
   }

   public abstract void method6731(BlockPos var1, Class7380 var2, Class7380 var3, int var4);

   public void method6732(BlockPos var1, Class7380 var2, Class7380 var3) {
   }

   public void method6733(BlockPos var1, Block var2) {
      this.method6735(var1.method8345(), var2, var1);
      this.method6735(var1.method8347(), var2, var1);
      this.method6735(var1.method8313(), var2, var1);
      this.method6735(var1.method8311(), var2, var1);
      this.method6735(var1.method8341(), var2, var1);
      this.method6735(var1.method8343(), var2, var1);
   }

   public void method6734(BlockPos var1, Block var2, Direction var3) {
      if (var3 != Direction.WEST) {
         this.method6735(var1.method8345(), var2, var1);
      }

      if (var3 != Direction.EAST) {
         this.method6735(var1.method8347(), var2, var1);
      }

      if (var3 != Direction.field672) {
         this.method6735(var1.method8313(), var2, var1);
      }

      if (var3 != Direction.field673) {
         this.method6735(var1.method8311(), var2, var1);
      }

      if (var3 != Direction.NORTH) {
         this.method6735(var1.method8341(), var2, var1);
      }

      if (var3 != Direction.SOUTH) {
         this.method6735(var1.method8343(), var2, var1);
      }
   }

   public void method6735(BlockPos var1, Block var2, BlockPos var3) {
      if (!this.field9020) {
         Class7380 var6 = this.method6738(var1);

         try {
            var6.method23423(this, var1, var2, var3, false);
         } catch (Throwable var10) {
            Class4526 var8 = Class4526.method14413(var10, "Exception while updating neighbours");
            Class8965 var9 = var8.method14410("Block being updated");
            var9.method32806("Source block type", () -> {
               try {
                  return String.format("ID #%s (%s // %s)", Registry.field16072.method9181(var2), var2.method11566(), var2.getClass().getCanonicalName());
               } catch (Throwable var4) {
                  return "ID #" + Registry.field16072.method9181(var2);
               }
            });
            Class8965.method32814(var9, var1, var6);
            throw new Class2506(var8);
         }
      }
   }

   @Override
   public int method6736(Class101 var1, int var2, int var3) {
      int var6;
      if (var2 >= -30000000 && var3 >= -30000000 && var2 < 30000000 && var3 < 30000000) {
         if (!this.method6843(var2 >> 4, var3 >> 4)) {
            var6 = 0;
         } else {
            var6 = this.method6824(var2 >> 4, var3 >> 4).method7071(var1, var2 & 15, var3 & 15) + 1;
         }
      } else {
         var6 = this.method6776() + 1;
      }

      return var6;
   }

   @Override
   public Class196 method6737() {
      return this.method6883().method7348();
   }

   @Override
   public Class7380 method6738(BlockPos var1) {
      if (!method6720(var1)) {
         Class1674 var4 = this.method6824(var1.method8304() >> 4, var1.method8306() >> 4);
         return var4.method6738(var1);
      } else {
         return Blocks.field37011.method11579();
      }
   }

   @Override
   public Class7379 method6739(BlockPos var1) {
      if (!method6720(var1)) {
         Class1674 var4 = this.method6722(var1);
         return var4.method6739(var1);
      } else {
         return Class9479.field44064.method25049();
      }
   }

   public boolean method6740() {
      return !this.method6812().method36887() && this.field9009 < 4;
   }

   public boolean method6741() {
      return !this.method6812().method36887() && !this.method6740();
   }

   @Override
   public void method6742(PlayerEntity var1, BlockPos var2, Class9455 var3, Class2266 var4, float var5, float var6) {
      this.method6743(var1, (double)var2.method8304() + 0.5, (double)var2.getY() + 0.5, (double)var2.method8306() + 0.5, var3, var4, var5, var6);
   }

   public abstract void method6743(PlayerEntity var1, double var2, double var4, double var6, Class9455 var8, Class2266 var9, float var10, float var11);

   public abstract void method6744(PlayerEntity var1, Entity var2, Class9455 var3, Class2266 var4, float var5, float var6);

   public void method6745(double var1, double var3, double var5, Class9455 var7, Class2266 var8, float var9, float var10, boolean var11) {
   }

   @Override
   public void method6746(Class7436 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   public void method6747(Class7436 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
   }

   public void method6748(Class7436 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   public void method6749(Class7436 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
   }

   public float method6750(float var1) {
      float var4 = this.method7001(var1);
      return var4 * (float) (Math.PI * 2);
   }

   public boolean method6751(Class944 var1) {
      if (this.field9021) {
         field8997.error(
            "Adding block entity while ticking: {} @ {}",
            new org.apache.logging.log4j.util.Supplier[]{() -> Registry.field16078.method9181(var1.method3786()), var1::method3774}
         );
      }

      boolean var4 = this.field9003.add(var1);
      if (var4 && var1 instanceof Class935) {
         this.field9004.add(var1);
      }

      if (this.field9020) {
         BlockPos var5 = var1.method3774();
         Class7380 var6 = this.method6738(var5);
         this.method6731(var5, var6, var6, 2);
      }

      return var4;
   }

   public void method6752(Collection<Class944> var1) {
      if (!this.field9021) {
         for (Class944 var5 : var1) {
            this.method6751(var5);
         }
      } else {
         this.field9005.addAll(var1);
      }
   }

   public void method6753() {
      Class7165 var3 = this.method6820();
      var3.startSection("blockEntities");
      if (!this.field9006.isEmpty()) {
         this.field9004.removeAll(this.field9006);
         this.field9003.removeAll(this.field9006);
         this.field9006.clear();
      }

      this.field9021 = true;
      Iterator var4 = this.field9004.iterator();

      while (var4.hasNext()) {
         Class944 var5 = (Class944)var4.next();
         if (!var5.method3778() && var5.method3770()) {
            BlockPos var6 = var5.method3774();
            if (this.method6883().method7353(var6) && this.method6810().method24523(var6)) {
               try {
                  var3.method22504(() -> String.valueOf(Class4387.method13793(var5.method3786())));
                  if (var5.method3786().method13796(this.method6738(var6).method23383())) {
                     ((Class935)var5).method3647();
                  } else {
                     var5.method3787();
                  }

                  var3.endSection();
               } catch (Throwable var10) {
                  Class4526 var8 = Class4526.method14413(var10, "Ticking block entity");
                  Class8965 var9 = var8.method14410("Block entity being ticked");
                  var5.method3781(var9);
                  throw new Class2506(var8);
               }
            }
         }

         if (var5.method3778()) {
            var4.remove();
            this.field9003.remove(var5);
            if (this.method7017(var5.method3774())) {
               this.method6722(var5.method3774()).method7081(var5.method3774());
            }
         }
      }

      this.field9021 = false;
      var3.endStartSection("pendingBlockEntities");
      if (!this.field9005.isEmpty()) {
         for (int var11 = 0; var11 < this.field9005.size(); var11++) {
            Class944 var12 = this.field9005.get(var11);
            if (!var12.method3778()) {
               if (!this.field9003.contains(var12)) {
                  this.method6751(var12);
               }

               if (this.method7017(var12.method3774())) {
                  Class1674 var7 = this.method6722(var12.method3774());
                  Class7380 var13 = var7.method6738(var12.method3774());
                  var7.method7062(var12.method3774(), var12);
                  this.method6731(var12.method3774(), var13, var13, 3);
               }
            }
         }

         this.field9005.clear();
      }

      var3.endSection();
   }

   public void method6754(Consumer<Entity> var1, Entity var2) {
      try {
         var1.accept(var2);
      } catch (Throwable var8) {
         Class4526 var6 = Class4526.method14413(var8, "Ticking entity");
         Class8965 var7 = var6.method14410("Entity being ticked");
         var2.method3372(var7);
         throw new Class2506(var6);
      }
   }

   public Class7782 method6755(Entity var1, double var2, double var4, double var6, float var8, Class2141 var9) {
      return this.method6757(var1, (Class8654)null, (Class5924)null, var2, var4, var6, var8, false, var9);
   }

   public Class7782 method6756(Entity var1, double var2, double var4, double var6, float var8, boolean var9, Class2141 var10) {
      return this.method6757(var1, (Class8654)null, (Class5924)null, var2, var4, var6, var8, var9, var10);
   }

   public Class7782 method6757(
           Entity var1, Class8654 var2, Class5924 var3, double var4, double var6, double var8, float var10, boolean var11, Class2141 var12
   ) {
      Class7782 var15 = new Class7782(this, var1, var2, var3, var4, var6, var8, var10, var11, var12);
      var15.method25784();
      var15.method25785(true);
      return var15;
   }

   public String method6758() {
      return this.method6883().method7347();
   }

   @Nullable
   @Override
   public Class944 method6759(BlockPos var1) {
      if (!method6720(var1)) {
         if (!this.field9020 && Thread.currentThread() != this.field9007) {
            return null;
         } else {
            Class944 var4 = null;
            if (this.field9021) {
               var4 = this.method6760(var1);
            }

            if (var4 == null) {
               var4 = this.method6722(var1).method7029(var1, Class2206.field14421);
            }

            if (var4 == null) {
               var4 = this.method6760(var1);
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   @Nullable
   private Class944 method6760(BlockPos var1) {
      for (int var4 = 0; var4 < this.field9005.size(); var4++) {
         Class944 var5 = this.field9005.get(var4);
         if (!var5.method3778() && var5.method3774().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public void method6761(BlockPos var1, Class944 var2) {
      if (!method6720(var1) && var2 != null && !var2.method3778()) {
         if (!this.field9021) {
            this.method6722(var1).method7062(var1, var2);
            this.method6751(var2);
         } else {
            var2.method3769(this, var1);
            Iterator var5 = this.field9005.iterator();

            while (var5.hasNext()) {
               Class944 var6 = (Class944)var5.next();
               if (var6.method3774().equals(var1)) {
                  var6.method3765();
                  var5.remove();
               }
            }

            this.field9005.add(var2);
         }
      }
   }

   public void method6762(BlockPos var1) {
      Class944 var4 = this.method6759(var1);
      if (var4 != null && this.field9021) {
         var4.method3765();
         this.field9005.remove(var4);
      } else {
         if (var4 != null) {
            this.field9005.remove(var4);
            this.field9003.remove(var4);
            this.field9004.remove(var4);
         }

         this.method6722(var1).method7081(var1);
      }
   }

   public boolean method6763(BlockPos var1) {
      return !method6720(var1) ? this.method6883().method7345(var1.method8304() >> 4, var1.method8306() >> 4) : false;
   }

   public boolean method6764(BlockPos var1, Entity var2, Direction var3) {
      if (!method6720(var1)) {
         Class1670 var6 = this.method6724(var1.method8304() >> 4, var1.method8306() >> 4, Class9176.field42145, false);
         return var6 != null ? var6.method6738(var1).method23420(this, var1, var2, var3) : false;
      } else {
         return false;
      }
   }

   public boolean method6765(BlockPos var1, Entity var2) {
      return this.method6764(var1, var2, Direction.field673);
   }

   public void method6766() {
      double var3 = 1.0 - (double)(this.method6792(1.0F) * 5.0F) / 16.0;
      double var5 = 1.0 - (double)(this.method6790(1.0F) * 5.0F) / 16.0;
      double var7 = 0.5 + 2.0 * MathHelper.method37778((double) MathHelper.method37764(this.method7001(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.field9009 = (int)((1.0 - var7 * var3 * var5) * 11.0);
   }

   public void method6767(boolean var1, boolean var2) {
      this.method6883().method7349(var1, var2);
   }

   public void method6768() {
      if (this.field9018.method20043()) {
         this.field9013 = 1.0F;
         if (this.field9018.method20042()) {
            this.field9015 = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.method6883().close();
   }

   @Nullable
   @Override
   public Class1665 method6769(int var1, int var2) {
      return this.method6724(var1, var2, Class9176.field42145, false);
   }

   @Override
   public List<Entity> method6770(Entity var1, Class6488 var2, Predicate<? super Entity> var3) {
      this.method6820().func_230035_c_("getEntities");
      ArrayList var6 = Lists.newArrayList();
      int var7 = MathHelper.method37769((var2.field28449 - 2.0) / 16.0);
      int var8 = MathHelper.method37769((var2.field28452 + 2.0) / 16.0);
      int var9 = MathHelper.method37769((var2.field28451 - 2.0) / 16.0);
      int var10 = MathHelper.method37769((var2.field28454 + 2.0) / 16.0);
      Class1702 var11 = this.method6883();

      for (int var12 = var7; var12 <= var8; var12++) {
         for (int var13 = var9; var13 <= var10; var13++) {
            Class1674 var14 = var11.method7342(var12, var13, false);
            if (var14 != null) {
               var14.method7138(var1, var2, var6, var3);
            }
         }
      }

      return var6;
   }

   public <T extends Entity> List<T> method6771(Class8992<T> var1, Class6488 var2, Predicate<? super T> var3) {
      this.method6820().func_230035_c_("getEntities");
      int var6 = MathHelper.method37769((var2.field28449 - 2.0) / 16.0);
      int var7 = MathHelper.method37774((var2.field28452 + 2.0) / 16.0);
      int var8 = MathHelper.method37769((var2.field28451 - 2.0) / 16.0);
      int var9 = MathHelper.method37774((var2.field28454 + 2.0) / 16.0);
      ArrayList var10 = Lists.newArrayList();

      for (int var11 = var6; var11 < var7; var11++) {
         for (int var12 = var8; var12 < var9; var12++) {
            Class1674 var13 = this.method6883().method7342(var11, var12, false);
            if (var13 != null) {
               var13.method7139(var1, var2, var10, var3);
            }
         }
      }

      return var10;
   }

   @Override
   public <T extends Entity> List<T> method6772(Class<? extends T> var1, Class6488 var2, Predicate<? super T> var3) {
      this.method6820().func_230035_c_("getEntities");
      int var6 = MathHelper.method37769((var2.field28449 - 2.0) / 16.0);
      int var7 = MathHelper.method37774((var2.field28452 + 2.0) / 16.0);
      int var8 = MathHelper.method37769((var2.field28451 - 2.0) / 16.0);
      int var9 = MathHelper.method37774((var2.field28454 + 2.0) / 16.0);
      ArrayList var10 = Lists.newArrayList();
      Class1702 var11 = this.method6883();

      for (int var12 = var6; var12 < var7; var12++) {
         for (int var13 = var8; var13 < var9; var13++) {
            Class1674 var14 = var11.method7342(var12, var13, false);
            if (var14 != null) {
               var14.method7140(var1, var2, var10, var3);
            }
         }
      }

      return var10;
   }

   @Override
   public <T extends Entity> List<T> method6773(Class<? extends T> var1, Class6488 var2, Predicate<? super T> var3) {
      this.method6820().func_230035_c_("getLoadedEntities");
      int var6 = MathHelper.method37769((var2.field28449 - 2.0) / 16.0);
      int var7 = MathHelper.method37774((var2.field28452 + 2.0) / 16.0);
      int var8 = MathHelper.method37769((var2.field28451 - 2.0) / 16.0);
      int var9 = MathHelper.method37774((var2.field28454 + 2.0) / 16.0);
      ArrayList var10 = Lists.newArrayList();
      Class1702 var11 = this.method6883();

      for (int var12 = var6; var12 < var7; var12++) {
         for (int var13 = var8; var13 < var9; var13++) {
            Class1674 var14 = var11.method7343(var12, var13);
            if (var14 != null) {
               var14.method7140(var1, var2, var10, var3);
            }
         }
      }

      return var10;
   }

   @Nullable
   public abstract Entity method6774(int var1);

   public void method6775(BlockPos var1, Class944 var2) {
      if (this.method7017(var1)) {
         this.method6722(var1).method7137();
      }
   }

   @Override
   public int method6776() {
      return 63;
   }

   public int method6777(BlockPos var1) {
      int var4 = 0;
      var4 = Math.max(var4, this.method7010(var1.method8313(), Direction.field672));
      if (var4 < 15) {
         var4 = Math.max(var4, this.method7010(var1.method8311(), Direction.field673));
         if (var4 < 15) {
            var4 = Math.max(var4, this.method7010(var1.method8341(), Direction.NORTH));
            if (var4 < 15) {
               var4 = Math.max(var4, this.method7010(var1.method8343(), Direction.SOUTH));
               if (var4 < 15) {
                  var4 = Math.max(var4, this.method7010(var1.method8345(), Direction.WEST));
                  if (var4 < 15) {
                     var4 = Math.max(var4, this.method7010(var1.method8347(), Direction.EAST));
                     return var4 < 15 ? var4 : var4;
                  } else {
                     return var4;
                  }
               } else {
                  return var4;
               }
            } else {
               return var4;
            }
         } else {
            return var4;
         }
      } else {
         return var4;
      }
   }

   public boolean method6778(BlockPos var1, Direction var2) {
      return this.method6779(var1, var2) > 0;
   }

   public int method6779(BlockPos var1, Direction var2) {
      Class7380 var5 = this.method6738(var1);
      int var6 = var5.method23402(this, var1, var2);
      return !var5.method23400(this, var1) ? var6 : Math.max(var6, this.method6777(var1));
   }

   public boolean method6780(BlockPos var1) {
      if (this.method6779(var1.method8313(), Direction.field672) <= 0) {
         if (this.method6779(var1.method8311(), Direction.field673) <= 0) {
            if (this.method6779(var1.method8341(), Direction.NORTH) <= 0) {
               if (this.method6779(var1.method8343(), Direction.SOUTH) <= 0) {
                  return this.method6779(var1.method8345(), Direction.WEST) <= 0 ? this.method6779(var1.method8347(), Direction.EAST) > 0 : true;
               } else {
                  return true;
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public int method6781(BlockPos var1) {
      int var4 = 0;

      for (Direction var8 : field9002) {
         int var9 = this.method6779(var1.method8349(var8), var8);
         if (var9 >= 15) {
            return 15;
         }

         if (var9 > var4) {
            var4 = var9;
         }
      }

      return var4;
   }

   public void sendQuittingDisconnectingPacket() {
   }

   public long method6783() {
      return this.field9018.method20033();
   }

   public long method6784() {
      return this.field9018.method20034();
   }

   public boolean method6785(PlayerEntity var1, BlockPos var2) {
      return true;
   }

   public void method6786(Entity var1, byte var2) {
   }

   public void method6787(BlockPos var1, Block var2, int var3, int var4) {
      this.method6738(var1).method23422(this, var1, var3, var4);
   }

   @Override
   public Class6612 getWorldInfo() {
      return this.field9018;
   }

   public Class5462 method6789() {
      return this.field9018.method20046();
   }

   public float method6790(float var1) {
      return MathHelper.method37821(var1, this.field9014, this.field9015) * this.method6792(var1);
   }

   public void method6791(float var1) {
      this.field9014 = var1;
      this.field9015 = var1;
   }

   public float method6792(float var1) {
      return MathHelper.method37821(var1, this.field9012, this.field9013);
   }

   public void method6793(float var1) {
      this.field9012 = var1;
      this.field9013 = var1;
   }

   public boolean method6794() {
      return this.method6812().method36875() && !this.method6812().method36876() ? (double)this.method6790(1.0F) > 0.9 : false;
   }

   public boolean method6795() {
      return (double)this.method6792(1.0F) > 0.2;
   }

   public boolean method6796(BlockPos var1) {
      if (!this.method6795()) {
         return false;
      } else if (this.method7022(var1)) {
         if (this.method7006(Class101.field299, var1).getY() > var1.getY()) {
            return false;
         } else {
            Biome var4 = this.method7003(var1);
            return var4.method32500() == Class87.field224 && var4.method32503(var1) >= 0.15F;
         }
      } else {
         return false;
      }
   }

   public boolean method6797(BlockPos var1) {
      Biome var4 = this.method7003(var1);
      return var4.method32501();
   }

   @Nullable
   public abstract Class7529 method6798(String var1);

   public abstract void method6799(Class7529 var1);

   public abstract int method6800();

   public void method6801(int var1, BlockPos var2, int var3) {
   }

   public Class8965 method6802(Class4526 var1) {
      Class8965 var4 = var1.method14411("Affected level", 1);
      var4.method32806("All players", () -> this.method6870().size() + " total; " + this.method6870());
      var4.method32806("Chunk stats", this.method6883()::method7347);
      var4.method32806("Level dimension", () -> this.method6813().method31399().toString());

      try {
         this.field9018.method20049(var4);
      } catch (Throwable var6) {
         var4.method32808("Level Data Unobtainable", var6);
      }

      return var4;
   }

   public abstract void method6803(int var1, BlockPos var2, int var3);

   public void method6804(double var1, double var3, double var5, double var7, double var9, double var11, Class39 var13) {
   }

   public abstract Class6886 method6805();

   public void method6806(BlockPos var1, Block var2) {
      for (Direction var6 : Class76.field161) {
         BlockPos var7 = var1.method8349(var6);
         if (this.method7017(var7)) {
            Class7380 var8 = this.method6738(var7);
            if (!var8.method23448(Blocks.field36719)) {
               if (var8.method23400(this, var7)) {
                  var7 = var7.method8349(var6);
                  var8 = this.method6738(var7);
                  if (var8.method23448(Blocks.field36719)) {
                     var8.method23423(this, var7, var2, var1, false);
                  }
               }
            } else {
               var8.method23423(this, var7, var2, var1, false);
            }
         }
      }
   }

   @Override
   public Class9755 method6807(BlockPos var1) {
      long var4 = 0L;
      float var6 = 0.0F;
      if (this.method7017(var1)) {
         var6 = this.method7000();
         var4 = this.method6722(var1).method7093();
      }

      return new Class9755(this.method6997(), this.method6784(), var4, var6);
   }

   @Override
   public int method6808() {
      return this.field9009;
   }

   public void method6809(int var1) {
   }

   @Override
   public Class7522 method6810() {
      return this.field9022;
   }

   public void method6811(Packet<?> var1) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public Class9535 method6812() {
      return this.field9017;
   }

   public RegistryKey<World> method6813() {
      return this.field9024;
   }

   @Override
   public Random method6814() {
      return this.field9016;
   }

   @Override
   public boolean method6815(BlockPos var1, Predicate<Class7380> var2) {
      return var2.test(this.method6738(var1));
   }

   public abstract Class282 method6816();

   public abstract Class8933 method6817();

   public BlockPos method6818(int var1, int var2, int var3, int var4) {
      this.field9010 = this.field9010 * 3 + 1013904223;
      int var7 = this.field9010 >> 2;
      return new BlockPos(var1 + (var7 & 15), var2 + (var7 >> 16 & var4), var3 + (var7 >> 8 & 15));
   }

   public boolean method6819() {
      return false;
   }

   public Class7165 method6820() {
      return this.field9019.get();
   }

   public Supplier<Class7165> method6821() {
      return this.field9019;
   }

   @Override
   public Class6668 method6822() {
      return this.field9023;
   }

   public final boolean method6823() {
      return this.field9008;
   }
}
