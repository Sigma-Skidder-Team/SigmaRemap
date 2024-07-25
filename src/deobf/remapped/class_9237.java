package remapped;

import com.google.common.cache.CacheLoader;

public class class_9237 extends CacheLoader<class_1331, class_9115> {
   private static String[] field_47200;
   private final class_4924 field_47199;
   private final boolean field_47201;

   public class_9237(class_4924 var1, boolean var2) {
      this.field_47199 = var1;
      this.field_47201 = var2;
   }

   public class_9115 load(class_1331 var1) throws Exception {
      return new class_9115(this.field_47199, var1, this.field_47201);
   }
}
