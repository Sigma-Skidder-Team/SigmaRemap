package remapped;

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
import org.json.JSONException;

public class class_1293 {
   private final Map<String, Object> field_7113 = new HashMap<String, Object>();
   public static final Object field_7112 = new class_8731(null);

   public class_1293() {
   }

   public class_1293(class_1293 var1, String[] var2) {
      this();

      for (int var5 = 0; var5 < var2.length; var5++) {
         try {
            this.method_5811(var2[var5], var1.method_5865(var2[var5]));
         } catch (Exception var7) {
         }
      }
   }

   public class_1293(class_3734 var1) throws JSONException {
      this();
      if (var1.method_17301() != '{') {
         throw var1.method_17292("A JSONObject text must begin with '{'");
      } else {
         while (true) {
            char var4 = var1.method_17301();
            switch (var4) {
               case '\u0000':
                  throw var1.method_17292("A JSONObject text must end with '}'");
               case '}':
                  return;
            }

            var1.method_17299();
            String var5 = var1.method_17288().toString();
            var4 = var1.method_17301();
            if (var4 != ':') {
               throw var1.method_17292("Expected a ':' after a key");
            }

            this.method_5811(var5, var1.method_17288());
            switch (var1.method_17301()) {
               case ',':
               case ';':
                  if (var1.method_17301() == '}') {
                     return;
                  }

                  var1.method_17299();
                  break;
               case '}':
                  return;
               default:
                  throw var1.method_17292("Expected a ',' or '}'");
            }
         }
      }
   }

   public class_1293(Map<?, ?> var1) {
      if (var1 != null) {
         for (Entry var5 : var1.entrySet()) {
            Object var6 = var5.getValue();
            if (var6 != null) {
               this.field_7113.put(String.valueOf(var5.getKey()), method_5856(var6));
            }
         }
      }
   }

   public class_1293(Object var1) {
      this();
      this.method_5830(var1);
   }

   public class_1293(Object var1, String[] var2) {
      this();
      Class var5 = var1.getClass();

      for (int var6 = 0; var6 < var2.length; var6++) {
         String var7 = var2[var6];

         try {
            this.method_5863(var7, var5.getField(var7).get(var1));
         } catch (Exception var9) {
         }
      }
   }

   public class_1293(String var1) throws JSONException {
      this(new class_3734(var1));
   }

   public class_1293(String var1, Locale var2) throws JSONException {
      this();
      ResourceBundle var5 = ResourceBundle.getBundle(var1, var2, Thread.currentThread().getContextClassLoader());
      Enumeration var6 = var5.getKeys();

      while (var6.hasMoreElements()) {
         Object var7 = var6.nextElement();
         if (var7 != null) {
            String[] var8 = ((String)var7).split("\\.");
            int var9 = var8.length - 1;
            class_1293 var10 = this;

            for (int var11 = 0; var11 < var9; var11++) {
               String var12 = var8[var11];
               class_1293 var13 = var10.method_5858(var12);
               if (var13 == null) {
                  var13 = new class_1293();
                  var10.method_5820(var12, var13);
               }

               var10 = var13;
            }

            var10.method_5820(var8[var9], var5.getString((String)var7));
         }
      }
   }

   public class_1293 method_5842(String var1, Object var2) throws JSONException {
      method_5862(var2);
      Object var5 = this.method_5865(var1);
      if (var5 != null) {
         if (!(var5 instanceof class_1336)) {
            this.method_5820(var1, new class_1336().method_6159(var5).method_6159(var2));
         } else {
            ((class_1336)var5).method_6159(var2);
         }
      } else {
         this.method_5820(var1, !(var2 instanceof class_1336) ? var2 : new class_1336().method_6159(var2));
      }

      return this;
   }

   public class_1293 method_5837(String var1, Object var2) throws JSONException {
      method_5862(var2);
      Object var5 = this.method_5865(var1);
      if (var5 != null) {
         if (!(var5 instanceof class_1336)) {
            throw new class_7584("JSONObject[" + var1 + "] is not a JSONArray.");
         }

         this.method_5820(var1, ((class_1336)var5).method_6159(var2));
      } else {
         this.method_5820(var1, new class_1336().method_6159(var2));
      }

      return this;
   }

