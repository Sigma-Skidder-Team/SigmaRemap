package remapped;

import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class class_5781 extends class_5712 {
   private static String[] field_29200;
   private int field_29202;
   private final Long2IntMap field_29199;
   private final LongSet field_29201;

   public class_5781(class_9263 var1, int var2) {
      super(var1, var2);
      this.field_29198 = var1;
      this.field_29199 = Long2IntMaps.synchronize(new Long2IntOpenHashMap());
      this.field_29201 = new LongOpenHashSet();
      this.field_29202 = 0;
      this.field_29199.defaultReturnValue(var2 + 2);
   }

   @Override
   public void method_25798(long var1, int var3, int var4) {
      this.field_29201.add(var1);
   }

   public void method_26155(int var1) {
      ObjectIterator var4 = this.field_28890.long2ByteEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         byte var6 = var5.getByteValue();
         long var7 = var5.getLongKey();
         this.method_26153(var7, var6, this.method_26154(var6), var6 <= var1 - 2);
      }

      this.field_29202 = var1;
   }

   private void method_26153(long var1, int var3, boolean var4, boolean var5) {
      if (var4 != var5) {
         class_2837 var8 = new class_2837<class_2034>(class_5032.field_26029, class_9263.method_42688(), new class_2034(var1));
         if (!var5) {
            class_9263.method_42690(this.field_29198)
               .method_40495(
                  class_6025.method_27485(
                     () -> class_9263.method_42700(this.field_29198).execute(() -> class_9263.method_42691(this.field_29198, var1, var8)), var1, true
                  )
               );
         } else {
            class_9263.method_42705(this.field_29198).method_40495(class_6025.method_27494(() -> class_9263.method_42700(this.field_29198).execute(() -> {
                  if (!this.method_26154(this.method_27698(var1))) {
                     class_9263.method_42690(this.field_29198).method_40495(class_6025.method_27485(() -> {
                     }, var1, false));
                  } else {
                     class_9263.method_42689(this.field_29198, var1, var8);
                     class_9263.method_42706(this.field_29198).add(var1);
                  }
               }), var1, () -> var3));
         }
      }
   }

   @Override
   public void method_25797() {
      super.method_25797();
      if (!this.field_29201.isEmpty()) {
         LongIterator var3 = this.field_29201.iterator();

         while (var3.hasNext()) {
            long var4 = var3.nextLong();
            int var6 = this.field_29199.get(var4);
            int var7 = this.method_27698(var4);
            if (var6 != var7) {
               class_9263.method_42696(this.field_29198).method_21208(new class_2034(var4), () -> this.field_29199.get(var4), var7, var3x -> {
                  if (var3x < this.field_29199.defaultReturnValue()) {
                     this.field_29199.put(var4, var3x);
                  } else {
                     this.field_29199.remove(var4);
                  }
               });
               this.method_26153(var4, var7, this.method_26154(var6), this.method_26154(var7));
            }
         }

         this.field_29201.clear();
      }
   }

   private boolean method_26154(int var1) {
      return var1 <= this.field_29202 - 2;
   }
}
