package remapped;

import java.util.Calendar;
import java.util.Date;

public class class_5933 {
   private String field_30162;
   private Date field_30161;

   public class_5933(String var1, Date var2) {
      this.field_30162 = var1;
      this.field_30161 = var2;
   }

   public class_5933(class_1293 var1) {
      Calendar var4 = Calendar.getInstance();
      long var5 = 0L;
      if (!(var1.method_5805("until") instanceof Integer)) {
         var5 = (Long)var1.method_5805("until");
      } else {
         var5 = ((Integer)var1.method_5805("until")).longValue();
      }

      if (var5 == 1L) {
         var5 = 9223372036854775806L;
      }

      var4.setTimeInMillis(var5);
      this.field_30162 = var1.method_5861("server");
      this.field_30161 = var4.getTime();
   }

   public class_1293 method_27124() {
      class_1293 var3 = new class_1293();
      var3.method_5820("server", this.field_30162);
      var3.method_5819("until", this.field_30161.getTime());
      return var3;
   }

   public String method_27126() {
      return this.field_30162;
   }

   public Date method_27122() {
      return this.field_30161;
   }

   public class_2560 method_27123() {
      class_3187 var3 = new class_3187(MinecraftClient.method_8510());
      var3.method_14670();
      int var4 = var3.method_14671();

      for (int var5 = 0; var5 < var4; var5++) {
         class_2560 var6 = var3.method_14673(var5);
         if (var6.field_12675.equals(this.field_30162)) {
            return var6;
         }
      }

      return null;
   }
}
