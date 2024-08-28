package mapped;

import com.google.gson.JsonObject;

public class Class4901 extends Class4874<Class4488> {
   private static final ResourceLocation field22735 = new ResourceLocation("changed_dimension");

   @Override
   public ResourceLocation method15044() {
      return field22735;
   }

   public Class4488 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8705 var6 = !var1.has("from") ? null : Class8705.<World>method31395(Class2348.field16067, new ResourceLocation(Class8963.method32763(var1, "from")));
      Class8705 var7 = !var1.has("to") ? null : Class8705.<World>method31395(Class2348.field16067, new ResourceLocation(Class8963.method32763(var1, "to")));
      return new Class4488(var2, var6, var7);
   }

   public void testForAll(Class878 var1, Class8705<World> var2, Class8705<World> var3) {
      this.method15053(var1, var2x -> var2x.method14157(var2, var3));
   }

   // $VF: synthetic method
   public static ResourceLocation method15148() {
      return field22735;
   }
}
