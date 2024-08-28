package mapped;

import com.google.gson.JsonObject;

public abstract class Class4457 implements Class4477 {
   private final ResourceLocation field21634;
   private final Class9587 field21635;

   public Class4457(ResourceLocation var1, Class9587 var2) {
      this.field21634 = var1;
      this.field21635 = var2;
   }

   @Override
   public ResourceLocation method14093() {
      return this.field21634;
   }

   public Class9587 method14094() {
      return this.field21635;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = new JsonObject();
      var4.add("player", this.field21635.method37228(var1));
      return var4;
   }

   @Override
   public String toString() {
      return "AbstractCriterionInstance{criterion=" + this.field21634 + '}';
   }
}
