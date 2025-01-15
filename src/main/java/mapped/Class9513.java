// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.net.URISyntaxException;
import java.net.URI;
import com.google.gson.GsonBuilder;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import com.mojang.realmsclient.exception.RealmsServiceException;
import java.net.Proxy;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

public class Class9513
{
    public static Class2223 field40930;
    private static boolean field40931;
    private static final Logger field40932;
    private final String field40933;
    private final String field40934;
    private static final Gson field40935;
    
    public static Class9513 method35444() {
        final String method25354 = Class7847.method25354();
        final String method25355 = Class7847.method25353();
        if (method25354 != null && method25355 != null) {
            if (!Class9513.field40931) {
                Class9513.field40931 = true;
                String s = System.getenv("realms.environment");
                if (s == null) {
                    s = System.getProperty("realms.environment");
                }
                if (s != null) {
                    if (!"LOCAL".equals(s)) {
                        if ("STAGE".equals(s)) {
                            method35445();
                        }
                    }
                    else {
                        method35447();
                    }
                }
            }
            return new Class9513(method25355, method25354, Class7847.method25352());
        }
        return null;
    }
    
    public static void method35445() {
        Class9513.field40930 = Class2223.field13686;
    }
    
    public static void method35446() {
        Class9513.field40930 = Class2223.field13685;
    }
    
    public static void method35447() {
        Class9513.field40930 = Class2223.field13687;
    }
    
    public Class9513(final String field40933, final String field40934, final Proxy proxy) {
        this.field40933 = field40933;
        this.field40934 = field40934;
        Class8076.method26497(proxy);
    }
    
    public Class7425 method35448() throws RealmsServiceException, IOException {
        return Class7425.method22845(this.method35486(Class8178.method27086(this.method35484("worlds"))));
    }
    
    public Class7437 method35449(final long l) throws RealmsServiceException, IOException {
        return Class7437.method22882(this.method35486(Class8178.method27086(this.method35484("worlds" + "/$ID".replace("$ID", String.valueOf(l))))));
    }
    
    public Class7446 method35450() throws RealmsServiceException {
        return Class7446.method22898(this.method35486(Class8178.method27086(this.method35484("activities/liveplayerlist"))));
    }
    
    public Class7428 method35451(final long lng) throws RealmsServiceException, IOException {
        return Class7428.method22860(this.method35486(Class8178.method27087(this.method35484("worlds" + "/v1/$ID/join/pc".replace("$ID", "" + lng)), 5000, 30000)));
    }
    
