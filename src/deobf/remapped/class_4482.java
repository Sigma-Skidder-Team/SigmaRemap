package remapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class class_4482 extends class_111 {
   private static final class_4222 field_21857 = new class_4222();
   private final String field_21856;
   private final Set<Integer> field_21854 = new HashSet<Integer>();
   private final Map<Byte, Integer> field_21855 = new HashMap<Byte, Integer>();

   public class_4482(String var1) {
      this.field_21856 = var1;
   }

   public class_3590 method_20812(String var1) {
      return var3 -> {
         if (var1.equals(var3.method_42779())) {
            if (var3.method_42780("waterlogged") && var3.method_42778("waterlogged").equals("true")) {
               return;
            }

            this.field_21854.add(var3.method_42777());
            class_7943.field_40656.put(var3.method_42777(), this);
            this.field_21855.put(this.method_20811(var3), var3.method_42777());
         }
      };
   }

   public byte method_20811(class_9297 var1) {
      byte var4 = 0;
      if (var1.method_42778("east").equals("true")) {
         var4 = (byte)(var4 | 1);
      }

      if (var1.method_42778("north").equals("true")) {
         var4 = (byte)(var4 | 2);
      }

      if (var1.method_42778("south").equals("true")) {
         var4 = (byte)(var4 | 4);
      }

      if (var1.method_42778("west").equals("true")) {
         var4 = (byte)(var4 | 8);
      }

      return var4;
   }

   public byte method_20810(class_1455 var1, class_9371 var2, int var3) {
      byte var6 = 0;
      boolean var7 = var1.method_6744().method_17597() < class_412.field_1740.method_2056();
      if (this.method_20814(class_2391.field_11927, this.method_338(var1, var2.method_43341(class_2391.field_11927)), var7)) {
         var6 = (byte)(var6 | 1);
      }

      if (this.method_20814(class_2391.field_11921, this.method_338(var1, var2.method_43341(class_2391.field_11921)), var7)) {
         var6 = (byte)(var6 | 2);
      }

      if (this.method_20814(class_2391.field_11930, this.method_338(var1, var2.method_43341(class_2391.field_11930)), var7)) {
         var6 = (byte)(var6 | 4);
      }

      if (this.method_20814(class_2391.field_11928, this.method_338(var1, var2.method_43341(class_2391.field_11928)), var7)) {
         var6 = (byte)(var6 | 8);
      }

      return var6;
   }

   @Override
   public int method_338(class_1455 var1, class_9371 var2) {
      return field_21857.method_340(var1, var2, super.method_338(var1, var2));
   }

   @Override
   public int method_340(class_1455 var1, class_9371 var2, int var3) {
      Integer var6 = this.field_21855.get(this.method_20810(var1, var2, var3));
      return var6 != null ? var6 : var3;
   }

   public boolean method_20814(class_2391 var1, int var2, boolean var3) {
      if (!this.field_21854.contains(var2)) {
         if (this.field_21856 == null) {
            return false;
         } else {
            class_6772 var6 = (class_6772)class_7943.field_40654.get(var2);
            return var6 != null && var6.method_31081(this.field_21856, var1.method_10900(), var3);
         }
      } else {
         return true;
      }
   }

   public Set<Integer> method_20813() {
      return this.field_21854;
   }
}
