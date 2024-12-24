package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tags.ITag;

import java.util.Random;

public class Class6437 extends Class6434 {
   public static final Codec<Class6437> field28279 = ITag.<Block>getTagCodec(() -> Class9443.method36296().method32657())
      .fieldOf("tag")
      .xmap(Class6437::new, var0 -> var0.field28280)
      .codec();
   private final ITag<Block> field28280;

   public Class6437(ITag<Block> var1) {
      this.field28280 = var1;
   }

   @Override
   public boolean method19540(BlockState var1, Random var2) {
      return var1.isIn(this.field28280);
   }

   @Override
   public Class9277<?> method19541() {
      return Class9277.field42663;
   }
}
