package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;

public class Class9537 {
   public static final Codec<Class9537> field44402 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 256).fieldOf("height").forGetter(Class9537::method36905),
               Registry.BLOCK.fieldOf("block").orElse(Blocks.AIR).forGetter(var0x -> var0x.method36906().getBlock())
            )
            .apply(var0, Class9537::new)
   );
   private final BlockState field44403;
   private final int field44404;
   private int field44405;

   public Class9537(int var1, Block var2) {
      this.field44404 = var1;
      this.field44403 = var2.method11579();
   }

   public int method36905() {
      return this.field44404;
   }

   public BlockState method36906() {
      return this.field44403;
   }

   public int method36907() {
      return this.field44405;
   }

   public void method36908(int var1) {
      this.field44405 = var1;
   }

   @Override
   public String toString() {
      return (this.field44404 == 1 ? "" : this.field44404 + "*") + Registry.BLOCK.getKey(this.field44403.getBlock());
   }
}
