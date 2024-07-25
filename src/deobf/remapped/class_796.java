package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class class_796 implements class_6491 {
   private static String[] field_4276;
   public static final class_8358<class_6098> field_4279 = new class_8358<class_6098>();
   public static final class_8358<class_6098> field_4275 = new class_8358<class_6098>();
   public static final class_8358<class_7735> field_4278 = new class_8358<class_7735>();
   private final Map<class_8358<?>, class_1272<?>> field_4277 = Maps.newHashMap();

   @Override
   public void method_29609(class_7832 var1) {
      for (class_1272 var5 : this.field_4277.values()) {
         var5.method_5710();
      }
   }

   public <T> void method_3534(class_8358<T> var1, class_1272<T> var2) {
      this.field_4277.put(var1, var2);
   }

   public <T> class_1272<T> method_3536(class_8358<T> var1) {
      return (class_1272<T>)this.field_4277.get(var1);
   }
}
