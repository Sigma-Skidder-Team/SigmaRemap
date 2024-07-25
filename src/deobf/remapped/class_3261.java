package remapped;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;

public abstract class class_3261 extends class_1174 implements class_3715 {
   private final Map<Integer, class_754> field_16169 = new ConcurrentHashMap<Integer, class_754>();
   private final class_754 field_16168;
   private int field_16170;

   public class_3261(class_1455 var1, class_754 var2) {
      super(var1);
      this.field_16168 = var2;
   }

   public void method_14877(int var1) {
      this.field_16169.remove(var1);
   }

   public void method_14878(int var1, class_754 var2) {
      if (var2 != null && this.field_16169 != null) {
         this.field_16169.put(var1, var2);
      }
   }

   public boolean method_14875(int var1) {
      return this.field_16169.containsKey(var1);
   }

   @Nullable
   public class_754 method_14879(int var1) {
      return this.field_16169.get(var1);
   }

   @Override
   public void method_17248(int var1) {
      this.field_16170 = var1;
      this.field_16169.put(var1, this.field_16168);
   }

   public int method_14874() {
      return this.field_16170;
   }

   public void method_14876(int var1) {
      this.field_16170 = var1;
   }
}
