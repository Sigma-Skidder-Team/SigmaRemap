package mapped;

import java.util.Set;
import net.minecraft.util.text.LanguageMap;

public final class Class7569 implements Class7567 {
   private static String[] field32503;
   public final LanguageMap field32504;
   public final Set field32505;

   public Class7569(LanguageMap var1, Set var2) {
      this.field32504 = var1;
      this.field32505 = var2;
   }

   @Override
   public <T extends Class7465<T>> void method24776(Class9221<T> var1, Class7989<T> var2) {
      if (!this.field32504.func_230506_b_(var1.method34673())) {
         this.field32505.add(var1.method34672());
      }
   }
}
