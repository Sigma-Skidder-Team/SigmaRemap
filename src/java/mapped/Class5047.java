package mapped;

import java.io.IOException;

public class Class5047 extends Class5046 {
   private static String[] field23034;
   private int field23035;
   private int field23036;
   private int field23037;

   public Class5047(String var1) {
      super(var1);
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      var1.method31870(8L);
      this.field23035 = (int)var1.method31863(2);
      this.field23036 = (int)var1.method31863(2);
      var1.method31870(2L);
      var1.method31870(2L);
      this.field23037 = (int)var1.method31863(2);
      var1.method31870(2L);
      this.method15441(var1);
   }

   public int method15449() {
      return this.field23035;
   }

   public int method15450() {
      return this.field23037;
   }

   public int method15451() {
      return this.field23036;
   }
}
