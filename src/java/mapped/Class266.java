package mapped;

import com.google.common.collect.Maps;

import java.util.Map;

public class Class266 implements Class215 {
   private static String[] field1029;
   public static final Class9434<Class8848> field1030 = new Class9434<Class8848>();
   public static final Class9434<Class8848> field1031 = new Class9434<Class8848>();
   public static final Class9434<Class9266> field1032 = new Class9434<Class9266>();
   private final Map<Class9434<?>, Class7010<?>> field1033 = Maps.newHashMap();

   @Override
   public void method737(Class191 var1) {
      for (Class7010 var5 : this.field1033.values()) {
         var5.method21736();
      }
   }

   public <T> void method961(Class9434<T> var1, Class7010<T> var2) {
      this.field1033.put(var1, var2);
   }

   public <T> Class7010<T> method962(Class9434<T> var1) {
      return (Class7010<T>)this.field1033.get(var1);
   }
}
