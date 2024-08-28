package mapped;

import com.google.gson.JsonObject;

public class Class4900 extends Class4874<Class4481> {
   private static final ResourceLocation field22734 = new ResourceLocation("nether_travel");

   @Override
   public ResourceLocation method15044() {
      return field22734;
   }

   public Class4481 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class8576 var6 = Class8576.method30653(var1.get("entered"));
      Class8576 var7 = Class8576.method30653(var1.get("exited"));
      Class8884 var8 = Class8884.method32329(var1.get("distance"));
      return new Class4481(var2, var6, var7, var8);
   }

   public void method15143(Class878 var1, Vector3d var2) {
      this.method15053(var1, var2x -> var2x.method14144(var1.getServerWorld(), var2, var1.getPosX(), var1.getPosY(), var1.getPosZ()));
   }

   // $VF: synthetic method
   public static ResourceLocation method15145() {
      return field22734;
   }
}
