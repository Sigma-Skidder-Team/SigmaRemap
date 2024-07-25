package remapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class class_9322 extends class_3808<class_2271> {
   private static String[] field_47601;

   public class_9322(class_5002 var1) {
      super(class_2957.field_14440, var1, new class_2271(new Long2ObjectOpenHashMap()));
   }

   @Override
   public int method_17737(long var1) {
      long var5 = class_6979.method_31903(var1);
      class_1201 var7 = this.method_17744(var5, false);
      return var7 != null
         ? var7.method_5314(
            class_6979.method_31913(BlockPos.method_6080(var1)),
            class_6979.method_31913(BlockPos.method_6067(var1)),
            class_6979.method_31913(BlockPos.method_6092(var1))
         )
         : 0;
   }
}
