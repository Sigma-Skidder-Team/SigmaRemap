package remapped;

import java.io.File;

public class class_4141 {
   private static String[] field_20149;
   public final File field_20153;
   public final File field_20150;
   public final File field_20151;
   public final String field_20152;

   public class_4141(File var1, File var2, File var3, String var4) {
      this.field_20153 = var1;
      this.field_20150 = var2;
      this.field_20151 = var3;
      this.field_20152 = var4;
   }

   public class_5217 getResourceIndex() {
      return (class_5217)(this.field_20152 != null ? new class_5217(this.field_20151, this.field_20152) : new class_3125(this.field_20151));
   }
}
