package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class Class4709 implements Class4698 {
   public static final Codec<Class4709> field22332 = RecordCodecBuilder.create(
      var0 -> var0.group(
               BlockState.field31585.fieldOf("valid_base_block").forGetter(var0x -> var0x.field22337),
               BlockState.field31585.fieldOf("stem_state").forGetter(var0x -> var0x.field22338),
               BlockState.field31585.fieldOf("hat_state").forGetter(var0x -> var0x.field22339),
               BlockState.field31585.fieldOf("decor_state").forGetter(var0x -> var0x.field22340),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter(var0x -> var0x.field22341)
            )
            .apply(var0, Class4709::new)
   );
   public static final Class4709 field22333 = new Class4709(
      Blocks.field37083.method11579(), Blocks.field37079.method11579(), Blocks.field36891.method11579(), Blocks.field37085.method11579(), true
   );
   public static final Class4709 field22334;
   public static final Class4709 field22335 = new Class4709(
      Blocks.field37074.method11579(), Blocks.field37070.method11579(), Blocks.field37076.method11579(), Blocks.field37085.method11579(), true
   );
   public static final Class4709 field22336;
   public final BlockState field22337;
   public final BlockState field22338;
   public final BlockState field22339;
   public final BlockState field22340;
   public final boolean field22341;

   public Class4709(BlockState var1, BlockState var2, BlockState var3, BlockState var4, boolean var5) {
      this.field22337 = var1;
      this.field22338 = var2;
      this.field22339 = var3;
      this.field22340 = var4;
      this.field22341 = var5;
   }

   static {
      field22334 = new Class4709(field22333.field22337, field22333.field22338, field22333.field22339, field22333.field22340, false);
      field22336 = new Class4709(field22335.field22337, field22335.field22338, field22335.field22339, field22335.field22340, false);
   }
}
