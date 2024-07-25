package remapped;

import com.google.common.collect.BiMap;
import java.util.Map;
import javax.annotation.Nullable;

public final class class_3247 implements class_9349<T> {
   private static String[] field_16140;
   private final class_2307<T> field_16139;

   public class_3247(BiMap var1) {
      this.field_16138 = var1;
      this.field_16139 = class_7520.method_34261();
   }

   @Override
   public class_2307<T> method_43145(Identifier var1) {
      return (class_2307<T>)this.field_16138.getOrDefault(var1, this.field_16139);
   }

   @Nullable
   @Override
   public Identifier method_43144(class_2307<T> var1) {
      return !(var1 instanceof class_8813) ? (Identifier)this.field_16138.inverse().get(var1) : ((class_8813)var1).method_40487();
   }

   @Override
   public Map<Identifier, class_2307<T>> method_43137() {
      return this.field_16138;
   }
}
