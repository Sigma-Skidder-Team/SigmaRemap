package remapped;

import java.io.BufferedReader;
import java.io.IOException;

public class class_664 {
   private static String[] field_3679;
   public int field_3682;
   public int field_3686;
   public int field_3684;
   public int field_3683;
   public int field_3680;
   public int field_3685;
   public String field_3678;

   public class_664(class_8864 var1, BufferedReader var2) throws IOException {
      this.field_3681 = var1;
      this.field_3678 = var2.readLine().trim();
      this.field_3682 = Integer.parseInt(var2.readLine().trim());
      this.field_3686 = Integer.parseInt(var2.readLine().trim());
      this.field_3684 = Integer.parseInt(var2.readLine().trim());
      this.field_3683 = Integer.parseInt(var2.readLine().trim());
      this.field_3680 = Integer.parseInt(var2.readLine().trim());
      this.field_3685 = Integer.parseInt(var2.readLine().trim());
      var2.readLine().trim();
      var2.readLine().trim();
      this.field_3680 = Math.max(1, this.field_3680);
      this.field_3685 = Math.max(1, this.field_3685);
   }
}
