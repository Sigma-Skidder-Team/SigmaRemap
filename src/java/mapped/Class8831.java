package mapped;

public class Class8831 {
   private static String[] field39873;
   private Block field39874;
   private ITag<Block> field39875;
   private Class7340 field39876 = Class7340.field31445;
   private Class8811 field39877 = Class8811.field39645;

   private Class8831() {
   }

   public static Class8831 method31929() {
      return new Class8831();
   }

   public Class8831 method31930(Block var1) {
      this.field39874 = var1;
      return this;
   }

   public Class8831 method31931(ITag<Block> var1) {
      this.field39875 = var1;
      return this;
   }

   public Class8831 method31932(Class7340 var1) {
      this.field39876 = var1;
      return this;
   }

   public Class9449 method31933() {
      return new Class9449(this.field39875, this.field39874, this.field39876, this.field39877);
   }
}
