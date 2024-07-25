package remapped;

import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLEngineResult.Status;

// $VF: synthetic class
public class class_2052 {
   private static String[] field_10380;

   static {
      try {
         field_10379[HandshakeStatus.FINISHED.ordinal()] = 1;
      } catch (NoSuchFieldError var11) {
      }

      try {
         field_10379[HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field_10379[HandshakeStatus.NEED_WRAP.ordinal()] = 3;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field_10379[HandshakeStatus.NEED_TASK.ordinal()] = 4;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field_10379[HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
      } catch (NoSuchFieldError var7) {
      }

      field_10381 = new int[Status.values().length];

      try {
         field_10381[Status.OK.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field_10381[Status.BUFFER_UNDERFLOW.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field_10381[Status.BUFFER_OVERFLOW.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field_10381[Status.CLOSED.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
