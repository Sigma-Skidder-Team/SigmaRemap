package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Class8190 {
   private static Method field35209;
   private static Method field35210;
   private static Method field35211;

   public static List<Object> method28483(ByteToMessageDecoder var0, ChannelHandlerContext var1, Object var2) throws InvocationTargetException {
      ArrayList var5 = new ArrayList();

      try {
         field35209.invoke(var0, var1, var2, var5);
      } catch (IllegalAccessException var7) {
         var7.printStackTrace();
      }

      return var5;
   }

   public static void method28484(MessageToByteEncoder var0, ChannelHandlerContext var1, Object var2, ByteBuf var3) throws InvocationTargetException {
      try {
         field35210.invoke(var0, var1, var2, var3);
      } catch (IllegalAccessException var7) {
         var7.printStackTrace();
      }
   }

   public static List<Object> method28485(MessageToMessageDecoder var0, ChannelHandlerContext var1, Object var2) throws InvocationTargetException {
      ArrayList var5 = new ArrayList();

      try {
         field35211.invoke(var0, var1, var2, var5);
      } catch (IllegalAccessException var7) {
         var7.printStackTrace();
      }

      return var5;
   }

   public static boolean method28486(Throwable var0, Class<?> var1) {
      while (var0 != null) {
         if (var1.isAssignableFrom(var0.getClass())) {
            return true;
         }

         var0 = var0.getCause();
      }

      return false;
   }

   public static ChannelHandlerContext method28487(String var0, ChannelPipeline var1) {
      boolean var4 = false;

      for (String var6 : var1.names()) {
         if (var4) {
            return var1.context(var1.get(var6));
         }

         if (var6.equalsIgnoreCase(var0)) {
            var4 = true;
         }
      }

      return null;
   }

   public static ChannelHandlerContext method28488(String var0, ChannelPipeline var1) {
      String var4 = null;

      for (String var6 : var1.toMap().keySet()) {
         if (var6.equals(var0)) {
            return var1.context(var4);
         }

         var4 = var6;
      }

      return null;
   }

   static {
      try {
         field35209 = ByteToMessageDecoder.class.getDeclaredMethod("decode", ChannelHandlerContext.class, ByteBuf.class, List.class);
         field35209.setAccessible(true);
      } catch (NoSuchMethodException var9) {
         var9.printStackTrace();
      }

      try {
         field35210 = MessageToByteEncoder.class.getDeclaredMethod("encode", ChannelHandlerContext.class, Object.class, ByteBuf.class);
         field35210.setAccessible(true);
      } catch (NoSuchMethodException var8) {
         var8.printStackTrace();
      }

      try {
         field35211 = MessageToMessageDecoder.class.getDeclaredMethod("decode", ChannelHandlerContext.class, Object.class, List.class);
         field35211.setAccessible(true);
      } catch (NoSuchMethodException var7) {
         var7.printStackTrace();
      }
   }
}
