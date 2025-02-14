package mapped;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class Class7849 {
   private static String[] field33658;
   private static final Map<String, Enchantment> field33659 = new HashMap<String, Enchantment>();

   public static Enchantment method26306(String var0) {
      Enchantment var3 = field33659.get(var0);
      if (var3 == null) {
         ResourceLocation var4 = new ResourceLocation(var0);
         if (Registry.ENCHANTMENT.method9193(var4)) {
            var3 = Registry.ENCHANTMENT.getOrDefault(var4);
         }

         field33659.put(var0, var3);
      }

      return var3;
   }

   public static Enchantment method26307(ResourceLocation var0) {
      return Registry.ENCHANTMENT.method9193(var0) ? Registry.ENCHANTMENT.getOrDefault(var0) : null;
   }
}
