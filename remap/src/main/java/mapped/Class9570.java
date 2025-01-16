// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.util.Set;
import java.util.List;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.apache.logging.log4j.Logger;

public class Class9570
{
    private static final Logger field41176;
    private static boolean field41177;
    public static Class7363 field41178;
    public static Class7363 field41179;
    public static Class7361 field41180;
    public static Class7361 field41181;
    public static Class7361 field41182;
    public static Class7363 field41183;
    public static Class7363 field41184;
    public static Class7361 field41185;
    public static Class7363 field41186;
    public static Class7361 field41187;
    public static Class7361 field41188;
    public static Class7363 field41189;
    public static Class7362 field41190;
    public static Class7363 field41191;
    public static Class7362 field41192;
    public static Class7363 field41193;
    public static Class7362 field41194;
    public static Class7363 field41195;
    public static Class7361 field41196;
    public static Class7361 field41197;
    public static Class7363 field41198;
    public static Class7361 field41199;
    public static Class7361 field41200;
    public static Class7361 field41201;
    public static Class7363 field41202;
    public static Class7361 field41203;
    public static Class7363 field41204;
    public static Class7362 field41205;
    public static Class7363 field41206;
    public static Class7362 field41207;
    public static Class7363 field41208;
    public static Class7364 field41209;
    public static Class7361 field41210;
    public static Class7363 field41211;
    public static Class7361 field41212;
    public static Class7361 field41213;
    public static Class7361 field41214;
    public static Class7363 field41215;
    public static Class7362 field41216;
    public static Class7361 field41217;
    public static Class7361 field41218;
    public static Class7361 field41219;
    public static Class7363 field41220;
    public static Class7362 field41221;
    public static Class7363 field41222;
    public static Class7362 field41223;
    public static Class7363 field41224;
    public static Class7361 field41225;
    public static Class7361 field41226;
    public static Class7363 field41227;
    public static Class7361 field41228;
    public static Class7363 field41229;
    public static Class7364 field41230;
    public static Class7364 field41231;
    public static Class7364 field41232;
    public static Class7363 field41233;
    public static Class7361 field41234;
    public static Class7361 field41235;
    public static Class7363 field41236;
    public static Class7362 field41237;
    public static Class7363 field41238;
    public static Class7361 field41239;
    public static Class7363 field41240;
    public static Class7361 field41241;
    public static Class7361 field41242;
    public static Class7361 field41243;
    public static Class7361 field41244;
    public static Class7361 field41245;
    public static Class7361 field41246;
    public static Class7361 field41247;
    public static Class7361 field41248;
    public static Class7363 field41249;
    public static Class7361 field41250;
    public static Class7363 field41251;
    public static Class7361 field41252;
    public static Class7361 field41253;
    public static Class7361 field41254;
    public static Class7361 field41255;
    public static Class7363 field41256;
    public static Class7361 field41257;
    public static Class7363 field41258;
    public static Class7361 field41259;
    public static Class7363 field41260;
    public static Class7364 field41261;
    public static Class7363 field41262;
    public static Class7361 field41263;
    public static Class7361 field41264;
    public static Class7361 field41265;
    public static Class7361 field41266;
    public static Class7361 field41267;
    public static Class7361 field41268;
    public static Class7361 field41269;
    public static Class7361 field41270;
    public static Class7363 field41271;
    public static Class7361 field41272;
    public static Class7363 field41273;
    public static Class7361 field41274;
    public static Class7361 field41275;
    public static Class7361 field41276;
    public static Class7361 field41277;
    public static Class7361 field41278;
    public static Class7361 field41279;
    public static Class7361 field41280;
    public static Class7361 field41281;
    public static Class7363 field41282;
    public static Class7361 field41283;
    public static Class7361 field41284;
    public static Class7361 field41285;
    public static Class7361 field41286;
    public static Class7361 field41287;
    public static Class7361 field41288;
    public static Class7361 field41289;
    public static Class7361 field41290;
    public static Class7361 field41291;
    public static Class7361 field41292;
    public static Class7361 field41293;
    public static Class7361 field41294;
    public static Class7361 field41295;
    public static Class7361 field41296;
    public static Class7361 field41297;
    public static Class7361 field41298;
    public static Class7361 field41299;
    public static Class7361 field41300;
    public static Class7361 field41301;
    public static Class7361 field41302;
    public static Class7361 field41303;
    public static Class7361 field41304;
    public static Class7361 field41305;
    public static Class7361 field41306;
    public static Class7361 field41307;
    public static Class7361 field41308;
    public static Class7361 field41309;
    public static Class7361 field41310;
    public static Class7361 field41311;
    public static Class7361 field41312;
    public static Class7363 field41313;
    public static Class7364 field41314;
    public static Class7363 field41315;
    public static Class7364 field41316;
    public static Class7363 field41317;
    public static Class7364 field41318;
    public static Class7363 field41319;
    public static Class7364 field41320;
    public static Class7364 field41321;
    public static Class7361 field41322;
    public static Class7363 field41323;
    public static Class7361 field41324;
    public static Class7361 field41325;
    public static Class7361 field41326;
    public static Class7361 field41327;
    public static Class7361 field41328;
    public static Class7361 field41329;
    public static Class7361 field41330;
    public static Class7361 field41331;
    public static Class7361 field41332;
    public static Class7363 field41333;
    public static Class7361 field41334;
    public static Class7361 field41335;
    public static Class7361 field41336;
    public static Class7361 field41337;
    public static Class7361 field41338;
    public static Class7363 field41339;
    public static Class7361 field41340;
    public static Class7363 field41341;
    public static Class7361 field41342;
    public static Class7361 field41343;
    public static Class7363 field41344;
    public static Class7361 field41345;
    public static Class7361 field41346;
    public static Class7361 field41347;
    public static Class7363 field41348;
    public static Class7361 field41349;
    public static Class7361 field41350;
    public static Class7361 field41351;
    public static Class7363 field41352;
    public static Class7361 field41353;
    public static Class7363 field41354;
    public static Class7361 field41355;
    public static Class7361 field41356;
    public static Class7363 field41357;
    public static Class7361 field41358;
    public static Class7361 field41359;
    public static Class7364 field41360;
    public static Class7363 field41361;
    public static Class7361 field41362;
    public static Class7361 field41363;
    public static Class7361 field41364;
    public static Class7361 field41365;
    public static Class7361 field41366;
    public static Class7363 field41367;
    public static Class7361 field41368;
    public static Class7363 field41369;
    public static Class7362 field41370;
    public static Class7363 field41371;
    public static Class7364 field41372;
    public static Class7363 field41373;
    public static Class7361 field41374;
    public static Class7364 field41375;
    public static Class7363 field41376;
    public static Class7364 field41377;
    public static Class7363 field41378;
    public static Class7364 field41379;
    public static Class7364 field41380;
    public static Class7361 field41381;
    public static Class7363 field41382;
    public static Class7361 field41383;
    public static Class7361 field41384;
    public static Class7363 field41385;
    public static Class7364 field41386;
    public static Class7363 field41387;
    public static Class7361 field41388;
    public static Class7363 field41389;
    public static Class7361 field41390;
    public static Class7363 field41391;
    public static Class7364 field41392;
    public static Class7363 field41393;
    public static Class7364 field41394;
    public static Class7361 field41395;
    public static Class7363 field41396;
    public static Class7364 field41397;
    public static Class7363 field41398;
    public static Class7362 field41399;
    public static Class7363 field41400;
    public static Class7361 field41401;
    public static Class7363 field41402;
    public static Class7361 field41403;
    public static Class7361 field41404;
    public static Class7361 field41405;
    public static Class7363 field41406;
    public static Class7364 field41407;
    public static Class7363 field41408;
    public static Class7361 field41409;
    public static Class7363 field41410;
    public static Class7362 field41411;
    public static Class7363 field41412;
    public static Class7362 field41413;
    public static Class7363 field41414;
    public static Class7362 field41415;
    public static Class7363 field41416;
    public static Class7362 field41417;
    public static Class7361 field41418;
    public static Class7363 field41419;
    public static Class7361 field41420;
    public static Class7361 field41421;
    public static Class7361 field41422;
    public static Class7363 field41423;
    public static Class7361 field41424;
    public static Class7361 field41425;
    public static Class7363 field41426;
    public static Class7362 field41427;
    private static boolean field41428;
    public static Class7363 field41429;
    public static Class7364 field41430;
    public static Class7363 field41431;
    public static Class7364 field41432;
    public static Class7363 field41433;
    public static Class7364 field41434;
    public static Class7363 field41435;
    public static Class7364 field41436;
    public static Class7363 field41437;
    public static Class7364 field41438;
    public static Class7363 field41439;
    public static Class7364 field41440;
    public static Class7363 field41441;
    public static Class7364 field41442;
    public static Class7363 field41443;
    public static Class7364 field41444;
    public static Class7363 field41445;
    public static Class7364 field41446;
    public static Class7363 field41447;
    public static Class7070 field41448;
    public static Class7363 field41449;
    public static Class7070 field41450;
    public static Class7363 field41451;
    public static Class7364 field41452;
    public static Class7364 field41453;
    public static Class7364 field41454;
    public static Class7363 field41455;
    public static Class7364 field41456;
    public static Class7364 field41457;
    public static Class7363 field41458;
    public static Class7070 field41459;
    public static Class7363 field41460;
    public static Class7070 field41461;
    public static Class7363 field41462;
    public static Class7070 field41463;
    public static Class7363 field41464;
    public static Class7070 field41465;
    public static Class7363 field41466;
    public static Class7364 field41467;
    public static Class7363 field41468;
    public static Class7070 field41469;
    public static Class7363 field41470;
    public static Class7364 field41471;
    public static Class7364 field41472;
    public static Class7363 field41473;
    public static Class7364 field41474;
    public static Class7363 field41475;
    public static Class7070 field41476;
    public static Class7363 field41477;
    public static Class7364 field41478;
    public static Class7364 field41479;
    public static Class7363 field41480;
    public static Class7364 field41481;
    public static Class7364 field41482;
    public static Class7364 field41483;
    public static Class7364 field41484;
    public static Class7363 field41485;
    public static Class7364 field41486;
    public static Class7364 field41487;
    public static Class7363 field41488;
    public static Class7070 field41489;
    public static Class7363 field41490;
    public static Class7070 field41491;
    public static Class7363 field41492;
    public static Class7070 field41493;
    public static Class7363 field41494;
    public static Class7070 field41495;
    public static Class7363 field41496;
    public static Class7364 field41497;
    public static Class7363 field41498;
    public static Class7364 field41499;
    public static Class7363 field41500;
    public static Class7070 field41501;
    public static Class7363 field41502;
    public static Class7364 field41503;
    public static Class7363 field41504;
    public static Class7364 field41505;
    public static Class7364 field41506;
    public static Class7363 field41507;
    public static Class7070 field41508;
    public static Class7363 field41509;
    public static Class7070 field41510;
    public static Class7363 field41511;
    public static Class7070 field41512;
    public static Class7363 field41513;
    public static Class7070 field41514;
    public static Class7363 field41515;
    public static Class7070 field41516;
    public static Class7363 field41517;
    public static Class7070 field41518;
    public static Class7363 field41519;
    public static Class7070 field41520;
    public static Class7363 field41521;
    public static Class7070 field41522;
    public static Class7363 field41523;
    public static Class7070 field41524;
    public static Class7363 field41525;
    public static Class7070 field41526;
    public static Class7363 field41527;
    public static Class7070 field41528;
    public static Class7363 field41529;
    public static Class7364 field41530;
    public static Class7363 field41531;
    public static Class7070 field41532;
    public static Class7363 field41533;
    public static Class7364 field41534;
    public static Class7363 field41535;
    public static Class7364 field41536;
    public static Class7364 field41537;
    public static Class7363 field41538;
    public static Class7070 field41539;
    public static Class7363 field41540;
    public static Class7070 field41541;
    public static Class7363 field41542;
    public static Class7070 field41543;
    public static Class7363 field41544;
    public static Class7364 field41545;
    public static Class7364 field41546;
    public static Class7363 field41547;
    public static Class7070 field41548;
    public static Class7363 field41549;
    public static Class7070 field41550;
    public static Class7363 field41551;
    public static Class7364 field41552;
    public static Class7363 field41553;
    public static Class7364 field41554;
    public static Class7364 field41555;
    public static Class7363 field41556;
    public static Class7070 field41557;
    public static Class7363 field41558;
    public static Class7364 field41559;
    public static Class7363 field41560;
    public static Class7364 field41561;
    public static Class7364 field41562;
    public static Class7363 field41563;
    public static Class7070 field41564;
    public static Class7363 field41565;
    public static Class7361 field41566;
    public static Class7363 field41567;
    public static Class7364 field41568;
    public static Class7363 field41569;
    public static Class7364 field41570;
    public static Class7363 field41571;
    public static Class7364 field41572;
    public static Class7364 field41573;
    public static Class7364 field41574;
    public static Class7363 field41575;
    public static Class7364 field41576;
    public static Class7363 field41577;
    public static Class7364 field41578;
    public static Class7363 field41579;
    public static Class7364 field41580;
    public static Class7364 field41581;
    public static Class7363 field41582;
    public static Class7364 field41583;
    public static Class7363 field41584;
    public static Class7070 field41585;
    public static Class7363 field41586;
    public static Class7364 field41587;
    public static Class7364 field41588;
    public static Class7364 field41589;
    public static Class7363 field41590;
    public static Class7364 field41591;
    public static Class7363 field41592;
    public static Class7070 field41593;
    public static Class7363 field41594;
    public static Class7364 field41595;
    public static Class7363 field41596;
    public static Class7364 field41597;
    public static Class7363 field41598;
    public static Class7364 field41599;
    public static Class7363 field41600;
    public static Class7364 field41601;
    
