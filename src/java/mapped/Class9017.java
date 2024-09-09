package mapped;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

public class Class9017 {
   private static String[] field41248;
   private Class8840 field41249 = Class8840.field39936;
   private GameType field41250 = GameType.field11101;
   private final Map<Class9007<?>, Class8840> field41251 = Maps.newHashMap();
   private final Object2BooleanMap<ResourceLocation> field41252 = new Object2BooleanOpenHashMap();
   private final Map<ResourceLocation, Class172> field41253 = Maps.newHashMap();

   public Class9281 method33351() {
      return new Class9281(this.field41249, this.field41250, this.field41251, this.field41252, this.field41253);
   }
}
