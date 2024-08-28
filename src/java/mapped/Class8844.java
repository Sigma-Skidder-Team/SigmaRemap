package mapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class Class8844 {
   public Class2026 field39960 = null;
   public Class2325 field39961 = null;

   public static ByteBuffer method32074(ByteBuffer var0) {
      ByteBuffer var3 = ByteBuffer.allocate(var0.remaining());
      byte var4 = 48;

      while (var0.hasRemaining()) {
         byte var5 = var4;
         var4 = var0.get();
         var3.put(var4);
         if (var5 == 13 && var4 == 10) {
            ((Buffer)var3).limit(var3.position() - 2);
            ((Buffer)var3).position(0);
            return var3;
         }
      }

      ((Buffer)var0).position(var0.position() - var3.position());
      return null;
   }

   public static String method32075(ByteBuffer var0) {
      ByteBuffer var3 = method32074(var0);
      return var3 != null ? Class8134.method28196(var3.array(), 0, var3.limit()) : null;
   }

   public static Class7292 method32076(ByteBuffer var0, Class2026 var1) throws Class2431 {
      String var4 = method32075(var0);
      if (var4 == null) {
         throw new Class2474(var0.capacity() + 128);
      } else {
         String[] var5 = var4.split(" ", 3);
         if (var5.length != 3) {
            throw new Class2431();
         } else {
            Class7292 var6;
            if (var1 != Class2026.field13153) {
               var6 = method32077(var5, var4);
            } else {
               var6 = method32078(var5, var4);
            }

            for (var4 = method32075(var0); var4 != null && var4.length() > 0; var4 = method32075(var0)) {
               String[] var7 = var4.split(":", 2);
               if (var7.length != 2) {
                  throw new Class2431("not an http header");
               }

               if (!var6.method23066(var7[0])) {
                  var6.method23061(var7[0], var7[1].replaceFirst("^ +", ""));
               } else {
                  var6.method23061(var7[0], var6.method23065(var7[0]) + "; " + var7[1].replaceFirst("^ +", ""));
               }
            }

            if (var4 != null) {
               return var6;
            } else {
               throw new Class2474();
            }
         }
      }
   }

   private static Class7292 method32077(String[] var0, String var1) throws Class2431 {
      if ("GET".equalsIgnoreCase(var0[0])) {
         if ("HTTP/1.1".equalsIgnoreCase(var0[2])) {
            Class7300 var4 = new Class7300();
            var4.method23062(var0[1]);
            return var4;
         } else {
            throw new Class2431(String.format("Invalid status line received: %s Status line: %s", var0[2], var1));
         }
      } else {
         throw new Class2431(String.format("Invalid request method received: %s Status line: %s", var0[0], var1));
      }
   }

   private static Class7292 method32078(String[] var0, String var1) throws Class2431 {
      if ("101".equals(var0[1])) {
         if ("HTTP/1.1".equalsIgnoreCase(var0[0])) {
            Class7298 var4 = new Class7298();
            Class7297 var5 = var4;
            var5.method23070(Short.parseShort(var0[1]));
            var5.method23071(var0[2]);
            return var4;
         } else {
            throw new Class2431(String.format("Invalid status line received: %s Status line: %s", var0[0], var1));
         }
      } else {
         throw new Class2431(String.format("Invalid status code received: %s Status line: %s", var0[1], var1));
      }
   }

   public abstract Class2265 method32034(Class7294 var1, Class7296 var2) throws Class2431;

   public abstract Class2265 method32032(Class7294 var1) throws Class2431;

   public boolean method32079(Class7295 var1) {
      return var1.method23065("Upgrade").equalsIgnoreCase("websocket") && var1.method23065("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
   }

   public abstract ByteBuffer method32043(Class6454 var1);

   public abstract List<Class6454> method32052(ByteBuffer var1, boolean var2);

   public abstract List<Class6454> method32053(String var1, boolean var2);

   public abstract void method32060(Class346 var1, Class6454 var2) throws Class2429;

   public List<Class6454> method32080(Class2325 var1, ByteBuffer var2, boolean var3) {
      if (var1 != Class2325.field15912 && var1 != Class2325.field15911) {
         throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
      } else {
         Object var6 = null;
         if (this.field39961 != null) {
            var6 = new Class6451();
         } else {
            this.field39961 = var1;
            if (var1 == Class2325.field15912) {
               var6 = new Class6460();
            } else if (var1 == Class2325.field15911) {
               var6 = new Class6459();
            }
         }

         ((Class6452)var6).method19620(var2);
         ((Class6452)var6).method19621(var3);

         try {
            ((Class6452)var6).method19611();
         } catch (Class2429 var8) {
            throw new IllegalArgumentException(var8);
         }

         if (var3) {
            this.field39961 = null;
         } else {
            this.field39961 = var1;
         }

         return Collections.<Class6454>singletonList((Class6454)var6);
      }
   }

   public abstract void method32054();

   @Deprecated
   public List<ByteBuffer> method32081(Class7295 var1, Class2026 var2) {
      return this.method32082(var1);
   }

   public List<ByteBuffer> method32082(Class7295 var1) {
      return this.method32084(var1, true);
   }

   @Deprecated
   public List<ByteBuffer> method32083(Class7295 var1, Class2026 var2, boolean var3) {
      return this.method32084(var1, var3);
   }

   public List<ByteBuffer> method32084(Class7295 var1, boolean var2) {
      StringBuilder var5 = new StringBuilder(100);
      if (!(var1 instanceof Class7294)) {
         if (!(var1 instanceof Class7296)) {
            throw new IllegalArgumentException("unknown role");
         }

         var5.append("HTTP/1.1 101 ").append(((Class7296)var1).method23069());
      } else {
         var5.append("GET ").append(((Class7294)var1).method23063()).append(" HTTP/1.1");
      }

      var5.append("\r\n");
      Iterator var6 = var1.method23064();

      while (var6.hasNext()) {
         String var7 = (String)var6.next();
         String var8 = var1.method23065(var7);
         var5.append(var7);
         var5.append(": ");
         var5.append(var8);
         var5.append("\r\n");
      }

      var5.append("\r\n");
      byte[] var10 = Class8134.method28194(var5.toString());
      byte[] var11 = !var2 ? null : var1.method23067();
      ByteBuffer var9 = ByteBuffer.allocate((var11 != null ? var11.length : 0) + var10.length);
      var9.put(var10);
      if (var11 != null) {
         var9.put(var11);
      }

      ((Buffer)var9).flip();
      return Collections.<ByteBuffer>singletonList(var9);
   }

   public abstract Class7293 method32040(Class7293 var1) throws Class2431;

   public abstract Class7292 method32041(Class7294 var1, Class7297 var2) throws Class2431;

   public abstract List<Class6454> method32051(ByteBuffer var1) throws Class2429;

   public abstract Class1905 method32071();

   public abstract Class8844 method32042();

   public Class7295 method32085(ByteBuffer var1) throws Class2431 {
      return method32076(var1, this.field39960);
   }

   public int method32086(int var1) throws Class2429 {
      if (var1 >= 0) {
         return var1;
      } else {
         throw new Class2429(1002, "Negative count");
      }
   }

   public int method32087(Class7295 var1) {
      String var4 = var1.method23065("Sec-WebSocket-Version");
      if (var4.length() > 0) {
         try {
            return new Integer(var4.trim());
         } catch (NumberFormatException var7) {
            return -1;
         }
      } else {
         return -1;
      }
   }

   public void method32088(Class2026 var1) {
      this.field39960 = var1;
   }

   public Class2026 method32089() {
      return this.field39960;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }
}
