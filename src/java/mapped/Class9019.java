package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;

public class Class9019 {
   public static final Class6355 field41257 = new Class6377();
   public static int field41258 = -1;
   public static int field41259 = 50;
   private static final Int2ObjectMap<Int2ObjectMap<Class6355>> field41260 = new Int2ObjectOpenHashMap(32);
   private static final Map<Class<? extends Class6355>, Class6355> field41261 = new HashMap<Class<? extends Class6355>, Class6355>();
   private static final Map<Class9284<Integer, Integer>, List<Class9284<Integer, Class6355>>> field41262 = new ConcurrentHashMap<Class9284<Integer, Integer>, List<Class9284<Integer, Class6355>>>();
   private static final Set<Integer> field41263 = new HashSet<Integer>();
   private static final List<Class9284<Range<Integer>, Class6355>> field41264 = Lists.newCopyOnWriteArrayList();
   private static final List<Class6355> field41265 = new ArrayList<Class6355>();
   private static final Object field41266 = new Object();
   private static Map<Class<? extends Class6355>, CompletableFuture<Void>> field41267 = new HashMap<Class<? extends Class6355>, CompletableFuture<Void>>();
   private static ThreadPoolExecutor field41268;
   private static boolean field41269;

   public static void method33354() {
   }

   public static void method33355(Class6355 var0, Class5989 var1, Class5989 var2) {
      method33356(var0, Collections.<Integer>singletonList(var1.method18573()), var2.method18573());
   }

   public static void method33356(Class6355 var0, List<Integer> var1, int var2) {
      if (!field41262.isEmpty()) {
         field41262.clear();
      }

      field41261.put((Class<? extends Class6355>)var0.getClass(), var0);

      for (int var6 : var1) {
         Int2ObjectMap var7 = (Int2ObjectMap)field41260.computeIfAbsent(var6, var0x -> new Int2ObjectOpenHashMap(2));
         var7.put(var2, var0);
      }

      if (!Class8042.method27613().method27361()) {
         field41265.add(var0);
      } else {
         var0.method19349(Class8042.method27614().method34424());
         method33358();
      }

      if (var0.method19375()) {
         if (field41268 == null) {
            var0.method19347();
         } else {
            method33370((Class<? extends Class6355>)var0.getClass(), var0::method19347);
         }
      }
   }

   public static void method33357(Class6355 var0, Range<Integer> var1) {
      field41264.add(new Class9284<Range<Integer>, Class6355>(var1, var0));
      if (!Class8042.method27613().method27361()) {
         field41265.add(var0);
      } else {
         var0.method19349(Class8042.method27614().method34424());
         method33358();
      }
   }

   public static void method33358() {
      field41263.clear();
      field41263.add(field41258);

      for (Class5989 var3 : Class5989.method18571()) {
         List<Class9284<Integer, Class6355>> var4 = method33363(var3.method18573(), field41258);
         if (var4 != null) {
            field41263.add(var3.method18573());

            for (Class9284 var6 : var4) {
               field41263.add((Integer)var6.method35008());
            }
         }
      }
   }

   public static SortedSet<Integer> method33359() {
      return Collections.<Integer>unmodifiableSortedSet(new TreeSet<Integer>(field41263));
   }

   public static boolean method33360() {
      ObjectIterator var2 = field41260.values().iterator();

      while (var2.hasNext()) {
         Int2ObjectMap var3 = (Int2ObjectMap)var2.next();
         if (var3.containsKey(field41258)) {
            return true;
         }
      }

      return false;
   }

   public static void method33361() {
      for (Class6355 var3 : field41265) {
         var3.method19349(Class8042.method27614().method34424());
      }
   }

   @Nullable
   private static List<Class9284<Integer, Class6355>> method33362(List<Class9284<Integer, Class6355>> var0, int var1, int var2) {
      if (var1 == var2) {
         return null;
      } else if (var0.size() > field41259) {
         return null;
      } else {
         Int2ObjectMap var5 = (Int2ObjectMap)field41260.get(var1);
         if (var5 == null) {
            return null;
         } else {
            Class6355 var6 = (Class6355)var5.get(var2);
            if (var6 != null) {
               var0.add(new Class9284<Integer, Class6355>(var2, var6));
               return var0;
            } else {
               List var7 = null;
               ObjectIterator var8 = var5.int2ObjectEntrySet().iterator();

               while (var8.hasNext()) {
                  Entry var9 = (Entry)var8.next();
                  if (var9.getIntKey() != var2) {
                     Class9284 var10 = new Class9284<Integer, Object>(var9.getIntKey(), var9.getValue());
                     if (!var0.contains(var10)) {
                        ArrayList var11 = new ArrayList(var0);
                        var11.add(var10);
                        List var12 = method33362(var11, var9.getKey(), var2);
                        if (var12 != null && (var7 == null || var7.size() > var12.size())) {
                           var7 = var12;
                        }
                     }
                  }
               }

               return var7;
            }
         }
      }
   }

   @Nullable
   public static List<Class9284<Integer, Class6355>> method33363(int var0, int var1) {
      Class9284 var4 = new Class9284<Integer, Integer>(var0, var1);
      List var5 = field41262.get(var4);
      if (var5 == null) {
         List var6 = method33362(new ArrayList<Class9284<Integer, Class6355>>(), var0, var1);
         if (var6 != null) {
            field41262.put(var4, var6);
         }

         return var6;
      } else {
         return var5;
      }
   }

