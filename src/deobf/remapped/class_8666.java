package remapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public abstract class class_8666<M extends class_8666<M>> {
   private final long[] field_44354 = new long[2];
   private final class_1201[] field_44355 = new class_1201[2];
   private boolean field_44352;
   public final Long2ObjectOpenHashMap<class_1201> field_44353;

   public class_8666(Long2ObjectOpenHashMap<class_1201> var1) {
      this.field_44353 = var1;
      this.method_39725();
      this.field_44352 = true;
   }

   public abstract M method_39727();

   public void method_39729(long var1) {
      this.field_44353.put(var1, ((class_1201)this.field_44353.get(var1)).method_5316());
      this.method_39725();
   }

   public boolean method_39731(long var1) {
      return this.field_44353.containsKey(var1);
   }

   @Nullable
   public class_1201 method_39730(long var1) {
      if (this.field_44352) {
         for (int var5 = 0; var5 < 2; var5++) {
            if (var1 == this.field_44354[var5]) {
               return this.field_44355[var5];
            }
         }
      }

      class_1201 var7 = (class_1201)this.field_44353.get(var1);
      if (var7 == null) {
         return null;
      } else {
         if (this.field_44352) {
            for (int var6 = 1; var6 > 0; var6--) {
               this.field_44354[var6] = this.field_44354[var6 - 1];
               this.field_44355[var6] = this.field_44355[var6 - 1];
            }

            this.field_44354[0] = var1;
            this.field_44355[0] = var7;
         }

         return var7;
      }
   }

   @Nullable
   public class_1201 method_39728(long var1) {
      return (class_1201)this.field_44353.remove(var1);
   }

   public void method_39732(long var1, class_1201 var3) {
      this.field_44353.put(var1, var3);
   }

   public void method_39725() {
      for (int var3 = 0; var3 < 2; var3++) {
         this.field_44354[var3] = Long.MAX_VALUE;
         this.field_44355[var3] = null;
      }
   }

   public void method_39724() {
      this.field_44352 = false;
   }
}