    public static void method35811(final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return;
            }
            method22604.invoke(null, args);
        }
        catch (final Throwable t) {
            method35847(t, null, class7361, args);
        }
    }
    
    public static boolean method35812(final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            return method22604 != null && (boolean)method22604.invoke(null, args);
        }
        catch (final Throwable t) {
            method35847(t, null, class7361, args);
            return false;
        }
    }
    
    public static int method35813(final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return 0;
            }
            return (int)method22604.invoke(null, args);
        }
        catch (final Throwable t) {
            method35847(t, null, class7361, args);
            return 0;
        }
    }
    
    public static long method35814(final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return 0L;
            }
            return (long)method22604.invoke(null, args);
        }
        catch (final Throwable t) {
            method35847(t, null, class7361, args);
            return 0L;
        }
    }
    
    public static float method35815(final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return 0.0f;
            }
            return (float)method22604.invoke(null, args);
        }
        catch (final Throwable t) {
            method35847(t, null, class7361, args);
            return 0.0f;
        }
    }
    
    public static double method35816(final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return 0.0;
            }
            return (double)method22604.invoke(null, args);
        }
        catch (final Throwable t) {
            method35847(t, null, class7361, args);
            return 0.0;
        }
    }
    
    public static String method35817(final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return null;
            }
            return (String)method22604.invoke(null, args);
        }
        catch (final Throwable t) {
            method35847(t, null, class7361, args);
            return null;
        }
    }
    
    public static Object method35818(final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return null;
            }
            return method22604.invoke(null, args);
        }
        catch (final Throwable t) {
            method35847(t, null, class7361, args);
            return null;
        }
    }
    
    public static void method35819(final Object obj, final Class7361 class7361, final Object... args) {
        try {
            if (obj == null) {
                return;
            }
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return;
            }
            method22604.invoke(obj, args);
        }
        catch (final Throwable t) {
            method35847(t, obj, class7361, args);
        }
    }
    
    public static boolean method35820(final Object obj, final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            return method22604 != null && (boolean)method22604.invoke(obj, args);
        }
        catch (final Throwable t) {
            method35847(t, obj, class7361, args);
            return false;
        }
    }
    
    public static int method35821(final Object obj, final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return 0;
            }
            return (int)method22604.invoke(obj, args);
        }
        catch (final Throwable t) {
            method35847(t, obj, class7361, args);
            return 0;
        }
    }
    
    public static long method35822(final Object obj, final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return 0L;
            }
            return (long)method22604.invoke(obj, args);
        }
        catch (final Throwable t) {
            method35847(t, obj, class7361, args);
            return 0L;
        }
    }
    
    public static float method35823(final Object obj, final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return 0.0f;
            }
            return (float)method22604.invoke(obj, args);
        }
        catch (final Throwable t) {
            method35847(t, obj, class7361, args);
            return 0.0f;
        }
    }
    
    public static double method35824(final Object obj, final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return 0.0;
            }
            return (double)method22604.invoke(obj, args);
        }
        catch (final Throwable t) {
            method35847(t, obj, class7361, args);
            return 0.0;
        }
    }
    
    public static String method35825(final Object obj, final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return null;
            }
            return (String)method22604.invoke(obj, args);
        }
        catch (final Throwable t) {
            method35847(t, obj, class7361, args);
            return null;
        }
    }
    
    public static Object method35826(final Object obj, final Class7361 class7361, final Object... args) {
        try {
            final Method method22604 = class7361.method22604();
            if (method22604 == null) {
                return null;
            }
            return method22604.invoke(obj, args);
        }
        catch (final Throwable t) {
            method35847(t, obj, class7361, args);
            return null;
        }
    }
    
    public static Object method35827(final Class7364 class7364) {
        return method35828(null, class7364);
    }
    
    public static Object method35828(final Object obj, final Class7364 class7364) {
        try {
            final Field method22629 = class7364.method22629();
            if (method22629 == null) {
                return null;
            }
            return method22629.get(obj);
        }
        catch (final Throwable t) {
            Class7497.method23337("", t);
            return null;
        }
    }
    
    public static boolean method35829(final Object obj, final Class7364 class7364, final boolean b) {
        try {
            final Field method22629 = class7364.method22629();
            if (method22629 == null) {
                return b;
            }
            return method22629.getBoolean(obj);
        }
        catch (final Throwable t) {
            Class7497.method23337("", t);
            return b;
        }
    }
    
    public static Object method35830(final Class7070 class7070, final int n) {
        final Class7364 method21624 = class7070.method21624(n);
        return (method21624 != null) ? method35827(method21624) : null;
    }
    
    public static Object method35831(final Object o, final Class7070 class7070, final int n) {
        final Class7364 method21624 = class7070.method21624(n);
        return (method21624 != null) ? method35828(o, method21624) : null;
    }
    
    public static float method35832(final Object obj, final Class7364 class7364, final float n) {
        try {
            final Field method22629 = class7364.method22629();
            if (method22629 == null) {
                return n;
            }
            return method22629.getFloat(obj);
        }
        catch (final Throwable t) {
            Class7497.method23337("", t);
            return n;
        }
    }
    
    public static int method35833(final Class7364 class7364, final int n) {
        return method35834(null, class7364, n);
    }
    
    public static int method35834(final Object obj, final Class7364 class7364, final int n) {
        try {
            final Field method22629 = class7364.method22629();
            if (method22629 == null) {
                return n;
            }
            return method22629.getInt(obj);
        }
        catch (final Throwable t) {
            Class7497.method23337("", t);
            return n;
        }
    }
    
    public static long method35835(final Object obj, final Class7364 class7364, final long n) {
        try {
            final Field method22629 = class7364.method22629();
            if (method22629 == null) {
                return n;
            }
            return method22629.getLong(obj);
        }
        catch (final Throwable t) {
            Class7497.method23337("", t);
            return n;
        }
    }
    
    public static boolean method35836(final Class7364 class7364, final Object o) {
        return method35837(null, class7364, o);
    }
    
    public static boolean method35837(final Object obj, final Class7364 class7364, final Object value) {
        try {
            final Field method22629 = class7364.method22629();
            if (method22629 == null) {
                return false;
            }
            method22629.set(obj, value);
            return true;
        }
        catch (final Throwable t) {
            Class7497.method23337("", t);
            return false;
        }
    }
    
    public static boolean method35838(final Class7364 class7364, final int n) {
        return method35839(null, class7364, n);
    }
    
    public static boolean method35839(final Object obj, final Class7364 class7364, final int i) {
        try {
            final Field method22629 = class7364.method22629();
            if (method22629 == null) {
                return false;
            }
            method22629.setInt(obj, i);
            return true;
        }
        catch (final Throwable t) {
            Class7497.method23337("", t);
            return false;
        }
    }
    
    public static boolean method35840(final Class7362 class7362, final Object... array) {
        final Object method35842 = method35842(class7362, array);
        return method35842 != null && method35841(method35842);
    }
    
    public static boolean method35841(final Object o) {
        if (o == null) {
            return false;
        }
        final Object method35827 = method35827(Class9570.field41386);
        if (method35827 != null) {
            final Object method35828 = method35826(method35827, Class9570.field41228, o);
            return method35828 instanceof Boolean && (boolean)method35828;
        }
        return false;
    }
    
    public static Object method35842(final Class7362 class7362, final Object... initargs) {
        final Constructor method22617 = class7362.method22617();
        if (method22617 == null) {
            return null;
        }
        try {
            return method22617.newInstance(initargs);
        }
        catch (final Throwable t) {
            method35848(t, class7362, initargs);
            return null;
        }
    }
    
    public static boolean method35843(final Class[] array, final Class[] array2) {
        if (array.length == array2.length) {
            for (int i = 0; i < array2.length; ++i) {
                if (array[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    private static void method35844(final boolean b, final String str, final Class7361 class7361, final Object[] array, final Object obj) {
        final String name = class7361.method22604().getDeclaringClass().getName();
        final String name2 = class7361.method22604().getName();
        String str2 = "";
        if (b) {
            str2 = " static";
        }
        Class7497.method23333(str + str2 + " " + name + "." + name2 + "(" + Class9008.method32244(array) + ") => " + obj);
    }
    
    private static void method35845(final boolean b, final String str, final Class7361 class7361, final Object[] array) {
        final String name = class7361.method22604().getDeclaringClass().getName();
        final String name2 = class7361.method22604().getName();
        String str2 = "";
        if (b) {
            str2 = " static";
        }
        Class7497.method23333(str + str2 + " " + name + "." + name2 + "(" + Class9008.method32244(array) + ")");
    }
    
    private static void method35846(final boolean b, final String str, final Class7364 class7364, final Object obj) {
        final String name = class7364.method22629().getDeclaringClass().getName();
        final String name2 = class7364.method22629().getName();
        String str2 = "";
        if (b) {
            str2 = " static";
        }
        Class7497.method23333(str + str2 + " " + name + "." + name2 + " => " + obj);
    }
    
    private static void method35847(final Throwable t, final Object obj, final Class7361 class7361, final Object[] array) {
        if (!(t instanceof InvocationTargetException)) {
            Class7497.method23334("*** Exception outside of method ***");
            Class7497.method23334("Method deactivated: " + class7361.method22604());
            class7361.method22607();
            if (t instanceof IllegalArgumentException) {
                Class7497.method23334("*** IllegalArgumentException ***");
                Class7497.method23334("Method: " + class7361.method22604());
                Class7497.method23334("Object: " + obj);
                Class7497.method23334("Parameter classes: " + Class9008.method32244(method35849(array)));
                Class7497.method23334("Parameters: " + Class9008.method32244(array));
            }
            Class7497.method23335("", t);
        }
        else {
            final Throwable cause = t.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            Class7497.method23337("", t);
        }
    }
    
    private static void method35848(final Throwable t, final Class7362 class7362, final Object[] array) {
        if (!(t instanceof InvocationTargetException)) {
            Class7497.method23334("*** Exception outside of constructor ***");
            Class7497.method23334("Constructor deactivated: " + class7362.method22617());
            class7362.method22620();
            if (t instanceof IllegalArgumentException) {
                Class7497.method23334("*** IllegalArgumentException ***");
                Class7497.method23334("Constructor: " + class7362.method22617());
                Class7497.method23334("Parameter classes: " + Class9008.method32244(method35849(array)));
                Class7497.method23334("Parameters: " + Class9008.method32244(array));
            }
            Class7497.method23335("", t);
        }
        else {
            Class7497.method23337("", t);
        }
    }
    
    private static Object[] method35849(final Object[] array) {
        if (array != null) {
            final Class[] array2 = new Class[array.length];
            for (int i = 0; i < array2.length; ++i) {
                final Object o = array[i];
                if (o != null) {
                    array2[i] = o.getClass();
                }
            }
            return array2;
        }
        return new Class[0];
    }
    
    private static Class7364[] method35850(final Class7363 class7363, final Class clazz, final int n) {
        final Class7364[] array = new Class7364[n];
        for (int i = 0; i < array.length; ++i) {
            array[i] = new Class7364(class7363, clazz, i);
        }
        return array;
    }
    
    private static boolean method35851(final String s) {
        Class7462.method22986(new Class7360(s));
        return true;
    }
    
    static {
        field41176 = LogManager.getLogger();
        Class9570.field41177 = method35851("*** Reflector Forge ***");
        Class9570.field41178 = new Class7363("mods.betterfoliage.client.BetterFoliageClient");
        Class9570.field41179 = new Class7363("net.minecraftforge.fml.BrandingControl");
        Class9570.field41180 = new Class7361(Class9570.field41179, "getBrandings");
        Class9570.field41181 = new Class7361(Class9570.field41179, "forEachLine");
        Class9570.field41182 = new Class7361(Class9570.field41179, "forEachAboveCopyrightLine");
        Class9570.field41183 = new Class7363("net.minecraftforge.common.capabilities.ICapabilityProvider");
        Class9570.field41184 = new Class7363("net.minecraftforge.common.capabilities.CapabilityProvider");
        Class9570.field41185 = new Class7361(Class9570.field41184, "gatherCapabilities", new Class[] { Class9570.field41183.method22622() });
        Class9570.field41186 = new Class7363("net.minecraftforge.fml.client.ClientModLoader");
        Class9570.field41187 = new Class7361(Class9570.field41186, "isLoading");
        Class9570.field41188 = new Class7361(Class9570.field41186, "renderProgressText");
        Class9570.field41189 = new Class7363("net.minecraftforge.event.world.ChunkDataEvent$Save");
        Class9570.field41190 = new Class7362(Class9570.field41189, new Class[] { IChunk.class, Class51.class });
        Class9570.field41191 = new Class7363("net.minecraftforge.event.world.ChunkEvent$Load");
        Class9570.field41192 = new Class7362(Class9570.field41191, new Class[] { IChunk.class });
        Class9570.field41193 = new Class7363("net.minecraftforge.event.world.ChunkEvent$Unload");
        Class9570.field41194 = new Class7362(Class9570.field41193, new Class[] { IChunk.class });
        Class9570.field41195 = new Class7363("net.minecraftforge.fml.client.ClientHooks");
        Class9570.field41196 = new Class7361(Class9570.field41195, "trackBrokenTexture");
        Class9570.field41197 = new Class7361(Class9570.field41195, "trackMissingTexture");
        Class9570.field41198 = new Class7363("net.minecraftforge.fml.CrashReportExtender");
        Class9570.field41199 = new Class7361(Class9570.field41198, "enhanceCrashReport");
        Class9570.field41200 = new Class7361(Class9570.field41198, "addCrashReportHeader");
        Class9570.field41201 = new Class7361(Class9570.field41198, "generateEnhancedStackTrace");
        Class9570.field41202 = new Class7363("net.minecraftforge.common.DimensionManager");
        Class9570.field41203 = new Class7361(Class9570.field41202, "unloadWorld");
        Class9570.field41204 = new Class7363("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Pre");
        Class9570.field41205 = new Class7362(Class9570.field41204, new Class[] { Class527.class, Integer.TYPE, Integer.TYPE, Float.TYPE });
        Class9570.field41206 = new Class7363("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Post");
        Class9570.field41207 = new Class7362(Class9570.field41206, new Class[] { Class527.class, Integer.TYPE, Integer.TYPE, Float.TYPE });
        Class9570.field41208 = new Class7363("net.minecraftforge.fml.loading.progress.EarlyProgressVisualization");
        Class9570.field41209 = new Class7364(Class9570.field41208, "INSTANCE");
        Class9570.field41210 = new Class7361(Class9570.field41208, "handOffWindow");
        Class9570.field41211 = new Class7363("net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup");
        Class9570.field41212 = new Class7361(Class9570.field41211, "getYaw");
        Class9570.field41213 = new Class7361(Class9570.field41211, "getPitch");
        Class9570.field41214 = new Class7361(Class9570.field41211, "getRoll");
        Class9570.field41215 = new Class7363("net.minecraftforge.client.event.EntityViewRenderEvent$FogColors");
        Class9570.field41216 = new Class7362(Class9570.field41215, new Class[] { Class6092.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE });
        Class9570.field41217 = new Class7361(Class9570.field41215, "getRed");
        Class9570.field41218 = new Class7361(Class9570.field41215, "getGreen");
        Class9570.field41219 = new Class7361(Class9570.field41215, "getBlue");
        Class9570.field41220 = new Class7363("net.minecraftforge.client.event.EntityViewRenderEvent$RenderFogEvent");
        Class9570.field41221 = new Class7362(Class9570.field41220, new Class[] { Class1985.class, Class6092.class, Float.TYPE, Float.TYPE });
        Class9570.field41222 = new Class7363("net.minecraftforge.event.entity.EntityJoinWorldEvent");
        Class9570.field41223 = new Class7362(Class9570.field41222, new Class[] { Entity.class, World.class });
        Class9570.field41224 = new Class7363("net.minecraftforge.eventbus.api.Event");
        Class9570.field41225 = new Class7361(Class9570.field41224, "isCanceled");
        Class9570.field41226 = new Class7361(Class9570.field41224, "getResult");
        Class9570.field41227 = new Class7363("net.minecraftforge.eventbus.api.IEventBus");
        Class9570.field41228 = new Class7361(Class9570.field41227, "post");
        Class9570.field41229 = new Class7363("net.minecraftforge.eventbus.api.Event$Result");
        Class9570.field41230 = new Class7364(Class9570.field41229, "DENY");
        Class9570.field41231 = new Class7364(Class9570.field41229, "ALLOW");
        Class9570.field41232 = new Class7364(Class9570.field41229, "DEFAULT");
        Class9570.field41233 = new Class7363("net.minecraftforge.common.extensions.IForgeBlock");
        Class9570.field41234 = new Class7361(Class9570.field41233, "getExtendedState");
        Class9570.field41235 = new Class7361(Class9570.field41233, "getTags");
        Class9570.field41236 = new Class7363("net.minecraftforge.client.model.pipeline.ForgeBlockModelRenderer");
        Class9570.field41237 = new Class7362(Class9570.field41236, new Class[] { Class7860.class });
        Class9570.field41238 = new Class7363(Class9509.class);
        Class9570.field41239 = new Class7361(Class9570.field41238, "getTexture", new Class[] { BlockState.class, World.class, BlockPos.class });
        Class9570.field41240 = new Class7363("net.minecraftforge.common.extensions.IForgeBlockState");
        Class9570.field41241 = new Class7361(Class9570.field41240, "addDestroyEffects");
        Class9570.field41242 = new Class7361(Class9570.field41240, "addHitEffects");
        Class9570.field41243 = new Class7361(Class9570.field41240, "getLightValue", new Class[] { Class1855.class, BlockPos.class });
        Class9570.field41244 = new Class7361(Class9570.field41240, "getSoundType", new Class[] { Class1852.class, BlockPos.class, Entity.class });
        Class9570.field41245 = new Class7361(Class9570.field41240, "getStateAtViewpoint");
        Class9570.field41246 = new Class7361(Class9570.field41240, "hasTileEntity");
        Class9570.field41247 = new Class7361(Class9570.field41240, "isAir", new Class[] { Class1855.class, BlockPos.class });
        Class9570.field41248 = new Class7361(Class9570.field41240, "shouldDisplayFluidOverlay");
        Class9570.field41249 = new Class7363("net.minecraftforge.common.extensions.IForgeFluid");
        Class9570.field41250 = new Class7361(Class9570.field41249, "getAttributes");
        Class9570.field41251 = new Class7363("net.minecraftforge.common.extensions.IForgeEntity");
        Class9570.field41252 = new Class7361(Class9570.field41251, "canUpdate", new Class[0]);
        Class9570.field41253 = new Class7361(Class9570.field41251, "onAddedToWorld");
        Class9570.field41254 = new Class7361(Class9570.field41251, "onRemovedFromWorld");
        Class9570.field41255 = new Class7361(Class9570.field41251, "shouldRiderSit");
        Class9570.field41256 = new Class7363("net.minecraftforge.fluids.FluidAttributes");
        Class9570.field41257 = new Class7361(Class9570.field41256, "getColor", new Class[] { Class1856.class, BlockPos.class });
        Class9570.field41258 = new Class7363(EntityType.class);
        Class9570.field41259 = new Class7361(Class9570.field41258, "getTags");
        Class9570.field41260 = new Class7363(LivingEntity.class);
        Class9570.field41261 = new Class7364(Class9570.field41260, "NAMETAG_DISTANCE");
        Class9570.field41262 = new Class7363("net.minecraftforge.event.ForgeEventFactory");
        Class9570.field41263 = new Class7361(Class9570.field41262, "canEntityDespawn");
        Class9570.field41264 = new Class7361(Class9570.field41262, "fireChunkWatch", new Class[] { Boolean.TYPE, Boolean.TYPE, Class513.class, Class7859.class, Class1849.class });
        Class9570.field41265 = new Class7361(Class9570.field41262, "getMaxSpawnPackSize");
        Class9570.field41266 = new Class7361(Class9570.field41262, "getMobGriefingEvent");
        Class9570.field41267 = new Class7361(Class9570.field41262, "onPlaySoundAtEntity");
        Class9570.field41268 = new Class7361(Class9570.field41262, "renderBlockOverlay");
        Class9570.field41269 = new Class7361(Class9570.field41262, "renderFireOverlay");
        Class9570.field41270 = new Class7361(Class9570.field41262, "renderWaterOverlay");
        Class9570.field41271 = new Class7363(Class7255.class);
        Class9570.field41272 = new Class7361(Class9570.field41271, "getTags");
        Class9570.field41273 = new Class7363("net.minecraftforge.common.ForgeHooks");
        Class9570.field41274 = new Class7361(Class9570.field41273, "onLivingAttack");
        Class9570.field41275 = new Class7361(Class9570.field41273, "onLivingDeath");
        Class9570.field41276 = new Class7361(Class9570.field41273, "onLivingDrops");
        Class9570.field41277 = new Class7361(Class9570.field41273, "onLivingFall");
        Class9570.field41278 = new Class7361(Class9570.field41273, "onLivingHurt");
        Class9570.field41279 = new Class7361(Class9570.field41273, "onLivingJump");
        Class9570.field41280 = new Class7361(Class9570.field41273, "onLivingSetAttackTarget");
        Class9570.field41281 = new Class7361(Class9570.field41273, "onLivingUpdate");
        Class9570.field41282 = new Class7363("net.minecraftforge.client.ForgeHooksClient");
        Class9570.field41283 = new Class7361(Class9570.field41282, "dispatchRenderLast", new Class[] { Class1656.class, Class7351.class, Float.TYPE, Matrix4f.class, Long.TYPE });
        Class9570.field41284 = new Class7361(Class9570.field41282, "drawScreen");
        Class9570.field41285 = new Class7361(Class9570.field41282, "fillNormal");
        Class9570.field41286 = new Class7361(Class9570.field41282, "fireKeyInput");
        Class9570.field41287 = new Class7361(Class9570.field41282, "handleCameraTransforms");
        Class9570.field41288 = new Class7361(Class9570.field41282, "handlePerspective");
        Class9570.field41289 = new Class7361(Class9570.field41282, "gatherFluidTextures");
        Class9570.field41290 = new Class7361(Class9570.field41282, "getArmorModel");
        Class9570.field41291 = new Class7361(Class9570.field41282, "getArmorTexture");
        Class9570.field41292 = new Class7361(Class9570.field41282, "getFluidSprites");
        Class9570.field41293 = new Class7361(Class9570.field41282, "getFogDensity");
        Class9570.field41294 = new Class7361(Class9570.field41282, "getFOVModifier");
        Class9570.field41295 = new Class7361(Class9570.field41282, "getOffsetFOV");
        Class9570.field41296 = new Class7361(Class9570.field41282, "loadEntityShader");
        Class9570.field41297 = new Class7361(Class9570.field41282, "onCameraSetup");
        Class9570.field41298 = new Class7361(Class9570.field41282, "onDrawBlockHighlight");
        Class9570.field41299 = new Class7361(Class9570.field41282, "onFogRender");
        Class9570.field41300 = new Class7361(Class9570.field41282, "onGuiCharTypedPre");
        Class9570.field41301 = new Class7361(Class9570.field41282, "onGuiCharTypedPost");
        Class9570.field41302 = new Class7361(Class9570.field41282, "onGuiKeyPressedPre");
        Class9570.field41303 = new Class7361(Class9570.field41282, "onGuiKeyPressedPost");
        Class9570.field41304 = new Class7361(Class9570.field41282, "onGuiKeyReleasedPre");
        Class9570.field41305 = new Class7361(Class9570.field41282, "onGuiKeyReleasedPost");
        Class9570.field41306 = new Class7361(Class9570.field41282, "onScreenshot");
        Class9570.field41307 = new Class7361(Class9570.field41282, "onTextureStitchedPre");
        Class9570.field41308 = new Class7361(Class9570.field41282, "onTextureStitchedPost");
        Class9570.field41309 = new Class7361(Class9570.field41282, "renderMainMenu");
        Class9570.field41310 = new Class7361(Class9570.field41282, "renderSpecificFirstPersonHand");
        Class9570.field41311 = new Class7361(Class9570.field41282, "setRenderLayer");
        Class9570.field41312 = new Class7361(Class9570.field41282, "shouldCauseReequipAnimation");
        Class9570.field41313 = new Class7363("net.minecraftforge.common.ForgeConfig");
        Class9570.field41314 = new Class7364(Class9570.field41313, "CLIENT");
        Class9570.field41315 = new Class7363("net.minecraftforge.common.ForgeConfig$Client");
        Class9570.field41316 = new Class7364(Class9570.field41315, "forgeLightPipelineEnabled");
        Class9570.field41317 = new Class7363("net.minecraftforge.common.ForgeConfigSpec");
        Class9570.field41318 = new Class7364(Class9570.field41317, "childConfig");
        Class9570.field41319 = new Class7363("net.minecraftforge.common.ForgeConfigSpec$ConfigValue");
        Class9570.field41320 = new Class7364(Class9570.field41319, "defaultSupplier");
        Class9570.field41321 = new Class7364(Class9570.field41319, "spec");
        Class9570.field41322 = new Class7361(Class9570.field41319, "get");
        Class9570.field41323 = new Class7363("net.minecraftforge.common.extensions.IForgeItem");
        Class9570.field41324 = new Class7361(Class9570.field41323, "getDurabilityForDisplay");
        Class9570.field41325 = new Class7361(Class9570.field41323, "getEquipmentSlot");
        Class9570.field41326 = new Class7361(Class9570.field41323, "getFontRenderer");
        Class9570.field41327 = new Class7361(Class9570.field41323, "getItemStackTileEntityRenderer");
        Class9570.field41328 = new Class7361(Class9570.field41323, "getRGBDurabilityForDisplay");
        Class9570.field41329 = new Class7361(Class9570.field41323, "isShield");
        Class9570.field41330 = new Class7361(Class9570.field41323, "onEntitySwing");
        Class9570.field41331 = new Class7361(Class9570.field41323, "shouldCauseReequipAnimation");
        Class9570.field41332 = new Class7361(Class9570.field41323, "showDurabilityBar");
        Class9570.field41333 = new Class7363("net.minecraftforge.common.extensions.IForgeItemStack");
        Class9570.field41334 = new Class7361(Class9570.field41333, "canDisableShield");
        Class9570.field41335 = new Class7361(Class9570.field41333, "getShareTag");
        Class9570.field41336 = new Class7361(Class9570.field41333, "getHighlightTip");
        Class9570.field41337 = new Class7361(Class9570.field41333, "isShield");
        Class9570.field41338 = new Class7361(Class9570.field41333, "readShareTag");
        Class9570.field41339 = new Class7363("net.minecraftforge.fml.ForgeI18n");
        Class9570.field41340 = new Class7361(Class9570.field41339, "loadLanguageData");
        Class9570.field41341 = new Class7363("net.minecraftforge.client.model.IModel");
        Class9570.field41342 = new Class7361(Class9570.field41341, "bake");
        Class9570.field41343 = new Class7361(Class9570.field41341, "getTextures");
        Class9570.field41344 = new Class7363(Class350.class);
        Class9570.field41345 = new Class7361(Class9570.field41344, "setKeyConflictContext");
        Class9570.field41346 = new Class7361(Class9570.field41344, "setKeyModifierAndCode");
        Class9570.field41347 = new Class7361(Class9570.field41344, "getKeyModifier");
        Class9570.field41348 = new Class7363("net.minecraftforge.common.extensions.IForgeEffectInstance");
        Class9570.field41349 = new Class7361(Class9570.field41348, "isCurativeItem");
        Class9570.field41350 = new Class7361(Class9570.field41348, "shouldRenderHUD");
        Class9570.field41351 = Class9570.field41348.method22627("renderHUDEffect");
        Class9570.field41352 = new Class7363("net.minecraftforge.registries.ForgeRegistryEntry");
        Class9570.field41353 = new Class7361(Class9570.field41352, "getRegistryName");
        Class9570.field41354 = new Class7363(Class7969.class);
        Class9570.field41355 = new Class7361(Class9570.field41354, "canRenderInLayer", new Class[] { BlockState.class, Class6332.class });
        Class9570.field41356 = new Class7361(Class9570.field41354, "canRenderInLayer", new Class[] { Class7099.class, Class6332.class });
        Class9570.field41357 = new Class7363("net.minecraftforge.common.extensions.IForgeTileEntity");
        Class9570.field41358 = new Class7361(Class9570.field41357, "canRenderBreaking");
        Class9570.field41359 = new Class7361(Class9570.field41357, "getRenderBoundingBox");
        Class9570.field41360 = new Class7364(new Class6946(World.class, new Class[] { List.class }, Set.class, new Class[] { Thread.class }, "World.tileEntitiesToBeRemoved"));
        Class9570.field41361 = new Class7363("net.minecraftforge.common.extensions.IForgeDimension");
        Class9570.field41362 = new Class7361(Class9570.field41361, "getCloudRenderer");
        Class9570.field41363 = new Class7361(Class9570.field41361, "getSkyRenderer");
        Class9570.field41364 = new Class7361(Class9570.field41361, "getWeatherRenderer");
        Class9570.field41365 = new Class7361(Class9570.field41361, "getLightmapColors");
        Class9570.field41366 = new Class7361(Class9570.field41361, "initCapabilities");
        Class9570.field41367 = new Class7363("net.minecraftforge.client.IRenderHandler");
        Class9570.field41368 = new Class7361(Class9570.field41367, "render");
        Class9570.field41369 = new Class7363("net.minecraftforge.client.ItemModelMesherForge");
        Class9570.field41370 = new Class7362(Class9570.field41369, new Class[] { Class1790.class });
        Class9570.field41371 = new Class7363("net.minecraftforge.client.settings.KeyConflictContext");
        Class9570.field41372 = new Class7364(Class9570.field41371, "IN_GAME");
        Class9570.field41373 = new Class7363("net.minecraftforge.client.settings.KeyModifier");
        Class9570.field41374 = new Class7361(Class9570.field41373, "valueFromString");
        Class9570.field41375 = new Class7364(Class9570.field41373, "NONE");
        Class9570.field41376 = new Class7363("net.minecraft.launchwrapper.Launch");
        Class9570.field41377 = new Class7364(Class9570.field41376, "blackboard");
        Class9570.field41378 = new Class7363("net.minecraftforge.client.model.pipeline.LightUtil");
        Class9570.field41379 = new Class7364(Class9570.field41378, "itemConsumer");
        Class9570.field41380 = new Class7364(Class9570.field41378, "tessellator");
        Class9570.field41381 = new Class7361(Class9570.field41378, "putBakedQuad");
        Class9570.field41382 = new Class7363("net.minecraftforge.fml.common.Loader");
        Class9570.field41383 = new Class7361(Class9570.field41382, "getActiveModList");
        Class9570.field41384 = new Class7361(Class9570.field41382, "instance");
        Class9570.field41385 = new Class7363("net.minecraftforge.common.MinecraftForge");
        Class9570.field41386 = new Class7364(Class9570.field41385, "EVENT_BUS");
        Class9570.field41387 = new Class7363("net.minecraftforge.client.MinecraftForgeClient");
        Class9570.field41388 = new Class7361(Class9570.field41387, "getImageLayer");
        Class9570.field41389 = new Class7363("net.minecraftforge.fml.common.ModContainer");
        Class9570.field41390 = new Class7361(Class9570.field41389, "getModId");
        Class9570.field41391 = new Class7363("net.minecraftforge.client.model.ModelLoader");
        Class9570.field41392 = new Class7364(Class9570.field41391, "stateModels");
        Class9570.field41393 = new Class7363("net.minecraftforge.client.model.ModelLoader$VanillaLoader");
        Class9570.field41394 = new Class7364(Class9570.field41393, "INSTANCE");
        Class9570.field41395 = new Class7361(Class9570.field41393, "loadModel");
        Class9570.field41396 = new Class7363("net.minecraftforge.client.model.ModelLoaderRegistry");
        Class9570.field41397 = new Class7364(Class9570.field41396, "textures");
        Class9570.field41398 = new Class7363("net.minecraftforge.fml.client.gui.screen.ModListScreen");
        Class9570.field41399 = new Class7362(Class9570.field41398, new Class[] { Class527.class });
        Class9570.field41400 = new Class7363("net.minecraftforge.client.gui.NotificationModUpdateScreen");
        Class9570.field41401 = new Class7361(Class9570.field41400, "init", new Class[] { Class548.class, Class654.class });
        Class9570.field41402 = new Class7363("net.minecraftforge.event.entity.PlaySoundAtEntityEvent");
        Class9570.field41403 = new Class7361(Class9570.field41402, "getSound");
        Class9570.field41404 = new Class7361(Class9570.field41402, "getCategory");
        Class9570.field41405 = new Class7361(Class9570.field41402, "getVolume");
        Class9570.field41406 = new Class7363("net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType");
        Class9570.field41407 = new Class7364(Class9570.field41406, "BLOCK");
        Class9570.field41408 = new Class7363("net.minecraftforge.fml.client.registry.RenderingRegistry");
        Class9570.field41409 = new Class7361(Class9570.field41408, "loadEntityRenderers", new Class[] { Class8551.class });
        Class9570.field41410 = new Class7363("net.minecraftforge.client.event.RenderItemInFrameEvent");
        Class9570.field41411 = new Class7362(Class9570.field41410, new Class[] { Class862.class, Class4791.class, Class7351.class, Class7807.class, Integer.TYPE });
        Class9570.field41412 = new Class7363("net.minecraftforge.client.event.RenderLivingEvent$Pre");
        Class9570.field41413 = new Class7362(Class9570.field41412, new Class[] { LivingEntity.class, Class4710.class, Float.TYPE, Class7351.class, Class7807.class, Integer.TYPE });
        Class9570.field41414 = new Class7363("net.minecraftforge.client.event.RenderLivingEvent$Post");
        Class9570.field41415 = new Class7362(Class9570.field41414, new Class[] { LivingEntity.class, Class4710.class, Float.TYPE, Class7351.class, Class7807.class, Integer.TYPE });
        Class9570.field41416 = new Class7363("net.minecraftforge.client.event.RenderNameplateEvent");
        Class9570.field41417 = new Class7362(Class9570.field41416, new Class[] { Entity.class, String.class, Class4703.class, Class7351.class, Class7807.class, Integer.TYPE });
        Class9570.field41418 = new Class7361(Class9570.field41416, "getContent");
        Class9570.field41419 = new Class7363("net.minecraftforge.client.event.ScreenshotEvent");
        Class9570.field41420 = new Class7361(Class9570.field41419, "getCancelMessage");
        Class9570.field41421 = new Class7361(Class9570.field41419, "getScreenshotFile");
        Class9570.field41422 = new Class7361(Class9570.field41419, "getResultMessage");
        Class9570.field41423 = new Class7363("net.minecraftforge.fml.server.ServerLifecycleHooks");
        Class9570.field41424 = new Class7361(Class9570.field41423, "handleServerAboutToStart");
        Class9570.field41425 = new Class7361(Class9570.field41423, "handleServerStarting");
        Class9570.field41426 = new Class7363("net.minecraftforge.event.world.WorldEvent$Load");
        Class9570.field41427 = new Class7362(Class9570.field41426, new Class[] { Class1851.class });
        Class9570.field41428 = method35851("*** Reflector Vanilla ***");
        Class9570.field41429 = new Class7363(Class427.class);
        Class9570.field41430 = new Class7364(Class9570.field41429, DataParameter.class);
        Class9570.field41431 = new Class7363(Class4794.class);
        Class9570.field41432 = new Class7364(Class9570.field41431, Class5898.class);
        Class9570.field41433 = new Class7363(Class548.class);
        Class9570.field41434 = new Class7364(Class9570.field41433, String.class);
        Class9570.field41435 = new Class7363(Class8822.class);
        Class9570.field41436 = new Class7364(Class9570.field41435, Class8271.class);
        Class9570.field41437 = new Class7363(Class6559.class);
        Class9570.field41438 = new Class7364(Class9570.field41437, Map.class);
        Class9570.field41439 = new Class7363(Class1730.class);
        Class9570.field41440 = new Class7364(Class9570.field41439, Class1727.class);
        Class9570.field41441 = new Class7363(Class1731.class);
        Class9570.field41442 = new Class7364(Class9570.field41441, Class1727.class);
        Class9570.field41443 = new Class7363(Class869.class);
        Class9570.field41444 = new Class7364(new Class6946(Class869.class, new Class[] { Class7689.class }, Integer.TYPE, new Class[] { String.class }, "debugFPS"));
        Class9570.field41445 = new Class7363(Class5920.class);
        Class9570.field41446 = new Class7364(Class9570.field41445, Class6300.class);
        Class9570.field41447 = new Class7363(Class5867.class);
        Class9570.field41448 = new Class7070(Class9570.field41447, Class6300.class, 4);
        Class9570.field41449 = new Class7363(Class5873.class);
        Class9570.field41450 = new Class7070(Class9570.field41449, Class6300.class, 6);
        Class9570.field41451 = new Class7363(Class5888.class);
        Class9570.field41452 = new Class7364(Class9570.field41451, Class6300[].class, 0);
        Class9570.field41453 = new Class7364(Class9570.field41451, Class6300[].class, 1);
        Class9570.field41454 = new Class7364(Class9570.field41451, Class6300.class);
        Class9570.field41455 = new Class7363(Class5885.class);
        Class9570.field41456 = new Class7364(Class9570.field41455, Class6300.class);
        Class9570.field41457 = new Class7364(Class9570.field41455, Class6300[].class);
        Class9570.field41458 = new Class7363(Class5917.class);
        Class9570.field41459 = new Class7070(Class9570.field41458, Class6300.class, 7);
        Class9570.field41460 = new Class7363(Class5930.class);
        Class9570.field41461 = new Class7070(Class9570.field41460, Class6300.class, 8);
        Class9570.field41462 = new Class7363(Class5850.class);
        Class9570.field41463 = new Class7070(Class9570.field41462, Class6300.class, 7);
        Class9570.field41464 = new Class7363(Class5881.class);
        Class9570.field41465 = new Class7070(Class9570.field41464, Class6300.class, 7);
        Class9570.field41466 = new Class7363(Class5882.class);
        Class9570.field41467 = new Class7364(Class9570.field41466, Class6300.class, 1);
        Class9570.field41468 = new Class7363(Class5898.class);
        Class9570.field41469 = new Class7070(Class9570.field41468, Class6300.class, 12);
        Class9570.field41470 = new Class7363(Class4702.class);
        Class9570.field41471 = new Class7364(Class9570.field41470, Class5845.class, 0);
        Class9570.field41472 = new Class7364(Class9570.field41470, Class5845.class, 1);
        Class9570.field41473 = new Class7363(Class5878.class);
        Class9570.field41474 = new Class7364(Class9570.field41473, Class6300[].class);
        Class9570.field41475 = new Class7363(Class5897.class);
        Class9570.field41476 = new Class7070(Class9570.field41475, Class6300.class, 3);
        Class9570.field41477 = new Class7363(Class5890.class);
        Class9570.field41478 = new Class7364(Class9570.field41477, Class6300.class);
        Class9570.field41479 = new Class7364(Class9570.field41477, Class6300[].class);
        Class9570.field41480 = new Class7363(Class5879.class);
        Class9570.field41481 = new Class7364(Class9570.field41480, Class6300.class, 0);
        Class9570.field41482 = new Class7364(Class9570.field41480, Class6300.class, 1);
        Class9570.field41483 = new Class7364(Class9570.field41480, Class6300[].class, 0);
        Class9570.field41484 = new Class7364(Class9570.field41480, Class6300[].class, 1);
        Class9570.field41485 = new Class7363(Class5919.class);
        Class9570.field41486 = new Class7364(Class9570.field41485, Class6300.class, 0);
        Class9570.field41487 = new Class7364(Class9570.field41485, Class6300.class, 1);
        Class9570.field41488 = new Class7363(Class5928.class);
        Class9570.field41489 = new Class7070(Class9570.field41488, Class6300.class, 11);
        Class9570.field41490 = new Class7363(Class5851.class);
        Class9570.field41491 = new Class7070(Class9570.field41490, Class6300.class, 9);
        Class9570.field41492 = new Class7363(Class5874.class);
        Class9570.field41493 = new Class7070(Class9570.field41492, Class6300.class, 6);
        Class9570.field41494 = new Class7363(Class5927.class);
        Class9570.field41495 = new Class7070(Class9570.field41494, Class6300.class, 10);
        Class9570.field41496 = new Class7363(Class5892.class);
        Class9570.field41497 = new Class7364(Class9570.field41496, Class6300.class);
        Class9570.field41498 = new Class7363(Class4707.class);
        Class9570.field41499 = new Class7364(Class9570.field41498, Class5892.class);
        Class9570.field41500 = new Class7363(Class5899.class);
        Class9570.field41501 = new Class7070(Class9570.field41500, Class6300.class, 8);
        Class9570.field41502 = new Class7363(Class5886.class);
        Class9570.field41503 = new Class7364(Class9570.field41502, Class6300[].class);
        Class9570.field41504 = new Class7363(Class5875.class);
        Class9570.field41505 = new Class7364(Class9570.field41504, Class6300.class);
        Class9570.field41506 = new Class7364(Class9570.field41504, Class6300[].class);
        Class9570.field41507 = new Class7363(Class5925.class);
        Class9570.field41508 = new Class7070(Class9570.field41507, Class6300.class, 8);
        Class9570.field41509 = new Class7363(Class5891.class);
        Class9570.field41510 = new Class7070(Class9570.field41509, Class6300.class, 8);
        Class9570.field41511 = new Class7363(Class5869.class);
        Class9570.field41512 = new Class7070(Class9570.field41511, Class6300.class, 11);
        Class9570.field41513 = new Class7363(Class5889.class);
        Class9570.field41514 = new Class7070(Class9570.field41513, Class6300.class, 13);
        Class9570.field41515 = new Class7363(Class5883.class);
        Class9570.field41516 = new Class7070(Class9570.field41515, Class6300.class, 11);
        Class9570.field41517 = new Class7363(Class5893.class);
        Class9570.field41518 = new Class7070(Class9570.field41517, Class6300.class, 6);
        Class9570.field41519 = new Class7363(Class5839.class);
        Class9570.field41520 = new Class7070(Class9570.field41519, Class6300.class, 6);
        Class9570.field41521 = new Class7363(Class5900.class);
        Class9570.field41522 = new Class7070(Class9570.field41521, Class6300.class, 12);
        Class9570.field41523 = new Class7363(Class5884.class);
        Class9570.field41524 = new Class7070(Class9570.field41523, Class6300.class, 8);
        Class9570.field41525 = new Class7363(Class5877.class);
        Class9570.field41526 = new Class7070(Class9570.field41525, Class6300.class, 8);
        Class9570.field41527 = new Class7363(Class5876.class);
        Class9570.field41528 = new Class7070(Class9570.field41527, Class6300.class, 3);
        Class9570.field41529 = new Class7363(Class5887.class);
        Class9570.field41530 = new Class7364(Class9570.field41529, Class6300.class);
        Class9570.field41531 = new Class7363(Class5902.class);
        Class9570.field41532 = new Class7070(Class9570.field41531, Class6300.class, 2);
        Class9570.field41533 = new Class7363(Class5918.class);
        Class9570.field41534 = new Class7364(Class9570.field41533, Class6300.class);
        Class9570.field41535 = new Class7363(Class5896.class);
        Class9570.field41536 = new Class7364(Class9570.field41535, Class6300[].class, 0);
        Class9570.field41537 = new Class7364(Class9570.field41535, Class6300[].class, 1);
        Class9570.field41538 = new Class7363(Class5871.class);
        Class9570.field41539 = new Class7070(Class9570.field41538, Class6300.class, 4);
        Class9570.field41540 = new Class7363(Class5894.class);
        Class9570.field41541 = new Class7070(Class9570.field41540, Class6300.class, 5);
        Class9570.field41542 = new Class7363(Class5880.class);
        Class9570.field41543 = new Class7070(Class9570.field41542, Class6300.class, 11);
        Class9570.field41544 = new Class7363(Class5895.class);
        Class9570.field41545 = new Class7364(Class9570.field41544, Class6300.class);
        Class9570.field41546 = new Class7364(Class9570.field41544, Class6300[].class);
        Class9570.field41547 = new Class7363(Class5849.class);
        Class9570.field41548 = new Class7070(Class9570.field41547, Class6300.class, 5);
        Class9570.field41549 = new Class7363(Class5848.class);
        Class9570.field41550 = new Class7070(Class9570.field41549, Class6300.class, 6);
        Class9570.field41551 = new Class7363(Class5932.class);
        Class9570.field41552 = new Class7364(Class9570.field41551, Class6300.class, 0);
        Class9570.field41553 = new Class7363(Class5861.class);
        Class9570.field41554 = new Class7364(Class9570.field41553, Class6300.class, 0);
        Class9570.field41555 = new Class7364(Class9570.field41553, Class6300.class, 1);
        Class9570.field41556 = new Class7363(Class5856.class);
        Class9570.field41557 = new Class7070(Class9570.field41556, Class6300.class, 9);
        Class9570.field41558 = new Class7363(Class5857.class);
        Class9570.field41559 = new Class7364(Class9570.field41558, Class6300.class, 0);
        Class9570.field41560 = new Class7363(Class5872.class);
        Class9570.field41561 = new Class7364(Class9570.field41560, Class6300[].class, 0);
        Class9570.field41562 = new Class7364(Class9570.field41560, Class6300[].class, 1);
        Class9570.field41563 = new Class7363(Class5922.class);
        Class9570.field41564 = new Class7070(Class9570.field41563, Class6300.class, 8);
        Class9570.field41565 = Class7667.method24303();
        Class9570.field41566 = new Class7361(Class9570.field41565, "getOptiFineResourceStream");
        Class9570.field41567 = new Class7363(Class4704.class);
        Class9570.field41568 = new Class7364(Class9570.field41567, Class5888.class);
        Class9570.field41569 = new Class7363(Class4795.class);
        Class9570.field41570 = new Class7364(Class9570.field41569, Class5897.class);
        Class9570.field41571 = new Class7363(Class4741.class);
        Class9570.field41572 = new Class7364(Class9570.field41571, Class5893.class);
        Class9570.field41573 = new Class7364(Class9570.field41571, Class5883.class);
        Class9570.field41574 = new Class7364(Class9570.field41571, Class5889.class);
        Class9570.field41575 = new Class7363(Class4708.class);
        Class9570.field41576 = new Class7364(Class9570.field41575, Class5845.class);
        Class9570.field41577 = new Class7363(Class4798.class);
        Class9570.field41578 = new Class7364(Class9570.field41577, Class5887.class);
        Class9570.field41579 = new Class7363(Class4773.class);
        Class9570.field41580 = new Class7364(Class9570.field41579, Class5849.class);
        Class9570.field41581 = new Class7364(Class9570.field41579, Class5848.class);
        Class9570.field41582 = new Class7363(Class4705.class);
        Class9570.field41583 = new Class7364(Class9570.field41582, Class5918.class);
        Class9570.field41584 = new Class7363(Class4165.class);
        Class9570.field41585 = new Class7070(Class9570.field41584, Class6300.class, 3);
        Class9570.field41586 = new Class7363(Class4169.class);
        Class9570.field41587 = new Class7364(Class9570.field41586, Class6300.class, 0);
        Class9570.field41588 = new Class7364(Class9570.field41586, Class6300.class, 1);
        Class9570.field41589 = new Class7364(Class9570.field41586, Class6300[].class);
        Class9570.field41590 = new Class7363(Class490.class);
        Class9570.field41591 = new Class7364(Class9570.field41590, ITextComponent.class);
        Class9570.field41592 = new Class7363(Class4167.class);
        Class9570.field41593 = new Class7070(Class9570.field41592, Class6300.class, 9);
        Class9570.field41594 = new Class7363(Class4173.class);
        Class9570.field41595 = new Class7364(Class9570.field41594, Class5917.class);
        Class9570.field41596 = new Class7363(Class4160.class);
        Class9570.field41597 = new Class7364(Class9570.field41596, Class5876.class);
        Class9570.field41598 = new Class7363(Class4159.class);
        Class9570.field41599 = new Class7364(Class9570.field41598, Class5902.class);
        Class9570.field41600 = new Class7363(Class4174.class);
        Class9570.field41601 = new Class7364(Class9570.field41600, Map.class, 0);
    }
}
