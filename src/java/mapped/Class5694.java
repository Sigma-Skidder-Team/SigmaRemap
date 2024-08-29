package mapped;

import com.google.common.collect.Maps;
import net.minecraft.client.util.Util;

import java.util.Map;

public class Class5694 extends Class5651<Class1086, Class2870<Class1086>> {
   private static final Map<Class2210, ResourceLocation> field25064 = Util.<Map<Class2210, ResourceLocation>>make(Maps.newHashMap(), var0 -> {
      var0.put(Class2210.field14453, new ResourceLocation("textures/entity/cow/brown_mooshroom.png"));
      var0.put(Class2210.field14452, new ResourceLocation("textures/entity/cow/red_mooshroom.png"));
   });

   public Class5694(EntityRendererManager var1) {
      super(var1, new Class2870<Class1086>(), 0.7F);
      this.method17880(new Class262<Class1086>(this));
   }

   public ResourceLocation method17843(Class1086 var1) {
      return field25064.get(var1.method5037());
   }
}
