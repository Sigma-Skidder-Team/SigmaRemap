package remapped;

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

public class class_6710 {
   public static final class_4106 field_34664 = new class_3839();
   public static int field_34660 = -1;
   public static int field_34661 = 50;
   private static final Int2ObjectMap<Int2ObjectMap<class_4106>> field_34663 = new Int2ObjectOpenHashMap(32);
   private static final Map<Class<? extends class_4106>, class_4106> field_34669 = new HashMap<Class<? extends class_4106>, class_4106>();
   private static final Map<class_7794<Integer, Integer>, List<class_7794<Integer, class_4106>>> field_34662 = new ConcurrentHashMap<class_7794<Integer, Integer>, List<class_7794<Integer, class_4106>>>();
   private static final Set<Integer> field_34659 = new HashSet<Integer>();
   private static final List<class_7794<Range<Integer>, class_4106>> field_34666 = Lists.newCopyOnWriteArrayList();
   private static final List<class_4106> field_34665 = new ArrayList<class_4106>();
   private static final Object field_34670 = new Object();
   private static Map<Class<? extends class_4106>, CompletableFuture<Void>> field_34668 = new HashMap<Class<? extends class_4106>, CompletableFuture<Void>>();
   private static ThreadPoolExecutor field_34671;
   private static boolean field_34667;

   public static void method_30788() {
   }

   public static void method_30793(class_4106 var0, class_412 var1, class_412 var2) {
      method_30792(var0, Collections.<Integer>singletonList(var1.method_2056()), var2.method_2056());
   }

   public static void method_30792(class_4106 var0, List<Integer> var1, int var2) {
      if (!field_34662.isEmpty()) {
         field_34662.clear();
      }

      field_34669.put((Class<? extends class_4106>)var0.getClass(), var0);

      for (int var6 : var1) {
         Int2ObjectMap var7 = (Int2ObjectMap)field_34663.computeIfAbsent(var6, var0x -> new Int2ObjectOpenHashMap(2));
         var7.put(var2, var0);
      }

      if (!class_3446.method_15886().method_34628()) {
         field_34665.add(var0);
      } else {
         var0.method_19020(class_3446.method_15883().method_33743());
         method_30774();
      }

      if (var0.method_19023()) {
         if (field_34671 == null) {
            var0.method_19024();
         } else {
            method_30778((Class<? extends class_4106>)var0.getClass(), var0::method_19024);
         }
      }
   }

   public static void method_30785(class_4106 var0, Range<Integer> var1) {
      field_34666.add(new class_7794<Range<Integer>, class_4106>(var1, var0));
      if (!class_3446.method_15886().method_34628()) {
         field_34665.add(var0);
      } else {
         var0.method_19020(class_3446.method_15883().method_33743());
         method_30774();
      }
   }

   public static void method_30774() {
      field_34659.clear();
      field_34659.add(field_34660);

      for (class_412 var3 : class_412.method_2040()) {
         List var4 = method_30789(var3.method_2056(), field_34660);
         if (var4 != null) {
            field_34659.add(var3.method_2056());

            for (class_7794 var6 : var4) {
               field_34659.add((Integer)var6.method_35355());
            }
         }
      }
   }

   public static SortedSet<Integer> method_30787() {
      return Collections.<Integer>unmodifiableSortedSet(new TreeSet<Integer>(field_34659));
   }

   public static boolean method_30780() {
      ObjectIterator var2 = field_34663.values().iterator();

      while (var2.hasNext()) {
         Int2ObjectMap var3 = (Int2ObjectMap)var2.next();
         if (var3.containsKey(field_34660)) {
            return true;
         }
      }

      return false;
   }

   public static void method_30784() {
      for (class_4106 var3 : field_34665) {
         var3.method_19020(class_3446.method_15883().method_33743());
      }
   }

