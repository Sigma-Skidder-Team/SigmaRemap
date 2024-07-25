package remapped;

import java.io.IOException;
import java.io.Writer;
import org.json.JSONException;

public class class_5442 {
   private static final int field_27714 = 200;
   private boolean field_27712 = false;
   public char field_27713 = 'i';
   private final JSONObjectImpl[] field_27716 = new JSONObjectImpl[200];
   private int field_27717 = 0;
   public Writer field_27715;

   public class_5442(Writer var1) {
      this.field_27715 = var1;
   }

   private class_5442 method_24784(String var1) throws JSONException {
      if (var1 == null) {
         throw new class_7584("Null pointer");
      } else if (this.field_27713 != 'o' && this.field_27713 != 'a') {
         throw new class_7584("Value out of sequence.");
      } else {
         try {
            if (this.field_27712 && this.field_27713 == 'a') {
               this.field_27715.write(44);
            }

            this.field_27715.write(var1);
         } catch (IOException var5) {
            throw new class_7584(var5);
         }

         if (this.field_27713 == 'o') {
            this.field_27713 = 'k';
         }

         this.field_27712 = true;
         return this;
      }
   }

   public class_5442 method_24782() throws JSONException {
      if (this.field_27713 != 'i' && this.field_27713 != 'o' && this.field_27713 != 'a') {
         throw new class_7584("Misplaced array.");
      } else {
         this.method_24794(null);
         this.method_24784("[");
         this.field_27712 = false;
         return this;
      }
   }

   private class_5442 method_24786(char var1, char var2) throws JSONException {
      if (this.field_27713 != var1) {
         throw new class_7584(var1 == 'a' ? "Misplaced endArray." : "Misplaced endObject.");
      } else {
         this.method_24785(var1);

         try {
            this.field_27715.write(var2);
         } catch (IOException var6) {
            throw new class_7584(var6);
         }

         this.field_27712 = true;
         return this;
      }
   }

   public class_5442 method_24783() throws JSONException {
      return this.method_24786('a', ']');
   }

   public class_5442 method_24781() throws JSONException {
      return this.method_24786('k', '}');
   }

   public class_5442 method_24792(String var1) throws JSONException {
      if (var1 == null) {
         throw new class_7584("Null key.");
      } else if (this.field_27713 == 'k') {
         try {
            this.field_27716[this.field_27717 - 1].method_5811(var1, Boolean.TRUE);
            if (this.field_27712) {
               this.field_27715.write(44);
            }

            this.field_27715.write(JSONObjectImpl.method_5859(var1));
            this.field_27715.write(58);
            this.field_27712 = false;
            this.field_27713 = 'o';
            return this;
         } catch (IOException var5) {
            throw new class_7584(var5);
         }
      } else {
         throw new class_7584("Misplaced key.");
      }
   }

   public class_5442 method_24791() throws JSONException {
      if (this.field_27713 == 'i') {
         this.field_27713 = 'o';
      }

      if (this.field_27713 != 'o' && this.field_27713 != 'a') {
         throw new class_7584("Misplaced object.");
      } else {
         this.method_24784("{");
         this.method_24794(new JSONObjectImpl());
         this.field_27712 = false;
         return this;
      }
   }

   private void method_24785(char var1) throws JSONException {
      if (this.field_27717 > 0) {
         int var4 = this.field_27716[this.field_27717 - 1] != null ? 107 : 97;
         if (var4 == var1) {
            this.field_27717--;
            this.field_27713 = (char)(this.field_27717 != 0 ? (this.field_27716[this.field_27717 - 1] != null ? 107 : 97) : 100);
         } else {
            throw new class_7584("Nesting error.");
         }
      } else {
         throw new class_7584("Nesting error.");
      }
   }

   private void method_24794(JSONObjectImpl var1) throws JSONException {
      if (this.field_27717 < 200) {
         this.field_27716[this.field_27717] = var1;
         this.field_27713 = (char)(var1 != null ? 107 : 97);
         this.field_27717++;
      } else {
         throw new class_7584("Nesting too deep.");
      }
   }

   public class_5442 method_24790(boolean var1) throws JSONException {
      return this.method_24784(!var1 ? "false" : "true");
   }

   public class_5442 method_24787(double var1) throws JSONException {
      return this.method_24789(new Double(var1));
   }

   public class_5442 method_24788(long var1) throws JSONException {
      return this.method_24784(Long.toString(var1));
   }

   public class_5442 method_24789(Object var1) throws JSONException {
      return this.method_24784(JSONObjectImpl.method_5827(var1));
   }
}
