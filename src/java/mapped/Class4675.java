package mapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.RecordBuilder.AbstractStringBuilder;
import java.util.Map.Entry;

public class Class4675 extends AbstractStringBuilder<Class30, Class39> {
   public final Class8063 field22244;

   public Class4675(Class8063 var1) {
      super(var1);
      this.field22244 = var1;
   }

   public Class39 initBuilder() {
      return new Class39();
   }

   public Class39 append(String var1, Class30 var2, Class39 var3) {
      var3.method99(var1, var2);
      return var3;
   }

   public DataResult<Class30> build(Class39 var1, Class30 var2) {
      if (var2 == null || var2 == Class38.field78) {
         return DataResult.success(var1);
      } else if (!(var2 instanceof Class39)) {
         return DataResult.error("mergeToMap called with not a map: " + var2, var2);
      } else {
         Class39 var5 = new Class39(Maps.newHashMap(((Class39)var2).method143()));

         for (Entry var7 : var1.method143().entrySet()) {
            var5.method99((String)var7.getKey(), (Class30)var7.getValue());
         }

         return DataResult.success(var5);
      }
   }
}
