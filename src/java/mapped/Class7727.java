package mapped;

import totalcross.json.JSONException;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

import java.io.IOException;
import java.io.Writer;

public class Class7727 {
   private static final int field33175 = 200;
   private boolean field33176 = false;
   public char field33177 = 'i';
   private final JSONObject[] field33178 = new JSONObject[200];
   private int field33179 = 0;
   public Writer field33180;

   public Class7727(Writer var1) {
      this.field33180 = var1;
   }

   private Class7727 method25549(String var1) throws JSONException {
      if (var1 == null) {
         throw new JSONException2("Null pointer");
      } else if (this.field33177 != 'o' && this.field33177 != 'a') {
         throw new JSONException2("Value out of sequence.");
      } else {
         try {
            if (this.field33176 && this.field33177 == 'a') {
               this.field33180.write(44);
            }

            this.field33180.write(var1);
         } catch (IOException var5) {
            throw new JSONException2(var5);
         }

         if (this.field33177 == 'o') {
            this.field33177 = 'k';
         }

         this.field33176 = true;
         return this;
      }
   }

   public Class7727 method25550() throws JSONException {
      if (this.field33177 != 'i' && this.field33177 != 'o' && this.field33177 != 'a') {
         throw new JSONException2("Misplaced array.");
      } else {
         this.method25557(null);
         this.method25549("[");
         this.field33176 = false;
         return this;
      }
   }

   private Class7727 method25551(char var1, char var2) throws JSONException {
      if (this.field33177 != var1) {
         throw new JSONException2(var1 == 'a' ? "Misplaced endArray." : "Misplaced endObject.");
      } else {
         this.method25556(var1);

         try {
            this.field33180.write(var2);
         } catch (IOException var6) {
            throw new JSONException2(var6);
         }

         this.field33176 = true;
         return this;
      }
   }

   public Class7727 method25552() throws JSONException {
      return this.method25551('a', ']');
   }

   public Class7727 method25553() throws JSONException {
      return this.method25551('k', '}');
   }

   public Class7727 method25554(String var1) throws JSONException {
      if (var1 == null) {
         throw new JSONException2("Null key.");
      } else if (this.field33177 == 'k') {
         try {
            this.field33178[this.field33179 - 1].putOnce(var1, Boolean.TRUE);
            if (this.field33176) {
               this.field33180.write(44);
            }

            this.field33180.write(JSONObject.formatKey(var1));
            this.field33180.write(58);
            this.field33176 = false;
            this.field33177 = 'o';
            return this;
         } catch (IOException var5) {
            throw new JSONException2(var5);
         }
      } else {
         throw new JSONException2("Misplaced key.");
      }
   }

   public Class7727 method25555() throws JSONException {
      if (this.field33177 == 'i') {
         this.field33177 = 'o';
      }

      if (this.field33177 != 'o' && this.field33177 != 'a') {
         throw new JSONException2("Misplaced object.");
      } else {
         this.method25549("{");
         this.method25557(new JSONObject());
         this.field33176 = false;
         return this;
      }
   }

   private void method25556(char var1) throws JSONException {
      if (this.field33179 > 0) {
         int var4 = this.field33178[this.field33179 - 1] != null ? 107 : 97;
         if (var4 == var1) {
            this.field33179--;
            this.field33177 = (char)(this.field33179 != 0 ? (this.field33178[this.field33179 - 1] != null ? 107 : 97) : 100);
         } else {
            throw new JSONException2("Nesting error.");
         }
      } else {
         throw new JSONException2("Nesting error.");
      }
   }

   private void method25557(JSONObject var1) throws JSONException {
      if (this.field33179 < 200) {
         this.field33178[this.field33179] = var1;
         this.field33177 = (char)(var1 != null ? 107 : 97);
         this.field33179++;
      } else {
         throw new JSONException2("Nesting too deep.");
      }
   }

   public Class7727 method25558(boolean var1) throws JSONException {
      return this.method25549(!var1 ? "false" : "true");
   }

   public Class7727 method25559(double var1) throws JSONException {
      return this.method25561(new Double(var1));
   }

   public Class7727 method25560(long var1) throws JSONException {
      return this.method25549(Long.toString(var1));
   }

   public Class7727 method25561(Object var1) throws JSONException {
      return this.method25549(JSONObject.method21816(var1));
   }
}
