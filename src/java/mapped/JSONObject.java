package mapped;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Map.Entry;

public class JSONObject {
   private final Map<String, Object> field30341 = new HashMap<String, Object>();
   public static final Object field30342 = new Class9527();

   public JSONObject() {
   }

   public JSONObject(JSONObject var1, String[] var2) {
      this();

      for (int var5 = 0; var5 < var2.length; var5++) {
         try {
            this.method21807(var2[var5], var1.method21782(var2[var5]));
         } catch (Exception var7) {
         }
      }
   }

   public JSONObject(Class7475 var1) throws Class2455 {
      this();
      if (var1.method24224() != '{') {
         throw var1.method24230("A JSONObject text must begin with '{'");
      } else {
         while (true) {
            char var4 = var1.method24224();
            switch (var4) {
               case '\u0000':
                  throw var1.method24230("A JSONObject text must end with '}'");
               case '}':
                  return;
            }

            var1.method24217();
            String var5 = var1.method24228().toString();
            var4 = var1.method24224();
            if (var4 != ':') {
               throw var1.method24230("Expected a ':' after a key");
            }

            this.method21807(var5, var1.method24228());
            switch (var1.method24224()) {
               case ',':
               case ';':
                  if (var1.method24224() == '}') {
                     return;
                  }

                  var1.method24217();
                  break;
               case '}':
                  return;
               default:
                  throw var1.method24230("Expected a ',' or '}'");
            }
         }
      }
   }

   public JSONObject(Map<?, ?> var1) {
      if (var1 != null) {
         for (Entry var5 : var1.entrySet()) {
            Object var6 = var5.getValue();
            if (var6 != null) {
               this.field30341.put(String.valueOf(var5.getKey()), method21817(var6));
            }
         }
      }
   }

   public JSONObject(Object var1) {
      this();
      this.method21799(var1);
   }

   public JSONObject(Object var1, String[] var2) {
      this();
      Class var5 = var1.getClass();

      for (int var6 = 0; var6 < var2.length; var6++) {
         String var7 = var2[var6];

         try {
            this.method21808(var7, var5.getField(var7).get(var1));
         } catch (Exception var9) {
         }
      }
   }

   public JSONObject(String var1) throws Class2455 {
      this(new Class7475(var1));
   }

   public JSONObject(String var1, Locale var2) throws Class2499 {
      this();
      ResourceBundle var5 = ResourceBundle.getBundle(var1, var2, Thread.currentThread().getContextClassLoader());
      Enumeration var6 = var5.getKeys();

      while (var6.hasMoreElements()) {
         Object var7 = var6.nextElement();
         if (var7 != null) {
            String[] var8 = ((String)var7).split("\\.");
            int var9 = var8.length - 1;
            JSONObject var10 = this;

            for (int var11 = 0; var11 < var9; var11++) {
               String var12 = var8[var11];
               JSONObject var13 = var10.method21794(var12);
               if (var13 == null) {
                  var13 = new JSONObject();
                  var10.method21806(var12, var13);
               }

               var10 = var13;
            }

            var10.method21806(var8[var9], var5.getString((String)var7));
         }
      }
   }

   public JSONObject method21758(String var1, Object var2) throws Class2499 {
      method21814(var2);
      Object var5 = this.method21782(var1);
      if (var5 != null) {
         if (!(var5 instanceof Class2344)) {
            this.method21806(var1, new Class2344().method9158(var5).method9158(var2));
         } else {
            ((Class2344)var5).method9158(var2);
         }
      } else {
         this.method21806(var1, !(var2 instanceof Class2344) ? var2 : new Class2344().method9158(var2));
      }

      return this;
   }

   public JSONObject method21759(String var1, Object var2) throws Class2499 {
      method21814(var2);
      Object var5 = this.method21782(var1);
      if (var5 != null) {
         if (!(var5 instanceof Class2344)) {
            throw new Class2499("JSONObject[" + var1 + "] is not a JSONArray.");
         }

         this.method21806(var1, ((Class2344)var5).method9158(var2));
      } else {
         this.method21806(var1, new Class2344().method9158(var2));
      }

      return this;
   }

   public static String method21760(double var0) {
      if (!Double.isInfinite(var0) && !Double.isNaN(var0)) {
         String var4 = Double.toString(var0);
         if (var4.indexOf(46) > 0 && var4.indexOf(101) < 0 && var4.indexOf(69) < 0) {
            while (var4.endsWith("0")) {
               var4 = var4.substring(0, var4.length() - 1);
            }

            if (var4.endsWith(".")) {
               var4 = var4.substring(0, var4.length() - 1);
            }
         }

         return var4;
      } else {
         return "null";
      }
   }

