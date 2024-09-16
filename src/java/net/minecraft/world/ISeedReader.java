package net.minecraft.world;

import mapped.Class1659;
import mapped.Class2002;
import net.minecraft.world.gen.feature.structure.StructureStart;
import mapped.Structure;

import java.util.stream.Stream;

public interface ISeedReader extends Class1659 {
   long method6967();

   Stream<? extends StructureStart<?>> method6969(Class2002 var1, Structure<?> var2);
}
