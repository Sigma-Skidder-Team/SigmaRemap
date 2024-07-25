package remapped;

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

public abstract class class_9263 {
   private static final Logger field_47267 = LogManager.getLogger();
   private static final int field_47263 = 33 + class_7335.method_33455(class_7335.field_37514) - 2;
   private final Long2ObjectMap<ObjectSet<class_9359>> field_47261 = new Long2ObjectOpenHashMap();
   private final Long2ObjectOpenHashMap<class_1548<class_2837<?>>> field_47264 = new Long2ObjectOpenHashMap();
   private final class_6573 field_47271 = new class_6573(this);
   private final class_5712 field_47273 = new class_5712(this, 8);
   private final class_5781 field_47260 = new class_5781(this, 65);
   private final Set<class_5344> field_47266 = Sets.newHashSet();
   private final class_6025 field_47265;
   private final class_8816<class_1069<Runnable>> field_47269;
   private final class_8816<class_3684> field_47270;
   private final LongSet field_47262 = new LongOpenHashSet();
   private final Executor field_47268;
   private long field_47272;

   public class_9263(Executor var1, Executor var2) {
      class_8816 var5 = class_8816.<Runnable>method_40496("player ticket throttler", var2::execute);
      class_6025 var6 = new class_6025(ImmutableList.of(var5), var1, 4);
      this.field_47265 = var6;
      this.field_47269 = var6.<Runnable>method_27488(var5, true);
      this.field_47270 = var6.method_27490(var5);
      this.field_47268 = var2;
   }

   public void method_42708() {
      this.field_47272++;
      ObjectIterator var3 = this.field_47264.long2ObjectEntrySet().fastIterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if (((class_1548)var4.getValue()).removeIf(var1 -> var1.method_12899(this.field_47272))) {
            this.field_47271.method_30841(var4.getLongKey(), method_42697((class_1548<class_2837<?>>)var4.getValue()), false);
         }

         if (((class_1548)var4.getValue()).isEmpty()) {
            var3.remove();
         }
      }
   }

   private static int method_42697(class_1548<class_2837<?>> var0) {
      return var0.isEmpty() ? class_916.field_4710 + 1 : ((class_2837)var0.method_7024()).method_12895();
   }

   public abstract boolean method_42695(long var1);

   @Nullable
   public abstract class_5344 method_42678(long var1);

   @Nullable
   public abstract class_5344 method_42682(long var1, int var3, class_5344 var4, int var5);

   public boolean method_42683(class_916 var1) {
      this.field_47273.method_25797();
      this.field_47260.method_25797();
      int var4 = Integer.MAX_VALUE - this.field_47271.method_30024(Integer.MAX_VALUE);
      boolean var5 = var4 != 0;
      if (!var5) {
      }

      if (!this.field_47266.isEmpty()) {
         this.field_47266.forEach(var1x -> var1x.method_24344(var1));
         this.field_47266.clear();
         return true;
      } else {
         if (!this.field_47262.isEmpty()) {
            LongIterator var6 = this.field_47262.iterator();

            while (var6.hasNext()) {
               long var7 = var6.nextLong();
               if (this.method_42676(var7).stream().anyMatch(var0 -> var0.method_12898() == class_5032.field_26029)) {
                  class_5344 var9 = var1.method_3995(var7);
                  if (var9 == null) {
                     throw new IllegalStateException();
                  }

                  CompletableFuture var10 = var9.method_24353();
                  var10.thenAccept(var3 -> this.field_47268.execute(() -> this.field_47270.method_40495(class_6025.method_27485(() -> {
                        }, var7, false))));
               }
            }

            this.field_47262.clear();
         }

         return var5;
      }
   }

   private void method_42684(long var1, class_2837<?> var3) {
      class_1548 var6 = this.method_42676(var1);
      int var7 = method_42697(var6);
      class_2837 var8 = var6.method_7030(var3);
      var8.method_12897(this.field_47272);
      if (var3.method_12895() < var7) {
         this.field_47271.method_30841(var1, var3.method_12895(), true);
      }
   }

   private void method_42679(long var1, class_2837<?> var3) {
      class_1548 var6 = this.method_42676(var1);
      if (!var6.remove(var3)) {
      }

      if (var6.isEmpty()) {
         this.field_47264.remove(var1);
      }

      this.field_47271.method_30841(var1, method_42697(var6), false);
   }

   public <T> void method_42699(class_5032<T> var1, class_2034 var2, int var3, T var4) {
      this.method_42684(var2.method_9539(), new class_2837<Object>(var1, var3, var4));
   }

   public <T> void method_42687(class_5032<T> var1, class_2034 var2, int var3, T var4) {
      class_2837 var7 = new class_2837<Object>(var1, var3, var4);
      this.method_42679(var2.method_9539(), var7);
   }

   public <T> void method_42685(class_5032<T> var1, class_2034 var2, int var3, T var4) {
      this.method_42684(var2.method_9539(), new class_2837<Object>(var1, 33 - var3, var4));
   }

   public <T> void method_42680(class_5032<T> var1, class_2034 var2, int var3, T var4) {
      class_2837 var7 = new class_2837<Object>(var1, 33 - var3, var4);
      this.method_42679(var2.method_9539(), var7);
   }

   private class_1548<class_2837<?>> method_42676(long var1) {
      return (class_1548<class_2837<?>>)this.field_47264.computeIfAbsent(var1, var0 -> class_1548.method_7021(4));
   }

   public void method_42702(class_2034 var1, boolean var2) {
      class_2837 var5 = new class_2837<class_2034>(class_5032.field_26025, 31, var1);
      if (!var2) {
         this.method_42679(var1.method_9539(), var5);
      } else {
         this.method_42684(var1.method_9539(), var5);
      }
   }

   public void method_42686(class_6979 var1, class_9359 var2) {
      long var5 = var1.method_31917().method_9539();
      ((ObjectSet)this.field_47261.computeIfAbsent(var5, var0 -> new ObjectOpenHashSet())).add(var2);
      this.field_47273.method_30841(var5, 0, true);
      this.field_47260.method_30841(var5, 0, true);
   }

   public void method_42707(class_6979 var1, class_9359 var2) {
      long var5 = var1.method_31917().method_9539();
      ObjectSet var7 = (ObjectSet)this.field_47261.get(var5);
      var7.remove(var2);
      if (var7.isEmpty()) {
         this.field_47261.remove(var5);
         this.field_47273.method_30841(var5, Integer.MAX_VALUE, false);
         this.field_47260.method_30841(var5, Integer.MAX_VALUE, false);
      }
   }

   public String method_42701(long var1) {
      class_1548 var5 = (class_1548)this.field_47264.get(var1);
      String var6;
      if (var5 != null && !var5.isEmpty()) {
         var6 = ((class_2837)var5.method_7024()).toString();
      } else {
         var6 = "no_ticket";
      }

      return var6;
   }

   public void method_42681(int var1) {
      this.field_47260.method_26155(var1);
   }

   public int method_42677() {
      this.field_47273.method_25797();
      return this.field_47273.field_28890.size();
   }

   public boolean method_42692(long var1) {
      this.field_47273.method_25797();
      return this.field_47273.field_28890.containsKey(var1);
   }

   public String method_42698() {
      return this.field_47265.method_27489();
   }
}