   public Object method21761(String var1) {
      if (var1 != null) {
         Object var4 = this.method21782(var1);
         if (var4 != null) {
            return var4;
         } else {
            throw new Class2499("JSONObject[" + method21809(var1) + "] not found.");
         }
      } else {
         throw new Class2499("Null key.");
      }
   }

   public <E extends Enum<E>> E method21762(Class<E> var1, String var2) throws Class2499 {
      Enum<E> var5 = this.method21783(var1, var2);
      if (var5 != null) {
         return (E)var5;
      } else {
         throw new Class2499("JSONObject[" + method21809(var2) + "] is not an enum of type " + method21809(var1.getSimpleName()) + ".");
      }
   }

   public boolean method21763(String var1) throws Class2499 {
      Object var4 = this.method21761(var1);
      if (!var4.equals(Boolean.FALSE) && (!(var4 instanceof String) || !((String)var4).equalsIgnoreCase("false"))) {
         if (!var4.equals(Boolean.TRUE) && (!(var4 instanceof String) || !((String)var4).equalsIgnoreCase("true"))) {
            throw new Class2499("JSONObject[" + method21809(var1) + "] is not a Boolean.");
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public BigInteger method21764(String var1) throws Class2499 {
      Object var4 = this.method21761(var1);

      try {
         return new BigInteger(var4.toString());
      } catch (Exception var6) {
         throw new Class2499("JSONObject[" + method21809(var1) + "] could not be converted to BigInteger.");
      }
   }

   public BigDecimal method21765(String var1) throws Class2499 {
      Object var4 = this.method21761(var1);

      try {
         return new BigDecimal(var4.toString());
      } catch (Exception var6) {
         throw new Class2499("JSONObject[" + method21809(var1) + "] could not be converted to BigDecimal.");
      }
   }

   public double method21766(String var1) throws Class2499 {
      Object var4 = this.method21761(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).doubleValue() : Double.parseDouble((String)var4);
      } catch (Exception var6) {
         throw new Class2499("JSONObject[" + method21809(var1) + "] is not a number.");
      }
   }

   public int method21767(String var1) throws Class2499 {
      Object var4 = this.method21761(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).intValue() : Integer.parseInt((String)var4);
      } catch (Exception var6) {
         throw new Class2499("JSONObject[" + method21809(var1) + "] is not an int.");
      }
   }

   public Class2344 method21768(String var1) throws Class2499 {
      Object var4 = this.method21761(var1);
      if (!(var4 instanceof Class2344)) {
         throw new Class2499("JSONObject[" + method21809(var1) + "] is not a JSONArray.");
      } else {
         return (Class2344)var4;
      }
   }

   public JSONObject method21769(String var1) throws Class2499 {
      Object var4 = this.method21761(var1);
      if (!(var4 instanceof JSONObject)) {
         throw new Class2499("JSONObject[" + method21809(var1) + "] is not a JSONObject.");
      } else {
         return (JSONObject)var4;
      }
   }

   public long method21770(String var1) throws Class2499 {
      Object var4 = this.method21761(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).longValue() : Long.parseLong((String)var4);
      } catch (Exception var6) {
         throw new Class2499("JSONObject[" + method21809(var1) + "] is not a long.");
      }
   }

   public static String[] method21771(JSONObject var0) {
      int var3 = var0.method21779();
      if (var3 == 0) {
         return null;
      } else {
         Iterator var4 = var0.method21777();
         String[] var5 = new String[var3];

         for (int var6 = 0; var4.hasNext(); var6++) {
            var5[var6] = (String)var4.next();
         }

         return var5;
      }
   }

   public static String[] method21772(Object var0) {
      if (var0 == null) {
         return null;
      } else {
         Class var3 = var0.getClass();
         Field[] var4 = var3.getFields();
         int var5 = var4.length;
         if (var5 == 0) {
            return null;
         } else {
            String[] var6 = new String[var5];

            for (int var7 = 0; var7 < var5; var7++) {
               var6[var7] = var4[var7].getName();
            }

            return var6;
         }
      }
   }

