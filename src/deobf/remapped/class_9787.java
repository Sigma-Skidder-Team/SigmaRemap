package remapped;

import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class class_9787 extends class_6414 implements class_2593 {
   private static String[] field_49668;
   public static final class_6720 field_49671 = class_6169.field_31564;
   public static final class_6720 field_49667 = class_6169.field_31567;
   public static final class_6720 field_49670 = class_6169.field_31569;
   public static final class_6720 field_49664 = class_6169.field_31566;
   public static final class_6720 field_49673 = class_6023.field_30719;
   public static final Map<class_240, class_6720> field_49665 = class_6169.field_31571
      .entrySet()
      .stream()
      .filter(var0 -> var0.getKey().method_1029().method_42629())
      .collect(Util.<class_240, class_6720>toMap());
   public final class_4190[] field_49672;
   public final class_4190[] field_49666;
   private final Object2IntMap<class_2522> field_49669 = new Object2IntOpenHashMap();

   public class_9787(float var1, float var2, float var3, float var4, float var5, class_3073 var6) {
      super(var6);
      this.field_49672 = this.method_45185(var1, var2, var5, 0.0F, var5);
      this.field_49666 = this.method_45185(var1, var2, var3, 0.0F, var4);
      UnmodifiableIterator var9 = this.field_32751.method_36441().iterator();

      while (var9.hasNext()) {
         class_2522 var10 = (class_2522)var9.next();
         this.method_45184(var10);
      }
   }

   public class_4190[] method_45185(float var1, float var2, float var3, float var4, float var5) {
      float var8 = 8.0F - var1;
      float var9 = 8.0F + var1;
      float var10 = 8.0F - var2;
      float var11 = 8.0F + var2;
      class_4190 var12 = class_6414.method_29292((double)var8, 0.0, (double)var8, (double)var9, (double)var3, (double)var9);
      class_4190 var13 = class_6414.method_29292((double)var10, (double)var4, 0.0, (double)var11, (double)var5, (double)var11);
      class_4190 var14 = class_6414.method_29292((double)var10, (double)var4, (double)var10, (double)var11, (double)var5, 16.0);
      class_4190 var15 = class_6414.method_29292(0.0, (double)var4, (double)var10, (double)var11, (double)var5, (double)var11);
      class_4190 var16 = class_6414.method_29292((double)var10, (double)var4, (double)var10, 16.0, (double)var5, (double)var11);
      class_4190 var17 = class_3370.method_15530(var13, var16);
      class_4190 var18 = class_3370.method_15530(var14, var15);
      class_4190[] var19 = new class_4190[]{
         class_3370.method_15536(),
         var14,
         var15,
         var18,
         var13,
         class_3370.method_15530(var14, var13),
         class_3370.method_15530(var15, var13),
         class_3370.method_15530(var18, var13),
         var16,
         class_3370.method_15530(var14, var16),
         class_3370.method_15530(var15, var16),
         class_3370.method_15530(var18, var16),
         var17,
         class_3370.method_15530(var14, var17),
         class_3370.method_15530(var15, var17),
         class_3370.method_15530(var18, var17)
      };

      for (int var20 = 0; var20 < 16; var20++) {
         var19[var20] = class_3370.method_15530(var12, var19[var20]);
      }

      return var19;
   }

   @Override
   public boolean method_29275(class_2522 var1, class_6163 var2, class_1331 var3) {
      return !var1.<Boolean>method_10313(field_49673);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return this.field_49666[this.method_45184(var1)];
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return this.field_49672[this.method_45184(var1)];
   }

   private static int method_45183(class_240 var0) {
      return 1 << var0.method_1031();
   }

   public int method_45184(class_2522 var1) {
      return this.field_49669.computeIntIfAbsent(var1, var0 -> {
         int var3 = 0;
         if (var0.<Boolean>method_10313(field_49671)) {
            var3 |= method_45183(class_240.field_818);
         }

         if (var0.<Boolean>method_10313(field_49667)) {
            var3 |= method_45183(class_240.field_804);
         }

         if (var0.<Boolean>method_10313(field_49670)) {
            var3 |= method_45183(class_240.field_800);
         }

         if (var0.<Boolean>method_10313(field_49664)) {
            var3 |= method_45183(class_240.field_809);
         }

         return var3;
      });
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_49673) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      switch (var2) {
         case field_34338:
            return var1.method_10308(field_49671, var1.<Boolean>method_10313(field_49670))
               .method_10308(field_49667, var1.<Boolean>method_10313(field_49664))
               .method_10308(field_49670, var1.<Boolean>method_10313(field_49671))
               .method_10308(field_49664, var1.<Boolean>method_10313(field_49667));
         case field_34335:
            return var1.method_10308(field_49671, var1.<Boolean>method_10313(field_49667))
               .method_10308(field_49667, var1.<Boolean>method_10313(field_49670))
               .method_10308(field_49670, var1.<Boolean>method_10313(field_49664))
               .method_10308(field_49664, var1.<Boolean>method_10313(field_49671));
         case field_34334:
            return var1.method_10308(field_49671, var1.<Boolean>method_10313(field_49664))
               .method_10308(field_49667, var1.<Boolean>method_10313(field_49671))
               .method_10308(field_49670, var1.<Boolean>method_10313(field_49667))
               .method_10308(field_49664, var1.<Boolean>method_10313(field_49670));
         default:
            return var1;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      switch (var2) {
         case field_46148:
            return var1.method_10308(field_49671, var1.<Boolean>method_10313(field_49670)).method_10308(field_49670, var1.<Boolean>method_10313(field_49671));
         case field_46144:
            return var1.method_10308(field_49667, var1.<Boolean>method_10313(field_49664)).method_10308(field_49664, var1.<Boolean>method_10313(field_49667));
         default:
            return super.method_10773(var1, var2);
      }
   }
}
