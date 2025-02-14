package mapped;

import net.minecraft.util.ResourceLocation;

import java.util.Optional;
import javax.annotation.Nullable;

public class Class9137 {
   private static String[] field41986;
   public static final Class9137 field41987 = new Class9137((ResourceLocation)null);
   private final ResourceLocation field41988;
   private boolean field41989;
   private Optional<Class7744> field41990 = Optional.<Class7744>empty();

   public Class9137(ResourceLocation var1) {
      this.field41988 = var1;
   }

   public Class9137(Class7744 var1) {
      this.field41989 = true;
      this.field41988 = null;
      this.field41990 = Optional.<Class7744>of(var1);
   }

   public Optional<Class7744> method34115(FunctionManager var1) {
      if (!this.field41989) {
         if (this.field41988 != null) {
            this.field41990 = var1.method22829(this.field41988);
         }

         this.field41989 = true;
      }

      return this.field41990;
   }

   @Nullable
   public ResourceLocation method34116() {
      return this.field41990.<ResourceLocation>map(var0 -> Class7744.method25655(var0)).orElse(this.field41988);
   }
}
