package remapped;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public final class class_8759 extends class_8666<class_8759> {
   private static String[] field_44819;
   private int field_44818;
   private final Long2IntOpenHashMap field_44820;

   public class_8759(Long2ObjectOpenHashMap<class_1201> var1, Long2IntOpenHashMap var2, int var3) {
      super(var1);
      this.field_44820 = var2;
      var2.defaultReturnValue(var3);
      this.field_44818 = var3;
   }

   public class_8759 method_40204() {
      return new class_8759(this.field_44353.clone(), this.field_44820.clone(), this.field_44818);
   }
}
