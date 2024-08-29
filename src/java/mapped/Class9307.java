package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class9307 {
   private static final Logger field43204 = LogManager.getLogger();
   private static final int field43205 = 33 + ChunkStatus.method34296(ChunkStatus.FULL) - 2;
   private final Long2ObjectMap<ObjectSet<ServerPlayerEntity>> field43206 = new Long2ObjectOpenHashMap();
   private final Long2ObjectOpenHashMap<Class52<Class2005<?>>> field43207 = new Long2ObjectOpenHashMap();
   private final Class204 field43208 = new Class204(this);
   private final Class205 field43209 = new Class205(this, 8);
   private final Class206 field43210 = new Class206(this, 65);
   private final Set<Class8641> field43211 = Sets.newHashSet();
   private final Class1812 field43212;
   private final Class321<Class6875<Runnable>> field43213;
   private final Class321<Class8132> field43214;
   private final LongSet field43215 = new LongOpenHashSet();
   private final Executor field43216;
   private long field43217;

   public Class9307(Executor var1, Executor var2) {
      Class321 var5 = Class321.<Runnable>method1648("player ticket throttler", var2::execute);
      Class1812 var6 = new Class1812(ImmutableList.of(var5), var1, 4);
      this.field43212 = var6;
      this.field43213 = var6.<Runnable>method7963(var5, true);
      this.field43214 = var6.method7964(var5);
      this.field43216 = var2;
   }

   public void method35123() {
      this.field43217++;
      ObjectIterator<Entry<Class52<Class2005<?>>>> var3 = this.field43207.long2ObjectEntrySet().fastIterator();

      while (var3.hasNext()) {
         Entry<Class52<Class2005<?>>> var4 = var3.next();
         if (var4.getValue().removeIf(var1 -> var1.method8487(this.field43217))) {
            this.field43208.method680(var4.getLongKey(), method35124(var4.getValue()), false);
         }

         if (var4.getValue().isEmpty()) {
            var3.remove();
         }
      }
   }

   private static int method35124(Class52<Class2005<?>> var0) {
      return var0.isEmpty() ? Class1649.field8951 + 1 : ((Class2005)var0.method188()).method8485();
   }

   public abstract boolean method35120(long var1);

   @Nullable
   public abstract Class8641 method35121(long var1);

   @Nullable
   public abstract Class8641 method35122(long var1, int var3, Class8641 var4, int var5);

   public boolean method35125(Class1649 var1) {
      this.field43209.method684();
      this.field43210.method684();
      int var4 = Integer.MAX_VALUE - this.field43208.method681(Integer.MAX_VALUE);
      boolean var5 = var4 != 0;
      if (!var5) {
      }

      if (!this.field43211.isEmpty()) {
         this.field43211.forEach(var1x -> var1x.method31061(var1));
         this.field43211.clear();
         return true;
      } else {
         if (!this.field43215.isEmpty()) {
            LongIterator var6 = this.field43215.iterator();

            while (var6.hasNext()) {
               long var7 = var6.nextLong();
               if (this.method35132(var7).stream().anyMatch(var0 -> var0.method8484() == Class8561.field38482)) {
                  Class8641 var9 = var1.method6538(var7);
                  if (var9 == null) {
                     throw new IllegalStateException();
                  }

                  CompletableFuture var10 = var9.method31041();
                  var10.thenAccept(var3 -> this.field43216.execute(() -> this.field43214.method1641(Class1812.method7962(() -> {
                        }, var7, false))));
               }
            }

            this.field43215.clear();
         }

         return var5;
      }
   }

   private void method35126(long var1, Class2005<?> var3) {
      Class52<Class2005<?>> var6 = this.method35132(var1);
      int var7 = method35124(var6);
      Class2005<?> var8 = var6.method187(var3);
      var8.method8486(this.field43217);
      if (var3.method8485() < var7) {
         this.field43208.method680(var1, var3.method8485(), true);
      }
   }

   private void method35127(long var1, Class2005<?> var3) {
      Class52 var6 = this.method35132(var1);
      if (!var6.remove(var3)) {
      }

      if (var6.isEmpty()) {
         this.field43207.remove(var1);
      }

      this.field43208.method680(var1, method35124(var6), false);
   }

   public <T> void method35128(Class8561<T> var1, Class7481 var2, int var3, T var4) {
      this.method35126(var2.method24352(), new Class2005(var1, var3, var4));
   }

   public <T> void method35129(Class8561<T> var1, Class7481 var2, int var3, T var4) {
      Class2005 var7 = new Class2005(var1, var3, var4);
      this.method35127(var2.method24352(), var7);
   }

   public <T> void method35130(Class8561<T> var1, Class7481 var2, int var3, T var4) {
      this.method35126(var2.method24352(), new Class2005(var1, 33 - var3, var4));
   }

   public <T> void method35131(Class8561<T> var1, Class7481 var2, int var3, T var4) {
      Class2005 var7 = new Class2005(var1, 33 - var3, var4);
      this.method35127(var2.method24352(), var7);
   }

   private Class52<Class2005<?>> method35132(long var1) {
      return (Class52<Class2005<?>>)this.field43207.computeIfAbsent(var1, var0 -> Class52.method179(4));
   }

   public void method35133(Class7481 var1, boolean var2) {
      Class2005 var5 = new Class2005<Class7481>(Class8561.field38483, 31, var1);
      if (!var2) {
         this.method35127(var1.method24352(), var5);
      } else {
         this.method35126(var1.method24352(), var5);
      }
   }

   public void method35134(Class2002 var1, ServerPlayerEntity var2) {
      long var5 = var1.method8423().method24352();
      ((ObjectSet)this.field43206.computeIfAbsent(var5, var0 -> new ObjectOpenHashSet())).add(var2);
      this.field43209.method680(var5, 0, true);
      this.field43210.method680(var5, 0, true);
   }

   public void method35135(Class2002 var1, ServerPlayerEntity var2) {
      long var5 = var1.method8423().method24352();
      ObjectSet var7 = (ObjectSet)this.field43206.get(var5);
      var7.remove(var2);
      if (var7.isEmpty()) {
         this.field43206.remove(var5);
         this.field43209.method680(var5, Integer.MAX_VALUE, false);
         this.field43210.method680(var5, Integer.MAX_VALUE, false);
      }
   }

   public String method35136(long var1) {
      Class52 var5 = (Class52)this.field43207.get(var1);
      String var6;
      if (var5 != null && !var5.isEmpty()) {
         var6 = ((Class2005)var5.method188()).toString();
      } else {
         var6 = "no_ticket";
      }

      return var6;
   }

   public void method35137(int var1) {
      this.field43210.method685(var1);
   }

   public int method35138() {
      this.field43209.method684();
      return this.field43209.field762.size();
   }

   public boolean method35139(long var1) {
      this.field43209.method684();
      return this.field43209.field762.containsKey(var1);
   }

   public String method35140() {
      return this.field43212.method7970();
   }

   // $VF: synthetic method
   public static Long2ObjectOpenHashMap method35149(Class9307 var0) {
      return var0.field43207;
   }

   // $VF: synthetic method
   public static Set method35150(Class9307 var0) {
      return var0.field43211;
   }

   // $VF: synthetic method
   public static Long2ObjectMap method35151(Class9307 var0) {
      return var0.field43206;
   }

   // $VF: synthetic method
   public static int method35152() {
      return field43205;
   }

   // $VF: synthetic method
   public static Class321 method35153(Class9307 var0) {
      return var0.field43213;
   }

   // $VF: synthetic method
   public static Class321 method35154(Class9307 var0) {
      return var0.field43214;
   }

   // $VF: synthetic method
   public static Class1812 method35155(Class9307 var0) {
      return var0.field43212;
   }

   // $VF: synthetic method
   public static Executor method35156(Class9307 var0) {
      return var0.field43216;
   }

   // $VF: synthetic method
   public static void method35157(Class9307 var0, long var1, Class2005 var3) {
      var0.method35127(var1, var3);
   }

   // $VF: synthetic method
   public static void method35158(Class9307 var0, long var1, Class2005 var3) {
      var0.method35126(var1, var3);
   }

   // $VF: synthetic method
   public static LongSet method35159(Class9307 var0) {
      return var0.field43215;
   }
}
