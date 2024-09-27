package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;

import java.util.List;
import java.util.Random;

public interface Class7205 {
   default IBakedModel method22627() {
      return (IBakedModel)this;
   }

   default List<Class8557> method22628(BlockState var1, Direction var2, Random var3, Class7180 var4) {
      return this.method22627().method22619(var1, var2, var3);
   }

   default boolean method22629(BlockState var1) {
      return this.method22627().method22620();
   }

   default IBakedModel method22630(Class2327 var1, MatrixStack var2) {
      return (IBakedModel) Reflector.field42871.call(this.method22627(), var1, var2);
   }

   default Class7180 method22631(IBlockDisplayReader var1, BlockPos var2, BlockState var3, Class7180 var4) {
      return var4;
   }

   default TextureAtlasSprite method22632(Class7180 var1) {
      return this.method22627().getParticleTexture();
   }

   default boolean method22633() {
      return false;
   }
}
