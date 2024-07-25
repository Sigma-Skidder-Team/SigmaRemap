package remapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7103 implements class_3293 {
   private static String[] field_36635;
   private static final Logger field_36633 = LogManager.getLogger();
   private final class_5797 field_36636;
   private final Int2ObjectMap<class_8392> field_36632;
   private boolean field_36637 = false;
   private float field_36634 = -1.0F;

   private class_7103(class_5797 var1, Int2ObjectMap<class_8392> var2) {
      this.field_36636 = var1;
      this.field_36632 = var2;
   }

   @Override
   public void close() {
      this.field_36636.close();
   }

   @Nullable
   @Override
   public class_3354 method_15109(int var1) {
      return (class_3354)this.field_36632.get(var1);
   }

   @Override
   public IntSet method_15108() {
      return IntSets.unmodifiable(this.field_36632.keySet());
   }

   public boolean method_32642() {
      return this.field_36637;
   }

   public float method_32644() {
      return this.field_36634;
   }
}
