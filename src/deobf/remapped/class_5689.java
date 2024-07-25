package remapped;

import java.util.concurrent.TimeUnit;

public final class class_5689 {
   public boolean field_28811;
   public boolean field_28815;
   public int field_28807 = -1;
   public int field_28813 = -1;
   public int field_28809 = -1;
   public boolean field_28812;
   public boolean field_28808;
   public boolean field_28810;

   public class_5689 method_25732() {
      this.field_28811 = true;
      return this;
   }

   public class_5689 method_25735() {
      this.field_28815 = true;
      return this;
   }

   public class_5689 method_25734(int var1, TimeUnit var2) {
      if (var1 >= 0) {
         long var5 = var2.toSeconds((long)var1);
         this.field_28807 = var5 <= 2147483647L ? (int)var5 : Integer.MAX_VALUE;
         return this;
      } else {
         throw new IllegalArgumentException("maxAge < 0: " + var1);
      }
   }

   public class_5689 method_25731(int var1, TimeUnit var2) {
      if (var1 >= 0) {
         long var5 = var2.toSeconds((long)var1);
         this.field_28813 = var5 <= 2147483647L ? (int)var5 : Integer.MAX_VALUE;
         return this;
      } else {
         throw new IllegalArgumentException("maxStale < 0: " + var1);
      }
   }

   public class_5689 method_25737(int var1, TimeUnit var2) {
      if (var1 >= 0) {
         long var5 = var2.toSeconds((long)var1);
         this.field_28809 = var5 <= 2147483647L ? (int)var5 : Integer.MAX_VALUE;
         return this;
      } else {
         throw new IllegalArgumentException("minFresh < 0: " + var1);
      }
   }

   public class_5689 method_25739() {
      this.field_28812 = true;
      return this;
   }

   public class_5689 method_25738() {
      this.field_28808 = true;
      return this;
   }

   public class_5689 method_25733() {
      this.field_28810 = true;
      return this;
   }

   public class_1766 method_25730() {
      return new class_1766(this);
   }
}
