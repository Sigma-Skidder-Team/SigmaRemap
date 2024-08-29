package mapped;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;

public class Class5809 extends Class5807 {
   public Class5809(String var1) {
      this(var1, 0.0, 1.0, 0.0F);
   }

   public Class5809(String var1, double var2, double var4, float var6) {
      super(
         var1, var2, var4, var6, (Function<GameSettings, Double>)null, (BiConsumer<GameSettings, Double>)null, (BiFunction<GameSettings, Class5807, ITextComponent>)null
      );
      super.field25452 = this::method18092;
      super.field25453 = this::method18093;
      super.field25454 = this::method18094;
   }

   private double method18092(GameSettings var1) {
      return var1.method37156(this);
   }

   private void method18093(GameSettings var1, double var2) {
      var1.method37155(this, var2);
   }

   private ITextComponent method18094(GameSettings var1, Class5807 var2) {
      return var1.method37158(var2);
   }
}
