package remapped;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

public class class_8200 extends class_150 {
   public Map<Class<? extends Object>, class_9592> field_41965;
   public TimeZone field_41962 = null;
   public static Pattern field_41963 = Pattern.compile("\n|\u0085|\u2028|\u2029");

   public class_8200() {
      this.field_437 = new class_610(this);
      this.field_441.put(String.class, new class_2122(this));
      this.field_441.put(Boolean.class, new class_7420(this));
      this.field_441.put(Character.class, new class_2122(this));
      this.field_441.put(UUID.class, new class_5147(this));
      this.field_441.put(byte[].class, new class_7911(this));
      class_8106 var3 = new class_8106(this);
      this.field_441.put(short[].class, var3);
      this.field_441.put(int[].class, var3);
      this.field_441.put(long[].class, var3);
      this.field_441.put(float[].class, var3);
      this.field_441.put(double[].class, var3);
      this.field_441.put(char[].class, var3);
      this.field_441.put(boolean[].class, var3);
      this.field_438.put(Number.class, new class_5264(this));
      this.field_438.put(List.class, new class_512(this));
      this.field_438.put(Map.class, new class_1928(this));
      this.field_438.put(Set.class, new class_9819(this));
      this.field_438.put(Iterator.class, new class_3349(this));
      this.field_438.put(new Object[0].getClass(), new class_4640(this));
      this.field_438.put(Date.class, new class_5573(this));
      this.field_438.put(Enum.class, new class_2138(this));
      this.field_438.put(Calendar.class, new class_5573(this));
      this.field_41965 = new HashMap<Class<? extends Object>, class_9592>();
   }

   public class_9592 method_37561(Class<?> var1, class_9592 var2) {
      return !this.field_41965.containsKey(var1) ? var2 : this.field_41965.get(var1);
   }

   public class_9592 method_37560(Class<? extends Object> var1, class_9592 var2) {
      if (var2 != null) {
         return this.field_41965.put(var1, var2);
      } else {
         throw new NullPointerException("Tag must be provided.");
      }
   }

   public TimeZone method_37559() {
      return this.field_41962;
   }

   public void method_37562(TimeZone var1) {
      this.field_41962 = var1;
   }
}
