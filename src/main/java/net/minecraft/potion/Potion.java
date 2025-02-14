package net.minecraft.potion;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.List;

public class Potion {
   private static String[] field39647;
   private final String field39648;
   private final ImmutableList<EffectInstance> field39649;

   public static Potion method31814(String var0) {
      return Registry.POTION.getOrDefault(ResourceLocation.method8289(var0));
   }

   public Potion(EffectInstance... var1) {
      this((String)null, var1);
   }

   public Potion(String var1, EffectInstance... var2) {
      this.field39648 = var1;
      this.field39649 = ImmutableList.copyOf(var2);
   }

   public String method31815(String var1) {
      return var1 + (this.field39648 != null ? this.field39648 : Registry.POTION.getKey(this).getPath());
   }

   public List<EffectInstance> getEffects() {
      return this.field39649;
   }

   public boolean method31817() {
      if (!this.field39649.isEmpty()) {
         UnmodifiableIterator var3 = this.field39649.iterator();

         while (var3.hasNext()) {
            EffectInstance var4 = (EffectInstance)var3.next();
            if (var4.getPotion().isInstant()) {
               return true;
            }
         }
      }

      return false;
   }
}
