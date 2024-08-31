package mapped;

import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class Class9828 {
   private final Class120 field45909;
   private final Class120 field45910;
   private final Item field45911;
   private final Class7999 field45912 = Class7999.method27304();
   private final Class6504<?> field45913;

   public Class9828(Class6504<?> var1, Class120 var2, Class120 var3, Item var4) {
      this.field45913 = var1;
      this.field45909 = var2;
      this.field45910 = var3;
      this.field45911 = var4;
   }

   public static Class9828 method38783(Class120 var0, Class120 var1, Item var2) {
      return new Class9828(Class6504.field28490, var0, var1, var2);
   }

   public Class9828 method38784(String var1, Class4477 var2) {
      this.field45912.method27312(var1, var2);
      return this;
   }

   public void method38785(Consumer<Class4664> var1, String var2) {
      this.method38786(var1, new ResourceLocation(var2));
   }

   public void method38786(Consumer<Class4664> var1, ResourceLocation var2) {
      this.method38787(var2);
      this.field45912
         .method27306(new ResourceLocation("recipes/root"))
         .method27312("has_the_recipe", Class4897.method15131(var2))
         .method27310(Class9182.method34345(var2))
         .method27314(Class9014.field41221);
      var1.accept(
         new Class4667(
            var2,
            this.field45913,
            this.field45909,
            this.field45910,
            this.field45911,
            this.field45912,
            new ResourceLocation(var2.getNamespace(), "recipes/" + this.field45911.method11739().method23642() + "/" + var2.getPath())
         )
      );
   }

   private void method38787(ResourceLocation var1) {
      if (this.field45912.method27322().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }
}
