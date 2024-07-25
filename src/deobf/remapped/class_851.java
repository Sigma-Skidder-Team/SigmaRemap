package remapped;

import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
import java.util.Random;

public class class_851 implements class_1167<class_8823> {
   private static String[] field_4438;
   private final Long2IntLinkedOpenHashMap field_4435;
   private final int field_4434;
   private final class_5652 field_4439;
   private final long field_4436;
   private long field_4437;

   public class_851(int var1, long var2, long var4) {
      this.field_4436 = method_3704(var2, var4);
      this.field_4439 = new class_5652(new Random(var2));
      this.field_4435 = new Long2IntLinkedOpenHashMap(16, 0.25F);
      this.field_4435.defaultReturnValue(Integer.MIN_VALUE);
      this.field_4434 = var1;
   }

   public class_8823 method_3701(class_6604 var1) {
      return new class_8823(this.field_4435, this.field_4434, var1);
   }

   public class_8823 method_3702(class_6604 var1, class_8823 var2) {
      return new class_8823(this.field_4435, Math.min(1024, var2.method_40522() * 4), var1);
   }

   public class_8823 method_3703(class_6604 var1, class_8823 var2, class_8823 var3) {
      return new class_8823(this.field_4435, Math.min(1024, Math.max(var2.method_40522(), var3.method_40522()) * 4), var1);
   }

   @Override
   public void method_5189(long var1, long var3) {
      long var7 = this.field_4436;
      var7 = class_2747.method_12379(var7, var1);
      var7 = class_2747.method_12379(var7, var3);
      var7 = class_2747.method_12379(var7, var1);
      var7 = class_2747.method_12379(var7, var3);
      this.field_4437 = var7;
   }

   public int 㠠牰ኞ罡ใ堧(int var1) {
      int var4 = (int)Math.floorMod(this.field_4437 >> 24, (long)var1);
      this.field_4437 = class_2747.method_12379(this.field_4437, this.field_4436);
      return var4;
   }

   public class_5652 ꈍ值웎璧䩜骰() {
      return this.field_4439;
   }

   private static long method_3704(long var0, long var2) {
      long var6 = class_2747.method_12379(var2, var2);
      var6 = class_2747.method_12379(var6, var2);
      var6 = class_2747.method_12379(var6, var2);
      long var8 = class_2747.method_12379(var0, var6);
      var8 = class_2747.method_12379(var8, var6);
      return class_2747.method_12379(var8, var6);
   }
}
