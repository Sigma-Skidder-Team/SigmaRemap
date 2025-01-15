package com.mojang.realmsclient.client;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.realmsclient.util.JsonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RealmsError
{
    private static final Logger field_224975_a = LogManager.getLogger();
    private String field_224976_b;
    private int field_224977_c;

    public RealmsError(String p_i3089_1_)
    {
        try
        {
            JsonParser jsonparser = new JsonParser();
            JsonObject jsonobject = jsonparser.parse(p_i3089_1_).getAsJsonObject();
            this.field_224976_b = JsonUtils.func_225171_a("errorMsg", jsonobject, "");
            this.field_224977_c = JsonUtils.func_225172_a("errorCode", jsonobject, -1);
        }
        catch (Exception exception)
        {
            field_224975_a.error("Could not parse RealmsError: " + exception.getMessage());
            field_224975_a.error("The error was: " + p_i3089_1_);
        }
    }

    public String func_224973_a()
    {
        return this.field_224976_b;
    }

    public int func_224974_b()
    {
        return this.field_224977_c;
    }
}
