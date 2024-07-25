package remapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenCustomHashMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import org.apache.commons.lang3.tuple.Pair;

public class class_1509 implements class_7373 {
   private static String[] field_7988;
   private final List<Pair<Predicate<class_2522>, class_7373>> field_7989;
   public final boolean field_7987;
   public final boolean field_7990;
   public final boolean field_7992;
   public final class_5155 field_7985;
   public final class_7729 field_7993;
   public final class_602 field_7991;
   private final Map<class_2522, BitSet> field_7986 = new Object2ObjectOpenCustomHashMap(Util.method_44698());

   public class_1509(List<Pair<Predicate<class_2522>, class_7373>> var1) {
      this.field_7989 = var1;
      class_7373 var4 = (class_7373)((Pair)var1.iterator().next()).getRight();
      this.field_7987 = var4.method_33581();
      this.field_7990 = var4.method_33583();
      this.field_7992 = var4.method_33585();
      this.field_7985 = var4.method_33587();
      this.field_7993 = var4.method_33586();
      this.field_7991 = var4.method_33584();
   }

   @Override
   public List<class_5024> method_33580(class_2522 var1, class_240 var2, Random var3) {
      if (var1 == null) {
         return Collections.<class_5024>emptyList();
      } else {
         BitSet var6 = this.field_7986.get(var1);
         if (var6 == null) {
            var6 = new BitSet();

            for (int var7 = 0; var7 < this.field_7989.size(); var7++) {
               Pair var11 = this.field_7989.get(var7);
               if (((Predicate)var11.getLeft()).test(var1)) {
                  var6.set(var7);
               }
            }

            this.field_7986.put(var1, var6);
         }

         ArrayList var12 = Lists.newArrayList();
         long var8 = var3.nextLong();

         for (int var10 = 0; var10 < var6.length(); var10++) {
            if (var6.get(var10)) {
               var12.addAll(((class_7373)this.field_7989.get(var10).getRight()).method_33580(var1, var2, new Random(var8)));
            }
         }

         return var12;
      }
   }

   @Override
   public boolean method_33581() {
      return this.field_7987;
   }

   @Override
   public boolean method_33583() {
      return this.field_7990;
   }

   @Override
   public boolean method_33585() {
      return this.field_7992;
   }

   @Override
   public boolean method_33582() {
      return false;
   }

   @Override
   public class_5155 method_33587() {
      return this.field_7985;
   }

   @Override
   public class_7729 method_33586() {
      return this.field_7993;
   }

   @Override
   public class_602 method_33584() {
      return this.field_7991;
   }
}
