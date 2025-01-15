package net.optifine.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.chunk.Chunk;
import net.optifine.Config;
import net.optifine.reflect.Reflector;
import net.optifine.reflect.ReflectorClass;
import net.optifine.reflect.ReflectorField;

public class ChunkUtils
{
    private static ReflectorClass chunkClass = new ReflectorClass(Chunk.class);
    private static ReflectorField fieldHasEntities = findField("setHasEntities", Chunk::setHasEntities);
    private static ReflectorField fieldLoaded = findField("setLoaded", Chunk::setLoaded);

    public static boolean hasEntities(Chunk chunk)
    {
        return Reflector.getFieldValueBoolean(chunk, fieldHasEntities, true);
    }

    public static boolean isLoaded(Chunk chunk)
    {
        return Reflector.getFieldValueBoolean(chunk, fieldLoaded, true);
    }

    private static ReflectorField findField(String name, BiConsumer<Chunk, Boolean> setter)
    {
        try
        {
            Chunk chunk = new Chunk((World)null, (ChunkPos)null, (BiomeContainer)null);
            List list = new ArrayList();
            List list1 = new ArrayList();
            Field[] afield = Chunk.class.getDeclaredFields();

            for (int i = 0; i < afield.length; ++i)
            {
                Field field = afield[i];

                if (field.getType() == Boolean.TYPE)
                {
                    field.setAccessible(true);
                    list.add(field);
                    list1.add(field.get(chunk));
                }
            }

            setter.accept(chunk, false);
            List list2 = new ArrayList();

            for (Field field1 : (List<Field>)list)
            {
                list2.add(field1.get(chunk));
            }

            setter.accept(chunk, true);
            List list3 = new ArrayList();

            for (Field field2 : (List<Field>)list)
            {
                list3.add(field2.get(chunk));
            }

            List list4 = new ArrayList();

            for (int j = 0; j < list.size(); ++j)
            {
                Field field3 = (Field)list.get(j);
                Boolean obool = (Boolean)list2.get(j);
                Boolean obool1 = (Boolean)list3.get(j);

                if (!obool && obool1)
                {
                    list4.add(field3);
                    Boolean obool2 = (Boolean)list1.get(j);
                    field3.set(chunk, obool2);
                }
            }

            if (list4.size() == 1)
            {
                Field field4 = (Field)list4.get(0);
                return new ReflectorField(field4);
            }
        }
        catch (Exception exception)
        {
            Config.warn(exception.getClass().getName() + " " + exception.getMessage());
        }

        Config.warn("Error finding Chunk." + name);
        return new ReflectorField(new ReflectorClass(Chunk.class), name);
    }
}
