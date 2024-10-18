package mapped;

import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.function.Consumer;

public class Class5625 {
   private final Item field24940;
   private final Class120 field24941;
   private final float field24942;
   private final int field24943;
   private final Class7999 field24944 = Class7999.method27304();
   private String field24945;
   private final Class6503<?> field24946;

   private Class5625(IItemProvider var1, Class120 var2, float var3, int var4, Class6503<?> var5) {
      this.field24940 = var1.asItem();
      this.field24941 = var2;
      this.field24942 = var3;
      this.field24943 = var4;
      this.field24946 = var5;
   }

   public static Class5625 method17664(Class120 var0, IItemProvider var1, float var2, int var3, Class6503<?> var4) {
      return new Class5625(var1, var0, var2, var3, var4);
   }

   public static Class5625 method17665(Class120 var0, IItemProvider var1, float var2, int var3) {
      return method17664(var0, var1, var2, var3, Class6504.field28486);
   }

   public static Class5625 method17666(Class120 var0, IItemProvider var1, float var2, int var3) {
      return method17664(var0, var1, var2, var3, Class6504.field28485);
   }

   public Class5625 method17667(String var1, Class4477 var2) {
      this.field24944.method27312(var1, var2);
      return this;
   }

   public void method17668(Consumer<Class4664> var1) {
      this.method17670(var1, Registry.ITEM.getKey(this.field24940));
   }

   public void method17669(Consumer<Class4664> var1, String var2) {
      ResourceLocation var5 = Registry.ITEM.getKey(this.field24940);
      ResourceLocation var6 = new ResourceLocation(var2);
      if (!var6.equals(var5)) {
         this.method17670(var1, var6);
      } else {
         throw new IllegalStateException("Recipe " + var6 + " should remove its 'save' argument");
      }
   }

   public void method17670(Consumer<Class4664> var1, ResourceLocation var2) {
      this.method17671(var2);
      this.field24944
         .method27306(new ResourceLocation("recipes/root"))
         .method27312("has_the_recipe", Class4897.method15131(var2))
         .method27310(Class9182.method34345(var2))
         .method27314(Class9014.field41221);
      var1.accept(
         new Class4669(
            var2,
            this.field24945 != null ? this.field24945 : "",
            this.field24941,
            this.field24940,
            this.field24942,
            this.field24943,
            this.field24944,
            new ResourceLocation(var2.getNamespace(), "recipes/" + this.field24940.method11739().method23642() + "/" + var2.getPath()),
            (Class6504<? extends Class4847>)this.field24946
         )
      );
   }

   private void method17671(ResourceLocation var1) {
      if (this.field24944.method27322().isEmpty()) {
         throw new IllegalStateException("No way of obtaining recipe " + var1);
      }
   }
}
