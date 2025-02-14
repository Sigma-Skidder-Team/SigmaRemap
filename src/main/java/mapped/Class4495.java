package mapped;

import com.google.gson.JsonObject;

public class Class4495 extends Class4457 {
   private final Class9587 field21702;
   private final Class9587 field21703;

   public Class4495(Class9587 var1, Class9587 var2, Class9587 var3) {
      super(Class4894.method15123(), var1);
      this.field21702 = var2;
      this.field21703 = var3;
   }

   public static Class4495 method14174() {
      return new Class4495(Class9587.field44822, Class9587.field44822, Class9587.field44822);
   }

   public boolean method14175(LootContext var1, LootContext var2) {
      return this.field21702.method37227(var1) ? this.field21703.method37227(var2) : false;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("zombie", this.field21702.method37228(var1));
      var4.add("villager", this.field21703.method37228(var1));
      return var4;
   }
}
