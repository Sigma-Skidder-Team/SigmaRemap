package mapped;

import net.minecraft.util.ActionResultType;

public class Class6794<T> {
   private static String[] field29595;
   private final ActionResultType field29596;
   private final T field29597;

   public Class6794(ActionResultType var1, T var2) {
      this.field29596 = var1;
      this.field29597 = (T)var2;
   }

   public ActionResultType method20694() {
      return this.field29596;
   }

   public T method20695() {
      return this.field29597;
   }

   public static <T> Class6794<T> method20696(T var0) {
      return new Class6794<T>(ActionResultType.SUCCESS, (T)var0);
   }

   public static <T> Class6794<T> method20697(T var0) {
      return new Class6794<T>(ActionResultType.field14819, (T)var0);
   }

   public static <T> Class6794<T> method20698(T var0) {
      return new Class6794<T>(ActionResultType.field14820, (T)var0);
   }

   public static <T> Class6794<T> method20699(T var0) {
      return new Class6794<T>(ActionResultType.FAIL, (T)var0);
   }

   public static <T> Class6794<T> method20700(T var0, boolean var1) {
      return !var1 ? method20697((T)var0) : method20696((T)var0);
   }
}
