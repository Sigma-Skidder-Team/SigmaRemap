package mapped;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class Class7136 {
   private static String[] field30686;
   private static final int[] field30687 = new int[0];
   private final ViaVersion7 field30688;
   private final Class7981 field30689;
   private final List<Class8771> field30690 = new ArrayList<Class8771>();
   private final List<Class8771> field30691 = new ArrayList<Class8771>();
   private final List<Class8771> field30692 = new ArrayList<Class8771>();

   public Class7136(ViaVersion7 var1, Class7981 var2) {
      this.field30688 = var1;
      this.field30689 = var2;
   }

   public void method22251(Class2165 var1, String var2) {
      this.method22256(var1).add(new Class8771(var2, field30687, null));
   }

   public void method22252(Class2165 var1, String... var2) {
      List var5 = this.method22256(var1);

      for (String var9 : var2) {
         var5.add(new Class8771(var9, field30687, null));
      }
   }

   public void method22253(Class2165 var1, String var2, int... var3) {
      List var6 = this.method22256(var1);
      Class7981 var7 = this.method22257(var1);

      for (int var8 = 0; var8 < var3.length; var8++) {
         int var9 = var3[var8];
         var3[var8] = var7.method27124(var9);
      }

      var6.add(new Class8771(var2, var3, null));
   }

   public void method22254(Class1913 var1) {
      this.field30688.method19360(var1, new Class4046(this));
   }

   private void method22255(Class8563 var1, Class7981 var2, List<Class8771> var3) throws Exception {
      int var6 = var1.<Integer>method30559(Class4750.field22544);
      var1.method30560(Class4750.field22544, var3 == null ? var6 : var6 + var3.size());

      for (int var7 = 0; var7 < var6; var7++) {
         var1.<String>method30561(Class4750.field22539);
         int[] var8 = var1.<int[]>method30559(Class4750.field22546);
         if (var2 == null) {
            var1.method30560(Class4750.field22546, var8);
         } else {
            IntArrayList var9 = new IntArrayList(var8.length);

            for (int var13 : var8) {
               int var14 = var2.method27124(var13);
               if (var14 != -1) {
                  var9.add(var14);
               }
            }

            var1.method30560(Class4750.field22546, var9.toArray(field30687));
         }
      }

      if (var3 != null && !var3.isEmpty()) {
         for (Class8771 var16 : var3) {
            var1.method30560(Class4750.field22539, Class8771.method31639(var16));
            var1.method30560(Class4750.field22546, Class8771.method31640(var16));
         }
      }
   }

   private List<Class8771> method22256(Class2165 var1) {
      switch (Class7572.field32512[var1.ordinal()]) {
         case 1:
            return this.field30690;
         case 2:
            return this.field30691;
         case 3:
            return this.field30692;
         case 4:
         default:
            return null;
      }
   }

   @Nullable
   private Class7981 method22257(Class2165 var1) {
      switch (Class7572.field32512[var1.ordinal()]) {
         case 1:
            return this.field30688.method19376().method18535() != null ? var1x -> this.field30688.method19376().method18529(var1x) : null;
         case 2:
            return this.field30688.method19376().method18533() != null ? var1x -> this.field30688.method19376().method18530(var1x) : null;
         case 3:
            return this.field30689;
         case 4:
         default:
            return null;
      }
   }

   // $VF: synthetic method
   public static ViaVersion7 method22260(Class7136 var0) {
      return var0.field30688;
   }

   // $VF: synthetic method
   public static List method22261(Class7136 var0) {
      return var0.field30690;
   }

   // $VF: synthetic method
   public static void method22262(Class7136 var0, Class8563 var1, Class7981 var2, List var3) throws Exception {
      var0.method22255(var1, var2, var3);
   }

   // $VF: synthetic method
   public static List method22263(Class7136 var0) {
      return var0.field30691;
   }

   // $VF: synthetic method
   public static Class7981 method22264(Class7136 var0) {
      return var0.field30689;
   }

   // $VF: synthetic method
   public static List method22265(Class7136 var0) {
      return var0.field30692;
   }
}
