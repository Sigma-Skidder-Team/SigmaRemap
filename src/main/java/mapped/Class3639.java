package mapped;

import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Const.PrimitiveType;
import com.mojang.serialization.codecs.PrimitiveCodec;
import net.minecraft.util.ResourceLocation;

public class Class3639 extends Schema {
   private static String[] field19679;
   public static final PrimitiveCodec<String> field19680 = new Class9075();
   private static final Type<String> field19681 = new PrimitiveType(field19680);

   public Class3639(int var1, Schema var2) {
      super(var1, var2);
   }

   public static String method12353(String var0) {
      ResourceLocation var3 = ResourceLocation.method8289(var0);
      return var3 == null ? var0 : var3.toString();
   }

   public static Type<String> method12354() {
      return field19681;
   }

   public Type<?> getChoiceType(TypeReference var1, String var2) {
      return super.getChoiceType(var1, method12353(var2));
   }
}
