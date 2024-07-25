package remapped;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;

public interface class_416 {
   class_416 field_1766 = new class_8713();

   static class_416 method_2075(class_9854 var0, ITextProperties var1, int var2) {
      return method_2070(
         var0,
         var0.method_45391(var1, var2)
            .stream()
            .<class_9749>map(var1x -> new class_9749(var1x, var0.method_45400(var1x), null))
            .collect(ImmutableList.toImmutableList())
      );
   }

   static class_416 method_2069(class_9854 var0, ITextProperties var1, int var2, int var3) {
      return method_2070(
         var0,
         var0.method_45391(var1, var2)
            .stream()
            .limit((long)var3)
            .<class_9749>map(var1x -> new class_9749(var1x, var0.method_45400(var1x), null))
            .collect(ImmutableList.toImmutableList())
      );
   }

   static class_416 method_2073(class_9854 var0, ITextComponent... var1) {
      return method_2070(
         var0,
         Arrays.<ITextComponent>stream(var1)
            .<class_7107>map(ITextComponent::func_241878_f)
            .<class_9749>map(var1x -> new class_9749(var1x, var0.method_45400(var1x), null))
            .collect(ImmutableList.toImmutableList())
      );
   }

   static class_416 method_2070(class_9854 var0, List<class_9749> var1) {
      return (class_416)(!var1.isEmpty() ? new class_6106(var1, var0) : field_1766);
   }

   int method_2067(class_7966 var1, int var2, int var3);

   int method_2071(class_7966 var1, int var2, int var3, int var4, int var5);

   int method_2074(class_7966 var1, int var2, int var3, int var4, int var5);

   int method_2068(class_7966 var1, int var2, int var3, int var4, int var5);

   int method_2072();
}
