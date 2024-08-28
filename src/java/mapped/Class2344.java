package mapped;

import org.json.JSONException;

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

public class Class2344 implements Iterable<Object> {
   private final ArrayList<Object> field16026 = new ArrayList<Object>();

   public Class2344() {
   }

   public Class2344(Class7475 var1) throws Class2455 {
      this();
      if (var1.method24224() != '[') {
         throw var1.method24230("A JSONArray text must start with '['");
      } else if (var1.method24224() != ']') {
         var1.method24217();

         while (true) {
            if (var1.method24224() == ',') {
               var1.method24217();
               this.field16026.add(JSONObject.field30342);
            } else {
               var1.method24217();
               this.field16026.add(var1.method24228());
            }

            switch (var1.method24224()) {
               case ',':
                  if (var1.method24224() == ']') {
                     return;
                  }

                  var1.method24217();
                  break;
               case ']':
                  return;
               default:
                  throw var1.method24230("Expected a ',' or ']'");
            }
         }
      }
   }

   public Class2344(String var1) throws Class2455 {
      this(new Class7475(var1));
   }

   public Class2344(Collection<?> var1) {
      if (var1 != null) {
         for (Object var5 : var1) {
            this.field16026.add(JSONObject.method21817(var5));
         }
      }
   }

   public Class2344(Object var1) throws Class2499 {
      this();
      if (!var1.getClass().isArray()) {
         throw new Class2499("JSONArray initial value should be a string or collection or array.");
      } else {
         int var4 = Array.getLength(var1);

         for (int var5 = 0; var5 < var4; var5++) {
            this.method9158(JSONObject.method21817(Array.get(var1, var5)));
         }
      }
   }

   @Override
   public Iterator<Object> iterator() {
      return this.field16026.iterator();
   }

   public Object method9121(int var1) {
      Object var4 = this.method9135(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw new Class2499("JSONArray[" + var1 + "] not found.");
      }
   }

