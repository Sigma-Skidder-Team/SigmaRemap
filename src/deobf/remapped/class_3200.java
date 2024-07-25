package remapped;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class class_3200<C extends class_6157> {
   public static final class_3200<?> field_15991 = new class_287(class_5390.field_27498, 0, 0, class_9616.method_44397(), 0, 0L);
   private final class_5390<C> field_15985;
   public final List<class_7060> field_15986 = Lists.newArrayList();
   public class_9616 field_15988;
   private final int field_15992;
   private final int field_15987;
   private int field_15990;
   public final class_8679 field_15989;

   public class_3200(class_5390<C> var1, int var2, int var3, class_9616 var4, int var5, long var6) {
      this.field_15985 = var1;
      this.field_15992 = var2;
      this.field_15987 = var3;
      this.field_15990 = var5;
      this.field_15989 = new class_8679();
      this.field_15989.method_39861(var6, var2, var3);
      this.field_15988 = var4;
   }

   public abstract void method_14733(class_6322 var1, class_6541 var2, class_5799 var3, int var4, int var5, class_6325 var6, C var7);

   public class_9616 method_14724() {
      return this.field_15988;
   }

   public List<class_7060> method_14736() {
      return this.field_15986;
   }

   public void method_14719(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6) {
      synchronized (this.field_15986) {
         if (!this.field_15986.isEmpty()) {
            class_9616 var10 = this.field_15986.get(0).field_36435;
            Vector3i var11 = var10.method_44396();
            BlockPos var12 = new BlockPos(var11.getX(), var10.field_48995, var11.method_12185());
            Iterator var13 = this.field_15986.iterator();

            while (var13.hasNext()) {
               class_7060 var14 = (class_7060)var13.next();
               if (var14.method_32512().method_44402(var5) && !var14.method_32501(var1, var2, var3, var4, var5, var6, var12)) {
                  var13.remove();
               }
            }

            this.method_14720();
         }
      }
   }

   public void method_14720() {
      this.field_15988 = class_9616.method_44397();

      for (class_7060 var4 : this.field_15986) {
         this.field_15988.method_44392(var4.method_32512());
      }
   }

   public CompoundNBT method_14734(int var1, int var2) {
      CompoundNBT var5 = new CompoundNBT();
      if (this.method_14731()) {
         var5.method_25941("id", class_8669.field_44457.method_39797(this.method_14727()).toString());
         var5.putInt("ChunkX", var1);
         var5.putInt("ChunkZ", var2);
         var5.putInt("references", this.field_15990);
         var5.put("BB", this.field_15988.method_44388());
         class_3416 var6 = new class_3416();
         synchronized (this.field_15986) {
            for (class_7060 var9 : this.field_15986) {
               var6.add(var9.method_32520());
            }
         }

         var5.put("Children", var6);
         return var5;
      } else {
         var5.method_25941("id", "INVALID");
         return var5;
      }
   }

   public void method_14723(int var1, Random var2, int var3) {
      int var6 = var1 - var3;
      int var7 = this.field_15988.method_44398() + 1;
      if (var7 < var6) {
         var7 += var2.nextInt(var6 - var7);
      }

      int var8 = var7 - this.field_15988.field_48993;
      this.field_15988.method_44391(0, var8, 0);

      for (class_7060 var10 : this.field_15986) {
         var10.method_32508(0, var8, 0);
      }
   }

   public void method_14735(Random var1, int var2, int var3) {
      int var6 = var3 - var2 + 1 - this.field_15988.method_44398();
      int var7;
      if (var6 <= 1) {
         var7 = var2;
      } else {
         var7 = var2 + var1.nextInt(var6);
      }

      int var8 = var7 - this.field_15988.field_48995;
      this.field_15988.method_44391(0, var8, 0);

      for (class_7060 var10 : this.field_15986) {
         var10.method_32508(0, var8, 0);
      }
   }

   public boolean method_14731() {
      return !this.field_15986.isEmpty();
   }

   public int method_14722() {
      return this.field_15992;
   }

   public int method_14726() {
      return this.field_15987;
   }

   public BlockPos method_14730() {
      return new BlockPos(this.field_15992 << 4, 0, this.field_15987 << 4);
   }

   public boolean method_14725() {
      return this.field_15990 < this.method_14729();
   }

   public void method_14721() {
      this.field_15990++;
   }

   public int method_14732() {
      return this.field_15990;
   }

   public int method_14729() {
      return 1;
   }

   public class_5390<?> method_14727() {
      return this.field_15985;
   }
}
