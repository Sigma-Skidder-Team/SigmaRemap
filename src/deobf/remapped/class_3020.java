package remapped;

import com.google.common.base.Preconditions;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.Int2IntMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class class_3020 implements Int2IntMap {
   private final Int2IntMap field_14817 = new Int2IntOpenHashMap();
   private final class_3020 field_14818;

   public class_3020() {
      this.field_14818 = new class_3020(this);
   }

   private class_3020(class_3020 var1) {
      this.field_14818 = var1;
   }

   public class_3020 method_13803() {
      return this.field_14818;
   }

   public int put(int var1, int var2) {
      if (this.containsKey(var1) && var2 == this.get(var1)) {
         return var2;
      } else {
         Preconditions.checkArgument(!this.containsValue(var2), "value already present: %s", var2);
         this.field_14817.put(var1, var2);
         this.field_14818.field_14817.put(var2, var1);
         return this.defaultReturnValue();
      }
   }

   public boolean remove(int var1, int var2) {
      this.field_14817.remove(var1, var2);
      return this.field_14818.field_14817.remove(var1, var2);
   }

   public int get(int var1) {
      return this.field_14817.get(var1);
   }

   public void clear() {
      this.field_14817.clear();
      this.field_14818.field_14817.clear();
   }

   public int size() {
      return this.field_14817.size();
   }

   public boolean isEmpty() {
      return this.field_14817.isEmpty();
   }

   @Deprecated
   public void putAll(Map<? extends Integer, ? extends Integer> var1) {
      throw new UnsupportedOperationException();
   }

   public void defaultReturnValue(int var1) {
      this.field_14817.defaultReturnValue(var1);
      this.field_14818.field_14817.defaultReturnValue(var1);
   }

   public int defaultReturnValue() {
      return this.field_14817.defaultReturnValue();
   }

   public ObjectSet<Entry> int2IntEntrySet() {
      return this.field_14817.int2IntEntrySet();
   }

   @NotNull
   public IntSet keySet() {
      return this.field_14817.keySet();
   }

   @NotNull
   public IntSet values() {
      return this.field_14818.field_14817.keySet();
   }

   public boolean containsKey(int var1) {
      return this.field_14817.containsKey(var1);
   }

   public boolean containsValue(int var1) {
      return this.field_14818.field_14817.containsKey(var1);
   }
}