    public void method35452(final long l, final String s, final String s2) throws RealmsServiceException, IOException {
        this.method35486(Class8178.method27089(this.method35484("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf(l))), Class9513.field40935.toJson((Object)new Class7441(s, s2)), 5000, 10000));
    }
    
    public Boolean method35453() throws RealmsServiceException, IOException {
        return Boolean.valueOf(this.method35486(Class8178.method27086(this.method35484("mco/available"))));
    }
    
    public Boolean method35454() throws RealmsServiceException, IOException {
        return Boolean.valueOf(this.method35486(Class8178.method27086(this.method35484("mco/stageAvailable"))));
    }
    
    public Class2112 method35455() throws RealmsServiceException, IOException {
        final String method35486 = this.method35486(Class8178.method27086(this.method35484("mco/client/compatible")));
        try {
            return Class2112.valueOf(method35486);
        }
        catch (final IllegalArgumentException ex) {
            throw new Class2330(500, "Could not check compatible version, got response: " + method35486, -1, "");
        }
    }
    
    public void method35456(final long l, final String replacement) throws RealmsServiceException {
        this.method35486(Class8178.method27090(this.method35484("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf(l)).replace("$UUID", replacement))));
    }
    
    public void method35457(final long l) throws RealmsServiceException {
        this.method35486(Class8178.method27090(this.method35484("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l)))));
    }
    
    public Class7437 method35458(final long l, final String s) throws RealmsServiceException, IOException {
        final Class7427 class7427 = new Class7427();
        class7427.method22851(s);
        return Class7437.method22882(this.method35486(Class8178.method27088(this.method35484("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l))), Class9513.field40935.toJson((Object)class7427))));
    }
    
    public Class7436 method35459(final long l) throws RealmsServiceException {
        return Class7436.method22870(this.method35486(Class8178.method27086(this.method35484("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf(l))))));
    }
    
    public void method35460(final long l, final String s, final String s2) throws RealmsServiceException, UnsupportedEncodingException {
        this.method35486(Class8178.method27088(this.method35484("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l))), Class9513.field40935.toJson((Object)new Class7441(s, s2))));
    }
    
    public void method35461(final long l, final int i, final Class7424 class7424) throws RealmsServiceException, UnsupportedEncodingException {
        this.method35486(Class8178.method27088(this.method35484("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf(l)).replace("$SLOT_ID", String.valueOf(i))), class7424.method22844()));
    }
    
    public boolean method35462(final long l, final int i) throws RealmsServiceException {
        return Boolean.valueOf(this.method35486(Class8178.method27091(this.method35484("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf(l)).replace("$SLOT_ID", String.valueOf(i))), "")));
    }
    
    public void method35463(final long l, final String str) throws RealmsServiceException {
        this.method35486(Class8178.method27092(this.method35485("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf(l)), "backupId=" + str), "", 40000, 600000));
    }
    
    public Class7445 method35464(final int i, final int j, final Class271 class271) throws RealmsServiceException {
        return Class7445.method22897(this.method35486(Class8178.method27086(this.method35485("worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", class271.toString()), String.format("page=%d&pageSize=%d", i, j)))));
    }
    
    public Boolean method35465(final long l, final String replacement) throws RealmsServiceException {
        return Boolean.valueOf(this.method35486(Class8178.method27091(this.method35484("worlds" + "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", replacement).replace("$WORLD_ID", String.valueOf(l))), "")));
    }
    
    public Class7434 method35466(final long l, final String replacement) throws RealmsServiceException {
        return Class7434.method22868(this.method35486(Class8178.method27088(this.method35484("ops" + "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf(l)).replace("$PROFILE_UUID", replacement)), "")));
    }
    
    public Class7434 method35467(final long l, final String replacement) throws RealmsServiceException {
        return Class7434.method22868(this.method35486(Class8178.method27090(this.method35484("ops" + "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf(l)).replace("$PROFILE_UUID", replacement)))));
    }
    
    public Boolean method35468(final long l) throws RealmsServiceException, IOException {
        return Boolean.valueOf(this.method35486(Class8178.method27091(this.method35484("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf(l))), "")));
    }
    
    public Boolean method35469(final long l) throws RealmsServiceException, IOException {
        return Boolean.valueOf(this.method35486(Class8178.method27091(this.method35484("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf(l))), "")));
    }
    
    public Boolean method35470(final long l, final String s, final Integer n, final boolean b) throws RealmsServiceException, IOException {
        return Boolean.valueOf(this.method35486(Class8178.method27089(this.method35484("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(l))), Class9513.field40935.toJson((Object)new Class7421(s, -1L, n, b)), 30000, 80000)));
    }
    
    public Boolean method35471(final long l, final String s) throws RealmsServiceException, IOException {
        return Boolean.valueOf(this.method35486(Class8178.method27089(this.method35484("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(l))), Class9513.field40935.toJson((Object)new Class7421(null, Long.valueOf(s), -1, false)), 30000, 80000)));
    }
    
    public Class7432 method35472(final long l) throws RealmsServiceException, IOException {
        return Class7432.method22865(this.method35486(Class8178.method27086(this.method35484("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l))))));
    }
    
    public int method35473() throws RealmsServiceException {
        return Integer.parseInt(this.method35486(Class8178.method27086(this.method35484("invites/count/pending"))));
    }
    
    public Class7423 method35474() throws RealmsServiceException {
        return Class7423.method22837(this.method35486(Class8178.method27086(this.method35484("invites/pending"))));
    }
    
    public void method35475(final String replacement) throws RealmsServiceException {
        this.method35486(Class8178.method27091(this.method35484("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", replacement)), ""));
    }
    
    public Class7431 method35476(final long l, final int i) throws RealmsServiceException {
        return Class7431.method22864(this.method35486(Class8178.method27086(this.method35484("worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf(l)).replace("$SLOT_ID", String.valueOf(i))))));
    }
    
    public Class7444 method35477(final long l, final String s) throws RealmsServiceException {
        final String method35484 = this.method35484("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf(l)));
        final Class7444 class7444 = new Class7444();
        if (s != null) {
            class7444.method22894(s);
        }
        final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation();
        return Class7444.method22890(this.method35486(Class8178.method27091(method35484, gsonBuilder.create().toJson((Object)class7444))));
    }
    
    public void method35478(final String replacement) throws RealmsServiceException {
        this.method35486(Class8178.method27091(this.method35484("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", replacement)), ""));
    }
    
    public void method35479() throws RealmsServiceException {
        this.method35486(Class8178.method27088(this.method35484("mco/tos/agreed"), ""));
    }
    
    public Class7439 method35480() throws RealmsServiceException, IOException {
        return Class7439.method22888(this.method35486(Class8178.method27087(this.method35484("mco/v1/news"), 5000, 10000)));
    }
    
    public void method35481(final Class7443 class7443) throws RealmsServiceException {
        this.method35486(Class8178.method27088(this.method35484("regions/ping/stat"), Class9513.field40935.toJson((Object)class7443)));
    }
    
    public Boolean method35482() throws RealmsServiceException, IOException {
        return Boolean.valueOf(this.method35486(Class8178.method27086(this.method35484("trial"))));
    }
    
    public void method35483(final long l) throws RealmsServiceException, IOException {
        this.method35486(Class8178.method27090(this.method35484("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(l)))));
    }
    
    private String method35484(final String s) {
        return this.method35485(s, null);
    }
    
    private String method35485(final String str, final String query) {
        try {
            return new URI(Class9513.field40930.field13689, Class9513.field40930.field13688, "/" + str, query, null).toASCIIString();
        }
        catch (final URISyntaxException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private String method35486(final Class8178<?> class8178) throws RealmsServiceException {
        class8178.method27077("sid", this.field40933);
        class8178.method27077("user", this.field40934);
        class8178.method27077("version", Class7847.method25377());
        try {
            final int method27081 = class8178.method27081();
            if (method27081 == 503) {
                throw new Class2331(class8178.method27079());
            }
            final String method27082 = class8178.method27082();
            if (method27081 >= 200 && method27081 < 300) {
                return method27082;
            }
            if (method27081 == 401) {
                final String method27083 = class8178.method27093("WWW-Authenticate");
                Class9513.field40932.info("Could not authorize you against Realms server: " + method27083);
                throw new Class2330(method27081, method27083, -1, method27083);
            }
            if (method27082 != null && method27082.length() != 0) {
                final Class8669 class8179 = new Class8669(method27082);
                Class9513.field40932.error("Realms http code: " + method27081 + " -  error code: " + class8179.method29678() + " -  message: " + class8179.method29677() + " - raw body: " + method27082);
                throw new Class2330(method27081, method27082, class8179);
            }
            Class9513.field40932.error("Realms error code: " + method27081 + " message: " + method27082);
            throw new Class2330(method27081, method27082, method27081, "");
        }
        catch (final Class2356 class8180) {
            throw new Class2330(500, "Could not connect to Realms: " + class8180.getMessage(), -1, "");
        }
    }
    
    static {
        Class9513.field40930 = Class2223.field13685;
        field40932 = LogManager.getLogger();
        field40935 = new Gson();
    }
}
