package com.sun.jna;

public class LastErrorException extends RuntimeException {
   private static final long serialVersionUID = 1L;
   private int errorCode;

   private static String formatMessage(int code) {
      return Platform.isWindows() ? "GetLastError() returned " + code : "errno was " + code;
   }

   private static String parseMessage(String m) {
      try {
         return formatMessage(Integer.parseInt(m));
      } catch (NumberFormatException var4) {
         return m;
      }
   }

   public int getErrorCode() {
      return this.errorCode;
   }

   public LastErrorException(String msg) {
      super(parseMessage(msg.trim()));

      try {
         if (msg.startsWith("[")) {
            msg = msg.substring(1, msg.indexOf("]"));
         }

         this.errorCode = Integer.parseInt(msg);
      } catch (NumberFormatException var5) {
         this.errorCode = -1;
      }
   }

   public LastErrorException(int code) {
      this(code, formatMessage(code));
   }

   public LastErrorException(int code, String msg) {
      super(msg);
      this.errorCode = code;
   }
}
