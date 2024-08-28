package mapped;

import java.util.function.Consumer;

public class Class4687 extends Class4686 {
   private final ResourceLocation field22270;

   public Class4687(ResourceLocation var1, int var2, int var3, Class122[] var4, Class127[] var5) {
      super(var2, var3, var4, var5);
      this.field22270 = var1;
   }

   @Override
   public Class7131 method14694() {
      return Class8695.field39241;
   }

   @Override
   public void method14695(Consumer<Class8848> var1, Class7812 var2) {
      Class7318 var5 = var2.method26086(this.field22270);
      var5.method23180(var2, var1);
   }

   @Override
   public void method14703(Class8478 var1) {
      if (!var1.method29959(this.field22270)) {
         super.method14703(var1);
         Class7318 var4 = var1.method29963(this.field22270);
         if (var4 != null) {
            var4.method23184(var1.method29957("->{" + this.field22270 + "}", this.field22270));
         } else {
            var1.method29955("Unknown loot table called " + this.field22270);
         }
      } else {
         var1.method29955("Table " + this.field22270 + " is recursively called");
      }
   }

   public static Class5872<?> method14706(ResourceLocation var0) {
      return method14704((var1, var2, var3, var4) -> new Class4687(var0, var1, var2, var3, var4));
   }

   // $VF: synthetic method
   public static ResourceLocation method14708(Class4687 var0) {
      return var0.field22270;
   }
}
