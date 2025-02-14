package net.minecraft.block.trees;

import mapped.Class4733;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;
import javax.annotation.Nullable;

public class BirchTree extends Tree {
   private static String[] field32859;

   @Nullable
   @Override
   public ConfiguredFeature<Class4733, ?> method25186(Random var1, boolean var2) {
      return !var2 ? Features.field41772 : Features.field41790;
   }
}
