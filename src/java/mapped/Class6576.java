package mapped;

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

public class Class6576 {
   private final Class2353<Dynamic<?>> field28946 = new Class2353<Dynamic<?>>(32);
   private final List<Dynamic<?>> field28947;
   private final Dynamic<?> field28948;
   private final boolean field28949;
   private final Int2ObjectMap<IntList> field28950 = new Int2ObjectLinkedOpenHashMap();
   private final IntList field28951 = new IntArrayList();
   public final int field28952;
   private final Set<Dynamic<?>> field28953 = Sets.newIdentityHashSet();
   private final int[] field28954 = new int[4096];

   public Class6576(Dynamic<?> var1) {
      this.field28947 = Lists.newArrayList();
      this.field28948 = var1;
      this.field28952 = var1.get("Y").asInt(0);
      this.field28949 = var1.get("Blocks").result().isPresent();
   }

   public Dynamic<?> method19906(int var1) {
      if (var1 >= 0 && var1 <= 4095) {
         Dynamic var4 = this.field28946.method9172(this.field28954[var1]);
         return var4 != null ? var4 : Class8782.method31680();
      } else {
         return Class8782.method31680();
      }
   }

   public void method19907(int var1, Dynamic<?> var2) {
      if (this.field28953.add(var2)) {
         this.field28947.add(!"%%FILTER_ME%%".equals(Class8782.method31668(var2)) ? var2 : Class8782.method31680());
      }

      this.field28954[var1] = Class8782.method31670(this.field28946, var2);
   }

   public int method19908(int var1) {
      if (this.field28949) {
         ByteBuffer var4 = (ByteBuffer)this.field28948.get("Blocks").asByteBufferOpt().result().get();
         Class8714 var5 = this.field28948
            .get("Data")
            .asByteBufferOpt()
            .map(var0 -> new Class8714(DataFixUtils.toArray(var0)))
            .result()
            .orElseGet(Class8714::new);
         Class8714 var6 = this.field28948
            .get("Add")
            .asByteBufferOpt()
            .map(var0 -> new Class8714(DataFixUtils.toArray(var0)))
            .result()
            .orElseGet(Class8714::new);
         this.field28953.add(Class8782.method31680());
         Class8782.method31670(this.field28946, Class8782.method31680());
         this.field28947.add(Class8782.method31680());

         for (int var7 = 0; var7 < 4096; var7++) {
            int var8 = var7 & 15;
            int var9 = var7 >> 8 & 15;
            int var10 = var7 >> 4 & 15;
            int var11 = var6.method31430(var8, var9, var10) << 12 | (var4.get(var7) & 255) << 4 | var5.method31430(var8, var9, var10);
            if (Class8782.method31681().get(var11 >> 4)) {
               this.method19909(var11 >> 4, var7);
            }

            if (Class8782.method31682().get(var11 >> 4)) {
               int var12 = Class8782.method31672(var8 == 0, var8 == 15, var10 == 0, var10 == 15);
               if (var12 != 0) {
                  var1 |= var12;
               } else {
                  this.field28951.add(var7);
               }
            }

            this.method19907(var7, Class9398.method35692(var11));
         }

         return var1;
      } else {
         return var1;
      }
   }

   private void method19909(int var1, int var2) {
      IntList var5 = this.field28950.get(var1);
      if (var5 == null) {
         var5 = new IntArrayList();
         this.field28950.put(var1, var5);
      }

      var5.add(var2);
   }

   public Dynamic<?> method19910() {
      Dynamic var3 = this.field28948;
      if (!this.field28949) {
         return var3;
      } else {
         var3 = var3.set("Palette", var3.createList(this.field28947.stream()));
         int var4 = Math.max(4, DataFixUtils.ceillog2(this.field28953.size()));
         Class8321 var5 = new Class8321(var4, 4096);

         for (int var6 = 0; var6 < this.field28954.length; var6++) {
            var5.method29138(var6, this.field28954[var6]);
         }

         var3 = var3.set("BlockStates", var3.createLongList(Arrays.stream(var5.method29140())));
         var3 = var3.remove("Blocks");
         var3 = var3.remove("Data");
         return var3.remove("Add");
      }
   }

   // $VF: synthetic method
   public static Int2ObjectMap<IntList> method19913(Class6576 var0) {
      return var0.field28950;
   }

   // $VF: synthetic method
   public static IntList method19914(Class6576 var0) {
      return var0.field28951;
   }
}
