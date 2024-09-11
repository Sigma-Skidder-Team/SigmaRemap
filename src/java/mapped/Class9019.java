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
   public static final ViaVersion7 field41257 = new Class6377();
   public static int field41258 = -1;
   public static int field41259 = 50;
   private static final Int2ObjectMap<Int2ObjectMap<ViaVersion7>> field41260 = new Int2ObjectOpenHashMap(32);
   private static final Map<Class<? extends ViaVersion7>, ViaVersion7> field41261 = new HashMap<Class<? extends ViaVersion7>, ViaVersion7>();
   private static final Map<Class9284<Integer, Integer>, List<Class9284<Integer, ViaVersion7>>> field41262 = new ConcurrentHashMap<Class9284<Integer, Integer>, List<Class9284<Integer, ViaVersion7>>>();
   private static final Set<Integer> field41263 = new HashSet<Integer>();
   private static final List<Class9284<Range<Integer>, ViaVersion7>> field41264 = Lists.newCopyOnWriteArrayList();
   private static final List<ViaVersion7> field41265 = new ArrayList<ViaVersion7>();
   private static final Object field41266 = new Object();
   private static Map<Class<? extends ViaVersion7>, CompletableFuture<Void>> field41267 = new HashMap<Class<? extends ViaVersion7>, CompletableFuture<Void>>();
   private static ThreadPoolExecutor field41268;
   private static boolean field41269;

   public static void method33354() {
   }

   public static void method33355(ViaVersion7 var0, ViaVerList var1, ViaVerList var2) {
      method33356(var0, Collections.<Integer>singletonList(var1.method18573()), var2.method18573());
   }

   public static void method33356(ViaVersion7 var0, List<Integer> var1, int var2) {
      if (!field41262.isEmpty()) {
         field41262.clear();
      }

      field41261.put((Class<? extends ViaVersion7>)var0.getClass(), var0);

      for (int var6 : var1) {
         Int2ObjectMap var7 = (Int2ObjectMap)field41260.computeIfAbsent(var6, var0x -> new Int2ObjectOpenHashMap(2));
         var7.put(var2, var0);
      }

      if (!ViaVersion3.method27613().isMultiplayer()) {
         field41265.add(var0);
      } else {
         var0.method19349(ViaVersion3.getInstance().method34424());
         method33358();
      }

      if (var0.method19375()) {
         if (field41268 == null) {
            var0.method19347();
         } else {
            method33370((Class<? extends ViaVersion7>)var0.getClass(), var0::method19347);
         }
      }
   }

   public static void method33357(ViaVersion7 var0, Range<Integer> var1) {
      field41264.add(new Class9284<Range<Integer>, ViaVersion7>(var1, var0));
      if (!ViaVersion3.method27613().isMultiplayer()) {
         field41265.add(var0);
      } else {
         var0.method19349(ViaVersion3.getInstance().method34424());
         method33358();
      }
   }

   public static void method33358() {
      field41263.clear();
      field41263.add(field41258);

      for (ViaVerList var3 : ViaVerList.method18571()) {
         List<Class9284<Integer, ViaVersion7>> var4 = method33363(var3.method18573(), field41258);
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
      for (ViaVersion7 var3 : field41265) {
         var3.method19349(ViaVersion3.getInstance().method34424());
      }
   }

   @Nullable
   private static List<Class9284<Integer, ViaVersion7>> method33362(List<Class9284<Integer, ViaVersion7>> var0, int var1, int var2) {
      if (var1 == var2) {
         return null;
      } else if (var0.size() > field41259) {
         return null;
      } else {
         Int2ObjectMap var5 = (Int2ObjectMap)field41260.get(var1);
         if (var5 == null) {
            return null;
         } else {
            ViaVersion7 var6 = (ViaVersion7)var5.get(var2);
            if (var6 != null) {
               var0.add(new Class9284<Integer, ViaVersion7>(var2, var6));
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
   public static List<Class9284<Integer, ViaVersion7>> method33363(int var0, int var1) {
      Class9284 var4 = new Class9284<Integer, Integer>(var0, var1);
      List var5 = field41262.get(var4);
      if (var5 == null) {
         List var6 = method33362(new ArrayList<Class9284<Integer, ViaVersion7>>(), var0, var1);
         if (var6 != null) {
            field41262.put(var4, var6);
         }

         return var6;
      } else {
         return var5;
      }
   }

   @Nullable
   public static ViaVersion7 method33364(Class<? extends ViaVersion7> var0) {
      return field41261.get(var0);
   }

   public static ViaVersion7 method33365(int var0) {
      for (Class9284 var4 : Lists.reverse(field41264)) {
         if (((Range)var4.method35008()).contains(var0)) {
            return (ViaVersion7)var4.method35009();
         }
      }

      throw new IllegalStateException("No Base Protocol for " + var0);
   }

   public static boolean method33366(ViaVersion7 var0) {
      for (Class9284 var4 : field41264) {
         if (var4.method35009() == var0) {
            return true;
         }
      }

      return false;
   }

   public static void method33367(Class<? extends ViaVersion7> var0) throws Exception {
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
      ViaVersion3.method27613().getLogger().info("Shutting down mapping loader executor!");
      field41269 = true;
      field41268.shutdown();
      field41268 = null;
      field41267.clear();
      field41267 = null;
      if (Class8159.method28354()) {
         Class8159.method28356().clear();
      }
   }

   public static void method33370(Class<? extends ViaVersion7> var0, Runnable var1) {
      synchronized (field41266) {
         CompletableFuture var5 = CompletableFuture.runAsync(var1, field41268).exceptionally(var1x -> {
            ViaVersion3.method27613().getLogger().severe("Error during mapping loading of " + var0.getSimpleName());
            var1x.printStackTrace();
            return null;
         });
         field41267.put(var0, var5);
      }
   }

   public static void method33371(Class<? extends ViaVersion7> var0, Class<? extends ViaVersion7> var1, Runnable var2) {
      synchronized (field41266) {
         CompletableFuture var6 = method33372(var1).whenCompleteAsync((var1x, var2x) -> var2.run(), field41268).exceptionally(var1x -> {
            ViaVersion3.method27613().getLogger().severe("Error during mapping loading of " + var0.getSimpleName());
            var1x.printStackTrace();
            return null;
         });
         field41267.put(var0, var6);
      }
   }

   @Nullable
   public static CompletableFuture<Void> method33372(Class<? extends ViaVersion7> var0) {
      synchronized (field41266) {
         return field41269 ? null : field41267.get(var0);
      }
   }

   static {
      ThreadFactory var4 = new ThreadFactoryBuilder().setNameFormat("Via-Mappingloader-%d").build();
      field41268 = new ThreadPoolExecutor(5, 16, 45L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), var4);
      field41268.allowCoreThreadTimeOut(true);
      method33357(field41257, Range.lessThan(Integer.MIN_VALUE));
      method33357(new Class6374(), Range.lessThan(ViaVerList._1_16.method18573()));
      method33357(new Class6375(), Range.atLeast(ViaVerList._1_16.method18573()));
      method33355(new Class6363(), ViaVerList._1_9, ViaVerList._1_8_x);
      method33356(
         new Class6359(), Arrays.<Integer>asList(ViaVerList._1_9_1.method18573(), ViaVerList._1_9_2.method18573()), ViaVerList._1_9.method18573()
      );
      method33355(new Class6354(), ViaVerList._1_9_3_or_4, ViaVerList._1_9_2);
      method33355(new Class6370(), ViaVerList._1_9, ViaVerList._1_9_2);
      method33356(
         new Class6366(), Arrays.<Integer>asList(ViaVerList._1_9_1.method18573(), ViaVerList._1_9_2.method18573()), ViaVerList._1_9_3_or_4.method18573()
      );
      method33355(new Class6362(), ViaVerList._1_10_X, ViaVerList._1_9_3_or_4);
      method33355(new Class6386(), ViaVerList._1_11, ViaVerList._1_10_X);
      method33355(new Class6383(), ViaVerList._1_11_1_or_2, ViaVerList._1_11);
      method33355(new Class6372(), ViaVerList._1_12, ViaVerList._1_11_1_or_2);
      method33355(new Class6364(), ViaVerList._1_12_1, ViaVerList._1_12);
      method33355(new Class6360(), ViaVerList._1_12_2, ViaVerList._1_12_1);
      method33355(new Class6380(), ViaVerList._1_13, ViaVerList._1_12_2);
      method33355(new Class6379(), ViaVerList._1_13_1, ViaVerList._1_13);
      method33355(new Class6365(), ViaVerList._1_13_2, ViaVerList._1_13_1);
      method33355(new Class6371(), ViaVerList._1_14, ViaVerList._1_13_2);
      method33355(new Class6369(), ViaVerList._1_14_1, ViaVerList._1_14);
      method33355(new Class6367(), ViaVerList._1_14_2, ViaVerList._1_14_1);
      method33355(new Class6382(), ViaVerList._1_14_3, ViaVerList._1_14_2);
      method33355(new Class6368(), ViaVerList._1_14_4, ViaVerList._1_14_3);
      method33355(new Class6384(), ViaVerList._1_15, ViaVerList._1_14_4);
      method33355(new Class6385(), ViaVerList._1_15_1, ViaVerList._1_15);
      method33355(new Class6361(), ViaVerList._1_15_2, ViaVerList._1_15_1);
      method33355(new Class6356(), ViaVerList._1_16, ViaVerList._1_15_2);
      method33355(new Class6378(), ViaVerList._1_16_1, ViaVerList._1_16);
      method33355(new Class6357(), ViaVerList._1_16_2, ViaVerList._1_16_1);
      method33355(new Class6381(), ViaVerList._1_16_3, ViaVerList._1_16_2);
      method33355(new Class6358(), ViaVerList._1_16_4, ViaVerList._1_16_3);
   }
}
