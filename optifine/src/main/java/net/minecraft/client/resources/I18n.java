package net.minecraft.client.resources;

import java.util.Map;
import net.optifine.reflect.Reflector;

public class I18n
{
    private static Locale i18nLocale;

    static void setLocale(Locale i18nLocaleIn)
    {
        i18nLocale = i18nLocaleIn;
        Reflector.call(Reflector.ForgeI18n_loadLanguageData, i18nLocale.properties);
    }

    public static String format(String translateKey, Object... parameters)
    {
        return i18nLocale.formatMessage(translateKey, parameters);
    }

    public static boolean hasKey(String key)
    {
        return i18nLocale.hasKey(key);
    }

    public static Map getLocaleProperties()
    {
        return i18nLocale.properties;
    }
}
