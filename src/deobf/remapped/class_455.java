package remapped;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_455<C> {
   private static final Logger field_1889 = LogManager.getLogger();
   public static final class_455<class_341> field_1893 = new class_455<class_341>().method_2186(new class_1148()).method_2186(new class_6977());
   private final Map<Identifier, class_5923<C, ?>> field_1890 = Maps.newHashMap();
   private final Map<Class<?>, class_5923<C, ?>> field_1892 = Maps.newHashMap();

   public class_455<C> method_2186(class_5923<C, ?> var1) {
      this.field_1890.put(var1.method_27097(), var1);
      this.field_1892.put(var1.method_27095(), var1);
      return this;
   }

   private <T extends class_7803<C>> class_5923<C, T> method_2188(Class<?> var1) {
      return (class_5923<C, T>)this.field_1892.get(var1);
   }

   public <T extends class_7803<C>> class_5734 method_2187(T var1) {
      class_5923 var4 = this.method_2188(var1.getClass());
      class_5734 var5 = new class_5734();
      var4.method_27093(var5, (C)var1);
      var5.method_25941("Type", var4.method_27097().toString());
      return var5;
   }

   @Nullable
   public class_7803<C> method_2185(class_5734 var1) {
      Identifier var4 = Identifier.method_21455(var1.method_25965("Type"));
      class_5923 var5 = this.field_1890.get(var4);
      if (var5 == null) {
         field_1889.error("Failed to deserialize timer callback: " + var1);
         return null;
      } else {
         try {
            return var5.method_27094(var1);
         } catch (Exception var7) {
            field_1889.error("Failed to deserialize timer callback: " + var1, var7);
            return null;
         }
      }
   }
}
