package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.stream.Stream;

public class Class7534 extends Class7530 {
   private final Map<String, Class39> field32339 = Maps.newHashMap();

   public Class7534(String var1) {
      super(var1);
   }

   @Override
   public void method24591(Class39 var1) {
      Class39 var4 = var1.method130("contents");

      for (String var6 : var4.method97()) {
         this.field32339.put(var6, var4.method130(var6));
      }
   }

   @Override
   public Class39 method24592(Class39 var1) {
      Class39 var4 = new Class39();
      this.field32339.forEach((var1x, var2) -> var4.method99(var1x, var2.method79()));
      var1.method99("contents", var4);
      return var1;
   }

   public Class39 method24624(String var1) {
      Class39 var4 = this.field32339.get(var1);
      return var4 == null ? new Class39() : var4;
   }

   public void method24625(String var1, Class39 var2) {
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
