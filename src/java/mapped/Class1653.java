package mapped;

import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.chunk.ChunkSection;

import java.io.File;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Class1653 extends Class1652<Class8377> {
   private final Class211 field8988;
   private final LongSet field8989 = new LongOpenHashSet();

   public Class1653(File var1, DataFixer var2, boolean var3) {
      super(var1, Class8377::method29350, Class8377::new, var2, Class2108.field13757, var3);
      this.field8988 = new Class211(this);
   }

   public void method6661(BlockPos var1, Class4913 var2) {
      this.method6645(SectionPos.method8390(var1).asLong()).method29352(var1, var2);
   }

   public void method6662(BlockPos var1) {
      this.method6645(SectionPos.method8390(var1).asLong()).method29354(var1);
   }

   public long method6663(Predicate<Class4913> var1, BlockPos var2, int var3, Class2093 var4) {
      return this.method6666(var1, var2, var3, var4).count();
   }

   public boolean method6664(Class4913 var1, BlockPos var2) {
      Optional var5 = this.method6645(SectionPos.method8390(var2).asLong()).method29357(var2);
      return var5.isPresent() && ((Class4913)var5.get()).equals(var1);
   }

   public Stream<Class9343> method6665(Predicate<Class4913> var1, BlockPos var2, int var3, Class2093 var4) {
      int var7 = Math.floorDiv(var3, 16) + 1;
      return ChunkPos.method24366(new ChunkPos(var2), var7).<Class9343>flatMap(var3x -> this.method6667(var1, var3x, var4)).filter(var2x -> {
         BlockPos var5 = var2x.method35355();
         return Math.abs(var5.getX() - var2.getX()) <= var3 && Math.abs(var5.getZ() - var2.getZ()) <= var3;
      });
   }

   public Stream<Class9343> method6666(Predicate<Class4913> var1, BlockPos var2, int var3, Class2093 var4) {
      int var7 = var3 * var3;
      return this.method6665(var1, var2, var3, var4).filter(var2x -> var2x.method35355().method8318(var2) <= (double)var7);
   }

   public Stream<Class9343> method6667(Predicate<Class4913> var1, ChunkPos var2, Class2093 var3) {
      return IntStream.range(0, 16)
         .boxed()
         .<Optional<Class8377>>map(var2x -> this.method6643(SectionPos.method8391(var2, var2x).asLong()))
         .filter(Optional::isPresent)
         .<Class9343>flatMap(var2x -> var2x.get().method29351(var1, var3));
   }

   public Stream<BlockPos> method6668(Predicate<Class4913> var1, Predicate<BlockPos> var2, BlockPos var3, int var4, Class2093 var5) {
      return this.method6666(var1, var3, var4, var5).<BlockPos>map(Class9343::method35355).filter(var2);
   }

   public Stream<BlockPos> method6669(Predicate<Class4913> var1, Predicate<BlockPos> var2, BlockPos var3, int var4, Class2093 var5) {
      return this.method6668(var1, var2, var3, var4, var5).sorted(Comparator.comparingDouble(var1x -> var1x.method8318(var3)));
   }

   public Optional<BlockPos> method6670(Predicate<Class4913> var1, Predicate<BlockPos> var2, BlockPos var3, int var4, Class2093 var5) {
      return this.method6668(var1, var2, var3, var4, var5).findFirst();
   }

   public Optional<BlockPos> method6671(Predicate<Class4913> var1, BlockPos var2, int var3, Class2093 var4) {
      return this.method6666(var1, var2, var3, var4).<BlockPos>map(Class9343::method35355).min(Comparator.comparingDouble(var1x -> var1x.method8318(var2)));
   }

   public Optional<BlockPos> method6672(Predicate<Class4913> var1, Predicate<BlockPos> var2, BlockPos var3, int var4) {
      return this.method6666(var1, var3, var4, Class2093.field13635).filter(var1x -> var2.test(var1x.method35355())).findFirst().<BlockPos>map(var0 -> {
         var0.method35351();
         return var0.method35355();
      });
   }

   public Optional<BlockPos> method6673(Predicate<Class4913> var1, Predicate<BlockPos> var2, Class2093 var3, BlockPos var4, int var5, Random var6) {
      List<Class9343> var9 = this.method6666(var1, var4, var5, var3).collect(Collectors.toList());
      Collections.shuffle(var9, var6);
      return var9.stream().filter(var1x -> var2.test(var1x.method35355())).findFirst().<BlockPos>map(Class9343::method35355);
   }

   public boolean method6674(BlockPos var1) {
      return this.method6645(SectionPos.method8390(var1).asLong()).method29355(var1);
   }

   public boolean method6675(BlockPos var1, Predicate<Class4913> var2) {
      return this.method6643(SectionPos.method8390(var1).asLong()).<Boolean>map(var2x -> var2x.method29356(var1, var2)).orElse(false);
   }

   public Optional<Class4913> method6676(BlockPos var1) {
      Class8377 var4 = this.method6645(SectionPos.method8390(var1).asLong());
      return var4.method29357(var1);
   }

   public int method6677(SectionPos var1) {
      this.field8988.method726();
      return this.field8988.getLevel(var1.asLong());
   }

   private boolean method6678(long var1) {
      Optional<Class8377> var5 = this.method6642(var1);
      return var5 != null ? var5.<Boolean>map(var0 -> var0.method29351(Class4913.field22748, Class2093.field13636).count() > 0L).orElse(false) : false;
   }

   @Override
   public void method6641(BooleanSupplier var1) {
      super.method6641(var1);
      this.field8988.method726();
   }

   @Override
   public void method6652(long var1) {
      super.method6652(var1);
      this.field8988.method697(var1, this.field8988.method696(var1), false);
   }

   @Override
   public void method6651(long var1) {
      this.field8988.method697(var1, this.field8988.method696(var1), false);
   }

   public void method6679(ChunkPos var1, ChunkSection var2) {
      SectionPos var5 = SectionPos.method8391(var1, var2.getYLocation() >> 4);
      Util.<Class8377>acceptOrElse(this.method6643(var5.asLong()), var3 -> var3.method29358(var3x -> {
            if (method6680(var2)) {
               this.method6681(var2, var5, var3x);
            }
         }), () -> {
         if (method6680(var2)) {
            Class8377 var5x = this.method6645(var5.asLong());
            this.method6681(var2, var5, var5x::method29352);
         }
      });
   }

   private static boolean method6680(ChunkSection var0) {
      return var0.method21869(Class4913.field22772::contains);
   }

   private void method6681(ChunkSection var1, SectionPos var2, BiConsumer<BlockPos, Class4913> var3) {
      var2.method8426()
         .forEach(
            var2x -> {
               BlockState var5 = var1.method21852(
                  SectionPos.mask(var2x.getX()), SectionPos.mask(var2x.getY()), SectionPos.mask(var2x.getZ())
               );
               Class4913.method15187(var5).ifPresent(var2xx -> var3.accept(var2x, var2xx));
            }
         );
   }

   public void method6682(IWorldReader var1, BlockPos var2, int var3) {
      SectionPos.method8428(new ChunkPos(var2), Math.floorDiv(var3, 16))
         .map(var1x -> Pair.of(var1x, this.method6643(var1x.asLong())))
         .filter(var0 -> var0.getSecond().map(Class8377::method29360).orElse(false))
         .map(var0 -> var0.getFirst().method8423())
         .filter(var1x -> this.field8989.add(var1x.asLong()))
         .forEach(var1x -> var1.getChunk(var1x.x, var1x.z, ChunkStatus.field42133));
   }

   // $VF: synthetic method
   public static boolean method6705(Class1653 var0, long var1) {
      return var0.method6678(var1);
   }
}
