package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import javax.annotation.Nullable;

public class Class4667 implements Class4664 {
   private final ResourceLocation field22222;
   private final Class120 field22223;
   private final Class120 field22224;
   private final Item field22225;
   private final Class7999 field22226;
   private final ResourceLocation field22227;
   private final Class6504<?> field22228;

   public Class4667(ResourceLocation var1, Class6504<?> var2, Class120 var3, Class120 var4, Item var5, Class7999 var6, ResourceLocation var7) {
      this.field22222 = var1;
      this.field22228 = var2;
      this.field22223 = var3;
      this.field22224 = var4;
      this.field22225 = var5;
      this.field22226 = var6;
      this.field22227 = var7;
   }

   @Override
   public void method14632(JsonObject var1) {
      var1.add("base", this.field22223.method336());
      var1.add("addition", this.field22224.method336());
      JsonObject var4 = new JsonObject();
      var4.addProperty("item", Registry.ITEM.getKey(this.field22225).toString());
      var1.add("result", var4);
   }

   @Override
   public ResourceLocation method14634() {
      return this.field22222;
   }

   @Override
   public Class6504<?> method14633() {
      return this.field22228;
   }

   @Nullable
   @Override
   public JsonObject method14635() {
      return this.field22226.method27318();
   }

   @Nullable
   @Override
   public ResourceLocation method14636() {
      return this.field22227;
   }
}
