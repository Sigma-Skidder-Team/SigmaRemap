package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;

public class Class9464 {
   private final ServerWorld field43974;
   private final Map<Class9821<?>, Object> field43975 = Maps.newIdentityHashMap();
   private final Map<ResourceLocation, Class9100> field43976 = Maps.newHashMap();
   private Random field43977;
   private float field43978;

   public Class9464(ServerWorld var1) {
      this.field43974 = var1;
   }

   public Class9464 method36450(Random var1) {
      this.field43977 = var1;
      return this;
   }

   public Class9464 method36451(long var1) {
      if (var1 != 0L) {
         this.field43977 = new Random(var1);
      }

      return this;
   }

   public Class9464 method36452(long var1, Random var3) {
      if (var1 != 0L) {
         this.field43977 = new Random(var1);
      } else {
         this.field43977 = var3;
      }

      return this;
   }

   public Class9464 method36453(float var1) {
      this.field43978 = var1;
      return this;
   }

   public <T> Class9464 method36454(Class9821<T> var1, T var2) {
      this.field43975.put(var1, var2);
      return this;
   }

   public <T> Class9464 method36455(Class9821<T> var1, T var2) {
      if (var2 != null) {
         this.field43975.put(var1, var2);
      } else {
         this.field43975.remove(var1);
      }

      return this;
   }

   public Class9464 method36456(ResourceLocation var1, Class9100 var2) {
      Class9100 var5 = this.field43976.put(var1, var2);
      if (var5 == null) {
         return this;
      } else {
         throw new IllegalStateException("Duplicated dynamic drop '" + this.field43976 + "'");
      }
   }

   public ServerWorld method36457() {
      return this.field43974;
   }

   public <T> T method36458(Class9821<T> var1) {
      Object var4 = this.field43975.get(var1);
      if (var4 != null) {
         return (T)var4;
      } else {
         throw new IllegalArgumentException("No parameter " + var1);
      }
   }

   @Nullable
   public <T> T method36459(Class9821<T> var1) {
      return (T)this.field43975.get(var1);
   }

   public Class7812 method36460(Class7538 var1) {
      SetView var4 = Sets.difference(this.field43975.keySet(), var1.method24644());
      if (var4.isEmpty()) {
         SetView var5 = Sets.difference(var1.method24643(), this.field43975.keySet());
         if (var5.isEmpty()) {
            Random var6 = this.field43977;
            if (var6 == null) {
               var6 = new Random();
            }

            MinecraftServer var7 = this.field43974.method6715();
            return new Class7812(
               var6, this.field43978, this.field43974, var7.method1411()::method1058, var7.method1412()::method1052, this.field43975, this.field43976
            );
         } else {
            throw new IllegalArgumentException("Missing required parameters: " + var5);
         }
      } else {
         throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + var4);
      }
   }
}
