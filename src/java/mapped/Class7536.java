package mapped;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class Class7536 extends Class7530 {
   private LongSet field32343 = new LongOpenHashSet();

   public Class7536() {
      super("chunks");
   }

   @Override
   public void method24591(Class39 var1) {
      this.field32343 = new LongOpenHashSet(var1.method129("Forced"));
   }

   @Override
   public Class39 method24592(Class39 var1) {
      var1.method113("Forced", this.field32343.toLongArray());
      return var1;
   }

   public LongSet method24638() {
      return this.field32343;
   }
}