package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class class_8451 implements AutoCloseable {
   private static final Identifier field_43215 = new Identifier("textures/map/map_icons.png");
   private static final class_3581 field_43216 = class_3581.method_16732(field_43215);
   private final TextureManager field_43212;
   private final Map<String, class_5962> field_43213 = Maps.newHashMap();

   public class_8451(TextureManager var1) {
      this.field_43212 = var1;
   }

   public void method_38857(class_2134 var1) {
      class_5962.method_27234(this.method_38862(var1));
   }

   public void method_38860(class_7966 var1, class_2565 var2, class_2134 var3, boolean var4, int var5) {
      class_5962.method_27236(this.method_38862(var3), var1, var2, var4, var5);
   }

   private class_5962 method_38862(class_2134 var1) {
      class_5962 var4 = this.field_43213.get(var1.method_32926());
      if (var4 == null) {
         var4 = new class_5962(this, var1, null);
         this.field_43213.put(var1.method_32926(), var4);
      }

      return var4;
   }

   @Nullable
   public class_5962 method_38865(String var1) {
      return this.field_43213.get(var1);
   }

   public void method_38858() {
      for (class_5962 var4 : this.field_43213.values()) {
         var4.close();
      }

      this.field_43213.clear();
   }

   @Nullable
   public class_2134 method_38861(class_5962 var1) {
      return var1 == null ? null : class_5962.method_27237(var1);
   }

   @Override
   public void close() {
      this.method_38858();
   }
}
