package net.minecraft.block.trees;

import mapped.Class4733;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;
import javax.annotation.Nullable;

<<<<<<<< HEAD:src/java/mapped/AcaciaTree.java
public class AcaciaTree extends AbstractTreeGrower {
   private static String[] field32861;
========
public class AcaciaTree extends Tree {
>>>>>>>> 79cb8ae07f3ea7f9967f332e14026f399b7070ef:src/java/net/minecraft/block/trees/AcaciaTree.java

   @Nullable
   @Override
   public ConfiguredFeature<Class4733, ?> method25186(Random var1, boolean var2) {
      return Features.field41773;
   }
}
