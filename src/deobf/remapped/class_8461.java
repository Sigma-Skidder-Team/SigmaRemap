package remapped;

import com.mojang.serialization.Codec;

public class class_8461 {
   private static String[] field_43259;
   public static final Codec<class_8461> field_43261 = Identifier.field_22655.xmap(class_8461::new, var0 -> var0.field_43260);
   private final Identifier field_43260;

   public class_8461(Identifier var1) {
      this.field_43260 = var1;
   }

   public Identifier method_38928() {
      return this.field_43260;
   }
}
