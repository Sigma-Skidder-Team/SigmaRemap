package mapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3294 extends Class3292 {
   public Class3294(Class3209 var1, Class5643 var2) {
      super(var1, var2);
   }

   @Nullable
   @Override
   public Class5909 method11836(Class5909 var1) {
      BlockPos var4 = var1.method18345();
      Class1655 var5 = var1.method18360();
      Class7380 var6 = var5.method6738(var4);
      Class3209 var7 = this.method11845();
      if (!var6.method23448(var7)) {
         return Class3428.method12085(var5, var4) != 7 ? var1 : null;
      } else {
         Direction var8;
         if (!var1.method18351()) {
            var8 = var1.method18354() != Direction.field673 ? Direction.field673 : var1.method18350();
         } else {
            var8 = !var1.method18356() ? var1.method18354() : var1.method18354().method536();
         }

         int var9 = 0;
         Mutable var10 = var4.method8354().method8379(var8);

         while (var9 < 7) {
            if (!var5.field9020 && !Class1655.method6716(var10)) {
               PlayerEntity var11 = var1.method18358();
               int var12 = var5.method7034();
               if (var11 instanceof Class878 && var10.getY() >= var12) {
                  Class5616 var13 = new Class5616(
                     new TranslationTextComponent("build.tooHigh", var12).mergeStyle(TextFormatting.RED), ChatType.GAME_INFO, Util.field45724
                  );
                  ((Class878)var11).field4855.method15671(var13);
               }
               break;
            }

            var6 = var5.method6738(var10);
            if (!var6.method23448(this.method11845())) {
               if (var6.method23441(var1)) {
                  return Class5909.method18344(var1, var10, var8);
               }
               break;
            }

            var10.method8379(var8);
            if (var8.method544().method324()) {
               var9++;
            }
         }

         return null;
      }
   }

   @Override
   public boolean method11842() {
      return false;
   }
}
