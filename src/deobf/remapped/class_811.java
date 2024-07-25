package remapped;

import java.io.PrintStream;
import java.util.Date;

public class class_811 implements class_7940 {
   public static PrintStream field_4317 = System.out;

   public void 曞뫤ꦱ汌ꁈ퉧(String var1, Throwable var2) {
      this.曞뫤ꦱ汌ꁈ퉧(var1);
      this.曞뫤ꦱ汌ꁈ퉧(var2);
   }

   public void 曞뫤ꦱ汌ꁈ퉧(Throwable var1) {
      field_4317.println(new Date() + " ERROR:" + var1.getMessage());
      var1.printStackTrace(field_4317);
   }

   public void 曞뫤ꦱ汌ꁈ퉧(String var1) {
      field_4317.println(new Date() + " ERROR:" + var1);
   }

   public void 䁞值㮃쥅蛊瀧(String var1) {
      field_4317.println(new Date() + " WARN:" + var1);
   }

   public void 酭湗Ꮺ㝛ꁈ綋(String var1) {
      field_4317.println(new Date() + " INFO:" + var1);
   }

   public void 竬釒騜陬햖ぶ(String var1) {
      field_4317.println(new Date() + " DEBUG:" + var1);
   }

   public void 䁞值㮃쥅蛊瀧(String var1, Throwable var2) {
      this.䁞值㮃쥅蛊瀧(var1);
      var2.printStackTrace(field_4317);
   }
}
