package remapped;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;

public class JSONArray implements Iterable<Object> {
   private final ArrayList<Object> field_7324 = new ArrayList<Object>();

   public JSONArray() {
   }

   public JSONArray(class_3734 var1) throws JSONException {
      this();
      if (var1.method_17301() != '[') {
         throw var1.method_17292("A JSONArray text must start with '['");
      } else if (var1.method_17301() != ']') {
         var1.method_17299();

         while (true) {
            if (var1.method_17301() == ',') {
               var1.method_17299();
               this.field_7324.add(JSONObjectImpl.field_7112);
            } else {
               var1.method_17299();
               this.field_7324.add(var1.method_17288());
            }

            switch (var1.method_17301()) {
               case ',':
                  if (var1.method_17301() == ']') {
                     return;
                  }

                  var1.method_17299();
                  break;
               case ']':
                  return;
               default:
                  throw var1.method_17292("Expected a ',' or ']'");
            }
         }
      }
   }

   public JSONArray(String var1) throws JSONException {
      this(new class_3734(var1));
   }

   public JSONArray(Collection<?> var1) {
      if (var1 != null) {
         for (Object var5 : var1) {
            this.field_7324.add(JSONObjectImpl.method_5856(var5));
         }
      }
   }

   public JSONArray(Object var1) throws JSONException {
      this();
      if (!var1.getClass().isArray()) {
         throw new class_7584("JSONArray initial value should be a string or collection or array.");
      } else {
         int var4 = Array.getLength(var1);

         for (int var5 = 0; var5 < var4; var5++) {
            this.method_6159(JSONObjectImpl.method_5856(Array.get(var1, var5)));
         }
      }
   }

   @Override
   public Iterator<Object> iterator() {
      return this.field_7324.iterator();
   }

   public Object method_6130(int var1) throws JSONException {
      Object var4 = this.method_6135(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw new class_7584("JSONArray[" + var1 + "] not found.");
      }
   }

   public boolean method_6176(int var1) throws JSONException {
      Object var4 = this.method_6130(var1);
      if (!var4.equals(Boolean.FALSE) && (!(var4 instanceof String) || !((String)var4).equalsIgnoreCase("false"))) {
         if (!var4.equals(Boolean.TRUE) && (!(var4 instanceof String) || !((String)var4).equalsIgnoreCase("true"))) {
            throw new class_7584("JSONArray[" + var1 + "] is not a boolean.");
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public double method_6131(int var1) throws JSONException {
      Object var4 = this.method_6130(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).doubleValue() : Double.parseDouble((String)var4);
      } catch (Exception var6) {
         throw new class_7584("JSONArray[" + var1 + "] is not a number.");
      }
   }

   public <E extends Enum<E>> E method_6168(Class<E> var1, int var2) throws JSONException {
      Enum var5 = this.<Enum>method_6136(var1, var2);
      if (var5 != null) {
         return (E)var5;
      } else {
         throw new class_7584(
            "JSONObject[" + JSONObjectImpl.method_5859(Integer.toString(var2)) + "] is not an enum of type " + JSONObjectImpl.method_5859(var1.getSimpleName()) + "."
         );
      }
   }

   public BigDecimal method_6165(int var1) throws JSONException {
      Object var4 = this.method_6130(var1);

      try {
         return new BigDecimal(var4.toString());
      } catch (Exception var6) {
         throw new class_7584("JSONArray[" + var1 + "] could not convert to BigDecimal.");
      }
   }

   public BigInteger method_6138(int var1) throws JSONException {
      Object var4 = this.method_6130(var1);

      try {
         return new BigInteger(var4.toString());
      } catch (Exception var6) {
         throw new class_7584("JSONArray[" + var1 + "] could not convert to BigInteger.");
      }
   }

   public int method_6126(int var1) throws JSONException {
      Object var4 = this.method_6130(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).intValue() : Integer.parseInt((String)var4);
      } catch (Exception var6) {
         throw new class_7584("JSONArray[" + var1 + "] is not a number.");
      }
   }

   public JSONArray method_6129(int var1) throws JSONException {
      Object var4 = this.method_6130(var1);
      if (!(var4 instanceof JSONArray)) {
         throw new class_7584("JSONArray[" + var1 + "] is not a JSONArray.");
      } else {
         return (JSONArray)var4;
      }
   }

   public JSONObjectImpl method_6143(int var1) throws JSONException {
      Object var4 = this.method_6130(var1);
      if (!(var4 instanceof JSONObjectImpl)) {
         throw new class_7584("JSONArray[" + var1 + "] is not a JSONObject.");
      } else {
         return (JSONObjectImpl)var4;
      }
   }

   public long method_6148(int var1) throws JSONException {
      Object var4 = this.method_6130(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).longValue() : Long.parseLong((String)var4);
      } catch (Exception var6) {
         throw new class_7584("JSONArray[" + var1 + "] is not a number.");
      }
   }

