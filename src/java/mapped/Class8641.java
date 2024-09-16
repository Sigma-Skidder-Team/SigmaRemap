package mapped;

import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.shorts.ShortArraySet;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SChangeBlockPacket;
import net.minecraft.network.play.server.SMultiBlockChangePacket;
import net.minecraft.network.play.server.SUpdateLightPacket;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.chunk.IChunk;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.annotation.Nullable;

public class Class8641 {
   private static String[] field38892;
   public static final Either<IChunk, Class7022> field38893 = Either.right(Class7022.field30331);
   public static final CompletableFuture<Either<IChunk, Class7022>> field38894 = CompletableFuture.<Either<IChunk, Class7022>>completedFuture(field38893);
   public static final Either<Chunk, Class7022> field38895 = Either.right(Class7022.field30331);
   private static final CompletableFuture<Either<Chunk, Class7022>> field38896 = CompletableFuture.<Either<Chunk, Class7022>>completedFuture(field38895);
   private static final List<ChunkStatus> field38897 = ChunkStatus.method34292();
   private static final ChunkHolderLocationType[] field38898 = ChunkHolderLocationType.values();
   private final AtomicReferenceArray<CompletableFuture<Either<IChunk, Class7022>>> field38899 = new AtomicReferenceArray<CompletableFuture<Either<IChunk, Class7022>>>(
      field38897.size()
   );
   private volatile CompletableFuture<Either<Chunk, Class7022>> field38900 = field38896;
   private volatile CompletableFuture<Either<Chunk, Class7022>> field38901 = field38896;
   private volatile CompletableFuture<Either<Chunk, Class7022>> field38902 = field38896;
   private CompletableFuture<IChunk> field38903 = CompletableFuture.<IChunk>completedFuture((IChunk)null);
   private int field38904;
   private int field38905;
   private int field38906;
   private final ChunkPos field38907;
   private boolean field38908;
   private final ShortSet[] field38909 = new ShortSet[16];
   private int field38910;
   private int field38911;
   private final Class196 field38912;
   private final Class1813 field38913;
   private final Class1650 field38914;
   private boolean field38915;
   private boolean field38916;

   public Class8641(ChunkPos var1, int var2, Class196 var3, Class1813 var4, Class1650 var5) {
      this.field38907 = var1;
      this.field38912 = var3;
      this.field38913 = var4;
      this.field38914 = var5;
      this.field38904 = Class1649.field8951 + 1;
      this.field38905 = this.field38904;
      this.field38906 = this.field38904;
      this.method31060(var2);
   }

   public CompletableFuture<Either<IChunk, Class7022>> method31038(ChunkStatus var1) {
      CompletableFuture var4 = this.field38899.get(var1.method34297());
      return var4 != null ? var4 : field38894;
   }

   public CompletableFuture<Either<IChunk, Class7022>> method31039(ChunkStatus var1) {
      return !method31062(this.field38905).method34306(var1) ? field38894 : this.method31038(var1);
   }

   public CompletableFuture<Either<Chunk, Class7022>> method31040() {
      return this.field38901;
   }

   public CompletableFuture<Either<Chunk, Class7022>> method31041() {
      return this.field38902;
   }

   public CompletableFuture<Either<Chunk, Class7022>> method31042() {
      return this.field38900;
   }

   @Nullable
   public Chunk method31043() {
      CompletableFuture var3 = this.method31040();
      Either var4 = (Either)var3.getNow((Either)null);
      return var4 != null ? (Chunk)var4.left().orElse((Chunk)null) : null;
   }

   @Nullable
   public ChunkStatus method31044() {
      for (int var3 = field38897.size() - 1; var3 >= 0; var3--) {
         ChunkStatus var4 = field38897.get(var3);
         CompletableFuture<Either<IChunk, Class7022>> var5 = this.method31038(var4);
         if (var5.getNow(field38893).left().isPresent()) {
            return var4;
         }
      }

      return null;
   }

   @Nullable
   public IChunk method31045() {
      for (int var3 = field38897.size() - 1; var3 >= 0; var3--) {
         ChunkStatus var4 = field38897.get(var3);
         CompletableFuture<Either<IChunk, Class7022>> var5 = this.method31038(var4);
         if (!var5.isCompletedExceptionally()) {
            Optional var6 = var5.getNow(field38893).left();
            if (var6.isPresent()) {
               return (IChunk)var6.get();
            }
         }
      }

      return null;
   }

