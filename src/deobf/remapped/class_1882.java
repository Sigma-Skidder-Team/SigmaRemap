package remapped;

import java.util.Collection;

public class class_1882 extends RuntimeException {
   private final Collection<class_8353> field_9538;

   public class_1882(class_8353 var1, Collection<class_8353> var2) {
      super(
         String.format(
            "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", var1.method_38459(), var1.method_38453(), var1.method_38456()
         )
      );
      this.field_9538 = var2;
   }

   public Collection<class_8353> method_8418() {
      return this.field_9538;
   }

   public class_1882(class_8353 var1, Collection<class_8353> var2, int var3, int var4, int var5, int var6) {
      super(
         String.format(
            "Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?",
            "" + var1.method_38459(),
            var1.method_38453(),
            var1.method_38456(),
            var3,
            var4,
            var5,
            var6
         )
      );
      this.field_9538 = var2;
   }
}
