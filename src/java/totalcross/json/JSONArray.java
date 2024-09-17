package totalcross.json;

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

/**
 * This seems to be the <a href="https://github.com/TotalCross/totalcross/blob/b9e5a7cf76b4453d028367531e211080b8da4792/TotalCrossSDK/src/main/java/totalcross/json/JSONArray.java#L102">TotalCrossSDK json mod<</a>
 */
public class JSONArray implements Iterable<Object> {
   private ArrayList<Object> myArrayList;

   public JSONArray() {
      this.myArrayList = new ArrayList<Object>();
   }

   public JSONArray(JSONTokener x) throws JSONException {
      this();
      if (x.nextClean() != '[') {
         throw x.syntaxError("A JSONArray text must start with '['");
      } else if (x.nextClean() != ']') {
         x.back();

         for (;;) {
            if (x.nextClean() == ',') {
               x.back();
               this.myArrayList.add(JSONObject.NULL);
            } else {
               x.back();
               this.myArrayList.add(x.nextValue());
            }

            switch (x.nextClean()) {
               case ',':
                  if (x.nextClean() == ']') {
                     return;
                  }

                  x.back();
                  break;
               case ']':
                  return;
               default:
                  throw x.syntaxError("Expected a ',' or ']'");
            }
         }
      }
   }

   public JSONArray(String source) throws JSONException {
      this(new JSONTokener(source));
   }

   public JSONArray(Collection<Object> collection) {
      this();
      if (collection != null) {
         Iterator<Object> iter = collection.iterator();
         while (iter.hasNext()) {
            this.myArrayList.add(JSONObject.wrap(iter.next()));
         }
      }
   }

   public JSONArray(Object array) throws JSONException2 {
      this();
      if (array.getClass().isArray()) {
         int length = Array.getLength(array);
         for (int i = 0; i < length; i += 1) {
            this.put(JSONObject.wrap(Array.get(array, i)));
         }
      } else {
         throw new JSONException2("JSONArray initial value should be a string or collection or array.");
      }
   }

   @Override
   public Iterator<Object> iterator() {
      return this.myArrayList.iterator();
   }

   public Object get(int var1) {
      Object var4 = this.opt(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw new JSONException2("JSONArray[" + var1 + "] not found.");
      }
   }

   public boolean getBoolean(int index) throws JSONException2 {
      Object var4 = this.get(index);
      if (!var4.equals(Boolean.FALSE) && (!(var4 instanceof String) || !((String)var4).equalsIgnoreCase("false"))) {
         if (!var4.equals(Boolean.TRUE) && (!(var4 instanceof String) || !((String)var4).equalsIgnoreCase("true"))) {
            throw new JSONException2("JSONArray[" + index + "] is not a boolean.");
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public double getDouble(int index) throws JSONException {
      Object var4 = this.get(index);

      try {
         return var4 instanceof Number ? ((Number)var4).doubleValue() : Double.parseDouble((String)var4);
      } catch (Exception var6) {
         throw new JSONException2("JSONArray[" + index + "] is not a number.");
      }
   }

   public <E extends Enum<E>> E getEnum(Class<E> var1, int var2) throws JSONException {
      Enum var5 = this.method9142(var1, var2);
      if (var5 != null) {
         return (E)var5;
      } else {
         throw new JSONException2(
            "JSONObject[" + JSONObject.formatKey(Integer.toString(var2)) + "] is not an enum of type " + JSONObject.formatKey(var1.getSimpleName()) + "."
         );
      }
   }

   /**
    * This isn't in the sdk source, WTF
    * @param index index
    * @return Big Decimal
    * @throws JSONException this is never thrown, what
    */
   public BigDecimal getBigDecimal(int index) throws JSONException {
      Object var4 = this.get(index);

      try {
         return new BigDecimal(var4.toString());
      } catch (Exception var6) {
         throw new JSONException2("JSONArray[" + index + "] could not convert to BigDecimal.");
      }
   }

   public BigInteger getBigInteger(int index) throws JSONException {
      Object var4 = this.get(index);

      try {
         return new BigInteger(var4.toString());
      } catch (Exception var6) {
         throw new JSONException2("JSONArray[" + index + "] could not convert to BigInteger.");
      }
   }

   public int getInt(int var1) throws JSONException {
      Object var4 = this.get(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).intValue() : Integer.parseInt((String)var4);
      } catch (Exception var6) {
         throw new JSONException2("JSONArray[" + var1 + "] is not a number.");
      }
   }

   public JSONArray getJSONArray(int var1) throws JSONException {
      Object var4 = this.get(var1);
      if (!(var4 instanceof JSONArray)) {
         throw new JSONException2("JSONArray[" + var1 + "] is not a JSONArray.");
      } else {
         return (JSONArray)var4;
      }
   }

   public JSONObject getJSONObject(int var1) throws JSONException2 {
      Object var4 = this.get(var1);
      if (!(var4 instanceof JSONObject)) {
         throw new JSONException2("JSONArray[" + var1 + "] is not a JSONObject.");
      } else {
         return (JSONObject)var4;
      }
   }

   public long getLong(int var1) throws JSONException {
      Object var4 = this.get(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).longValue() : Long.parseLong((String)var4);
      } catch (Exception var6) {
         throw new JSONException2("JSONArray[" + var1 + "] is not a number.");
      }
   }

   public String getString(int var1) throws JSONException2 {
      Object var4 = this.get(var1);
      if (!(var4 instanceof String)) {
         throw new JSONException2("JSONArray[" + var1 + "] not a string.");
      } else {
         return (String)var4;
      }
   }

   public boolean isNull(int var1) {
      return JSONObject.NULL.equals(this.opt(var1));
   }

   public String join(String seperator) throws JSONException {
      int len = this.length();
      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < len; i++) {
         if (i > 0) {
            sb.append(seperator);
         }

         sb.append(JSONObject.method21816(this.myArrayList.get(i)));
      }

      return sb.toString();
   }

