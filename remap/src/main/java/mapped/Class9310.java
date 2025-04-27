// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;

import java.util.Properties;

public class Class9310
{
    private String field39951;
    private ResourceLocation field39952;
    private final int field39953;
    private int[] field39954;
    private ResourceLocation[] field39955;
    private int[] field39956;
    private Biome[] field39957;
    private Class7740 field39958;
    private Class7740 field39959;
    private boolean field39960;
    private Class8998 field39961;
    public int[] field39962;
    public int field39963;
    private Class9449[] field39964;
    private Class181[] field39965;
    private Boolean field39966;
    private Class7740 field39967;
    private Class7740 field39968;
    private Class2185[] field39969;
    
    public Class9310(final Properties properties, final String field39951, final ResourceLocation field39952, final int i, final String s, final Class8652 class8652) {
        this.field39951 = null;
        this.field39952 = null;
        this.field39954 = null;
        this.field39955 = null;
        this.field39956 = null;
        this.field39957 = null;
        this.field39958 = null;
        this.field39959 = null;
        this.field39960 = false;
        this.field39961 = null;
        this.field39962 = null;
        this.field39963 = 1;
        this.field39964 = null;
        this.field39965 = null;
        this.field39966 = null;
        this.field39967 = null;
        this.field39968 = null;
        this.field39969 = null;
        this.field39951 = field39951;
        this.field39952 = field39952;
        this.field39953 = i;
        this.field39954 = class8652.method29457(s);
        this.field39956 = class8652.method29457(properties.getProperty("weights." + i));
        this.field39957 = class8652.method29454(properties.getProperty("biomes." + i));
        this.field39958 = class8652.method29462(properties.getProperty("heights." + i));
        if (this.field39958 == null) {
            this.field39958 = this.method34427(properties, i);
        }
        final String property = properties.getProperty("health." + i);
        if (property != null) {
            this.field39960 = property.contains("%");
            this.field39959 = class8652.method29462(property.replace("%", ""));
        }
        this.field39961 = class8652.method29475("name", properties.getProperty("name." + i));
        this.field39964 = class8652.method29476(properties.getProperty("professions." + i));
        this.field39965 = class8652.method29473(properties.getProperty("collarColors." + i), "collar color", Class8652.field36319);
        this.field39966 = class8652.method29465(properties.getProperty("baby." + i));
        this.field39967 = class8652.method29462(properties.getProperty("moonPhase." + i));
        this.field39968 = class8652.method29462(properties.getProperty("dayTime." + i));
        this.field39969 = class8652.method29474(properties.getProperty("weather." + i), "weather." + i, null);
    }
    
    private Class7740 method34427(final Properties properties, final int n) {
        final String property = properties.getProperty("minHeight." + n);
        final String property2 = properties.getProperty("maxHeight." + n);
        if (property == null && property2 == null) {
            return null;
        }
        int method28933 = 0;
        if (property != null) {
            method28933 = Config.method28933(property, -1);
            if (method28933 < 0) {
                Config.warn("Invalid minHeight: " + property);
                return null;
            }
        }
        int method28934 = 256;
        if (property2 != null) {
            method28934 = Config.method28933(property2, -1);
            if (method28934 < 0) {
                Config.warn("Invalid maxHeight: " + property2);
                return null;
            }
        }
        if (method28934 >= 0) {
            final Class7740 class7740 = new Class7740();
            class7740.method24696(new Class7356(method28933, method28934));
            return class7740;
        }
        Config.warn("Invalid minHeight, maxHeight: " + property + ", " + property2);
        return null;
    }
    
