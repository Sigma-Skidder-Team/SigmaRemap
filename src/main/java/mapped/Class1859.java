package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Class1859 implements Class1860 {
   field9910(1, Class1871.field10584),
   field9911(2, Class1871.field10551),
   field9912(3, Class1871.field10642),
   field9913(10, Class1871.field10585),
   field9914(50, Class1871.field10564),
   field9915(51, Class1871.field10639),
   field9916(60, Class1871.field10555),
   field9917(61, Class1871.field10556),
   field9918(62, Class1871.field10643),
   field9919(63, Class1871.field10557),
   field9920(64, Class1871.field10558),
   field9921(65, Class1871.field10559),
   field9922(66, Class1871.field10563),
   field9923(67, Class1871.field10568),
   field9924(68, Class1871.field10649),
   field9925(70, Class1871.field10565),
   field9926(71, Class1871.field10562),
   field9927(72, Class1871.field10560),
   field9928(73, Class1871.field10640),
   field9929(75, Class1871.field10561),
   field9930(76, Class1871.field10566),
   field9931(77, Class1871.field10553),
   field9932(78, Class1871.field10576),
   field9933(79, Class1871.field10570),
   field9934(90, Class1871.field10644),
   field9935(91, Class1871.field10567),
   field9936(93, Class1871.field10569);

   private static final Map<Integer, Class1859> field9937 = new HashMap<Integer, Class1859>();
   private final int field9938;
   private final Class1871 field9939;
   private static final Class1859[] field9940 = new Class1859[]{
      field9910,
      field9911,
      field9912,
      field9913,
      field9914,
      field9915,
      field9916,
      field9917,
      field9918,
      field9919,
      field9920,
      field9921,
      field9922,
      field9923,
      field9924,
      field9925,
      field9926,
      field9927,
      field9928,
      field9929,
      field9930,
      field9931,
      field9932,
      field9933,
      field9934,
      field9935,
      field9936
   };

   private Class1859(int var3, Class1871 var4) {
      this.field9938 = var3;
      this.field9939 = var4;
   }

   @Override
   public int method8109() {
      return this.field9938;
   }

   public Class1871 method8113() {
      return this.field9939;
   }

   public static Optional<Class1859> method8111(int var0) {
      return var0 != -1 ? Optional.<Class1859>ofNullable(field9937.get(var0)) : Optional.<Class1859>empty();
   }

   public static Optional<Class1871> method8112(int var0) {
      Optional var3 = method8111(var0);
      return var3.isPresent() ? Optional.<Class1871>of(((Class1859)var3.get()).field9939) : Optional.<Class1871>empty();
   }

   static {
      for (Class1859 var9 : values()) {
         field9937.put(var9.field9938, var9);
      }
   }
}
