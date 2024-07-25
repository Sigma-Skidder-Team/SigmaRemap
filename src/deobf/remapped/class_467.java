package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_467 {
   private static final Logger field_2927 = LogManager.getLogger();
   private final BlockPos field_2924;
   private final class_6331 field_2928;
   private final class_2983 field_2925;
   private final int field_2919;
   private final List<class_4085> field_2920 = Lists.newArrayList();
   private final Map<class_4085, BlockPos> field_2929 = Maps.newHashMap();
   private final List<Pair<class_4350, Collection<class_4085>>> field_2922 = Lists.newArrayList();
   private class_8604 field_2921;
   private int field_2930 = 0;
   private class_2921 field_2926;

   public class_467(Collection<class_4350> var1, BlockPos var2, class_6631 var3, class_6331 var4, class_2983 var5, int var6) {
      this.field_2926 = var2.method_6089();
      this.field_2924 = var2;
      this.field_2928 = var4;
      this.field_2925 = var5;
      this.field_2919 = var6;
      var1.forEach(var3x -> {
         ArrayList var6x = Lists.newArrayList();

         for (class_226 var8 : var3x.method_20204()) {
            class_4085 var9 = new class_4085(var8, var3, var4);
            var6x.add(var9);
            this.field_2920.add(var9);
         }

         this.field_2922.add(Pair.of(var3x, var6x));
      });
   }

   public List<class_4085> method_2248() {
      return this.field_2920;
   }

   public void method_2243() {
      this.method_2246(0);
   }

   private void method_2246(int var1) {
      this.field_2930 = var1;
      this.field_2921 = new class_8604();
      if (var1 < this.field_2922.size()) {
         Pair var4 = this.field_2922.get(this.field_2930);
         class_4350 var5 = (class_4350)var4.getFirst();
         Collection var6 = (Collection)var4.getSecond();
         this.method_2245(var6);
         var5.method_20205(this.field_2928);
         String var7 = var5.method_20202();
         field_2927.info("Running test batch '" + var7 + "' (" + var6.size() + " tests)...");
         var6.forEach(var1x -> {
            this.field_2921.method_39548(var1x);
            this.field_2921.method_39546(new class_4500(this));
            BlockPos var4x = this.field_2929.get(var1x);
            class_1954.method_9032(var1x, var4x, this.field_2925);
         });
      }
   }

   private void method_2242(class_4085 var1) {
      if (this.field_2921.method_39541()) {
         this.method_2246(this.field_2930 + 1);
      }
   }

   private void method_2245(Collection<class_4085> var1) {
      int var4 = 0;
      Box var5 = new Box(this.field_2926);

      for (class_4085 var7 : var1) {
         BlockPos var8 = new BlockPos(this.field_2926);
         class_945 var9 = class_2765.method_12584(var7.method_18839(), var8, var7.method_18840(), 2, this.field_2928, true);
         Box var10 = class_2765.method_12596(var9);
         var7.method_18846(var9.method_17399());
         this.field_2929.put(var7, new BlockPos(this.field_2926));
         var5 = var5.method_18905(var10);
         this.field_2926.method_13367((int)var10.method_18910() + 5, 0, 0);
         if (var4++ % this.field_2919 == this.field_2919 - 1) {
            this.field_2926.method_13367(0, 0, (int)var5.method_18921() + 6);
            this.field_2926.method_12167(this.field_2924.method_12173());
            var5 = new Box(this.field_2926);
         }
      }
   }
}
