package mapped;

import com.google.gson.JsonObject;

public class Class4486 extends Class4457 {
   private final Block field21682;
   private final Class7340 field21683;
   private final Class8576 field21684;
   private final Class8634 field21685;

   public Class4486(Class9587 var1, Block var2, Class7340 var3, Class8576 var4, Class8634 var5) {
      super(Class4899.method15142(), var1);
      this.field21682 = var2;
      this.field21683 = var3;
      this.field21684 = var4;
      this.field21685 = var5;
   }

   public static Class4486 method14152(Block var0) {
      return new Class4486(Class9587.field44822, var0, Class7340.field31445, Class8576.field38559, Class8634.field38839);
   }

   public boolean method14153(Class7380 var1, BlockPos var2, Class1657 var3, Class8848 var4) {
      if (this.field21682 != null && !var1.method23448(this.field21682)) {
         return false;
      } else if (this.field21683.method23258(var1)) {
         return this.field21684.method30651(var3, (float)var2.method8304(), (float)var2.getY(), (float)var2.method8306())
            ? this.field21685.method31016(var4)
            : false;
      } else {
         return false;
      }
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      if (this.field21682 != null) {
         var4.addProperty("block", Class2348.field16072.method9181(this.field21682).toString());
      }

      var4.add("state", this.field21683.method23262());
      var4.add("location", this.field21684.method30652());
      var4.add("item", this.field21685.method31018());
      return var4;
   }
}
