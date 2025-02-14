package mapped;

import java.io.BufferedReader;
import java.io.IOException;

public class Class6464 {
   private static String[] field28404;
   public int field28405;
   public int field28406;
   public int field28407;
   public int field28408;
   public int field28409;
   public int field28410;
   public String field28411;
   public final Class9566 field28412;

   public Class6464(Class9566 var1, BufferedReader var2) throws IOException {
      this.field28412 = var1;
      this.field28411 = var2.readLine().trim();
      this.field28405 = Integer.parseInt(var2.readLine().trim());
      this.field28406 = Integer.parseInt(var2.readLine().trim());
      this.field28407 = Integer.parseInt(var2.readLine().trim());
      this.field28408 = Integer.parseInt(var2.readLine().trim());
      this.field28409 = Integer.parseInt(var2.readLine().trim());
      this.field28410 = Integer.parseInt(var2.readLine().trim());
      var2.readLine().trim();
      var2.readLine().trim();
      this.field28409 = Math.max(1, this.field28409);
      this.field28410 = Math.max(1, this.field28410);
   }
}
