package mapped;

import com.google.gson.JsonObject;

public class Class4481 extends Class4457 {
   private final Class8576 field21673;
   private final Class8576 field21674;
   private final Class8884 field21675;

   public Class4481(Class9587 var1, Class8576 var2, Class8576 var3, Class8884 var4) {
      super(Class4900.method15145(), var1);
      this.field21673 = var2;
      this.field21674 = var3;
      this.field21675 = var4;
   }

   public static Class4481 method14143(Class8884 var0) {
      return new Class4481(Class9587.field44822, Class8576.field38559, Class8576.field38559, var0);
   }

   public boolean method14144(Class1657 var1, Vector3d var2, double var3, double var5, double var7) {
      if (this.field21673.method30650(var1, var2.field18048, var2.field18049, var2.field18050)) {
         return this.field21674.method30650(var1, var3, var5, var7)
            ? this.field21675.method32328(var2.field18048, var2.field18049, var2.field18050, var3, var5, var7)
            : false;
      } else {
         return false;
      }
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("entered", this.field21673.method30652());
      var4.add("exited", this.field21674.method30652());
      var4.add("distance", this.field21675.method32330());
      return var4;
   }
}
