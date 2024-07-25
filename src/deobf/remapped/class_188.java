package remapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.RecordBuilder.AbstractStringBuilder;
import java.util.Map.Entry;

public class class_188 extends AbstractStringBuilder<class_8406, class_5734> {
   public class_188(class_3504 var1) {
      super(var1);
      this.field_627 = var1;
   }

   public class_5734 initBuilder() {
      return new class_5734();
   }

   public class_5734 append(String var1, class_8406 var2, class_5734 var3) {
      var3.method_25946(var1, var2);
      return var3;
   }

   public DataResult<class_8406> build(class_5734 var1, class_8406 var2) {
      if (var2 == null || var2 == class_8944.field_45856) {
         return DataResult.success(var1);
      } else if (!(var2 instanceof class_5734)) {
         return DataResult.error("mergeToMap called with not a map: " + var2, var2);
      } else {
         class_5734 var5 = new class_5734(Maps.newHashMap(((class_5734)var2).method_25967()));

         for (Entry var7 : var1.method_25967().entrySet()) {
            var5.method_25946((String)var7.getKey(), (class_8406)var7.getValue());
         }

         return DataResult.success(var5);
      }
   }
}
