package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.entity.player.PlayerEntity;

public class StatisticsManager {
   private static String[] field35589;
   public final Object2IntMap<Class9007<?>> field35590 = Object2IntMaps.synchronize(new Object2IntOpenHashMap());

   public StatisticsManager() {
      this.field35590.defaultReturnValue(0);
   }

   public void method28958(PlayerEntity var1, Class9007<?> var2, int var3) {
      int var6 = (int)Math.min((long)this.method28961(var2) + (long)var3, 2147483647L);
      this.method28959(var1, var2, var6);
   }

   public void method28959(PlayerEntity var1, Class9007<?> var2, int var3) {
      this.field35590.put(var2, var3);
   }

   public <T> int method28960(Class49<T> var1, T var2) {
      return !var1.method169(var2) ? 0 : this.method28961(var1.method172(var2));
   }

   public int method28961(Class9007<?> var1) {
      return this.field35590.getInt(var1);
   }
}
