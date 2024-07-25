package remapped;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public class ClientRecipeBook extends class_1147 {
   private static final Logger field_13278 = LogManager.getLogger();
   private Map<class_1296, List<class_7735>> field_13280 = ImmutableMap.of();
   private List<class_7735> field_13279 = ImmutableList.of();

   public void method_12235(Iterable<class_8932<?>> var1) {
      Map var4 = method_12234(var1);
      HashMap var5 = Maps.newHashMap();
      Builder var6 = ImmutableList.builder();
      var4.forEach((var2, var3) -> {
         List var6x = var5.put(var2, var3.stream().<class_7735>map(class_7735::new).peek(var6::add).collect(ImmutableList.toImmutableList()));
      });
      class_1296.field_7135
         .forEach(
            (var1x, var2) -> {
               List var5x = var5.put(
                  var1x,
                  var2.stream().flatMap(var1xx -> ((List)var5.getOrDefault(var1xx, ImmutableList.of())).stream()).collect(ImmutableList.toImmutableList())
               );
            }
         );
      this.field_13280 = ImmutableMap.copyOf(var5);
      this.field_13279 = var6.build();
   }

   private static Map<class_1296, List<List<class_8932<?>>>> method_12234(Iterable<class_8932<?>> var0) {
      HashMap var3 = Maps.newHashMap();
      HashBasedTable var4 = HashBasedTable.create();

      for (class_8932 var6 : var0) {
         if (!var6.method_41053()) {
            class_1296 var7 = method_12231(var6);
            String var8 = var6.method_41051();
            if (!var8.isEmpty()) {
               Object var9 = (List)var4.get(var7, var8);
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

   private static class_1296 method_12231(class_8932<?> var0) {
      class_1510 var3 = var0.method_41045();
      if (var3 != class_1510.field_7997) {
         if (var3 != class_1510.field_7995) {
            if (var3 != class_1510.field_7999) {
               if (var3 != class_1510.field_7994) {
                  if (var3 != class_1510.field_8000) {
                     if (var3 != class_1510.field_7996) {
                        if (var3 != class_1510.field_7998) {
                           field_13278.warn(
                              "Unknown recipe category: {}/{}",
                              new Supplier[]{() -> class_8669.field_44435.method_39797(var0.method_41045()), var0::method_41050}
                           );
                           return class_1296.field_7138;
                        } else {
                           return class_1296.field_7124;
                        }
                     } else {
                        return class_1296.field_7122;
                     }
                  } else {
                     return class_1296.field_7125;
                  }
               } else {
                  return class_1296.field_7132;
               }
            } else {
               return !(var0.method_41044().method_27960() instanceof class_6201) ? class_1296.field_7139 : class_1296.field_7136;
            }
         } else if (!var0.method_41044().method_27960().method_11247()) {
            return !(var0.method_41044().method_27960() instanceof class_6201) ? class_1296.field_7121 : class_1296.field_7120;
         } else {
            return class_1296.field_7130;
         }
      } else {
         ItemStack var4 = var0.method_41044();
         class_8230 var5 = var4.method_27960().method_11226();
         if (var5 != class_8230.field_42278) {
            if (var5 != class_8230.field_42270 && var5 != class_8230.field_42275) {
               return var5 != class_8230.field_42273 ? class_1296.field_7128 : class_1296.field_7140;
            } else {
               return class_1296.field_7131;
            }
         } else {
            return class_1296.field_7129;
         }
      }
   }

   public List<class_7735> method_12232() {
      return this.field_13279;
   }

   public List<class_7735> method_12233(class_1296 var1) {
      return this.field_13280.getOrDefault(var1, Collections.<class_7735>emptyList());
   }
}
