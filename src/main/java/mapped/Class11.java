package mapped;

import com.google.common.base.Preconditions;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class Class11 implements Int2IntMap {
   private final Int2IntMap field18 = new Int2IntOpenHashMap();
   private final Class11 field19;

   public Class11() {
      this.field19 = new Class11(this);
   }

   private Class11(Class11 var1) {
      this.field19 = var1;
   }

   public Class11 method57() {
      return this.field19;
   }

   public int put(int var1, int var2) {
      if (this.containsKey(var1) && var2 == this.get(var1)) {
         return var2;
      } else {
         Preconditions.checkArgument(!this.containsValue(var2), "value already present: %s", var2);
         this.field18.put(var1, var2);
         this.field19.field18.put(var2, var1);
         return this.defaultReturnValue();
      }
   }

   public boolean remove(int var1, int var2) {
      this.field18.remove(var1, var2);
      return this.field19.field18.remove(var1, var2);
   }

   public int get(int var1) {
      return this.field18.get(var1);
   }

   public void clear() {
      this.field18.clear();
      this.field19.field18.clear();
   }

   public int size() {
      return this.field18.size();
   }

   public boolean isEmpty() {
      return this.field18.isEmpty();
   }

   @Deprecated
   public void putAll(Map<? extends Integer, ? extends Integer> var1) {
      throw new UnsupportedOperationException();
   }

   public void defaultReturnValue(int var1) {
      this.field18.defaultReturnValue(var1);
      this.field19.field18.defaultReturnValue(var1);
   }

   public int defaultReturnValue() {
      return this.field18.defaultReturnValue();
   }

   public ObjectSet<Entry> int2IntEntrySet() {
      return this.field18.int2IntEntrySet();
   }

   @NotNull
   public IntSet keySet() {
      return this.field18.keySet();
   }

   @NotNull
   public IntSet values() {
      return this.field19.field18.keySet();
   }

   public boolean containsKey(int var1) {
      return this.field18.containsKey(var1);
   }

   public boolean containsValue(int var1) {
      return this.field19.field18.containsKey(var1);
   }
}
