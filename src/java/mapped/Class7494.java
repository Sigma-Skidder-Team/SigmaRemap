package mapped;

import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLEngineResult.Status;

// $VF: synthetic class
public class Class7494 {
   private static String[] field32196;
   public static final int[] field32197;
   public static final int[] field32198 = new int[HandshakeStatus.values().length];

   static {
      try {
         field32198[HandshakeStatus.FINISHED.ordinal()] = 1;
      } catch (NoSuchFieldError var11) {
      }

      try {
         field32198[HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
      } catch (NoSuchFieldError var10) {
      }

      try {
         field32198[HandshakeStatus.NEED_WRAP.ordinal()] = 3;
      } catch (NoSuchFieldError var9) {
      }

      try {
         field32198[HandshakeStatus.NEED_TASK.ordinal()] = 4;
      } catch (NoSuchFieldError var8) {
      }

      try {
         field32198[HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
      } catch (NoSuchFieldError var7) {
      }

      field32197 = new int[Status.values().length];

      try {
         field32197[Status.OK.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         field32197[Status.BUFFER_UNDERFLOW.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field32197[Status.BUFFER_OVERFLOW.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field32197[Status.CLOSED.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }
   }
}
