package net.minecraft.block.trees;

import mapped.Class4733;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;
import javax.annotation.Nullable;

public class OakTree extends Tree {
   private static String[] field32860;

   @Nullable
   @Override
   public ConfiguredFeature<Class4733, ?> method25186(Random var1, boolean var2) {
      if (var1.nextInt(10) != 0) {
         return !var2 ? Features.field41770 : Features.field41787;
      } else {
         return !var2 ? Features.field41777 : Features.field41793;
      }
   }
}
