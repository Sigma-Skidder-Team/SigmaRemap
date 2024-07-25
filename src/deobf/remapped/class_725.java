package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class class_725 {
   private final class_6834<Dynamic<?>> field_3933 = new class_6834<Dynamic<?>>(32);
   private final List<Dynamic<?>> field_3934;
   private final Dynamic<?> field_3936;
   private final boolean field_3942;
   private final Int2ObjectMap<IntList> field_3937 = new Int2ObjectLinkedOpenHashMap();
   private final IntList field_3939 = new IntArrayList();
   public final int field_3935;
   private final Set<Dynamic<?>> field_3938 = Sets.newIdentityHashSet();
   private final int[] field_3941 = new int[4096];

   public class_725(Dynamic<?> var1) {
      this.field_3934 = Lists.newArrayList();
      this.field_3936 = var1;
      this.field_3935 = var1.get("Y").asInt(0);
      this.field_3942 = var1.get("Blocks").result().isPresent();
   }

   public Dynamic<?> method_3289(int var1) {
      if (var1 >= 0 && var1 <= 4095) {
         Dynamic var4 = this.field_3933.method_14040(this.field_3941[var1]);
         return var4 != null ? var4 : class_5878.method_26782();
      } else {
         return class_5878.method_26782();
      }
   }

   public void method_3290(int var1, Dynamic<?> var2) {
      if (this.field_3938.add(var2)) {
         this.field_3934.add(!"%%FILTER_ME%%".equals(class_5878.method_26796(var2)) ? var2 : class_5878.method_26782());
      }

      this.field_3941[var1] = class_5878.method_26787(this.field_3933, var2);
   }

   public int method_3286(int var1) {
      if (this.field_3942) {
         ByteBuffer var4 = (ByteBuffer)this.field_3936.get("Blocks").asByteBufferOpt().result().get();
         class_5643 var5 = this.field_3936
            .get("Data")
            .asByteBufferOpt()
            .map(var0 -> new class_5643(DataFixUtils.toArray(var0)))
            .result()
            .orElseGet(class_5643::new);
         class_5643 var6 = this.field_3936
            .get("Add")
            .asByteBufferOpt()
            .map(var0 -> new class_5643(DataFixUtils.toArray(var0)))
            .result()
            .orElseGet(class_5643::new);
         this.field_3938.add(class_5878.method_26782());
         class_5878.method_26787(this.field_3933, class_5878.method_26782());
         this.field_3934.add(class_5878.method_26782());

         for (int var7 = 0; var7 < 4096; var7++) {
            int var8 = var7 & 15;
            int var9 = var7 >> 8 & 15;
            int var10 = var7 >> 4 & 15;
            int var11 = var6.method_25546(var8, var9, var10) << 12 | (var4.get(var7) & 255) << 4 | var5.method_25546(var8, var9, var10);
            if (class_5878.method_26798().get(var11 >> 4)) {
               this.method_3288(var11 >> 4, var7);
            }

            if (class_5878.method_26784().get(var11 >> 4)) {
               int var12 = class_5878.method_26795(var8 == 0, var8 == 15, var10 == 0, var10 == 15);
               if (var12 != 0) {
                  var1 |= var12;
               } else {
                  this.field_3939.add(var7);
               }
            }

            this.method_3290(var7, class_8237.method_37732(var11));
         }

         return var1;
      } else {
         return var1;
      }
   }

   private void method_3288(int var1, int var2) {
      Object var5 = (IntList)this.field_3937.get(var1);
      if (var5 == null) {
         var5 = new IntArrayList();
         this.field_3937.put(var1, var5);
      }

      var5.add(var2);
   }

   public Dynamic<?> method_3287() {
      Dynamic var3 = this.field_3936;
      if (!this.field_3942) {
         return var3;
      } else {
         var3 = var3.set("Palette", var3.createList(this.field_3934.stream()));
         int var4 = Math.max(4, DataFixUtils.ceillog2(this.field_3938.size()));
         class_4236 var5 = new class_4236(var4, 4096);

         for (int var6 = 0; var6 < this.field_3941.length; var6++) {
            var5.method_19760(var6, this.field_3941[var6]);
         }

         var3 = var3.set("BlockStates", var3.createLongList(Arrays.stream(var5.method_19756())));
         var3 = var3.remove("Blocks");
         var3 = var3.remove("Data");
         return var3.remove("Add");
      }
   }
}
