package net.minecraft.network;

import io.netty.handler.codec.EncoderException;

public class SkipableEncoderException extends EncoderException {
   private static String[] field42508;

   public SkipableEncoderException(Throwable var1) {
      super(var1);
   }
}
