package net.minecraft.block.trees;

import mapped.Class4733;
import mapped.Class7661;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;
import javax.annotation.Nullable;

public class SpruceTree extends Class7661 {
   private static String[] field32856;

   @Nullable
   @Override
   public ConfiguredFeature<Class4733, ?> method25186(Random var1, boolean var2) {
      return Features.field41774;
   }

   @Nullable
   @Override
   public ConfiguredFeature<Class4733, ?> method25183(Random var1) {
      return !var1.nextBoolean() ? Features.field41781 : Features.field41780;
   }
}