   public boolean method9122(int var1) throws Class2499 {
      Object var4 = this.method9121(var1);
      if (!var4.equals(Boolean.FALSE) && (!(var4 instanceof String) || !((String)var4).equalsIgnoreCase("false"))) {
         if (!var4.equals(Boolean.TRUE) && (!(var4 instanceof String) || !((String)var4).equalsIgnoreCase("true"))) {
            throw new Class2499("JSONArray[" + var1 + "] is not a boolean.");
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public double method9123(int var1) throws Class2455 {
      Object var4 = this.method9121(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).doubleValue() : Double.parseDouble((String)var4);
      } catch (Exception var6) {
         throw new Class2499("JSONArray[" + var1 + "] is not a number.");
      }
   }

   public <E extends Enum<E>> E method9124(Class<E> var1, int var2) throws Class2455 {
      Enum var5 = this.method9142(var1, var2);
      if (var5 != null) {
         return (E)var5;
      } else {
         throw new Class2499(
            "JSONObject[" + JSONObject.method21809(Integer.toString(var2)) + "] is not an enum of type " + JSONObject.method21809(var1.getSimpleName()) + "."
         );
      }
   }

   public BigDecimal method9125(int var1) throws Class2455 {
      Object var4 = this.method9121(var1);

      try {
         return new BigDecimal(var4.toString());
      } catch (Exception var6) {
         throw new Class2499("JSONArray[" + var1 + "] could not convert to BigDecimal.");
      }
   }

   public BigInteger method9126(int var1) throws Class2455 {
      Object var4 = this.method9121(var1);

      try {
         return new BigInteger(var4.toString());
      } catch (Exception var6) {
         throw new Class2499("JSONArray[" + var1 + "] could not convert to BigInteger.");
      }
   }

   public int method9127(int var1) throws Class2455 {
      Object var4 = this.method9121(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).intValue() : Integer.parseInt((String)var4);
      } catch (Exception var6) {
         throw new Class2499("JSONArray[" + var1 + "] is not a number.");
      }
   }

   public Class2344 method9128(int var1) throws Class2455 {
      Object var4 = this.method9121(var1);
      if (!(var4 instanceof Class2344)) {
         throw new Class2499("JSONArray[" + var1 + "] is not a JSONArray.");
      } else {
         return (Class2344)var4;
      }
   }

   public JSONObject method9129(int var1) throws Class2499 {
      Object var4 = this.method9121(var1);
      if (!(var4 instanceof JSONObject)) {
         throw new Class2499("JSONArray[" + var1 + "] is not a JSONObject.");
      } else {
         return (JSONObject)var4;
      }
   }

   public long method9130(int var1) throws Class2455 {
      Object var4 = this.method9121(var1);

      try {
         return var4 instanceof Number ? ((Number)var4).longValue() : Long.parseLong((String)var4);
      } catch (Exception var6) {
         throw new Class2499("JSONArray[" + var1 + "] is not a number.");
      }
   }

   public String method9131(int var1) throws Class2499 {
      Object var4 = this.method9121(var1);
      if (!(var4 instanceof String)) {
         throw new Class2499("JSONArray[" + var1 + "] not a string.");
      } else {
         return (String)var4;
      }
   }

   public boolean method9132(int var1) {
      return JSONObject.field30342.equals(this.method9135(var1));
   }

   public String method9133(String var1) throws Class2455 {
      int var4 = this.method9134();
      StringBuilder var5 = new StringBuilder();

      for (int var6 = 0; var6 < var4; var6++) {
         if (var6 > 0) {
            var5.append(var1);
         }

         var5.append(JSONObject.method21816(this.field16026.get(var6)));
      }

      return var5.toString();
   }

   public int method9134() {
      return this.field16026.size();
   }

   public Object method9135(int var1) {
      return var1 >= 0 && var1 < this.method9134() ? this.field16026.get(var1) : null;
   }

   public boolean method9136(int var1) {
      return this.method9137(var1, false);
   }

   public boolean method9137(int var1, boolean var2) {
      try {
         return this.method9122(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public double method9138(int var1) {
      return this.method9139(var1, Double.NaN);
   }

   public double method9139(int var1, double var2) {
      try {
         return this.method9123(var1);
      } catch (Exception var7) {
         return var2;
      }
   }

   public int method9140(int var1) {
      return this.method9141(var1, 0);
   }

   public int method9141(int var1, int var2) {
      try {
         return this.method9127(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public <E extends Enum<E>> E method9142(Class<E> var1, int var2) {
      return this.<E>method9143(var1, var2, null);
   }

   public <E extends Enum<E>> E method9143(Class<E> var1, int var2, E var3) {
      try {
         Object var6 = this.method9135(var2);
         if (JSONObject.field30342.equals(var6)) {
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
         return this.method9126(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public BigDecimal method9145(int var1, BigDecimal var2) {
      try {
         return this.method9125(var1);
      } catch (Exception var6) {
         return var2;
      }
   }

   public Class2344 method9146(int var1) {
      Object var4 = this.method9135(var1);
      return !(var4 instanceof Class2344) ? null : (Class2344)var4;
   }

   public JSONObject method9147(int var1) {
      Object var4 = this.method9135(var1);
      return !(var4 instanceof JSONObject) ? null : (JSONObject)var4;
   }

   public long method9148(int var1) {
      return this.method9149(var1, 0L);
   }

   public long method9149(int var1, long var2) {
      try {
         return this.method9130(var1);
      } catch (Exception var7) {
         return var2;
      }
   }

   public String method9150(int var1) {
      return this.method9151(var1, "");
   }

   public String method9151(int var1, String var2) {
      Object var5 = this.method9135(var1);
      return !JSONObject.field30342.equals(var5) ? var5.toString() : var2;
   }

   public Class2344 method9152(boolean var1) {
      this.method9158(!var1 ? Boolean.FALSE : Boolean.TRUE);
      return this;
   }

   public Class2344 method9153(Collection<?> var1) {
      this.method9158(new Class2344(var1));
      return this;
   }

   public Class2344 method9154(double var1) throws Class2455 {
      Double var5 = new Double(var1);
      JSONObject.method21814(var5);
      this.method9158(var5);
      return this;
   }

   public Class2344 method9155(int var1) {
      this.method9158(new Integer(var1));
      return this;
   }

   public Class2344 method9156(long var1) {
      this.method9158(new Long(var1));
      return this;
   }

   public Class2344 method9157(Map<?, ?> var1) {
      this.method9158(new JSONObject(var1));
      return this;
   }

   public Class2344 method9158(Object var1) {
      this.field16026.add(var1);
      return this;
   }

   public Class2344 method9159(int var1, boolean var2) {
      this.method9165(var1, !var2 ? Boolean.FALSE : Boolean.TRUE);
      return this;
   }

   public Class2344 method9160(int var1, Collection<?> var2) throws Class2455 {
      this.method9165(var1, new Class2344(var2));
      return this;
   }

   public Class2344 method9161(int var1, double var2) throws Class2455 {
      this.method9165(var1, new Double(var2));
      return this;
   }

   public Class2344 method9162(int var1, int var2) throws Class2455 {
      this.method9165(var1, new Integer(var2));
      return this;
   }

   public Class2344 method9163(int var1, long var2) throws Class2455 {
      this.method9165(var1, new Long(var2));
      return this;
   }

   public Class2344 method9164(int var1, Map<?, ?> var2) throws Class2455 {
      this.method9165(var1, new JSONObject(var2));
      return this;
   }

   public Class2344 method9165(int var1, Object var2) throws Class2499 {
      JSONObject.method21814(var2);
      if (var1 < 0) {
         throw new Class2499("JSONArray[" + var1 + "] not found.");
      } else {
         if (var1 < this.method9134()) {
            this.field16026.set(var1, var2);
         } else {
            while (var1 != this.method9134()) {
               this.method9158(JSONObject.field30342);
            }

            this.method9158(var2);
         }

         return this;
      }
   }

   public Object method9166(int var1) {
      return var1 >= 0 && var1 < this.method9134() ? this.field16026.remove(var1) : null;
   }

   public boolean method9167(Object var1) {
      if (var1 instanceof Class2344) {
         int var4 = this.method9134();
         if (var4 == ((Class2344)var1).method9134()) {
            for (int var5 = 0; var5 < var4; var5++) {
                Object var6 = this.method9121(var5);
                Object var7 = ((Class2344)var1).method9121(var5);
                if (!(var6 instanceof JSONObject)) {
                  if (!(var6 instanceof Class2344)) {
                     if (!var6.equals(var7)) {
                        return false;
                     }
                  } else if (!((Class2344)var6).method9167(var7)) {
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

   public JSONObject method9168(Class2344 var1) throws Class2455 {
      if (var1 != null && var1.method9134() != 0 && this.method9134() != 0) {
         JSONObject var4 = new JSONObject();

         for (int var5 = 0; var5 < var1.method9134(); var5++) {
            var4.method21806(var1.method9131(var5), this.method9135(var5));
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

   public String toString(int var1) throws Class2455 {
      StringWriter var4 = new StringWriter();
      synchronized (var4.getBuffer()) {
         return this.method9170(var4, var1, 0).toString();
      }
   }

   public Writer method9169(Writer var1) throws Class2455 {
      return this.method9170(var1, 0, 0);
   }

   public Writer method9170(Writer var1, int var2, int var3) throws Class2499 {
      try {
         boolean var6 = false;
         int var7 = this.method9134();
         var1.write(91);
         if (var7 == 1) {
            JSONObject.method21819(var1, this.field16026.get(0), var2, var3);
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
               JSONObject.method21819(var1, this.field16026.get(var9), var2, var8);
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
         throw new Class2499(var10);
      }
   }
}