   public int length() {
      return this.myArrayList.size();
   }

   public Object opt(int index) {
      return index >= 0 && index < this.length() ? this.myArrayList.get(index) : null;
   }

   public boolean getBooleanSafe(int var1) {
      return this.getBooleanOrElse(var1, false);
   }

   public boolean getBooleanOrElse(int var1, boolean var2) {
      try {
         return this.getBoolean(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public double getDoubleSafe(int var1) {
      return this.getDoubleOrElse(var1, Double.NaN);
   }

   public double getDoubleOrElse(int var1, double var2) {
      try {
         return this.getDouble(var1);
      } catch (Exception var7) {
         return var2;
      }
   }

   public int getIntSafe(int var1) {
      return this.getIntOrElse(var1, 0);
   }

   public int getIntOrElse(int var1, int var2) {
      try {
         return this.getInt(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public <E extends Enum<E>> E method9142(Class<E> var1, int var2) {
      return this.<E>method9143(var1, var2, null);
   }

   public <E extends Enum<E>> E method9143(Class<E> var1, int var2, E var3) {
      try {
         Object var6 = this.opt(var2);
         if (JSONObject.NULL.equals(var6)) {
            return (E)var3;
         } else {
            return (E)(var1.isAssignableFrom(var6.getClass()) ? var6 : Enum.<E>valueOf(var1, var6.toString()));
         }
      } catch (NullPointerException | IllegalArgumentException var8) {
         return (E)var3;
      }
   }

   public BigInteger method9144(int var1, BigInteger var2) {
      try {
         return this.getBigInteger(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public BigDecimal method9145(int var1, BigDecimal var2) {
      try {
         return this.getBigDecimal(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public JSONArray method9146(int var1) {
      Object var4 = this.opt(var1);
      return !(var4 instanceof JSONArray) ? null : (JSONArray)var4;
   }

   public JSONObject method9147(int var1) {
      Object var4 = this.opt(var1);
      return !(var4 instanceof JSONObject) ? null : (JSONObject)var4;
   }

   public long method9148(int var1) {
      return this.method9149(var1, 0L);
   }

   public long method9149(int var1, long var2) {
      try {
         return this.getLong(var1);
      } catch (Exception var7) {
         return var2;
      }
   }

   public String method9150(int var1) {
      return this.method9151(var1, "");
   }

   public String method9151(int var1, String var2) {
      Object var5 = this.opt(var1);
      return ! JSONObject.NULL.equals(var5) ? var5.toString() : var2;
   }

   public JSONArray method9152(boolean var1) {
      this.put(!var1 ? Boolean.FALSE : Boolean.TRUE);
      return this;
   }

   public JSONArray method9153(Collection<?> var1) {
      this.put(new JSONArray(var1));
      return this;
   }

   public JSONArray method9154(double var1) throws JSONException {
      Double var5 = new Double(var1);
      JSONObject.testValidity(var5);
      this.put(var5);
      return this;
   }

   public JSONArray method9155(int var1) {
      this.put(new Integer(var1));
      return this;
   }

   public JSONArray method9156(long var1) {
      this.put(new Long(var1));
      return this;
   }

   public JSONArray method9157(Map<?, ?> var1) {
      this.put(new JSONObject(var1));
      return this;
   }

   public JSONArray put(Object var1) {
      this.myArrayList.add(var1);
      return this;
   }

   public JSONArray method9159(int var1, boolean var2) {
      this.method9165(var1, !var2 ? Boolean.FALSE : Boolean.TRUE);
      return this;
   }

   public JSONArray method9160(int var1, Collection<?> var2) throws JSONException {
      this.method9165(var1, new JSONArray(var2));
      return this;
   }

   public JSONArray method9161(int var1, double var2) throws JSONException {
      this.method9165(var1, new Double(var2));
      return this;
   }

   public JSONArray method9162(int var1, int var2) throws JSONException {
      this.method9165(var1, new Integer(var2));
      return this;
   }

   public JSONArray method9163(int var1, long var2) throws JSONException {
      this.method9165(var1, new Long(var2));
      return this;
   }

   public JSONArray method9164(int var1, Map<?, ?> var2) throws JSONException {
      this.method9165(var1, new JSONObject(var2));
      return this;
   }

   public JSONArray method9165(int var1, Object var2) throws JSONException2 {
      JSONObject.testValidity(var2);
      if (var1 < 0) {
         throw new JSONException2("JSONArray[" + var1 + "] not found.");
      } else {
         if (var1 < this.length()) {
            this.myArrayList.set(var1, var2);
         } else {
            while (var1 != this.length()) {
               this.put(JSONObject.NULL);
            }

            this.put(var2);
         }

         return this;
      }
   }

   public Object method9166(int var1) {
      return var1 >= 0 && var1 < this.length() ? this.myArrayList.remove(var1) : null;
   }

   public boolean method9167(Object var1) {
      if (var1 instanceof JSONArray) {
         int var4 = this.length();
         if (var4 == ((JSONArray)var1).length()) {
            for (int var5 = 0; var5 < var4; var5++) {
                Object var6 = this.get(var5);
                Object var7 = ((JSONArray)var1).get(var5);
                if (!(var6 instanceof JSONObject)) {
                  if (!(var6 instanceof JSONArray)) {
                     if (!var6.equals(var7)) {
                        return false;
                     }
                  } else if (!((JSONArray)var6).method9167(var7)) {
                     return false;
                  }
               } else if (!((JSONObject)var6).method21812(var7)) {
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

   public JSONObject method9168(JSONArray var1) throws JSONException {
      if (var1 != null && var1.length() != 0 && this.length() != 0) {
         JSONObject var4 = new JSONObject();

         for (int var5 = 0; var5 < var1.length(); var5++) {
            var4.put(var1.getString(var5), this.opt(var5));
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
         return this.method9170(var4, var1, 0).toString();
      }
   }

   public Writer method9169(Writer var1) throws JSONException {
      return this.method9170(var1, 0, 0);
   }

   public Writer method9170(Writer var1, int var2, int var3) throws JSONException2 {
      try {
         boolean var6 = false;
         int var7 = this.length();
         var1.write(91);
         if (var7 == 1) {
            JSONObject.method21819(var1, this.myArrayList.get(0), var2, var3);
         } else if (var7 != 0) {
            int var8 = var3 + var2;

            for (int var9 = 0; var9 < var7; var9++) {
               if (var6) {
                  var1.write(44);
               }

               if (var2 > 0) {
                  var1.write(10);
               }

               JSONObject.method21820(var1, var8);
               JSONObject.method21819(var1, this.myArrayList.get(var9), var2, var8);
               var6 = true;
            }

            if (var2 > 0) {
               var1.write(10);
            }

            JSONObject.method21820(var1, var3);
         }

         var1.write(93);
         return var1;
      } catch (IOException var10) {
         throw new JSONException2(var10);
      }
   }
}
