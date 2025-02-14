package net.minecraft.world.gen.blockplacer;

import com.mojang.serialization.Codec;
import mapped.BlockPlacer;
import net.minecraft.util.registry.Registry;

public class BlockPlacerType<P extends BlockPlacer> {
   public static final BlockPlacerType<SimpleBlockPlacer> SIMPLE_BLOCK_PLACER = register("simple_block_placer", SimpleBlockPlacer.codec);
   public static final BlockPlacerType<DoublePlantPlacer> DOUBLE_PLANT_PLACER = register("double_plant_placer", DoublePlantPlacer.codec);
   public static final BlockPlacerType<ColumnPlacer> COLUMN_PLACER = register("column_placer", ColumnPlacer.codec);
   private final Codec<P> codec; // Searge sucks v3: field_236436_d_

   private static <P extends BlockPlacer> BlockPlacerType<P> register(String id, Codec<P> codec) {
      return Registry.<BlockPlacerType<P>>register(Registry.field16130, id, new BlockPlacerType<P>(codec));
   }

   private BlockPlacerType(Codec<P> codec) {
      this.codec = codec;
   }

   public Codec<P> getCodec() {
      return this.codec;
   }
}
