package remapped;

import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;

public interface class_5990 extends class_6163, class_3287 {
   @Nullable
   class_2522 method_27348(class_1331 var1, class_2522 var2, boolean var3);

   void method_27346(class_1331 var1, class_3757 var2);

   void method_27342(Entity var1);

   @Nullable
   default class_1315 method_27338() {
      class_1315[] var3 = this.method_27349();

      for (int var4 = var3.length - 1; var4 >= 0; var4--) {
         class_1315 var5 = var3[var4];
         if (!class_1315.method_6003(var5)) {
            return var5;
         }
      }

      return null;
   }

   default int method_27350() {
      class_1315 var3 = this.method_27338();
      return var3 != null ? var3.method_5997() : 0;
   }

   Set<class_1331> method_27366();

   class_1315[] method_27349();

   Collection<Entry<class_3801, class_2131>> method_27354();

   void method_27357(class_3801 var1, long[] var2);

   class_2131 method_27353(class_3801 var1);

   int method_27367(class_3801 var1, int var2, int var3);

   class_2034 method_27352();

   void method_27344(long var1);

   Map<class_5390<?>, class_3200<?>> method_27363();

   void method_27351(Map<class_5390<?>, class_3200<?>> var1);

   default boolean method_27368(int var1, int var2) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 >= 256) {
         var2 = 255;
      }

      for (int var5 = var1; var5 <= var2; var5 += 16) {
         if (!class_1315.method_6003(this.method_27349()[var5 >> 4])) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   class_546 method_27356();

   void method_27361(boolean var1);

   boolean method_27358();

   class_7335 method_27364();

   void method_27370(class_1331 var1);

   default void method_27365(class_1331 var1) {
      LogManager.getLogger().warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", var1);
   }

   ShortList[] method_27359();

   default void method_27341(short var1, int var2) {
      method_27337(this.method_27359(), var2).add(var1);
   }

   default void method_27347(CompoundNBT var1) {
      LogManager.getLogger().warn("Trying to set a BlockEntity, but this operation is not supported.");
   }

   @Nullable
   CompoundNBT method_27355(class_1331 var1);

   @Nullable
   CompoundNBT method_27345(class_1331 var1);

   Stream<class_1331> method_27360();

   class_3065<class_6414> method_27335();

   class_3065<class_2340> method_27336();

   class_6397 method_27343();

   void method_27369(long var1);

   long method_27340();

   static ShortList method_27337(ShortList[] var0, int var1) {
      if (var0[var1] == null) {
         var0[var1] = new ShortArrayList();
      }

      return var0[var1];
   }

   boolean method_27339();

   void method_27362(boolean var1);
}
