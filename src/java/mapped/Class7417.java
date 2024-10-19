package mapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

import net.minecraft.util.Util;
import net.minecraft.network.INetHandler;
import net.minecraft.network.IPacket;
import org.apache.logging.log4j.LogManager;

public class Class7417<T extends INetHandler> {
   private final Object2IntMap<Class<? extends IPacket<T>>> field31779 = Util.<Object2IntMap<Class<? extends IPacket<T>>>>make(
      new Object2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1)
   );
   private final List<Supplier<? extends IPacket<T>>> field31780 = Lists.newArrayList();

   public Class7417() {
   }

   public <P extends IPacket<T>> Class7417<T> method23905(Class<P> var1, Supplier<P> var2) {
      int var5 = this.field31780.size();
      int var6 = this.field31779.put(var1, var5);
      if (var6 == -1) {
         this.field31780.add(var2);
         return this;
      } else {
         String var7 = "Packet " + var1 + " is already registered to ID " + var6;
         LogManager.getLogger().fatal(var7);
         throw new IllegalArgumentException(var7);
      }
   }

   @Nullable
   public Integer method23906(Class<?> var1) {
      int var4 = this.field31779.getInt(var1);
      return var4 != -1 ? var4 : null;
   }

   @Nullable
   public IPacket<?> method23907(int var1) {
      Supplier var4 = this.field31780.get(var1);
      return var4 == null ? null : (IPacket)var4.get();
   }

   public Iterable<Class<? extends IPacket<?>>> method23908() {
      return Iterables.unmodifiableIterable(this.field31779.keySet());
   }
}
