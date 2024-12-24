package net.minecraft.world;

import mapped.ServerWorldAccess;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.gen.feature.structure.StructureStart;
import mapped.Structure;

import java.util.stream.Stream;

public interface ISeedReader extends ServerWorldAccess {
   long getSeed();

   Stream<? extends StructureStart<?>> method6969(SectionPos var1, Structure<?> var2);
}
