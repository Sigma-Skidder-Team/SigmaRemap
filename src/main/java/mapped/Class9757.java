package mapped;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class Class9757 {
   public static final String field45630 = "tag:yaml.org,2002:";
   public static final Class9757 field45631 = new Class9757("tag:yaml.org,2002:yaml");
   public static final Class9757 field45632 = new Class9757("tag:yaml.org,2002:merge");
   public static final Class9757 field45633 = new Class9757("tag:yaml.org,2002:set");
   public static final Class9757 field45634 = new Class9757("tag:yaml.org,2002:pairs");
   public static final Class9757 field45635 = new Class9757("tag:yaml.org,2002:omap");
   public static final Class9757 field45636 = new Class9757("tag:yaml.org,2002:binary");
   public static final Class9757 field45637 = new Class9757("tag:yaml.org,2002:int");
   public static final Class9757 field45638 = new Class9757("tag:yaml.org,2002:float");
   public static final Class9757 field45639 = new Class9757("tag:yaml.org,2002:timestamp");
   public static final Class9757 field45640 = new Class9757("tag:yaml.org,2002:bool");
   public static final Class9757 field45641 = new Class9757("tag:yaml.org,2002:null");
   public static final Class9757 field45642 = new Class9757("tag:yaml.org,2002:str");
   public static final Class9757 field45643 = new Class9757("tag:yaml.org,2002:seq");
   public static final Class9757 field45644 = new Class9757("tag:yaml.org,2002:map");
   public static final Map<Class9757, Set<Class<?>>> field45645 = new HashMap<Class9757, Set<Class<?>>>();
   private final String field45646;
   private boolean field45647 = false;

   public Class9757(String var1) {
      if (var1 != null) {
         if (var1.length() != 0) {
            if (var1.trim().length() == var1.length()) {
               this.field45646 = Class8261.method28799(var1);
               this.field45647 = !var1.startsWith("tag:yaml.org,2002:");
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

   public Class9757(Class<? extends Object> var1) {
      if (var1 != null) {
         this.field45646 = "tag:yaml.org,2002:" + Class8261.method28799(var1.getName());
      } else {
         throw new NullPointerException("Class for tag must be provided.");
      }
   }

   public Class9757(URI var1) {
      if (var1 != null) {
         this.field45646 = var1.toASCIIString();
      } else {
         throw new NullPointerException("URI for tag must be provided.");
      }
   }

   public boolean method38338() {
      return this.field45647;
   }

   public String method38339() {
      return this.field45646;
   }

   public boolean method38340(String var1) {
      return this.field45646.startsWith(var1);
   }

   public String method38341() {
      if (this.field45646.startsWith("tag:yaml.org,2002:")) {
         return Class8261.method28801(this.field45646.substring("tag:yaml.org,2002:".length()));
      } else {
         throw new Class2478("Invalid tag: " + this.field45646);
      }
   }

   @Override
   public String toString() {
      return this.field45646;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof Class9757) ? false : this.field45646.equals(((Class9757)var1).method38339());
   }

   @Override
   public int hashCode() {
      return this.field45646.hashCode();
   }

   public boolean method38342(Class<?> var1) {
      Set var4 = field45645.get(this);
      return var4 == null ? false : var4.contains(var1);
   }

   public boolean method38343(Class<? extends Object> var1) {
      return this.field45646.equals("tag:yaml.org,2002:" + var1.getName());
   }

   static {
      HashSet var4 = new HashSet();
      var4.add(Double.class);
      var4.add(Float.class);
      var4.add(BigDecimal.class);
      field45645.put(field45638, var4);
      HashSet var5 = new HashSet();
      var5.add(Integer.class);
      var5.add(Long.class);
      var5.add(BigInteger.class);
      field45645.put(field45637, var5);
      HashSet var6 = new HashSet();
      var6.add(Date.class);
      var6.add(java.sql.Date.class);
      var6.add(Timestamp.class);
      field45645.put(field45639, var6);
   }
}
