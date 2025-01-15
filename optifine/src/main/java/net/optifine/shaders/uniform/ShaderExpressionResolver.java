package net.optifine.shaders.uniform;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.optifine.expr.ConstantFloat;
import net.optifine.expr.IExpression;
import net.optifine.expr.IExpressionResolver;
import net.optifine.shaders.SMCLog;
import net.optifine.util.BiomeUtils;

public class ShaderExpressionResolver implements IExpressionResolver
{
    private Map<String, IExpression> mapExpressions = new HashMap<>();

    public ShaderExpressionResolver(Map<String, IExpression> map)
    {
        this.registerExpressions();

        for (String s : map.keySet())
        {
            IExpression iexpression = map.get(s);
            this.registerExpression(s, iexpression);
        }
    }

    private void registerExpressions()
    {
        ShaderParameterFloat[] ashaderparameterfloat = ShaderParameterFloat.values();

        for (int i = 0; i < ashaderparameterfloat.length; ++i)
        {
            ShaderParameterFloat shaderparameterfloat = ashaderparameterfloat[i];
            this.addParameterFloat(this.mapExpressions, shaderparameterfloat);
        }

        ShaderParameterBool[] ashaderparameterbool = ShaderParameterBool.values();

        for (int k = 0; k < ashaderparameterbool.length; ++k)
        {
            ShaderParameterBool shaderparameterbool = ashaderparameterbool[k];
            this.mapExpressions.put(shaderparameterbool.getName(), shaderparameterbool);
        }

        for (Biome biome : Registry.BIOME)
        {
            String s = BiomeUtils.getLocation(biome).getPath().trim();
            s = "BIOME_" + s.toUpperCase().replace(' ', '_');
            int j = Registry.BIOME.getId(biome);
            IExpression iexpression = new ConstantFloat((float)j);
            this.registerExpression(s, iexpression);
        }

        String[] astring = new String[] {"NONE", "TAIGA", "EXTREME_HILLS", "JUNGLE", "MESA", "PLAINS", "SAVANNA", "ICY", "THEEND", "BEACH", "FOREST", "OCEAN", "DESERT", "RIVER", "SWAMP", "MUSHROOM", "NETHER"};

        for (int l = 0; l < astring.length; ++l)
        {
            String s2 = astring[l];
            String s3 = "CAT_" + s2;
            IExpression iexpression1 = new ConstantFloat((float)l);
            this.registerExpression(s3, iexpression1);
        }

        String[] astring1 = new String[] {"NONE", "RAIN", "SNOW"};

        for (int i1 = 0; i1 < astring1.length; ++i1)
        {
            String s4 = astring1[i1];
            String s1 = "PPT_" + s4;
            IExpression iexpression2 = new ConstantFloat((float)i1);
            this.registerExpression(s1, iexpression2);
        }
    }

    private void addParameterFloat(Map<String, IExpression> map, ShaderParameterFloat spf)
    {
        String[] astring = spf.getIndexNames1();

        if (astring == null)
        {
            map.put(spf.getName(), new ShaderParameterIndexed(spf));
        }
        else
        {
            for (int i = 0; i < astring.length; ++i)
            {
                String s = astring[i];
                String[] astring1 = spf.getIndexNames2();

                if (astring1 == null)
                {
                    map.put(spf.getName() + "." + s, new ShaderParameterIndexed(spf, i));
                }
                else
                {
                    for (int j = 0; j < astring1.length; ++j)
                    {
                        String s1 = astring1[j];
                        map.put(spf.getName() + "." + s + "." + s1, new ShaderParameterIndexed(spf, i, j));
                    }
                }
            }
        }
    }

    public boolean registerExpression(String name, IExpression expr)
    {
        if (this.mapExpressions.containsKey(name))
        {
            SMCLog.warning("Expression already defined: " + name);
            return false;
        }
        else
        {
            this.mapExpressions.put(name, expr);
            return true;
        }
    }

    public IExpression getExpression(String name)
    {
        return this.mapExpressions.get(name);
    }

    public boolean hasExpression(String name)
    {
        return this.mapExpressions.containsKey(name);
    }
}
