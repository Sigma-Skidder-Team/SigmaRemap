package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.state.StateContainer;

import java.util.List;
import java.util.function.Supplier;

public class Class5143 implements Class5141 {
   private static String[] field23365;
   private final Class2313 field23366;
   private final List<Class5141> field23367;

   public Class5143(Class2313 var1, List<Class5141> var2) {
      this.field23366 = var1;
      this.field23367 = var2;
   }

   @Override
   public void method15918(StateContainer<?, ?> var1) {
      this.field23367.forEach(var1x -> var1x.method15918(var1));
   }

   public JsonElement get() {
      JsonArray var3 = new JsonArray();
      this.field23367.stream().map(Supplier::get).forEach(var3::add);
      JsonObject var4 = new JsonObject();
      var4.add(Class2313.method9087(this.field23366), var3);
      return var4;
   }
}
