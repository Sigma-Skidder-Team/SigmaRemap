package mapped;

import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.OptionalInt;

public interface Class1060 {
   void method4683(PlayerEntity var1);

   @Nullable
   PlayerEntity method4740();

   Class46 method4742();

   void method4743(Class46 var1);

   void method4745(Class9346 var1);

   void method4747(ItemStack var1);

   Class1655 method4753();

   int method4721();

   void method4744(int var1);

   boolean method4746();

   Class9455 method4748();

   default boolean method4686() {
      return false;
   }

   default void method4872(PlayerEntity var1, ITextComponent var2, int var3) {
      OptionalInt var6 = var1.method2766(new Class953((var1x, var2x, var3x) -> new Class5826(var1x, var2x, this), var2));
      if (var6.isPresent()) {
         Class46 var7 = this.method4742();
         if (!var7.isEmpty()) {
            var1.method2767(var6.getAsInt(), var7, var3, this.method4721(), this.method4746(), this.method4686());
         }
      }
   }
}
