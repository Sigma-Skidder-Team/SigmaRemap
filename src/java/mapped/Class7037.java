package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class7037 {
   private final Map<Class4869, Class9805> field30365 = Maps.newHashMap();
   private boolean field30366;

   private Class9805 method21847(Class4869 var1) {
      Class9805 var4 = new Class9805(var1, var2 -> {
         if (this.field30366) {
            throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + Registry.field16087.getKey(var1));
         }
      });
      this.field30365.put(var1, var4);
      return var4;
   }

   public Class7037 method21848(Class4869 var1) {
      this.method21847(var1);
      return this;
   }

   public Class7037 method21849(Class4869 var1, double var2) {
      Class9805 var6 = this.method21847(var1);
      var6.method38661(var2);
      return this;
   }

   public Class9767 method21850() {
      this.field30366 = true;
      return new Class9767(this.field30365);
   }
}
