package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3438 extends Block {
   private static final ITextComponent field19237 = new TranslationTextComponent("container.crafting");

   public Class3438(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public ActionResultType method11505(Class7380 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, Class8711 var6) {
      if (!var2.field9020) {
         var4.method2766(var1.method23445(var2, var3));
         var4.method2911(Class8876.field40160);
         return ActionResultType.field14819;
      } else {
         return ActionResultType.field14818;
      }
   }

   @Override
   public Class949 method11528(Class7380 var1, World var2, BlockPos var3) {
      return new Class953((var2x, var3x, var4) -> new Class5829(var2x, var3x, Class8786.method31714(var2, var3)), field19237);
   }
}