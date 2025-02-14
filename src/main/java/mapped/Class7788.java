package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Class7788 {
   public static final Class7172 field33411 = new Class7172();
   public static final Class7788 field33412 = new Class7787(Lists.newArrayList(), -1, -1, 1, false);
   private final List<Class9704> field33413;
   private final int field33414;
   private final int field33415;
   private final int field33416;
   private final boolean field33417;

   public Class7788(List<Class9704> var1, int var2, int var3, int var4, boolean var5) {
      this.field33413 = var1;
      this.field33414 = var2;
      this.field33415 = var3;
      this.field33416 = var4;
      this.field33417 = var5;
   }

   private static boolean method25808(int var0, int var1) {
      return var0 / var1 * var1 == var0;
   }

   public Pair<Integer, Integer> method25807(int var1, int var2) {
      Pair var5 = this.method25809(var1, var2);
      int var6 = (Integer)var5.getFirst();
      int var7 = (Integer)var5.getSecond();
      if (method25808(var1, var6) && method25808(var2, var7)) {
         return var5;
      } else {
         throw new IllegalArgumentException(String.format("Image size %s,%s is not multiply of frame size %s,%s", var1, var2, var6, var7));
      }
   }

   private Pair<Integer, Integer> method25809(int var1, int var2) {
      if (this.field33414 == -1) {
         if (this.field33415 == -1) {
            int var5 = Math.min(var1, var2);
            return Pair.of(var5, var5);
         } else {
            return Pair.of(var1, this.field33415);
         }
      } else {
         return this.field33415 == -1 ? Pair.of(this.field33414, var2) : Pair.of(this.field33414, this.field33415);
      }
   }

   public int method25810(int var1) {
      return this.field33415 != -1 ? this.field33415 : var1;
   }

   public int method25811(int var1) {
      return this.field33414 != -1 ? this.field33414 : var1;
   }

   public int method25812() {
      return this.field33413.size();
   }

   public int method25813() {
      return this.field33416;
   }

   public boolean method25814() {
      return this.field33417;
   }

   private Class9704 method25815(int var1) {
      return this.field33413.get(var1);
   }

   public int method25816(int var1) {
      Class9704 var4 = this.method25815(var1);
      return !var4.method38019() ? var4.method38020() : this.field33416;
   }

   public int method25817(int var1) {
      return this.field33413.get(var1).method38021();
   }

   public Set<Integer> method25818() {
      HashSet var3 = Sets.newHashSet();

      for (Class9704 var5 : this.field33413) {
         var3.add(var5.method38021());
      }

      return var3;
   }
}
