package mapped;

import javax.annotation.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3416 extends Block {
   private static final ITextComponent field19119 = new TranslationTextComponent("container.cartography_table");

   public Class3416(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         var4.method2766(var1.method23445(var2, var3));
         var4.method2911(Class8876.field40169);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.field14818;
      }
   }

   @Nullable
   @Override
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      return new Class953((var2x, var3x, var4) -> new Class5836(var2x, var3x, Class8786.method31714(var2, var3)), field19119);
   }
}
