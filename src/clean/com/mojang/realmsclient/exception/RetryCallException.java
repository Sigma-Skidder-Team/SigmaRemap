package com.mojang.realmsclient.exception;

public class RetryCallException extends RealmsServiceException
{
    public final int field_224985_e;

    public RetryCallException(int p_i242130_1_, int p_i242130_2_)
    {
        super(p_i242130_2_, "Retry operation", -1, "");

        if (p_i242130_1_ >= 0 && p_i242130_1_ <= 120)
        {
            this.field_224985_e = p_i242130_1_;
        }
        else
        {
            this.field_224985_e = 5;
        }
    }
}
