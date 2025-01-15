package net.minecraft.server;

import java.io.OutputStream;
import net.minecraft.util.LoggingPrintStream;

public class DebugLoggingPrintStream extends LoggingPrintStream
{
    public DebugLoggingPrintStream(String p_i2927_1_, OutputStream p_i2927_2_)
    {
        super(p_i2927_1_, p_i2927_2_);
    }

    protected void logString(String string)
    {
        StackTraceElement[] astacktraceelement = Thread.currentThread().getStackTrace();
        StackTraceElement stacktraceelement = astacktraceelement[Math.min(3, astacktraceelement.length)];
        LOGGER.info("[{}]@.({}:{}): {}", this.domain, stacktraceelement.getFileName(), stacktraceelement.getLineNumber(), string);
    }
}