   public String method_6133(int var1) throws JSONException {
      Object var4 = this.method_6130(var1);
      if (!(var4 instanceof String)) {
         throw new class_7584("JSONArray[" + var1 + "] not a string.");
      } else {
         return (String)var4;
      }
   }

   public boolean method_6163(int var1) {
      return JSONObjectImpl.field_7112.equals(this.method_6135(var1));
   }

   public String method_6169(String var1) throws JSONException {
      int var4 = this.method_6142();
      StringBuilder var5 = new StringBuilder();

      for (int var6 = 0; var6 < var4; var6++) {
         if (var6 > 0) {
            var5.append(var1);
         }

         var5.append(JSONObjectImpl.method_5827(this.field_7324.get(var6)));
      }

      return var5.toString();
   }

   public int method_6142() {
      return this.field_7324.size();
   }

   public Object method_6135(int var1) {
      return var1 >= 0 && var1 < this.method_6142() ? this.field_7324.get(var1) : null;
   }

   public boolean method_6146(int var1) {
      return this.method_6147(var1, false);
   }

   public boolean method_6147(int var1, boolean var2) {
      try {
         return this.method_6176(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public double method_6140(int var1) {
      return this.method_6141(var1, Double.NaN);
   }

   public double method_6141(int var1, double var2) {
      try {
         return this.method_6131(var1);
      } catch (Exception var7) {
         return var2;
      }
   }

   public int method_6170(int var1) {
      return this.method_6171(var1, 0);
   }

   public int method_6171(int var1, int var2) {
      try {
         return this.method_6126(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public <E extends Enum<E>> E method_6136(Class<E> var1, int var2) {
      return this.<E>method_6137(var1, var2, null);
   }

   public <E extends Enum<E>> E method_6137(Class<E> var1, int var2, E var3) {
      try {
         Object var6 = this.method_6135(var2);
         if (JSONObjectImpl.field_7112.equals(var6)) {
            return (E)var3;
         } else {
            return (E)(var1.isAssignableFrom(var6.getClass()) ? var6 : Enum.<E>valueOf(var1, var6.toString()));
         }
      } catch (NullPointerException | IllegalArgumentException var8) {
         return (E)var3;
      }
   }

   public BigInteger method_6144(int var1, BigInteger var2) {
      try {
         return this.method_6138(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public BigDecimal method_6139(int var1, BigDecimal var2) {
      try {
         return this.method_6165(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public JSONArray method_6134(int var1) {
      Object var4 = this.method_6135(var1);
      return !(var4 instanceof JSONArray) ? null : (JSONArray)var4;
   }

   public JSONObjectImpl method_6164(int var1) {
      Object var4 = this.method_6135(var1);
      return !(var4 instanceof JSONObjectImpl) ? null : (JSONObjectImpl)var4;
   }

   public long method_6173(int var1) {
      return this.method_6174(var1, 0L);
   }

   public long method_6174(int var1, long var2) {
      try {
         return this.method_6148(var1);
      } catch (Exception var7) {
         return var2;
      }
   }

   public String method_6166(int var1) {
      return this.method_6167(var1, "");
   }

   public String method_6167(int var1, String var2) {
      Object var5 = this.method_6135(var1);
      return !JSONObjectImpl.field_7112.equals(var5) ? var5.toString() : var2;
   }

   public JSONArray method_6162(boolean var1) {
      this.method_6159(!var1 ? Boolean.FALSE : Boolean.TRUE);
      return this;
   }

   public JSONArray method_6160(Collection<?> var1) {
      this.method_6159(new JSONArray(var1));
      return this;
   }

   public JSONArray method_6149(double var1) throws JSONException {
      Double var5 = new Double(var1);
      JSONObjectImpl.method_5862(var5);
      this.method_6159(var5);
      return this;
   }

   public JSONArray method_6150(int var1) {
      this.method_6159(new Integer(var1));
      return this;
   }

   public JSONArray method_6158(long var1) {
      this.method_6159(new Long(var1));
      return this;
   }

   public JSONArray method_6161(Map<?, ?> var1) {
      this.method_6159(new JSONObjectImpl(var1));
      return this;
   }

   public JSONArray method_6159(Object var1) {
      this.field_7324.add(var1);
      return this;
   }

   public JSONArray method_6157(int var1, boolean var2) throws JSONException {
      this.method_6154(var1, !var2 ? Boolean.FALSE : Boolean.TRUE);
      return this;
   }

   public JSONArray method_6155(int var1, Collection<?> var2) throws JSONException {
      this.method_6154(var1, new JSONArray(var2));
      return this;
   }

   public JSONArray method_6151(int var1, double var2) throws JSONException {
      this.method_6154(var1, new Double(var2));
      return this;
   }

   public JSONArray method_6152(int var1, int var2) throws JSONException {
      this.method_6154(var1, new Integer(var2));
      return this;
   }

   public JSONArray method_6153(int var1, long var2) throws JSONException {
      this.method_6154(var1, new Long(var2));
      return this;
   }

   public JSONArray method_6156(int var1, Map<?, ?> var2) throws JSONException {
      this.method_6154(var1, new JSONObjectImpl(var2));
      return this;
   }

   public JSONArray method_6154(int var1, Object var2) throws JSONException {
      JSONObjectImpl.method_5862(var2);
      if (var1 < 0) {
         throw new class_7584("JSONArray[" + var1 + "] not found.");
      } else {
         if (var1 < this.method_6142()) {
            this.field_7324.set(var1, var2);
         } else {
            while (var1 != this.method_6142()) {
               this.method_6159(JSONObjectImpl.field_7112);
            }

            this.method_6159(var2);
         }

         return this;
      }
   }

   public Object method_6172(int var1) {
      return var1 >= 0 && var1 < this.method_6142() ? this.field_7324.remove(var1) : null;
   }

   public boolean method_6145(Object var1) {
      if (var1 instanceof JSONArray) {
         int var4 = this.method_6142();
         if (var4 == ((JSONArray)var1).method_6142()) {
            for (int var5 = 0; var5 < var4; var5++) {
               Object var6 = this.method_6130(var5);
               Object var7 = ((JSONArray)var1).method_6130(var5);
               if (!(var6 instanceof JSONObjectImpl)) {
                  if (!(var6 instanceof JSONArray)) {
                     if (!var6.equals(var7)) {
                        return false;
                     }
                  } else if (!((JSONArray)var6).method_6145(var7)) {
                     return false;
                  }
               } else if (!((JSONObjectImpl)var6).method_5833(var7)) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public JSONObjectImpl method_6132(JSONArray var1) throws JSONException {
      if (var1 != null && var1.method_6142() != 0 && this.method_6142() != 0) {
         JSONObjectImpl var4 = new JSONObjectImpl();

         for (int var5 = 0; var5 < var1.method_6142(); var5++) {
            var4.method_5820(var1.method_6133(var5), this.method_6135(var5));
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
         return this.method_6128(var4, var1, 0).toString();
      }
   }

   public Writer method_6127(Writer var1) throws JSONException {
      return this.method_6128(var1, 0, 0);
   }

   public Writer method_6128(Writer var1, int var2, int var3) throws JSONException {
      try {
         boolean var6 = false;
         int var7 = this.method_6142();
         var1.write(91);
         if (var7 == 1) {
            JSONObjectImpl.method_5804(var1, this.field_7324.get(0), var2, var3);
         } else if (var7 != 0) {
            int var8 = var3 + var2;

            for (int var9 = 0; var9 < var7; var9++) {
               if (var6) {
                  var1.write(44);
               }

               if (var2 > 0) {
                  var1.write(10);
               }

               JSONObjectImpl.method_5845(var1, var8);
               JSONObjectImpl.method_5804(var1, this.field_7324.get(var9), var2, var8);
               var6 = true;
            }

            if (var2 > 0) {
               var1.write(10);
            }

            JSONObjectImpl.method_5845(var1, var3);
         }

         var1.write(93);
         return var1;
      } catch (IOException var10) {
         throw new class_7584(var10);
      }
   }
}
