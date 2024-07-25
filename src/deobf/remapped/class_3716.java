package remapped;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class class_3716 implements Comparator<class_7675> {
   private static String[] field_18212;
   private final String field_18211;

   public class_3716(String var1) {
      this.field_18211 = var1;
   }

   public int compare(class_7675 var1, class_7675 var2) {
      return ComparisonChain.start()
         .compareTrueFirst(var1.field_39004 == class_6804.field_35065, var2.field_39004 == class_6804.field_35065)
         .compareTrueFirst(var1.field_39005, var2.field_39005)
         .compareTrueFirst(var1.field_39006.equals(this.field_18211), var2.field_39006.equals(this.field_18211))
         .compareFalseFirst(var1.field_39020, var2.field_39020)
         .compareTrueFirst(var1.field_39004 == class_6804.field_35061, var2.field_39004 == class_6804.field_35061)
         .compare(var1.field_39016, var2.field_39016)
         .result();
   }
}
