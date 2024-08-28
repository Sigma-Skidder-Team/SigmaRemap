package mapped;

import java.io.IOException;
import java.io.Writer;

public final class Class1693 implements AutoCloseable {
   private final Appendable field9225;
   private final String field9226 = "  ";
   private int field9227;
   private boolean field9228;

   public Class1693(Appendable var1) {
      this.field9225 = var1;
   }

   public Class1693 method7271(Class61 var1) throws IOException {
      if (!(var1 instanceof Class72)) {
         if (!(var1 instanceof Class60)) {
            if (!(var1 instanceof Class63)) {
               if (!(var1 instanceof Class62)) {
                  if (!(var1 instanceof Class65)) {
                     if (!(var1 instanceof Class71)) {
                        if (!(var1 instanceof Class69)) {
                           if (!(var1 instanceof Class73)) {
                              if (!(var1 instanceof Class66)) {
                                 if (!(var1 instanceof Class75)) {
                                    if (!(var1 instanceof Class70)) {
                                       if (!(var1 instanceof Class68)) {
                                          throw new IOException("Unknown tag type: " + var1.getClass().getSimpleName());
                                       } else {
                                          return this.method7280(Double.toString(((Class68)var1).method205()), 'D');
                                       }
                                    } else {
                                       return this.method7280(Float.toString(((Class70)var1).method205()), 'F');
                                    }
                                 } else {
                                    return this.method7280(Long.toString(((Class75)var1).method205()), 'L');
                                 }
                              } else {
                                 return this.method7280(Integer.toString(((Class66)var1).method205()), 'I');
                              }
                           } else {
                              return this.method7280(Short.toString(((Class73)var1).method205()), 'S');
                           }
                        } else {
                           return this.method7280(Byte.toString(((Class69)var1).method205()), 'B');
                        }
                     } else {
                        return this.method7280(((Class71)var1).method205(), '\u0000');
                     }
                  } else {
                     return this.method7276((Class65)var1);
                  }
               } else {
                  return this.method7275((Class62)var1);
               }
            } else {
               return this.method7274((Class63)var1);
            }
         } else {
            return this.method7273((Class60)var1);
         }
      } else {
         return this.method7272((Class72)var1);
      }
   }

   private Class1693 method7272(Class72 var1) throws IOException {
      this.method7277();

      for (Class61 var5 : var1) {
         this.method7279(var5.method206());
         this.method7271(var5);
      }

      this.method7278();
      return this;
   }

   private Class1693 method7273(Class60 var1) throws IOException {
      this.method7281();

      for (Class61 var5 : var1) {
         this.method7287();
         this.method7271(var5);
      }

      this.method7282();
      return this;
   }

   private Class1693 method7274(Class63 var1) throws IOException {
      this.method7283('B');
      byte[] var4 = var1.method205();
      int var5 = 0;

      for (int var6 = var4.length; var5 < var6; var5++) {
         this.method7287();
         this.method7280(Byte.toString(var4[var5]), 'B');
      }

      this.method7284();
      return this;
   }

   private Class1693 method7275(Class62 var1) throws IOException {
      this.method7283('I');
      int[] var4 = var1.method205();
      int var5 = 0;

      for (int var6 = var4.length; var5 < var6; var5++) {
         this.method7287();
         this.method7280(Integer.toString(var4[var5]), 'I');
      }

      this.method7284();
      return this;
   }

   private Class1693 method7276(Class65 var1) throws IOException {
      this.method7283('L');
      long[] var4 = var1.method205();
      int var5 = 0;

      for (int var6 = var4.length; var5 < var6; var5++) {
         this.method7287();
         this.method7280(Long.toString(var4[var5]), 'L');
      }

      this.method7284();
      return this;
   }

   public Class1693 method7277() throws IOException {
      this.method7287();
      this.field9227++;
      this.field9225.append('{');
      return this;
   }

   public Class1693 method7278() throws IOException {
      this.field9225.append('}');
      this.field9227--;
      this.field9228 = true;
      return this;
   }

   public Class1693 method7279(String var1) throws IOException {
      this.method7287();
      this.method7285(var1, false);
      this.field9225.append(':');
      return this;
   }

   public Class1693 method7280(String var1, char var2) throws IOException {
      if (var2 != 0) {
         this.field9225.append(var1);
         if (var2 != 'I') {
            this.field9225.append(var2);
         }
      } else {
         this.method7285(var1, true);
      }

      this.field9228 = true;
      return this;
   }

   public Class1693 method7281() throws IOException {
      this.method7287();
      this.field9227++;
      this.field9225.append('[');
      return this;
   }

   public Class1693 method7282() throws IOException {
      this.field9225.append(']');
      this.field9227--;
      this.field9228 = true;
      return this;
   }

   private Class1693 method7283(char var1) throws IOException {
      this.method7281().field9225.append(var1).append(';');
      return this;
   }

   private Class1693 method7284() throws IOException {
      return this.method7282();
   }

   private void method7285(String var1, boolean var2) throws IOException {
      if (!var2) {
         for (int var5 = 0; var5 < var1.length(); var5++) {
            if (!Class9232.method34724(var1.charAt(var5))) {
               var2 = true;
               break;
            }
         }
      }

      if (!var2) {
         this.field9225.append(var1);
      } else {
         this.field9225.append('"');
         this.field9225.append(method7286(var1, '"'));
         this.field9225.append('"');
      }
   }

   private static String method7286(String var0, char var1) {
      StringBuilder var4 = new StringBuilder(var0.length());

      for (int var5 = 0; var5 < var0.length(); var5++) {
         char var6 = var0.charAt(var5);
         if (var6 == var1 || var6 == '\\') {
            var4.append('\\');
         }

         var4.append(var6);
      }

      return var4.toString();
   }

   private void method7287() throws IOException {
      if (this.field9228) {
         this.field9225.append(',');
         this.field9228 = false;
      }
   }

   @Override
   public void close() throws IOException {
      if (this.field9227 == 0) {
         if (this.field9225 instanceof Writer) {
            ((Writer)this.field9225).flush();
         }
      } else {
         throw new IllegalStateException("Document finished with unbalanced start and end objects");
      }
   }
}
