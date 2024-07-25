package remapped;

import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Const.PrimitiveType;
import com.mojang.serialization.codecs.PrimitiveCodec;

public class class_5178 extends Schema {
   private static String[] field_26655;
   public static final PrimitiveCodec<String> field_26656 = new class_6918();
   private static final Type<String> field_26657 = new PrimitiveType(field_26656);

   public class_5178(int var1, Schema var2) {
      super(var1, var2);
   }

   public static String method_23742(String var0) {
      class_4639 var3 = class_4639.method_21455(var0);
      return var3 == null ? var0 : var3.toString();
   }

   public static Type<String> method_23741() {
      return field_26657;
   }

   public Type<?> getChoiceType(TypeReference var1, String var2) {
      return super.getChoiceType(var1, method_23742(var2));
   }
}
