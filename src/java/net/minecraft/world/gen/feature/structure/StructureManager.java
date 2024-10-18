package net.minecraft.world.gen.feature.structure;

import com.mojang.datafixers.DataFixUtils;
import net.minecraft.world.chunk.ChunkStatus;
import mapped.DimensionGeneratorSettings;
import mapped.Structure;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.IStructureReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.WorldGenRegion;

import java.util.stream.Stream;
import javax.annotation.Nullable;

public class StructureManager {
   private final IWorld field32171;
   private final DimensionGeneratorSettings field32172;

   public StructureManager(IWorld var1, DimensionGeneratorSettings var2) {
      this.field32171 = var1;
      this.field32172 = var2;
   }

   public StructureManager method24339(WorldGenRegion var1) {
      if (var1.method6970() == this.field32171) {
         return new StructureManager(var1, this.field32172);
      } else {
         throw new IllegalStateException("Using invalid feature manager (source level: " + var1.method6970() + ", region: " + var1);
      }
   }

   public Stream<? extends StructureStart<?>> func_235011_a_(SectionPos var1, Structure<?> var2) {
      return this.field32171
         .getChunk(var1.method8410(), var1.method8412(), ChunkStatus.STRUCTURE_REFERENCES)
         .method7099(var2)
         .stream()
         .<SectionPos>map(var0 -> SectionPos.from(new ChunkPos(var0), 0))
         .<StructureStart<?>>map(var2x -> this.method24341(var2x, var2, this.field32171.getChunk(var2x.method8410(), var2x.method8412(), ChunkStatus.STRUCTURE_STARTS)))
         .filter(var0 -> var0 != null && var0.method17117());
   }

   @Nullable
   public StructureStart<?> method24341(SectionPos var1, Structure<?> var2, IStructureReader var3) {
      return var3.method7097(var2);
   }

   public void func_235014_a_(SectionPos var1, Structure<?> var2, StructureStart<?> var3, IStructureReader var4) {
      var4.method7098(var2, var3);
   }

   public void func_235012_a_(SectionPos var1, Structure<?> var2, long var3, IStructureReader var5) {
      var5.method7100(var2, var3);
   }

   public boolean func_235005_a_() {
      return this.field32172.method26260();
   }

   public StructureStart<?> method24345(BlockPos var1, boolean var2, Structure<?> var3) {
      return (StructureStart<?>)DataFixUtils.orElse(
         this.func_235011_a_(SectionPos.from(var1), var3)
            .filter(var1x -> var1x.getBoundingBox().method38396(var1))
            .filter(var2x -> !var2 || var2x.method17111().stream().anyMatch(var1xx -> var1xx.method12915().method38396(var1)))
            .findFirst(),
         StructureStart.field24194
      );
   }
}