    public boolean method34428(final String s) {
        if (this.field39954 == null || this.field39954.length == 0) {
            Config.warn("Invalid skins for rule: " + this.field39953);
            return false;
        }
        if (this.field39955 != null) {
            return true;
        }
        this.field39955 = new ResourceLocation[this.field39954.length];
        final ResourceLocation method32649 = Class9066.method32649(this.field39952, this.field39951.startsWith("optifine/mob/"));
        if (method32649 == null) {
            Config.warn("Invalid path: " + this.field39952.method7797());
            return false;
        }
        for (int i = 0; i < this.field39955.length; ++i) {
            final int n = this.field39954[i];
            if (n > 1) {
                final ResourceLocation method32650 = Class9066.method32651(method32649, n);
                if (method32650 == null) {
                    Config.warn("Invalid path: " + this.field39952.method7797());
                    return false;
                }
                if (!Config.method28900(method32650)) {
                    Config.warn("Texture not found: " + method32650.method7797());
                    return false;
                }
                this.field39955[i] = method32650;
            }
            else {
                this.field39955[i] = this.field39952;
            }
        }
        if (this.field39956 != null) {
            if (this.field39956.length > this.field39955.length) {
                Config.warn("More weights defined than skins, trimming weights: " + s);
                final int[] field39956 = new int[this.field39955.length];
                System.arraycopy(this.field39956, 0, field39956, 0, field39956.length);
                this.field39956 = field39956;
            }
            if (this.field39956.length < this.field39955.length) {
                Config.warn("Less weights defined than skins, expanding weights: " + s);
                final int[] field39957 = new int[this.field39955.length];
                System.arraycopy(this.field39956, 0, field39957, 0, this.field39956.length);
                final int method32651 = Class8500.method28403(this.field39956);
                for (int j = this.field39956.length; j < field39957.length; ++j) {
                    field39957[j] = method32651;
                }
                this.field39956 = field39957;
            }
            this.field39962 = new int[this.field39956.length];
            int n2 = 0;
            for (int k = 0; k < this.field39956.length; ++k) {
                if (this.field39956[k] < 0) {
                    Config.warn("Invalid weight: " + this.field39956[k]);
                    return false;
                }
                n2 += this.field39956[k];
                this.field39962[k] = n2;
            }
            this.field39963 = n2;
            if (this.field39963 <= 0) {
                Config.warn("Invalid sum of all weights: " + n2);
                this.field39963 = 1;
            }
        }
        if (this.field39964 == Class8652.field36318) {
            Config.warn("Invalid professions or careers: " + s);
            return false;
        }
        if (this.field39965 != Class8652.field36319) {
            return true;
        }
        Config.warn("Invalid collar colors: " + s);
        return false;
    }
    
    public boolean method34429(final Class8444 class8444) {
        if (this.field39957 != null && !Class7980.method26019(class8444.method28179(), this.field39957)) {
            return false;
        }
        if (this.field39958 != null) {
            final BlockPos method28178 = class8444.method28178();
            if (method28178 != null) {
                if (!this.field39958.method24697(method28178.getY())) {
                    return false;
                }
            }
        }
        if (this.field39959 != null) {
            int method28179 = class8444.method28181();
            if (this.field39960) {
                final int method28180 = class8444.method28182();
                if (method28180 > 0) {
                    method28179 = (int)(method28179 * 100 / (double)method28180);
                }
            }
            if (!this.field39959.method24697(method28179)) {
                return false;
            }
        }
        if (this.field39961 != null && !this.field39961.method32122(class8444.method28180())) {
            return false;
        }
        if (this.field39964 != null) {
            if (class8444 instanceof Class8443) {
                final Entity method28181 = ((Class8443)class8444).method28183();
                if (method28181 instanceof Class824) {
                    final Class8562 method28182 = ((Class824)method28181).method4870();
                    if (!Class9449.method35104(method28182.method28781(), method28182.method28782(), this.field39964)) {
                        return false;
                    }
                }
            }
        }
        if (this.field39965 != null) {
            if (class8444 instanceof Class8443) {
                final Entity method28183 = ((Class8443)class8444).method28183();
                if (method28183 instanceof Class799) {
                    final Class799 class8445 = (Class799)method28183;
                    if (!class8445.method4480()) {
                        return false;
                    }
                    if (!Config.method28977(class8445.method4599(), this.field39965)) {
                        return false;
                    }
                }
                if (method28183 instanceof Class800) {
                    final Class800 class8446 = (Class800)method28183;
                    if (!class8446.method4480()) {
                        return false;
                    }
                    if (!Config.method28977(class8446.method4613(), this.field39965)) {
                        return false;
                    }
                }
            }
        }
        if (this.field39966 != null) {
            if (class8444 instanceof Class8443) {
                final Entity method28184 = ((Class8443)class8444).method28183();
                if (method28184 instanceof LivingEntity) {
                    if (((LivingEntity)method28184).method2625() != this.field39966) {
                        return false;
                    }
                }
            }
        }
        if (this.field39967 != null) {
            final ClientWorld field4683 = Config.method28894().world;
            if (field4683 != null) {
                if (!this.field39967.method24697(field4683.method6953())) {
                    return false;
                }
            }
        }
        if (this.field39968 != null) {
            final ClientWorld field4684 = Config.method28894().world;
            if (field4684 != null) {
                if (!this.field39968.method24697((int)field4684.method6755())) {
                    return false;
                }
            }
        }
        if (this.field39969 != null) {
            final ClientWorld field4685 = Config.method28894().world;
            if (field4685 != null) {
                return Class9008.method32231(this.field39969, Class2185.method8352(field4685, 0.0f));
            }
        }
        return true;
    }
    
    public ResourceLocation method34430(final ResourceLocation class1932, final int n) {
        if (this.field39955 != null && this.field39955.length != 0) {
            int n2 = 0;
            if (this.field39956 != null) {
                final int n3 = n % this.field39963;
                for (int i = 0; i < this.field39962.length; ++i) {
                    if (this.field39962[i] > n3) {
                        n2 = i;
                        break;
                    }
                }
            }
            else {
                n2 = n % this.field39955.length;
            }
            return this.field39955[n2];
        }
        return class1932;
    }
}
