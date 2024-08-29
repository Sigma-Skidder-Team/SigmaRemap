package mapped;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import net.minecraft.util.text.ITextComponent;

public class Class5804 extends AbstractOption {
   public BiConsumer<GameSettings, Integer> field25313;
   public BiFunction<GameSettings, Class5804, ITextComponent> field25314;

   public Class5804(String var1, BiConsumer<GameSettings, Integer> var2, BiFunction<GameSettings, Class5804, ITextComponent> var3) {
      super(var1);
      this.field25313 = var2;
      this.field25314 = var3;
   }

   public void method17945(GameSettings var1, int var2) {
      this.field25313.accept(var1, var2);
      var1.saveOptions();
   }

   @Override
   public Class1197 method17946(GameSettings var1, int var2, int var3, int var4) {
      return new Class1228(var2, var3, var4, 20, this, this.method17947(var1), var2x -> {
         this.method17945(var1, 1);
         var2x.method5743(this.method17947(var1));
      });
   }

   public ITextComponent method17947(GameSettings var1) {
      return this.field25314.apply(var1, this);
   }
}
