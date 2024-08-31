package net.minecraft.block;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import mapped.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class BlockState extends Class7377 {
   public static final Codec<BlockState> field31585 = method23469(Registry.BLOCK, Block::method11579).stable();
   private int field31586 = -1;
   private int field31587 = -1;
   private ResourceLocation field31588;
   private int field31589 = -1;
   private static final AtomicInteger field31590 = new AtomicInteger(0);

   public int method23490() {
      if (this.field31586 < 0) {
         this.field31586 = Registry.BLOCK.getId(this.getBlock());
      }

      return this.field31586;
   }

   public int method23491() {
      if (this.field31587 < 0) {
         this.field31587 = Class9716.method38067(this);
         if (this.field31587 < 0) {
            Class7944.method26811("Metadata not found, block: " + this.method23492());
            this.field31587 = 0;
         }
      }

      return this.field31587;
   }

   public ResourceLocation method23492() {
      if (this.field31588 == null) {
         this.field31588 = Registry.BLOCK.getKey(this.getBlock());
      }

      return this.field31588;
   }

   public int method23493() {
      if (this.field31589 < 0) {
         this.field31589 = field31590.incrementAndGet();
      }

      return this.field31589;
   }

   public int method23494(Class1665 var1, BlockPos var2) {
      return this.getLightValue();
   }

   public boolean method23495() {
      return this.field31577 != null && this.field31577.field28438;
   }

   public boolean method23496() {
      return this.field31577 != null && this.field31577.field28445;
   }

   public BlockState(Block var1, ImmutableMap<Class8550<?>, Comparable<?>> var2, MapCodec<BlockState> var3) {
      super(var1, var2, var3);
   }

   @Override
   public BlockState method23457() {
      return this;
   }
}
