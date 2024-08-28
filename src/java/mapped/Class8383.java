package mapped;

public class Class8383 {
   private static String[] field35955;
   private static final Class33[] field35956 = new Class33[256];

   // $VF: synthetic method
   public static Class33[] method29376() {
      return field35956;
   }

   static {
      for (int var2 = 0; var2 < field35956.length; var2++) {
         field35956[var2] = new Class33((byte)(var2 - 128), null);
      }
   }
}
