package mapped;

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

public class Class8559<T> {
   private static final Logger field38466 = LogManager.getLogger();
   private final Class6062<T> field38467;
   private final Queue<Class8959<T>> field38468 = new PriorityQueue<Class8959<T>>(method30534());
   private UnsignedLong field38469 = UnsignedLong.ZERO;
   private final Table<String, Long, Class8959<T>> field38470 = HashBasedTable.create();

   private static <T> Comparator<Class8959<T>> method30534() {
      return Comparator.<Class8959<T>>comparingLong(var0 -> var0.field40476).thenComparing(var0 -> var0.field40477);
   }

   public Class8559(Class6062<T> var1, Stream<Dynamic<Class30>> var2) {
      this(var1);
      this.field38468.clear();
      this.field38470.clear();
      this.field38469 = UnsignedLong.ZERO;
      var2.forEach(var1x -> {
         if (var1x.getValue() instanceof CompoundNBT) {
            this.method30538((CompoundNBT)var1x.getValue());
         } else {
            field38466.warn("Invalid format of events: {}", var1x);
         }
      });
   }

   public Class8559(Class6062<T> var1) {
      this.field38467 = var1;
   }

   public void run(T var1, long var2) {
      while (true) {
         Class8959 var6 = this.field38468.peek();
         if (var6 == null || var6.field40476 > var2) {
            return;
         }

         this.field38468.remove();
         this.field38470.remove(var6.field40478, var2);
         var6.field40479.run((T)var1, this, var2);
      }
   }

   public void method30535(String var1, long var2, Class6861<T> var4) {
      if (!this.field38470.contains(var1, var2)) {
         this.field38469 = this.field38469.plus(UnsignedLong.ONE);
         Class8959 var7 = new Class8959(var2, this.field38469, var1, var4);
         this.field38470.put(var1, var2, var7);
         this.field38468.add(var7);
      }
   }

   public int method30536(String var1) {
      Collection var4 = this.field38470.row(var1).values();
      var4.forEach(this.field38468::remove);
      int var5 = var4.size();
      var4.clear();
      return var5;
   }

   public Set<String> method30537() {
      return Collections.<String>unmodifiableSet(this.field38470.rowKeySet());
   }

   private void method30538(CompoundNBT var1) {
      CompoundNBT var4 = var1.getCompound("Callback");
      Class6861 var5 = this.field38467.method18798(var4);
      if (var5 != null) {
         String var6 = var1.method126("Name");
         long var7 = var1.method123("TriggerTime");
         this.method30535(var6, var7, var5);
      }
   }

   private CompoundNBT method30539(Class8959<T> var1) {
      CompoundNBT var4 = new CompoundNBT();
      var4.method109("Name", var1.field40478);
      var4.method103("TriggerTime", var1.field40476);
      var4.put("Callback", this.field38467.method18797(var1.field40479));
      return var4;
   }

   public ListNBT method30540() {
      ListNBT var3 = new ListNBT();
      this.field38468.stream().sorted(method30534()).<CompoundNBT>map(this::method30539).forEach(var3::add);
      return var3;
   }
}