   public CompletableFuture<IChunk> method31046() {
      return this.field38903;
   }

   public void method31047(BlockPos var1) {
      Chunk var4 = this.method31043();
      if (var4 != null) {
         byte var5 = (byte)Class2002.method8396(var1.getY());
         if (this.field38909[var5] == null) {
            this.field38908 = true;
            this.field38909[var5] = new ShortArraySet();
         }

         this.field38909[var5].add(Class2002.method8398(var1));
      }
   }

   public void method31048(Class1977 var1, int var2) {
      Chunk var5 = this.method31043();
      if (var5 != null) {
         var5.setModified(true);
         if (var1 != Class1977.field12881) {
            this.field38910 |= 1 << var2 - -1;
         } else {
            this.field38911 |= 1 << var2 - -1;
         }
      }
   }

   public void method31049(Chunk var1) {
      if (this.field38908 || this.field38911 != 0 || this.field38910 != 0) {
         World var4 = var1.method7144();
         int var5 = 0;

         for (int var6 = 0; var6 < this.field38909.length; var6++) {
            var5 += this.field38909[var6] == null ? 0 : this.field38909[var6].size();
         }

         this.field38916 |= var5 >= 64;
         if (this.field38911 != 0 || this.field38910 != 0) {
            this.method31052(new SUpdateLightPacket(var1.getPos(), this.field38912, this.field38911, this.field38910, true), !this.field38916);
            this.field38911 = 0;
            this.field38910 = 0;
         }

         for (int var11 = 0; var11 < this.field38909.length; var11++) {
            ShortSet var7 = this.field38909[var11];
            if (var7 != null) {
               Class2002 var8 = Class2002.method8391(var1.getPos(), var11);
               if (var7.size() != 1) {
                  ChunkSection var9 = var1.getSections()[var8.getY()];
                  SMultiBlockChangePacket var10 = new SMultiBlockChangePacket(var8, var7, var9, this.field38916);
                  this.method31052(var10, false);
                  var10.method17461((var2, var3) -> this.method31050(var4, var2, var3));
               } else {
                  BlockPos var12 = var8.method8405(var7.iterator().nextShort());
                  BlockState var13 = var4.getBlockState(var12);
                  this.method31052(new SChangeBlockPacket(var12, var13), false);
                  this.method31050(var4, var12, var13);
               }

               this.field38909[var11] = null;
            }
         }

         this.field38908 = false;
      }
   }

   private void method31050(World var1, BlockPos var2, BlockState var3) {
      if (var3.getBlock().isTileEntityProvider()) {
         this.method31051(var1, var2);
      }
   }

   private void method31051(World var1, BlockPos var2) {
      TileEntity var5 = var1.getTileEntity(var2);
      if (var5 != null) {
         SUpdateTileEntityPacket var6 = var5.method3776();
         if (var6 != null) {
            this.method31052(var6, false);
         }
      }
   }

   private void method31052(Packet<?> var1, boolean var2) {
      this.field38914.method6576(this.field38907, var2).forEach(var1x -> var1x.field4855.sendPacket(var1));
   }

   public CompletableFuture<Either<IChunk, Class7022>> method31053(ChunkStatus var1, Class1649 var2) {
      int var5 = var1.method34297();
      CompletableFuture var6 = this.field38899.get(var5);
      if (var6 != null) {
         Either var7 = (Either)var6.getNow((Either)null);
         if (var7 == null || var7.left().isPresent()) {
            return var6;
         }
      }

      if (!method31062(this.field38905).method34306(var1)) {
         return var6 != null ? var6 : field38894;
      } else {
         CompletableFuture var8 = var2.method6550(this, var1);
         this.method31054(var8);
         this.field38899.set(var5, var8);
         return var8;
      }
   }

   private void method31054(CompletableFuture<? extends Either<? extends IChunk, Class7022>> var1) {
      this.field38903 = this.field38903.<Either, IChunk>thenCombine(var1, (var0, var1x) -> (IChunk)var1x.map(var0x -> var0x, var1xx -> var0));
   }

