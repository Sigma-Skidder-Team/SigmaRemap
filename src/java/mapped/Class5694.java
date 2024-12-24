package mapped;

import com.google.common.collect.Maps;
import net.minecraft.util.Util;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

public class Class5694 extends Class5651<MooshroomEntity, Class2870<MooshroomEntity>> {
   private static final Map<Class2210, ResourceLocation> field25064 = Util.<Map<Class2210, ResourceLocation>>make(Maps.newHashMap(), var0 -> {
      var0.put(Class2210.field14453, new ResourceLocation("textures/entity/cow/brown_mooshroom.png"));
      var0.put(Class2210.field14452, new ResourceLocation("textures/entity/cow/red_mooshroom.png"));
   });

   public Class5694(EntityRendererManager var1) {
      super(var1, new Class2870<MooshroomEntity>(), 0.7F);
      this.addLayer(new Class262<MooshroomEntity>(this));
   }

   public ResourceLocation method17843(MooshroomEntity var1) {
      return field25064.get(var1.method5037());
   }
}
