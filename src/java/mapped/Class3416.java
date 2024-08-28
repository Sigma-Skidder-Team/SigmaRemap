package mapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3416 extends Block {
   private static final ITextComponent field19119 = new TranslationTextComponent("container.cartography_table");

   public Class3416(Class7929 var1) {
      super(var1);
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (!var2.field9020) {
         var4.method2766(var1.method23445(var2, var3));
         var4.method2911(Class8876.field40169);
         return Class2274.field14819;
      } else {
         return Class2274.field14818;
      }
   }

   @Nullable
   @Override
   public Class949 method11528(Class7380 var1, Class1655 var2, BlockPos var3) {
      return new Class953((var2x, var3x, var4) -> new Class5836(var2x, var3x, Class8786.method31714(var2, var3)), field19119);
   }
}
