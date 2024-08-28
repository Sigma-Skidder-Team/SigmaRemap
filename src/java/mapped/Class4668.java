package mapped;

import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class Class4668 implements Class4664 {
   public final String field22229;
   public final Class7557 field22230;

   public Class4668(Class7557 var1, String var2) {
      this.field22230 = var1;
      this.field22229 = var2;
   }

   @Override
   public void method14632(JsonObject var1) {
   }

   @Override
   public Class6504<?> method14633() {
      return Class7557.method24736(this.field22230);
   }

   @Override
   public ResourceLocation method14634() {
      return new ResourceLocation(this.field22229);
   }

   @Nullable
   @Override
   public JsonObject method14635() {
      return null;
   }

   @Override
   public ResourceLocation method14636() {
      return new ResourceLocation("");
   }
}