   public String method21773(String var1) throws Class2499 {
      Object var4 = this.method21761(var1);
      if (!(var4 instanceof String)) {
         throw new Class2499("JSONObject[" + method21809(var1) + "] not a string.");
      } else {
         return (String)var4;
      }
   }

   public boolean has(String var1) {
      return this.field30341.containsKey(var1);
   }

   public JSONObject method21775(String var1) throws Class2499 {
      Object var4 = this.method21782(var1);
      if (var4 != null) {
         if (!(var4 instanceof BigInteger)) {
            if (!(var4 instanceof BigDecimal)) {
               if (!(var4 instanceof Integer)) {
                  if (!(var4 instanceof Long)) {
                     if (!(var4 instanceof Double)) {
                        if (!(var4 instanceof Float)) {
                           throw new Class2499("Unable to increment [" + method21809(var1) + "].");
                        }

                        this.method21802(var1, (double)((Float)var4 + 1.0F));
                     } else {
                        this.method21802(var1, (Double)var4 + 1.0);
                     }
                  } else {
                     this.method21804(var1, (Long)var4 + 1L);
                  }
               } else {
                  this.method21803(var1, (Integer)var4 + 1);
               }
            } else {
               this.method21806(var1, ((BigDecimal)var4).add(BigDecimal.ONE));
            }
         } else {
            this.method21806(var1, ((BigInteger)var4).add(BigInteger.ONE));
         }
      } else {
         this.method21803(var1, 1);
      }

      return this;
   }

   public boolean method21776(String var1) {
      return field30342.equals(this.method21782(var1));
   }

   public Iterator<String> method21777() {
      return this.method21778().iterator();
   }

   public Set<String> method21778() {
      return this.field30341.keySet();
   }

   public int method21779() {
      return this.field30341.size();
   }

   public Class2344 method21780() {
      Class2344 var3 = new Class2344();
      Iterator var4 = this.method21777();

      while (var4.hasNext()) {
         var3.method9158(var4.next());
      }

      return var3.method9134() != 0 ? var3 : null;
   }

   public static String method21781(Number var0) throws Class2499 {
      if (var0 == null) {
         throw new Class2499("Null pointer");
      } else {
         method21814(var0);
         String var3 = var0.toString();
         if (var3.indexOf(46) > 0 && var3.indexOf(101) < 0 && var3.indexOf(69) < 0) {
            while (var3.endsWith("0")) {
               var3 = var3.substring(0, var3.length() - 1);
            }

            if (var3.endsWith(".")) {
               var3 = var3.substring(0, var3.length() - 1);
            }
         }

         return var3;
      }
   }

   public Object method21782(String var1) {
      return var1 != null ? this.field30341.get(var1) : null;
   }

   public <E extends Enum<E>> E method21783(Class<E> var1, String var2) {
      return this.<E>method21784(var1, var2, null);
   }

   public <E extends Enum<E>> E method21784(Class<E> var1, String var2, E var3) {
      try {
         Object var6 = this.method21782(var2);
         if (field30342.equals(var6)) {
            return (E)var3;
         } else {
            return (E)(var1.isAssignableFrom(var6.getClass()) ? var6 : Enum.<E>valueOf(var1, var6.toString()));
         }
      } catch (NullPointerException | IllegalArgumentException var8) {
         return (E)var3;
      }
   }

   public boolean method21785(String var1) {
      return this.method21786(var1, false);
   }

