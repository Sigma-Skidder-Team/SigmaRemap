package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Class1863 implements Class1860 {
   field10002(1, Class1868.field10208),
   field10003(2, Class1868.field10177),
   field10004(3, Class1868.field10265),
   field10005(10, Class1868.field10209),
   field10006(50, Class1868.field10190),
   field10007(51, Class1868.field10262),
   field10008(60, Class1868.field10181),
   field10009(61, Class1868.field10182),
   field10010(62, Class1868.field10266),
   field10011(63, Class1868.field10183),
   field10012(64, Class1868.field10184),
   field10013(65, Class1868.field10185),
   field10014(66, Class1868.field10189),
   field10015(67, Class1868.field10194),
   field10016(68, Class1868.field10272),
   field10017(70, Class1868.field10191),
   field10018(71, Class1868.field10188),
   field10019(72, Class1868.field10186),
   field10020(73, Class1868.field10263),
   field10021(75, Class1868.field10187),
   field10022(76, Class1868.field10192),
   field10023(77, Class1868.field10179),
   field10024(78, Class1868.field10202),
   field10025(79, Class1868.field10196),
   field10026(90, Class1868.field10267),
   field10027(91, Class1868.field10193),
   field10028(93, Class1868.field10195);

   private static final Map<Integer, Class1863> field10029 = new HashMap<Integer, Class1863>();
   private final int field10030;
   private final Class1868 field10031;
   private static final Class1863[] field10032 = new Class1863[]{
      field10002,
      field10003,
      field10004,
      field10005,
      field10006,
      field10007,
      field10008,
      field10009,
      field10010,
      field10011,
      field10012,
      field10013,
      field10014,
      field10015,
      field10016,
      field10017,
      field10018,
      field10019,
      field10020,
      field10021,
      field10022,
      field10023,
      field10024,
      field10025,
      field10026,
      field10027,
      field10028
   };

   private Class1863(int var3, Class1868 var4) {
      this.field10030 = var3;
      this.field10031 = var4;
   }

   @Override
   public int method8109() {
      return this.field10030;
   }

   public Class1868 method8113() {
      return this.field10031;
   }

   public static Optional<Class1863> method8119(int var0) {
      return var0 != -1 ? Optional.<Class1863>ofNullable(field10029.get(var0)) : Optional.<Class1863>empty();
   }

   public static Optional<Class1868> method8120(int var0) {
      Optional var3 = method8119(var0);
      return var3.isPresent() ? Optional.<Class1868>of(((Class1863)var3.get()).field10031) : Optional.<Class1868>empty();
   }

   static {
      for (Class1863 var9 : values()) {
         field10029.put(var9.field10030, var9);
      }
   }
}
