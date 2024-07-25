package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class class_5368 {
   private final Map<Class<? extends class_7978>, class_7978> field_27384 = new HashMap<Class<? extends class_7978>, class_7978>();
   private final List<Class<? extends class_7978>> field_27383 = new ArrayList<Class<? extends class_7978>>();

   public void method_24488(Class<? extends class_7978> var1) {
      this.field_27383.add(var1);
   }

   public <T extends class_7978> void method_24491(Class<T> var1, T var2) {
      this.field_27384.put(var1, var2);
   }

   public <T extends class_7978> void method_24492(Class<T> var1, T var2) {
      this.field_27383.remove(var1);
      this.field_27384.put(var1, var2);
   }

   @Nullable
   public <T extends class_7978> T method_24490(Class<T> var1) {
      class_7978 var4 = this.field_27384.get(var1);
      if (var4 == null) {
         if (!this.field_27383.contains(var1)) {
            return null;
         } else {
            throw new IllegalStateException("There was no provider for " + var1 + ", one is required!");
         }
      } else {
         return (T)var4;
      }
   }
}
