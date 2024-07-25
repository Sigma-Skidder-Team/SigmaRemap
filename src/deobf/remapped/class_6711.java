package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6711 {
   private static final Logger field_34675 = LogManager.getLogger();
   private final Map<class_225, class_9747> field_34674 = Maps.newHashMap();
   private final Set<class_9747> field_34677 = Sets.newHashSet();
   private final class_9632 field_34676;

   public class_6711(class_9632 var1) {
      this.field_34676 = var1;
   }

   private void method_30815(class_9747 var1) {
      if (var1.method_44993().method_953()) {
         this.field_34677.add(var1);
      }
   }

   public Set<class_9747> method_30813() {
      return this.field_34677;
   }

   public Collection<class_9747> method_30803() {
      return this.field_34674.values().stream().filter(var0 -> var0.method_44993().method_953()).collect(Collectors.<class_9747>toList());
   }

   @Nullable
   public class_9747 method_30808(class_225 var1) {
      return this.field_34674.computeIfAbsent(var1, var1x -> this.field_34676.method_44450(this::method_30815, var1x));
   }

   public boolean method_30801(class_225 var1) {
      return this.field_34674.get(var1) != null || this.field_34676.method_44451(var1);
   }

   public boolean method_30810(class_225 var1, UUID var2) {
      class_9747 var5 = this.field_34674.get(var1);
      return var5 == null ? this.field_34676.method_44453(var1, var2) : var5.method_44997(var2) != null;
   }

   public double method_30814(class_225 var1) {
      class_9747 var4 = this.field_34674.get(var1);
      return var4 == null ? this.field_34676.method_44446(var1) : var4.method_44998();
   }

   public double method_30805(class_225 var1) {
      class_9747 var4 = this.field_34674.get(var1);
      return var4 == null ? this.field_34676.method_44449(var1) : var4.getBaseValue();
   }

   public double method_30806(class_225 var1, UUID var2) {
      class_9747 var5 = this.field_34674.get(var1);
      return var5 == null ? this.field_34676.method_44454(var1, var2) : var5.method_44997(var2).method_43123();
   }

   public void method_30809(Multimap<class_225, class_9343> var1) {
      var1.asMap().forEach((var1x, var2) -> {
         class_9747 var5 = this.field_34674.get(var1x);
         if (var5 != null) {
            var2.forEach(var5::method_45004);
         }
      });
   }

   public void method_30802(Multimap<class_225, class_9343> var1) {
      var1.forEach((var1x, var2) -> {
         class_9747 var5 = this.method_30808(var1x);
         if (var5 != null) {
            var5.method_45004(var2);
            var5.method_45011(var2);
         }
      });
   }

   public void method_30804(class_6711 var1) {
      var1.field_34674.values().forEach(var1x -> {
         class_9747 var4 = this.method_30808(var1x.method_44993());
         if (var4 != null) {
            var4.method_45010(var1x);
         }
      });
   }

   public class_3416 method_30807() {
      class_3416 var3 = new class_3416();

      for (class_9747 var5 : this.field_34674.values()) {
         var3.add(var5.method_45012());
      }

      return var3;
   }

   public void method_30812(class_3416 var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         CompoundNBT var5 = var1.method_15764(var4);
         String var6 = var5.method_25965("Name");
         Util.<class_225>method_44691(class_8669.field_44403.method_39794(Identifier.method_21455(var6)), var2 -> {
            class_9747 var5x = this.method_30808(var2);
            if (var5x != null) {
               var5x.method_45014(var5);
            }
         }, () -> field_34675.warn("Ignoring unknown attribute '{}'", var6));
      }
   }
}
