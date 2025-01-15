package mapped;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;
import javax.annotation.Nullable;

public class AcaciaTree extends Tree {
   private static String[] field32861;

   @Nullable
   @Override
   public ConfiguredFeature<Class4733, ?> method25186(Random var1, boolean var2) {
      return Features.field41773;
   }
}
