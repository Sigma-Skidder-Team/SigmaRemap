package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Class4902 extends Class4874<Class4467> {
   private static final ResourceLocation field22736 = new ResourceLocation("killed_by_crossbow");

   @Override
   public ResourceLocation method15044() {
      return field22736;
   }

   public Class4467 method15047(JsonObject var1, Class9587 var2, Class9366 var3) {
      Class9587[] var6 = Class9587.method37224(var1, "victims", var3);
      Class8840 var7 = Class8840.method32016(var1.get("unique_entity_types"));
      return new Class4467(var2, var6, var7);
   }

   public void method15149(ServerPlayerEntity var1, Collection<Entity> var2) {
      ArrayList var5 = Lists.newArrayList();
      HashSet var6 = Sets.newHashSet();

      for (Entity var8 : var2) {
         var6.add(var8.getType());
         var5.add(Class6671.method20332(var1, var8));
      }

      this.method15053(var1, var2x -> var2x.method14117(var5, var6.size()));
   }

   // $VF: synthetic method
   public static ResourceLocation method15151() {
      return field22736;
   }
}
