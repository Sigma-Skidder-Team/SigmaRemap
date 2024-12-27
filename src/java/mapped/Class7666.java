package mapped;

import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;
import javax.annotation.Nullable;

public class Class7666 extends AbstractTreeGrower {
   private static String[] field32859;

   @Nullable
   @Override
   public ConfiguredFeature<Class4733, ?> method25186(Random var1, boolean var2) {
      return !var2 ? Features.field41772 : Features.field41790;
   }
}
