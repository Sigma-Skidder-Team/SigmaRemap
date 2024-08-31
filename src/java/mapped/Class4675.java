package mapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.RecordBuilder.AbstractStringBuilder;
import net.minecraft.nbt.CompoundNBT;

import java.util.Map.Entry;

public class Class4675 extends AbstractStringBuilder<Class30, CompoundNBT> {
   public final NBTDynamicOps field22244;

   public Class4675(NBTDynamicOps var1) {
      super(var1);
      this.field22244 = var1;
   }

   public CompoundNBT initBuilder() {
      return new CompoundNBT();
   }

   public CompoundNBT append(String var1, Class30 var2, CompoundNBT var3) {
      var3.put(var1, var2);
      return var3;
   }

   public DataResult<Class30> build(CompoundNBT var1, Class30 var2) {
      if (var2 == null || var2 == Class38.field78) {
         return DataResult.success(var1);
      } else if (!(var2 instanceof CompoundNBT)) {
         return DataResult.error("mergeToMap called with not a map: " + var2, var2);
      } else {
         CompoundNBT var5 = new CompoundNBT(Maps.newHashMap(((CompoundNBT)var2).method143()));

         for (Entry var7 : var1.method143().entrySet()) {
            var5.put((String)var7.getKey(), (Class30)var7.getValue());
         }

         return DataResult.success(var5);
      }
   }
}
