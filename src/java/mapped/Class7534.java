package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class Class7534 extends Class7530 {
   private final Map<String, CompoundNBT> field32339 = Maps.newHashMap();

   public Class7534(String var1) {
      super(var1);
   }

   @Override
   public void method24591(CompoundNBT var1) {
      CompoundNBT var4 = var1.getCompound("contents");

      for (String var6 : var4.method97()) {
         this.field32339.put(var6, var4.getCompound(var6));
      }
   }

   @Override
   public CompoundNBT method24592(CompoundNBT var1) {
      CompoundNBT var4 = new CompoundNBT();
      this.field32339.forEach((var1x, var2) -> var4.put(var1x, var2.method79()));
      var1.put("contents", var4);
      return var1;
   }

   public CompoundNBT method24624(String var1) {
      CompoundNBT var4 = this.field32339.get(var1);
      return var4 == null ? new CompoundNBT() : var4;
   }

   public void method24625(String var1, CompoundNBT var2) {
      if (!var2.method134()) {
         this.field32339.put(var1, var2);
      } else {
         this.field32339.remove(var1);
      }

      this.method24605();
   }

   public Stream<ResourceLocation> method24626(String var1) {
      return this.field32339.keySet().stream().<ResourceLocation>map(var1x -> new ResourceLocation(var1, var1x));
   }
}
