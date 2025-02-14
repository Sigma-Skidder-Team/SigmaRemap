package mapped;

import com.google.common.collect.Sets;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6603 {
   private static final Logger field29039 = LogManager.getLogger();
   private static final Class2625 field29040 = new Class2626(Integer.MAX_VALUE, new Class2761());
   private final Map<Class2240, Class2625> field29041 = new EnumMap<Class2240, Class2625>(Class2240.class);
   private final Set<Class2625> field29042 = Sets.newLinkedHashSet();
   private final Supplier<IProfiler> field29043;
   private final EnumSet<Class2240> field29044 = EnumSet.<Class2240>noneOf(Class2240.class);
   private int field29045 = 3;

   public Class6603(Supplier<IProfiler> var1) {
      this.field29043 = var1;
   }

   public void addGoal(int var1, Class2595 var2) {
      this.field29042.add(new Class2625(var1, var2));
   }

   public void method20003(Class2595 var1) {
      this.field29042.stream().filter(var1x -> var1x.method10832() == var1).filter(Class2625::method10830).forEach(Class2625::method10807);
      this.field29042.removeIf(var1x -> var1x.method10832() == var1);
   }

   public void method20004() {
      IProfiler var3 = this.field29043.get();
      var3.startSection("goalCleanup");
      if (this.field29042.size() > 0) {
         for (Class2625 var5 : this.field29042) {
            if (var5.method10830() && (!var5.method10830() || Class7850.method26309(var5.method10810(), this.field29044) || !var5.method10806())) {
               var5.method10807();
            }
         }
      }

      if (this.field29041.size() > 0) {
         this.field29041.forEach((var1, var2) -> {
            if (!var2.method10830()) {
               this.field29041.remove(var1);
            }
         });
      }

      var3.endSection();
      var3.startSection("goalUpdate");
      if (this.field29042.size() > 0) {
         for (Class2625 var8 : this.field29042) {
            if (!var8.method10830()
               && Class7850.method26308(var8.method10810(), this.field29044)
               && method20005(var8, var8.method10810(), this.field29041)
               && var8.method10803()) {
               method20006(var8, var8.method10810(), this.field29041);
               var8.method10804();
            }
         }
      }

      var3.endSection();
      var3.startSection("goalTick");
      if (this.field29042.size() > 0) {
         for (Class2625 var9 : this.field29042) {
            if (var9.method10830()) {
               var9.method10805();
            }
         }
      }

      var3.endSection();
   }

   private static boolean method20005(Class2625 var0, EnumSet<Class2240> var1, Map<Class2240, Class2625> var2) {
      if (var1.isEmpty()) {
         return true;
      } else {
         for (Class2240 var6 : var1) {
            Class2625 var7 = var2.getOrDefault(var6, field29040);
            if (!var7.method10829(var0)) {
               return false;
            }
         }

         return true;
      }
   }

   private static void method20006(Class2625 var0, EnumSet<Class2240> var1, Map<Class2240, Class2625> var2) {
      if (!var1.isEmpty()) {
         for (Class2240 var6 : var1) {
            Class2625 var7 = var2.getOrDefault(var6, field29040);
            var7.method10807();
            var2.put(var6, var0);
         }
      }
   }

   public Stream<Class2625> method20007() {
      return this.field29042.stream().filter(Class2625::method10830);
   }

   public void method20008(Class2240 var1) {
      this.field29044.add(var1);
   }

   public void method20009(Class2240 var1) {
      this.field29044.remove(var1);
   }

   public void method20010(Class2240 var1, boolean var2) {
      if (!var2) {
         this.method20008(var1);
      } else {
         this.method20009(var1);
      }
   }
}
