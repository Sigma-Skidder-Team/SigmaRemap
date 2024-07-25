package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;

public abstract class class_7212 {
   public class_5282 field_37041 = null;
   public class_9252 field_37042 = null;

   public static ByteBuffer method_33035(ByteBuffer var0) {
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

   public static String method_33040(ByteBuffer var0) {
      ByteBuffer var3 = method_33035(var0);
      return var3 != null ? class_3687.method_17157(var3.array(), 0, var3.limit()) : null;
   }

   public static class_1699 method_33033(ByteBuffer var0, class_5282 var1) throws InvalidHandshakeException {
      String var4 = method_33040(var0);
      if (var4 == null) {
         throw new class_8038(var0.capacity() + 128);
      } else {
         String[] var5 = var4.split(" ", 3);
         if (var5.length != 3) {
            throw new class_542();
         } else {
            class_1699 var6;
            if (var1 != class_5282.field_27022) {
               var6 = method_33037(var5, var4);
            } else {
               var6 = method_33027(var5, var4);
            }

            for (var4 = method_33040(var0); var4 != null && var4.length() > 0; var4 = method_33040(var0)) {
               String[] var7 = var4.split(":", 2);
               if (var7.length != 2) {
                  throw new class_542("not an http header");
               }

               if (!var6.퉧䎰뵯蒕娍ኞ(var7[0])) {
                  var6.method_7629(var7[0], var7[1].replaceFirst("^ +", ""));
               } else {
                  var6.method_7629(var7[0], var6.댠ኞ쇽蓳牰픓(var7[0]) + "; " + var7[1].replaceFirst("^ +", ""));
               }
            }

            if (var4 != null) {
               return var6;
            } else {
               throw new class_8038();
            }
         }
      }
   }

   private static class_1699 method_33037(String[] var0, String var1) throws InvalidHandshakeException {
      if ("GET".equalsIgnoreCase(var0[0])) {
         if ("HTTP/1.1".equalsIgnoreCase(var0[2])) {
            class_9627 var4 = new class_9627();
            var4.method_24243(var0[1]);
            return var4;
         } else {
            throw new class_542(String.format("Invalid status line received: %s Status line: %s", var0[2], var1));
         }
      } else {
         throw new class_542(String.format("Invalid request method received: %s Status line: %s", var0[0], var1));
      }
   }

   private static class_1699 method_33027(String[] var0, String var1) throws InvalidHandshakeException {
      if ("101".equals(var0[1])) {
         if ("HTTP/1.1".equalsIgnoreCase(var0[0])) {
            class_1963 var4 = new class_1963();
            class_9710 var5 = var4;
            var5.method_44851(Short.parseShort(var0[1]));
            var5.method_44850(var0[2]);
            return var4;
         } else {
            throw new class_542(String.format("Invalid status line received: %s Status line: %s", var0[0], var1));
         }
      } else {
         throw new class_542(String.format("Invalid status code received: %s Status line: %s", var0[1], var1));
      }
   }

   public abstract class_2952 method_33023(class_9112 var1, class_6999 var2) throws InvalidHandshakeException;

   public abstract class_2952 method_33026(class_9112 var1) throws InvalidHandshakeException;

   public boolean method_33028(class_6113 var1) {
      return var1.method_28084("Upgrade").equalsIgnoreCase("websocket") && var1.method_28084("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
   }

   public abstract ByteBuffer method_33042(class_3106 var1);

   public abstract List<class_3106> method_33030(ByteBuffer var1, boolean var2);

   public abstract List<class_3106> method_33029(String var1, boolean var2);

   public abstract void method_33034(class_5913 var1, class_3106 var2) throws InvalidDataException;

   public List<class_3106> method_33039(class_9252 var1, ByteBuffer var2, boolean var3) {
      if (var1 != class_9252.field_47225 && var1 != class_9252.field_47232) {
         throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
      } else {
         Object var6 = null;
         if (this.field_37042 != null) {
            var6 = new class_659();
         } else {
            this.field_37042 = var1;
            if (var1 == class_9252.field_47225) {
               var6 = new class_4450();
            } else if (var1 == class_9252.field_47232) {
               var6 = new class_7109();
            }
         }

         ((class_7518)var6).method_23565(var2);
         ((class_7518)var6).method_23569(var3);

         try {
            ((class_7518)var6).method_23572();
         } catch (class_9615 var8) {
            throw new IllegalArgumentException(var8);
         }

         if (var3) {
            this.field_37042 = null;
         } else {
            this.field_37042 = var1;
         }

         return Collections.<class_3106>singletonList((class_3106)var6);
      }
   }

   public abstract void method_33041();

   @Deprecated
   public List<ByteBuffer> method_33019(class_6113 var1, class_5282 var2) {
      return this.method_33018(var1);
   }

   public List<ByteBuffer> method_33018(class_6113 var1) {
      return this.method_33021(var1, true);
   }

   @Deprecated
   public List<ByteBuffer> method_33020(class_6113 var1, class_5282 var2, boolean var3) {
      return this.method_33021(var1, var3);
   }

   public List<ByteBuffer> method_33021(class_6113 var1, boolean var2) {
      StringBuilder var5 = new StringBuilder(100);
      if (!(var1 instanceof class_9112)) {
         if (!(var1 instanceof class_6999)) {
            throw new IllegalArgumentException("unknown role");
         }

         var5.append("HTTP/1.1 101 ").append(((class_6999)var1).method_32004());
      } else {
         var5.append("GET ").append(((class_9112)var1).method_41962()).append(" HTTP/1.1");
      }

      var5.append("\r\n");
      Iterator var6 = var1.method_28083();

      while (var6.hasNext()) {
         String var7 = (String)var6.next();
         String var8 = var1.method_28084(var7);
         var5.append(var7);
         var5.append(": ");
         var5.append(var8);
         var5.append("\r\n");
      }

      var5.append("\r\n");
      byte[] var10 = class_3687.method_17152(var5.toString());
      byte[] var11 = !var2 ? null : var1.method_28082();
      ByteBuffer var9 = ByteBuffer.allocate((var11 != null ? var11.length : 0) + var10.length);
      var9.put(var10);
      if (var11 != null) {
         var9.put(var11);
      }

      ((Buffer)var9).flip();
      return Collections.<ByteBuffer>singletonList(var9);
   }

   public abstract class_5312 method_33024(class_5312 var1) throws InvalidHandshakeException;

   public abstract class_1699 method_33031(class_9112 var1, class_9710 var2) throws InvalidHandshakeException;

   public abstract List<class_3106> method_33036(ByteBuffer var1) throws InvalidDataException;

   public abstract class_3555 method_33025();

   public abstract class_7212 method_33032();

   public class_6113 method_33022(ByteBuffer var1) throws InvalidHandshakeException {
      return method_33033(var1, this.field_37041);
   }

   public int method_33043(int var1) throws InvalidDataException {
      if (var1 >= 0) {
         return var1;
      } else {
         throw new class_9615(1002, "Negative count");
      }
   }

   public int method_33044(class_6113 var1) {
      String var4 = var1.method_28084("Sec-WebSocket-Version");
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

   public void method_33017(class_5282 var1) {
      this.field_37041 = var1;
   }

   public class_5282 method_33038() {
      return this.field_37041;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName();
   }
}
