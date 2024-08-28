package mapped;

public class Class8695 {
   public static final Class7131 field39239 = method31321("empty", new Class4938());
   public static final Class7131 field39240 = method31321("item", new Class4937());
   public static final Class7131 field39241 = method31321("loot_table", new Class4941());
   public static final Class7131 field39242 = method31321("dynamic", new Class4939());
   public static final Class7131 field39243 = method31321("tag", new Class4940());
   public static final Class7131 field39244 = method31321("alternatives", Class4689.method14711(Class4690::new));
   public static final Class7131 field39245 = method31321("sequence", Class4689.method14711(Class4691::new));
   public static final Class7131 field39246 = method31321("group", Class4689.method14711(Class4692::new));

   private static Class7131 method31321(String var0, ILootSerializer<? extends Class4688> var1) {
      return Registry.<Class7131, Class7131>register(Registry.field16096, new ResourceLocation(var0), new Class7131(var1));
   }

   public static Object method31322() {
      return LootTypesManager.<Class4688, Class7131>getLootTypeRegistryWrapper(Registry.field16096, "entry", "type", Class4688::method14694).getSerializer();
   }
}
