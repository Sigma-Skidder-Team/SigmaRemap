package mapped;

import java.util.UUID;

public class Class6374 extends Class6373 {
   private static String[] field27940;

   @Override
   public void method19341() {
      this.method19356(Class187.field700, 0, 0, new Class3914(this));
      this.method19355(Class187.field700, 1, 1);
      this.method19355(Class187.field701, 0, 0);
      this.method19355(Class187.field701, 1, 1);
      this.method19356(Class187.field701, 2, 2, new Class3976(this));
      this.method19355(Class187.field701, 3, 3);
      this.method19350(Class187.field701, 4, 4);
      this.method19350(Class187.field700, 0, 0);
      this.method19350(Class187.field700, 1, 1);
      this.method19351(Class187.field701, 0, 0, new Class3788(this));
      this.method19350(Class187.field701, 1, 1);
      this.method19350(Class187.field701, 2, 2);
   }

   public static String method19386(String var0) {
      StringBuilder var3 = new StringBuilder(var0);
      var3.insert(20, '-');
      var3.insert(16, '-');
      var3.insert(12, '-');
      var3.insert(8, '-');
      return var3.toString();
   }

   public UUID method19387(Class8563 var1) throws Exception {
      String var4 = var1.<String>method30561(BruhMotha.field22539);
      if (var4.length() == 32) {
         var4 = method19386(var4);
      }

      return UUID.fromString(var4);
   }
}