   public ChunkHolderLocationType method31055() {
      return method31063(this.field38905);
   }

   public ChunkPos method31056() {
      return this.field38907;
   }

   public int method31057() {
      return this.field38905;
   }

   public int method31058() {
      return this.field38906;
   }

   private void method31059(int var1) {
      this.field38906 = var1;
   }

   public void method31060(int var1) {
      this.field38905 = var1;
   }

   public void method31061(Class1649 var1) {
      ChunkStatus var4 = method31062(this.field38904);
      ChunkStatus var5 = method31062(this.field38905);
      boolean var6 = this.field38904 <= Class1649.field8951;
      boolean var7 = this.field38905 <= Class1649.field8951;
      ChunkHolderLocationType var8 = method31063(this.field38904);
      ChunkHolderLocationType var9 = method31063(this.field38905);
      if (var6) {
         Either var10 = Either.right(new Class7023(this));

         for (int var11 = !var7 ? 0 : var5.method34297() + 1; var11 <= var4.method34297(); var11++) {
            CompletableFuture var12 = this.field38899.get(var11);
            if (var12 == null) {
               this.field38899.set(var11, CompletableFuture.<Either<IChunk, Class7022>>completedFuture(var10));
            } else {
               var12.complete(var10);
            }
         }
      }

      boolean var16 = var8.isAtLeast(ChunkHolderLocationType.field167);
      boolean var17 = var9.isAtLeast(ChunkHolderLocationType.field167);
      this.field38915 |= var17;
      if (!var16 && var17) {
         this.field38900 = var1.method6559(this);
         this.method31054(this.field38900);
      }

      if (var16 && !var17) {
         CompletableFuture<Either<Chunk, Class7022>> var18 = this.field38900;
         this.field38900 = field38896;
         this.method31054(var18.thenApply(var1x -> var1x.ifLeft(var1::method6584)));
      }

      boolean var19 = var8.isAtLeast(ChunkHolderLocationType.TICKING);
      boolean var13 = var9.isAtLeast(ChunkHolderLocationType.TICKING);
      if (!var19 && var13) {
         this.field38901 = var1.method6558(this);
         this.method31054(this.field38901);
      }

      if (var19 && !var13) {
         this.field38901.complete(field38895);
         this.field38901 = field38896;
      }

      boolean var14 = var8.isAtLeast(ChunkHolderLocationType.field169);
      boolean var15 = var9.isAtLeast(ChunkHolderLocationType.field169);
      if (!var14 && var15) {
         if (this.field38902 != field38896) {
            throw (IllegalStateException) Util.method38516(new IllegalStateException());
         }

         this.field38902 = var1.method6543(this.field38907);
         this.method31054(this.field38902);
      }

      if (var14 && !var15) {
         this.field38902.complete(field38895);
         this.field38902 = field38896;
      }

      this.field38913.method7965(this.field38907, this::method31058, this.field38905, this::method31059);
      this.field38904 = this.field38905;
   }

   public static ChunkStatus method31062(int var0) {
      return var0 >= 33 ? ChunkStatus.method34294(var0 - 33) : ChunkStatus.FULL;
   }

   public static ChunkHolderLocationType method31063(int var0) {
      return field38898[MathHelper.method37775(33 - var0 + 1, 0, field38898.length - 1)];
   }

   public boolean method31064() {
      return this.field38915;
   }

   public void method31065() {
      this.field38915 = method31063(this.field38905).isAtLeast(ChunkHolderLocationType.field167);
   }

   public void method31066(Class1673 var1) {
      for (int var4 = 0; var4 < this.field38899.length(); var4++) {
         CompletableFuture<Either<IChunk, Class7022>> var5 = this.field38899.get(var4);
         if (var5 != null) {
            Optional<IChunk> var6 = var5.getNow(field38893).left();
            if (var6.isPresent() && var6.get() instanceof Class1672) {
               this.field38899.set(var4, CompletableFuture.<Either<IChunk, Class7022>>completedFuture(Either.left(var1)));
            }
         }
      }

      this.method31054(CompletableFuture.completedFuture(Either.left(var1.method7127())));
   }

   // $VF: synthetic method
   public static ChunkPos method31073(Class8641 var0) {
      return var0.field38907;
   }
}
