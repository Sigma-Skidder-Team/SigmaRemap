package mapped;

import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.annotation.Nullable;

public final class Class8815 {
   private static String[] field39653;
   public final AtomicReferenceArray<Chunk> field39654;
   private final int field39655;
   private final int field39656;
   private volatile int field39657;
   private volatile int field39658;
   private int field39659;
   public final Class1705 field39660;

   public Class8815(Class1705 var1, int var2) {
      this.field39660 = var1;
      this.field39655 = var2;
      this.field39656 = var2 * 2 + 1;
      this.field39654 = new AtomicReferenceArray<Chunk>(this.field39656 * this.field39656);
   }

   public int method31823(int var1, int var2) {
      return Math.floorMod(var2, this.field39656) * this.field39656 + Math.floorMod(var1, this.field39656);
   }

   public void method31824(int var1, Chunk var2) {
      Chunk var5 = this.field39654.getAndSet(var1, var2);
      if (var5 != null) {
         this.field39659--;
         Class1705.method7406(this.field39660).method6840(var5);
      }

      if (var2 != null) {
         this.field39659++;
      }
   }

   public Chunk method31825(int var1, Chunk var2, Chunk var3) {
      if (this.field39654.compareAndSet(var1, var2, var3) && var3 == null) {
         this.field39659--;
      }

      Class1705.method7406(this.field39660).method6840(var2);
      return var2;
   }

   private boolean method31826(int var1, int var2) {
      return Math.abs(var1 - this.field39657) <= this.field39655 && Math.abs(var2 - this.field39658) <= this.field39655;
   }

   @Nullable
   public Chunk method31827(int var1) {
      return this.field39654.get(var1);
   }

   // $VF: synthetic method
   public static boolean method31828(Class8815 var0, int var1, int var2) {
      return var0.method31826(var1, var2);
   }

   // $VF: synthetic method
   public static int method31829(Class8815 var0, int var1) {
      return var0.field39657 = var1;
   }

   // $VF: synthetic method
   public static int method31830(Class8815 var0, int var1) {
      return var0.field39658 = var1;
   }

   // $VF: synthetic method
   public static int method31831(Class8815 var0) {
      return var0.field39655;
   }

   // $VF: synthetic method
   public static int method31832(Class8815 var0) {
      return var0.field39657;
   }

   // $VF: synthetic method
   public static int method31833(Class8815 var0) {
      return var0.field39658;
   }

   // $VF: synthetic method
   public static int method31834(Class8815 var0) {
      return var0.field39659;
   }
}
