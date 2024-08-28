package mapped;

import java.util.Collection;

public class Class2470 extends RuntimeException {
   private final Collection<Class9431> field16554;

   public Class2470(Class9431 var1, Collection<Class9431> var2) {
      super(
         String.format(
            "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", var1.method36195(), var1.method36196(), var1.method36197()
         )
      );
      this.field16554 = var2;
   }

   public Collection<Class9431> method10469() {
      return this.field16554;
   }

   public Class2470(Class9431 var1, Collection<Class9431> var2, int var3, int var4, int var5, int var6) {
      super(
         String.format(
            "Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?",
            "" + var1.method36195(),
            var1.method36196(),
            var1.method36197(),
            var3,
            var4,
            var5,
            var6
         )
      );
      this.field16554 = var2;
   }
}
