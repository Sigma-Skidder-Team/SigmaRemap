package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3478 extends Class3198 {
   private static final ITextComponent field19331 = new TranslationTextComponent("container.loom");

   public Class3478(Class7929 var1) {
      super(var1);
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (!var2.field9020) {
         var4.method2766(var1.method23445(var2, var3));
         var4.method2911(Class8876.field40170);
         return Class2274.field14819;
      } else {
         return Class2274.field14818;
      }
   }

   @Override
   public Class949 method11528(Class7380 var1, Class1655 var2, BlockPos var3) {
      return new Class953((var2x, var3x, var4) -> new Class5837(var2x, var3x, Class8786.method31714(var2, var3)), field19331);
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      return this.method11579().method23465(field18484, var1.method18350().method536());
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18484);
   }
}
