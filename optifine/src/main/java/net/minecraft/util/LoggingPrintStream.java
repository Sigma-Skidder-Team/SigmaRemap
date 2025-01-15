package net.minecraft.util;

import java.io.OutputStream;
import java.io.PrintStream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingPrintStream extends PrintStream
{
    protected static final Logger LOGGER = LogManager.getLogger();
    protected final String domain;

    public LoggingPrintStream(String p_i2336_1_, OutputStream p_i2336_2_)
    {
        super(p_i2336_2_);
        this.domain = p_i2336_1_;
    }

    public void println(@Nullable String p_println_1_)
    {
        this.logString(p_println_1_);
    }

    public void println(Object p_println_1_)
    {
        this.logString(String.valueOf(p_println_1_));
    }

    protected void logString(@Nullable String string)
    {
        LOGGER.info("[{}]: {}", this.domain, string);
    }
}
