package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Class9415 {
   public static final Class9415 field43676 = new Class9415(Collections.<Effect, Class8053>emptyMap());
   private final Map<Effect, Class8053> field43677;

   public Class9415(Map<Effect, Class8053> var1) {
      this.field43677 = var1;
   }

   public static Class9415 method36119() {
      return new Class9415(Maps.newLinkedHashMap());
   }

   public Class9415 method36120(Effect var1) {
      this.field43677.put(var1, new Class8053());
      return this;
   }

   public boolean method36121(Entity var1) {
      if (this != field43676) {
         return !(var1 instanceof LivingEntity) ? false : this.method36123(((LivingEntity)var1).getActivePotionMap());
      } else {
         return true;
      }
   }

   public boolean method36122(LivingEntity var1) {
      return this != field43676 ? this.method36123(var1.getActivePotionMap()) : true;
   }

   public boolean method36123(Map<Effect, EffectInstance> var1) {
      if (this == field43676) {
         return true;
      } else {
         for (Entry var5 : this.field43677.entrySet()) {
            EffectInstance var6 = (EffectInstance)var1.get(var5.getKey());
            if (!((Class8053)var5.getValue()).method27657(var6)) {
               return false;
            }
         }

         return true;
      }
   }

   public static Class9415 method36124(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = JSONUtils.method32781(var0, "effects");
         LinkedHashMap var4 = Maps.newLinkedHashMap();

         for (Entry var6 : var3.entrySet()) {
            ResourceLocation var7 = new ResourceLocation((String)var6.getKey());
            Effect var8 = Registry.EFFECTS.method9187(var7).orElseThrow(() -> new JsonSyntaxException("Unknown effect '" + var7 + "'"));
            Class8053 var9 = Class8053.method27659(JSONUtils.method32781((JsonElement)var6.getValue(), (String)var6.getKey()));
            var4.put(var8, var9);
         }

         return new Class9415(var4);
      } else {
         return field43676;
      }
   }

   public JsonElement method36125() {
      if (this == field43676) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var3 = new JsonObject();

         for (Entry var5 : this.field43677.entrySet()) {
            var3.add(Registry.EFFECTS.getKey((Effect)var5.getKey()).toString(), ((Class8053)var5.getValue()).method27658());
         }

         return var3;
      }
   }
}