   public boolean method21786(String var1, boolean var2) {
      try {
         return this.method21763(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public double method21787(String var1) {
      return this.method21790(var1, Double.NaN);
   }

   public BigInteger method21788(String var1, BigInteger var2) {
      try {
         return this.method21764(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public BigDecimal method21789(String var1, BigDecimal var2) {
      try {
         return this.method21765(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public double method21790(String var1, double var2) {
      try {
         return this.method21766(var1);
      } catch (Exception var7) {
         return var2;
      }
   }

   public int method21791(String var1) {
      return this.method21792(var1, 0);
   }

   public int method21792(String var1, int var2) {
      try {
         return this.method21767(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public Class2344 method21793(String var1) {
      Object var4 = this.method21782(var1);
      return !(var4 instanceof Class2344) ? null : (Class2344)var4;
   }

   public JSONObject method21794(String var1) {
      Object var4 = this.method21782(var1);
      return !(var4 instanceof JSONObject) ? null : (JSONObject)var4;
   }

   public long method21795(String var1) {
      return this.method21796(var1, 0L);
   }

   public long method21796(String var1, long var2) {
      try {
         return this.method21770(var1);
      } catch (Exception var7) {
         return var2;
      }
   }

   public String method21797(String var1) {
      return this.method21798(var1, "");
   }

   public String method21798(String var1, String var2) {
      Object var5 = this.method21782(var1);
      return !field30342.equals(var5) ? var5.toString() : var2;
   }

   private void method21799(Object var1) {
      Class var4 = var1.getClass();
      boolean var5 = var4.getClassLoader() != null;
      Method[] var6 = var5 ? var4.getMethods() : var4.getDeclaredMethods();

      for (int var7 = 0; var7 < var6.length; var7++) {
         try {
            Method var8 = var6[var7];
            if (Modifier.isPublic(var8.getModifiers())) {
               String var9 = var8.getName();
               String var10 = "";
               if (var9.startsWith("get")) {
                  if (!"getClass".equals(var9) && !"getDeclaringClass".equals(var9)) {
                     var10 = var9.substring(3);
                  } else {
                     var10 = "";
                  }
               } else if (var9.startsWith("is")) {
                  var10 = var9.substring(2);
               }

               if (var10.length() > 0 && Character.isUpperCase(var10.charAt(0)) && var8.getParameterTypes().length == 0) {
                  if (var10.length() == 1) {
                     var10 = var10.toLowerCase();
                  } else if (!Character.isUpperCase(var10.charAt(1))) {
                     var10 = var10.substring(0, 1).toLowerCase() + var10.substring(1);
                  }

                  Object var11 = var8.invoke(var1, (Object[])null);
                  if (var11 != null) {
                     this.field30341.put(var10, method21817(var11));
                  }
               }
            }
         } catch (Exception var12) {
         }
      }
   }

   public JSONObject method21800(String var1, boolean var2) {
      this.method21806(var1, !var2 ? Boolean.FALSE : Boolean.TRUE);
      return this;
   }

   public JSONObject method21801(String var1, Collection<?> var2) {
      this.method21806(var1, new Class2344(var2));
      return this;
   }

   public JSONObject method21802(String var1, double var2) {
      this.method21806(var1, new Double(var2));
      return this;
   }

   public JSONObject method21803(String var1, int var2) {
      this.method21806(var1, new Integer(var2));
      return this;
   }

   public JSONObject method21804(String var1, long var2) {
      this.method21806(var1, new Long(var2));
      return this;
   }

   public JSONObject method21805(String var1, Map<?, ?> var2) throws Class2499 {
      this.method21806(var1, new JSONObject(var2));
      return this;
   }

   public JSONObject method21806(String var1, Object var2) {
      if (var1 != null) {
         if (var2 == null) {
            this.method21811(var1);
         } else {
            method21814(var2);
            this.field30341.put(var1, var2);
         }

         return this;
      } else {
         throw new NullPointerException("Null key.");
      }
   }

   public JSONObject method21807(String var1, Object var2) throws Class2499 {
      if (var1 != null && var2 != null) {
         if (this.method21782(var1) != null) {
            throw new Class2499("Duplicate key \"" + var1 + "\"");
         }

         this.method21806(var1, var2);
      }

      return this;
   }

   public JSONObject method21808(String var1, Object var2) throws Class2499 {
      if (var1 != null && var2 != null) {
         this.method21806(var1, var2);
      }

      return this;
   }

   public static String method21809(String var0) {
      StringWriter var3 = new StringWriter();
      synchronized (var3.getBuffer()) {
         String var10000;
         try {
            var10000 = method21810(var0, var3).toString();
         } catch (IOException var7) {
            return "";
         }

         return var10000;
      }
   }

   public static Writer method21810(String var0, Writer var1) throws IOException {
      if (var0 != null && var0.length() != 0) {
         char var4 = 0;
         int var5 = var0.length();
         var1.write(34);

         for (int var6 = 0; var6 < var5; var6++) {
            char var7 = var4;
            var4 = var0.charAt(var6);
            switch (var4) {
               case '\b':
                  var1.write("\\b");
                  break;
               case '\t':
                  var1.write("\\t");
                  break;
               case '\n':
                  var1.write("\\n");
                  break;
               case '\f':
                  var1.write("\\f");
                  break;
               case '\r':
                  var1.write("\\r");
                  break;
               case '"':
               case '\\':
                  var1.write(92);
                  var1.write(var4);
                  break;
               case '/':
                  if (var7 == '<') {
                     var1.write(92);
                  }

                  var1.write(var4);
                  break;
               default:
                  if (var4 >= ' ' && (var4 < 128 || var4 >= 160) && (var4 < 8192 || var4 >= 8448)) {
                     var1.write(var4);
                  } else {
                     var1.write("\\u");
                     String var8 = Integer.toHexString(var4);
                     var1.write("0000", 0, 4 - var8.length());
                     var1.write(var8);
                  }
            }
         }

         var1.write(34);
         return var1;
      } else {
         var1.write("\"\"");
         return var1;
      }
   }

   public Object method21811(String var1) {
      return this.field30341.remove(var1);
   }

   public boolean method21812(Object var1) {
      try {
         if (!(var1 instanceof JSONObject)) {
            return false;
         } else {
            Set<String> var4 = this.method21778();
            if (!var4.equals(((JSONObject)var1).method21778())) {
               return false;
            } else {
               for (String var6 : var4) {
                  Object var7 = this.method21761(var6);
                  Object var8 = ((JSONObject)var1).method21761(var6);
                  if (var7 instanceof JSONObject) {
                     if (!((JSONObject)var7).method21812(var8)) {
                        return false;
                     }
                  } else if (var7 instanceof Class2344) {
                     if (!((Class2344)var7).method9167(var8)) {
                        return false;
                     }
                  } else if (!var7.equals(var8)) {
                     return false;
                  }
               }

               return true;
            }
         }
      } catch (Throwable var9) {
         return false;
      }
   }

   public static Object method21813(String var0) {
      if (var0.equals("")) {
         return var0;
      } else if (var0.equalsIgnoreCase("true")) {
         return Boolean.TRUE;
      } else if (var0.equalsIgnoreCase("false")) {
         return Boolean.FALSE;
      } else if (var0.equalsIgnoreCase("null")) {
         return field30342;
      } else {
         char var3 = var0.charAt(0);
         if (var3 >= '0' && var3 <= '9' || var3 == '-') {
            try {
               if (var0.indexOf(46) <= -1 && var0.indexOf(101) <= -1 && var0.indexOf(69) <= -1) {
                  Long var5 = new Long(var0);
                  if (var0.equals(var5.toString())) {
                     if (var5 == (long)var5.intValue()) {
                        return var5.intValue();
                     }

                     return var5;
                  }
               } else {
                  Double var4 = Double.valueOf(var0);
                  if (!var4.isInfinite() && !var4.isNaN()) {
                     return var4;
                  }
               }
            } catch (Exception var6) {
            }
         }

         return var0;
      }
   }

   public static void method21814(Object var0) {
      if (var0 != null) {
         if (!(var0 instanceof Double)) {
            if (var0 instanceof Float && (((Float)var0).isInfinite() || ((Float)var0).isNaN())) {
               throw new Class2499("JSON does not allow non-finite numbers.");
            }
         } else if (((Double)var0).isInfinite() || ((Double)var0).isNaN()) {
            throw new Class2499("JSON does not allow non-finite numbers.");
         }
      }
   }

   public Class2344 method21815(Class2344 var1) throws Class2455 {
      if (var1 != null && var1.method9134() != 0) {
         Class2344 var4 = new Class2344();

         for (int var5 = 0; var5 < var1.method9134(); var5++) {
            var4.method9158(this.method21782(var1.method9131(var5)));
         }

         return var4;
      } else {
         return null;
      }
   }

   @Override
   public String toString() {
      try {
         return this.toString(0);
      } catch (Exception var4) {
         return null;
      }
   }

   public String toString(int var1) throws Class2499 {
      StringWriter var4 = new StringWriter();
      synchronized (var4.getBuffer()) {
         return this.method21821(var4, var1, 0).toString();
      }
   }

   public static String method21816(Object var0) throws Class2455 {
      if (var0 == null || var0.equals(null)) {
         return "null";
      } else if (var0 instanceof Class9093) {
         String var7;
         try {
            var7 = ((Class9093)var0).method33920();
         } catch (Exception var5) {
            throw new Class2499(var5);
         }

         if (var7 instanceof String) {
            return var7;
         } else {
            throw new Class2499("Bad value from toJSONString: " + var7);
         }
      } else if (var0 instanceof Number) {
         return method21781((Number)var0);
      } else if (var0 instanceof Boolean || var0 instanceof JSONObject || var0 instanceof Class2344) {
         return var0.toString();
      } else if (var0 instanceof Map) {
         Map var6 = (Map)var0;
         return new JSONObject(var6).toString();
      } else if (var0 instanceof Collection) {
         Collection var3 = (Collection)var0;
         return new Class2344(var3).toString();
      } else {
         return var0.getClass().isArray() ? new Class2344(var0).toString() : method21809(var0.toString());
      }
   }

   public static Object method21817(Object var0) {
      try {
         if (var0 == null) {
            return field30342;
         } else if (var0 instanceof JSONObject
            || var0 instanceof Class2344
            || field30342.equals(var0)
            || var0 instanceof Class9093
            || var0 instanceof Byte
            || var0 instanceof Character
            || var0 instanceof Short
            || var0 instanceof Integer
            || var0 instanceof Long
            || var0 instanceof Boolean
            || var0 instanceof Float
            || var0 instanceof Double
            || var0 instanceof String
            || var0 instanceof BigInteger
            || var0 instanceof BigDecimal) {
            return var0;
         } else if (var0 instanceof Collection) {
            Collection var7 = (Collection)var0;
            return new Class2344(var7);
         } else if (var0.getClass().isArray()) {
            return new Class2344(var0);
         } else if (var0 instanceof Map) {
            Map var6 = (Map)var0;
            return new JSONObject(var6);
         } else {
            Package var3 = var0.getClass().getPackage();
            String var4 = var3 != null ? var3.getName() : "";
            return !var4.startsWith("java.") && !var4.startsWith("javax.") && var0.getClass().getClassLoader() != null ? new JSONObject(var0) : var0.toString();
         }
      } catch (Exception var5) {
         return null;
      }
   }

   public Writer method21818(Writer var1) throws Class2499 {
      return this.method21821(var1, 0, 0);
   }

   public static final Writer method21819(Writer var0, Object var1, int var2, int var3) throws Class2499, IOException {
      if (var1 == null || var1.equals(null)) {
         var0.write("null");
      } else if (var1 instanceof JSONObject) {
         ((JSONObject)var1).method21821(var0, var2, var3);
      } else if (var1 instanceof Class2344) {
         ((Class2344)var1).method9170(var0, var2, var3);
      } else if (var1 instanceof Map) {
         Map var6 = (Map)var1;
         new JSONObject(var6).method21821(var0, var2, var3);
      } else if (var1 instanceof Collection) {
         Collection var9 = (Collection)var1;
         new Class2344(var9).method9170(var0, var2, var3);
      } else if (var1.getClass().isArray()) {
         new Class2344(var1).method9170(var0, var2, var3);
      } else if (var1 instanceof Number) {
         var0.write(method21781((Number)var1));
      } else if (var1 instanceof Boolean) {
         var0.write(var1.toString());
      } else if (var1 instanceof Class9093) {
         String var10;
         try {
            var10 = ((Class9093)var1).method33920();
         } catch (Exception var8) {
            throw new Class2499(var8);
         }

         var0.write(var10 != null ? var10.toString() : method21809(var1.toString()));
      } else {
         method21810(var1.toString(), var0);
      }

      return var0;
   }

   public static final void method21820(Writer var0, int var1) throws IOException {
      for (int var4 = 0; var4 < var1; var4++) {
         var0.write(32);
      }
   }

   public Writer method21821(Writer var1, int var2, int var3) throws Class2499 {
      try {
         boolean var6 = false;
         int var7 = this.method21779();
         Iterator var8 = this.method21777();
         var1.write(123);
         if (var7 == 1) {
            Object var9 = var8.next();
            var1.write(method21809(var9.toString()));
            var1.write(58);
            if (var2 > 0) {
               var1.write(32);
            }

            method21819(var1, this.field30341.get(var9), var2, var3);
         } else if (var7 != 0) {
            for (int var12 = var3 + var2; var8.hasNext(); var6 = true) {
               Object var10 = var8.next();
               if (var6) {
                  var1.write(44);
               }

               if (var2 > 0) {
                  var1.write(10);
               }

               method21820(var1, var12);
               var1.write(method21809(var10.toString()));
               var1.write(58);
               if (var2 > 0) {
                  var1.write(32);
               }

               method21819(var1, this.field30341.get(var10), var2, var12);
            }

            if (var2 > 0) {
               var1.write(10);
            }

            method21820(var1, var3);
         }

         var1.write(125);
         return var1;
      } catch (IOException var11) {
         throw new Class2499(var11);
      }
   }
}
