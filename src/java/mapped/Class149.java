package mapped;

public class Class149 extends Class128 {
   private final ResourceLocation field493;
   private final long field494;

   public Class149(Class122[] var1, ResourceLocation var2, long var3) {
      super(var1);
      this.field493 = var2;
      this.field494 = var3;
   }

   @Override
   public Class7128 method368() {
      return Class8585.field38633;
   }

   @Override
   public Class8848 method371(Class8848 var1, Class7812 var2) {
      if (!var1.method32105()) {
         Class39 var5 = new Class39();
         var5.method109("LootTable", this.field493.toString());
         if (this.field494 != 0L) {
            var5.method103("LootTableSeed", this.field494);
         }

         var1.method32143().method99("BlockEntityTag", var5);
         return var1;
      } else {
         return var1;
      }
   }

   @Override
   public void method367(Class8478 var1) {
      if (!var1.method29959(this.field493)) {
         super.method367(var1);
         Class7318 var4 = var1.method29963(this.field493);
         if (var4 != null) {
            var4.method23184(var1.method29957("->{" + this.field493 + "}", this.field493));
         } else {
            var1.method29955("Unknown loot table called " + this.field493);
         }
      } else {
         var1.method29955("Table " + this.field493 + " is recursively called");
      }
   }

   // $VF: synthetic method
   public static ResourceLocation method452(Class149 var0) {
      return var0.field493;
   }

   // $VF: synthetic method
   public static long method453(Class149 var0) {
      return var0.field494;
   }
}
