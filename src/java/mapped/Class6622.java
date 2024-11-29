package mapped;

import java.io.PrintStream;
import java.util.Date;

public class Class6622 implements Class6623 {
   public static PrintStream field29142 = System.out;

   @Override
   public void method20185(String var1, Throwable var2) {
      this.method20187(var1);
      this.method20186(var2);
   }

   @Override
   public void method20186(Throwable var1) {
      field29142.println(new Date() + " ERROR:" + var1.getMessage());
      var1.printStackTrace(field29142);
   }

   @Override
   public void method20187(String var1) {
      field29142.println(new Date() + " ERROR:" + var1);
   }

   @Override
   public void method20188(String var1) {
      field29142.println(new Date() + " WARN:" + var1);
   }

   @Override
   public void method20189(String var1) {
      field29142.println(new Date() + " INFO:" + var1);
   }

   @Override
   public void method20190(String var1) {
      field29142.println(new Date() + " DEBUG:" + var1);
   }

   @Override
   public void method20191(String var1, Throwable var2) {
      this.method20188(var1);
      var2.printStackTrace(field29142);
   }
}
