package net.minecraft.server.management;

import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class UserListEntry<T>
{
    @Nullable
    private final T value;

    public UserListEntry(T p_i2519_1_)
    {
        this.value = p_i2519_1_;
    }

    protected UserListEntry(@Nullable T p_i2520_1_, JsonObject p_i2520_2_)
    {
        this.value = p_i2520_1_;
    }

    @Nullable
    T getValue()
    {
        return this.value;
    }

    boolean hasBanExpired()
    {
        return false;
    }

    protected void onSerialization(JsonObject data)
    {
    }
}
