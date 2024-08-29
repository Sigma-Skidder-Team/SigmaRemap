package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.minecraft.entity.EntityType;

public class Class8926 extends Class8924 {
   private final ITag<EntityType<?>> field40403;

   public Class8926(ITag<EntityType<?>> var1) {
      this.field40403 = var1;
   }

   @Override
   public boolean method32624(EntityType<?> var1) {
      return this.field40403.method24917(var1);
   }

   @Override
   public JsonElement method32625() {
      return new JsonPrimitive("#" + Class9443.method36296().method32660().method27136(this.field40403));
   }
}
