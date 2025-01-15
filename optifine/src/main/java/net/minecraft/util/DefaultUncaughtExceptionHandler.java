package net.minecraft.util;

import java.lang.Thread.UncaughtExceptionHandler;
import org.apache.logging.log4j.Logger;

public class DefaultUncaughtExceptionHandler implements UncaughtExceptionHandler
{
    private final Logger logger;

    public DefaultUncaughtExceptionHandler(Logger p_i1857_1_)
    {
        this.logger = p_i1857_1_;
    }

    public void uncaughtException(Thread p_uncaughtException_1_, Throwable p_uncaughtException_2_)
    {
        this.logger.error("Caught previously unhandled exception :", p_uncaughtException_2_);
    }
}
