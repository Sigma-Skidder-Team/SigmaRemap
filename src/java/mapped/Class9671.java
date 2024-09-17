package mapped;

// $VF: synthetic class
public class Class9671 {
   private static String[] field45161;
   public static final int[] field45162;
   public static final int[] field45163 = new int[Direction.values().length];

   static {
      try {
         field45163[Direction.X.ordinal()] = 1;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field45163[Direction.Y.ordinal()] = 2;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field45163[Direction.Z.ordinal()] = 3;
      } catch (NoSuchFieldError var7) {
      }

      field45162 = new int[Class2126.values().length];

      try {
         field45162[Class2126.field13872.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field45162[Class2126.field13873.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field45162[Class2126.field13875.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field45162[Class2126.field13874.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
