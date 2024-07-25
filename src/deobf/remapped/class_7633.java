package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7633 implements class_6798<class_2049> {
   private static String[] field_38833;
   private final List<class_6798<class_2049>> field_38835 = Lists.newArrayList();
   private final Random field_38832 = new Random();
   private final Identifier field_38836;
   private final ITextComponent field_38834;

   public class_7633(Identifier var1, String var2) {
      this.field_38836 = var1;
      this.field_38834 = var2 != null ? new TranslationTextComponent(var2) : null;
   }

   @Override
   public int method_31144() {
      int var3 = 0;

      for (class_6798 var5 : this.field_38835) {
         var3 += var5.method_31144();
      }

      return var3;
   }

   public class_2049 method_34587() {
      int var3 = this.method_31144();
      if (!this.field_38835.isEmpty() && var3 != 0) {
         int var4 = this.field_38832.nextInt(var3);

         for (class_6798 var6 : this.field_38835) {
            var4 -= var6.method_31144();
            if (var4 < 0) {
               return (class_2049)var6.method_31146();
            }
         }

         return class_3541.field_17316;
      } else {
         return class_3541.field_17316;
      }
   }

   public void method_34586(class_6798<class_2049> var1) {
      this.field_38835.add(var1);
   }

   @Nullable
   public ITextComponent method_34585() {
      return this.field_38834;
   }

   @Override
   public void method_31145(class_132 var1) {
      for (class_6798 var5 : this.field_38835) {
         var5.method_31145(var1);
      }
   }
}
