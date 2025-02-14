package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.util.Util;
import net.minecraft.state.Property;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Class5148 implements Class5146 {
   private final Block field23372;
   private final List<Class5138> field23373;
   private final Set<Property<?>> field23374 = Sets.newHashSet();
   private final List<Class3629> field23375 = Lists.newArrayList();

   private Class5148(Block var1, List<Class5138> var2) {
      this.field23372 = var1;
      this.field23373 = var2;
   }

   public Class5148 method15939(Class3629 var1) {
      var1.method12298().forEach(var1x -> {
         if (this.field23372.getStateContainer().getProperty(var1x.getName()) == var1x) {
            if (!this.field23374.add(var1x)) {
               throw new IllegalStateException("Values of property " + var1x + " already defined for block " + this.field23372);
            }
         } else {
            throw new IllegalStateException("Property " + var1x + " is not defined for block " + this.field23372);
         }
      });
      this.field23375.add(var1);
      return this;
   }

   public JsonElement get() {
      Stream<Pair<Class9262, List<Class5138>>> var3 = Stream.of(Pair.of(Class9262.method34856(), this.field23373));

      for (Class3629 var5 : this.field23375) {
         Map<Class9262, List<Class5138>> var6 = var5.method12308();
         var3 = var3.flatMap(var1 -> var6.entrySet().stream().map(var1x -> {
               Class9262 var4 = var1.getFirst().method34855(var1x.getKey());
               List<Class5138> var5x = method15940(var1.getSecond(), var1x.getValue());
               return Pair.of(var4, var5x);
            }));
      }

      Map<String, JsonElement> var7 = new TreeMap();
      var3.forEach(var1 -> {
         JsonElement var4 = var7.put(var1.getFirst().method34858(), Class5138.method15914(var1.getSecond()));
      });

      JsonObject var8 = new JsonObject();
      var8.add("variants", Util.make(new JsonObject(), var1 -> var7.forEach(var1::add)));
      return var8;
   }

   private static List<Class5138> method15940(List<Class5138> var0, List<Class5138> var1) {
      Builder var4 = ImmutableList.builder();
      var0.forEach(var2 -> var1.forEach(var2x -> var4.add(Class5138.method15913(var2, var2x))));
      return var4.build();
   }

   @Override
   public Block method15931() {
      return this.field23372;
   }

   public static Class5148 method15941(Block var0) {
      return new Class5148(var0, ImmutableList.of(Class5138.method15912()));
   }

   public static Class5148 method15942(Block var0, Class5138 var1) {
      return new Class5148(var0, ImmutableList.of(var1));
   }

   public static Class5148 method15943(Block var0, Class5138... var1) {
      return new Class5148(var0, ImmutableList.copyOf(var1));
   }
}
