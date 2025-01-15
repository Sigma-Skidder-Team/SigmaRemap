package net.minecraft.util.text;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LanguageMap
{
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Pattern NUMERIC_VARIABLE_PATTERN = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    private static final LanguageMap INSTANCE = new LanguageMap();
    private final Map<String, String> languageList = Maps.newHashMap();
    private long lastUpdateTimeInMilliseconds;

    public LanguageMap()
    {
        try (InputStream inputstream = LanguageMap.class.getResourceAsStream("/assets/minecraft/lang/en_us.json"))
        {
            JsonElement jsonelement = (new Gson()).fromJson(new InputStreamReader(inputstream, StandardCharsets.UTF_8), JsonElement.class);
            JsonObject jsonobject = JSONUtils.getJsonObject(jsonelement, "strings");

            for (Entry<String, JsonElement> entry : jsonobject.entrySet())
            {
                String s = NUMERIC_VARIABLE_PATTERN.matcher(JSONUtils.getString(entry.getValue(), entry.getKey())).replaceAll("%$1s");
                this.languageList.put(entry.getKey(), s);
            }

            this.lastUpdateTimeInMilliseconds = Util.milliTime();
        }
        catch (JsonParseException | IOException ioexception)
        {
            LOGGER.error("Couldn't read strings from /assets/minecraft/lang/en_us.json", (Throwable)ioexception);
        }
    }

    public static LanguageMap getInstance()
    {
        return INSTANCE;
    }

    public static synchronized void replaceWith(Map<String, String> p_135063_0_)
    {
        INSTANCE.languageList.clear();
        INSTANCE.languageList.putAll(p_135063_0_);
        INSTANCE.lastUpdateTimeInMilliseconds = Util.milliTime();
    }

    public synchronized String translateKey(String key)
    {
        return this.tryTranslateKey(key);
    }

    private String tryTranslateKey(String key)
    {
        String s = this.languageList.get(key);
        return s == null ? key : s;
    }

    public synchronized boolean exists(String p_210813_1_)
    {
        return this.languageList.containsKey(p_210813_1_);
    }

    public long getLastUpdateTimeInMilliseconds()
    {
        return this.lastUpdateTimeInMilliseconds;
    }
}