   @Nullable
   public static Class6355 method33364(Class<? extends Class6355> var0) {
      return field41261.get(var0);
   }

   public static Class6355 method33365(int var0) {
      for (Class9284 var4 : Lists.reverse(field41264)) {
         if (((Range)var4.method35008()).contains(var0)) {
            return (Class6355)var4.method35009();
         }
      }

      throw new IllegalStateException("No Base Protocol for " + var0);
   }

   public static boolean method33366(Class6355 var0) {
      for (Class9284 var4 : field41264) {
         if (var4.method35009() == var0) {
            return true;
         }
      }

      return false;
   }

   public static void method33367(Class<? extends Class6355> var0) throws Exception {
      if (!field41269) {
         CompletableFuture var3 = method33372(var0);
         if (var3 != null) {
            var3.get();
         }
      }
   }

   public static boolean method33368() {
      synchronized (field41266) {
         if (field41269) {
            return false;
         } else {
            for (CompletableFuture var4 : field41267.values()) {
               if (!var4.isDone()) {
                  return false;
               }
            }

            method33369();
            return true;
         }
      }
   }

   private static void method33369() {
      Class8042.method27613().method27366().info("Shutting down mapping loader executor!");
      field41269 = true;
      field41268.shutdown();
      field41268 = null;
      field41267.clear();
      field41267 = null;
      if (Class8159.method28354()) {
         Class8159.method28356().clear();
      }
   }

   public static void method33370(Class<? extends Class6355> var0, Runnable var1) {
      synchronized (field41266) {
         CompletableFuture var5 = CompletableFuture.runAsync(var1, field41268).exceptionally(var1x -> {
            Class8042.method27613().method27366().severe("Error during mapping loading of " + var0.getSimpleName());
            var1x.printStackTrace();
            return null;
         });
         field41267.put(var0, var5);
      }
   }

   public static void method33371(Class<? extends Class6355> var0, Class<? extends Class6355> var1, Runnable var2) {
      synchronized (field41266) {
         CompletableFuture var6 = method33372(var1).whenCompleteAsync((var1x, var2x) -> var2.run(), field41268).exceptionally(var1x -> {
            Class8042.method27613().method27366().severe("Error during mapping loading of " + var0.getSimpleName());
            var1x.printStackTrace();
            return null;
         });
         field41267.put(var0, var6);
      }
   }

   @Nullable
   public static CompletableFuture<Void> method33372(Class<? extends Class6355> var0) {
      synchronized (field41266) {
         return field41269 ? null : field41267.get(var0);
      }
   }

   static {
      ThreadFactory var4 = new ThreadFactoryBuilder().setNameFormat("Via-Mappingloader-%d").build();
      field41268 = new ThreadPoolExecutor(5, 16, 45L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), var4);
      field41268.allowCoreThreadTimeOut(true);
      method33357(field41257, Range.lessThan(Integer.MIN_VALUE));
      method33357(new Class6374(), Range.lessThan(Class5989.field26151.method18573()));
      method33357(new Class6375(), Range.atLeast(Class5989.field26151.method18573()));
      method33355(new Class6363(), Class5989.field26130, Class5989.field26129);
      method33356(
         new Class6359(), Arrays.<Integer>asList(Class5989.field26131.method18573(), Class5989.field26132.method18573()), Class5989.field26130.method18573()
      );
      method33355(new Class6354(), Class5989.field26133, Class5989.field26132);
      method33355(new Class6370(), Class5989.field26130, Class5989.field26132);
      method33356(
         new Class6366(), Arrays.<Integer>asList(Class5989.field26131.method18573(), Class5989.field26132.method18573()), Class5989.field26133.method18573()
      );
      method33355(new Class6362(), Class5989.field26134, Class5989.field26133);
      method33355(new Class6386(), Class5989.field26135, Class5989.field26134);
      method33355(new Class6383(), Class5989.field26136, Class5989.field26135);
      method33355(new Class6372(), Class5989.field26137, Class5989.field26136);
      method33355(new Class6364(), Class5989.field26138, Class5989.field26137);
      method33355(new Class6360(), Class5989.field26139, Class5989.field26138);
      method33355(new Class6380(), Class5989.field26140, Class5989.field26139);
      method33355(new Class6379(), Class5989.field26141, Class5989.field26140);
      method33355(new Class6365(), Class5989.field26142, Class5989.field26141);
      method33355(new Class6371(), Class5989.field26143, Class5989.field26142);
      method33355(new Class6369(), Class5989.field26144, Class5989.field26143);
      method33355(new Class6367(), Class5989.field26145, Class5989.field26144);
      method33355(new Class6382(), Class5989.field26146, Class5989.field26145);
      method33355(new Class6368(), Class5989.field26147, Class5989.field26146);
      method33355(new Class6384(), Class5989.field26148, Class5989.field26147);
      method33355(new Class6385(), Class5989.field26149, Class5989.field26148);
      method33355(new Class6361(), Class5989.field26150, Class5989.field26149);
      method33355(new Class6356(), Class5989.field26151, Class5989.field26150);
      method33355(new Class6378(), Class5989.field26152, Class5989.field26151);
      method33355(new Class6357(), Class5989.field26153, Class5989.field26152);
      method33355(new Class6381(), Class5989.field26154, Class5989.field26153);
      method33355(new Class6358(), Class5989.field26155, Class5989.field26154);
   }
}
