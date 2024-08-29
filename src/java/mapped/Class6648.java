package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6648 implements Class6646<Class6647> {
   private static String[] field29219;
   private final List<Class6646<Class6647>> field29220 = Lists.newArrayList();
   private final Random field29221 = new Random();
   private final ResourceLocation field29222;
   private final ITextComponent field29223;

   public Class6648(ResourceLocation var1, String var2) {
      this.field29222 = var1;
      this.field29223 = var2 != null ? new TranslationTextComponent(var2) : null;
   }

   @Override
   public int method20287() {
      int var3 = 0;

      for (Class6646 var5 : this.field29220) {
         var3 += var5.method20287();
      }

      return var3;
   }

   public Class6647 method20290() {
      int var3 = this.method20287();
      if (!this.field29220.isEmpty() && var3 != 0) {
         int var4 = this.field29221.nextInt(var3);

         for (Class6646 var6 : this.field29220) {
            var4 -= var6.method20287();
            if (var4 < 0) {
               return (Class6647)var6.method20290();
            }
         }

         return SoundHandler.field1051;
      } else {
         return SoundHandler.field1051;
      }
   }

   public void method20299(Class6646<Class6647> var1) {
      this.field29220.add(var1);
   }

   @Nullable
   public ITextComponent method20300() {
      return this.field29223;
   }

   @Override
   public void method20289(Class4386 var1) {
      for (Class6646 var5 : this.field29220) {
         var5.method20289(var1);
      }
   }
}
