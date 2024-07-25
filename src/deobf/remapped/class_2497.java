package remapped;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class class_2497 extends class_7186 {
   private LongSet field_12424 = new LongOpenHashSet();

   public class_2497() {
      super("chunks");
   }

   @Override
   public void method_32924(class_5734 var1) {
      this.field_12424 = new LongOpenHashSet(var1.method_25942("Forced"));
   }

   @Override
   public class_5734 method_32920(class_5734 var1) {
      var1.method_25962("Forced", this.field_12424.toLongArray());
      return var1;
   }

   public LongSet method_11410() {
      return this.field_12424;
   }
}
