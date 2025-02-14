package mapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.RecordBuilder.AbstractStringBuilder;
import net.minecraft.nbt.EndNBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.NBTDynamicOps;

import java.util.Map.Entry;

public class Class4675 extends AbstractStringBuilder<INBT, CompoundNBT> {
   public final NBTDynamicOps field22244;

   public Class4675(NBTDynamicOps var1) {
      super(var1);
      this.field22244 = var1;
   }

   public CompoundNBT initBuilder() {
      return new CompoundNBT();
   }

   public CompoundNBT append(String var1, INBT var2, CompoundNBT var3) {
      var3.put(var1, var2);
      return var3;
   }

   public DataResult<INBT> build(CompoundNBT var1, INBT var2) {
      if (var2 == null || var2 == EndNBT.INSTANCE) {
         return DataResult.success(var1);
      } else if (!(var2 instanceof CompoundNBT)) {
         return DataResult.error("mergeToMap called with not a map: " + var2, var2);
      } else {
         CompoundNBT var5 = new CompoundNBT(Maps.newHashMap(((CompoundNBT)var2).getTagMap()));

         for (Entry var7 : var1.getTagMap().entrySet()) {
            var5.put((String)var7.getKey(), (INBT)var7.getValue());
         }

         return DataResult.success(var5);
      }
   }
}
