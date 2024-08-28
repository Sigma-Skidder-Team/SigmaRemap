package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class Class9385 {
   private static String[] field43541;
   private static final Int2ObjectMap<Class9385> field43542 = new Int2ObjectOpenHashMap();
   public final int field43543;

   public Class9385(int var1) {
      this.field43543 = var1;
      field43542.put(var1, this);
   }

   // $VF: synthetic method
   public static Int2ObjectMap method35621() {
      return field43542;
   }
}
