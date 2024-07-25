package remapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.RecordBuilder.AbstractStringBuilder;
import java.util.Map.Entry;

public class class_188 extends AbstractStringBuilder<class_8406, CompoundNBT> {
   public class_188(class_3504 var1) {
      super(var1);
      this.field_627 = var1;
   }

   public CompoundNBT initBuilder() {
      return new CompoundNBT();
   }

   public CompoundNBT append(String var1, class_8406 var2, CompoundNBT var3) {
      var3.put(var1, var2);
      return var3;
   }

   public DataResult<class_8406> build(CompoundNBT var1, class_8406 var2) {
      if (var2 == null || var2 == class_8944.field_45856) {
         return DataResult.success(var1);
      } else if (!(var2 instanceof CompoundNBT)) {
         return DataResult.error("mergeToMap called with not a map: " + var2, var2);
      } else {
         CompoundNBT var5 = new CompoundNBT(Maps.newHashMap(((CompoundNBT)var2).method_25967()));

         for (Entry var7 : var1.method_25967().entrySet()) {
            var5.put((String)var7.getKey(), (class_8406)var7.getValue());
         }

         return DataResult.success(var5);
      }
   }
}
