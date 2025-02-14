package mapped;

import net.minecraft.util.ActionResultType;

public class ActionResult<T> {
   private static String[] field29595;
   private final ActionResultType field29596;
   private final T field29597;

   public ActionResult(ActionResultType var1, T var2) {
      this.field29596 = var1;
      this.field29597 = (T)var2;
   }

   public ActionResultType method20694() {
      return this.field29596;
   }

   public T method20695() {
      return this.field29597;
   }

   public static <T> ActionResult<T> method20696(T var0) {
      return new ActionResult<T>(ActionResultType.SUCCESS, (T)var0);
   }

   public static <T> ActionResult<T> method20697(T var0) {
      return new ActionResult<T>(ActionResultType.field14819, (T)var0);
   }

   public static <T> ActionResult<T> method20698(T var0) {
      return new ActionResult<T>(ActionResultType.field14820, (T)var0);
   }

   public static <T> ActionResult<T> method20699(T var0) {
      return new ActionResult<T>(ActionResultType.FAIL, (T)var0);
   }

   public static <T> ActionResult<T> method20700(T var0, boolean var1) {
      return !var1 ? method20697((T)var0) : method20696((T)var0);
   }
}
