package remapped;

import com.google.common.collect.Sets;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_782 {
   private static final Logger field_4204 = LogManager.getLogger();
   private static final class_3556 field_4201 = new class_2438(Integer.MAX_VALUE, new class_3886());
   private final Map<class_1891, class_3556> field_4208 = new EnumMap<class_1891, class_3556>(class_1891.class);
   private final Set<class_3556> field_4207 = Sets.newLinkedHashSet();
   private final Supplier<class_3492> field_4203;
   private final EnumSet<class_1891> field_4205 = EnumSet.<class_1891>noneOf(class_1891.class);
   private int field_4206 = 3;

   public class_782(Supplier<class_3492> var1) {
      this.field_4203 = var1;
   }

   public void method_3485(int var1, class_3599 var2) {
      this.field_4207.add(new class_3556(var1, var2));
   }

   public void method_3488(class_3599 var1) {
      this.field_4207.stream().filter(var1x -> var1x.method_16537() == var1).filter(class_3556::method_16536).forEach(class_3556::method_16793);
      this.field_4207.removeIf(var1x -> var1x.method_16537() == var1);
   }

   public void method_3489() {
      class_3492 var3 = this.field_4203.get();
      var3.startSection("goalCleanup");
      if (this.field_4207.size() > 0) {
         for (class_3556 var5 : this.field_4207) {
            if (var5.method_16536() && (!var5.method_16536() || class_2922.method_13372(var5.method_16797(), this.field_4205) || !var5.method_16799())) {
               var5.method_16793();
            }
         }
      }

      if (this.field_4208.size() > 0) {
         this.field_4208.forEach((var1, var2) -> {
            if (!var2.method_16536()) {
               this.field_4208.remove(var1);
            }
         });
      }

      var3.endSection();
      var3.startSection("goalUpdate");
      if (this.field_4207.size() > 0) {
         for (class_3556 var8 : this.field_4207) {
            if (!var8.method_16536()
               && class_2922.method_13373(var8.method_16797(), this.field_4205)
               && method_3486(var8, var8.method_16797(), this.field_4208)
               && var8.method_16795()) {
               method_3484(var8, var8.method_16797(), this.field_4208);
               var8.method_16796();
            }
         }
      }

      var3.endSection();
      var3.startSection("goalTick");
      if (this.field_4207.size() > 0) {
         for (class_3556 var9 : this.field_4207) {
            if (var9.method_16536()) {
               var9.method_16794();
            }
         }
      }

      var3.endSection();
   }

   private static boolean method_3486(class_3556 var0, EnumSet<class_1891> var1, Map<class_1891, class_3556> var2) {
      if (var1.isEmpty()) {
         return true;
      } else {
         for (class_1891 var6 : var1) {
            class_3556 var7 = var2.getOrDefault(var6, field_4201);
            if (!var7.method_16535(var0)) {
               return false;
            }
         }

         return true;
      }
   }

   private static void method_3484(class_3556 var0, EnumSet<class_1891> var1, Map<class_1891, class_3556> var2) {
      if (!var1.isEmpty()) {
         for (class_1891 var6 : var1) {
            class_3556 var7 = var2.getOrDefault(var6, field_4201);
            var7.method_16793();
            var2.put(var6, var0);
         }
      }
   }

   public Stream<class_3556> method_3492() {
      return this.field_4207.stream().filter(class_3556::method_16536);
   }

   public void method_3487(class_1891 var1) {
      this.field_4205.add(var1);
   }

   public void method_3491(class_1891 var1) {
      this.field_4205.remove(var1);
   }

   public void method_3493(class_1891 var1, boolean var2) {
      if (!var2) {
         this.method_3487(var1);
      } else {
         this.method_3491(var1);
      }
   }
}
