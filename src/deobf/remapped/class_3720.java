package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;
import java.util.ArrayList;
import java.util.List;

public abstract class class_3720 {
   public static final class_1893 field_18219 = class_1893.method_8510();
   private final String field_18221;
   private final String field_18220;
   private final String[] field_18217;
   private List<String> field_18218 = new ArrayList<String>();

   public class_3720(String var1, String var2, String... var3) {
      this.field_18221 = var1;
      this.field_18220 = var2;
      this.field_18217 = var3;
   }

   public String method_17258() {
      return this.field_18221;
   }

   public String method_17256() {
      return this.field_18220;
   }

   public String method_17255() {
      String var3 = "";

      for (String var5 : this.field_18218) {
         var3 = var3 + "[" + var5 + "] ";
      }

      return var3;
   }

   public String[] method_17254() {
      return this.field_18217;
   }

   public void method_17259(String... var1) {
      for (String var7 : var1) {
         this.field_18218.add(var7);
      }
   }

   public abstract void run(String var1, class_5273[] var2, class_860 var3) throws CommandException;
}
