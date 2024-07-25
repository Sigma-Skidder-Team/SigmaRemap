package remapped;

import io.netty.channel.ChannelFutureListener;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;

public class class_7918 {
   public final Map<UUID, class_1455> field_40534 = new ConcurrentHashMap<UUID, class_1455>();
   public final Set<class_1455> field_40535 = Collections.<class_1455>newSetFromMap(new ConcurrentHashMap<class_1455, Boolean>());

   public void method_35825(class_1455 var1) {
      Objects.<class_1455>requireNonNull(var1, "connection is null!");
      this.field_40535.add(var1);
      if (this.method_35827(var1)) {
         UUID var4 = var1.method_6744().method_17594();
         if (this.field_40534.put(var4, var1) != null) {
            class_3446.method_15886().method_34617().warning("Duplicate UUID on frontend connection! (" + var4 + ")");
         }
      }

      if (var1.method_6733() != null) {
         var1.method_6733().closeFuture().addListener((ChannelFutureListener)var2 -> this.method_35832(var1));
      }
   }

   public void method_35832(class_1455 var1) {
      Objects.<class_1455>requireNonNull(var1, "connection is null!");
      this.field_40535.remove(var1);
      if (this.method_35827(var1)) {
         UUID var4 = var1.method_6744().method_17594();
         this.field_40534.remove(var4);
      }
   }

   public boolean method_35827(class_1455 var1) {
      return !var1.method_6749();
   }

   public Map<UUID, class_1455> method_35828() {
      return Collections.<UUID, class_1455>unmodifiableMap(this.field_40534);
   }

   @Nullable
   public class_1455 method_35826(UUID var1) {
      return this.field_40534.get(var1);
   }

   @Nullable
   public UUID method_35831(class_1455 var1) {
      if (var1.method_6744() != null) {
         UUID var4 = var1.method_6744().method_17594();
         class_1455 var5 = this.field_40534.get(var4);
         return var5 != null && var5.equals(var1) ? var4 : null;
      } else {
         return null;
      }
   }

   public Set<class_1455> method_35829() {
      return Collections.<class_1455>unmodifiableSet(this.field_40535);
   }

   public boolean method_35830(UUID var1) {
      return this.field_40534.containsKey(var1);
   }
}
