package mapped;

import com.google.gson.JsonObject;

public class Class4458 extends Class4457 {
   private final Class8576 field21636;
   private final Class8634 field21637;

   public Class4458(Class9587 var1, Class8576 var2, Class8634 var3) {
      super(Class4904.method15157(), var1);
      this.field21636 = var2;
      this.field21637 = var3;
   }

   public static Class4458 method14095(Class8912 var0, Class9735 var1) {
      return new Class4458(Class9587.field44822, var0.method32580(), var1.method38151());
   }

   public boolean method14096(Class7380 var1, ServerWorld var2, BlockPos var3, ItemStack var4) {
      return this.field21636.method30650(var2, (double)var3.method8304() + 0.5, (double)var3.getY() + 0.5, (double)var3.method8306() + 0.5)
         ? this.field21637.method31016(var4)
         : false;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("location", this.field21636.method30652());
      var4.add("item", this.field21637.method31018());
      return var4;
   }
}
