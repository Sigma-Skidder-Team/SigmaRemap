package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.state.Property;
import net.minecraft.state.StateHolder;

import java.util.Optional;

public class Class8645 extends Class8646 {
   private final String field38924;
   private final String field38925;

   public Class8645(String var1, String var2, String var3) {
      super(var1);
      this.field38924 = var2;
      this.field38925 = var3;
   }

   @Override
   public <T extends Comparable<T>> boolean method31076(StateHolder<?, ?> var1, Property<T> var2) {
      T var5 = var1.get(var2);
      if (this.field38924 != null) {
         Optional<T> var6 = var2.parseValue(this.field38924);
         if (!var6.isPresent() || var5.compareTo(var6.get()) < 0) {
            return false;
         }
      }

      if (this.field38925 != null) {
         Optional<T> var7 = var2.parseValue(this.field38925);
         if (!var7.isPresent() || var5.compareTo(var7.get()) > 0) {
            return false;
         }
      }

      return true;
   }

   @Override
   public JsonElement method31077() {
      JsonObject var3 = new JsonObject();
      if (this.field38924 != null) {
         var3.addProperty("min", this.field38924);
      }

      if (this.field38925 != null) {
         var3.addProperty("max", this.field38925);
      }

      return var3;
   }
}
