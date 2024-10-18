package mapped;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.util.Map;
import java.util.Map.Entry;

public class Class7781 {
   private static String[] field33366;
   private final ResourceLocation field33367;
   private final Map<ResourceLocation, Float> field33368;

   public Class7781(ResourceLocation var1, Map<ResourceLocation, Float> var2) {
      this.field33367 = var1;
      this.field33368 = var2;
   }

   public ResourceLocation method25780() {
      return this.field33367;
   }

   public boolean method25781(ItemStack var1, ClientWorld var2, LivingEntity var3) {
      Item var6 = var1.getItem();

      for (Entry var8 : this.field33368.entrySet()) {
         Class8176 var9 = Class9065.method33752(var6, (ResourceLocation)var8.getKey());
         if (var9 == null || var9.method28467(var1, var2, var3) < (Float)var8.getValue()) {
            return false;
         }
      }

      return true;
   }
}
