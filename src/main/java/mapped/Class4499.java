package mapped;

import java.util.*;
import java.util.regex.Pattern;

public class Class4499 extends Class4498 {
   public Map<Class<? extends Object>, Class9757> field21720;
   public TimeZone field21721 = null;
   public static Pattern field21722 = Pattern.compile("\n|\u0085|\u2028|\u2029");

   public Class4499() {
      this.field21712 = new Class6194(this);
      this.field21711.put(String.class, new Class6187(this));
      this.field21711.put(Boolean.class, new Class6192(this));
      this.field21711.put(Character.class, new Class6187(this));
      this.field21711.put(UUID.class, new Class6183(this));
      this.field21711.put(byte[].class, new Class6186(this));
      Class6189 var3 = new Class6189(this);
      this.field21711.put(short[].class, var3);
      this.field21711.put(int[].class, var3);
      this.field21711.put(long[].class, var3);
      this.field21711.put(float[].class, var3);
      this.field21711.put(double[].class, var3);
      this.field21711.put(char[].class, var3);
      this.field21711.put(boolean[].class, var3);
      this.field21713.put(Number.class, new Class6193(this));
      this.field21713.put(List.class, new Class6179(this));
      this.field21713.put(Map.class, new Class6191(this));
      this.field21713.put(Set.class, new Class6188(this));
      this.field21713.put(Iterator.class, new Class6184(this));
      this.field21713.put(new Object[0].getClass(), new Class6181(this));
      this.field21713.put(Date.class, new Class6190(this));
      this.field21713.put(Enum.class, new Class6182(this));
      this.field21713.put(Calendar.class, new Class6190(this));
      this.field21720 = new HashMap<Class<? extends Object>, Class9757>();
   }

   public Class9757 method14203(Class<?> var1, Class9757 var2) {
      return !this.field21720.containsKey(var1) ? var2 : this.field21720.get(var1);
   }

   public Class9757 method14204(Class<? extends Object> var1, Class9757 var2) {
      if (var2 != null) {
         return this.field21720.put(var1, var2);
      } else {
         throw new NullPointerException("Tag must be provided.");
      }
   }

   public TimeZone method14205() {
      return this.field21721;
   }

   public void method14206(TimeZone var1) {
      this.field21721 = var1;
   }
}
