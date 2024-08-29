package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3478 extends Class3198 {
   private static final ITextComponent field19331 = new TranslationTextComponent("container.loom");

   public Class3478(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.field9020) {
         var4.method2766(var1.method23445(var2, var3));
         var4.method2911(Class8876.field40170);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.field14818;
      }
   }

   @Override
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      return new Class953((var2x, var3x, var4) -> new Class5837(var2x, var3x, Class8786.method31714(var2, var3)), field19331);
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23465(field18484, var1.method18350().method536());
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18484);
   }
}
