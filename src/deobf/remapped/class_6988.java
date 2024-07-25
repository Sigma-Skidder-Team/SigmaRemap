package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class class_6988 implements AutoCloseable {
   private static final class_6575 field_35879 = new class_6575();
   private static final class_5543 field_35888 = () -> 4.0F;
   private static final Random field_35890 = new Random();
   private final class_7889 field_35889;
   private final class_4639 field_35881;
   private class_6938 field_35882;
   private class_6938 field_35886;
   private final List<class_3293> field_35880 = Lists.newArrayList();
   private final Int2ObjectMap<class_6938> field_35883 = new Int2ObjectOpenHashMap();
   private final Int2ObjectMap<class_5543> field_35885 = new Int2ObjectOpenHashMap();
   private final Int2ObjectMap<IntList> field_35884 = new Int2ObjectOpenHashMap();
   private final List<class_7079> field_35887 = Lists.newArrayList();

   public class_6988(class_7889 var1, class_4639 var2) {
      this.field_35889 = var1;
      this.field_35881 = var2;
   }

   public void method_31979(List<class_3293> var1) {
      this.method_31976();
      this.method_31981();
      this.field_35883.clear();
      this.field_35885.clear();
      this.field_35884.clear();
      this.field_35882 = this.method_31972(class_7989.field_40941);
      this.field_35886 = this.method_31972(class_4068.field_19816);
      IntOpenHashSet var4 = new IntOpenHashSet();

      for (class_3293 var6 : var1) {
         var4.addAll(var6.method_15108());
      }

      HashSet var7 = Sets.newHashSet();
      var4.forEach(
         var3 -> {
            for (class_3293 var7x : var1) {
               Object var8 = var3 != 32 ? var7x.method_15109(var3) : field_35888;
               if (var8 != null) {
                  var7.add(var7x);
                  if (var8 != class_7989.field_40941) {
                     ((IntList)this.field_35884.computeIfAbsent(class_9299.method_42816(((class_5543)var8).method_25221(false)), var0 -> new IntArrayList()))
                        .add(var3);
                  }
                  break;
               }
            }
         }
      );
      var1.stream().filter(var7::contains).forEach(this.field_35880::add);
   }

   @Override
   public void close() {
      this.method_31976();
      this.method_31981();
   }

   private void method_31976() {
      for (class_3293 var4 : this.field_35880) {
         var4.close();
      }

      this.field_35880.clear();
   }

   private void method_31981() {
      for (class_7079 var4 : this.field_35887) {
         var4.close();
      }

      this.field_35887.clear();
   }

   public class_5543 method_31974(int var1) {
      Object var4 = (class_5543)this.field_35885.get(var1);
      if (var4 == null) {
         if (var1 != 32) {
            var4 = this.method_31973(var1);
         } else {
            var4 = field_35888;
         }

         this.field_35885.put(var1, var4);
      }

      return (class_5543)var4;
   }

   private class_3354 method_31973(int var1) {
      for (class_3293 var5 : this.field_35880) {
         class_3354 var6 = var5.method_15109(var1);
         if (var6 != null) {
            return var6;
         }
      }

      return class_7989.field_40941;
   }

   public class_6938 method_31980(int var1) {
      Object var4 = (class_6938)this.field_35883.get(var1);
      if (var4 == null) {
         if (var1 != 32) {
            var4 = this.method_31972(this.method_31973(var1));
         } else {
            var4 = field_35879;
         }

         this.field_35883.put(var1, var4);
      }

      return (class_6938)var4;
   }

   private class_6938 method_31972(class_3354 var1) {
      for (class_7079 var5 : this.field_35887) {
         class_6938 var6 = var5.method_32577(var1);
         if (var6 != null) {
            return var6;
         }
      }

      class_7079 var7 = new class_7079(
         new class_4639(this.field_35881.method_21461(), this.field_35881.method_21456() + "/" + this.field_35887.size()), var1.method_15370()
      );
      this.field_35887.add(var7);
      this.field_35889.method_35682(var7.method_32578(), var7);
      class_6938 var8 = var7.method_32577(var1);
      return var8 != null ? var8 : this.field_35882;
   }

   public class_6938 method_31978(class_5543 var1) {
      IntList var4 = (IntList)this.field_35884.get(class_9299.method_42816(var1.method_25221(false)));
      return var4 != null && !var4.isEmpty() ? this.method_31980(var4.getInt(field_35890.nextInt(var4.size()))) : this.field_35882;
   }

   public class_6938 method_31975() {
      return this.field_35886;
   }
}
