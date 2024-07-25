package remapped;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class class_9592 {
   public static final String field_48874 = "tag:yaml.org,2002:";
   public static final class_9592 field_48879 = new class_9592("tag:yaml.org,2002:yaml");
   public static final class_9592 field_48872 = new class_9592("tag:yaml.org,2002:merge");
   public static final class_9592 field_48883 = new class_9592("tag:yaml.org,2002:set");
   public static final class_9592 field_48880 = new class_9592("tag:yaml.org,2002:pairs");
   public static final class_9592 field_48886 = new class_9592("tag:yaml.org,2002:omap");
   public static final class_9592 field_48884 = new class_9592("tag:yaml.org,2002:binary");
   public static final class_9592 field_48877 = new class_9592("tag:yaml.org,2002:int");
   public static final class_9592 field_48881 = new class_9592("tag:yaml.org,2002:float");
   public static final class_9592 field_48875 = new class_9592("tag:yaml.org,2002:timestamp");
   public static final class_9592 field_48878 = new class_9592("tag:yaml.org,2002:bool");
   public static final class_9592 field_48873 = new class_9592("tag:yaml.org,2002:null");
   public static final class_9592 field_48876 = new class_9592("tag:yaml.org,2002:str");
   public static final class_9592 field_48882 = new class_9592("tag:yaml.org,2002:seq");
   public static final class_9592 field_48871 = new class_9592("tag:yaml.org,2002:map");
   public static final Map<class_9592, Set<Class<?>>> field_48885 = new HashMap<class_9592, Set<Class<?>>>();
   private final String field_48870;
   private boolean field_48887 = false;

   public class_9592(String var1) {
      if (var1 != null) {
         if (var1.length() != 0) {
            if (var1.trim().length() == var1.length()) {
               this.field_48870 = class_4084.method_18819(var1);
               this.field_48887 = !var1.startsWith("tag:yaml.org,2002:");
            } else {
               throw new IllegalArgumentException("Tag must not contain leading or trailing spaces.");
            }
         } else {
            throw new IllegalArgumentException("Tag must not be empty.");
         }
      } else {
         throw new NullPointerException("Tag must be provided.");
      }
   }

   public class_9592(Class<? extends Object> var1) {
      if (var1 != null) {
         this.field_48870 = "tag:yaml.org,2002:" + class_4084.method_18819(var1.getName());
      } else {
         throw new NullPointerException("Class for tag must be provided.");
      }
   }

   public class_9592(URI var1) {
      if (var1 != null) {
         this.field_48870 = var1.toASCIIString();
      } else {
         throw new NullPointerException("URI for tag must be provided.");
      }
   }

   public boolean method_44299() {
      return this.field_48887;
   }

   public String method_44298() {
      return this.field_48870;
   }

   public boolean method_44296(String var1) {
      return this.field_48870.startsWith(var1);
   }

   public String method_44301() {
      if (this.field_48870.startsWith("tag:yaml.org,2002:")) {
         return class_4084.method_18820(this.field_48870.substring("tag:yaml.org,2002:".length()));
      } else {
         throw new class_5251("Invalid tag: " + this.field_48870);
      }
   }

   @Override
   public String toString() {
      return this.field_48870;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof class_9592) ? false : this.field_48870.equals(((class_9592)var1).method_44298());
   }

   @Override
   public int hashCode() {
      return this.field_48870.hashCode();
   }

   public boolean method_44297(Class<?> var1) {
      Set var4 = field_48885.get(this);
      return var4 == null ? false : var4.contains(var1);
   }

   public boolean method_44302(Class<? extends Object> var1) {
      return this.field_48870.equals("tag:yaml.org,2002:" + var1.getName());
   }

   static {
      HashSet var4 = new HashSet();
      var4.add(Double.class);
      var4.add(Float.class);
      var4.add(BigDecimal.class);
      field_48885.put(field_48881, var4);
      HashSet var5 = new HashSet();
      var5.add(Integer.class);
      var5.add(Long.class);
      var5.add(BigInteger.class);
      field_48885.put(field_48877, var5);
      HashSet var6 = new HashSet();
      var6.add(Date.class);
      var6.add(java.sql.Date.class);
      var6.add(Timestamp.class);
      field_48885.put(field_48875, var6);
   }
}
