package mapped;

import com.google.common.collect.*;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public class Class6943 extends Class6941 {
   private static final Logger field30093 = LogManager.getLogger();
   private Map<Class1896, List<Class9266>> field30094 = ImmutableMap.of();
   private List<Class9266> field30095 = ImmutableList.of();

   public void method21383(Iterable<Class4843<?>> var1) {
      Map<Class1896, List<List<Class4843<?>>>> var4 = method21384(var1);
      Map<Class1896, ImmutableList<Class9266>> var5 = Maps.newHashMap();
      Builder<Class9266> var6 = ImmutableList.builder();
      var4.forEach((var2, var3) -> {
         List<Class9266> var6x = var5.put(var2, var3.stream().map(Class9266::new).peek(var6::add).collect(ImmutableList.toImmutableList()));
      });
      Class1896.field11135
         .forEach(
            (var1x, var2) -> {
               List<Class9266> var5x = var5.put(
                  var1x,
                  var2.stream().flatMap(var1xx -> var5.getOrDefault(var1xx, ImmutableList.of()).stream()).collect(ImmutableList.toImmutableList())
               );
            }
         );
      this.field30094 = ImmutableMap.copyOf(var5);
      this.field30095 = var6.build();
   }

   private static Map<Class1896, List<List<Class4843<?>>>> method21384(Iterable<Class4843<?>> var0) {
      Map<Class1896, List<List<Class4843<?>>>> var3 = Maps.newHashMap();
      Table<Class1896, String, List<Class4843<?>>> var4 = HashBasedTable.create();

      for (Class4843<?> var6 : var0) {
         if (!var6.method14965()) {
            Class1896 var7 = method21385(var6);
            String var8 = var6.method14970();
            if (!var8.isEmpty()) {
               List<Class4843<?>> var9 = var4.get(var7, var8);
               if (var9 == null) {
                  var9 = Lists.newArrayList();
                  var4.put(var7, var8, var9);
                  var3.computeIfAbsent(var7, var0x -> Lists.newArrayList()).add(var9);
               }

               var9.add(var6);
            } else {
               var3.computeIfAbsent(var7, var0x -> Lists.newArrayList()).add(ImmutableList.of(var6));
            }
         }
      }

      return var3;
   }

   private static Class1896 method21385(Class4843<?> var0) {
      Class7207 var3 = var0.method14967();
      if (var3 != Class7207.field30935) {
         if (var3 != Class7207.field30936) {
            if (var3 != Class7207.field30937) {
               if (var3 != Class7207.field30938) {
                  if (var3 != Class7207.field30940) {
                     if (var3 != Class7207.field30939) {
                        if (var3 != Class7207.field30941) {
                           field30093.warn(
                              "Unknown recipe category: {}/{}", new Supplier[]{() -> Class2348.field16085.method9181(var0.method14967()), var0::method14964}
                           );
                           return Class1896.field11130;
                        } else {
                           return Class1896.field11128;
                        }
                     } else {
                        return Class1896.field11129;
                     }
                  } else {
                     return Class1896.field11127;
                  }
               } else {
                  return Class1896.field11126;
               }
            } else {
               return !(var0.method14966().method32107() instanceof Class3292) ? Class1896.field11124 : Class1896.field11123;
            }
         } else if (!var0.method14966().method32107().method11744()) {
            return !(var0.method14966().method32107() instanceof Class3292) ? Class1896.field11121 : Class1896.field11120;
         } else {
            return Class1896.field11119;
         }
      } else {
         ItemStack var4 = var0.method14966();
         Class7401 var5 = var4.method32107().method11739();
         if (var5 != Class7401.field31665) {
            if (var5 != Class7401.field31672 && var5 != Class7401.field31673) {
               return var5 != Class7401.field31667 ? Class1896.field11117 : Class1896.field11115;
            } else {
               return Class1896.field11116;
            }
         } else {
            return Class1896.field11114;
         }
      }
   }

   public List<Class9266> method21386() {
      return this.field30095;
   }

   public List<Class9266> method21387(Class1896 var1) {
      return this.field30094.getOrDefault(var1, Collections.<Class9266>emptyList());
   }
}