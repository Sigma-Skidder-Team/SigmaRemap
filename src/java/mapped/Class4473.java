package mapped;

import com.google.gson.JsonObject;

public class Class4473 extends Class4457 {
   private final Class8840 field21662;
   private final Class9587 field21663;

   public Class4473(Class9587 var1, Class8840 var2, Class9587 var3) {
      super(Class4906.method15163(), var1);
      this.field21662 = var2;
      this.field21663 = var3;
   }

   public static Class4473 method14128(Class8840 var0, Class9587 var1) {
      return new Class4473(Class9587.field44822, var0, var1);
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("signal_strength", this.field21662.method32005());
      var4.add("projectile", this.field21663.method37228(var1));
      return var4;
   }

   public boolean method14129(LootContext var1, Vector3d var2, int var3) {
      return this.field21662.method32015(var3) ? this.field21663.method37227(var1) : false;
   }
}
