package net.dentzor.flanntest.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.dentzor.flanntest.item.ItemCore;
import net.dentzor.flanntest.item.ItemMedal;
import net.dentzor.flanntest.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemCore medal = new ItemMedal();

    public static void init()
    {
        GameRegistry.registerItem(medal, "medal");
    }
}
