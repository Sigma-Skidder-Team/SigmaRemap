package mapped;

import java.util.List;

public final class Class6565<T> extends Class6553 {
   private final String field28930;
   private final List<T> field28931;

   public Class6565(String var1, List<T> var2, Class2512 var3, Class2512 var4) {
      super(var3, var4);
      this.field28930 = var1;
      if (var2 != null && var2.size() != 2) {
         throw new Class2478("Two strings must be provided instead of " + String.valueOf(var2.size()));
      } else {
         this.field28931 = var2;
      }
   }

   public String method19902() {
      return this.field28930;
   }

   public List<T> method19903() {
      return this.field28931;
   }

   @Override
   public Class2228 method19894() {
      return Class2228.field14594;
   }
}
