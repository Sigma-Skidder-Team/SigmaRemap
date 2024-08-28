package mapped;

import java.io.File;

public class Class8281 {
   private static String[] field35578;
   public final File field35579;
   public final File field35580;
   public final File field35581;
   public final String field35582;

   public Class8281(File var1, File var2, File var3, String var4) {
      this.field35579 = var1;
      this.field35580 = var2;
      this.field35581 = var3;
      this.field35582 = var4;
   }

   public Class7949 method28943() {
      return (Class7949)(this.field35582 != null ? new Class7949(this.field35581, this.field35582) : new Class7948(this.field35581));
   }
}
