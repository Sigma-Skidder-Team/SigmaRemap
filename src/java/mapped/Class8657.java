package mapped;

import com.google.common.collect.Maps;
import net.minecraft.client.audio.ISoundEventAccessor;
import net.minecraft.client.audio.Sound;
import net.minecraft.util.ResourceLocation;

import java.util.Map;
import java.util.Map.Entry;

public class Class8657 {
   private final Map<ResourceLocation, Class6648> field39026 = Maps.newHashMap();

   private void method31155(ResourceLocation var1, Class9304 var2, IResourceManager var3) {
      Class6648 var6 = this.field39026.get(var1);
      boolean var7 = var6 == null;
      if (var7 || var2.method35114()) {
         if (!var7) {
            SoundHandler.method1015().debug("Replaced sound event location {}", var1);
         }

         var6 = new Class6648(var1, var2.method35115());
         this.field39026.put(var1, var6);
      }

      for (Sound var9 : var2.method35113()) {
         ResourceLocation var10 = var9.method20291();
         Object var11;
         switch (Class7682.field32910[var9.method20295().ordinal()]) {
            case 1:
               if (! SoundHandler.method1016(var9, var1, var3)) {
                  continue;
               }

               var11 = var9;
               break;
            case 2:
               var11 = new Class6645(this, var10, var9);
               break;
            default:
               throw new IllegalStateException("Unknown SoundEventRegistration type: " + var9.method20295());
         }

         var6.method20299((ISoundEventAccessor<Sound>)var11);
      }
   }

   public void method31156(Map<ResourceLocation, Class6648> var1, Class4386 var2) {
      var1.clear();

      for (Entry<ResourceLocation, Class6648> var6 : this.field39026.entrySet()) {
         var1.put(var6.getKey(), var6.getValue());
         ((Class6648)var6.getValue()).method20289(var2);
      }
   }

   // $VF: synthetic method
   public static void method31157(Class8657 var0, ResourceLocation var1, Class9304 var2, IResourceManager var3) {
      var0.method31155(var1, var2, var3);
   }

   // $VF: synthetic method
   public static Map method31158(Class8657 var0) {
      return var0.field39026;
   }
}
