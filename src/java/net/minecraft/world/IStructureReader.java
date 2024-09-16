package net.minecraft.world;

import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.world.gen.feature.structure.StructureStart;
import mapped.Structure;

import javax.annotation.Nullable;
import java.util.Map;

public interface IStructureReader {
   @Nullable
   StructureStart<?> method7097(Structure<?> var1);

   void method7098(Structure<?> var1, StructureStart<?> var2);

   LongSet method7099(Structure<?> var1);

   void method7100(Structure<?> var1, long var2);

   Map<Structure<?>, LongSet> method7101();

   void method7102(Map<Structure<?>, LongSet> var1);
}
