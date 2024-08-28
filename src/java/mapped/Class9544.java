package mapped;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.IntStream.Builder;

public final class Class9544 {
   private static final Field field44437 = method36927();
   private final Class9311 field44438;

   private static Field method36927() {
      try {
         return Class61.class.getDeclaredField("name");
      } catch (NoSuchFieldException var3) {
         var3.printStackTrace();
         throw new IllegalArgumentException(var3);
      }
   }

   public Class9544(Class9311 var1) {
      this.field44438 = var1;
   }

   public Class72 method36928() throws Class2459{
      this.field44438.method35183('{');
      Class72 var3 = new Class72("");
      if (this.field44438.method35177() == '}') {
         this.field44438.method35179();
         return var3;
      } else {
         while (this.field44438.method35181()) {
            String var4 = this.method36934();
            Class61 var5 = this.method36935();

            try {
               if (!field44437.isAccessible()) {
                  field44437.setAccessible(true);
               }

               field44437.set(var5, var4);
            } catch (IllegalAccessException var7) {
               throw new IllegalArgumentException(var7);
            }

            var3.<Class61>method236(var5);
            if (this.method36937('}')) {
               return var3;
            }
         }

         throw this.field44438.method35185("Unterminated compound tag!");
      }
   }

   public Class60 method36929() throws Class2459{
      Class60 var3 = new Class60("");
      this.field44438.method35183('[');
      boolean var4 = this.field44438.method35177() == '0' && this.field44438.method35178(1) == ':';

      while (this.field44438.method35181()) {
         if (var4) {
            this.field44438.method35182(':');
         }

         Class61 var5 = this.method36935();
         var3.method199(var5);
         if (this.method36937(']')) {
            return var3;
         }
      }

      throw this.field44438.method35185("Reached end of file without end of list tag!");
   }

   public Class61 method36930(char var1) throws Class2459{
      this.field44438.method35183('[').method35183(var1).method35183(';');
      if (var1 != 'B') {
         if (var1 != 'I') {
            if (var1 != 'L') {
               throw this.field44438.method35185("Type " + var1 + " is not a valid element type in an array!");
            } else {
               return new Class65("", this.method36933());
            }
         } else {
            return new Class62("", this.method36932());
         }
      } else {
         return new Class63("", this.method36931());
      }
   }

   private byte[] method36931() throws Class2459{
      ArrayList var3 = new ArrayList();

      while (this.field44438.method35181()) {
         CharSequence var4 = this.field44438.method35184().method35182('B');

         try {
            var3.add(Byte.valueOf(var4.toString()));
         } catch (NumberFormatException var7) {
            throw this.field44438.method35185("All elements of a byte array must be bytes!");
         }

         if (this.method36937(']')) {
            byte[] var5 = new byte[var3.size()];

            for (int var6 = 0; var6 < var3.size(); var6++) {
               var5[var6] = (Byte)var3.get(var6);
            }

            return var5;
         }
      }

      throw this.field44438.method35185("Reached end of document without array close");
   }

   private int[] method36932() throws Class2459{
      Builder var3 = IntStream.builder();

      while (this.field44438.method35181()) {
         Class61 var4 = this.method36935();
         if (!(var4 instanceof Class66)) {
            throw this.field44438.method35185("All elements of an int array must be ints!");
         }

         var3.add(((Class66)var4).method205());
         if (this.method36937(']')) {
            return var3.build().toArray();
         }
      }

      throw this.field44438.method35185("Reached end of document without array close");
   }

   private long[] method36933() throws Class2459{
      ArrayList var3 = new ArrayList();

      while (this.field44438.method35181()) {
         CharSequence var4 = this.field44438.method35184().method35182('L');

         try {
            var3.add(Long.valueOf(var4.toString()));
         } catch (NumberFormatException var7) {
            throw this.field44438.method35185("All elements of a long array must be longs!");
         }

         if (this.method36937(']')) {
            long[] var5 = new long[var3.size()];

            for (int var6 = 0; var6 < var3.size(); var6++) {
               var5[var6] = (Long)var3.get(var6);
            }

            return var5;
         }
      }

      throw this.field44438.method35185("Reached end of document without array close");
   }

   public String method36934() throws Class2459{
      this.field44438.method35184();
      char var3 = this.field44438.method35177();

      String var5;
      try {
         if (var3 == '\'' || var3 == '"') {
            return method36938(this.field44438.method35182(this.field44438.method35179()).toString());
         }

         StringBuilder var4 = new StringBuilder();

         while (this.field44438.method35177() != ':') {
            var4.append(this.field44438.method35179());
         }

         var5 = var4.toString();
      } finally {
         this.field44438.method35183(':');
      }

      return var5;
   }

   public Class61 method36935() throws Class2459{
      char var3 = this.field44438.method35184().method35177();
      switch (var3) {
         case '"':
         case '\'':
            this.field44438.method35180();
            return new Class71("", method36938(this.field44438.method35182(var3).toString()));
         case '[':
            if (this.field44438.method35178(2) == ';') {
               return this.method36930(this.field44438.method35178(1));
            }

            return this.method36929();
         case '{':
            return this.method36928();
         default:
            return this.method36936();
      }
   }

   private Class61 method36936() {
      StringBuilder var3 = new StringBuilder();
      boolean var4 = true;

      while (this.field44438.method35181()) {
         char var5 = this.field44438.method35177();
         if (var4 && !Class9232.method34725(var5) && var3.length() != 0) {
            Object var6 = null;

            try {
               switch (Character.toUpperCase(var5)) {
                  case 'B':
                     var6 = new Class69("", Byte.parseByte(var3.toString()));
                     break;
                  case 'D':
                     var6 = new Class68("", Double.parseDouble(var3.toString()));
                     break;
                  case 'F':
                     var6 = new Class70("", Float.parseFloat(var3.toString()));
                     break;
                  case 'L':
                     var6 = new Class75("", Long.parseLong(var3.toString()));
                     break;
                  case 'S':
                     var6 = new Class73("", Short.parseShort(var3.toString()));
               }
            } catch (NumberFormatException var8) {
               var4 = false;
            }

            if (var6 != null) {
               this.field44438.method35179();
               return (Class61)var6;
            }
         }

         if (var5 == '\\') {
            this.field44438.method35180();
            var3.append(this.field44438.method35179());
         } else {
            if (!Class9232.method34724(var5)) {
               break;
            }

            var3.append(this.field44438.method35179());
         }
      }

      String var10 = var3.toString();
      if (var4) {
         try {
            return new Class66("", Integer.parseInt(var10));
         } catch (NumberFormatException var9) {
         }
      }

      return new Class71("", var10);
   }

   private boolean method36937(char var1) throws Class2459{
      if (this.field44438.method35184().method35177() != var1) {
         this.field44438.method35183(',');
         return false;
      } else {
         this.field44438.method35179();
         return true;
      }
   }

   private static String method36938(String var0) {
      int var3 = var0.indexOf(92);
      if (var3 == -1) {
         return var0;
      } else {
         int var4 = 0;
         StringBuilder var5 = new StringBuilder(var0.length());

         do {
            var5.append(var0, var4, var3);
            var4 = var3 + 1;
         } while ((var3 = var0.indexOf(92, var4 + 1)) != -1);

         var5.append(var0.substring(var4));
         return var5.toString();
      }
   }
}
