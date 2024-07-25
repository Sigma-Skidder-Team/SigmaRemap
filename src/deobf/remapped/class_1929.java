package remapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;

public class class_1929<T extends class_1977> {
   private final Object2IntMap<Class<? extends Packet<T>>> field_9865 = Util.<Object2IntMap<Class<? extends Packet<T>>>>method_44659(
      new Object2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1)
   );
   private final List<Supplier<? extends Packet<T>>> field_9866 = Lists.newArrayList();

   private class_1929() {
   }

   public <P extends Packet<T>> class_1929<T> method_8956(Class<P> var1, Supplier<P> var2) {
      int var5 = this.field_9866.size();
      int var6 = this.field_9865.put(var1, var5);
      if (var6 == -1) {
         this.field_9866.add(var2);
         return this;
      } else {
         String var7 = "Packet " + var1 + " is already registered to ID " + var6;
         LogManager.getLogger().fatal(var7);
         throw new IllegalArgumentException(var7);
      }
   }

   @Nullable
   public Integer method_8958(Class<?> var1) {
      int var4 = this.field_9865.getInt(var1);
      return var4 != -1 ? var4 : null;
   }

   @Nullable
   public Packet<?> method_8960(int var1) {
      Supplier var4 = this.field_9866.get(var1);
      return var4 == null ? null : (Packet)var4.get();
   }

   public Iterable<Class<? extends Packet<?>>> method_8959() {
      return Iterables.unmodifiableIterable(this.field_9865.keySet());
   }
}
