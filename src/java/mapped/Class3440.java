package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3440 extends Class3438 {
   private static final ITextComponent field19239 = new TranslationTextComponent("container.upgrade");

   public Class3440(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class949 method11528(Class7380 var1, Class1655 var2, BlockPos var3) {
      return new Class953((var2x, var3x, var4) -> new Class5825(var2x, var3x, Class8786.method31714(var2, var3)), field19239);
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Hand var5, Class8711 var6) {
      if (!var2.field9020) {
         var4.method2766(var1.method23445(var2, var3));
         var4.method2911(Class8876.field40178);
         return Class2274.field14819;
      } else {
         return Class2274.field14818;
      }
   }
}