   @Nullable
   private static List<class_7794<Integer, class_4106>> method_30790(List<class_7794<Integer, class_4106>> var0, int var1, int var2) {
      if (var1 == var2) {
         return null;
      } else if (var0.size() > field_34661) {
         return null;
      } else {
         Int2ObjectMap var5 = (Int2ObjectMap)field_34663.get(var1);
         if (var5 == null) {
            return null;
         } else {
            class_4106 var6 = (class_4106)var5.get(var2);
            if (var6 != null) {
               var0.add(new class_7794<Integer, class_4106>(var2, var6));
               return var0;
            } else {
               List var7 = null;
               ObjectIterator var8 = var5.int2ObjectEntrySet().iterator();

               while (var8.hasNext()) {
                  Entry var9 = (Entry)var8.next();
                  if (var9.getIntKey() != var2) {
                     class_7794 var10 = new class_7794<Integer, Object>(var9.getIntKey(), var9.getValue());
                     if (!var0.contains(var10)) {
                        ArrayList var11 = new ArrayList(var0);
                        var11.add(var10);
                        List var12 = method_30790(var11, var9.getKey(), var2);
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
   public static List<class_7794<Integer, class_4106>> method_30789(int var0, int var1) {
      class_7794 var4 = new class_7794<Integer, Integer>(var0, var1);
      List var5 = field_34662.get(var4);
      if (var5 == null) {
         List var6 = method_30790(new ArrayList<class_7794<Integer, class_4106>>(), var0, var1);
         if (var6 != null) {
            field_34662.put(var4, var6);
         }

         return var6;
      } else {
         return var5;
      }
   }

   @Nullable
   public static class_4106 method_30786(Class<? extends class_4106> var0) {
      return field_34669.get(var0);
   }

   public static class_4106 method_30781(int var0) {
      for (class_7794 var4 : Lists.reverse(field_34666)) {
         if (((Range)var4.method_35355()).contains(var0)) {
            return (class_4106)var4.method_35352();
         }
      }

      throw new IllegalStateException("No Base Protocol for " + var0);
   }

   public static boolean method_30779(class_4106 var0) {
      for (class_7794 var4 : field_34666) {
         if (var4.method_35352() == var0) {
            return true;
         }
      }

      return false;
   }

   public static void method_30783(Class<? extends class_4106> var0) throws Exception {
      if (!field_34667) {
         CompletableFuture var3 = method_30776(var0);
         if (var3 != null) {
            var3.get();
         }
      }
   }

   public static boolean method_30775() {
      synchronized (field_34670) {
         if (field_34667) {
            return false;
         } else {
            for (CompletableFuture var4 : field_34668.values()) {
               if (!var4.isDone()) {
                  return false;
               }
            }

            method_30782();
            return true;
         }
      }
   }

   private static void method_30782() {
      class_3446.method_15886().method_34617().info("Shutting down mapping loader executor!");
      field_34667 = true;
      field_34671.shutdown();
      field_34671 = null;
      field_34668.clear();
      field_34668 = null;
      if (class_3792.method_17621()) {
         class_3792.method_17609().clear();
      }
   }

   public static void method_30778(Class<? extends class_4106> var0, Runnable var1) {
      synchronized (field_34670) {
         CompletableFuture var5 = CompletableFuture.runAsync(var1, field_34671).exceptionally(var1x -> {
            class_3446.method_15886().method_34617().severe("Error during mapping loading of " + var0.getSimpleName());
            var1x.printStackTrace();
            return null;
         });
         field_34668.put(var0, var5);
      }
   }

   public static void method_30777(Class<? extends class_4106> var0, Class<? extends class_4106> var1, Runnable var2) {
      synchronized (field_34670) {
         CompletableFuture var6 = method_30776(var1).whenCompleteAsync((var1x, var2x) -> var2.run(), field_34671).exceptionally(var1x -> {
            class_3446.method_15886().method_34617().severe("Error during mapping loading of " + var0.getSimpleName());
            var1x.printStackTrace();
            return null;
         });
         field_34668.put(var0, var6);
      }
   }

   @Nullable
   public static CompletableFuture<Void> method_30776(Class<? extends class_4106> var0) {
      synchronized (field_34670) {
         return field_34667 ? null : field_34668.get(var0);
      }
   }

   static {
      ThreadFactory var4 = new ThreadFactoryBuilder().setNameFormat("Via-Mappingloader-%d").build();
      field_34671 = new ThreadPoolExecutor(5, 16, 45L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), var4);
      field_34671.allowCoreThreadTimeOut(true);
      method_30785(field_34664, Range.lessThan(Integer.MIN_VALUE));
      method_30785(new class_5533(), Range.lessThan(class_412.field_1742.method_2056()));
      method_30785(new class_5562(), Range.atLeast(class_412.field_1742.method_2056()));
      method_30793(new class_6890(), class_412.field_1724, class_412.field_1747);
      method_30792(
         new class_594(), Arrays.<Integer>asList(class_412.field_1756.method_2056(), class_412.field_1757.method_2056()), class_412.field_1724.method_2056()
      );
      method_30793(new class_584(), class_412.field_1738, class_412.field_1757);
      method_30793(new class_6572(), class_412.field_1724, class_412.field_1757);
      method_30792(
         new class_5305(), Arrays.<Integer>asList(class_412.field_1756.method_2056(), class_412.field_1757.method_2056()), class_412.field_1738.method_2056()
      );
      method_30793(new class_7355(), class_412.field_1729, class_412.field_1738);
      method_30793(new class_2133(), class_412.field_1727, class_412.field_1729);
      method_30793(new class_5743(), class_412.field_1752, class_412.field_1727);
      method_30793(new class_7015(), class_412.field_1740, class_412.field_1752);
      method_30793(new class_2954(), class_412.field_1739, class_412.field_1740);
      method_30793(new class_657(), class_412.field_1728, class_412.field_1739);
      method_30793(new class_8633(), class_412.field_1751, class_412.field_1728);
      method_30793(new class_5768(), class_412.field_1743, class_412.field_1751);
      method_30793(new class_2508(), class_412.field_1737, class_412.field_1743);
      method_30793(new class_5988(), class_412.field_1741, class_412.field_1737);
      method_30793(new class_5541(), class_412.field_1725, class_412.field_1741);
      method_30793(new class_982(), class_412.field_1735, class_412.field_1725);
      method_30793(new class_3873(), class_412.field_1734, class_412.field_1735);
      method_30793(new class_1438(), class_412.field_1750, class_412.field_1734);
      method_30793(new class_3846(), class_412.field_1759, class_412.field_1750);
      method_30793(new class_6882(), class_412.field_1754, class_412.field_1759);
      method_30793(new class_7466(), class_412.field_1726, class_412.field_1754);
      method_30793(new class_757(), class_412.field_1742, class_412.field_1726);
      method_30793(new class_2163(), class_412.field_1749, class_412.field_1742);
      method_30793(new class_6003(), class_412.field_1733, class_412.field_1749);
      method_30793(new class_5030(), class_412.field_1730, class_412.field_1733);
      method_30793(new class_6026(), class_412.field_1732, class_412.field_1730);
   }
}
