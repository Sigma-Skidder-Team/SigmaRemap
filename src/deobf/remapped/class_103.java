package remapped;

import java.io.IOException;
import java.io.Writer;

public final class class_103 implements AutoCloseable {
   private final Appendable field_249;
   private final String field_247 = "  ";
   private int field_245;
   private boolean field_246;

   public class_103(Appendable var1) {
      this.field_249 = var1;
   }

   public class_103 method_302(class_5287 var1) throws IOException {
      if (!(var1 instanceof class_5531)) {
         if (!(var1 instanceof class_913)) {
            if (!(var1 instanceof class_1070)) {
               if (!(var1 instanceof class_7356)) {
                  if (!(var1 instanceof class_6674)) {
                     if (!(var1 instanceof class_887)) {
                        if (!(var1 instanceof class_1456)) {
                           if (!(var1 instanceof class_6733)) {
                              if (!(var1 instanceof class_5232)) {
                                 if (!(var1 instanceof class_8735)) {
                                    if (!(var1 instanceof class_520)) {
                                       if (!(var1 instanceof class_7948)) {
                                          throw new IOException("Unknown tag type: " + var1.getClass().getSimpleName());
                                       } else {
                                          return this.method_308(Double.toString(((class_7948)var1).method_35980()), 'D');
                                       }
                                    } else {
                                       return this.method_308(Float.toString(((class_520)var1).method_2539()), 'F');
                                    }
                                 } else {
                                    return this.method_308(Long.toString(((class_8735)var1).method_40102()), 'L');
                                 }
                              } else {
                                 return this.method_308(Integer.toString(((class_5232)var1).method_23973()), 'I');
                              }
                           } else {
                              return this.method_308(Short.toString(((class_6733)var1).method_30876()), 'S');
                           }
                        } else {
                           return this.method_308(Byte.toString(((class_1456)var1).method_6752()), 'B');
                        }
                     } else {
                        return this.method_308(((class_887)var1).method_3809(), '\u0000');
                     }
                  } else {
                     return this.method_304((class_6674)var1);
                  }
               } else {
                  return this.method_307((class_7356)var1);
               }
            } else {
               return this.method_311((class_1070)var1);
            }
         } else {
            return this.method_310((class_913)var1);
         }
      } else {
         return this.method_314((class_5531)var1);
      }
   }

   private class_103 method_314(class_5531 var1) throws IOException {
      this.method_313();

      for (class_5287 var5 : var1) {
         this.method_315(var5.method_24126());
         this.method_302(var5);
      }

      this.method_312();
      return this;
   }

   private class_103 method_310(class_913 var1) throws IOException {
      this.method_309();

      for (class_5287 var5 : var1) {
         this.method_306();
         this.method_302(var5);
      }

      this.method_301();
      return this;
   }

   private class_103 method_311(class_1070 var1) throws IOException {
      this.method_317('B');
      byte[] var4 = var1.method_4696();
      int var5 = 0;

      for (int var6 = var4.length; var5 < var6; var5++) {
         this.method_306();
         this.method_308(Byte.toString(var4[var5]), 'B');
      }

      this.method_303();
      return this;
   }

   private class_103 method_307(class_7356 var1) throws IOException {
      this.method_317('I');
      int[] var4 = var1.method_33512();
      int var5 = 0;

      for (int var6 = var4.length; var5 < var6; var5++) {
         this.method_306();
         this.method_308(Integer.toString(var4[var5]), 'I');
      }

      this.method_303();
      return this;
   }

   private class_103 method_304(class_6674 var1) throws IOException {
      this.method_317('L');
      long[] var4 = var1.method_30625();
      int var5 = 0;

      for (int var6 = var4.length; var5 < var6; var5++) {
         this.method_306();
         this.method_308(Long.toString(var4[var5]), 'L');
      }

      this.method_303();
      return this;
   }

   public class_103 method_313() throws IOException {
      this.method_306();
      this.field_245++;
      this.field_249.append('{');
      return this;
   }

   public class_103 method_312() throws IOException {
      this.field_249.append('}');
      this.field_245--;
      this.field_246 = true;
      return this;
   }

   public class_103 method_315(String var1) throws IOException {
      this.method_306();
      this.method_316(var1, false);
      this.field_249.append(':');
      return this;
   }

   public class_103 method_308(String var1, char var2) throws IOException {
      if (var2 != 0) {
         this.field_249.append(var1);
         if (var2 != 'I') {
            this.field_249.append(var2);
         }
      } else {
         this.method_316(var1, true);
      }

      this.field_246 = true;
      return this;
   }

   public class_103 method_309() throws IOException {
      this.method_306();
      this.field_245++;
      this.field_249.append('[');
      return this;
   }

   public class_103 method_301() throws IOException {
      this.field_249.append(']');
      this.field_245--;
      this.field_246 = true;
      return this;
   }

   private class_103 method_317(char var1) throws IOException {
      this.method_309().field_249.append(var1).append(';');
      return this;
   }

   private class_103 method_303() throws IOException {
      return this.method_301();
   }

   private void method_316(String var1, boolean var2) throws IOException {
      if (!var2) {
         for (int var5 = 0; var5 < var1.length(); var5++) {
            if (!class_7580.method_34445(var1.charAt(var5))) {
               var2 = true;
               break;
            }
         }
      }

      if (!var2) {
         this.field_249.append(var1);
      } else {
         this.field_249.append('"');
         this.field_249.append(method_300(var1, '"'));
         this.field_249.append('"');
      }
   }

   private static String method_300(String var0, char var1) {
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

   private void method_306() throws IOException {
      if (this.field_246) {
         this.field_249.append(',');
         this.field_246 = false;
      }
   }

   @Override
   public void close() throws IOException {
      if (this.field_245 == 0) {
         if (this.field_249 instanceof Writer) {
            ((Writer)this.field_249).flush();
         }
      } else {
         throw new IllegalStateException("Document finished with unbalanced start and end objects");
      }
   }
}
