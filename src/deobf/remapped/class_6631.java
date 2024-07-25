package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum class_6631 {
   field_34340(class_8336.field_42691),
   field_34334(class_8336.field_42710),
   field_34338(class_8336.field_42703),
   field_34335(class_8336.field_42700);

   private final class_8336 field_34339;

   private class_6631(class_8336 var3) {
      this.field_34339 = var3;
   }

   public class_6631 method_30486(class_6631 var1) {
      switch (var1) {
         case field_34338:
            switch (this) {
               case field_34340:
                  return field_34338;
               case field_34334:
                  return field_34335;
               case field_34338:
                  return field_34340;
               case field_34335:
                  return field_34334;
            }
         case field_34335:
            switch (this) {
               case field_34340:
                  return field_34335;
               case field_34334:
                  return field_34340;
               case field_34338:
                  return field_34334;
               case field_34335:
                  return field_34338;
            }
         case field_34334:
            switch (this) {
               case field_34340:
                  return field_34334;
               case field_34334:
                  return field_34338;
               case field_34338:
                  return field_34335;
               case field_34335:
                  return field_34340;
            }
         default:
            return this;
      }
   }

   public class_8336 method_30491() {
      return this.field_34339;
   }

   public class_240 method_30489(class_240 var1) {
      if (var1.method_1029() == class_9249.field_47216) {
         return var1;
      } else {
         switch (this) {
            case field_34334:
               return var1.method_1042();
            case field_34338:
               return var1.method_1046();
            case field_34335:
               return var1.method_1053();
            default:
               return var1;
         }
      }
   }

   public int method_30488(int var1, int var2) {
      switch (this) {
         case field_34334:
            return (var1 + var2 / 4) % var2;
         case field_34338:
            return (var1 + var2 / 2) % var2;
         case field_34335:
            return (var1 + var2 * 3 / 4) % var2;
         default:
            return var1;
      }
   }

   public static class_6631 method_30492(Random var0) {
      return class_9665.<class_6631>method_44697(values(), var0);
   }

   public static List<class_6631> method_30487(Random var0) {
      ArrayList var3 = Lists.newArrayList(values());
      Collections.shuffle(var3, var0);
      return var3;
   }
}
