package mapped;

public class Class9060 {
   @Deprecated
   public static ResourceLocation method33720(String var0) {
      return new ResourceLocation("minecraft", "block/" + var0);
   }

   public static ResourceLocation method33721(String var0) {
      return new ResourceLocation("minecraft", "item/" + var0);
   }

   public static ResourceLocation method33722(Block var0, String var1) {
      ResourceLocation var4 = Registry.field16072.method9181(var0);
      return new ResourceLocation(var4.method8293(), "block/" + var4.method8292() + var1);
   }

   public static ResourceLocation method33723(Block var0) {
      ResourceLocation var3 = Registry.field16072.method9181(var0);
      return new ResourceLocation(var3.method8293(), "block/" + var3.method8292());
   }

   public static ResourceLocation method33724(Class3257 var0) {
      ResourceLocation var3 = Registry.field16075.method9181(var0);
      return new ResourceLocation(var3.method8293(), "item/" + var3.method8292());
   }

   public static ResourceLocation method33725(Class3257 var0, String var1) {
      ResourceLocation var4 = Registry.field16075.method9181(var0);
      return new ResourceLocation(var4.method8293(), "item/" + var4.method8292() + var1);
   }
}
