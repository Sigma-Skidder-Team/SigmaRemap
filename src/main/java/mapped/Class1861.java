package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Class1861 implements Class1860 {
   field9941(1, Class1866.field10170),
   field9942(2, Class1866.field10058),
   field9943(3, Class1866.field10051),
   field9944(10, Class1866.field10165),
   field9945(50, Class1866.field10060),
   field9946(51, Class1866.field10052),
   field9947(60, Class1866.field10147),
   field9948(61, Class1866.field10156),
   field9949(62, Class1866.field10158),
   field9950(63, Class1866.field10152),
   field9951(64, Class1866.field10153),
   field9952(65, Class1866.field10157),
   field9953(66, Class1866.field10154),
   field9954(67, Class1866.field10061),
   field9955(68, Class1866.field10059),
   field9956(70, Class1866.field10056),
   field9957(71, Class1866.field10142),
   field9958(72, Class1866.field10055),
   field9959(73, Class1866.field10159),
   field9960(75, Class1866.field10160),
   field9961(76, Class1866.field10057),
   field9962(77, Class1866.field10141),
   field9963(78, Class1866.field10064),
   field9964(79, Class1866.field10053),
   field9965(90, Class1866.field10062),
   field9966(91, Class1866.field10148),
   field9967(93, Class1866.field10151),
   field9968(94, Class1866.field10149);

   private static final Map<Integer, Class1861> field9969 = new HashMap<Integer, Class1861>();
   private final int field9970;
   private final Class1866 field9971;
   private static final Class1861[] field9972 = new Class1861[]{
      field9941,
      field9942,
      field9943,
      field9944,
      field9945,
      field9946,
      field9947,
      field9948,
      field9949,
      field9950,
      field9951,
      field9952,
      field9953,
      field9954,
      field9955,
      field9956,
      field9957,
      field9958,
      field9959,
      field9960,
      field9961,
      field9962,
      field9963,
      field9964,
      field9965,
      field9966,
      field9967,
      field9968
   };

   private Class1861(int var3, Class1866 var4) {
      this.field9970 = var3;
      this.field9971 = var4;
   }

   @Override
   public int method8109() {
      return this.field9970;
   }

   public Class1866 method8113() {
      return this.field9971;
   }

   public static Optional<Class1861> method8114(int var0) {
      return var0 != -1 ? Optional.<Class1861>ofNullable(field9969.get(var0)) : Optional.<Class1861>empty();
   }

   public static Optional<Class1866> method8115(int var0) {
      Optional var3 = method8114(var0);
      return var3.isPresent() ? Optional.<Class1866>of(((Class1861)var3.get()).field9971) : Optional.<Class1866>empty();
   }

   public static Optional<Class1861> method8116(Class1866 var0) {
      for (Class1861 var6 : values()) {
         if (var6.field9971 == var0) {
            return Optional.<Class1861>of(var6);
         }
      }

      return Optional.<Class1861>empty();
   }

   static {
      for (Class1861 var9 : values()) {
         field9969.put(var9.field9970, var9);
      }
   }
}
