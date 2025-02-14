package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.registry.Registry;

public interface Class9277<P extends Class6434> {
   Class9277<Class6435> field42660 = method34967("always_true", Class6435.field28274);
   Class9277<Class6438> field42661 = method34967("block_match", Class6438.field28281);
   Class9277<Class6433> field42662 = method34967("blockstate_match", Class6433.field28270);
   Class9277<Class6437> field42663 = method34967("tag_match", Class6437.field28279);
   Class9277<Class6439> field42664 = method34967("random_block_match", Class6439.field28283);
   Class9277<Class6436> field42665 = method34967("random_blockstate_match", Class6436.field28276);

   Codec<P> method34966();

   static <P extends Class6434> Class9277<P> method34967(String var0, Codec<P> var1) {
      return Registry.<Class9277<P>>register(Registry.field16082, var0, () -> var1);
   }
}
