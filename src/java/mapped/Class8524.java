package mapped;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class Class8524 {
   private static final BiMap<ResourceLocation, Class7538> field38280 = HashBiMap.create();
   public static final Class7538 field38281 = method30212("empty", var0 -> {
   });
   public static final Class7538 field38282 = method30212("chest", var0 -> var0.method23225(Class9525.field44335).method23226(Class9525.field44330));
   public static final Class7538 field38283 = method30212("command", var0 -> var0.method23225(Class9525.field44335).method23226(Class9525.field44330));
   public static final Class7538 field38284 = method30212("selector", var0 -> var0.method23225(Class9525.field44335).method23225(Class9525.field44330));
   public static final Class7538 field38285 = method30212(
      "fishing", var0 -> var0.method23225(Class9525.field44335).method23225(Class9525.field44338).method23226(Class9525.field44330)
   );
   public static final Class7538 field38286 = method30212(
      "entity",
      var0 -> var0.method23225(Class9525.field44330)
            .method23225(Class9525.field44335)
            .method23225(Class9525.field44332)
            .method23226(Class9525.field44333)
            .method23226(Class9525.field44334)
            .method23226(Class9525.field44331)
   );
   public static final Class7538 field38287 = method30212("gift", var0 -> var0.method23225(Class9525.field44335).method23225(Class9525.field44330));
   public static final Class7538 field38288 = method30212("barter", var0 -> var0.method23225(Class9525.field44330));
   public static final Class7538 field38289 = method30212(
      "advancement_reward", var0 -> var0.method23225(Class9525.field44330).method23225(Class9525.field44335)
   );
   public static final Class7538 field38290 = method30212(
      "advancement_entity", var0 -> var0.method23225(Class9525.field44330).method23225(Class9525.field44335)
   );
   public static final Class7538 field38291 = method30212(
      "generic",
      var0 -> var0.method23225(Class9525.field44330)
            .method23225(Class9525.field44331)
            .method23225(Class9525.field44332)
            .method23225(Class9525.field44333)
            .method23225(Class9525.field44334)
            .method23225(Class9525.field44335)
            .method23225(Class9525.field44336)
            .method23225(Class9525.field44337)
            .method23225(Class9525.field44338)
            .method23225(Class9525.field44339)
   );
   public static final Class7538 field38292 = method30212(
      "block",
      var0 -> var0.method23225(Class9525.field44336)
            .method23225(Class9525.field44335)
            .method23225(Class9525.field44338)
            .method23226(Class9525.field44330)
            .method23226(Class9525.field44337)
            .method23226(Class9525.field44339)
   );

   private static Class7538 method30212(String var0, Consumer<Class7328> var1) {
      Class7328 var4 = new Class7328();
      var1.accept(var4);
      Class7538 var5 = var4.method23227();
      ResourceLocation var6 = new ResourceLocation(var0);
      Class7538 var7 = (Class7538)field38280.put(var6, var5);
      if (var7 == null) {
         return var5;
      } else {
         throw new IllegalStateException("Loot table parameter set " + var6 + " is already registered");
      }
   }

   @Nullable
   public static Class7538 method30213(ResourceLocation var0) {
      return (Class7538)field38280.get(var0);
   }

   @Nullable
   public static ResourceLocation method30214(Class7538 var0) {
      return (ResourceLocation)field38280.inverse().get(var0);
   }
}
