package mapped;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public final class Class7587 extends Class7586<Class7587> {
   private static String[] field32569;
   private int field32570;
   private final Long2IntOpenHashMap field32571;

   public Class7587(Long2ObjectOpenHashMap<Class6785> var1, Long2IntOpenHashMap var2, int var3) {
      super(var1);
      this.field32571 = var2;
      var2.defaultReturnValue(var3);
      this.field32570 = var3;
   }

   public Class7587 method24828() {
      return new Class7587(this.field32568.clone(), this.field32571.clone(), this.field32570);
   }

   // $VF: synthetic method
   public static Long2IntOpenHashMap method24836(Class7587 var0) {
      return var0.field32571;
   }

   // $VF: synthetic method
   public static int method24837(Class7587 var0) {
      return var0.field32570;
   }

   // $VF: synthetic method
   public static int method24838(Class7587 var0, int var1) {
      return var0.field32570 = var1;
   }
}
