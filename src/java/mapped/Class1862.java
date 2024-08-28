package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Class1862 implements Class1860 {
   field9973(1, Class1872.field10684),
   field9974(2, Class1872.field10656),
   field9975(3, Class1872.field10728),
   field9976(10, Class1872.field10685),
   field9977(50, Class1872.field10669),
   field9978(51, Class1872.field10725),
   field9979(60, Class1872.field10672),
   field9980(61, Class1872.field10661),
   field9981(62, Class1872.field10729),
   field9982(63, Class1872.field10662),
   field9983(64, Class1872.field10663),
   field9984(65, Class1872.field10664),
   field9985(66, Class1872.field10668),
   field9986(67, Class1872.field10674),
   field9987(70, Class1872.field10670),
   field9988(71, Class1872.field10667),
   field9989(72, Class1872.field10665),
   field9990(73, Class1872.field10726),
   field9991(75, Class1872.field10666),
   field9992(76, Class1872.field10671),
   field9993(77, Class1872.field10658),
   field9994(78, Class1872.field10681),
   field9995(90, Class1872.field10730),
   field9996(91, Class1872.field10673),
   field9997(93, Class1872.field10675);

   private static final Map<Integer, Class1862> field9998 = new HashMap<Integer, Class1862>();
   private final int field9999;
   private final Class1872 field10000;
   private static final Class1862[] field10001 = new Class1862[]{
      field9973,
      field9974,
      field9975,
      field9976,
      field9977,
      field9978,
      field9979,
      field9980,
      field9981,
      field9982,
      field9983,
      field9984,
      field9985,
      field9986,
      field9987,
      field9988,
      field9989,
      field9990,
      field9991,
      field9992,
      field9993,
      field9994,
      field9995,
      field9996,
      field9997
   };

   private Class1862(int var3, Class1872 var4) {
      this.field9999 = var3;
      this.field10000 = var4;
   }

   @Override
   public int method8109() {
      return this.field9999;
   }

   public Class1872 method8113() {
      return this.field10000;
   }

   public static Optional<Class1862> method8117(int var0) {
      return var0 != -1 ? Optional.<Class1862>ofNullable(field9998.get(var0)) : Optional.<Class1862>empty();
   }

   public static Optional<Class1872> method8118(int var0) {
      Optional var3 = method8117(var0);
      return var3.isPresent() ? Optional.<Class1872>of(((Class1862)var3.get()).field10000) : Optional.<Class1872>empty();
   }

   static {
      for (Class1862 var9 : values()) {
         field9998.put(var9.field9999, var9);
      }
   }
}
