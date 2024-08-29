package mapped;

public class Class8298<T extends Class5812> {
   public static final Class8298<Class5813> field35648 = method29012("generic_9x1", Class5813::method18156);
   public static final Class8298<Class5813> field35649 = method29012("generic_9x2", Class5813::method18157);
   public static final Class8298<Class5813> field35650 = method29012("generic_9x3", Class5813::method18158);
   public static final Class8298<Class5813> field35651 = method29012("generic_9x4", Class5813::method18159);
   public static final Class8298<Class5813> field35652 = method29012("generic_9x5", Class5813::method18160);
   public static final Class8298<Class5813> field35653 = method29012("generic_9x6", Class5813::method18161);
   public static final Class8298<Class5817> field35654 = method29012("generic_3x3", Class5817::new);
   public static final Class8298<Class5824> field35655 = method29012("anvil", Class5824::new);
   public static final Class8298<Class5821> field35656 = method29012("beacon", Class5821::new);
   public static final Class8298<Class5834> field35657 = method29012("blast_furnace", Class5834::new);
   public static final Class8298<Class5819> field35658 = method29012("brewing_stand", Class5819::new);
   public static final Class8298<Class5829> field35659 = method29012("crafting", Class5829::new);
   public static final Class8298<Class5822> field35660 = method29012("enchantment", Class5822::new);
   public static final Class8298<Class5832> field35661 = method29012("furnace", Class5832::new);
   public static final Class8298<Class5815> field35662 = method29012("grindstone", Class5815::new);
   public static final Class8298<Class5816> field35663 = method29012("hopper", Class5816::new);
   public static final Class8298<Class5818> field35664 = method29012("lectern", (var0, var1) -> new Class5818(var0));
   public static final Class8298<Class5837> field35665 = method29012("loom", Class5837::new);
   public static final Class8298<Class5826> field35666 = method29012("merchant", Class5826::new);
   public static final Class8298<Class5814> field35667 = method29012("shulker_box", Class5814::new);
   public static final Class8298<Class5825> field35668 = method29012("smithing", Class5825::new);
   public static final Class8298<Class5833> field35669 = method29012("smoker", Class5833::new);
   public static final Class8298<Class5836> field35670 = method29012("cartography_table", Class5836::new);
   public static final Class8298<Class5811> field35671 = method29012("stonecutter", Class5811::new);
   private final Class8302<T> field35672;

   private static <T extends Class5812> Class8298<T> method29012(String var0, Class8302<T> var1) {
      return Registry.<Class8298<T>>method9194(Registry.field16084, var0, new Class8298<T>(var1));
   }

   private Class8298(Class8302<T> var1) {
      this.field35672 = var1;
   }

   public T method29013(int var1, PlayerInventory var2) {
      return this.field35672.method29030(var1, var2);
   }
}