   public static String method_5834(double var0) {
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

   public Object method_5805(String var1) throws JSONException {
      if (var1 != null) {
         Object var4 = this.method_5865(var1);
         if (var4 != null) {
            return var4;
         } else {
            throw new class_7584("JSONObject[" + method_5859(var1) + "] not found.");
         }
      } else {
         throw new class_7584("Null key.");
      }
   }

   public <E extends Enum<E>> E method_5832(Class<E> var1, String var2) throws JSONException {
      Enum var5 = this.<Enum>method_5846(var1, var2);
      if (var5 != null) {
         return (E)var5;
      } else {
         throw new class_7584("JSONObject[" + method_5859(var2) + "] is not an enum of type " + method_5859(var1.getSimpleName()) + ".");
      }
   }

   public boolean method_5826(String var1) throws JSONException {
      Object var4 = this.method_5805(var1);
      if (!var4.equals(Boolean.FALSE) && (!(var4 instanceof String) || !((String)var4).equalsIgnoreCase("false"))) {
         if (!var4.equals(Boolean.TRUE) && (!(var4 instanceof String) || !((String)var4).equalsIgnoreCase("true"))) {
            throw new class_7584("JSONObject[" + method_5859(var1) + "] is not a Boolean.");
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public BigInteger method_5857(String var1) throws JSONException {
      Object var4 = this.method_5805(var1);

      try {
         return new BigInteger(var4.toString());
      } catch (Exception var6) {
         throw new class_7584("JSONObject[" + method_5859(var1) + "] could not be converted to BigInteger.");
      }
   }

   public BigDecimal method_5812(String var1) throws JSONException {
      Object var4 = this.method_5805(var1);

      try {
         return new BigDecimal(var4.toString());
      } catch (Exception var6) {
         throw new class_7584("JSONObject[" + method_5859(var1) + "] could not be converted to BigDecimal.");
      }
   }

   public double method_5808(String var1) throws JSONException {
      Object var4 = this.method_5805(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).doubleValue() : Double.parseDouble((String)var4);
      } catch (Exception var6) {
         throw new class_7584("JSONObject[" + method_5859(var1) + "] is not a number.");
      }
   }

   public int method_5813(String var1) throws JSONException {
      Object var4 = this.method_5805(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).intValue() : Integer.parseInt((String)var4);
      } catch (Exception var6) {
         throw new class_7584("JSONObject[" + method_5859(var1) + "] is not an int.");
      }
   }

   public class_1336 method_5849(String var1) throws JSONException {
      Object var4 = this.method_5805(var1);
      if (!(var4 instanceof class_1336)) {
         throw new class_7584("JSONObject[" + method_5859(var1) + "] is not a JSONArray.");
      } else {
         return (class_1336)var4;
      }
   }

   public class_1293 method_5848(String var1) throws JSONException {
      Object var4 = this.method_5805(var1);
      if (!(var4 instanceof class_1293)) {
         throw new class_7584("JSONObject[" + method_5859(var1) + "] is not a JSONObject.");
      } else {
         return (class_1293)var4;
      }
   }

   public long method_5840(String var1) throws JSONException {
      Object var4 = this.method_5805(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).longValue() : Long.parseLong((String)var4);
      } catch (Exception var6) {
         throw new class_7584("JSONObject[" + method_5859(var1) + "] is not a long.");
      }
   }

   public static String[] method_5854(class_1293 var0) {
      int var3 = var0.method_5806();
      if (var3 == 0) {
         return null;
      } else {
         Iterator var4 = var0.method_5841();
         String[] var5 = new String[var3];

         for (int var6 = 0; var4.hasNext(); var6++) {
            var5[var6] = (String)var4.next();
         }

         return var5;
      }
   }

   public static String[] method_5853(Object var0) {
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

   public String method_5861(String var1) throws JSONException {
      Object var4 = this.method_5805(var1);
      if (!(var4 instanceof String)) {
         throw new class_7584("JSONObject[" + method_5859(var1) + "] not a string.");
      } else {
         return (String)var4;
      }
   }

   public boolean method_5850(String var1) {
      return this.field_7113.containsKey(var1);
   }

   public class_1293 method_5807(String var1) throws JSONException {
      Object var4 = this.method_5865(var1);
      if (var4 != null) {
         if (!(var4 instanceof BigInteger)) {
            if (!(var4 instanceof BigDecimal)) {
               if (!(var4 instanceof Integer)) {
                  if (!(var4 instanceof Long)) {
                     if (!(var4 instanceof Double)) {
                        if (!(var4 instanceof Float)) {
                           throw new class_7584("Unable to increment [" + method_5859(var1) + "].");
                        }

                        this.method_5817(var1, (double)((Float)var4 + 1.0F));
                     } else {
                        this.method_5817(var1, (Double)var4 + 1.0);
                     }
                  } else {
                     this.method_5819(var1, (Long)var4 + 1L);
                  }
               } else {
                  this.method_5818(var1, (Integer)var4 + 1);
               }
            } else {
               this.method_5820(var1, ((BigDecimal)var4).add(BigDecimal.ONE));
            }
         } else {
            this.method_5820(var1, ((BigInteger)var4).add(BigInteger.ONE));
         }
      } else {
         this.method_5818(var1, 1);
      }

      return this;
   }

   public boolean method_5855(String var1) {
      return field_7112.equals(this.method_5865(var1));
   }

   public Iterator<String> method_5841() {
      return this.method_5831().iterator();
   }

   public Set<String> method_5831() {
      return this.field_7113.keySet();
   }

   public int method_5806() {
      return this.field_7113.size();
   }

   public class_1336 method_5815() {
      class_1336 var3 = new class_1336();
      Iterator var4 = this.method_5841();

      while (var4.hasNext()) {
         var3.method_6159(var4.next());
      }

      return var3.method_6142() != 0 ? var3 : null;
   }

   public static String method_5866(Number var0) throws JSONException {
      if (var0 == null) {
         throw new class_7584("Null pointer");
      } else {
         method_5862(var0);
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

   public Object method_5865(String var1) {
      return var1 != null ? this.field_7113.get(var1) : null;
   }

   public <E extends Enum<E>> E method_5846(Class<E> var1, String var2) {
      return this.<E>method_5847(var1, var2, null);
   }

   public <E extends Enum<E>> E method_5847(Class<E> var1, String var2, E var3) {
      try {
         Object var6 = this.method_5865(var2);
         if (field_7112.equals(var6)) {
            return (E)var3;
         } else {
            return (E)(var1.isAssignableFrom(var6.getClass()) ? var6 : Enum.<E>valueOf(var1, var6.toString()));
         }
      } catch (NullPointerException | IllegalArgumentException var8) {
         return (E)var3;
      }
   }

   public boolean method_5867(String var1) {
      return this.method_5868(var1, false);
   }

   public boolean method_5868(String var1, boolean var2) {
      try {
         return this.method_5826(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public double method_5838(String var1) {
      return this.method_5839(var1, Double.NaN);
   }

   public BigInteger method_5814(String var1, BigInteger var2) {
      try {
         return this.method_5857(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public BigDecimal method_5835(String var1, BigDecimal var2) {
      try {
         return this.method_5812(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public double method_5839(String var1, double var2) {
      try {
         return this.method_5808(var1);
      } catch (Exception var7) {
         return var2;
      }
   }

   public int method_5824(String var1) {
      return this.method_5825(var1, 0);
   }

   public int method_5825(String var1, int var2) {
      try {
         return this.method_5813(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public class_1336 method_5809(String var1) {
      Object var4 = this.method_5865(var1);
      return !(var4 instanceof class_1336) ? null : (class_1336)var4;
   }

   public class_1293 method_5858(String var1) {
      Object var4 = this.method_5865(var1);
      return !(var4 instanceof class_1293) ? null : (class_1293)var4;
   }

   public long method_5843(String var1) {
      return this.method_5844(var1, 0L);
   }

   public long method_5844(String var1, long var2) {
      try {
         return this.method_5840(var1);
      } catch (Exception var7) {
         return var2;
      }
   }

   public String method_5851(String var1) {
      return this.method_5852(var1, "");
   }

   public String method_5852(String var1, String var2) {
      Object var5 = this.method_5865(var1);
      return !field_7112.equals(var5) ? var5.toString() : var2;
   }

   private void method_5830(Object var1) {
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
                     this.field_7113.put(var10, method_5856(var11));
                  }
               }
            }
         } catch (Exception var12) {
         }
      }
   }

   public class_1293 method_5823(String var1, boolean var2) throws JSONException {
      this.method_5820(var1, !var2 ? Boolean.FALSE : Boolean.TRUE);
      return this;
   }

   public class_1293 method_5821(String var1, Collection<?> var2) throws JSONException {
      this.method_5820(var1, new class_1336(var2));
      return this;
   }

   public class_1293 method_5817(String var1, double var2) throws JSONException {
      this.method_5820(var1, new Double(var2));
      return this;
   }

   public class_1293 method_5818(String var1, int var2) throws JSONException {
      this.method_5820(var1, new Integer(var2));
      return this;
   }

   public class_1293 method_5819(String var1, long var2) throws JSONException {
      this.method_5820(var1, new Long(var2));
      return this;
   }

   public class_1293 method_5822(String var1, Map<?, ?> var2) throws JSONException {
      this.method_5820(var1, new class_1293(var2));
      return this;
   }

   public class_1293 method_5820(String var1, Object var2) throws JSONException {
      if (var1 != null) {
         if (var2 == null) {
            this.method_5816(var1);
         } else {
            method_5862(var2);
            this.field_7113.put(var1, var2);
         }

         return this;
      } else {
         throw new NullPointerException("Null key.");
      }
   }

   public class_1293 method_5811(String var1, Object var2) throws JSONException {
      if (var1 != null && var2 != null) {
         if (this.method_5865(var1) != null) {
            throw new class_7584("Duplicate key \"" + var1 + "\"");
         }

         this.method_5820(var1, var2);
      }

      return this;
   }

   public class_1293 method_5863(String var1, Object var2) throws JSONException {
      if (var1 != null && var2 != null) {
         this.method_5820(var1, var2);
      }

      return this;
   }

   public static String method_5859(String var0) {
      StringWriter var3 = new StringWriter();
      synchronized (var3.getBuffer()) {
         String var10000;
         try {
            var10000 = method_5860(var0, var3).toString();
         } catch (IOException var7) {
            return "";
         }

         return var10000;
      }
   }

   public static Writer method_5860(String var0, Writer var1) throws IOException {
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

   public Object method_5816(String var1) {
      return this.field_7113.remove(var1);
   }

   public boolean method_5833(Object var1) {
      try {
         if (!(var1 instanceof class_1293)) {
            return false;
         } else {
            Set var4 = this.method_5831();
            if (!var4.equals(((class_1293)var1).method_5831())) {
               return false;
            } else {
               for (String var6 : var4) {
                  Object var7 = this.method_5805(var6);
                  Object var8 = ((class_1293)var1).method_5805(var6);
                  if (var7 instanceof class_1293) {
                     if (!((class_1293)var7).method_5833(var8)) {
                        return false;
                     }
                  } else if (var7 instanceof class_1336) {
                     if (!((class_1336)var7).method_6145(var8)) {
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

   public static Object method_5836(String var0) {
      if (var0.equals("")) {
         return var0;
      } else if (var0.equalsIgnoreCase("true")) {
         return Boolean.TRUE;
      } else if (var0.equalsIgnoreCase("false")) {
         return Boolean.FALSE;
      } else if (var0.equalsIgnoreCase("null")) {
         return field_7112;
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

   public static void method_5862(Object var0) throws JSONException {
      if (var0 != null) {
         if (!(var0 instanceof Double)) {
            if (var0 instanceof Float && (((Float)var0).isInfinite() || ((Float)var0).isNaN())) {
               throw new class_7584("JSON does not allow non-finite numbers.");
            }
         } else if (((Double)var0).isInfinite() || ((Double)var0).isNaN()) {
            throw new class_7584("JSON does not allow non-finite numbers.");
         }
      }
   }

   public class_1336 method_5864(class_1336 var1) throws JSONException {
      if (var1 != null && var1.method_6142() != 0) {
         class_1336 var4 = new class_1336();

         for (int var5 = 0; var5 < var1.method_6142(); var5++) {
            var4.method_6159(this.method_5865(var1.method_6133(var5)));
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

   public String toString(int var1) throws JSONException {
      StringWriter var4 = new StringWriter();
      synchronized (var4.getBuffer()) {
         return this.method_5829(var4, var1, 0).toString();
      }
   }

   public static String method_5827(Object var0) throws JSONException {
      if (var0 == null || var0.equals(null)) {
         return "null";
      } else if (var0 instanceof class_6981) {
         String var7;
         try {
            var7 = ((class_6981)var0).method_31933();
         } catch (Exception var5) {
            throw new class_7584(var5);
         }

         if (var7 instanceof String) {
            return var7;
         } else {
            throw new class_7584("Bad value from toJSONString: " + var7);
         }
      } else if (var0 instanceof Number) {
         return method_5866((Number)var0);
      } else if (var0 instanceof Boolean || var0 instanceof class_1293 || var0 instanceof class_1336) {
         return var0.toString();
      } else if (var0 instanceof Map) {
         Map var6 = (Map)var0;
         return new class_1293(var6).toString();
      } else if (var0 instanceof Collection) {
         Collection var3 = (Collection)var0;
         return new class_1336(var3).toString();
      } else {
         return var0.getClass().isArray() ? new class_1336(var0).toString() : method_5859(var0.toString());
      }
   }

   public static Object method_5856(Object var0) {
      try {
         if (var0 == null) {
            return field_7112;
         } else if (var0 instanceof class_1293
            || var0 instanceof class_1336
            || field_7112.equals(var0)
            || var0 instanceof class_6981
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
            return new class_1336(var7);
         } else if (var0.getClass().isArray()) {
            return new class_1336(var0);
         } else if (var0 instanceof Map) {
            Map var6 = (Map)var0;
            return new class_1293(var6);
         } else {
            Package var3 = var0.getClass().getPackage();
            String var4 = var3 != null ? var3.getName() : "";
            return !var4.startsWith("java.") && !var4.startsWith("javax.") && var0.getClass().getClassLoader() != null ? new class_1293(var0) : var0.toString();
         }
      } catch (Exception var5) {
         return null;
      }
   }

   public Writer method_5828(Writer var1) throws JSONException {
      return this.method_5829(var1, 0, 0);
   }

   public static final Writer method_5804(Writer var0, Object var1, int var2, int var3) throws JSONException, IOException {
      if (var1 == null || var1.equals(null)) {
         var0.write("null");
      } else if (var1 instanceof class_1293) {
         ((class_1293)var1).method_5829(var0, var2, var3);
      } else if (var1 instanceof class_1336) {
         ((class_1336)var1).method_6128(var0, var2, var3);
      } else if (var1 instanceof Map) {
         Map var6 = (Map)var1;
         new class_1293(var6).method_5829(var0, var2, var3);
      } else if (var1 instanceof Collection) {
         Collection var9 = (Collection)var1;
         new class_1336(var9).method_6128(var0, var2, var3);
      } else if (var1.getClass().isArray()) {
         new class_1336(var1).method_6128(var0, var2, var3);
      } else if (var1 instanceof Number) {
         var0.write(method_5866((Number)var1));
      } else if (var1 instanceof Boolean) {
         var0.write(var1.toString());
      } else if (var1 instanceof class_6981) {
         String var10;
         try {
            var10 = ((class_6981)var1).method_31933();
         } catch (Exception var8) {
            throw new class_7584(var8);
         }

         var0.write(var10 != null ? var10.toString() : method_5859(var1.toString()));
      } else {
         method_5860(var1.toString(), var0);
      }

      return var0;
   }

   public static final void method_5845(Writer var0, int var1) throws IOException {
      for (int var4 = 0; var4 < var1; var4++) {
         var0.write(32);
      }
   }

   public Writer method_5829(Writer var1, int var2, int var3) throws JSONException {
      try {
         boolean var6 = false;
         int var7 = this.method_5806();
         Iterator var8 = this.method_5841();
         var1.write(123);
         if (var7 == 1) {
            Object var9 = var8.next();
            var1.write(method_5859(var9.toString()));
            var1.write(58);
            if (var2 > 0) {
               var1.write(32);
            }

            method_5804(var1, this.field_7113.get(var9), var2, var3);
         } else if (var7 != 0) {
            for (int var12 = var3 + var2; var8.hasNext(); var6 = true) {
               Object var10 = var8.next();
               if (var6) {
                  var1.write(44);
               }

               if (var2 > 0) {
                  var1.write(10);
               }

               method_5845(var1, var12);
               var1.write(method_5859(var10.toString()));
               var1.write(58);
               if (var2 > 0) {
                  var1.write(32);
               }

               method_5804(var1, this.field_7113.get(var10), var2, var12);
            }

            if (var2 > 0) {
               var1.write(10);
            }

            method_5845(var1, var3);
         }

         var1.write(125);
         return var1;
      } catch (IOException var11) {
         throw new class_7584(var11);
      }
   }
}
