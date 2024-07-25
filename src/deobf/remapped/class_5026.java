package remapped;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.UnsignedLong;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5026<T> {
   private static final Logger field_25999 = LogManager.getLogger();
   private final class_455<T> field_25997;
   private final Queue<class_6529<T>> field_26001 = new PriorityQueue<class_6529<T>>(method_23177());
   private UnsignedLong field_26002 = UnsignedLong.ZERO;
   private final Table<String, Long, class_6529<T>> field_26000 = HashBasedTable.create();

   private static <T> Comparator<class_6529<T>> method_23177() {
      return Comparator.<class_6529<T>>comparingLong(var0 -> var0.field_33220).thenComparing(var0 -> var0.field_33219);
   }

   public class_5026(class_455<T> var1, Stream<Dynamic<class_8406>> var2) {
      this(var1);
      this.field_26001.clear();
      this.field_26000.clear();
      this.field_26002 = UnsignedLong.ZERO;
      var2.forEach(var1x -> {
         if (var1x.getValue() instanceof class_5734) {
            this.method_23178((class_5734)var1x.getValue());
         } else {
            field_25999.warn("Invalid format of events: {}", var1x);
         }
      });
   }

   public class_5026(class_455<T> var1) {
      this.field_25997 = var1;
   }

   public void run(T var1, long var2) {
      while (true) {
         class_6529 var6 = this.field_26001.peek();
         if (var6 == null || var6.field_33220 > var2) {
            return;
         }

         this.field_26001.remove();
         this.field_26000.remove(var6.field_33222, var2);
         var6.field_33223.run((T)var1, this, var2);
      }
   }

   public void method_23179(String var1, long var2, class_7803<T> var4) {
      if (!this.field_26000.contains(var1, var2)) {
         this.field_26002 = this.field_26002.plus(UnsignedLong.ONE);
         class_6529 var7 = new class_6529(var2, this.field_26002, var1, var4, null);
         this.field_26000.put(var1, var2, var7);
         this.field_26001.add(var7);
      }
   }

   public int method_23182(String var1) {
      Collection var4 = this.field_26000.row(var1).values();
      var4.forEach(this.field_26001::remove);
      int var5 = var4.size();
      var4.clear();
      return var5;
   }

   public Set<String> method_23180() {
      return Collections.<String>unmodifiableSet(this.field_26000.rowKeySet());
   }

   private void method_23178(class_5734 var1) {
      class_5734 var4 = var1.method_25937("Callback");
      class_7803 var5 = this.field_25997.method_2185(var4);
      if (var5 != null) {
         String var6 = var1.method_25965("Name");
         long var7 = var1.method_25948("TriggerTime");
         this.method_23179(var6, var7, var5);
      }
   }

   private class_5734 method_23176(class_6529<T> var1) {
      class_5734 var4 = new class_5734();
      var4.method_25941("Name", var1.field_33222);
      var4.method_25949("TriggerTime", var1.field_33220);
      var4.method_25946("Callback", this.field_25997.method_2187(var1.field_33223));
      return var4;
   }

   public class_3416 method_23181() {
      class_3416 var3 = new class_3416();
      this.field_26001.stream().sorted(method_23177()).<class_5734>map(this::method_23176).forEach(var3::add);
      return var3;
   }
}
